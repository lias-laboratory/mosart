/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.HardwarePlatform.util;

import MoSaRT.HardwarePlatform.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see MoSaRT.HardwarePlatform.HardwarePlatformPackage
 * @generated
 */
public class HardwarePlatformValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final HardwarePlatformValidator INSTANCE = new HardwarePlatformValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "MoSaRT.HardwarePlatform";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwarePlatformValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return HardwarePlatformPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case HardwarePlatformPackage.SYSTEM_HARDWARE_SIDE:
				return validateSystemHardwareSide((SystemHardwareSide)value, diagnostics, context);
			case HardwarePlatformPackage.HP_PROCESSING_UNIT:
				return validateHpProcessingUnit((HpProcessingUnit)value, diagnostics, context);
			case HardwarePlatformPackage.HP_FLOW_CARRIER:
				return validateHpFlowCarrier((HpFlowCarrier)value, diagnostics, context);
			case HardwarePlatformPackage.HP_COMMUNICATION_ROUTER:
				return validateHpCommunicationRouter((HpCommunicationRouter)value, diagnostics, context);
			case HardwarePlatformPackage.HP_NETWORK_PORT:
				return validateHpNetworkPort((HpNetworkPort)value, diagnostics, context);
			case HardwarePlatformPackage.HP_COMMUNICATION_CHANNEL:
				return validateHpCommunicationChannel((HpCommunicationChannel)value, diagnostics, context);
			case HardwarePlatformPackage.HP_PROCESSOR_INTERCONNECTOR:
				return validateHpProcessorInterconnector((HpProcessorInterconnector)value, diagnostics, context);
			case HardwarePlatformPackage.HP_NETWORK_NODE:
				return validateHpNetworkNode((HpNetworkNode)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemHardwareSide(SystemHardwareSide systemHardwareSide, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(systemHardwareSide, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(systemHardwareSide, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(systemHardwareSide, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(systemHardwareSide, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(systemHardwareSide, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(systemHardwareSide, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(systemHardwareSide, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(systemHardwareSide, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(systemHardwareSide, diagnostics, context);
		if (result || diagnostics != null) result &= validateSystemHardwareSide_SystemHardwareSideRule1(systemHardwareSide, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the SystemHardwareSideRule1 constraint of '<em>System Hardware Side</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SYSTEM_HARDWARE_SIDE__SYSTEM_HARDWARE_SIDE_RULE1__EEXPRESSION = "self.processingUnits->size()>1 implies self.processingUnits->select(pr : HpProcessingUnit | pr.commChannel->isEmpty() and pr.processorInterconnector->isEmpty())->size()=0";

	/**
	 * Validates the SystemHardwareSideRule1 constraint of '<em>System Hardware Side</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemHardwareSide_SystemHardwareSideRule1(SystemHardwareSide systemHardwareSide, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(HardwarePlatformPackage.Literals.SYSTEM_HARDWARE_SIDE,
				 systemHardwareSide,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "SystemHardwareSideRule1",
				 SYSTEM_HARDWARE_SIDE__SYSTEM_HARDWARE_SIDE_RULE1__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHpProcessingUnit(HpProcessingUnit hpProcessingUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(hpProcessingUnit, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(hpProcessingUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(hpProcessingUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(hpProcessingUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(hpProcessingUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(hpProcessingUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(hpProcessingUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(hpProcessingUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(hpProcessingUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateHpProcessingUnit_HpProcessingUnitRule1(hpProcessingUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateHpProcessingUnit_HpProcessingUnitRule2(hpProcessingUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateHpProcessingUnit_HpProcessingUnitRule3(hpProcessingUnit, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the HpProcessingUnitRule1 constraint of '<em>Hp Processing Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String HP_PROCESSING_UNIT__HP_PROCESSING_UNIT_RULE1__EEXPRESSION = "(self.commChannel->notEmpty() and self.processorInterconnector->notEmpty()) implies  self.commChannel<>self.processorInterconnector.commChannel";

	/**
	 * Validates the HpProcessingUnitRule1 constraint of '<em>Hp Processing Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHpProcessingUnit_HpProcessingUnitRule1(HpProcessingUnit hpProcessingUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(HardwarePlatformPackage.Literals.HP_PROCESSING_UNIT,
				 hpProcessingUnit,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "HpProcessingUnitRule1",
				 HP_PROCESSING_UNIT__HP_PROCESSING_UNIT_RULE1__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the HpProcessingUnitRule2 constraint of '<em>Hp Processing Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String HP_PROCESSING_UNIT__HP_PROCESSING_UNIT_RULE2__EEXPRESSION = "self.candidateTasks->notEmpty() implies  (self.spaceProcesses->collect(sp | sp.schedulableTasks))->includesAll(self.candidateTasks)";

	/**
	 * Validates the HpProcessingUnitRule2 constraint of '<em>Hp Processing Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHpProcessingUnit_HpProcessingUnitRule2(HpProcessingUnit hpProcessingUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(HardwarePlatformPackage.Literals.HP_PROCESSING_UNIT,
				 hpProcessingUnit,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "HpProcessingUnitRule2",
				 HP_PROCESSING_UNIT__HP_PROCESSING_UNIT_RULE2__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the HpProcessingUnitRule3 constraint of '<em>Hp Processing Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String HP_PROCESSING_UNIT__HP_PROCESSING_UNIT_RULE3__EEXPRESSION = "self.schedulableTasks->notEmpty() implies  (self.spaceProcesses->collect(sp | sp.schedulableTasks))->includesAll(self.schedulableTasks)";

	/**
	 * Validates the HpProcessingUnitRule3 constraint of '<em>Hp Processing Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHpProcessingUnit_HpProcessingUnitRule3(HpProcessingUnit hpProcessingUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(HardwarePlatformPackage.Literals.HP_PROCESSING_UNIT,
				 hpProcessingUnit,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "HpProcessingUnitRule3",
				 HP_PROCESSING_UNIT__HP_PROCESSING_UNIT_RULE3__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHpFlowCarrier(HpFlowCarrier hpFlowCarrier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hpFlowCarrier, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHpCommunicationRouter(HpCommunicationRouter hpCommunicationRouter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(hpCommunicationRouter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(hpCommunicationRouter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(hpCommunicationRouter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(hpCommunicationRouter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(hpCommunicationRouter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(hpCommunicationRouter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(hpCommunicationRouter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(hpCommunicationRouter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(hpCommunicationRouter, diagnostics, context);
		if (result || diagnostics != null) result &= validateHpCommunicationRouter_HpCommunicationRouterRule1(hpCommunicationRouter, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the HpCommunicationRouterRule1 constraint of '<em>Hp Communication Router</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String HP_COMMUNICATION_ROUTER__HP_COMMUNICATION_ROUTER_RULE1__EEXPRESSION = "self.networkPorts->forAll(np1,np2 | np1 <> np2 implies np1.commChannel <> np2.commChannel)";

	/**
	 * Validates the HpCommunicationRouterRule1 constraint of '<em>Hp Communication Router</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHpCommunicationRouter_HpCommunicationRouterRule1(HpCommunicationRouter hpCommunicationRouter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(HardwarePlatformPackage.Literals.HP_COMMUNICATION_ROUTER,
				 hpCommunicationRouter,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "HpCommunicationRouterRule1",
				 HP_COMMUNICATION_ROUTER__HP_COMMUNICATION_ROUTER_RULE1__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHpNetworkPort(HpNetworkPort hpNetworkPort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hpNetworkPort, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHpCommunicationChannel(HpCommunicationChannel hpCommunicationChannel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(hpCommunicationChannel, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(hpCommunicationChannel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(hpCommunicationChannel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(hpCommunicationChannel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(hpCommunicationChannel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(hpCommunicationChannel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(hpCommunicationChannel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(hpCommunicationChannel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(hpCommunicationChannel, diagnostics, context);
		if (result || diagnostics != null) result &= validateHpCommunicationChannel_HpCommunicationChannelRule1(hpCommunicationChannel, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the HpCommunicationChannelRule1 constraint of '<em>Hp Communication Channel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String HP_COMMUNICATION_CHANNEL__HP_COMMUNICATION_CHANNEL_RULE1__EEXPRESSION = "self.processingUnits->isEmpty() implies (self.processingUnitSet->notEmpty() or self.networkPort->size()>=2)";

	/**
	 * Validates the HpCommunicationChannelRule1 constraint of '<em>Hp Communication Channel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHpCommunicationChannel_HpCommunicationChannelRule1(HpCommunicationChannel hpCommunicationChannel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(HardwarePlatformPackage.Literals.HP_COMMUNICATION_CHANNEL,
				 hpCommunicationChannel,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "HpCommunicationChannelRule1",
				 HP_COMMUNICATION_CHANNEL__HP_COMMUNICATION_CHANNEL_RULE1__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHpProcessorInterconnector(HpProcessorInterconnector hpProcessorInterconnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hpProcessorInterconnector, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHpNetworkNode(HpNetworkNode hpNetworkNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hpNetworkNode, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //HardwarePlatformValidator
