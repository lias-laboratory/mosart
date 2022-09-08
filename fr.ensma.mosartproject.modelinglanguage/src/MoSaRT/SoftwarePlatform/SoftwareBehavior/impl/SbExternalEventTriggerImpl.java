/**
 */
package MoSaRT.SoftwarePlatform.SoftwareBehavior.impl;

import MoSaRT.SoftwarePlatform.SoftwareBehavior.SbExternalEventTrigger;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.SbSchedulingActivity;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.SoftwareBehaviorPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sb External Event Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SbExternalEventTriggerImpl#getSchedulingActivities <em>Scheduling Activities</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SbExternalEventTriggerImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SbExternalEventTriggerImpl extends EObjectImpl implements SbExternalEventTrigger {
	/**
	 * The cached value of the '{@link #getSchedulingActivities() <em>Scheduling Activities</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedulingActivities()
	 * @generated
	 * @ordered
	 */
	protected EList<SbSchedulingActivity> schedulingActivities;

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
	protected SbExternalEventTriggerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SoftwareBehaviorPackage.Literals.SB_EXTERNAL_EVENT_TRIGGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SbSchedulingActivity> getSchedulingActivities() {
		if (schedulingActivities == null) {
			schedulingActivities = new EObjectWithInverseResolvingEList<SbSchedulingActivity>(SbSchedulingActivity.class, this, SoftwareBehaviorPackage.SB_EXTERNAL_EVENT_TRIGGER__SCHEDULING_ACTIVITIES, SoftwareBehaviorPackage.SB_SCHEDULING_ACTIVITY__TRIGGER);
		}
		return schedulingActivities;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwareBehaviorPackage.SB_EXTERNAL_EVENT_TRIGGER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SoftwareBehaviorPackage.SB_EXTERNAL_EVENT_TRIGGER__SCHEDULING_ACTIVITIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSchedulingActivities()).basicAdd(otherEnd, msgs);
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
			case SoftwareBehaviorPackage.SB_EXTERNAL_EVENT_TRIGGER__SCHEDULING_ACTIVITIES:
				return ((InternalEList<?>)getSchedulingActivities()).basicRemove(otherEnd, msgs);
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
			case SoftwareBehaviorPackage.SB_EXTERNAL_EVENT_TRIGGER__SCHEDULING_ACTIVITIES:
				return getSchedulingActivities();
			case SoftwareBehaviorPackage.SB_EXTERNAL_EVENT_TRIGGER__NAME:
				return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SoftwareBehaviorPackage.SB_EXTERNAL_EVENT_TRIGGER__SCHEDULING_ACTIVITIES:
				getSchedulingActivities().clear();
				getSchedulingActivities().addAll((Collection<? extends SbSchedulingActivity>)newValue);
				return;
			case SoftwareBehaviorPackage.SB_EXTERNAL_EVENT_TRIGGER__NAME:
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
			case SoftwareBehaviorPackage.SB_EXTERNAL_EVENT_TRIGGER__SCHEDULING_ACTIVITIES:
				getSchedulingActivities().clear();
				return;
			case SoftwareBehaviorPackage.SB_EXTERNAL_EVENT_TRIGGER__NAME:
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
			case SoftwareBehaviorPackage.SB_EXTERNAL_EVENT_TRIGGER__SCHEDULING_ACTIVITIES:
				return schedulingActivities != null && !schedulingActivities.isEmpty();
			case SoftwareBehaviorPackage.SB_EXTERNAL_EVENT_TRIGGER__NAME:
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

} //SbExternalEventTriggerImpl
