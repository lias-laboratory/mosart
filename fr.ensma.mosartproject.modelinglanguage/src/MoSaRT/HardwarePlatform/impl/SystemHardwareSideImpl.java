/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.HardwarePlatform.impl;

import MoSaRT.HardwarePlatform.HardwarePlatformPackage;
import MoSaRT.HardwarePlatform.HpCommunicationChannel;
import MoSaRT.HardwarePlatform.HpCommunicationRouter;
import MoSaRT.HardwarePlatform.HpFlowCarrier;
import MoSaRT.HardwarePlatform.HpProcessingUnit;
import MoSaRT.HardwarePlatform.HpProcessorInterconnector;
import MoSaRT.HardwarePlatform.SystemHardwareSide;

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
 * An implementation of the model object '<em><b>System Hardware Side</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.HardwarePlatform.impl.SystemHardwareSideImpl#getProcessingUnits <em>Processing Units</em>}</li>
 *   <li>{@link MoSaRT.HardwarePlatform.impl.SystemHardwareSideImpl#getCommRouters <em>Comm Routers</em>}</li>
 *   <li>{@link MoSaRT.HardwarePlatform.impl.SystemHardwareSideImpl#getCommChannels <em>Comm Channels</em>}</li>
 *   <li>{@link MoSaRT.HardwarePlatform.impl.SystemHardwareSideImpl#getName <em>Name</em>}</li>
 *   <li>{@link MoSaRT.HardwarePlatform.impl.SystemHardwareSideImpl#getProcessorInterconnectors <em>Processor Interconnectors</em>}</li>
 *   <li>{@link MoSaRT.HardwarePlatform.impl.SystemHardwareSideImpl#getHpflowcarrier <em>Hpflowcarrier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemHardwareSideImpl extends EObjectImpl implements SystemHardwareSide {
	/**
	 * The cached value of the '{@link #getProcessingUnits() <em>Processing Units</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessingUnits()
	 * @generated
	 * @ordered
	 */
	protected EList<HpProcessingUnit> processingUnits;

	/**
	 * The cached value of the '{@link #getCommRouters() <em>Comm Routers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommRouters()
	 * @generated
	 * @ordered
	 */
	protected EList<HpCommunicationRouter> commRouters;

	/**
	 * The cached value of the '{@link #getCommChannels() <em>Comm Channels</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommChannels()
	 * @generated
	 * @ordered
	 */
	protected EList<HpCommunicationChannel> commChannels;

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
	 * The cached value of the '{@link #getProcessorInterconnectors() <em>Processor Interconnectors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessorInterconnectors()
	 * @generated
	 * @ordered
	 */
	protected EList<HpProcessorInterconnector> processorInterconnectors;

	/**
	 * The cached value of the '{@link #getHpflowcarrier() <em>Hpflowcarrier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHpflowcarrier()
	 * @generated
	 * @ordered
	 */
	protected EList<HpFlowCarrier> hpflowcarrier;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemHardwareSideImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HardwarePlatformPackage.Literals.SYSTEM_HARDWARE_SIDE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HpProcessingUnit> getProcessingUnits() {
		if (processingUnits == null) {
			processingUnits = new EObjectContainmentEList<HpProcessingUnit>(HpProcessingUnit.class, this, HardwarePlatformPackage.SYSTEM_HARDWARE_SIDE__PROCESSING_UNITS);
		}
		return processingUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HpCommunicationRouter> getCommRouters() {
		if (commRouters == null) {
			commRouters = new EObjectContainmentEList<HpCommunicationRouter>(HpCommunicationRouter.class, this, HardwarePlatformPackage.SYSTEM_HARDWARE_SIDE__COMM_ROUTERS);
		}
		return commRouters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HpCommunicationChannel> getCommChannels() {
		if (commChannels == null) {
			commChannels = new EObjectContainmentEList<HpCommunicationChannel>(HpCommunicationChannel.class, this, HardwarePlatformPackage.SYSTEM_HARDWARE_SIDE__COMM_CHANNELS);
		}
		return commChannels;
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
			eNotify(new ENotificationImpl(this, Notification.SET, HardwarePlatformPackage.SYSTEM_HARDWARE_SIDE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HpProcessorInterconnector> getProcessorInterconnectors() {
		if (processorInterconnectors == null) {
			processorInterconnectors = new EObjectContainmentEList<HpProcessorInterconnector>(HpProcessorInterconnector.class, this, HardwarePlatformPackage.SYSTEM_HARDWARE_SIDE__PROCESSOR_INTERCONNECTORS);
		}
		return processorInterconnectors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HpFlowCarrier> getHpflowcarrier() {
		if (hpflowcarrier == null) {
			hpflowcarrier = new EObjectContainmentEList<HpFlowCarrier>(HpFlowCarrier.class, this, HardwarePlatformPackage.SYSTEM_HARDWARE_SIDE__HPFLOWCARRIER);
		}
		return hpflowcarrier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HardwarePlatformPackage.SYSTEM_HARDWARE_SIDE__PROCESSING_UNITS:
				return ((InternalEList<?>)getProcessingUnits()).basicRemove(otherEnd, msgs);
			case HardwarePlatformPackage.SYSTEM_HARDWARE_SIDE__COMM_ROUTERS:
				return ((InternalEList<?>)getCommRouters()).basicRemove(otherEnd, msgs);
			case HardwarePlatformPackage.SYSTEM_HARDWARE_SIDE__COMM_CHANNELS:
				return ((InternalEList<?>)getCommChannels()).basicRemove(otherEnd, msgs);
			case HardwarePlatformPackage.SYSTEM_HARDWARE_SIDE__PROCESSOR_INTERCONNECTORS:
				return ((InternalEList<?>)getProcessorInterconnectors()).basicRemove(otherEnd, msgs);
			case HardwarePlatformPackage.SYSTEM_HARDWARE_SIDE__HPFLOWCARRIER:
				return ((InternalEList<?>)getHpflowcarrier()).basicRemove(otherEnd, msgs);
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
			case HardwarePlatformPackage.SYSTEM_HARDWARE_SIDE__PROCESSING_UNITS:
				return getProcessingUnits();
			case HardwarePlatformPackage.SYSTEM_HARDWARE_SIDE__COMM_ROUTERS:
				return getCommRouters();
			case HardwarePlatformPackage.SYSTEM_HARDWARE_SIDE__COMM_CHANNELS:
				return getCommChannels();
			case HardwarePlatformPackage.SYSTEM_HARDWARE_SIDE__NAME:
				return getName();
			case HardwarePlatformPackage.SYSTEM_HARDWARE_SIDE__PROCESSOR_INTERCONNECTORS:
				return getProcessorInterconnectors();
			case HardwarePlatformPackage.SYSTEM_HARDWARE_SIDE__HPFLOWCARRIER:
				return getHpflowcarrier();
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
			case HardwarePlatformPackage.SYSTEM_HARDWARE_SIDE__PROCESSING_UNITS:
				getProcessingUnits().clear();
				getProcessingUnits().addAll((Collection<? extends HpProcessingUnit>)newValue);
				return;
			case HardwarePlatformPackage.SYSTEM_HARDWARE_SIDE__COMM_ROUTERS:
				getCommRouters().clear();
				getCommRouters().addAll((Collection<? extends HpCommunicationRouter>)newValue);
				return;
			case HardwarePlatformPackage.SYSTEM_HARDWARE_SIDE__COMM_CHANNELS:
				getCommChannels().clear();
				getCommChannels().addAll((Collection<? extends HpCommunicationChannel>)newValue);
				return;
			case HardwarePlatformPackage.SYSTEM_HARDWARE_SIDE__NAME:
				setName((String)newValue);
				return;
			case HardwarePlatformPackage.SYSTEM_HARDWARE_SIDE__PROCESSOR_INTERCONNECTORS:
				getProcessorInterconnectors().clear();
				getProcessorInterconnectors().addAll((Collection<? extends HpProcessorInterconnector>)newValue);
				return;
			case HardwarePlatformPackage.SYSTEM_HARDWARE_SIDE__HPFLOWCARRIER:
				getHpflowcarrier().clear();
				getHpflowcarrier().addAll((Collection<? extends HpFlowCarrier>)newValue);
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
			case HardwarePlatformPackage.SYSTEM_HARDWARE_SIDE__PROCESSING_UNITS:
				getProcessingUnits().clear();
				return;
			case HardwarePlatformPackage.SYSTEM_HARDWARE_SIDE__COMM_ROUTERS:
				getCommRouters().clear();
				return;
			case HardwarePlatformPackage.SYSTEM_HARDWARE_SIDE__COMM_CHANNELS:
				getCommChannels().clear();
				return;
			case HardwarePlatformPackage.SYSTEM_HARDWARE_SIDE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case HardwarePlatformPackage.SYSTEM_HARDWARE_SIDE__PROCESSOR_INTERCONNECTORS:
				getProcessorInterconnectors().clear();
				return;
			case HardwarePlatformPackage.SYSTEM_HARDWARE_SIDE__HPFLOWCARRIER:
				getHpflowcarrier().clear();
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
			case HardwarePlatformPackage.SYSTEM_HARDWARE_SIDE__PROCESSING_UNITS:
				return processingUnits != null && !processingUnits.isEmpty();
			case HardwarePlatformPackage.SYSTEM_HARDWARE_SIDE__COMM_ROUTERS:
				return commRouters != null && !commRouters.isEmpty();
			case HardwarePlatformPackage.SYSTEM_HARDWARE_SIDE__COMM_CHANNELS:
				return commChannels != null && !commChannels.isEmpty();
			case HardwarePlatformPackage.SYSTEM_HARDWARE_SIDE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case HardwarePlatformPackage.SYSTEM_HARDWARE_SIDE__PROCESSOR_INTERCONNECTORS:
				return processorInterconnectors != null && !processorInterconnectors.isEmpty();
			case HardwarePlatformPackage.SYSTEM_HARDWARE_SIDE__HPFLOWCARRIER:
				return hpflowcarrier != null && !hpflowcarrier.isEmpty();
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

} //SystemHardwareSideImpl
