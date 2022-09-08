/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see MoSaRT.MoSaRTFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface MoSaRTPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "MoSaRT";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.ensma.fr/MoSaRT";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "MoSaRT";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MoSaRTPackage eINSTANCE = MoSaRT.impl.MoSaRTPackageImpl.init();

	/**
	 * The meta object id for the '{@link MoSaRT.impl.GlobalSystemImpl <em>Global System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.impl.GlobalSystemImpl
	 * @see MoSaRT.impl.MoSaRTPackageImpl#getGlobalSystem()
	 * @generated
	 */
	int GLOBAL_SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_SYSTEM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Software Side</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_SYSTEM__SOFTWARE_SIDE = 1;

	/**
	 * The feature id for the '<em><b>Hardware Side</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_SYSTEM__HARDWARE_SIDE = 2;

	/**
	 * The feature id for the '<em><b>Functional Side</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_SYSTEM__FUNCTIONAL_SIDE = 3;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_SYSTEM__COMMENT = 4;

	/**
	 * The feature id for the '<em><b>Analysis Repository Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_SYSTEM__ANALYSIS_REPOSITORY_LOCATION = 5;

	/**
	 * The number of structural features of the '<em>Global System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_SYSTEM_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Global System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_SYSTEM_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link MoSaRT.GlobalSystem <em>Global System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Global System</em>'.
	 * @see MoSaRT.GlobalSystem
	 * @generated
	 */
	EClass getGlobalSystem();

	/**
	 * Returns the meta object for the containment reference '{@link MoSaRT.GlobalSystem#getSoftwareSide <em>Software Side</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Software Side</em>'.
	 * @see MoSaRT.GlobalSystem#getSoftwareSide()
	 * @see #getGlobalSystem()
	 * @generated
	 */
	EReference getGlobalSystem_SoftwareSide();

	/**
	 * Returns the meta object for the containment reference '{@link MoSaRT.GlobalSystem#getHardwareSide <em>Hardware Side</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hardware Side</em>'.
	 * @see MoSaRT.GlobalSystem#getHardwareSide()
	 * @see #getGlobalSystem()
	 * @generated
	 */
	EReference getGlobalSystem_HardwareSide();

	/**
	 * Returns the meta object for the containment reference '{@link MoSaRT.GlobalSystem#getFunctionalSide <em>Functional Side</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Functional Side</em>'.
	 * @see MoSaRT.GlobalSystem#getFunctionalSide()
	 * @see #getGlobalSystem()
	 * @generated
	 */
	EReference getGlobalSystem_FunctionalSide();

	/**
	 * Returns the meta object for the attribute '{@link MoSaRT.GlobalSystem#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see MoSaRT.GlobalSystem#getName()
	 * @see #getGlobalSystem()
	 * @generated
	 */
	EAttribute getGlobalSystem_Name();

	/**
	 * Returns the meta object for the attribute '{@link MoSaRT.GlobalSystem#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see MoSaRT.GlobalSystem#getComment()
	 * @see #getGlobalSystem()
	 * @generated
	 */
	EAttribute getGlobalSystem_Comment();

	/**
	 * Returns the meta object for the attribute '{@link MoSaRT.GlobalSystem#getAnalysisRepositoryLocation <em>Analysis Repository Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Analysis Repository Location</em>'.
	 * @see MoSaRT.GlobalSystem#getAnalysisRepositoryLocation()
	 * @see #getGlobalSystem()
	 * @generated
	 */
	EAttribute getGlobalSystem_AnalysisRepositoryLocation();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MoSaRTFactory getMoSaRTFactory();

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
		 * The meta object literal for the '{@link MoSaRT.impl.GlobalSystemImpl <em>Global System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.impl.GlobalSystemImpl
		 * @see MoSaRT.impl.MoSaRTPackageImpl#getGlobalSystem()
		 * @generated
		 */
		EClass GLOBAL_SYSTEM = eINSTANCE.getGlobalSystem();

		/**
		 * The meta object literal for the '<em><b>Software Side</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOBAL_SYSTEM__SOFTWARE_SIDE = eINSTANCE.getGlobalSystem_SoftwareSide();

		/**
		 * The meta object literal for the '<em><b>Hardware Side</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOBAL_SYSTEM__HARDWARE_SIDE = eINSTANCE.getGlobalSystem_HardwareSide();

		/**
		 * The meta object literal for the '<em><b>Functional Side</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOBAL_SYSTEM__FUNCTIONAL_SIDE = eINSTANCE.getGlobalSystem_FunctionalSide();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBAL_SYSTEM__NAME = eINSTANCE.getGlobalSystem_Name();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBAL_SYSTEM__COMMENT = eINSTANCE.getGlobalSystem_Comment();

		/**
		 * The meta object literal for the '<em><b>Analysis Repository Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBAL_SYSTEM__ANALYSIS_REPOSITORY_LOCATION = eINSTANCE.getGlobalSystem_AnalysisRepositoryLocation();

	}

} //MoSaRTPackage
