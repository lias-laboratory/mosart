/**
 * Generated with Acceleo
 */
package MoSaRT.SoftwarePlatform.SoftwareOperators.parts;

/**
 * 
 * 
 */
public class SoftwareOperatorsViewsRepository {

	public static final int SWT_KIND = 0;

	public static final int FORM_KIND = 1;


	/**
	 * SystemSoftwareSide view descriptor
	 * 
	 */
	public static class SystemSoftwareSide {
		public static class Properties {
	
			
			public static String systemBehavior = "SoftwareOperators::SystemSoftwareSide::properties::systemBehavior";
			
			
			public static String name = "SoftwareOperators::SystemSoftwareSide::properties::name";
			
	
		}
	
	}

	/**
	 * SoSchedulableTask view descriptor
	 * 
	 */
	public static class SoSchedulableTask {
		public static class Properties {
	
			
			public static String process = "SoftwareOperators::SoSchedulableTask::properties::process";
			
			
			public static String mutualExclusionResources = "SoftwareOperators::SoSchedulableTask::properties::mutualExclusionResources";
			
			
			public static String commWritingResources = "SoftwareOperators::SoSchedulableTask::properties::commWritingResources";
			
			
			public static String commReadingResources = "SoftwareOperators::SoSchedulableTask::properties::commReadingResources";
			
			
			public static String name = "SoftwareOperators::SoSchedulableTask::properties::name";
			
			
			public static String favoriteProcessors = "SoftwareOperators::SoSchedulableTask::properties::favoriteProcessors";
			
			
			public static String runOnProcessors = "SoftwareOperators::SoSchedulableTask::properties::runOnProcessors";
			
			
			public static String representedActivity = "SoftwareOperators::SoSchedulableTask::properties::representedActivity";
			
			
			public static String rtpMutualExclusionResourceUtilization = "SoftwareOperators::SoSchedulableTask::properties::rtpMutualExclusionResourceUtilization";
			
	
		}
	
	}

	/**
	 * SoSpaceProcess view descriptor
	 * 
	 */
	public static class SoSpaceProcess {
		public static class Properties {
	
			
			public static String spaceProcessParent = "SoftwareOperators::SoSpaceProcess::properties::spaceProcessParent";
			
			
			public static String spaceProcessChildren = "SoftwareOperators::SoSpaceProcess::properties::spaceProcessChildren";
			
			
			public static String schedulableTasks = "SoftwareOperators::SoSpaceProcess::properties::schedulableTasks";
			
			
			public static String name = "SoftwareOperators::SoSpaceProcess::properties::name";
			
			
			public static String processingUnit = "SoftwareOperators::SoSpaceProcess::properties::processingUnit";
			
			
			public static String rtpSchedulingPolicy = "SoftwareOperators::SoSpaceProcess::properties::rtpSchedulingPolicy";
			
			
			public static String rtpTaskAllocation = "SoftwareOperators::SoSpaceProcess::properties::rtpTaskAllocation";
			
	
		}
	
	}

	/**
	 * SoMutualExclusionResource view descriptor
	 * 
	 */
	public static class SoMutualExclusionResource {
		public static class Properties {
	
			
			public static String tasks = "SoftwareOperators::SoMutualExclusionResource::properties::tasks";
			
			
			public static String name = "SoftwareOperators::SoMutualExclusionResource::properties::name";
			
			
			public static String rtpProtectProtocol = "SoftwareOperators::SoMutualExclusionResource::properties::rtpProtectProtocol";
			
			
			public static String rtpWaitingQueuePolicy = "SoftwareOperators::SoMutualExclusionResource::properties::rtpWaitingQueuePolicy";
			
	
		}
	
	}

	/**
	 * SoRemoteCommResource view descriptor
	 * 
	 */
	public static class SoRemoteCommResource {
		public static class Properties {
	
			
			public static String writerTasks = "SoftwareOperators::SoRemoteCommResource::properties::writerTasks";
			
			
			public static String readerTasks = "SoftwareOperators::SoRemoteCommResource::properties::readerTasks";
			
			
			public static String name = "SoftwareOperators::SoRemoteCommResource::properties::name";
			
			
			public static String transmittedData = "SoftwareOperators::SoRemoteCommResource::properties::transmittedData";
			
	
		}
	
	}

	/**
	 * SoLocalCommResource view descriptor
	 * 
	 */
	public static class SoLocalCommResource {
		public static class Properties {
	
			
			public static String writerTasks = "SoftwareOperators::SoLocalCommResource::properties::writerTasks";
			
			
			public static String readerTasks = "SoftwareOperators::SoLocalCommResource::properties::readerTasks";
			
			
			public static String name = "SoftwareOperators::SoLocalCommResource::properties::name";
			
			
			public static String rtpCommunicationMechanism = "SoftwareOperators::SoLocalCommResource::properties::rtpCommunicationMechanism";
			
			
			public static String rtpProtectProtocol = "SoftwareOperators::SoLocalCommResource::properties::rtpProtectProtocol";
			
			
			public static String rtpWaitingQueuePolicy = "SoftwareOperators::SoLocalCommResource::properties::rtpWaitingQueuePolicy";
			
	
		}
	
	}

	/**
	 * SoTransmittedData view descriptor
	 * 
	 */
	public static class SoTransmittedData {
		public static class Properties {
	
			
			public static String sourceTask = "SoftwareOperators::SoTransmittedData::properties::sourceTask";
			
			
			public static String targetTasks = "SoftwareOperators::SoTransmittedData::properties::targetTasks";
			
			
			public static String name = "SoftwareOperators::SoTransmittedData::properties::name";
			
			
			public static String rtpDataSize = "SoftwareOperators::SoTransmittedData::properties::rtpDataSize";
			
	
		}
	
	}

}
