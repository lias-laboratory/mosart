/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.HardwarePlatform.util;

import MoSaRT.HardwarePlatform.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see MoSaRT.HardwarePlatform.HardwarePlatformPackage
 * @generated
 */
public class HardwarePlatformAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static HardwarePlatformPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwarePlatformAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = HardwarePlatformPackage.eINSTANCE;
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
	protected HardwarePlatformSwitch<Adapter> modelSwitch =
		new HardwarePlatformSwitch<Adapter>() {
			@Override
			public Adapter caseSystemHardwareSide(SystemHardwareSide object) {
				return createSystemHardwareSideAdapter();
			}
			@Override
			public Adapter caseHpProcessingUnit(HpProcessingUnit object) {
				return createHpProcessingUnitAdapter();
			}
			@Override
			public Adapter caseHpFlowCarrier(HpFlowCarrier object) {
				return createHpFlowCarrierAdapter();
			}
			@Override
			public Adapter caseHpCommunicationRouter(HpCommunicationRouter object) {
				return createHpCommunicationRouterAdapter();
			}
			@Override
			public Adapter caseHpNetworkPort(HpNetworkPort object) {
				return createHpNetworkPortAdapter();
			}
			@Override
			public Adapter caseHpCommunicationChannel(HpCommunicationChannel object) {
				return createHpCommunicationChannelAdapter();
			}
			@Override
			public Adapter caseHpProcessorInterconnector(HpProcessorInterconnector object) {
				return createHpProcessorInterconnectorAdapter();
			}
			@Override
			public Adapter caseHpNetworkNode(HpNetworkNode object) {
				return createHpNetworkNodeAdapter();
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
	 * Creates a new adapter for an object of class '{@link MoSaRT.HardwarePlatform.SystemHardwareSide <em>System Hardware Side</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.HardwarePlatform.SystemHardwareSide
	 * @generated
	 */
	public Adapter createSystemHardwareSideAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.HardwarePlatform.HpProcessingUnit <em>Hp Processing Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.HardwarePlatform.HpProcessingUnit
	 * @generated
	 */
	public Adapter createHpProcessingUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.HardwarePlatform.HpFlowCarrier <em>Hp Flow Carrier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.HardwarePlatform.HpFlowCarrier
	 * @generated
	 */
	public Adapter createHpFlowCarrierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.HardwarePlatform.HpCommunicationRouter <em>Hp Communication Router</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.HardwarePlatform.HpCommunicationRouter
	 * @generated
	 */
	public Adapter createHpCommunicationRouterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.HardwarePlatform.HpNetworkPort <em>Hp Network Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.HardwarePlatform.HpNetworkPort
	 * @generated
	 */
	public Adapter createHpNetworkPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.HardwarePlatform.HpCommunicationChannel <em>Hp Communication Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.HardwarePlatform.HpCommunicationChannel
	 * @generated
	 */
	public Adapter createHpCommunicationChannelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.HardwarePlatform.HpProcessorInterconnector <em>Hp Processor Interconnector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.HardwarePlatform.HpProcessorInterconnector
	 * @generated
	 */
	public Adapter createHpProcessorInterconnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.HardwarePlatform.HpNetworkNode <em>Hp Network Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.HardwarePlatform.HpNetworkNode
	 * @generated
	 */
	public Adapter createHpNetworkNodeAdapter() {
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

} //HardwarePlatformAdapterFactory
