/*******************************************************************************
 * Copyright (c) 2000, 2011 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Robert M. Fuhrer (rfuhrer@watson.ibm.com), IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.jdt.internal.corext.refactoring.typeconstraints.typesets;

import java.util.Iterator;
import org.eclipse.jdt.internal.corext.refactoring.typeconstraints.types.TType;
import org.eclipse.jdt.internal.corext.refactoring.typeconstraints2.TTypes;

public class TypeSetIntersection extends TypeSet {

    private TypeSet fLHS;

    private TypeSet fRHS;

    public  TypeSetIntersection(TypeSet lhs, TypeSet rhs) {
        super(lhs.getTypeSetEnvironment());
        fLHS = lhs;
        fRHS = rhs;
    }

    /**
	 * @return Returns the LHS.
	 */
    public TypeSet getLHS() {
        return fLHS;
    }

    /**
	 * @return Returns the RHS.
	 */
    public TypeSet getRHS() {
        return fRHS;
    }

    @Override
    public boolean isUniverse() {
        return fLHS.isUniverse() && fRHS.isUniverse();
    }

    @Override
    public TypeSet makeClone() {
        //new TypeSetIntersection(fLHS.makeClone(), fRHS.makeClone());
        return this;
    }

    @Override
    public boolean isEmpty() {
        if (fLHS.isEmpty() || fRHS.isEmpty())
            return true;
        if (fLHS.isUniverse() || fRHS.isUniverse())
            return false;
        // Another quick check we can make before jumping to the expensive stuff
        if (fLHS.contains(getJavaLangObject()) && fRHS.contains(getJavaLangObject()))
            return false;
        return false;
    }

    @Override
    public boolean contains(TType t) {
        return fLHS.contains(t) && fRHS.contains(t);
    }

    @Override
    public boolean containsAll(TypeSet s) {
        return fLHS.containsAll(s) && fRHS.containsAll(s);
    }

    @Override
    public TypeSet subTypes() {
        if (isUniverse() || contains(getJavaLangObject()))
            return getTypeSetEnvironment().getUniverseTypeSet();
        // sub(xsect(sub(a),sub(b))) == xsect(sub(a),sub(b))
        if ((fLHS instanceof SubTypesSet || fLHS instanceof SubTypesOfSingleton) && (fRHS instanceof SubTypesSet || fRHS instanceof SubTypesOfSingleton))
            return this;
        return getTypeSetEnvironment().createSubTypesSet(this);
    }

    @Override
    public TypeSet superTypes() {
        // super(xsect(super(a),super(b))) == xsect(super(a),super(b))
        if ((fLHS instanceof SuperTypesSet || fLHS instanceof SuperTypesOfSingleton) && (fRHS instanceof SuperTypesSet || fRHS instanceof SuperTypesOfSingleton))
            return this;
        return getTypeSetEnvironment().createSuperTypesSet(this);
    }

    @Override
    public TypeSet upperBound() {
        if (fLHS.contains(getJavaLangObject()) && fRHS.contains(getJavaLangObject()))
            return new SingletonTypeSet(getTypeSetEnvironment().getJavaLangObject(), getTypeSetEnvironment());
        if (fEnumCache != null)
            return fEnumCache.upperBound();
        EnumeratedTypeSet lhsSet = fLHS.enumerate();
        EnumeratedTypeSet rhsSet = fRHS.enumerate();
        TypeSet xsect = lhsSet.intersectedWith(rhsSet);
        return xsect.upperBound();
    }

    @Override
    public TypeSet lowerBound() {
        if (fLHS.hasUniqueLowerBound() && fRHS.hasUniqueLowerBound()) {
            TType lhsBound = fLHS.uniqueLowerBound();
            TType rhsBound = fRHS.uniqueLowerBound();
            if (lhsBound.equals(rhsBound))
                return new SingletonTypeSet(lhsBound, getTypeSetEnvironment());
            else if (TTypes.canAssignTo(lhsBound, rhsBound))
                return new SingletonTypeSet(rhsBound, getTypeSetEnvironment());
            else if (TTypes.canAssignTo(rhsBound, lhsBound))
                return new SingletonTypeSet(lhsBound, getTypeSetEnvironment());
        }
        if (fEnumCache != null)
            return fEnumCache.lowerBound();
        EnumeratedTypeSet lhsSet = fLHS.enumerate();
        EnumeratedTypeSet rhsSet = fRHS.enumerate();
        TypeSet xsect = lhsSet.intersectedWith(rhsSet);
        return xsect.lowerBound();
    }

    @Override
    protected TypeSet specialCasesIntersectedWith(TypeSet s2) {
        if (// xsect(s2,xsect(s2,?)) = xsect(s2,?)
        s2.equals(fLHS))
            return this;
        if (// xsect(s2,xsect(?,s2)) = xsect(?,s2)
        s2.equals(fRHS))
            return this;
        if (s2 instanceof TypeSetIntersection) {
            TypeSetIntersection x2 = (TypeSetIntersection) s2;
            // xsect(xsect(A,B),xsect(A,C)) = xsect(xsect(A,B),C)
            if (fLHS.equals(x2.fLHS))
                return new TypeSetIntersection(this, x2.fRHS);
            // xsect(xsect(A,B),xsect(C,A)) = xsect(xsect(A,B),C)
            if (fLHS.equals(x2.fRHS))
                return new TypeSetIntersection(this, x2.fLHS);
            // xsect(xsect(A,B),xsect(B,C)) = xsect(xsect(A,B),C)
            if (fRHS.equals(x2.fLHS))
                return new TypeSetIntersection(this, x2.fRHS);
            // xsect(xsect(A,B),xsect(C,B)) = xsect(xsect(A,B),C)
            if (fRHS.equals(x2.fRHS))
                return new TypeSetIntersection(this, x2.fLHS);
        }
        return null;
    }

    @Override
    public boolean isSingleton() {
        if (fEnumCache != null)
            return fEnumCache.isSingleton();
        int count = 0;
        for (Iterator<TType> lhsIter = fLHS.iterator(); lhsIter.hasNext(); ) {
            TType t = lhsIter.next();
            if (fRHS.contains(t))
                count++;
            if (count > 1)
                return false;
        }
        return (count == 1);
    }

    @Override
    public TType anyMember() {
        if (fEnumCache != null)
            return fEnumCache.anyMember();
        for (Iterator<TType> lhsIter = fLHS.iterator(); lhsIter.hasNext(); ) {
            TType t = lhsIter.next();
            if (fRHS.contains(t))
                return t;
        }
        return null;
    }

    @Override
    public Iterator<TType> iterator() {
        return enumerate().iterator();
    //		return new Iterator() {
    //			private Iterator fLHSIter= fLHS.iterator();
    //			private TType fNext= null;
    //			public void remove() {
    //				throw new IllegalStateException("Unimplemented");
    //			}
    //			private void advance() {
    //				for(; fLHSIter.hasNext(); ) {
    //					TType t= (TType) fLHSIter.next();
    //					if (fRHS.contains(t)) {
    //						fNext= t;
    //						break;
    //					}
    //				}
    //			}
    //			public boolean hasNext() {
    //				if (fNext == null)
    //					advance();
    //				return fNext != null;
    //			}
    //			public Object next() {
    //				if (fNext == null)
    //					advance();
    //				if (fNext == null)
    //					throw new NoSuchElementException("No more elements in TypeSetIntersection");
    //				TType result= fNext;
    //				fNext= null;
    //				return result;
    //			}
    //		};
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof TypeSetIntersection) {
            TypeSetIntersection other = (TypeSetIntersection) o;
            return other.fLHS.equals(fLHS) && other.fRHS.equals(fRHS);
        } else
            return false;
    }

    @Override
    public int hashCode() {
        return fLHS.hashCode() * 37 + fRHS.hashCode();
    }

    @Override
    public String toString() {
        //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        return "<" + fID + ": intersect(" + fLHS + "," + fRHS + ")>";
    }

    @Override
    public boolean hasUniqueLowerBound() {
        return false;
    }

    @Override
    public boolean hasUniqueUpperBound() {
        return false;
    }

    @Override
    public TType uniqueLowerBound() {
        return null;
    }

    @Override
    public TType uniqueUpperBound() {
        return null;
    }

    private EnumeratedTypeSet fEnumCache = null;

    @Override
    public EnumeratedTypeSet enumerate() {
        if (fEnumCache == null) {
            EnumeratedTypeSet lhsSet = fLHS.enumerate();
            EnumeratedTypeSet rhsSet = fRHS.enumerate();
            fEnumCache = lhsSet.intersectedWith(rhsSet).enumerate();
        }
        return fEnumCache;
    }
}
