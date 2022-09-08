/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.HardwarePlatform;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hp Communication Router</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.HardwarePlatform.HpCommunicationRouter#getNetworkPorts <em>Network Ports</em>}</li>
 *   <li>{@link MoSaRT.HardwarePlatform.HpCommunicationRouter#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see MoSaRT.HardwarePlatform.HardwarePlatformPackage#getHpCommunicationRouter()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='HpCommunicationRouterRule1'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot HpCommunicationRouterRule1='self.networkPorts->forAll(np1,np2 | np1 <> np2 implies np1.commChannel <> np2.commChannel)'"
 * @generated
 */
public interface HpCommunicationRouter extends EObject {
	/**
	 * Returns the value of the '<em><b>Network Ports</b></em>' containment reference list.
	 * The list contents are of type {@link MoSaRT.HardwarePlatform.HpNetworkPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Network Ports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network Ports</em>' containment reference list.
	 * @see MoSaRT.HardwarePlatform.HardwarePlatformPackage#getHpCommunicationRouter_NetworkPorts()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<HpNetworkPort> getNetworkPorts();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see MoSaRT.HardwarePlatform.HardwarePlatformPackage#getHpCommunicationRouter_Name()
	 * @model default="" id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link MoSaRT.HardwarePlatform.HpCommunicationRouter#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // HpCommunicationRouter
