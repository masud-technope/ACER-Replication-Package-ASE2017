/*******************************************************************************
 * Copyright (c) 2000, 2013 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.jdt.internal.compiler.impl;

import org.eclipse.jdt.core.compiler.CategorizedProblem;
import org.eclipse.jdt.internal.compiler.CompilationResult;
import org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration;

public interface ReferenceContext {

    void abort(int abortLevel, CategorizedProblem problem);

    CompilationResult compilationResult();

    CompilationUnitDeclaration getCompilationUnitDeclaration();

    boolean hasErrors();

    void tagAsHavingErrors();

    void tagAsHavingIgnoredMandatoryErrors(int problemId);
}
