package fr.ensma.mosartproject.modelinglanguage.wizard;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.sirius.business.api.helper.SiriusUtil;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import MoSaRT.GlobalSystem;
import MoSaRT.MoSaRTFactory;

public class MosartModelSpecPage extends WizardPage 
{
protected MosartModelSpecPage(String pageName) 
	{
	super(pageName);
	}

private static final String GLS_FIELD_LABEL = "GlobalSystem's name"; 
private static final String DEFAULT_COMMON_FILE_NAME = "model";
private Text rootModelNameField;
private GlobalSystem globalsystem;
private boolean silentModificationEnabled = true;

/*********** set default model name ************/
public void setPackageNameSilently(String rootModelName) 
	{
	if (rootModelNameField != null && silentModificationEnabled) 
		{
		rootModelNameField.setText(rootModelName);
		}
	}

/**************** create control ***************/
public void createControl(Composite parent) 
	{
	Composite composite = new Composite(parent, SWT.NULL);
	composite.setLayout(new GridLayout());
	composite.setLayoutData(new GridData(GridData.FILL_BOTH));
	createModelGroup(composite);
	setPageComplete(validatePage());
	setControl(composite);
	Dialog.applyDialogFont(composite);
	}

/************ create Model Group ****************/
private void createModelGroup(Composite parent) 
	{
	rootModelNameField = createLabelAndText(parent, GLS_FIELD_LABEL,getRootModelName());
	rootModelNameField.addModifyListener(new ModifyListener() 
		{
		public void modifyText(ModifyEvent e) 
			{
			if (rootModelNameField.isVisible()) {silentModificationEnabled = false;}
			setPageComplete(validatePage());
			}
		});
	}

/*********** createLabelAndText ****************/
private Text createLabelAndText(Composite parent, String label,
		String initialValue) {
	Composite group = new Composite(parent, SWT.NONE);
	GridLayout layout = new GridLayout();
	layout.numColumns = 2;
	group.setLayout(layout);
	group.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

	// label
	Label labelField = new Label(group, SWT.NONE);
	labelField.setText(label);
	labelField.setFont(parent.getFont());

	// text
	Text textField = new Text(group, SWT.BORDER);
	GridData data = new GridData(GridData.FILL_HORIZONTAL);
	data.widthHint = 250;
	textField.setLayoutData(data);
	textField.setFont(parent.getFont());
	if (initialValue != null) {
		textField.setText(initialValue);
	}
	return textField; 
}

public GlobalSystem getGlobalSystem() {
	if (globalsystem == null) {
		initGlobalSystem();
	}
	return globalsystem;
}

private void initGlobalSystem()
	{
	GlobalSystem rootObject = MoSaRTFactory.eINSTANCE.createGlobalSystem();
	updateGlobalSystem(rootObject);
	globalsystem = rootObject;
	}
private void updateGlobalSystem(GlobalSystem gls)
	{
	gls.setName(getRootModelName());
	}

protected boolean validatePage() {
	if (globalsystem == null) 
		{
		initGlobalSystem();
		} 
	else 
		{
		updateGlobalSystem(globalsystem);
		}
	return true;
	}
	
private String getRootModelName() {
	if (rootModelNameField == null) {
		return DEFAULT_COMMON_FILE_NAME;
	}

	return rootModelNameField.getText().trim();
}

public String getRepresentationFileName() {
	return getRootModelName()
			+ "." + SiriusUtil.SESSION_RESOURCE_EXTENSION;
}

public String getMoSaRTFileName() {
	return getRootModelName() + ".mosart";
}
}