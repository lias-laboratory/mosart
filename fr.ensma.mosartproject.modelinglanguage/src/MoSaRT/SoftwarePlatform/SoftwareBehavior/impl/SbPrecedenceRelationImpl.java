/**
 */
package MoSaRT.SoftwarePlatform.SoftwareBehavior.impl;

import MoSaRT.SoftwarePlatform.SoftwareBehavior.SbPrecedenceRelation;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.SbSchedulingActivity;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.SoftwareBehaviorPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sb Precedence Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SbPrecedenceRelationImpl#getName <em>Name</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SbPrecedenceRelationImpl#getTargetSchedulingActivity <em>Target Scheduling Activity</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SbPrecedenceRelationImpl#getSourceSchedulingActivity <em>Source Scheduling Activity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SbPrecedenceRelationImpl extends EObjectImpl implements SbPrecedenceRelation {
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
	 * The cached value of the '{@link #getTargetSchedulingActivity() <em>Target Scheduling Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetSchedulingActivity()
	 * @generated
	 * @ordered
	 */
	protected SbSchedulingActivity targetSchedulingActivity;

	/**
	 * The cached value of the '{@link #getSourceSchedulingActivity() <em>Source Scheduling Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceSchedulingActivity()
	 * @generated
	 * @ordered
	 */
	protected SbSchedulingActivity sourceSchedulingActivity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SbPrecedenceRelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SoftwareBehaviorPackage.Literals.SB_PRECEDENCE_RELATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwareBehaviorPackage.SB_PRECEDENCE_RELATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SbSchedulingActivity getTargetSchedulingActivity() {
		if (targetSchedulingActivity != null && targetSchedulingActivity.eIsProxy()) {
			InternalEObject oldTargetSchedulingActivity = (InternalEObject)targetSchedulingActivity;
			targetSchedulingActivity = (SbSchedulingActivity)eResolveProxy(oldTargetSchedulingActivity);
			if (targetSchedulingActivity != oldTargetSchedulingActivity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SoftwareBehaviorPackage.SB_PRECEDENCE_RELATION__TARGET_SCHEDULING_ACTIVITY, oldTargetSchedulingActivity, targetSchedulingActivity));
			}
		}
		return targetSchedulingActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SbSchedulingActivity basicGetTargetSchedulingActivity() {
		return targetSchedulingActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetSchedulingActivity(SbSchedulingActivity newTargetSchedulingActivity, NotificationChain msgs) {
		SbSchedulingActivity oldTargetSchedulingActivity = targetSchedulingActivity;
		targetSchedulingActivity = newTargetSchedulingActivity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SoftwareBehaviorPackage.SB_PRECEDENCE_RELATION__TARGET_SCHEDULING_ACTIVITY, oldTargetSchedulingActivity, newTargetSchedulingActivity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetSchedulingActivity(SbSchedulingActivity newTargetSchedulingActivity) {
		if (newTargetSchedulingActivity != targetSchedulingActivity) {
			NotificationChain msgs = null;
			if (targetSchedulingActivity != null)
				msgs = ((InternalEObject)targetSchedulingActivity).eInverseRemove(this, SoftwareBehaviorPackage.SB_SCHEDULING_ACTIVITY__INPUT_SQUENCING_RELATION, SbSchedulingActivity.class, msgs);
			if (newTargetSchedulingActivity != null)
				msgs = ((InternalEObject)newTargetSchedulingActivity).eInverseAdd(this, SoftwareBehaviorPackage.SB_SCHEDULING_ACTIVITY__INPUT_SQUENCING_RELATION, SbSchedulingActivity.class, msgs);
			msgs = basicSetTargetSchedulingActivity(newTargetSchedulingActivity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwareBehaviorPackage.SB_PRECEDENCE_RELATION__TARGET_SCHEDULING_ACTIVITY, newTargetSchedulingActivity, newTargetSchedulingActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SbSchedulingActivity getSourceSchedulingActivity() {
		if (sourceSchedulingActivity != null && sourceSchedulingActivity.eIsProxy()) {
			InternalEObject oldSourceSchedulingActivity = (InternalEObject)sourceSchedulingActivity;
			sourceSchedulingActivity = (SbSchedulingActivity)eResolveProxy(oldSourceSchedulingActivity);
			if (sourceSchedulingActivity != oldSourceSchedulingActivity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SoftwareBehaviorPackage.SB_PRECEDENCE_RELATION__SOURCE_SCHEDULING_ACTIVITY, oldSourceSchedulingActivity, sourceSchedulingActivity));
			}
		}
		return sourceSchedulingActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SbSchedulingActivity basicGetSourceSchedulingActivity() {
		return sourceSchedulingActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceSchedulingActivity(SbSchedulingActivity newSourceSchedulingActivity, NotificationChain msgs) {
		SbSchedulingActivity oldSourceSchedulingActivity = sourceSchedulingActivity;
		sourceSchedulingActivity = newSourceSchedulingActivity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SoftwareBehaviorPackage.SB_PRECEDENCE_RELATION__SOURCE_SCHEDULING_ACTIVITY, oldSourceSchedulingActivity, newSourceSchedulingActivity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceSchedulingActivity(SbSchedulingActivity newSourceSchedulingActivity) {
		if (newSourceSchedulingActivity != sourceSchedulingActivity) {
			NotificationChain msgs = null;
			if (sourceSchedulingActivity != null)
				msgs = ((InternalEObject)sourceSchedulingActivity).eInverseRemove(this, SoftwareBehaviorPackage.SB_SCHEDULING_ACTIVITY__OUTPUT_SEQUENCING_RELATION, SbSchedulingActivity.class, msgs);
			if (newSourceSchedulingActivity != null)
				msgs = ((InternalEObject)newSourceSchedulingActivity).eInverseAdd(this, SoftwareBehaviorPackage.SB_SCHEDULING_ACTIVITY__OUTPUT_SEQUENCING_RELATION, SbSchedulingActivity.class, msgs);
			msgs = basicSetSourceSchedulingActivity(newSourceSchedulingActivity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwareBehaviorPackage.SB_PRECEDENCE_RELATION__SOURCE_SCHEDULING_ACTIVITY, newSourceSchedulingActivity, newSourceSchedulingActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SoftwareBehaviorPackage.SB_PRECEDENCE_RELATION__TARGET_SCHEDULING_ACTIVITY:
				if (targetSchedulingActivity != null)
					msgs = ((InternalEObject)targetSchedulingActivity).eInverseRemove(this, SoftwareBehaviorPackage.SB_SCHEDULING_ACTIVITY__INPUT_SQUENCING_RELATION, SbSchedulingActivity.class, msgs);
				return basicSetTargetSchedulingActivity((SbSchedulingActivity)otherEnd, msgs);
			case SoftwareBehaviorPackage.SB_PRECEDENCE_RELATION__SOURCE_SCHEDULING_ACTIVITY:
				if (sourceSchedulingActivity != null)
					msgs = ((InternalEObject)sourceSchedulingActivity).eInverseRemove(this, SoftwareBehaviorPackage.SB_SCHEDULING_ACTIVITY__OUTPUT_SEQUENCING_RELATION, SbSchedulingActivity.class, msgs);
				return basicSetSourceSchedulingActivity((SbSchedulingActivity)otherEnd, msgs);
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
			case SoftwareBehaviorPackage.SB_PRECEDENCE_RELATION__TARGET_SCHEDULING_ACTIVITY:
				return basicSetTargetSchedulingActivity(null, msgs);
			case SoftwareBehaviorPackage.SB_PRECEDENCE_RELATION__SOURCE_SCHEDULING_ACTIVITY:
				return basicSetSourceSchedulingActivity(null, msgs);
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
			case SoftwareBehaviorPackage.SB_PRECEDENCE_RELATION__NAME:
				return getName();
			case SoftwareBehaviorPackage.SB_PRECEDENCE_RELATION__TARGET_SCHEDULING_ACTIVITY:
				if (resolve) return getTargetSchedulingActivity();
				return basicGetTargetSchedulingActivity();
			case SoftwareBehaviorPackage.SB_PRECEDENCE_RELATION__SOURCE_SCHEDULING_ACTIVITY:
				if (resolve) return getSourceSchedulingActivity();
				return basicGetSourceSchedulingActivity();
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
			case SoftwareBehaviorPackage.SB_PRECEDENCE_RELATION__NAME:
				setName((String)newValue);
				return;
			case SoftwareBehaviorPackage.SB_PRECEDENCE_RELATION__TARGET_SCHEDULING_ACTIVITY:
				setTargetSchedulingActivity((SbSchedulingActivity)newValue);
				return;
			case SoftwareBehaviorPackage.SB_PRECEDENCE_RELATION__SOURCE_SCHEDULING_ACTIVITY:
				setSourceSchedulingActivity((SbSchedulingActivity)newValue);
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
			case SoftwareBehaviorPackage.SB_PRECEDENCE_RELATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SoftwareBehaviorPackage.SB_PRECEDENCE_RELATION__TARGET_SCHEDULING_ACTIVITY:
				setTargetSchedulingActivity((SbSchedulingActivity)null);
				return;
			case SoftwareBehaviorPackage.SB_PRECEDENCE_RELATION__SOURCE_SCHEDULING_ACTIVITY:
				setSourceSchedulingActivity((SbSchedulingActivity)null);
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
			case SoftwareBehaviorPackage.SB_PRECEDENCE_RELATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SoftwareBehaviorPackage.SB_PRECEDENCE_RELATION__TARGET_SCHEDULING_ACTIVITY:
				return targetSchedulingActivity != null;
			case SoftwareBehaviorPackage.SB_PRECEDENCE_RELATION__SOURCE_SCHEDULING_ACTIVITY:
				return sourceSchedulingActivity != null;
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

} //SbPrecedenceRelationImpl
