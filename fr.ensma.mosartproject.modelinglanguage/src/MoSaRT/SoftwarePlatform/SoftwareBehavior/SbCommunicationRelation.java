/**
 */
package MoSaRT.SoftwarePlatform.SoftwareBehavior;

import MoSaRT.SoftwarePlatform.SoftwareOperators.SoCommunicationResource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sb Communication Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbCommunicationRelation#getCommResource <em>Comm Resource</em>}</li>
 * </ul>
 *
 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SoftwareBehaviorPackage#getSbCommunicationRelation()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='SbCommunicationRelationRule1 SbCommunicationRelationRule2'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot SbCommunicationRelationRule1='self.targetSchedulingActivity <> self.sourceSchedulingActivity' SbCommunicationRelationRule2='(self.commResource.writerTasks-> includes (self.oclAsType(SbSequencingRelation). sourceSchedulingActivity.oclAsType(SbTaskActivity).representedTask)) and (self.commResource.readerTasks->includes(self.oclAsType(SbSequencingRelation). targetSchedulingActivity.oclAsType(SbTaskActivity).representedTask))'"
 * @generated
 */
public interface SbCommunicationRelation extends SbSequencingRelation {
	/**
	 * Returns the value of the '<em><b>Comm Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comm Resource</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comm Resource</em>' reference.
	 * @see #setCommResource(SoCommunicationResource)
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SoftwareBehaviorPackage#getSbCommunicationRelation_CommResource()
	 * @model required="true"
	 * @generated
	 */
	SoCommunicationResource getCommResource();

	/**
	 * Sets the value of the '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbCommunicationRelation#getCommResource <em>Comm Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comm Resource</em>' reference.
	 * @see #getCommResource()
	 * @generated
	 */
	void setCommResource(SoCommunicationResource value);

} // SbCommunicationRelation
