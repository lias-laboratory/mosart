/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.RealTimeProperties;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see MoSaRT.RealTimeProperties.RealTimePropertiesFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface RealTimePropertiesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "RealTimeProperties";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.ensma.fr/MoSaRT/RealTimeProperties";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "RTP";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RealTimePropertiesPackage eINSTANCE = MoSaRT.RealTimeProperties.impl.RealTimePropertiesPackageImpl.init();

	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RealTimeCommonType <em>Real Time Common Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RealTimeCommonType
	 * @see MoSaRT.RealTimeProperties.impl.RealTimePropertiesPackageImpl#getRealTimeCommonType()
	 * @generated
	 */
	int REAL_TIME_COMMON_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Real Time Common Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_TIME_COMMON_TYPE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Real Time Common Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_TIME_COMMON_TYPE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link MoSaRT.RealTimeProperties.RealTimeCommonType <em>Real Time Common Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Real Time Common Type</em>'.
	 * @see MoSaRT.RealTimeProperties.RealTimeCommonType
	 * @generated
	 */
	EClass getRealTimeCommonType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RealTimePropertiesFactory getRealTimePropertiesFactory();

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
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RealTimeCommonType <em>Real Time Common Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RealTimeCommonType
		 * @see MoSaRT.RealTimeProperties.impl.RealTimePropertiesPackageImpl#getRealTimeCommonType()
		 * @generated
		 */
		EClass REAL_TIME_COMMON_TYPE = eINSTANCE.getRealTimeCommonType();

	}

} //RealTimePropertiesPackage
