/**
 */
package MoSaRT.util;

import MoSaRT.*;

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
 * @see MoSaRT.MoSaRTPackage
 * @generated
 */
public class MoSaRTValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final MoSaRTValidator INSTANCE = new MoSaRTValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "MoSaRT";

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
	public MoSaRTValidator() {
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
	  return MoSaRTPackage.eINSTANCE;
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
			case MoSaRTPackage.GLOBAL_SYSTEM:
				return validateGlobalSystem((GlobalSystem)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGlobalSystem(GlobalSystem globalSystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(globalSystem, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(globalSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(globalSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(globalSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(globalSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(globalSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(globalSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(globalSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(globalSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validateGlobalSystem_GlobalSystemRuleTest(globalSystem, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the GlobalSystemRuleTest constraint of '<em>Global System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String GLOBAL_SYSTEM__GLOBAL_SYSTEM_RULE_TEST__EEXPRESSION = "self.name->notEmpty()";

	/**
	 * Validates the GlobalSystemRuleTest constraint of '<em>Global System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGlobalSystem_GlobalSystemRuleTest(GlobalSystem globalSystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MoSaRTPackage.Literals.GLOBAL_SYSTEM,
				 globalSystem,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "GlobalSystemRuleTest",
				 GLOBAL_SYSTEM__GLOBAL_SYSTEM_RULE_TEST__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
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

} //MoSaRTValidator
