/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.util;

import MoSaRT.RealTimeProperties.RealTimeCommonType;

import MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.RtpComputationAndAnalysisFunctionsPackage
 * @generated
 */
public class RtpComputationAndAnalysisFunctionsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RtpComputationAndAnalysisFunctionsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpComputationAndAnalysisFunctionsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RtpComputationAndAnalysisFunctionsPackage.eINSTANCE;
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
	protected RtpComputationAndAnalysisFunctionsSwitch<Adapter> modelSwitch =
		new RtpComputationAndAnalysisFunctionsSwitch<Adapter>() {
			@Override
			public Adapter caseRtpComputationFunction(RtpComputationFunction object) {
				return createRtpComputationFunctionAdapter();
			}
			@Override
			public Adapter caseWeibullComputationFunction(WeibullComputationFunction object) {
				return createWeibullComputationFunctionAdapter();
			}
			@Override
			public Adapter caseRtpAnalysisFunction(RtpAnalysisFunction object) {
				return createRtpAnalysisFunctionAdapter();
			}
			@Override
			public Adapter casePiecewiseLinearAnalysisFunction(PiecewiseLinearAnalysisFunction object) {
				return createPiecewiseLinearAnalysisFunctionAdapter();
			}
			@Override
			public Adapter caseRealTimeCommonType(RealTimeCommonType object) {
				return createRealTimeCommonTypeAdapter();
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
	 * Creates a new adapter for an object of class '{@link MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.RtpComputationFunction <em>Rtp Computation Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.RtpComputationFunction
	 * @generated
	 */
	public Adapter createRtpComputationFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.WeibullComputationFunction <em>Weibull Computation Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.WeibullComputationFunction
	 * @generated
	 */
	public Adapter createWeibullComputationFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.RtpAnalysisFunction <em>Rtp Analysis Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.RtpAnalysisFunction
	 * @generated
	 */
	public Adapter createRtpAnalysisFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.PiecewiseLinearAnalysisFunction <em>Piecewise Linear Analysis Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.PiecewiseLinearAnalysisFunction
	 * @generated
	 */
	public Adapter createPiecewiseLinearAnalysisFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.RealTimeProperties.RealTimeCommonType <em>Real Time Common Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.RealTimeProperties.RealTimeCommonType
	 * @generated
	 */
	public Adapter createRealTimeCommonTypeAdapter() {
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

} //RtpComputationAndAnalysisFunctionsAdapterFactory
