/**
 * Generated with Acceleo
 */
package MoSaRT.HardwarePlatform.providers;

import MoSaRT.HardwarePlatform.util.HardwarePlatformAdapterFactory;

import org.eclipse.emf.common.notify.Adapter;

/**
 * 
 * 
 */
public class HardwarePlatformEEFAdapterFactory extends HardwarePlatformAdapterFactory {

	/**
	 * {@inheritDoc}
	 * @see MoSaRT.HardwarePlatform.util.HardwarePlatformAdapterFactory#createSystemHardwareSideAdapter()
	 * 
	 */
	public Adapter createSystemHardwareSideAdapter() {
		return new SystemHardwareSidePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see MoSaRT.HardwarePlatform.util.HardwarePlatformAdapterFactory#createHpProcessingUnitAdapter()
	 * 
	 */
	public Adapter createHpProcessingUnitAdapter() {
		return new HpProcessingUnitPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see MoSaRT.HardwarePlatform.util.HardwarePlatformAdapterFactory#createHpCommunicationRouterAdapter()
	 * 
	 */
	public Adapter createHpCommunicationRouterAdapter() {
		return new HpCommunicationRouterPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see MoSaRT.HardwarePlatform.util.HardwarePlatformAdapterFactory#createHpNetworkPortAdapter()
	 * 
	 */
	public Adapter createHpNetworkPortAdapter() {
		return new HpNetworkPortPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see MoSaRT.HardwarePlatform.util.HardwarePlatformAdapterFactory#createHpCommunicationChannelAdapter()
	 * 
	 */
	public Adapter createHpCommunicationChannelAdapter() {
		return new HpCommunicationChannelPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see MoSaRT.HardwarePlatform.util.HardwarePlatformAdapterFactory#createHpProcessorInterconnectorAdapter()
	 * 
	 */
	public Adapter createHpProcessorInterconnectorAdapter() {
		return new HpProcessorInterconnectorPropertiesEditionProvider();
	}

}
