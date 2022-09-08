/**
 */
package MoSaRT.HardwarePlatform;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hp Communnication Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.HardwarePlatform.HpCommunnicationPort#getTerminalNode <em>Terminal Node</em>}</li>
 *   <li>{@link MoSaRT.HardwarePlatform.HpCommunnicationPort#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see MoSaRT.HardwarePlatform.HardwarePlatformPackage#getHpCommunnicationPort()
 * @model
 * @generated
 */
public interface HpCommunnicationPort extends HpNetworkNode {
	/**
	 * Returns the value of the '<em><b>Terminal Node</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link MoSaRT.HardwarePlatform.HpTerminalNode#getCommPort <em>Comm Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terminal Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terminal Node</em>' reference.
	 * @see #setTerminalNode(HpTerminalNode)
	 * @see MoSaRT.HardwarePlatform.HardwarePlatformPackage#getHpCommunnicationPort_TerminalNode()
	 * @see MoSaRT.HardwarePlatform.HpTerminalNode#getCommPort
	 * @model opposite="commPort" required="true"
	 * @generated
	 */
	HpTerminalNode getTerminalNode();

	/**
	 * Sets the value of the '{@link MoSaRT.HardwarePlatform.HpCommunnicationPort#getTerminalNode <em>Terminal Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Terminal Node</em>' reference.
	 * @see #getTerminalNode()
	 * @generated
	 */
	void setTerminalNode(HpTerminalNode value);

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
	 * @see MoSaRT.HardwarePlatform.HardwarePlatformPackage#getHpCommunnicationPort_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link MoSaRT.HardwarePlatform.HpCommunnicationPort#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // HpCommunnicationPort
