/**
 * Generated with Acceleo
 */
package MoSaRT.SoftwarePlatform.SoftwareOperators.providers;

import MoSaRT.SoftwarePlatform.SoftwareOperators.util.SoftwareOperatorsAdapterFactory;

import org.eclipse.emf.common.notify.Adapter;

/**
 * 
 * 
 */
public class SoftwareOperatorsEEFAdapterFactory extends SoftwareOperatorsAdapterFactory {

	/**
	 * {@inheritDoc}
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.util.SoftwareOperatorsAdapterFactory#createSystemSoftwareSideAdapter()
	 * 
	 */
	public Adapter createSystemSoftwareSideAdapter() {
		return new SystemSoftwareSidePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.util.SoftwareOperatorsAdapterFactory#createSoSchedulableTaskAdapter()
	 * 
	 */
	public Adapter createSoSchedulableTaskAdapter() {
		return new SoSchedulableTaskPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.util.SoftwareOperatorsAdapterFactory#createSoSpaceProcessAdapter()
	 * 
	 */
	public Adapter createSoSpaceProcessAdapter() {
		return new SoSpaceProcessPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.util.SoftwareOperatorsAdapterFactory#createSoMutualExclusionResourceAdapter()
	 * 
	 */
	public Adapter createSoMutualExclusionResourceAdapter() {
		return new SoMutualExclusionResourcePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.util.SoftwareOperatorsAdapterFactory#createSoRemoteCommResourceAdapter()
	 * 
	 */
	public Adapter createSoRemoteCommResourceAdapter() {
		return new SoRemoteCommResourcePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.util.SoftwareOperatorsAdapterFactory#createSoLocalCommResourceAdapter()
	 * 
	 */
	public Adapter createSoLocalCommResourceAdapter() {
		return new SoLocalCommResourcePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.util.SoftwareOperatorsAdapterFactory#createSoTransmittedDataAdapter()
	 * 
	 */
	public Adapter createSoTransmittedDataAdapter() {
		return new SoTransmittedDataPropertiesEditionProvider();
	}

}
