/**
 */
package MoSaRT.SoftwarePlatform.SoftwareBehavior.impl;

import MoSaRT.SoftwarePlatform.SoftwareBehavior.SbStep;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.SbStepPrecedenceRelation;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.SoftwareBehaviorPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sb Step Precedence Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SbStepPrecedenceRelationImpl#getTargetStep <em>Target Step</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SbStepPrecedenceRelationImpl#getSourceStep <em>Source Step</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SbStepPrecedenceRelationImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SbStepPrecedenceRelationImpl extends EObjectImpl implements SbStepPrecedenceRelation {
	/**
	 * The cached value of the '{@link #getTargetStep() <em>Target Step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetStep()
	 * @generated
	 * @ordered
	 */
	protected SbStep targetStep;

	/**
	 * The cached value of the '{@link #getSourceStep() <em>Source Step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceStep()
	 * @generated
	 * @ordered
	 */
	protected SbStep sourceStep;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SbStepPrecedenceRelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SoftwareBehaviorPackage.Literals.SB_STEP_PRECEDENCE_RELATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SbStep getTargetStep() {
		if (targetStep != null && targetStep.eIsProxy()) {
			InternalEObject oldTargetStep = (InternalEObject)targetStep;
			targetStep = (SbStep)eResolveProxy(oldTargetStep);
			if (targetStep != oldTargetStep) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SoftwareBehaviorPackage.SB_STEP_PRECEDENCE_RELATION__TARGET_STEP, oldTargetStep, targetStep));
			}
		}
		return targetStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SbStep basicGetTargetStep() {
		return targetStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetStep(SbStep newTargetStep, NotificationChain msgs) {
		SbStep oldTargetStep = targetStep;
		targetStep = newTargetStep;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SoftwareBehaviorPackage.SB_STEP_PRECEDENCE_RELATION__TARGET_STEP, oldTargetStep, newTargetStep);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetStep(SbStep newTargetStep) {
		if (newTargetStep != targetStep) {
			NotificationChain msgs = null;
			if (targetStep != null)
				msgs = ((InternalEObject)targetStep).eInverseRemove(this, SoftwareBehaviorPackage.SB_STEP__INPUT_STEP_RELATION, SbStep.class, msgs);
			if (newTargetStep != null)
				msgs = ((InternalEObject)newTargetStep).eInverseAdd(this, SoftwareBehaviorPackage.SB_STEP__INPUT_STEP_RELATION, SbStep.class, msgs);
			msgs = basicSetTargetStep(newTargetStep, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwareBehaviorPackage.SB_STEP_PRECEDENCE_RELATION__TARGET_STEP, newTargetStep, newTargetStep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SbStep getSourceStep() {
		if (sourceStep != null && sourceStep.eIsProxy()) {
			InternalEObject oldSourceStep = (InternalEObject)sourceStep;
			sourceStep = (SbStep)eResolveProxy(oldSourceStep);
			if (sourceStep != oldSourceStep) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SoftwareBehaviorPackage.SB_STEP_PRECEDENCE_RELATION__SOURCE_STEP, oldSourceStep, sourceStep));
			}
		}
		return sourceStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SbStep basicGetSourceStep() {
		return sourceStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceStep(SbStep newSourceStep, NotificationChain msgs) {
		SbStep oldSourceStep = sourceStep;
		sourceStep = newSourceStep;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SoftwareBehaviorPackage.SB_STEP_PRECEDENCE_RELATION__SOURCE_STEP, oldSourceStep, newSourceStep);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceStep(SbStep newSourceStep) {
		if (newSourceStep != sourceStep) {
			NotificationChain msgs = null;
			if (sourceStep != null)
				msgs = ((InternalEObject)sourceStep).eInverseRemove(this, SoftwareBehaviorPackage.SB_STEP__OUTPUT_STEP_RELATION, SbStep.class, msgs);
			if (newSourceStep != null)
				msgs = ((InternalEObject)newSourceStep).eInverseAdd(this, SoftwareBehaviorPackage.SB_STEP__OUTPUT_STEP_RELATION, SbStep.class, msgs);
			msgs = basicSetSourceStep(newSourceStep, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwareBehaviorPackage.SB_STEP_PRECEDENCE_RELATION__SOURCE_STEP, newSourceStep, newSourceStep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwareBehaviorPackage.SB_STEP_PRECEDENCE_RELATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SoftwareBehaviorPackage.SB_STEP_PRECEDENCE_RELATION__TARGET_STEP:
				if (targetStep != null)
					msgs = ((InternalEObject)targetStep).eInverseRemove(this, SoftwareBehaviorPackage.SB_STEP__INPUT_STEP_RELATION, SbStep.class, msgs);
				return basicSetTargetStep((SbStep)otherEnd, msgs);
			case SoftwareBehaviorPackage.SB_STEP_PRECEDENCE_RELATION__SOURCE_STEP:
				if (sourceStep != null)
					msgs = ((InternalEObject)sourceStep).eInverseRemove(this, SoftwareBehaviorPackage.SB_STEP__OUTPUT_STEP_RELATION, SbStep.class, msgs);
				return basicSetSourceStep((SbStep)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SoftwareBehaviorPackage.SB_STEP_PRECEDENCE_RELATION__TARGET_STEP:
				return basicSetTargetStep(null, msgs);
			case SoftwareBehaviorPackage.SB_STEP_PRECEDENCE_RELATION__SOURCE_STEP:
				return basicSetSourceStep(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SoftwareBehaviorPackage.SB_STEP_PRECEDENCE_RELATION__TARGET_STEP:
				if (resolve) return getTargetStep();
				return basicGetTargetStep();
			case SoftwareBehaviorPackage.SB_STEP_PRECEDENCE_RELATION__SOURCE_STEP:
				if (resolve) return getSourceStep();
				return basicGetSourceStep();
			case SoftwareBehaviorPackage.SB_STEP_PRECEDENCE_RELATION__NAME:
				return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SoftwareBehaviorPackage.SB_STEP_PRECEDENCE_RELATION__TARGET_STEP:
				setTargetStep((SbStep)newValue);
				return;
			case SoftwareBehaviorPackage.SB_STEP_PRECEDENCE_RELATION__SOURCE_STEP:
				setSourceStep((SbStep)newValue);
				return;
			case SoftwareBehaviorPackage.SB_STEP_PRECEDENCE_RELATION__NAME:
				setName((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SoftwareBehaviorPackage.SB_STEP_PRECEDENCE_RELATION__TARGET_STEP:
				setTargetStep((SbStep)null);
				return;
			case SoftwareBehaviorPackage.SB_STEP_PRECEDENCE_RELATION__SOURCE_STEP:
				setSourceStep((SbStep)null);
				return;
			case SoftwareBehaviorPackage.SB_STEP_PRECEDENCE_RELATION__NAME:
				setName(NAME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SoftwareBehaviorPackage.SB_STEP_PRECEDENCE_RELATION__TARGET_STEP:
				return targetStep != null;
			case SoftwareBehaviorPackage.SB_STEP_PRECEDENCE_RELATION__SOURCE_STEP:
				return sourceStep != null;
			case SoftwareBehaviorPackage.SB_STEP_PRECEDENCE_RELATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //SbStepPrecedenceRelationImpl
