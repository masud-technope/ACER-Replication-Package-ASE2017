/*******************************************************************************
 * Copyright (c) 2012, 2013 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *        Andy Clement (GoPivotal, Inc) aclement@gopivotal.com - Contributions for
 *                          Bug 383624 - [1.8][compiler] Revive code generation support for type annotations (from Olivier's work)
 *                          Bug 409236 - [1.8][compiler] Type annotations on intersection cast types dropped by code generator
 *                          Bug 409250 - [1.8][compiler] Various loose ends in 308 code generation
 *******************************************************************************/
package org.eclipse.jdt.internal.core.util;

import org.eclipse.jdt.core.util.ClassFormatException;
import org.eclipse.jdt.core.util.IAnnotationComponent;
import org.eclipse.jdt.core.util.IConstantPool;
import org.eclipse.jdt.core.util.IConstantPoolConstant;
import org.eclipse.jdt.core.util.IConstantPoolEntry;
import org.eclipse.jdt.core.util.IExtendedAnnotation;
import org.eclipse.jdt.core.util.IExtendedAnnotationConstants;
import org.eclipse.jdt.core.util.ILocalVariableReferenceInfo;

/**
 * @since 3.10
 */
public class ExtendedAnnotation extends ClassFileStruct implements IExtendedAnnotation {

    private static final IAnnotationComponent[] NO_ENTRIES = new IAnnotationComponent[0];

    private static final int[][] NO_TYPEPATH = new int[0][0];

    private static final ILocalVariableReferenceInfo[] NO_LOCAL_VARIABLE_TABLE_ENTRIES = new ILocalVariableReferenceInfo[0];

    private int targetType;

    private int annotationTypeIndex;

    private int[][] typePath;

    private int typeIndex;

    private char[] typeName;

    private int componentsNumber;

    private IAnnotationComponent[] components;

    private int readOffset;

    private int offset;

    private int typeParameterIndex;

    private int typeParameterBoundIndex;

    private int parameterIndex;

    private int exceptionTableIndex;

    private ILocalVariableReferenceInfo[] localVariableTable = NO_LOCAL_VARIABLE_TABLE_ENTRIES;

    /**
	 * Constructor for ExtendedAnnotation, builds an annotation from the supplied bytestream.
	 *
	 * @param classFileBytes
	 * @param constantPool
	 * @param offset
	 * @throws ClassFormatException
	 */
    public  ExtendedAnnotation(byte[] classFileBytes, IConstantPool constantPool, int offset) throws ClassFormatException {
        // Read target_type
        int index = u1At(classFileBytes, 0, offset);
        this.targetType = index;
        this.readOffset = 1;
        readTargetInfo(index, classFileBytes, constantPool, offset);
        // Read type_path
        index = u1At(classFileBytes, this.readOffset, offset);
        this.readOffset++;
        int typePathEntryCount = index;
        if (typePathEntryCount == 0) {
            this.typePath = NO_TYPEPATH;
        } else {
            this.typePath = new int[typePathEntryCount][];
            for (int i = 0; i < typePathEntryCount; i++) {
                int[] typePathEntry = (this.typePath[i] = new int[2]);
                typePathEntry[0] = u1At(classFileBytes, this.readOffset++, offset);
                typePathEntry[1] = u1At(classFileBytes, this.readOffset++, offset);
            }
        }
        // Read annotation
        index = u2At(classFileBytes, this.readOffset, offset);
        this.typeIndex = index;
        this.readOffset += 2;
        if (index != 0) {
            IConstantPoolEntry constantPoolEntry = constantPool.decodeEntry(index);
            if (constantPoolEntry.getKind() != IConstantPoolConstant.CONSTANT_Utf8) {
                throw new ClassFormatException(ClassFormatException.INVALID_CONSTANT_POOL_ENTRY);
            }
            this.typeName = constantPoolEntry.getUtf8Value();
        } else {
            throw new ClassFormatException(ClassFormatException.INVALID_CONSTANT_POOL_ENTRY);
        }
        final int length = u2At(classFileBytes, this.readOffset, offset);
        this.componentsNumber = length;
        this.readOffset += 2;
        if (length != 0) {
            this.components = new IAnnotationComponent[length];
            for (int i = 0; i < length; i++) {
                AnnotationComponent component = new AnnotationComponent(classFileBytes, constantPool, offset + this.readOffset);
                this.components[i] = component;
                this.readOffset += component.sizeInBytes();
            }
        } else {
            this.components = NO_ENTRIES;
        }
        if (this.annotationTypeIndex == 0xFFFF) {
            this.annotationTypeIndex = -1;
        }
    }

    private void readTargetInfo(int localTargetType, byte[] classFileBytes, IConstantPool constantPool, int localOffset) throws ClassFormatException {
        switch(localTargetType) {
            case IExtendedAnnotationConstants.CLASS_TYPE_PARAMETER:
            case IExtendedAnnotationConstants.METHOD_TYPE_PARAMETER:
                this.typeParameterIndex = u1At(classFileBytes, this.readOffset, localOffset);
                this.readOffset++;
                break;
            case IExtendedAnnotationConstants.CLASS_EXTENDS:
                this.annotationTypeIndex = u2At(classFileBytes, this.readOffset, localOffset);
                this.readOffset += 2;
                break;
            case IExtendedAnnotationConstants.CLASS_TYPE_PARAMETER_BOUND:
            case IExtendedAnnotationConstants.METHOD_TYPE_PARAMETER_BOUND:
                this.typeParameterIndex = u1At(classFileBytes, this.readOffset, localOffset);
                this.readOffset++;
                this.typeParameterBoundIndex = u1At(classFileBytes, this.readOffset, localOffset);
                this.readOffset++;
                break;
            case IExtendedAnnotationConstants.FIELD:
            case IExtendedAnnotationConstants.METHOD_RETURN:
            case IExtendedAnnotationConstants.METHOD_RECEIVER:
                // nothing to do, target_info is empty_target
                break;
            case IExtendedAnnotationConstants.METHOD_FORMAL_PARAMETER:
                this.parameterIndex = u1At(classFileBytes, this.readOffset, localOffset);
                this.readOffset++;
                break;
            case IExtendedAnnotationConstants.THROWS:
                this.annotationTypeIndex = u2At(classFileBytes, this.readOffset, localOffset);
                this.readOffset += 2;
                break;
            case IExtendedAnnotationConstants.LOCAL_VARIABLE:
            case IExtendedAnnotationConstants.RESOURCE_VARIABLE:
                int tableLength = u2At(classFileBytes, this.readOffset, localOffset);
                this.readOffset += 2;
                this.localVariableTable = new LocalVariableReferenceInfo[tableLength];
                for (int i = 0; i < tableLength; i++) {
                    this.localVariableTable[i] = new LocalVariableReferenceInfo(classFileBytes, constantPool, this.readOffset + localOffset);
                    this.readOffset += 6;
                }
                break;
            case IExtendedAnnotationConstants.EXCEPTION_PARAMETER:
                this.exceptionTableIndex = u2At(classFileBytes, this.readOffset, localOffset);
                this.readOffset += 2;
                break;
            case IExtendedAnnotationConstants.NEW:
            case IExtendedAnnotationConstants.INSTANCEOF:
            case IExtendedAnnotationConstants.METHOD_REFERENCE:
            case IExtendedAnnotationConstants.CONSTRUCTOR_REFERENCE:
                this.offset = u2At(classFileBytes, this.readOffset, localOffset);
                this.readOffset += 2;
                break;
            case IExtendedAnnotationConstants.CAST:
                this.offset = u2At(classFileBytes, this.readOffset, localOffset);
                this.readOffset += 2;
                // read type_argument_index
                this.annotationTypeIndex = u1At(classFileBytes, this.readOffset, localOffset);
                this.readOffset++;
                break;
            case IExtendedAnnotationConstants.CONSTRUCTOR_INVOCATION_TYPE_ARGUMENT:
            case IExtendedAnnotationConstants.METHOD_INVOCATION_TYPE_ARGUMENT:
            case IExtendedAnnotationConstants.CONSTRUCTOR_REFERENCE_TYPE_ARGUMENT:
            case IExtendedAnnotationConstants.METHOD_REFERENCE_TYPE_ARGUMENT:
                this.offset = u2At(classFileBytes, this.readOffset, localOffset);
                this.readOffset += 2;
                // read type_argument_index
                this.annotationTypeIndex = u1At(classFileBytes, this.readOffset, localOffset);
                this.readOffset++;
                break;
        }
    }

    /* (non-Javadoc)
	 * @see org.eclipse.jdt.core.util.IAnnotation#getTypeIndex()
	 */
    public int getTypeIndex() {
        return this.typeIndex;
    }

    /* (non-Javadoc)
	 * @see org.eclipse.jdt.core.util.IAnnotation#getComponentsNumber()
	 */
    public int getComponentsNumber() {
        return this.componentsNumber;
    }

    /* (non-Javadoc)
	 * @see org.eclipse.jdt.core.util.IAnnotation#getComponents()
	 */
    public IAnnotationComponent[] getComponents() {
        return this.components;
    }

    int sizeInBytes() {
        return this.readOffset;
    }

    /* (non-Javadoc)
	 * @see org.eclipse.jdt.core.util.IAnnotation#getTypeName()
	 */
    public char[] getTypeName() {
        return this.typeName;
    }

    public int getTargetType() {
        return this.targetType;
    }

    public int getExceptionTableIndex() {
        return this.exceptionTableIndex;
    }

    public int getOffset() {
        return this.offset;
    }

    public int getLocalVariableRefenceInfoLength() {
        return this.localVariableTable.length;
    }

    public ILocalVariableReferenceInfo[] getLocalVariableTable() {
        return this.localVariableTable;
    }

    public int getParameterIndex() {
        return this.parameterIndex;
    }

    public int getTypeParameterIndex() {
        return this.typeParameterIndex;
    }

    public int getTypeParameterBoundIndex() {
        return this.typeParameterBoundIndex;
    }

    public int[][] getTypePath() {
        return this.typePath;
    }

    public int getAnnotationTypeIndex() {
        return this.annotationTypeIndex;
    }
}
