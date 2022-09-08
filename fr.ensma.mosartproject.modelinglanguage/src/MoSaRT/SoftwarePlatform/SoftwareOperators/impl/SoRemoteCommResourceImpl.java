/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.SoftwarePlatform.SoftwareOperators.impl;

import MoSaRT.SoftwarePlatform.SoftwareOperators.SoRemoteCommResource;
import MoSaRT.SoftwarePlatform.SoftwareOperators.SoSchedulableTask;
import MoSaRT.SoftwarePlatform.SoftwareOperators.SoTransmittedData;
import MoSaRT.SoftwarePlatform.SoftwareOperators.SoftwareOperatorsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>So Remote Comm Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareOperators.impl.SoRemoteCommResourceImpl#getWriterTasks <em>Writer Tasks</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareOperators.impl.SoRemoteCommResourceImpl#getReaderTasks <em>Reader Tasks</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareOperators.impl.SoRemoteCommResourceImpl#getName <em>Name</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareOperators.impl.SoRemoteCommResourceImpl#getTransmittedData <em>Transmitted Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SoRemoteCommResourceImpl extends EObjectImpl implements SoRemoteCommResource {
	/**
	 * The cached value of the '{@link #getWriterTasks() <em>Writer Tasks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriterTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<SoSchedulableTask> writerTasks;

	/**
	 * The cached value of the '{@link #getReaderTasks() <em>Reader Tasks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReaderTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<SoSchedulableTask> readerTasks;

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
	 * The cached value of the '{@link #getTransmittedData() <em>Transmitted Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransmittedData()
	 * @generated
	 * @ordered
	 */
	protected EList<SoTransmittedData> transmittedData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SoRemoteCommResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SoftwareOperatorsPackage.Literals.SO_REMOTE_COMM_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SoSchedulableTask> getWriterTasks() {
		if (writerTasks == null) {
			writerTasks = new EObjectWithInverseResolvingEList.ManyInverse<SoSchedulableTask>(SoSchedulableTask.class, this, SoftwareOperatorsPackage.SO_REMOTE_COMM_RESOURCE__WRITER_TASKS, SoftwareOperatorsPackage.SO_SCHEDULABLE_TASK__COMM_WRITING_RESOURCES);
		}
		return writerTasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SoSchedulableTask> getReaderTasks() {
		if (readerTasks == null) {
			readerTasks = new EObjectWithInverseResolvingEList.ManyInverse<SoSchedulableTask>(SoSchedulableTask.class, this, SoftwareOperatorsPackage.SO_REMOTE_COMM_RESOURCE__READER_TASKS, SoftwareOperatorsPackage.SO_SCHEDULABLE_TASK__COMM_READING_RESOURCES);
		}
		return readerTasks;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwareOperatorsPackage.SO_REMOTE_COMM_RESOURCE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SoTransmittedData> getTransmittedData() {
		if (transmittedData == null) {
			transmittedData = new EObjectContainmentEList<SoTransmittedData>(SoTransmittedData.class, this, SoftwareOperatorsPackage.SO_REMOTE_COMM_RESOURCE__TRANSMITTED_DATA);
		}
		return transmittedData;
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
			case SoftwareOperatorsPackage.SO_REMOTE_COMM_RESOURCE__WRITER_TASKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getWriterTasks()).basicAdd(otherEnd, msgs);
			case SoftwareOperatorsPackage.SO_REMOTE_COMM_RESOURCE__READER_TASKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReaderTasks()).basicAdd(otherEnd, msgs);
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
			case SoftwareOperatorsPackage.SO_REMOTE_COMM_RESOURCE__WRITER_TASKS:
				return ((InternalEList<?>)getWriterTasks()).basicRemove(otherEnd, msgs);
			case SoftwareOperatorsPackage.SO_REMOTE_COMM_RESOURCE__READER_TASKS:
				return ((InternalEList<?>)getReaderTasks()).basicRemove(otherEnd, msgs);
			case SoftwareOperatorsPackage.SO_REMOTE_COMM_RESOURCE__TRANSMITTED_DATA:
				return ((InternalEList<?>)getTransmittedData()).basicRemove(otherEnd, msgs);
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
			case SoftwareOperatorsPackage.SO_REMOTE_COMM_RESOURCE__WRITER_TASKS:
				return getWriterTasks();
			case SoftwareOperatorsPackage.SO_REMOTE_COMM_RESOURCE__READER_TASKS:
				return getReaderTasks();
			case SoftwareOperatorsPackage.SO_REMOTE_COMM_RESOURCE__NAME:
				return getName();
			case SoftwareOperatorsPackage.SO_REMOTE_COMM_RESOURCE__TRANSMITTED_DATA:
				return getTransmittedData();
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
			case SoftwareOperatorsPackage.SO_REMOTE_COMM_RESOURCE__WRITER_TASKS:
				getWriterTasks().clear();
				getWriterTasks().addAll((Collection<? extends SoSchedulableTask>)newValue);
				return;
			case SoftwareOperatorsPackage.SO_REMOTE_COMM_RESOURCE__READER_TASKS:
				getReaderTasks().clear();
				getReaderTasks().addAll((Collection<? extends SoSchedulableTask>)newValue);
				return;
			case SoftwareOperatorsPackage.SO_REMOTE_COMM_RESOURCE__NAME:
				setName((String)newValue);
				return;
			case SoftwareOperatorsPackage.SO_REMOTE_COMM_RESOURCE__TRANSMITTED_DATA:
				getTransmittedData().clear();
				getTransmittedData().addAll((Collection<? extends SoTransmittedData>)newValue);
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
			case SoftwareOperatorsPackage.SO_REMOTE_COMM_RESOURCE__WRITER_TASKS:
				getWriterTasks().clear();
				return;
			case SoftwareOperatorsPackage.SO_REMOTE_COMM_RESOURCE__READER_TASKS:
				getReaderTasks().clear();
				return;
			case SoftwareOperatorsPackage.SO_REMOTE_COMM_RESOURCE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SoftwareOperatorsPackage.SO_REMOTE_COMM_RESOURCE__TRANSMITTED_DATA:
				getTransmittedData().clear();
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
			case SoftwareOperatorsPackage.SO_REMOTE_COMM_RESOURCE__WRITER_TASKS:
				return writerTasks != null && !writerTasks.isEmpty();
			case SoftwareOperatorsPackage.SO_REMOTE_COMM_RESOURCE__READER_TASKS:
				return readerTasks != null && !readerTasks.isEmpty();
			case SoftwareOperatorsPackage.SO_REMOTE_COMM_RESOURCE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SoftwareOperatorsPackage.SO_REMOTE_COMM_RESOURCE__TRANSMITTED_DATA:
				return transmittedData != null && !transmittedData.isEmpty();
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

} //SoRemoteCommResourceImpl
