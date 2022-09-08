/**
 */
package MoSaRT.HardwarePlatform.impl;

import MoSaRT.HardwarePlatform.HardwarePlatformPackage;
import MoSaRT.HardwarePlatform.HpFlowCarrier;
import MoSaRT.HardwarePlatform.HpNetworkNode;
import MoSaRT.HardwarePlatform.HpProcessingUnit;

import MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.PiecewiseLinearAnalysisFunction;
import MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.PiecewiseLinearComputationFunction;

import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpCommunicationArbitrationPolicyType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hp Flow Carrier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.HardwarePlatform.impl.HpFlowCarrierImpl#getName <em>Name</em>}</li>
 *   <li>{@link MoSaRT.HardwarePlatform.impl.HpFlowCarrierImpl#getHpNetworkNodeTargets <em>Hp Network Node Targets</em>}</li>
 *   <li>{@link MoSaRT.HardwarePlatform.impl.HpFlowCarrierImpl#getServiceCurveFunction <em>Service Curve Function</em>}</li>
 *   <li>{@link MoSaRT.HardwarePlatform.impl.HpFlowCarrierImpl#getTrafficShaperFunction <em>Traffic Shaper Function</em>}</li>
 *   <li>{@link MoSaRT.HardwarePlatform.impl.HpFlowCarrierImpl#getProcessingUnitOrigin <em>Processing Unit Origin</em>}</li>
 *   <li>{@link MoSaRT.HardwarePlatform.impl.HpFlowCarrierImpl#getRtpCommunicationArbitrationPolicy <em>Rtp Communication Arbitration Policy</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HpFlowCarrierImpl extends EObjectImpl implements HpFlowCarrier {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHpNetworkNodeTargets() <em>Hp Network Node Targets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHpNetworkNodeTargets()
	 * @generated
	 * @ordered
	 */
	protected EList<HpNetworkNode> hpNetworkNodeTargets;

	/**
	 * The cached value of the '{@link #getServiceCurveFunction() <em>Service Curve Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceCurveFunction()
	 * @generated
	 * @ordered
	 */
	protected PiecewiseLinearAnalysisFunction serviceCurveFunction;

	/**
	 * The cached value of the '{@link #getTrafficShaperFunction() <em>Traffic Shaper Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrafficShaperFunction()
	 * @generated
	 * @ordered
	 */
	protected PiecewiseLinearAnalysisFunction trafficShaperFunction;

	/**
	 * The cached value of the '{@link #getProcessingUnitOrigin() <em>Processing Unit Origin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessingUnitOrigin()
	 * @generated
	 * @ordered
	 */
	protected HpProcessingUnit processingUnitOrigin;

	/**
	 * The cached value of the '{@link #getRtpCommunicationArbitrationPolicy() <em>Rtp Communication Arbitration Policy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRtpCommunicationArbitrationPolicy()
	 * @generated
	 * @ordered
	 */
	protected RtpCommunicationArbitrationPolicyType rtpCommunicationArbitrationPolicy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HpFlowCarrierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HardwarePlatformPackage.Literals.HP_FLOW_CARRIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HardwarePlatformPackage.HP_FLOW_CARRIER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HpNetworkNode> getHpNetworkNodeTargets() {
		if (hpNetworkNodeTargets == null) {
			hpNetworkNodeTargets = new EObjectResolvingEList<HpNetworkNode>(HpNetworkNode.class, this, HardwarePlatformPackage.HP_FLOW_CARRIER__HP_NETWORK_NODE_TARGETS);
		}
		return hpNetworkNodeTargets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PiecewiseLinearAnalysisFunction getServiceCurveFunction() {
		return serviceCurveFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceCurveFunction(PiecewiseLinearAnalysisFunction newServiceCurveFunction, NotificationChain msgs) {
		PiecewiseLinearAnalysisFunction oldServiceCurveFunction = serviceCurveFunction;
		serviceCurveFunction = newServiceCurveFunction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HardwarePlatformPackage.HP_FLOW_CARRIER__SERVICE_CURVE_FUNCTION, oldServiceCurveFunction, newServiceCurveFunction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceCurveFunction(PiecewiseLinearAnalysisFunction newServiceCurveFunction) {
		if (newServiceCurveFunction != serviceCurveFunction) {
			NotificationChain msgs = null;
			if (serviceCurveFunction != null)
				msgs = ((InternalEObject)serviceCurveFunction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HardwarePlatformPackage.HP_FLOW_CARRIER__SERVICE_CURVE_FUNCTION, null, msgs);
			if (newServiceCurveFunction != null)
				msgs = ((InternalEObject)newServiceCurveFunction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HardwarePlatformPackage.HP_FLOW_CARRIER__SERVICE_CURVE_FUNCTION, null, msgs);
			msgs = basicSetServiceCurveFunction(newServiceCurveFunction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HardwarePlatformPackage.HP_FLOW_CARRIER__SERVICE_CURVE_FUNCTION, newServiceCurveFunction, newServiceCurveFunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PiecewiseLinearAnalysisFunction getTrafficShaperFunction() {
		return trafficShaperFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrafficShaperFunction(PiecewiseLinearAnalysisFunction newTrafficShaperFunction, NotificationChain msgs) {
		PiecewiseLinearAnalysisFunction oldTrafficShaperFunction = trafficShaperFunction;
		trafficShaperFunction = newTrafficShaperFunction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HardwarePlatformPackage.HP_FLOW_CARRIER__TRAFFIC_SHAPER_FUNCTION, oldTrafficShaperFunction, newTrafficShaperFunction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrafficShaperFunction(PiecewiseLinearAnalysisFunction newTrafficShaperFunction) {
		if (newTrafficShaperFunction != trafficShaperFunction) {
			NotificationChain msgs = null;
			if (trafficShaperFunction != null)
				msgs = ((InternalEObject)trafficShaperFunction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HardwarePlatformPackage.HP_FLOW_CARRIER__TRAFFIC_SHAPER_FUNCTION, null, msgs);
			if (newTrafficShaperFunction != null)
				msgs = ((InternalEObject)newTrafficShaperFunction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HardwarePlatformPackage.HP_FLOW_CARRIER__TRAFFIC_SHAPER_FUNCTION, null, msgs);
			msgs = basicSetTrafficShaperFunction(newTrafficShaperFunction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HardwarePlatformPackage.HP_FLOW_CARRIER__TRAFFIC_SHAPER_FUNCTION, newTrafficShaperFunction, newTrafficShaperFunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HpProcessingUnit getProcessingUnitOrigin() {
		if (processingUnitOrigin != null && processingUnitOrigin.eIsProxy()) {
			InternalEObject oldProcessingUnitOrigin = (InternalEObject)processingUnitOrigin;
			processingUnitOrigin = (HpProcessingUnit)eResolveProxy(oldProcessingUnitOrigin);
			if (processingUnitOrigin != oldProcessingUnitOrigin) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HardwarePlatformPackage.HP_FLOW_CARRIER__PROCESSING_UNIT_ORIGIN, oldProcessingUnitOrigin, processingUnitOrigin));
			}
		}
		return processingUnitOrigin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HpProcessingUnit basicGetProcessingUnitOrigin() {
		return processingUnitOrigin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessingUnitOrigin(HpProcessingUnit newProcessingUnitOrigin) {
		HpProcessingUnit oldProcessingUnitOrigin = processingUnitOrigin;
		processingUnitOrigin = newProcessingUnitOrigin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HardwarePlatformPackage.HP_FLOW_CARRIER__PROCESSING_UNIT_ORIGIN, oldProcessingUnitOrigin, processingUnitOrigin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpCommunicationArbitrationPolicyType getRtpCommunicationArbitrationPolicy() {
		return rtpCommunicationArbitrationPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRtpCommunicationArbitrationPolicy(RtpCommunicationArbitrationPolicyType newRtpCommunicationArbitrationPolicy, NotificationChain msgs) {
		RtpCommunicationArbitrationPolicyType oldRtpCommunicationArbitrationPolicy = rtpCommunicationArbitrationPolicy;
		rtpCommunicationArbitrationPolicy = newRtpCommunicationArbitrationPolicy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HardwarePlatformPackage.HP_FLOW_CARRIER__RTP_COMMUNICATION_ARBITRATION_POLICY, oldRtpCommunicationArbitrationPolicy, newRtpCommunicationArbitrationPolicy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRtpCommunicationArbitrationPolicy(RtpCommunicationArbitrationPolicyType newRtpCommunicationArbitrationPolicy) {
		if (newRtpCommunicationArbitrationPolicy != rtpCommunicationArbitrationPolicy) {
			NotificationChain msgs = null;
			if (rtpCommunicationArbitrationPolicy != null)
				msgs = ((InternalEObject)rtpCommunicationArbitrationPolicy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HardwarePlatformPackage.HP_FLOW_CARRIER__RTP_COMMUNICATION_ARBITRATION_POLICY, null, msgs);
			if (newRtpCommunicationArbitrationPolicy != null)
				msgs = ((InternalEObject)newRtpCommunicationArbitrationPolicy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HardwarePlatformPackage.HP_FLOW_CARRIER__RTP_COMMUNICATION_ARBITRATION_POLICY, null, msgs);
			msgs = basicSetRtpCommunicationArbitrationPolicy(newRtpCommunicationArbitrationPolicy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HardwarePlatformPackage.HP_FLOW_CARRIER__RTP_COMMUNICATION_ARBITRATION_POLICY, newRtpCommunicationArbitrationPolicy, newRtpCommunicationArbitrationPolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HardwarePlatformPackage.HP_FLOW_CARRIER__SERVICE_CURVE_FUNCTION:
				return basicSetServiceCurveFunction(null, msgs);
			case HardwarePlatformPackage.HP_FLOW_CARRIER__TRAFFIC_SHAPER_FUNCTION:
				return basicSetTrafficShaperFunction(null, msgs);
			case HardwarePlatformPackage.HP_FLOW_CARRIER__RTP_COMMUNICATION_ARBITRATION_POLICY:
				return basicSetRtpCommunicationArbitrationPolicy(null, msgs);
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
			case HardwarePlatformPackage.HP_FLOW_CARRIER__NAME:
				return getName();
			case HardwarePlatformPackage.HP_FLOW_CARRIER__HP_NETWORK_NODE_TARGETS:
				return getHpNetworkNodeTargets();
			case HardwarePlatformPackage.HP_FLOW_CARRIER__SERVICE_CURVE_FUNCTION:
				return getServiceCurveFunction();
			case HardwarePlatformPackage.HP_FLOW_CARRIER__TRAFFIC_SHAPER_FUNCTION:
				return getTrafficShaperFunction();
			case HardwarePlatformPackage.HP_FLOW_CARRIER__PROCESSING_UNIT_ORIGIN:
				if (resolve) return getProcessingUnitOrigin();
				return basicGetProcessingUnitOrigin();
			case HardwarePlatformPackage.HP_FLOW_CARRIER__RTP_COMMUNICATION_ARBITRATION_POLICY:
				return getRtpCommunicationArbitrationPolicy();
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
			case HardwarePlatformPackage.HP_FLOW_CARRIER__NAME:
				setName((String)newValue);
				return;
			case HardwarePlatformPackage.HP_FLOW_CARRIER__HP_NETWORK_NODE_TARGETS:
				getHpNetworkNodeTargets().clear();
				getHpNetworkNodeTargets().addAll((Collection<? extends HpNetworkNode>)newValue);
				return;
			case HardwarePlatformPackage.HP_FLOW_CARRIER__SERVICE_CURVE_FUNCTION:
				setServiceCurveFunction((PiecewiseLinearAnalysisFunction)newValue);
				return;
			case HardwarePlatformPackage.HP_FLOW_CARRIER__TRAFFIC_SHAPER_FUNCTION:
				setTrafficShaperFunction((PiecewiseLinearAnalysisFunction)newValue);
				return;
			case HardwarePlatformPackage.HP_FLOW_CARRIER__PROCESSING_UNIT_ORIGIN:
				setProcessingUnitOrigin((HpProcessingUnit)newValue);
				return;
			case HardwarePlatformPackage.HP_FLOW_CARRIER__RTP_COMMUNICATION_ARBITRATION_POLICY:
				setRtpCommunicationArbitrationPolicy((RtpCommunicationArbitrationPolicyType)newValue);
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
			case HardwarePlatformPackage.HP_FLOW_CARRIER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case HardwarePlatformPackage.HP_FLOW_CARRIER__HP_NETWORK_NODE_TARGETS:
				getHpNetworkNodeTargets().clear();
				return;
			case HardwarePlatformPackage.HP_FLOW_CARRIER__SERVICE_CURVE_FUNCTION:
				setServiceCurveFunction((PiecewiseLinearAnalysisFunction)null);
				return;
			case HardwarePlatformPackage.HP_FLOW_CARRIER__TRAFFIC_SHAPER_FUNCTION:
				setTrafficShaperFunction((PiecewiseLinearAnalysisFunction)null);
				return;
			case HardwarePlatformPackage.HP_FLOW_CARRIER__PROCESSING_UNIT_ORIGIN:
				setProcessingUnitOrigin((HpProcessingUnit)null);
				return;
			case HardwarePlatformPackage.HP_FLOW_CARRIER__RTP_COMMUNICATION_ARBITRATION_POLICY:
				setRtpCommunicationArbitrationPolicy((RtpCommunicationArbitrationPolicyType)null);
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
			case HardwarePlatformPackage.HP_FLOW_CARRIER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case HardwarePlatformPackage.HP_FLOW_CARRIER__HP_NETWORK_NODE_TARGETS:
				return hpNetworkNodeTargets != null && !hpNetworkNodeTargets.isEmpty();
			case HardwarePlatformPackage.HP_FLOW_CARRIER__SERVICE_CURVE_FUNCTION:
				return serviceCurveFunction != null;
			case HardwarePlatformPackage.HP_FLOW_CARRIER__TRAFFIC_SHAPER_FUNCTION:
				return trafficShaperFunction != null;
			case HardwarePlatformPackage.HP_FLOW_CARRIER__PROCESSING_UNIT_ORIGIN:
				return processingUnitOrigin != null;
			case HardwarePlatformPackage.HP_FLOW_CARRIER__RTP_COMMUNICATION_ARBITRATION_POLICY:
				return rtpCommunicationArbitrationPolicy != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //HpFlowCarrierImpl
