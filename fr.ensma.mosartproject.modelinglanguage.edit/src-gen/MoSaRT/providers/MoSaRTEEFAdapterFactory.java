/**
 * Generated with Acceleo
 */
package MoSaRT.providers;

import MoSaRT.util.MoSaRTAdapterFactory;

import org.eclipse.emf.common.notify.Adapter;

/**
 * 
 * 
 */
public class MoSaRTEEFAdapterFactory extends MoSaRTAdapterFactory {

	/**
	 * {@inheritDoc}
	 * @see .MoSaRT.util.MoSaRTAdapterFactory#createGlobalSystemAdapter()
	 * 
	 */
	public Adapter createGlobalSystemAdapter() {
		return new GlobalSystemPropertiesEditionProvider();
	}

}
