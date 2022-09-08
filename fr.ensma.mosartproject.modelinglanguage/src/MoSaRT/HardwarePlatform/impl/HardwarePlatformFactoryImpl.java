/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.HardwarePlatform.impl;

import MoSaRT.HardwarePlatform.*;

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
public class HardwarePlatformFactoryImpl extends EFactoryImpl implements HardwarePlatformFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HardwarePlatformFactory init() {
		try {
			HardwarePlatformFactory theHardwarePlatformFactory = (HardwarePlatformFactory)EPackage.Registry.INSTANCE.getEFactory(HardwarePlatformPackage.eNS_URI);
			if (theHardwarePlatformFactory != null) {
				return theHardwarePlatformFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new HardwarePlatformFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwarePlatformFactoryImpl() {
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
			case HardwarePlatformPackage.SYSTEM_HARDWARE_SIDE: return createSystemHardwareSide();
			case HardwarePlatformPackage.HP_PROCESSING_UNIT: return createHpProcessingUnit();
			case HardwarePlatformPackage.HP_FLOW_CARRIER: return createHpFlowCarrier();
			case HardwarePlatformPackage.HP_COMMUNICATION_ROUTER: return createHpCommunicationRouter();
			case HardwarePlatformPackage.HP_NETWORK_PORT: return createHpNetworkPort();
			case HardwarePlatformPackage.HP_COMMUNICATION_CHANNEL: return createHpCommunicationChannel();
			case HardwarePlatformPackage.HP_PROCESSOR_INTERCONNECTOR: return createHpProcessorInterconnector();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemHardwareSide createSystemHardwareSide() {
		SystemHardwareSideImpl systemHardwareSide = new SystemHardwareSideImpl();
		return systemHardwareSide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HpProcessingUnit createHpProcessingUnit() {
		HpProcessingUnitImpl hpProcessingUnit = new HpProcessingUnitImpl();
		return hpProcessingUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HpFlowCarrier createHpFlowCarrier() {
		HpFlowCarrierImpl hpFlowCarrier = new HpFlowCarrierImpl();
		return hpFlowCarrier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HpCommunicationRouter createHpCommunicationRouter() {
		HpCommunicationRouterImpl hpCommunicationRouter = new HpCommunicationRouterImpl();
		return hpCommunicationRouter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HpNetworkPort createHpNetworkPort() {
		HpNetworkPortImpl hpNetworkPort = new HpNetworkPortImpl();
		return hpNetworkPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HpCommunicationChannel createHpCommunicationChannel() {
		HpCommunicationChannelImpl hpCommunicationChannel = new HpCommunicationChannelImpl();
		return hpCommunicationChannel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HpProcessorInterconnector createHpProcessorInterconnector() {
		HpProcessorInterconnectorImpl hpProcessorInterconnector = new HpProcessorInterconnectorImpl();
		return hpProcessorInterconnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwarePlatformPackage getHardwarePlatformPackage() {
		return (HardwarePlatformPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static HardwarePlatformPackage getPackage() {
		return HardwarePlatformPackage.eINSTANCE;
	}

} //HardwarePlatformFactoryImpl
