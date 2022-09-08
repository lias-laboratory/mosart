/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.RealTimeProperties.RtpUtilityTypes.impl;

import MoSaRT.RealTimeProperties.RtpUtilityTypes.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class RtpUtilityTypesFactoryImpl extends EFactoryImpl implements RtpUtilityTypesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RtpUtilityTypesFactory init() {
		try {
			RtpUtilityTypesFactory theRtpUtilityTypesFactory = (RtpUtilityTypesFactory)EPackage.Registry.INSTANCE.getEFactory(RtpUtilityTypesPackage.eNS_URI);
			if (theRtpUtilityTypesFactory != null) {
				return theRtpUtilityTypesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RtpUtilityTypesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpUtilityTypesFactoryImpl() {
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
			case RtpUtilityTypesPackage.INTEGER_MATRIX: return createIntegerMatrix();
			case RtpUtilityTypesPackage.INTEGER_VECTOR: return createIntegerVector();
			case RtpUtilityTypesPackage.REAL_VECTOR: return createRealVector();
			case RtpUtilityTypesPackage.REAL_MATRIX: return createRealMatrix();
			case RtpUtilityTypesPackage.INTEGER_SET: return createIntegerSet();
			case RtpUtilityTypesPackage.INTEGER_LIST: return createIntegerList();
			case RtpUtilityTypesPackage.REAL_SET: return createRealSet();
			case RtpUtilityTypesPackage.REAL_LIST: return createRealList();
			case RtpUtilityTypesPackage.INTEGER_INTERVAL: return createIntegerInterval();
			case RtpUtilityTypesPackage.REAL_INTERVAL: return createRealInterval();
			case RtpUtilityTypesPackage.MEASURED_REAL: return createMeasuredReal();
			case RtpUtilityTypesPackage.UNKNOWN_REAL: return createUnknownReal();
			case RtpUtilityTypesPackage.SIMPLE_REAL: return createSimpleReal();
			case RtpUtilityTypesPackage.MAX_MIN_AVG_REAL: return createMaxMinAvgReal();
			case RtpUtilityTypesPackage.MEASURED_INTEGER: return createMeasuredInteger();
			case RtpUtilityTypesPackage.UNKNOWN_INTEGER: return createUnknownInteger();
			case RtpUtilityTypesPackage.SIMPLE_INTEGER: return createSimpleInteger();
			case RtpUtilityTypesPackage.MAX_MIN_AVG_INTEGER: return createMaxMinAvgInteger();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case RtpUtilityTypesPackage.DELIMITER_TYPE:
				return createDelimiterTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case RtpUtilityTypesPackage.DELIMITER_TYPE:
				return convertDelimiterTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerMatrix createIntegerMatrix() {
		IntegerMatrixImpl integerMatrix = new IntegerMatrixImpl();
		return integerMatrix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerVector createIntegerVector() {
		IntegerVectorImpl integerVector = new IntegerVectorImpl();
		return integerVector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealVector createRealVector() {
		RealVectorImpl realVector = new RealVectorImpl();
		return realVector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealMatrix createRealMatrix() {
		RealMatrixImpl realMatrix = new RealMatrixImpl();
		return realMatrix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerSet createIntegerSet() {
		IntegerSetImpl integerSet = new IntegerSetImpl();
		return integerSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerList createIntegerList() {
		IntegerListImpl integerList = new IntegerListImpl();
		return integerList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealSet createRealSet() {
		RealSetImpl realSet = new RealSetImpl();
		return realSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealList createRealList() {
		RealListImpl realList = new RealListImpl();
		return realList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerInterval createIntegerInterval() {
		IntegerIntervalImpl integerInterval = new IntegerIntervalImpl();
		return integerInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealInterval createRealInterval() {
		RealIntervalImpl realInterval = new RealIntervalImpl();
		return realInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasuredReal createMeasuredReal() {
		MeasuredRealImpl measuredReal = new MeasuredRealImpl();
		return measuredReal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnknownReal createUnknownReal() {
		UnknownRealImpl unknownReal = new UnknownRealImpl();
		return unknownReal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleReal createSimpleReal() {
		SimpleRealImpl simpleReal = new SimpleRealImpl();
		return simpleReal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaxMinAvgReal createMaxMinAvgReal() {
		MaxMinAvgRealImpl maxMinAvgReal = new MaxMinAvgRealImpl();
		return maxMinAvgReal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasuredInteger createMeasuredInteger() {
		MeasuredIntegerImpl measuredInteger = new MeasuredIntegerImpl();
		return measuredInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnknownInteger createUnknownInteger() {
		UnknownIntegerImpl unknownInteger = new UnknownIntegerImpl();
		return unknownInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleInteger createSimpleInteger() {
		SimpleIntegerImpl simpleInteger = new SimpleIntegerImpl();
		return simpleInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaxMinAvgInteger createMaxMinAvgInteger() {
		MaxMinAvgIntegerImpl maxMinAvgInteger = new MaxMinAvgIntegerImpl();
		return maxMinAvgInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DelimiterType createDelimiterTypeFromString(EDataType eDataType, String initialValue) {
		DelimiterType result = DelimiterType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDelimiterTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpUtilityTypesPackage getRtpUtilityTypesPackage() {
		return (RtpUtilityTypesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RtpUtilityTypesPackage getPackage() {
		return RtpUtilityTypesPackage.eINSTANCE;
	}

} //RtpUtilityTypesFactoryImpl
