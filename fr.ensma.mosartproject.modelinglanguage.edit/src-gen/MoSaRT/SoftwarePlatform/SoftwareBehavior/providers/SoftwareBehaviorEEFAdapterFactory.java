/**
 * Generated with Acceleo
 */
package MoSaRT.SoftwarePlatform.SoftwareBehavior.providers;

import MoSaRT.SoftwarePlatform.SoftwareBehavior.util.SoftwareBehaviorAdapterFactory;

import org.eclipse.emf.common.notify.Adapter;

/**
 * 
 * 
 */
public class SoftwareBehaviorEEFAdapterFactory extends SoftwareBehaviorAdapterFactory {

	/**
	 * {@inheritDoc}
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.util.SoftwareBehaviorAdapterFactory#createGlobalBehaviorAdapter()
	 * 
	 */
	public Adapter createGlobalBehaviorAdapter() {
		return new GlobalBehaviorPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.util.SoftwareBehaviorAdapterFactory#createSbTimeTriggerAdapter()
	 * 
	 */
	public Adapter createSbTimeTriggerAdapter() {
		return new SbTimeTriggerPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.util.SoftwareBehaviorAdapterFactory#createSbExternalEventTriggerAdapter()
	 * 
	 */
	public Adapter createSbExternalEventTriggerAdapter() {
		return new SbExternalEventTriggerPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.util.SoftwareBehaviorAdapterFactory#createSbTaskActivityAdapter()
	 * 
	 */
	public Adapter createSbTaskActivityAdapter() {
		return new SbTaskActivityPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.util.SoftwareBehaviorAdapterFactory#createSbPrecedenceRelationAdapter()
	 * 
	 */
	public Adapter createSbPrecedenceRelationAdapter() {
		return new SbPrecedenceRelationPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.util.SoftwareBehaviorAdapterFactory#createSbCommunicationRelationAdapter()
	 * 
	 */
	public Adapter createSbCommunicationRelationAdapter() {
		return new SbCommunicationRelationPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.util.SoftwareBehaviorAdapterFactory#createSbAcquireStepAdapter()
	 * 
	 */
	public Adapter createSbAcquireStepAdapter() {
		return new SbAcquireStepPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.util.SoftwareBehaviorAdapterFactory#createSbSendStepAdapter()
	 * 
	 */
	public Adapter createSbSendStepAdapter() {
		return new SbSendStepPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.util.SoftwareBehaviorAdapterFactory#createSbReceiveStepAdapter()
	 * 
	 */
	public Adapter createSbReceiveStepAdapter() {
		return new SbReceiveStepPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.util.SoftwareBehaviorAdapterFactory#createSbWriteStepAdapter()
	 * 
	 */
	public Adapter createSbWriteStepAdapter() {
		return new SbWriteStepPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.util.SoftwareBehaviorAdapterFactory#createSbReleaseStepAdapter()
	 * 
	 */
	public Adapter createSbReleaseStepAdapter() {
		return new SbReleaseStepPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.util.SoftwareBehaviorAdapterFactory#createSbReadStepAdapter()
	 * 
	 */
	public Adapter createSbReadStepAdapter() {
		return new SbReadStepPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.util.SoftwareBehaviorAdapterFactory#createSbStepPrecedenceRelationAdapter()
	 * 
	 */
	public Adapter createSbStepPrecedenceRelationAdapter() {
		return new SbStepPrecedenceRelationPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.util.SoftwareBehaviorAdapterFactory#createSbActionStepAdapter()
	 * 
	 */
	public Adapter createSbActionStepAdapter() {
		return new SbActionStepPropertiesEditionProvider();
	}

}
