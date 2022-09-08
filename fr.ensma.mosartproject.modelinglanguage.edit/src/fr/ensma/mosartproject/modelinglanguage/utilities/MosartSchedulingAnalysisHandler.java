package fr.ensma.mosartproject.modelinglanguage.utilities;


import java.io.IOException;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;

import java.util.Vector;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.Window;

import MoSaRT.GlobalSystem;
import MoSaRTBackEnd_AnalysisRepository.AnalysisRepository;
import MoSaRTBackEnd_AnalysisRepository.ContextModel;
import MoSaRTBackEnd_AnalysisRepository.EvaluationResultType;
import MoSaRTBackEnd_AnalysisRepository.IdentificationRule;
import MoSaRTBackEnd_AnalysisRepository.Test;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * 
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class MosartSchedulingAnalysisHandler extends AbstractHandler {
	/**
	 * The constructor.
	 */
	public MosartSchedulingAnalysisHandler() {
	}

	/************************************************************************************************/
	public Resource loadResource(String fileAddress) throws IOException {
		
		Resource resource = null;
		ResourceSet resSet = new ResourceSetImpl();
		// Register the default resource factory for our resource set
		resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl()); //au lieu de xmi
		
		org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createURI(fileAddress);
		
		try{
		resource = resSet.getResource(uri, true);

		}catch (Exception e) { e.printStackTrace();}
		
		return resource;
	}

	/************************************************************************************************/
	
	
	public GlobalSystem getGlobalSystem (){
		
		ISelection selection = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getActivePage().getSelection();
		GlobalSystem gls = null;
		
		if (selection != null & selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;

			if (structuredSelection.getFirstElement() instanceof GlobalSystem) {
				gls = (GlobalSystem) structuredSelection.getFirstElement();

			}
			
		}
		return gls;
		
		
	}

	/************************************************************************************************/
	public String getFileAddress(GlobalSystem gls) {
		String fileAddress = null;

			if (gls!=null) {
				fileAddress = gls.getAnalysisRepositoryLocation().toString();

				fileAddress="file:/"+fileAddress;
						
			}
			
		return fileAddress;
	}

	/************************************************************************************************/

	/**
	 * the command has been executed, so extract extract the needed information
	 * from the application context.
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {

		IWorkbenchWindow window = HandlerUtil
				.getActiveWorkbenchWindowChecked(event);
		Hashtable<IdentificationRule, EvaluationResultType> theResults;
		List<ContextModel> theModels;
		
		GlobalSystem gls = null; 
		gls = getGlobalSystem();
		
		if(gls == null) {
			MessageDialog
			.openInformation(
					window.getShell(),
					"Incompatible Action",
					"You have to select the root element (GlobalSystem instance) of a MoSaRT model instance");
			return null;	
		}
		
		String fileAddress = getFileAddress(gls);
		
		if (fileAddress == null || fileAddress.length() == 0) {
			MessageDialog
					.openError(window.getShell(), "Error loading",
							"No file specified [Look at <Analysis Respository Location> property of the GlobalSystem instance]");
			return null;
		}

		AnalysisRepository ar = null;
		
		try{
			
		ar = (AnalysisRepository) loadResource(fileAddress).getContents().get(0);
		
		theResults = (Hashtable<IdentificationRule, EvaluationResultType>) ar.identificationRuleChecker(gls);
		
		theModels = ar.appropriateModelsFinder(theResults);
		
		MosartDialog dialog = new MosartDialog(window.getShell(), theResults, theModels);
		
		dialog.create();
		if (dialog.open() == Window.OK) {}
		}
		catch(Exception e){
			MessageDialog
			.openError(window.getShell(), "Error loading",
					"You have to specify a valid Analysis Respository file");
			e.printStackTrace();
		}

		return null;
	}
	
	/************************************************************************************************/

	public class MosartDialog extends TitleAreaDialog {

		private Hashtable<IdentificationRule, EvaluationResultType> results;
		private List<ContextModel> models;
		private Iterator<IdentificationRule> rules;
		private List<Test> allTests;

		public MosartDialog(Shell parentShell,
				Hashtable<IdentificationRule, EvaluationResultType> results,
				List<ContextModel> models) {
			super(parentShell);
			this.results = new Hashtable<IdentificationRule, EvaluationResultType>(
					results);
			this.models = models;
			this.rules = results.keySet().iterator();
			this.allTests = new Vector<Test>();
		}

		@Override
		public void create() {
			super.create();
			// Set the title
			setTitle("Result of scheduling analysis ability (Identification process)");
			// Set the message
			setMessage("This is a recapitulatif of the identification process",
					IMessageProvider.INFORMATION);

		}

		@Override
		protected Control createDialogArea(Composite parent) {

			TabFolder tabfolder = new TabFolder(parent, SWT.RESIZE);

			tabfolder.setSize(parent.getSize());

			tabfolder.pack();

			TabItem onglet1 = new TabItem(tabfolder, SWT.RESIZE);
			onglet1.setText("Context Characteristics");

			TabItem onglet2 = new TabItem(tabfolder, SWT.RESIZE);
			onglet2.setText("Context Models");
			TabItem onglet3 = new TabItem(tabfolder, SWT.RESIZE);
			onglet3.setText("Analysis Tests");

			// ========================================================================================//

			Composite pageOnglet1 = new Composite(tabfolder, SWT.RESIZE);
			pageOnglet1.setLayout(new GridLayout());

			Table tableRules = new Table(pageOnglet1, SWT.MULTI | SWT.BORDER
					| SWT.H_SCROLL | SWT.V_SCROLL | SWT.FULL_SELECTION
					| SWT.HIDE_SELECTION |SWT.COLOR_BLUE);
			tableRules.setHeaderVisible(true);
			tableRules.setLinesVisible(true);
			GridData gridData = new GridData(GridData.FILL_BOTH);
			gridData.horizontalSpan = 3;
			gridData.heightHint = 150;
			tableRules.setLayoutData(gridData);
			tableRules.setSize(500, 300);
			tableRules.pack();

			TableColumn colonneRuleId = new TableColumn(tableRules, SWT.RESIZE);
			colonneRuleId.setText("Rule Id");
			colonneRuleId.pack();
			// colonneRuleId.setWidth(100);

			TableColumn colonneRuleDescription = new TableColumn(tableRules,
					SWT.RESIZE);
			colonneRuleDescription.setText("Description");
			// colonneRuleDescription.setWidth(100);
			colonneRuleDescription.pack();

			TableColumn colonneRuleEvaluation = new TableColumn(tableRules,
					SWT.RESIZE);
			colonneRuleEvaluation.setText("Evaluation");
			// colonneRuleEvaluation.setWidth(100);
			colonneRuleEvaluation.pack();

			TableColumn colonneRuleType = new TableColumn(tableRules,
					SWT.RESIZE);
			colonneRuleType.setText("Component Kind");
			// colonneRuleType.setWidth(100);
			colonneRuleType.pack();

			TableColumn colonneRuleKind = new TableColumn(tableRules,
					SWT.RESIZE);
			colonneRuleKind.setText("Timing Kind");
			// colonneRuleKind.setWidth(100);
			colonneRuleKind.pack();

			while (rules.hasNext()) {

				IdentificationRule currentRule = rules.next();
				TableItem line = new TableItem(tableRules, SWT.RESIZE);

				int c = 0;

				line.setText(c++, currentRule.getId());

				line.setText(c++, currentRule.getDescription());

				line.setText(c++, results.get(currentRule).toString());

				line.setText(c++, currentRule.getComponentKind().toString());

				line.setText(c++, currentRule.getTimingKind().toString());

			}

			tableRules.setRedraw(true);

			if (models.size() > 0) {

				Text info = new Text(pageOnglet1, SWT.BORDER | SWT.READ_ONLY | SWT.COLOR_RED);
				info.setText("The number of the found context models is : "
						+ models.size());
				info.setForeground(new Color(parent.getDisplay(),255, 0, 0));

				for (int i = 0; i < models.size(); i++) {

					Text textModels = new Text(pageOnglet1, SWT.COLOR_DARK_BLUE
							| SWT.READ_ONLY);
					textModels.setText(models.get(i).getName());
				}

				Text textDetails = new Text(pageOnglet1, SWT.COLOR_RED
						| SWT.READ_ONLY);
				textDetails
						.setText("For more details see the 'Context Models' tab");

			} else {

				Text info = new Text(pageOnglet1, SWT.NONE);
				info.setText("There is no context model which corresponds to the context characteristics");

			}

			onglet1.setControl(pageOnglet1);

			// ========================================================================================//

			Composite pageOnglet2 = new Composite(tabfolder, SWT.RESIZE);
			pageOnglet2.setLayout(new GridLayout());

			pageOnglet2.pack();

			if (models.size() > 0) {

				for (int i = 0; i < models.size(); i++) {
					Group controlGroup = new Group(pageOnglet2, SWT.NONE);
					controlGroup.setText(models.get(i).getName());
					GridLayout layout2_1 = new GridLayout();
					layout2_1.numColumns = 2;
					layout2_1.makeColumnsEqualWidth = true;
					controlGroup.setLayout(layout2_1);

					// Table tableModels = new Table(pageOnglet1, SWT.MULTI |
					// SWT.BORDER | SWT.H_SCROLL
					// | SWT.V_SCROLL | SWT.FULL_SELECTION |
					// SWT.HIDE_SELECTION);
					// tableModels.setHeaderVisible(true);
					// tableModels.setLinesVisible(true);
					// GridData gridData2 = new GridData(GridData.FILL_BOTH);
					// gridData.horizontalSpan = 3;
					// gridData.heightHint = 150;
					// tableModels.setLayoutData(gridData2);
					// tableModels.setSize(500,300);
					// tableModels.pack();

					// TableColumn columnTrue = new TableColumn(tableRules,
					// SWT.RESIZE);
					// columnTrue.setText("Rule Id");
					// columnTrue.pack();
					Label trueRules = new Label(controlGroup, SWT.BOLD);
					trueRules.setText("Rules which should be true");
					Text trueIds = new Text(controlGroup, SWT.NONE
							| SWT.READ_ONLY);
					trueIds.setText("");
					for (int j = 0; j < models.get(i).getTrueValueRules()
							.size(); j++) {

						trueIds.setText(trueIds.getText()
								+ " - "
								+ models.get(i).getTrueValueRules().get(j)
										.getId());
					}

					Label falseRules = new Label(controlGroup, SWT.BOLD);
					falseRules.setText("Rules which should be false");
					Text falseIds = new Text(controlGroup, SWT.NONE
							| SWT.READ_ONLY);
					falseIds.setText("");

					for (int j = 0; j < models.get(i).getFalseValueRules()
							.size(); j++) {

						falseIds.setText(falseIds.getText()
								+ " - "
								+ models.get(i).getFalseValueRules().get(j)
										.getId());
					}

					Label undefinedRules = new Label(controlGroup, SWT.BOLD);
					undefinedRules
							.setText("Rules which do not have any impact");
					Text undefIds = new Text(controlGroup, SWT.NONE
							| SWT.READ_ONLY);
					undefIds.setText("");
					for (int j = 0; j < models.get(i).getUndefinedValueRules()
							.size(); j++) {

						undefIds.setText(undefIds.getText()
								+ " - "
								+ models.get(i).getUndefinedValueRules().get(j)
										.getId());
					}

					Label descriptionLabel = new Label(controlGroup, SWT.BOLD);
					descriptionLabel.setText("Description");
					Text descriptionText = new Text(controlGroup, SWT.NONE
							| SWT.READ_ONLY);
					descriptionText.setText(models.get(i).getDescription());

					Label referencesLabel = new Label(controlGroup,
							SWT.UNDERLINE_SINGLE);
					referencesLabel.setText("References");
					Text referencesText = new Text(controlGroup, SWT.NONE
							| SWT.READ_ONLY);
					referencesText.setText("");
					for (int k = 0; k < models.get(i).getReferences().size(); k++) {

						referencesText.setText(referencesText.getText() + "\n"
								+ models.get(i).getReferences().get(k));

					}

					if (models.get(i).getAnalysisTests().size() > 0) {
						Group controlGroupTest = new Group(controlGroup,
								SWT.NONE);
						controlGroupTest.setText("Corresponding Tests");
						GridLayout layout2_2 = new GridLayout();
						layout2_2.numColumns = 2;
						layout2_2.makeColumnsEqualWidth = true;
						controlGroupTest.setLayout(layout2_2);
						controlGroupTest.pack();

						for (int k = 0; k < models.get(i).getAnalysisTests()
								.size(); k++) {

							Label testIdLabel = new Label(controlGroupTest,
									SWT.BORDER_SOLID);
							testIdLabel.setText("Test Id");
							Text testIdText = new Text(controlGroupTest,
									SWT.NONE | SWT.READ_ONLY);
							testIdText.setText(models.get(i).getAnalysisTests()
									.get(k).getId());
							
							testIdText.setForeground(new Color(parent.getDisplay(),0, 0, 255));

							Label testDescriptionLabel = new Label(
									controlGroupTest, SWT.UNDERLINE_SINGLE);
							testDescriptionLabel.setText("Description");
							Text testDescriptionText = new Text(
									controlGroupTest, SWT.NONE | SWT.READ_ONLY);
							testDescriptionText
									.setText(models.get(i).getAnalysisTests()
											.get(k).getDescription());

							Label testFamilyLabel = new Label(controlGroupTest,
									SWT.UNDERLINE_SINGLE);
							testFamilyLabel.setText("Its Family");
							Text testFamilyText = new Text(controlGroupTest,
									SWT.NONE | SWT.READ_ONLY);
							testFamilyText.setText(models.get(i)
									.getAnalysisTests().get(k)
									.getItsTestFamily().getName());

							Label separatorLabel1 = new Label(controlGroupTest,
									SWT.BORDER_SOLID);
							separatorLabel1.setText("*********************");

							Label separatorLabel2 = new Label(controlGroupTest,
									SWT.BORDER_SOLID);
							separatorLabel2.setText("*********************");

						}
					}

				}
			}

			onglet2.setControl(pageOnglet2);
			// ========================================================================================//

			Composite pageOnglet3 = new Composite(tabfolder, SWT.RESIZE);
			pageOnglet3.setLayout(new GridLayout());

			pageOnglet3.pack();

			for (int i = 0; i < models.size(); i++) {

				if (i == 0) {

					allTests = models.get(i).getAnalysisTests();

				} else {

					for (int j = 0; j < models.get(i).getAnalysisTests().size(); j++) {

						if (!allTests.contains(models.get(i).getAnalysisTests()
								.get(j))) {

							allTests.add(models.get(i).getAnalysisTests()
									.get(j));
						}
					}
				}
			}

			for (int i = 0; i < allTests.size(); i++) {

				Group controlGroup = new Group(pageOnglet3, SWT.NONE);
				controlGroup.setText(allTests.get(i).getName());

				GridLayout layout3_1 = new GridLayout();
				layout3_1.numColumns = 2;
				layout3_1.makeColumnsEqualWidth = true;
				controlGroup.setLayout(layout3_1);

				controlGroup.setText(allTests.get(i).getId());

				Label testNameLabel = new Label(controlGroup, SWT.BORDER_SOLID);
				testNameLabel.setText("Test Name");
				Text testNameText = new Text(controlGroup, SWT.NONE
						| SWT.READ_ONLY);
				testNameText.setText(allTests.get(i).getName());

				Label testDescriptionLabel = new Label(controlGroup,
						SWT.UNDERLINE_SINGLE);
				testDescriptionLabel.setText("Description");
				Text testDescriptionText = new Text(controlGroup, SWT.NONE
						| SWT.READ_ONLY);
				testDescriptionText.setText(allTests.get(i).getDescription());

				Label testFamilyLabel = new Label(controlGroup,
						SWT.UNDERLINE_SINGLE);
				testFamilyLabel.setText("Its Family");
				Text testFamilyText = new Text(controlGroup, SWT.NONE
						| SWT.READ_ONLY);
				testFamilyText.setText(allTests.get(i).getItsTestFamily()
						.getName());

				Label referencesTestLabel = new Label(controlGroup,
						SWT.UNDERLINE_SINGLE);
				referencesTestLabel.setText("References");
				Text referencesTestText = new Text(controlGroup, SWT.NONE
						| SWT.READ_ONLY);
				referencesTestText.setText("");
				for (int m = 0; m < allTests.get(i).getReferences().size(); m++) {

					referencesTestText.setText(referencesTestText.getText()
							+ "\n" + allTests.get(i).getReferences().get(m));

				}

				for (int n = 0; n < allTests.get(i).getToolsToApply().size(); n++) {

					Group controlGroupTool = new Group(controlGroup,
							SWT.Collapse);
					controlGroupTool.setText(allTests.get(i).getName());

					GridLayout layout3_2 = new GridLayout();
					layout3_2.numColumns = 2;
					layout3_2.makeColumnsEqualWidth = true;
					controlGroupTool.setLayout(layout3_2);

					controlGroupTool.setText(allTests.get(i).getToolsToApply()
							.get(n).getId());

					Label toolNameLabel = new Label(controlGroupTool,
							SWT.BORDER_SOLID);
					toolNameLabel.setText("Tool Name");
					//toolNameLabel.setBackground(new Color(parent.getDisplay(),
						//	10, 133, 255));
					Text toolNameText = new Text(controlGroupTool, SWT.NONE
							| SWT.READ_ONLY);
					toolNameText.setText(allTests.get(i).getToolsToApply()
							.get(n).getName());

					Label toolDescriptionLabel = new Label(controlGroupTool,
							SWT.UNDERLINE_SINGLE);
					toolDescriptionLabel.setText("Description");
					Text toolDescriptionText = new Text(controlGroupTool,
							SWT.NONE | SWT.READ_ONLY);
					toolDescriptionText.setText(allTests.get(i)
							.getToolsToApply().get(n).getDescription());

					Button Mosart2ToolButton = new Button(controlGroupTool,
							SWT.NONE);
					Mosart2ToolButton.setText("MoSaRT_to_"
							+ allTests.get(i).getToolsToApply().get(n)
									.getName() + "_Transformation");

					Mosart2ToolButton.addListener(SWT.Selection,
						new Listener() {
								public void handleEvent(Event event) {

									MessageDialog.openInformation(getShell(),
											"Transformation Process",
											"The transformation from MoSaRT to the analysis engine"+
													 " is done");

								}
							});

					Button tool2MosartButton = new Button(controlGroupTool,
							SWT.NONE);
					tool2MosartButton.setText(allTests.get(i).getToolsToApply()
							.get(n).getName()
							+ "_to_" + "MoSaRT_Transformation");

					tool2MosartButton.addListener(SWT.Selection,
							new Listener() {
								public void handleEvent(Event event) {

									MessageDialog.openInformation(getShell(),
											"Transformation Process",
											"The transformation from the analysis engine to MoSaRT"
													+ " is done");

								}
							});
				}

			}

			onglet3.setControl(pageOnglet3);
			// ========================================================================================//
			
			tabfolder.pack();
			parent.redraw();

			return parent;
		}

		@Override
		protected boolean isResizable() {
			return true;
		}

		// return window;

	}

}
