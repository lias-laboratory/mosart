/**
 */
package MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.impl;

import MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.PiecewiseLinearComputationFunction;
import MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.RtpComputationAndAnalysisFunctionsPackage;

import MoSaRT.RealTimeProperties.RtpMeasurementUnits.DataSizeUnits;
import MoSaRT.RealTimeProperties.RtpMeasurementUnits.TimeUnits;

import MoSaRT.RealTimeProperties.RtpUtilityTypes.RealInterval;
import MoSaRT.RealTimeProperties.RtpUtilityTypes.RealList;

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
 * An implementation of the model object '<em><b>Piecewise Linear Computation Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.impl.PiecewiseLinearComputationFunctionImpl#getFunctionType <em>Function Type</em>}</li>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.impl.PiecewiseLinearComputationFunctionImpl#getIntervals <em>Intervals</em>}</li>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.impl.PiecewiseLinearComputationFunctionImpl#getMultiplicationCoefficient <em>Multiplication Coefficient</em>}</li>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.impl.PiecewiseLinearComputationFunctionImpl#getXUnit <em>XUnit</em>}</li>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.impl.PiecewiseLinearComputationFunctionImpl#getYUnit <em>YUnit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PiecewiseLinearComputationFunctionImpl extends EObjectImpl implements PiecewiseLinearComputationFunction {
	/**
	 * The default value of the '{@link #getFunctionType() <em>Function Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionType()
	 * @generated
	 * @ordered
	 */
	protected static final String FUNCTION_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIntervals() <em>Intervals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntervals()
	 * @generated
	 * @ordered
	 */
	protected EList<RealInterval> intervals;

	/**
	 * The cached value of the '{@link #getMultiplicationCoefficient() <em>Multiplication Coefficient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicationCoefficient()
	 * @generated
	 * @ordered
	 */
	protected RealList multiplicationCoefficient;

	/**
	 * The default value of the '{@link #getXUnit() <em>XUnit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXUnit()
	 * @generated
	 * @ordered
	 */
	protected static final TimeUnits XUNIT_EDEFAULT = TimeUnits.US;

	/**
	 * The cached value of the '{@link #getXUnit() <em>XUnit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXUnit()
	 * @generated
	 * @ordered
	 */
	protected TimeUnits xUnit = XUNIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getYUnit() <em>YUnit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYUnit()
	 * @generated
	 * @ordered
	 */
	protected static final DataSizeUnits YUNIT_EDEFAULT = DataSizeUnits.BIT;

	/**
	 * The cached value of the '{@link #getYUnit() <em>YUnit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYUnit()
	 * @generated
	 * @ordered
	 */
	protected DataSizeUnits yUnit = YUNIT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PiecewiseLinearComputationFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RtpComputationAndAnalysisFunctionsPackage.Literals.PIECEWISE_LINEAR_COMPUTATION_FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFunctionType() {
		// TODO: implement this method to return the 'Function Type' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RealInterval> getIntervals() {
		if (intervals == null) {
			intervals = new EObjectContainmentEList<RealInterval>(RealInterval.class, this, RtpComputationAndAnalysisFunctionsPackage.PIECEWISE_LINEAR_COMPUTATION_FUNCTION__INTERVALS);
		}
		return intervals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealList getMultiplicationCoefficient() {
		if (multiplicationCoefficient != null && multiplicationCoefficient.eIsProxy()) {
			InternalEObject oldMultiplicationCoefficient = (InternalEObject)multiplicationCoefficient;
			multiplicationCoefficient = (RealList)eResolveProxy(oldMultiplicationCoefficient);
			if (multiplicationCoefficient != oldMultiplicationCoefficient) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RtpComputationAndAnalysisFunctionsPackage.PIECEWISE_LINEAR_COMPUTATION_FUNCTION__MULTIPLICATION_COEFFICIENT, oldMultiplicationCoefficient, multiplicationCoefficient));
			}
		}
		return multiplicationCoefficient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealList basicGetMultiplicationCoefficient() {
		return multiplicationCoefficient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiplicationCoefficient(RealList newMultiplicationCoefficient) {
		RealList oldMultiplicationCoefficient = multiplicationCoefficient;
		multiplicationCoefficient = newMultiplicationCoefficient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RtpComputationAndAnalysisFunctionsPackage.PIECEWISE_LINEAR_COMPUTATION_FUNCTION__MULTIPLICATION_COEFFICIENT, oldMultiplicationCoefficient, multiplicationCoefficient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeUnits getXUnit() {
		return xUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXUnit(TimeUnits newXUnit) {
		TimeUnits oldXUnit = xUnit;
		xUnit = newXUnit == null ? XUNIT_EDEFAULT : newXUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RtpComputationAndAnalysisFunctionsPackage.PIECEWISE_LINEAR_COMPUTATION_FUNCTION__XUNIT, oldXUnit, xUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSizeUnits getYUnit() {
		return yUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYUnit(DataSizeUnits newYUnit) {
		DataSizeUnits oldYUnit = yUnit;
		yUnit = newYUnit == null ? YUNIT_EDEFAULT : newYUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RtpComputationAndAnalysisFunctionsPackage.PIECEWISE_LINEAR_COMPUTATION_FUNCTION__YUNIT, oldYUnit, yUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RtpComputationAndAnalysisFunctionsPackage.PIECEWISE_LINEAR_COMPUTATION_FUNCTION__INTERVALS:
				return ((InternalEList<?>)getIntervals()).basicRemove(otherEnd, msgs);
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
			case RtpComputationAndAnalysisFunctionsPackage.PIECEWISE_LINEAR_COMPUTATION_FUNCTION__FUNCTION_TYPE:
				return getFunctionType();
			case RtpComputationAndAnalysisFunctionsPackage.PIECEWISE_LINEAR_COMPUTATION_FUNCTION__INTERVALS:
				return getIntervals();
			case RtpComputationAndAnalysisFunctionsPackage.PIECEWISE_LINEAR_COMPUTATION_FUNCTION__MULTIPLICATION_COEFFICIENT:
				if (resolve) return getMultiplicationCoefficient();
				return basicGetMultiplicationCoefficient();
			case RtpComputationAndAnalysisFunctionsPackage.PIECEWISE_LINEAR_COMPUTATION_FUNCTION__XUNIT:
				return getXUnit();
			case RtpComputationAndAnalysisFunctionsPackage.PIECEWISE_LINEAR_COMPUTATION_FUNCTION__YUNIT:
				return getYUnit();
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
			case RtpComputationAndAnalysisFunctionsPackage.PIECEWISE_LINEAR_COMPUTATION_FUNCTION__INTERVALS:
				getIntervals().clear();
				getIntervals().addAll((Collection<? extends RealInterval>)newValue);
				return;
			case RtpComputationAndAnalysisFunctionsPackage.PIECEWISE_LINEAR_COMPUTATION_FUNCTION__MULTIPLICATION_COEFFICIENT:
				setMultiplicationCoefficient((RealList)newValue);
				return;
			case RtpComputationAndAnalysisFunctionsPackage.PIECEWISE_LINEAR_COMPUTATION_FUNCTION__XUNIT:
				setXUnit((TimeUnits)newValue);
				return;
			case RtpComputationAndAnalysisFunctionsPackage.PIECEWISE_LINEAR_COMPUTATION_FUNCTION__YUNIT:
				setYUnit((DataSizeUnits)newValue);
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
			case RtpComputationAndAnalysisFunctionsPackage.PIECEWISE_LINEAR_COMPUTATION_FUNCTION__INTERVALS:
				getIntervals().clear();
				return;
			case RtpComputationAndAnalysisFunctionsPackage.PIECEWISE_LINEAR_COMPUTATION_FUNCTION__MULTIPLICATION_COEFFICIENT:
				setMultiplicationCoefficient((RealList)null);
				return;
			case RtpComputationAndAnalysisFunctionsPackage.PIECEWISE_LINEAR_COMPUTATION_FUNCTION__XUNIT:
				setXUnit(XUNIT_EDEFAULT);
				return;
			case RtpComputationAndAnalysisFunctionsPackage.PIECEWISE_LINEAR_COMPUTATION_FUNCTION__YUNIT:
				setYUnit(YUNIT_EDEFAULT);
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
			case RtpComputationAndAnalysisFunctionsPackage.PIECEWISE_LINEAR_COMPUTATION_FUNCTION__FUNCTION_TYPE:
				return FUNCTION_TYPE_EDEFAULT == null ? getFunctionType() != null : !FUNCTION_TYPE_EDEFAULT.equals(getFunctionType());
			case RtpComputationAndAnalysisFunctionsPackage.PIECEWISE_LINEAR_COMPUTATION_FUNCTION__INTERVALS:
				return intervals != null && !intervals.isEmpty();
			case RtpComputationAndAnalysisFunctionsPackage.PIECEWISE_LINEAR_COMPUTATION_FUNCTION__MULTIPLICATION_COEFFICIENT:
				return multiplicationCoefficient != null;
			case RtpComputationAndAnalysisFunctionsPackage.PIECEWISE_LINEAR_COMPUTATION_FUNCTION__XUNIT:
				return xUnit != XUNIT_EDEFAULT;
			case RtpComputationAndAnalysisFunctionsPackage.PIECEWISE_LINEAR_COMPUTATION_FUNCTION__YUNIT:
				return yUnit != YUNIT_EDEFAULT;
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
		result.append(" (XUnit: ");
		result.append(xUnit);
		result.append(", YUnit: ");
		result.append(yUnit);
		result.append(')');
		return result.toString();
	}

} //PiecewiseLinearComputationFunctionImpl
