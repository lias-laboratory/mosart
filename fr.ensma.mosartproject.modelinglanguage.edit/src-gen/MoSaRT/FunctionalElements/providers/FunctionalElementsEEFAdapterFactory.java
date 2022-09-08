/**
 * Generated with Acceleo
 */
package MoSaRT.FunctionalElements.providers;

import MoSaRT.FunctionalElements.util.FunctionalElementsAdapterFactory;

import org.eclipse.emf.common.notify.Adapter;

/**
 * 
 * 
 */
public class FunctionalElementsEEFAdapterFactory extends FunctionalElementsAdapterFactory {

	/**
	 * {@inheritDoc}
	 * @see MoSaRT.FunctionalElements.util.FunctionalElementsAdapterFactory#createSystemFunctionalSideAdapter()
	 * 
	 */
	public Adapter createSystemFunctionalSideAdapter() {
		return new SystemFunctionalSidePropertiesEditionProvider();
	}

}
