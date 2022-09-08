/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.SoftwarePlatform.SoftwareOperators;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>So Communication Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoCommunicationResource#getWriterTasks <em>Writer Tasks</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoCommunicationResource#getReaderTasks <em>Reader Tasks</em>}</li>
 * </ul>
 *
 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoftwareOperatorsPackage#getSoCommunicationResource()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface SoCommunicationResource extends SoInteractionResource {
	/**
	 * Returns the value of the '<em><b>Writer Tasks</b></em>' reference list.
	 * The list contents are of type {@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoSchedulableTask}.
	 * It is bidirectional and its opposite is '{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoSchedulableTask#getCommWritingResources <em>Comm Writing Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Writer Tasks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Writer Tasks</em>' reference list.
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoftwareOperatorsPackage#getSoCommunicationResource_WriterTasks()
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoSchedulableTask#getCommWritingResources
	 * @model opposite="commWritingResources" required="true"
	 * @generated
	 */
	EList<SoSchedulableTask> getWriterTasks();

	/**
	 * Returns the value of the '<em><b>Reader Tasks</b></em>' reference list.
	 * The list contents are of type {@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoSchedulableTask}.
	 * It is bidirectional and its opposite is '{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoSchedulableTask#getCommReadingResources <em>Comm Reading Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reader Tasks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reader Tasks</em>' reference list.
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoftwareOperatorsPackage#getSoCommunicationResource_ReaderTasks()
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoSchedulableTask#getCommReadingResources
	 * @model opposite="commReadingResources" required="true"
	 * @generated
	 */
	EList<SoSchedulableTask> getReaderTasks();

} // SoCommunicationResource
