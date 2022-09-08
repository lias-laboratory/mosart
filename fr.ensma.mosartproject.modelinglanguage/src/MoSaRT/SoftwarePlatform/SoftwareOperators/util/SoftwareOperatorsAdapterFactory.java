/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.SoftwarePlatform.SoftwareOperators.util;

import MoSaRT.SoftwarePlatform.SoftwareOperators.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoftwareOperatorsPackage
 * @generated
 */
public class SoftwareOperatorsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SoftwareOperatorsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareOperatorsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SoftwareOperatorsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SoftwareOperatorsSwitch<Adapter> modelSwitch =
		new SoftwareOperatorsSwitch<Adapter>() {
			@Override
			public Adapter caseSystemSoftwareSide(SystemSoftwareSide object) {
				return createSystemSoftwareSideAdapter();
			}
			@Override
			public Adapter caseSoSchedulableTask(SoSchedulableTask object) {
				return createSoSchedulableTaskAdapter();
			}
			@Override
			public Adapter caseSoSpaceProcess(SoSpaceProcess object) {
				return createSoSpaceProcessAdapter();
			}
			@Override
			public Adapter caseSoInteractionResource(SoInteractionResource object) {
				return createSoInteractionResourceAdapter();
			}
			@Override
			public Adapter caseSoMutualExclusionResource(SoMutualExclusionResource object) {
				return createSoMutualExclusionResourceAdapter();
			}
			@Override
			public Adapter caseSoCommunicationResource(SoCommunicationResource object) {
				return createSoCommunicationResourceAdapter();
			}
			@Override
			public Adapter caseSoRemoteCommResource(SoRemoteCommResource object) {
				return createSoRemoteCommResourceAdapter();
			}
			@Override
			public Adapter caseSoLocalCommResource(SoLocalCommResource object) {
				return createSoLocalCommResourceAdapter();
			}
			@Override
			public Adapter caseSoTransmittedData(SoTransmittedData object) {
				return createSoTransmittedDataAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SystemSoftwareSide <em>System Software Side</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SystemSoftwareSide
	 * @generated
	 */
	public Adapter createSystemSoftwareSideAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoSchedulableTask <em>So Schedulable Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoSchedulableTask
	 * @generated
	 */
	public Adapter createSoSchedulableTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoSpaceProcess <em>So Space Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoSpaceProcess
	 * @generated
	 */
	public Adapter createSoSpaceProcessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoInteractionResource <em>So Interaction Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoInteractionResource
	 * @generated
	 */
	public Adapter createSoInteractionResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoMutualExclusionResource <em>So Mutual Exclusion Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoMutualExclusionResource
	 * @generated
	 */
	public Adapter createSoMutualExclusionResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoCommunicationResource <em>So Communication Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoCommunicationResource
	 * @generated
	 */
	public Adapter createSoCommunicationResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoRemoteCommResource <em>So Remote Comm Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoRemoteCommResource
	 * @generated
	 */
	public Adapter createSoRemoteCommResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoLocalCommResource <em>So Local Comm Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoLocalCommResource
	 * @generated
	 */
	public Adapter createSoLocalCommResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoTransmittedData <em>So Transmitted Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoTransmittedData
	 * @generated
	 */
	public Adapter createSoTransmittedDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SoftwareOperatorsAdapterFactory
