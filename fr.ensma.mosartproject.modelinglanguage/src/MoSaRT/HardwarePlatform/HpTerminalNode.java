/**
 */
package MoSaRT.HardwarePlatform;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hp Terminal Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.HardwarePlatform.HpTerminalNode#getCommPort <em>Comm Port</em>}</li>
 * </ul>
 *
 * @see MoSaRT.HardwarePlatform.HardwarePlatformPackage#getHpTerminalNode()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface HpTerminalNode extends EObject {
	/**
	 * Returns the value of the '<em><b>Comm Port</b></em>' reference list.
	 * The list contents are of type {@link MoSaRT.HardwarePlatform.HpCommunnicationPort}.
	 * It is bidirectional and its opposite is '{@link MoSaRT.HardwarePlatform.HpCommunnicationPort#getTerminalNode <em>Terminal Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comm Port</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comm Port</em>' reference list.
	 * @see MoSaRT.HardwarePlatform.HardwarePlatformPackage#getHpTerminalNode_CommPort()
	 * @see MoSaRT.HardwarePlatform.HpCommunnicationPort#getTerminalNode
	 * @model opposite="TerminalNode"
	 * @generated
	 */
	EList<HpCommunnicationPort> getCommPort();

} // HpTerminalNode
