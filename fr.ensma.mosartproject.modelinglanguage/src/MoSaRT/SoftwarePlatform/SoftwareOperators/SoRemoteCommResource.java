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
 * A representation of the model object '<em><b>So Remote Comm Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoRemoteCommResource#getName <em>Name</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoRemoteCommResource#getTransmittedData <em>Transmitted Data</em>}</li>
 * </ul>
 *
 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoftwareOperatorsPackage#getSoRemoteCommResource()
 * @model
 * @generated
 */
public interface SoRemoteCommResource extends SoCommunicationResource {
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
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoftwareOperatorsPackage#getSoRemoteCommResource_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoRemoteCommResource#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Transmitted Data</b></em>' containment reference list.
	 * The list contents are of type {@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoTransmittedData}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transmitted Data</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transmitted Data</em>' containment reference list.
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoftwareOperatorsPackage#getSoRemoteCommResource_TransmittedData()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<SoTransmittedData> getTransmittedData();

} // SoRemoteCommResource
