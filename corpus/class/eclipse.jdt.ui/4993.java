/*******************************************************************************
 * Copyright (c) 2000, 2016 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.jdt.internal.ui.preferences.formatter;

import java.util.Map;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.jdt.internal.ui.IJavaHelpContextIds;
import org.eclipse.jdt.internal.ui.preferences.formatter.ProfileManager.Profile;

public class FormatterModifyDialog extends ModifyDialog {

    public  FormatterModifyDialog(Shell parentShell, Profile profile, ProfileManager profileManager, ProfileStore profileStore, boolean newProfile, String dialogPreferencesKey, String lastSavePathKey) {
        super(parentShell, profile, profileManager, profileStore, newProfile, dialogPreferencesKey, lastSavePathKey);
    }

    @Override
    protected void addPages(Map<String, String> values) {
        addTabPage(FormatterMessages.ModifyDialog_tabpage_indentation_title, new IndentationTabPage(this, values));
        addTabPage(FormatterMessages.ModifyDialog_tabpage_braces_title, new BracesTabPage(this, values));
        addTabPage(FormatterMessages.ModifyDialog_tabpage_parentheses_title, new ParenthesesTabPage(this, values));
        addTabPage(FormatterMessages.ModifyDialog_tabpage_whitespace_title, new WhiteSpaceTabPage(this, values));
        addTabPage(FormatterMessages.ModifyDialog_tabpage_blank_lines_title, new BlankLinesTabPage(this, values));
        addTabPage(FormatterMessages.ModifyDialog_tabpage_new_lines_title, new NewLinesTabPage(this, values));
        addTabPage(FormatterMessages.ModifyDialog_tabpage_control_statements_title, new ControlStatementsTabPage(this, values));
        addTabPage(FormatterMessages.ModifyDialog_tabpage_line_wrapping_title, new LineWrappingTabPage(this, values));
        addTabPage(FormatterMessages.ModifyDialog_tabpage_comments_title, new CommentsTabPage(this, values));
        addTabPage(FormatterMessages.ModifyDialog_tabpage_OffOnTags_title, new OffOnTagsTabPage(this, values));
    }

    /**
	 * {@inheritDoc}
	 * 
	 * @since 3.5
	 */
    @Override
    protected String getHelpContextId() {
        return IJavaHelpContextIds.CODEFORMATTER_PREFERENCE_PAGE;
    }
}
