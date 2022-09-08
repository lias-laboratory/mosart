/**
 */
package MoSaRT.SoftwarePlatform.SoftwareBehavior.impl;

import MoSaRT.SoftwarePlatform.SoftwareBehavior.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SoftwareBehaviorFactoryImpl extends EFactoryImpl implements SoftwareBehaviorFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SoftwareBehaviorFactory init() {
		try {
			SoftwareBehaviorFactory theSoftwareBehaviorFactory = (SoftwareBehaviorFactory)EPackage.Registry.INSTANCE.getEFactory(SoftwareBehaviorPackage.eNS_URI);
			if (theSoftwareBehaviorFactory != null) {
				return theSoftwareBehaviorFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SoftwareBehaviorFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareBehaviorFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SoftwareBehaviorPackage.GLOBAL_BEHAVIOR: return createGlobalBehavior();
			case SoftwareBehaviorPackage.SB_TIME_TRIGGER: return createSbTimeTrigger();
			case SoftwareBehaviorPackage.SB_EXTERNAL_EVENT_TRIGGER: return createSbExternalEventTrigger();
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY: return createSbTaskActivity();
			case SoftwareBehaviorPackage.SB_PRECEDENCE_RELATION: return createSbPrecedenceRelation();
			case SoftwareBehaviorPackage.SB_COMMUNICATION_RELATION: return createSbCommunicationRelation();
			case SoftwareBehaviorPackage.SB_ACQUIRE_STEP: return createSbAcquireStep();
			case SoftwareBehaviorPackage.SB_SEND_STEP: return createSbSendStep();
			case SoftwareBehaviorPackage.SB_RECEIVE_STEP: return createSbReceiveStep();
			case SoftwareBehaviorPackage.SB_WRITE_STEP: return createSbWriteStep();
			case SoftwareBehaviorPackage.SB_RELEASE_STEP: return createSbReleaseStep();
			case SoftwareBehaviorPackage.SB_READ_STEP: return createSbReadStep();
			case SoftwareBehaviorPackage.SB_STEP_PRECEDENCE_RELATION: return createSbStepPrecedenceRelation();
			case SoftwareBehaviorPackage.SB_ACTION_STEP: return createSbActionStep();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalBehavior createGlobalBehavior() {
		GlobalBehaviorImpl globalBehavior = new GlobalBehaviorImpl();
		return globalBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SbTimeTrigger createSbTimeTrigger() {
		SbTimeTriggerImpl sbTimeTrigger = new SbTimeTriggerImpl();
		return sbTimeTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SbExternalEventTrigger createSbExternalEventTrigger() {
		SbExternalEventTriggerImpl sbExternalEventTrigger = new SbExternalEventTriggerImpl();
		return sbExternalEventTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SbTaskActivity createSbTaskActivity() {
		SbTaskActivityImpl sbTaskActivity = new SbTaskActivityImpl();
		return sbTaskActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SbPrecedenceRelation createSbPrecedenceRelation() {
		SbPrecedenceRelationImpl sbPrecedenceRelation = new SbPrecedenceRelationImpl();
		return sbPrecedenceRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SbCommunicationRelation createSbCommunicationRelation() {
		SbCommunicationRelationImpl sbCommunicationRelation = new SbCommunicationRelationImpl();
		return sbCommunicationRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SbAcquireStep createSbAcquireStep() {
		SbAcquireStepImpl sbAcquireStep = new SbAcquireStepImpl();
		return sbAcquireStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SbSendStep createSbSendStep() {
		SbSendStepImpl sbSendStep = new SbSendStepImpl();
		return sbSendStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SbReceiveStep createSbReceiveStep() {
		SbReceiveStepImpl sbReceiveStep = new SbReceiveStepImpl();
		return sbReceiveStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SbWriteStep createSbWriteStep() {
		SbWriteStepImpl sbWriteStep = new SbWriteStepImpl();
		return sbWriteStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SbReleaseStep createSbReleaseStep() {
		SbReleaseStepImpl sbReleaseStep = new SbReleaseStepImpl();
		return sbReleaseStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SbReadStep createSbReadStep() {
		SbReadStepImpl sbReadStep = new SbReadStepImpl();
		return sbReadStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SbStepPrecedenceRelation createSbStepPrecedenceRelation() {
		SbStepPrecedenceRelationImpl sbStepPrecedenceRelation = new SbStepPrecedenceRelationImpl();
		return sbStepPrecedenceRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SbActionStep createSbActionStep() {
		SbActionStepImpl sbActionStep = new SbActionStepImpl();
		return sbActionStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareBehaviorPackage getSoftwareBehaviorPackage() {
		return (SoftwareBehaviorPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SoftwareBehaviorPackage getPackage() {
		return SoftwareBehaviorPackage.eINSTANCE;
	}

} //SoftwareBehaviorFactoryImpl
