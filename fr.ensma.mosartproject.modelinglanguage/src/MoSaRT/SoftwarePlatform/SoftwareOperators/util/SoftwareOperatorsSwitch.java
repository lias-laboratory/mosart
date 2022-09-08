/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.SoftwarePlatform.SoftwareOperators.util;

import MoSaRT.SoftwarePlatform.SoftwareOperators.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoftwareOperatorsPackage
 * @generated
 */
public class SoftwareOperatorsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SoftwareOperatorsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareOperatorsSwitch() {
		if (modelPackage == null) {
			modelPackage = SoftwareOperatorsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case SoftwareOperatorsPackage.SYSTEM_SOFTWARE_SIDE: {
				SystemSoftwareSide systemSoftwareSide = (SystemSoftwareSide)theEObject;
				T result = caseSystemSoftwareSide(systemSoftwareSide);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SoftwareOperatorsPackage.SO_SCHEDULABLE_TASK: {
				SoSchedulableTask soSchedulableTask = (SoSchedulableTask)theEObject;
				T result = caseSoSchedulableTask(soSchedulableTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SoftwareOperatorsPackage.SO_SPACE_PROCESS: {
				SoSpaceProcess soSpaceProcess = (SoSpaceProcess)theEObject;
				T result = caseSoSpaceProcess(soSpaceProcess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SoftwareOperatorsPackage.SO_INTERACTION_RESOURCE: {
				SoInteractionResource soInteractionResource = (SoInteractionResource)theEObject;
				T result = caseSoInteractionResource(soInteractionResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SoftwareOperatorsPackage.SO_MUTUAL_EXCLUSION_RESOURCE: {
				SoMutualExclusionResource soMutualExclusionResource = (SoMutualExclusionResource)theEObject;
				T result = caseSoMutualExclusionResource(soMutualExclusionResource);
				if (result == null) result = caseSoInteractionResource(soMutualExclusionResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SoftwareOperatorsPackage.SO_COMMUNICATION_RESOURCE: {
				SoCommunicationResource soCommunicationResource = (SoCommunicationResource)theEObject;
				T result = caseSoCommunicationResource(soCommunicationResource);
				if (result == null) result = caseSoInteractionResource(soCommunicationResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SoftwareOperatorsPackage.SO_REMOTE_COMM_RESOURCE: {
				SoRemoteCommResource soRemoteCommResource = (SoRemoteCommResource)theEObject;
				T result = caseSoRemoteCommResource(soRemoteCommResource);
				if (result == null) result = caseSoCommunicationResource(soRemoteCommResource);
				if (result == null) result = caseSoInteractionResource(soRemoteCommResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SoftwareOperatorsPackage.SO_LOCAL_COMM_RESOURCE: {
				SoLocalCommResource soLocalCommResource = (SoLocalCommResource)theEObject;
				T result = caseSoLocalCommResource(soLocalCommResource);
				if (result == null) result = caseSoCommunicationResource(soLocalCommResource);
				if (result == null) result = caseSoInteractionResource(soLocalCommResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SoftwareOperatorsPackage.SO_TRANSMITTED_DATA: {
				SoTransmittedData soTransmittedData = (SoTransmittedData)theEObject;
				T result = caseSoTransmittedData(soTransmittedData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Software Side</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Software Side</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemSoftwareSide(SystemSoftwareSide object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>So Schedulable Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>So Schedulable Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSoSchedulableTask(SoSchedulableTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>So Space Process</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>So Space Process</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSoSpaceProcess(SoSpaceProcess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>So Interaction Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>So Interaction Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSoInteractionResource(SoInteractionResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>So Mutual Exclusion Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>So Mutual Exclusion Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSoMutualExclusionResource(SoMutualExclusionResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>So Communication Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>So Communication Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSoCommunicationResource(SoCommunicationResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>So Remote Comm Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>So Remote Comm Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSoRemoteCommResource(SoRemoteCommResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>So Local Comm Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>So Local Comm Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSoLocalCommResource(SoLocalCommResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>So Transmitted Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>So Transmitted Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSoTransmittedData(SoTransmittedData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //SoftwareOperatorsSwitch
