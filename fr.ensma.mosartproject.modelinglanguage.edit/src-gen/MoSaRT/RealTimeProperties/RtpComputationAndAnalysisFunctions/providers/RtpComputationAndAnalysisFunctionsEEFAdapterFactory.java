/**
 * Generated with Acceleo
 */
package MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.providers;

import MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.util.RtpComputationAndAnalysisFunctionsAdapterFactory;

import org.eclipse.emf.common.notify.Adapter;

/**
 * 
 * 
 */
public class RtpComputationAndAnalysisFunctionsEEFAdapterFactory extends RtpComputationAndAnalysisFunctionsAdapterFactory {

	/**
	 * {@inheritDoc}
	 * @see MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.util.RtpComputationAndAnalysisFunctionsAdapterFactory#createWeibullComputationFunctionAdapter()
	 * 
	 */
	public Adapter createWeibullComputationFunctionAdapter() {
		return new WeibullComputationFunctionPropertiesEditionProvider();
	}

}
