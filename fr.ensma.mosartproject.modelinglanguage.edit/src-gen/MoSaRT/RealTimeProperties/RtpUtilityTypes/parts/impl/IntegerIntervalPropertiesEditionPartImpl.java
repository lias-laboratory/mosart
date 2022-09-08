/**
 * Generated with Acceleo
 */
package MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.impl;

// Start of user code for imports
import MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.IntegerIntervalPropertiesEditionPart;
import MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.RtpUtilityTypesViewsRepository;

import MoSaRT.RealTimeProperties.RtpUtilityTypes.providers.RtpUtilityTypesMessages;

import org.eclipse.emf.common.util.Enumerator;

import org.eclipse.emf.ecore.EEnumLiteral;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;

import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;

import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;

import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.RadioViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;

import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;

import org.eclipse.swt.SWT;

import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;

import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;

// End of user code

/**
 * 
 * 
 */
public class IntegerIntervalPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, IntegerIntervalPropertiesEditionPart {

	protected RadioViewer delimiterMinRadioViewer;
	protected Text boundMin;
	protected Text boundMax;
	protected RadioViewer delimiterMaxRadioViewer;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public IntegerIntervalPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createFigure(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public Composite createFigure(final Composite parent) {
		view = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(view);
		return view;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createControls(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(Composite view) { 
		CompositionSequence integerIntervalStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = integerIntervalStep.addStep(RtpUtilityTypesViewsRepository.IntegerInterval.Properties.class);
		propertiesStep.addStep(RtpUtilityTypesViewsRepository.IntegerInterval.Properties.delimiterMin);
		propertiesStep.addStep(RtpUtilityTypesViewsRepository.IntegerInterval.Properties.boundMin);
		propertiesStep.addStep(RtpUtilityTypesViewsRepository.IntegerInterval.Properties.boundMax);
		propertiesStep.addStep(RtpUtilityTypesViewsRepository.IntegerInterval.Properties.delimiterMax);
		
		
		composer = new PartComposer(integerIntervalStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == RtpUtilityTypesViewsRepository.IntegerInterval.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == RtpUtilityTypesViewsRepository.IntegerInterval.Properties.delimiterMin) {
					return createDelimiterMinRadioViewer(parent);
				}
				if (key == RtpUtilityTypesViewsRepository.IntegerInterval.Properties.boundMin) {
					return createBoundMinText(parent);
				}
				if (key == RtpUtilityTypesViewsRepository.IntegerInterval.Properties.boundMax) {
					return createBoundMaxText(parent);
				}
				if (key == RtpUtilityTypesViewsRepository.IntegerInterval.Properties.delimiterMax) {
					return createDelimiterMaxRadioViewer(parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}

	/**
	 * 
	 */
	protected Composite createPropertiesGroup(Composite parent) {
		Group propertiesGroup = new Group(parent, SWT.NONE);
		propertiesGroup.setText(RtpUtilityTypesMessages.IntegerIntervalPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	/**
	 * 
	 */
	protected Composite createDelimiterMinRadioViewer(Composite parent) {
		delimiterMinRadioViewer = new RadioViewer(parent, SWT.CHECK);
		GridData delimiterMinData = new GridData(GridData.FILL_HORIZONTAL);
		delimiterMinData.horizontalSpan = 2;
		delimiterMinRadioViewer.setLayoutData(delimiterMinData);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(RtpUtilityTypesViewsRepository.IntegerInterval.Properties.delimiterMin, RtpUtilityTypesViewsRepository.FORM_KIND), null);
		delimiterMinRadioViewer.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IntegerIntervalPropertiesEditionPartImpl.this, RtpUtilityTypesViewsRepository.IntegerInterval.Properties.delimiterMin, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, ((StructuredSelection)event.getSelection()).getFirstElement()));
			}
		});
		delimiterMinRadioViewer.setID(RtpUtilityTypesViewsRepository.IntegerInterval.Properties.delimiterMin);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(RtpUtilityTypesViewsRepository.IntegerInterval.Properties.delimiterMin, RtpUtilityTypesViewsRepository.SWT_KIND), null);
		return parent;
	}

	
	protected Composite createBoundMinText(Composite parent) {
		createDescription(parent, RtpUtilityTypesViewsRepository.IntegerInterval.Properties.boundMin, RtpUtilityTypesMessages.IntegerIntervalPropertiesEditionPart_BoundMinLabel);
		boundMin = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData boundMinData = new GridData(GridData.FILL_HORIZONTAL);
		boundMin.setLayoutData(boundMinData);
		boundMin.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IntegerIntervalPropertiesEditionPartImpl.this, RtpUtilityTypesViewsRepository.IntegerInterval.Properties.boundMin, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, boundMin.getText()));
			}

		});
		boundMin.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IntegerIntervalPropertiesEditionPartImpl.this, RtpUtilityTypesViewsRepository.IntegerInterval.Properties.boundMin, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, boundMin.getText()));
				}
			}

		});
		EditingUtils.setID(boundMin, RtpUtilityTypesViewsRepository.IntegerInterval.Properties.boundMin);
		EditingUtils.setEEFtype(boundMin, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(RtpUtilityTypesViewsRepository.IntegerInterval.Properties.boundMin, RtpUtilityTypesViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createBoundMaxText(Composite parent) {
		createDescription(parent, RtpUtilityTypesViewsRepository.IntegerInterval.Properties.boundMax, RtpUtilityTypesMessages.IntegerIntervalPropertiesEditionPart_BoundMaxLabel);
		boundMax = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData boundMaxData = new GridData(GridData.FILL_HORIZONTAL);
		boundMax.setLayoutData(boundMaxData);
		boundMax.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IntegerIntervalPropertiesEditionPartImpl.this, RtpUtilityTypesViewsRepository.IntegerInterval.Properties.boundMax, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, boundMax.getText()));
			}

		});
		boundMax.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IntegerIntervalPropertiesEditionPartImpl.this, RtpUtilityTypesViewsRepository.IntegerInterval.Properties.boundMax, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, boundMax.getText()));
				}
			}

		});
		EditingUtils.setID(boundMax, RtpUtilityTypesViewsRepository.IntegerInterval.Properties.boundMax);
		EditingUtils.setEEFtype(boundMax, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(RtpUtilityTypesViewsRepository.IntegerInterval.Properties.boundMax, RtpUtilityTypesViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createDelimiterMaxRadioViewer(Composite parent) {
		delimiterMaxRadioViewer = new RadioViewer(parent, SWT.CHECK);
		GridData delimiterMaxData = new GridData(GridData.FILL_HORIZONTAL);
		delimiterMaxData.horizontalSpan = 2;
		delimiterMaxRadioViewer.setLayoutData(delimiterMaxData);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(RtpUtilityTypesViewsRepository.IntegerInterval.Properties.delimiterMax, RtpUtilityTypesViewsRepository.FORM_KIND), null);
		delimiterMaxRadioViewer.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IntegerIntervalPropertiesEditionPartImpl.this, RtpUtilityTypesViewsRepository.IntegerInterval.Properties.delimiterMax, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, ((StructuredSelection)event.getSelection()).getFirstElement()));
			}
		});
		delimiterMaxRadioViewer.setID(RtpUtilityTypesViewsRepository.IntegerInterval.Properties.delimiterMax);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(RtpUtilityTypesViewsRepository.IntegerInterval.Properties.delimiterMax, RtpUtilityTypesViewsRepository.SWT_KIND), null);
		return parent;
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener#firePropertiesChanged(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void firePropertiesChanged(IPropertiesEditionEvent event) {
		// Start of user code for tab synchronization
		
		// End of user code
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.IntegerIntervalPropertiesEditionPart#getDelimiterMin()
	 * 
	 */
	public Object getDelimiterMin() {
		if (delimiterMinRadioViewer.getSelection() instanceof StructuredSelection) {
			StructuredSelection sSelection = (StructuredSelection) delimiterMinRadioViewer.getSelection();
			return sSelection.getFirstElement();
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.IntegerIntervalPropertiesEditionPart#initDelimiterMin(Object input, Enumerator current)
	 */
	public void initDelimiterMin(Object input, Enumerator current) {
		delimiterMinRadioViewer.setInput(input);
		delimiterMinRadioViewer.setSelection(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.IntegerIntervalPropertiesEditionPart#setDelimiterMin(Object newValue)
	 * 
	 */
	public void setDelimiterMin(Object newValue) {
		delimiterMinRadioViewer.setSelection(new StructuredSelection(newValue));
		boolean readOnly = isReadOnly(RtpUtilityTypesViewsRepository.IntegerInterval.Properties.delimiterMin);
		if (readOnly && delimiterMinRadioViewer.isEnabled()) {
			delimiterMinRadioViewer.setEnabled(false);
			delimiterMinRadioViewer.setToolTipText(RtpUtilityTypesMessages.IntegerInterval_ReadOnly);
		} else if (!readOnly && !delimiterMinRadioViewer.isEnabled()) {
			delimiterMinRadioViewer.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.IntegerIntervalPropertiesEditionPart#getBoundMin()
	 * 
	 */
	public String getBoundMin() {
		return boundMin.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.IntegerIntervalPropertiesEditionPart#setBoundMin(String newValue)
	 * 
	 */
	public void setBoundMin(String newValue) {
		if (newValue != null) {
			boundMin.setText(newValue);
		} else {
			boundMin.setText(""); //$NON-NLS-1$
		}
		boolean readOnly = isReadOnly(RtpUtilityTypesViewsRepository.IntegerInterval.Properties.boundMin);
		if (readOnly && boundMin.isEnabled()) {
			boundMin.setEnabled(false);
			boundMin.setToolTipText(RtpUtilityTypesMessages.IntegerInterval_ReadOnly);
		} else if (!readOnly && !boundMin.isEnabled()) {
			boundMin.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.IntegerIntervalPropertiesEditionPart#getBoundMax()
	 * 
	 */
	public String getBoundMax() {
		return boundMax.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.IntegerIntervalPropertiesEditionPart#setBoundMax(String newValue)
	 * 
	 */
	public void setBoundMax(String newValue) {
		if (newValue != null) {
			boundMax.setText(newValue);
		} else {
			boundMax.setText(""); //$NON-NLS-1$
		}
		boolean readOnly = isReadOnly(RtpUtilityTypesViewsRepository.IntegerInterval.Properties.boundMax);
		if (readOnly && boundMax.isEnabled()) {
			boundMax.setEnabled(false);
			boundMax.setToolTipText(RtpUtilityTypesMessages.IntegerInterval_ReadOnly);
		} else if (!readOnly && !boundMax.isEnabled()) {
			boundMax.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.IntegerIntervalPropertiesEditionPart#getDelimiterMax()
	 * 
	 */
	public Object getDelimiterMax() {
		if (delimiterMaxRadioViewer.getSelection() instanceof StructuredSelection) {
			StructuredSelection sSelection = (StructuredSelection) delimiterMaxRadioViewer.getSelection();
			return sSelection.getFirstElement();
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.IntegerIntervalPropertiesEditionPart#initDelimiterMax(Object input, Enumerator current)
	 */
	public void initDelimiterMax(Object input, Enumerator current) {
		delimiterMaxRadioViewer.setInput(input);
		delimiterMaxRadioViewer.setSelection(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.IntegerIntervalPropertiesEditionPart#setDelimiterMax(Object newValue)
	 * 
	 */
	public void setDelimiterMax(Object newValue) {
		delimiterMaxRadioViewer.setSelection(new StructuredSelection(newValue));
		boolean readOnly = isReadOnly(RtpUtilityTypesViewsRepository.IntegerInterval.Properties.delimiterMax);
		if (readOnly && delimiterMaxRadioViewer.isEnabled()) {
			delimiterMaxRadioViewer.setEnabled(false);
			delimiterMaxRadioViewer.setToolTipText(RtpUtilityTypesMessages.IntegerInterval_ReadOnly);
		} else if (!readOnly && !delimiterMaxRadioViewer.isEnabled()) {
			delimiterMaxRadioViewer.setEnabled(true);
		}
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return RtpUtilityTypesMessages.IntegerInterval_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
