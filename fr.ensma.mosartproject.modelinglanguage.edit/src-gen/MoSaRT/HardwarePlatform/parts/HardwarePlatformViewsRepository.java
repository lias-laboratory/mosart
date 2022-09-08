/**
 * Generated with Acceleo
 */
package MoSaRT.HardwarePlatform.parts;

/**
 * 
 * 
 */
public class HardwarePlatformViewsRepository {

	public static final int SWT_KIND = 0;

	public static final int FORM_KIND = 1;


	/**
	 * SystemHardwareSide view descriptor
	 * 
	 */
	public static class SystemHardwareSide {
		public static class Properties {
	
			
			public static String name = "HardwarePlatform::SystemHardwareSide::properties::name";
			
	
		}
	
	}

	/**
	 * HpProcessingUnit view descriptor
	 * 
	 */
	public static class HpProcessingUnit {
		public static class Properties {
	
			
			public static String name = "HardwarePlatform::HpProcessingUnit::properties::name";
			
			
			public static String commChannel = "HardwarePlatform::HpProcessingUnit::properties::commChannel";
			
			
			public static String spaceProcesses = "HardwarePlatform::HpProcessingUnit::properties::spaceProcesses";
			
			
			public static String candidateTasks = "HardwarePlatform::HpProcessingUnit::properties::candidateTasks";
			
			
			public static String schedulableTasks = "HardwarePlatform::HpProcessingUnit::properties::schedulableTasks";
			
			
			public static String processorInterconnector = "HardwarePlatform::HpProcessingUnit::properties::processorInterconnector";
			
			
			public static String rtpUtilizationFactor = "HardwarePlatform::HpProcessingUnit::properties::rtpUtilizationFactor";
			
			
			public static String rtpComputingSpeed = "HardwarePlatform::HpProcessingUnit::properties::rtpComputingSpeed";
			
	
		}
	
	}

	/**
	 * HpCommunicationRouter view descriptor
	 * 
	 */
	public static class HpCommunicationRouter {
		public static class Properties {
	
			
			public static String name = "HardwarePlatform::HpCommunicationRouter::properties::name";
			
			
			public static String networkPorts = "HardwarePlatform::HpCommunicationRouter::properties::networkPorts";
			
	
		}
	
	}

	/**
	 * HpNetworkPort view descriptor
	 * 
	 */
	public static class HpNetworkPort {
		public static class Properties {
	
			
			public static String name = "HardwarePlatform::HpNetworkPort::properties::name";
			
			
			public static String commChannel = "HardwarePlatform::HpNetworkPort::properties::commChannel";
			
			
			public static String rtpFlowRate = "HardwarePlatform::HpNetworkPort::properties::rtpFlowRate";
			
			
			public static String rtpNetworkProtocol = "HardwarePlatform::HpNetworkPort::properties::rtpNetworkProtocol";
			
			
			public static String rtpTransmissionMode = "HardwarePlatform::HpNetworkPort::properties::rtpTransmissionMode";
			
	
		}
	
	}

	/**
	 * HpCommunicationChannel view descriptor
	 * 
	 */
	public static class HpCommunicationChannel {
		public static class Properties {
	
			
			public static String name = "HardwarePlatform::HpCommunicationChannel::properties::name";
			
			
			public static String processingUnits = "HardwarePlatform::HpCommunicationChannel::properties::processingUnits";
			
			
			public static String networkPort = "HardwarePlatform::HpCommunicationChannel::properties::networkPort";
			
			
			public static String processingUnitSet = "HardwarePlatform::HpCommunicationChannel::properties::processingUnitSet";
			
	
		}
	
	}

	/**
	 * HpProcessorInterconnector view descriptor
	 * 
	 */
	public static class HpProcessorInterconnector {
		public static class Properties {
	
			
			public static String name = "HardwarePlatform::HpProcessorInterconnector::properties::name";
			
			
			public static String processingUnits = "HardwarePlatform::HpProcessorInterconnector::properties::processingUnits";
			
			
			public static String commChannel = "HardwarePlatform::HpProcessorInterconnector::properties::commChannel";
			
			
			public static String rtpMultiprocessorCategory = "HardwarePlatform::HpProcessorInterconnector::properties::rtpMultiprocessorCategory";
			
	
		}
	
	}

}
