/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRTBackEnd_AnalysisRepository.util;

import MoSaRTBackEnd_AnalysisRepository.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see MoSaRTBackEnd_AnalysisRepository.MoSaRTBackEnd_AnalysisRepositoryPackage
 * @generated
 */
public class MoSaRTBackEnd_AnalysisRepositoryAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MoSaRTBackEnd_AnalysisRepositoryPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MoSaRTBackEnd_AnalysisRepositoryAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MoSaRTBackEnd_AnalysisRepositorySwitch<Adapter> modelSwitch =
		new MoSaRTBackEnd_AnalysisRepositorySwitch<Adapter>() {
			@Override
			public Adapter caseAnalysisRepository(AnalysisRepository object) {
				return createAnalysisRepositoryAdapter();
			}
			@Override
			public Adapter caseContextModel(ContextModel object) {
				return createContextModelAdapter();
			}
			@Override
			public Adapter caseTest(Test object) {
				return createTestAdapter();
			}
			@Override
			public Adapter caseIdentificationRule(IdentificationRule object) {
				return createIdentificationRuleAdapter();
			}
			@Override
			public Adapter caseTool(Tool object) {
				return createToolAdapter();
			}
			@Override
			public Adapter caseTestFamily(TestFamily object) {
				return createTestFamilyAdapter();
			}
			@Override
			public Adapter caseGeneralizationRelationship(GeneralizationRelationship object) {
				return createGeneralizationRelationshipAdapter();
			}
			@Override
			public Adapter caseTestCharacteristicType(TestCharacteristicType object) {
				return createTestCharacteristicTypeAdapter();
			}
			@Override
			public Adapter caseSustainabilityType(SustainabilityType object) {
				return createSustainabilityTypeAdapter();
			}
			@Override
			public Adapter caseDeadline_Sustainability(Deadline_Sustainability object) {
				return createDeadline_SustainabilityAdapter();
			}
			@Override
			public Adapter caseJitter_Sustainability(Jitter_Sustainability object) {
				return createJitter_SustainabilityAdapter();
			}
			@Override
			public Adapter casePeriod_Sustainability(Period_Sustainability object) {
				return createPeriod_SustainabilityAdapter();
			}
			@Override
			public Adapter caseExecutionTime_Sustainability(ExecutionTime_Sustainability object) {
				return createExecutionTime_SustainabilityAdapter();
			}
			@Override
			public Adapter caseFeasibilityType(FeasibilityType object) {
				return createFeasibilityTypeAdapter();
			}
			@Override
			public Adapter caseSufficientCondition(SufficientCondition object) {
				return createSufficientConditionAdapter();
			}
			@Override
			public Adapter caseNecessaryCondition(NecessaryCondition object) {
				return createNecessaryConditionAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link MoSaRTBackEnd_AnalysisRepository.AnalysisRepository <em>Analysis Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRTBackEnd_AnalysisRepository.AnalysisRepository
	 * @generated
	 */
	public Adapter createAnalysisRepositoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRTBackEnd_AnalysisRepository.ContextModel <em>Context Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRTBackEnd_AnalysisRepository.ContextModel
	 * @generated
	 */
	public Adapter createContextModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRTBackEnd_AnalysisRepository.Test <em>Test</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRTBackEnd_AnalysisRepository.Test
	 * @generated
	 */
	public Adapter createTestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRTBackEnd_AnalysisRepository.IdentificationRule <em>Identification Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRTBackEnd_AnalysisRepository.IdentificationRule
	 * @generated
	 */
	public Adapter createIdentificationRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRTBackEnd_AnalysisRepository.Tool <em>Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRTBackEnd_AnalysisRepository.Tool
	 * @generated
	 */
	public Adapter createToolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRTBackEnd_AnalysisRepository.TestFamily <em>Test Family</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRTBackEnd_AnalysisRepository.TestFamily
	 * @generated
	 */
	public Adapter createTestFamilyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRTBackEnd_AnalysisRepository.GeneralizationRelationship <em>Generalization Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRTBackEnd_AnalysisRepository.GeneralizationRelationship
	 * @generated
	 */
	public Adapter createGeneralizationRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRTBackEnd_AnalysisRepository.TestCharacteristicType <em>Test Characteristic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRTBackEnd_AnalysisRepository.TestCharacteristicType
	 * @generated
	 */
	public Adapter createTestCharacteristicTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRTBackEnd_AnalysisRepository.SustainabilityType <em>Sustainability Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRTBackEnd_AnalysisRepository.SustainabilityType
	 * @generated
	 */
	public Adapter createSustainabilityTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRTBackEnd_AnalysisRepository.Deadline_Sustainability <em>Deadline Sustainability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRTBackEnd_AnalysisRepository.Deadline_Sustainability
	 * @generated
	 */
	public Adapter createDeadline_SustainabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRTBackEnd_AnalysisRepository.Jitter_Sustainability <em>Jitter Sustainability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRTBackEnd_AnalysisRepository.Jitter_Sustainability
	 * @generated
	 */
	public Adapter createJitter_SustainabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRTBackEnd_AnalysisRepository.Period_Sustainability <em>Period Sustainability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRTBackEnd_AnalysisRepository.Period_Sustainability
	 * @generated
	 */
	public Adapter createPeriod_SustainabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRTBackEnd_AnalysisRepository.ExecutionTime_Sustainability <em>Execution Time Sustainability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRTBackEnd_AnalysisRepository.ExecutionTime_Sustainability
	 * @generated
	 */
	public Adapter createExecutionTime_SustainabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRTBackEnd_AnalysisRepository.FeasibilityType <em>Feasibility Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRTBackEnd_AnalysisRepository.FeasibilityType
	 * @generated
	 */
	public Adapter createFeasibilityTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRTBackEnd_AnalysisRepository.SufficientCondition <em>Sufficient Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRTBackEnd_AnalysisRepository.SufficientCondition
	 * @generated
	 */
	public Adapter createSufficientConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRTBackEnd_AnalysisRepository.NecessaryCondition <em>Necessary Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRTBackEnd_AnalysisRepository.NecessaryCondition
	 * @generated
	 */
	public Adapter createNecessaryConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //MoSaRTBackEnd_AnalysisRepositoryAdapterFactory
