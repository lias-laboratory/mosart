/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.SoftwarePlatform.SoftwareOperators;

import MoSaRT.RealTimeProperties.RtpHelperTypes.RtpDataSizeType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>So Transmitted Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoTransmittedData#getSourceTask <em>Source Task</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoTransmittedData#getTargetTasks <em>Target Tasks</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoTransmittedData#getName <em>Name</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoTransmittedData#getDataSize <em>Data Size</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoTransmittedData#getRtpDataSize <em>Rtp Data Size</em>}</li>
 * </ul>
 *
 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoftwareOperatorsPackage#getSoTransmittedData()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='SoTransmittedDataRule1 SoTransmittedDataRule2 SoTransmittedDataRule3 SoTransmittedDataRule4'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot SoTransmittedDataRule1='self.targetTasks->excludes(self.sourceTask)' SoTransmittedDataRule2='SoRemoteCommResource.allInstances()->forAll( rsc | rsc.transmittedData->includes(self) implies  rsc.oclAsType(SoCommunicationResource).readerTasks -> includesAll(self.targetTasks))' SoTransmittedDataRule3='SoRemoteCommResource.allInstances()->forAll( rsc | rsc.transmittedData->includes(self) implies  rsc.oclAsType(SoCommunicationResource).writerTasks -> includes(self.sourceTask))' SoTransmittedDataRule4='self.targetTasks->forAll( t : SoSchedulableTask | t.process->notEmpty() implies t.process <> self.sourceTask.process)'"
 * @generated
 */
public interface SoTransmittedData extends EObject {
	/**
	 * Returns the value of the '<em><b>Source Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Task</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Task</em>' reference.
	 * @see #setSourceTask(SoSchedulableTask)
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoftwareOperatorsPackage#getSoTransmittedData_SourceTask()
	 * @model required="true"
	 * @generated
	 */
	SoSchedulableTask getSourceTask();

	/**
	 * Sets the value of the '{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoTransmittedData#getSourceTask <em>Source Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Task</em>' reference.
	 * @see #getSourceTask()
	 * @generated
	 */
	void setSourceTask(SoSchedulableTask value);

	/**
	 * Returns the value of the '<em><b>Target Tasks</b></em>' reference list.
	 * The list contents are of type {@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoSchedulableTask}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Tasks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Tasks</em>' reference list.
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoftwareOperatorsPackage#getSoTransmittedData_TargetTasks()
	 * @model required="true"
	 * @generated
	 */
	EList<SoSchedulableTask> getTargetTasks();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoftwareOperatorsPackage#getSoTransmittedData_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoTransmittedData#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Data Size</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Size</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Size</em>' reference.
	 * @see #setDataSize(RtpDataSizeType)
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoftwareOperatorsPackage#getSoTransmittedData_DataSize()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='self.rtpDataSize'"
	 * @generated
	 */
	RtpDataSizeType getDataSize();

	/**
	 * Sets the value of the '{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoTransmittedData#getDataSize <em>Data Size</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Size</em>' reference.
	 * @see #getDataSize()
	 * @generated
	 */
	void setDataSize(RtpDataSizeType value);

	/**
	 * Returns the value of the '<em><b>Rtp Data Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rtp Data Size</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rtp Data Size</em>' containment reference.
	 * @see #setRtpDataSize(RtpDataSizeType)
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoftwareOperatorsPackage#getSoTransmittedData_RtpDataSize()
	 * @model containment="true"
	 * @generated
	 */
	RtpDataSizeType getRtpDataSize();

	/**
	 * Sets the value of the '{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoTransmittedData#getRtpDataSize <em>Rtp Data Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rtp Data Size</em>' containment reference.
	 * @see #getRtpDataSize()
	 * @generated
	 */
	void setRtpDataSize(RtpDataSizeType value);

} // SoTransmittedData
