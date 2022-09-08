/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.SoftwarePlatform.SoftwareOperators.impl;

import MoSaRT.SoftwarePlatform.SoftwareBehavior.GlobalBehavior;

import MoSaRT.SoftwarePlatform.SoftwareOperators.SoInteractionResource;
import MoSaRT.SoftwarePlatform.SoftwareOperators.SoSchedulableTask;
import MoSaRT.SoftwarePlatform.SoftwareOperators.SoSpaceProcess;
import MoSaRT.SoftwarePlatform.SoftwareOperators.SoftwareOperatorsPackage;
import MoSaRT.SoftwarePlatform.SoftwareOperators.SystemSoftwareSide;

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
 * An implementation of the model object '<em><b>System Software Side</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareOperators.impl.SystemSoftwareSideImpl#getSystemBehavior <em>System Behavior</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareOperators.impl.SystemSoftwareSideImpl#getSpaceProcesses <em>Space Processes</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareOperators.impl.SystemSoftwareSideImpl#getInteractionResources <em>Interaction Resources</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareOperators.impl.SystemSoftwareSideImpl#getSchedulableTasks <em>Schedulable Tasks</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareOperators.impl.SystemSoftwareSideImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemSoftwareSideImpl extends EObjectImpl implements SystemSoftwareSide {
	/**
	 * The cached value of the '{@link #getSystemBehavior() <em>System Behavior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemBehavior()
	 * @generated
	 * @ordered
	 */
	protected GlobalBehavior systemBehavior;

	/**
	 * The cached value of the '{@link #getSpaceProcesses() <em>Space Processes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpaceProcesses()
	 * @generated
	 * @ordered
	 */
	protected EList<SoSpaceProcess> spaceProcesses;

	/**
	 * The cached value of the '{@link #getInteractionResources() <em>Interaction Resources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteractionResources()
	 * @generated
	 * @ordered
	 */
	protected EList<SoInteractionResource> interactionResources;

	/**
	 * The cached value of the '{@link #getSchedulableTasks() <em>Schedulable Tasks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedulableTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<SoSchedulableTask> schedulableTasks;

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
	protected SystemSoftwareSideImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SoftwareOperatorsPackage.Literals.SYSTEM_SOFTWARE_SIDE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalBehavior getSystemBehavior() {
		return systemBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSystemBehavior(GlobalBehavior newSystemBehavior, NotificationChain msgs) {
		GlobalBehavior oldSystemBehavior = systemBehavior;
		systemBehavior = newSystemBehavior;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SoftwareOperatorsPackage.SYSTEM_SOFTWARE_SIDE__SYSTEM_BEHAVIOR, oldSystemBehavior, newSystemBehavior);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystemBehavior(GlobalBehavior newSystemBehavior) {
		if (newSystemBehavior != systemBehavior) {
			NotificationChain msgs = null;
			if (systemBehavior != null)
				msgs = ((InternalEObject)systemBehavior).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SoftwareOperatorsPackage.SYSTEM_SOFTWARE_SIDE__SYSTEM_BEHAVIOR, null, msgs);
			if (newSystemBehavior != null)
				msgs = ((InternalEObject)newSystemBehavior).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SoftwareOperatorsPackage.SYSTEM_SOFTWARE_SIDE__SYSTEM_BEHAVIOR, null, msgs);
			msgs = basicSetSystemBehavior(newSystemBehavior, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwareOperatorsPackage.SYSTEM_SOFTWARE_SIDE__SYSTEM_BEHAVIOR, newSystemBehavior, newSystemBehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SoSpaceProcess> getSpaceProcesses() {
		if (spaceProcesses == null) {
			spaceProcesses = new EObjectContainmentEList<SoSpaceProcess>(SoSpaceProcess.class, this, SoftwareOperatorsPackage.SYSTEM_SOFTWARE_SIDE__SPACE_PROCESSES);
		}
		return spaceProcesses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SoInteractionResource> getInteractionResources() {
		if (interactionResources == null) {
			interactionResources = new EObjectContainmentEList<SoInteractionResource>(SoInteractionResource.class, this, SoftwareOperatorsPackage.SYSTEM_SOFTWARE_SIDE__INTERACTION_RESOURCES);
		}
		return interactionResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SoSchedulableTask> getSchedulableTasks() {
		if (schedulableTasks == null) {
			schedulableTasks = new EObjectContainmentEList<SoSchedulableTask>(SoSchedulableTask.class, this, SoftwareOperatorsPackage.SYSTEM_SOFTWARE_SIDE__SCHEDULABLE_TASKS);
		}
		return schedulableTasks;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwareOperatorsPackage.SYSTEM_SOFTWARE_SIDE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SoftwareOperatorsPackage.SYSTEM_SOFTWARE_SIDE__SYSTEM_BEHAVIOR:
				return basicSetSystemBehavior(null, msgs);
			case SoftwareOperatorsPackage.SYSTEM_SOFTWARE_SIDE__SPACE_PROCESSES:
				return ((InternalEList<?>)getSpaceProcesses()).basicRemove(otherEnd, msgs);
			case SoftwareOperatorsPackage.SYSTEM_SOFTWARE_SIDE__INTERACTION_RESOURCES:
				return ((InternalEList<?>)getInteractionResources()).basicRemove(otherEnd, msgs);
			case SoftwareOperatorsPackage.SYSTEM_SOFTWARE_SIDE__SCHEDULABLE_TASKS:
				return ((InternalEList<?>)getSchedulableTasks()).basicRemove(otherEnd, msgs);
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
			case SoftwareOperatorsPackage.SYSTEM_SOFTWARE_SIDE__SYSTEM_BEHAVIOR:
				return getSystemBehavior();
			case SoftwareOperatorsPackage.SYSTEM_SOFTWARE_SIDE__SPACE_PROCESSES:
				return getSpaceProcesses();
			case SoftwareOperatorsPackage.SYSTEM_SOFTWARE_SIDE__INTERACTION_RESOURCES:
				return getInteractionResources();
			case SoftwareOperatorsPackage.SYSTEM_SOFTWARE_SIDE__SCHEDULABLE_TASKS:
				return getSchedulableTasks();
			case SoftwareOperatorsPackage.SYSTEM_SOFTWARE_SIDE__NAME:
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
			case SoftwareOperatorsPackage.SYSTEM_SOFTWARE_SIDE__SYSTEM_BEHAVIOR:
				setSystemBehavior((GlobalBehavior)newValue);
				return;
			case SoftwareOperatorsPackage.SYSTEM_SOFTWARE_SIDE__SPACE_PROCESSES:
				getSpaceProcesses().clear();
				getSpaceProcesses().addAll((Collection<? extends SoSpaceProcess>)newValue);
				return;
			case SoftwareOperatorsPackage.SYSTEM_SOFTWARE_SIDE__INTERACTION_RESOURCES:
				getInteractionResources().clear();
				getInteractionResources().addAll((Collection<? extends SoInteractionResource>)newValue);
				return;
			case SoftwareOperatorsPackage.SYSTEM_SOFTWARE_SIDE__SCHEDULABLE_TASKS:
				getSchedulableTasks().clear();
				getSchedulableTasks().addAll((Collection<? extends SoSchedulableTask>)newValue);
				return;
			case SoftwareOperatorsPackage.SYSTEM_SOFTWARE_SIDE__NAME:
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
			case SoftwareOperatorsPackage.SYSTEM_SOFTWARE_SIDE__SYSTEM_BEHAVIOR:
				setSystemBehavior((GlobalBehavior)null);
				return;
			case SoftwareOperatorsPackage.SYSTEM_SOFTWARE_SIDE__SPACE_PROCESSES:
				getSpaceProcesses().clear();
				return;
			case SoftwareOperatorsPackage.SYSTEM_SOFTWARE_SIDE__INTERACTION_RESOURCES:
				getInteractionResources().clear();
				return;
			case SoftwareOperatorsPackage.SYSTEM_SOFTWARE_SIDE__SCHEDULABLE_TASKS:
				getSchedulableTasks().clear();
				return;
			case SoftwareOperatorsPackage.SYSTEM_SOFTWARE_SIDE__NAME:
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
			case SoftwareOperatorsPackage.SYSTEM_SOFTWARE_SIDE__SYSTEM_BEHAVIOR:
				return systemBehavior != null;
			case SoftwareOperatorsPackage.SYSTEM_SOFTWARE_SIDE__SPACE_PROCESSES:
				return spaceProcesses != null && !spaceProcesses.isEmpty();
			case SoftwareOperatorsPackage.SYSTEM_SOFTWARE_SIDE__INTERACTION_RESOURCES:
				return interactionResources != null && !interactionResources.isEmpty();
			case SoftwareOperatorsPackage.SYSTEM_SOFTWARE_SIDE__SCHEDULABLE_TASKS:
				return schedulableTasks != null && !schedulableTasks.isEmpty();
			case SoftwareOperatorsPackage.SYSTEM_SOFTWARE_SIDE__NAME:
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

} //SystemSoftwareSideImpl
