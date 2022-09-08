/**
 */
package MoSaRT.FunctionalElements;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see MoSaRT.FunctionalElements.FunctionalElementsFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface FunctionalElementsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "FunctionalElements";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.ensma.fr/MoSaRT/FunctionalElements";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "FE";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FunctionalElementsPackage eINSTANCE = MoSaRT.FunctionalElements.impl.FunctionalElementsPackageImpl.init();

	/**
	 * The meta object id for the '{@link MoSaRT.FunctionalElements.impl.SystemFunctionalSideImpl <em>System Functional Side</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.FunctionalElements.impl.SystemFunctionalSideImpl
	 * @see MoSaRT.FunctionalElements.impl.FunctionalElementsPackageImpl#getSystemFunctionalSide()
	 * @generated
	 */
	int SYSTEM_FUNCTIONAL_SIDE = 0;

	/**
	 * The feature id for the '<em><b>Uml Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTIONAL_SIDE__UML_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTIONAL_SIDE__NAME = 1;

	/**
	 * The number of structural features of the '<em>System Functional Side</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTIONAL_SIDE_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Import Uml Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTIONAL_SIDE___IMPORT_UML_MODEL__MODEL = 0;

	/**
	 * The number of operations of the '<em>System Functional Side</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTIONAL_SIDE_OPERATION_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link MoSaRT.FunctionalElements.SystemFunctionalSide <em>System Functional Side</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Functional Side</em>'.
	 * @see MoSaRT.FunctionalElements.SystemFunctionalSide
	 * @generated
	 */
	EClass getSystemFunctionalSide();

	/**
	 * Returns the meta object for the containment reference '{@link MoSaRT.FunctionalElements.SystemFunctionalSide#getUmlModel <em>Uml Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Uml Model</em>'.
	 * @see MoSaRT.FunctionalElements.SystemFunctionalSide#getUmlModel()
	 * @see #getSystemFunctionalSide()
	 * @generated
	 */
	EReference getSystemFunctionalSide_UmlModel();

	/**
	 * Returns the meta object for the attribute '{@link MoSaRT.FunctionalElements.SystemFunctionalSide#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see MoSaRT.FunctionalElements.SystemFunctionalSide#getName()
	 * @see #getSystemFunctionalSide()
	 * @generated
	 */
	EAttribute getSystemFunctionalSide_Name();

	/**
	 * Returns the meta object for the '{@link MoSaRT.FunctionalElements.SystemFunctionalSide#importUmlModel(org.eclipse.uml2.uml.Model) <em>Import Uml Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Import Uml Model</em>' operation.
	 * @see MoSaRT.FunctionalElements.SystemFunctionalSide#importUmlModel(org.eclipse.uml2.uml.Model)
	 * @generated
	 */
	EOperation getSystemFunctionalSide__ImportUmlModel__Model();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FunctionalElementsFactory getFunctionalElementsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link MoSaRT.FunctionalElements.impl.SystemFunctionalSideImpl <em>System Functional Side</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.FunctionalElements.impl.SystemFunctionalSideImpl
		 * @see MoSaRT.FunctionalElements.impl.FunctionalElementsPackageImpl#getSystemFunctionalSide()
		 * @generated
		 */
		EClass SYSTEM_FUNCTIONAL_SIDE = eINSTANCE.getSystemFunctionalSide();

		/**
		 * The meta object literal for the '<em><b>Uml Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_FUNCTIONAL_SIDE__UML_MODEL = eINSTANCE.getSystemFunctionalSide_UmlModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_FUNCTIONAL_SIDE__NAME = eINSTANCE.getSystemFunctionalSide_Name();

		/**
		 * The meta object literal for the '<em><b>Import Uml Model</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYSTEM_FUNCTIONAL_SIDE___IMPORT_UML_MODEL__MODEL = eINSTANCE.getSystemFunctionalSide__ImportUmlModel__Model();

	}

} //FunctionalElementsPackage
