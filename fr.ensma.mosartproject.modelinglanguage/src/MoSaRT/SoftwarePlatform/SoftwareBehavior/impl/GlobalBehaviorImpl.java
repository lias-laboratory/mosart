/**
 */
package MoSaRT.SoftwarePlatform.SoftwareBehavior.impl;

import MoSaRT.SoftwarePlatform.SoftwareBehavior.GlobalBehavior;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.SbSchedulingActivity;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.SbSequencingRelation;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTrigger;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.SoftwareBehaviorPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Global Behavior</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.GlobalBehaviorImpl#getTriggers <em>Triggers</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.GlobalBehaviorImpl#getSchedulingActivities <em>Scheduling Activities</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.GlobalBehaviorImpl#getSequencingRelations <em>Sequencing Relations</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.GlobalBehaviorImpl#getRootTrigger <em>Root Trigger</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.GlobalBehaviorImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GlobalBehaviorImpl extends EObjectImpl implements GlobalBehavior {
	/**
	 * The cached value of the '{@link #getTriggers() <em>Triggers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggers()
	 * @generated
	 * @ordered
	 */
	protected EList<SbTrigger> triggers;

	/**
	 * The cached value of the '{@link #getSchedulingActivities() <em>Scheduling Activities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedulingActivities()
	 * @generated
	 * @ordered
	 */
	protected EList<SbSchedulingActivity> schedulingActivities;

	/**
	 * The cached value of the '{@link #getSequencingRelations() <em>Sequencing Relations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequencingRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<SbSequencingRelation> sequencingRelations;

	/**
	 * The cached value of the '{@link #getRootTrigger() <em>Root Trigger</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootTrigger()
	 * @generated
	 * @ordered
	 */
	protected SbTrigger rootTrigger;

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
	protected GlobalBehaviorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SoftwareBehaviorPackage.Literals.GLOBAL_BEHAVIOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SbTrigger> getTriggers() {
		if (triggers == null) {
			triggers = new EObjectContainmentEList<SbTrigger>(SbTrigger.class, this, SoftwareBehaviorPackage.GLOBAL_BEHAVIOR__TRIGGERS);
		}
		return triggers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SbSchedulingActivity> getSchedulingActivities() {
		if (schedulingActivities == null) {
			schedulingActivities = new EObjectContainmentEList<SbSchedulingActivity>(SbSchedulingActivity.class, this, SoftwareBehaviorPackage.GLOBAL_BEHAVIOR__SCHEDULING_ACTIVITIES);
		}
		return schedulingActivities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SbSequencingRelation> getSequencingRelations() {
		if (sequencingRelations == null) {
			sequencingRelations = new EObjectContainmentEList<SbSequencingRelation>(SbSequencingRelation.class, this, SoftwareBehaviorPackage.GLOBAL_BEHAVIOR__SEQUENCING_RELATIONS);
		}
		return sequencingRelations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SbTrigger getRootTrigger() {
		if (rootTrigger != null && rootTrigger.eIsProxy()) {
			InternalEObject oldRootTrigger = (InternalEObject)rootTrigger;
			rootTrigger = (SbTrigger)eResolveProxy(oldRootTrigger);
			if (rootTrigger != oldRootTrigger) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SoftwareBehaviorPackage.GLOBAL_BEHAVIOR__ROOT_TRIGGER, oldRootTrigger, rootTrigger));
			}
		}
		return rootTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SbTrigger basicGetRootTrigger() {
		return rootTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRootTrigger(SbTrigger newRootTrigger) {
		SbTrigger oldRootTrigger = rootTrigger;
		rootTrigger = newRootTrigger;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwareBehaviorPackage.GLOBAL_BEHAVIOR__ROOT_TRIGGER, oldRootTrigger, rootTrigger));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwareBehaviorPackage.GLOBAL_BEHAVIOR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SoftwareBehaviorPackage.GLOBAL_BEHAVIOR__TRIGGERS:
				return ((InternalEList<?>)getTriggers()).basicRemove(otherEnd, msgs);
			case SoftwareBehaviorPackage.GLOBAL_BEHAVIOR__SCHEDULING_ACTIVITIES:
				return ((InternalEList<?>)getSchedulingActivities()).basicRemove(otherEnd, msgs);
			case SoftwareBehaviorPackage.GLOBAL_BEHAVIOR__SEQUENCING_RELATIONS:
				return ((InternalEList<?>)getSequencingRelations()).basicRemove(otherEnd, msgs);
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
			case SoftwareBehaviorPackage.GLOBAL_BEHAVIOR__TRIGGERS:
				return getTriggers();
			case SoftwareBehaviorPackage.GLOBAL_BEHAVIOR__SCHEDULING_ACTIVITIES:
				return getSchedulingActivities();
			case SoftwareBehaviorPackage.GLOBAL_BEHAVIOR__SEQUENCING_RELATIONS:
				return getSequencingRelations();
			case SoftwareBehaviorPackage.GLOBAL_BEHAVIOR__ROOT_TRIGGER:
				if (resolve) return getRootTrigger();
				return basicGetRootTrigger();
			case SoftwareBehaviorPackage.GLOBAL_BEHAVIOR__NAME:
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
			case SoftwareBehaviorPackage.GLOBAL_BEHAVIOR__TRIGGERS:
				getTriggers().clear();
				getTriggers().addAll((Collection<? extends SbTrigger>)newValue);
				return;
			case SoftwareBehaviorPackage.GLOBAL_BEHAVIOR__SCHEDULING_ACTIVITIES:
				getSchedulingActivities().clear();
				getSchedulingActivities().addAll((Collection<? extends SbSchedulingActivity>)newValue);
				return;
			case SoftwareBehaviorPackage.GLOBAL_BEHAVIOR__SEQUENCING_RELATIONS:
				getSequencingRelations().clear();
				getSequencingRelations().addAll((Collection<? extends SbSequencingRelation>)newValue);
				return;
			case SoftwareBehaviorPackage.GLOBAL_BEHAVIOR__ROOT_TRIGGER:
				setRootTrigger((SbTrigger)newValue);
				return;
			case SoftwareBehaviorPackage.GLOBAL_BEHAVIOR__NAME:
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
			case SoftwareBehaviorPackage.GLOBAL_BEHAVIOR__TRIGGERS:
				getTriggers().clear();
				return;
			case SoftwareBehaviorPackage.GLOBAL_BEHAVIOR__SCHEDULING_ACTIVITIES:
				getSchedulingActivities().clear();
				return;
			case SoftwareBehaviorPackage.GLOBAL_BEHAVIOR__SEQUENCING_RELATIONS:
				getSequencingRelations().clear();
				return;
			case SoftwareBehaviorPackage.GLOBAL_BEHAVIOR__ROOT_TRIGGER:
				setRootTrigger((SbTrigger)null);
				return;
			case SoftwareBehaviorPackage.GLOBAL_BEHAVIOR__NAME:
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
			case SoftwareBehaviorPackage.GLOBAL_BEHAVIOR__TRIGGERS:
				return triggers != null && !triggers.isEmpty();
			case SoftwareBehaviorPackage.GLOBAL_BEHAVIOR__SCHEDULING_ACTIVITIES:
				return schedulingActivities != null && !schedulingActivities.isEmpty();
			case SoftwareBehaviorPackage.GLOBAL_BEHAVIOR__SEQUENCING_RELATIONS:
				return sequencingRelations != null && !sequencingRelations.isEmpty();
			case SoftwareBehaviorPackage.GLOBAL_BEHAVIOR__ROOT_TRIGGER:
				return rootTrigger != null;
			case SoftwareBehaviorPackage.GLOBAL_BEHAVIOR__NAME:
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

} //GlobalBehaviorImpl
