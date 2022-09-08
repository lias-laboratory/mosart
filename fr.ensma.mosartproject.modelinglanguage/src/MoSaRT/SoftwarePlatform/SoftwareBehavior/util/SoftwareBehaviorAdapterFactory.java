/**
 */
package MoSaRT.SoftwarePlatform.SoftwareBehavior.util;

import MoSaRT.SoftwarePlatform.SoftwareBehavior.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SoftwareBehaviorPackage
 * @generated
 */
public class SoftwareBehaviorAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SoftwareBehaviorPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareBehaviorAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SoftwareBehaviorPackage.eINSTANCE;
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
	protected SoftwareBehaviorSwitch<Adapter> modelSwitch =
		new SoftwareBehaviorSwitch<Adapter>() {
			@Override
			public Adapter caseGlobalBehavior(GlobalBehavior object) {
				return createGlobalBehaviorAdapter();
			}
			@Override
			public Adapter caseSbTrigger(SbTrigger object) {
				return createSbTriggerAdapter();
			}
			@Override
			public Adapter caseSbTimeTrigger(SbTimeTrigger object) {
				return createSbTimeTriggerAdapter();
			}
			@Override
			public Adapter caseSbExternalEventTrigger(SbExternalEventTrigger object) {
				return createSbExternalEventTriggerAdapter();
			}
			@Override
			public Adapter caseSbSchedulingActivity(SbSchedulingActivity object) {
				return createSbSchedulingActivityAdapter();
			}
			@Override
			public Adapter caseSbTaskActivity(SbTaskActivity object) {
				return createSbTaskActivityAdapter();
			}
			@Override
			public Adapter caseSbPrecedenceRelation(SbPrecedenceRelation object) {
				return createSbPrecedenceRelationAdapter();
			}
			@Override
			public Adapter caseSbSequencingRelation(SbSequencingRelation object) {
				return createSbSequencingRelationAdapter();
			}
			@Override
			public Adapter caseSbCommunicationRelation(SbCommunicationRelation object) {
				return createSbCommunicationRelationAdapter();
			}
			@Override
			public Adapter caseSbStep(SbStep object) {
				return createSbStepAdapter();
			}
			@Override
			public Adapter caseSbAcquireStep(SbAcquireStep object) {
				return createSbAcquireStepAdapter();
			}
			@Override
			public Adapter caseSbSendStep(SbSendStep object) {
				return createSbSendStepAdapter();
			}
			@Override
			public Adapter caseSbReceiveStep(SbReceiveStep object) {
				return createSbReceiveStepAdapter();
			}
			@Override
			public Adapter caseSbWriteStep(SbWriteStep object) {
				return createSbWriteStepAdapter();
			}
			@Override
			public Adapter caseSbReleaseStep(SbReleaseStep object) {
				return createSbReleaseStepAdapter();
			}
			@Override
			public Adapter caseSbReadStep(SbReadStep object) {
				return createSbReadStepAdapter();
			}
			@Override
			public Adapter caseSbStepPrecedenceRelation(SbStepPrecedenceRelation object) {
				return createSbStepPrecedenceRelationAdapter();
			}
			@Override
			public Adapter caseSbActionStep(SbActionStep object) {
				return createSbActionStepAdapter();
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
	 * Creates a new adapter for an object of class '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.GlobalBehavior <em>Global Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.GlobalBehavior
	 * @generated
	 */
	public Adapter createGlobalBehaviorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTrigger <em>Sb Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTrigger
	 * @generated
	 */
	public Adapter createSbTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTimeTrigger <em>Sb Time Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTimeTrigger
	 * @generated
	 */
	public Adapter createSbTimeTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbExternalEventTrigger <em>Sb External Event Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SbExternalEventTrigger
	 * @generated
	 */
	public Adapter createSbExternalEventTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbSchedulingActivity <em>Sb Scheduling Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SbSchedulingActivity
	 * @generated
	 */
	public Adapter createSbSchedulingActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTaskActivity <em>Sb Task Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTaskActivity
	 * @generated
	 */
	public Adapter createSbTaskActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbPrecedenceRelation <em>Sb Precedence Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SbPrecedenceRelation
	 * @generated
	 */
	public Adapter createSbPrecedenceRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbSequencingRelation <em>Sb Sequencing Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SbSequencingRelation
	 * @generated
	 */
	public Adapter createSbSequencingRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbCommunicationRelation <em>Sb Communication Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SbCommunicationRelation
	 * @generated
	 */
	public Adapter createSbCommunicationRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbStep <em>Sb Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SbStep
	 * @generated
	 */
	public Adapter createSbStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbAcquireStep <em>Sb Acquire Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SbAcquireStep
	 * @generated
	 */
	public Adapter createSbAcquireStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbSendStep <em>Sb Send Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SbSendStep
	 * @generated
	 */
	public Adapter createSbSendStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbReceiveStep <em>Sb Receive Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SbReceiveStep
	 * @generated
	 */
	public Adapter createSbReceiveStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbWriteStep <em>Sb Write Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SbWriteStep
	 * @generated
	 */
	public Adapter createSbWriteStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbReleaseStep <em>Sb Release Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SbReleaseStep
	 * @generated
	 */
	public Adapter createSbReleaseStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbReadStep <em>Sb Read Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SbReadStep
	 * @generated
	 */
	public Adapter createSbReadStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbStepPrecedenceRelation <em>Sb Step Precedence Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SbStepPrecedenceRelation
	 * @generated
	 */
	public Adapter createSbStepPrecedenceRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbActionStep <em>Sb Action Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SbActionStep
	 * @generated
	 */
	public Adapter createSbActionStepAdapter() {
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

} //SoftwareBehaviorAdapterFactory
