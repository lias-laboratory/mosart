/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.RealTimeProperties.RtpTypes;

import MoSaRT.SoftwarePlatform.SoftwareBehavior.SbStep;
import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rtp Cooperative Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpTypes.RtpCooperativeType#getNonPreemptibleSteps <em>Non Preemptible Steps</em>}</li>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpTypes.RtpCooperativeType#getNonPreemptibleIntervals <em>Non Preemptible Intervals</em>}</li>
 * </ul>
 *
 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpTypesPackage#getRtpCooperativeType()
 * @model
 * @generated
 */
public interface RtpCooperativeType extends RtpPreemptibilityType {

	/**
	 * Returns the value of the '<em><b>Non Preemptible Steps</b></em>' reference list.
	 * The list contents are of type {@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbStep}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Non Preemptible Steps</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Non Preemptible Steps</em>' reference list.
	 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpTypesPackage#getRtpCooperativeType_NonPreemptibleSteps()
	 * @model
	 * @generated
	 */
	EList<SbStep> getNonPreemptibleSteps();

	/**
	 * Returns the value of the '<em><b>Non Preemptible Intervals</b></em>' containment reference list.
	 * The list contents are of type {@link MoSaRT.RealTimeProperties.RtpTypes.RtpExecutionTimeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Non Preemptible Intervals</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Non Preemptible Intervals</em>' containment reference list.
	 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpTypesPackage#getRtpCooperativeType_NonPreemptibleIntervals()
	 * @model containment="true"
	 * @generated
	 */
	EList<RtpExecutionTimeType> getNonPreemptibleIntervals();
} // RtpCooperativeType
