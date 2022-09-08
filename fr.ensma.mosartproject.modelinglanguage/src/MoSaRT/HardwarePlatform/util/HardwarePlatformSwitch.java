/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.HardwarePlatform.util;

import MoSaRT.HardwarePlatform.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see MoSaRT.HardwarePlatform.HardwarePlatformPackage
 * @generated
 */
public class HardwarePlatformSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static HardwarePlatformPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwarePlatformSwitch() {
		if (modelPackage == null) {
			modelPackage = HardwarePlatformPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case HardwarePlatformPackage.SYSTEM_HARDWARE_SIDE: {
				SystemHardwareSide systemHardwareSide = (SystemHardwareSide)theEObject;
				T result = caseSystemHardwareSide(systemHardwareSide);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HardwarePlatformPackage.HP_PROCESSING_UNIT: {
				HpProcessingUnit hpProcessingUnit = (HpProcessingUnit)theEObject;
				T result = caseHpProcessingUnit(hpProcessingUnit);
				if (result == null) result = caseHpNetworkNode(hpProcessingUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HardwarePlatformPackage.HP_FLOW_CARRIER: {
				HpFlowCarrier hpFlowCarrier = (HpFlowCarrier)theEObject;
				T result = caseHpFlowCarrier(hpFlowCarrier);
				if (result == null) result = caseHpNetworkNode(hpFlowCarrier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HardwarePlatformPackage.HP_COMMUNICATION_ROUTER: {
				HpCommunicationRouter hpCommunicationRouter = (HpCommunicationRouter)theEObject;
				T result = caseHpCommunicationRouter(hpCommunicationRouter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HardwarePlatformPackage.HP_NETWORK_PORT: {
				HpNetworkPort hpNetworkPort = (HpNetworkPort)theEObject;
				T result = caseHpNetworkPort(hpNetworkPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HardwarePlatformPackage.HP_COMMUNICATION_CHANNEL: {
				HpCommunicationChannel hpCommunicationChannel = (HpCommunicationChannel)theEObject;
				T result = caseHpCommunicationChannel(hpCommunicationChannel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HardwarePlatformPackage.HP_PROCESSOR_INTERCONNECTOR: {
				HpProcessorInterconnector hpProcessorInterconnector = (HpProcessorInterconnector)theEObject;
				T result = caseHpProcessorInterconnector(hpProcessorInterconnector);
				if (result == null) result = caseHpNetworkNode(hpProcessorInterconnector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HardwarePlatformPackage.HP_NETWORK_NODE: {
				HpNetworkNode hpNetworkNode = (HpNetworkNode)theEObject;
				T result = caseHpNetworkNode(hpNetworkNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Hardware Side</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Hardware Side</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemHardwareSide(SystemHardwareSide object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hp Processing Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hp Processing Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHpProcessingUnit(HpProcessingUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hp Flow Carrier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hp Flow Carrier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHpFlowCarrier(HpFlowCarrier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hp Communication Router</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hp Communication Router</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHpCommunicationRouter(HpCommunicationRouter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hp Network Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hp Network Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHpNetworkPort(HpNetworkPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hp Communication Channel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hp Communication Channel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHpCommunicationChannel(HpCommunicationChannel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hp Processor Interconnector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hp Processor Interconnector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHpProcessorInterconnector(HpProcessorInterconnector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hp Network Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hp Network Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHpNetworkNode(HpNetworkNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //HardwarePlatformSwitch
