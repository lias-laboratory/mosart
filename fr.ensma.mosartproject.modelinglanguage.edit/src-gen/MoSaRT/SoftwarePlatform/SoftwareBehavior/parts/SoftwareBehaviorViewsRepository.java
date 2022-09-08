/**
 * Generated with Acceleo
 */
package MoSaRT.SoftwarePlatform.SoftwareBehavior.parts;

/**
 * 
 * 
 */
public class SoftwareBehaviorViewsRepository {

	public static final int SWT_KIND = 0;

	public static final int FORM_KIND = 1;


	/**
	 * GlobalBehavior view descriptor
	 * 
	 */
	public static class GlobalBehavior {
		public static class Properties {
	
			
			public static String name = "SoftwareBehavior::GlobalBehavior::properties::name";
			
			
			public static String rootTrigger = "SoftwareBehavior::GlobalBehavior::properties::rootTrigger";
			
	
		}
	
	}

	/**
	 * SbTimeTrigger view descriptor
	 * 
	 */
	public static class SbTimeTrigger {
		public static class Properties {
	
			
			public static String name = "SoftwareBehavior::SbTimeTrigger::properties::name";
			
			
			public static String schedulingActivities = "SoftwareBehavior::SbTimeTrigger::properties::schedulingActivities";
			
			
			public static String rtpReleaseTime = "SoftwareBehavior::SbTimeTrigger::properties::rtpReleaseTime";
			
			
			public static String rtpPeriodicity = "SoftwareBehavior::SbTimeTrigger::properties::rtpPeriodicity";
			
	
		}
	
	}

	/**
	 * SbExternalEventTrigger view descriptor
	 * 
	 */
	public static class SbExternalEventTrigger {
		public static class Properties {
	
			
			public static String name = "SoftwareBehavior::SbExternalEventTrigger::properties::name";
			
			
			public static String schedulingActivities = "SoftwareBehavior::SbExternalEventTrigger::properties::schedulingActivities";
			
	
		}
	
	}

	/**
	 * SbTaskActivity view descriptor
	 * 
	 */
	public static class SbTaskActivity {
		public static class Properties {
	
			
			public static String name = "SoftwareBehavior::SbTaskActivity::properties::name";
			
			
			public static String trigger = "SoftwareBehavior::SbTaskActivity::properties::trigger";
			
			
			public static String inputSquencingRelation = "SoftwareBehavior::SbTaskActivity::properties::inputSquencingRelation";
			
			
			public static String outputSequencingRelation = "SoftwareBehavior::SbTaskActivity::properties::outputSequencingRelation";
			
			
			public static String rootActionStep = "SoftwareBehavior::SbTaskActivity::properties::rootActionStep";
			
			
			public static String representedTask = "SoftwareBehavior::SbTaskActivity::properties::representedTask";
			
			
			public static String rtpExecutionTime = "SoftwareBehavior::SbTaskActivity::properties::rtpExecutionTime";
			
			
			public static String rtpDeadline = "SoftwareBehavior::SbTaskActivity::properties::rtpDeadline";
			
			
			public static String rtpOffset = "SoftwareBehavior::SbTaskActivity::properties::rtpOffset";
			
			
			public static String rtpPriority = "SoftwareBehavior::SbTaskActivity::properties::rtpPriority";
			
			
			public static String rtpCriticality = "SoftwareBehavior::SbTaskActivity::properties::rtpCriticality";
			
			
			public static String rtpPreemptibility = "SoftwareBehavior::SbTaskActivity::properties::rtpPreemptibility";
			
			
			public static String rtpSelfSuspension = "SoftwareBehavior::SbTaskActivity::properties::rtpSelfSuspension";
			
			
			public static String rtpBlockingTime = "SoftwareBehavior::SbTaskActivity::properties::rtpBlockingTime";
			
			
			public static String rtpResponseTime = "SoftwareBehavior::SbTaskActivity::properties::rtpResponseTime";
			
			
			public static String rtpRepetition = "SoftwareBehavior::SbTaskActivity::properties::rtpRepetition";
			
			
			public static String actionSteps = "SoftwareBehavior::SbTaskActivity::properties::actionSteps";
			
	
		}
	
	}

	/**
	 * SbPrecedenceRelation view descriptor
	 * 
	 */
	public static class SbPrecedenceRelation {
		public static class Properties {
	
			
			public static String name = "SoftwareBehavior::SbPrecedenceRelation::properties::name";
			
			
			public static String targetSchedulingActivity = "SoftwareBehavior::SbPrecedenceRelation::properties::targetSchedulingActivity";
			
			
			public static String sourceSchedulingActivity = "SoftwareBehavior::SbPrecedenceRelation::properties::sourceSchedulingActivity";
			
	
		}
	
	}

	/**
	 * SbCommunicationRelation view descriptor
	 * 
	 */
	public static class SbCommunicationRelation {
		public static class Properties {
	
			
			public static String name = "SoftwareBehavior::SbCommunicationRelation::properties::name";
			
			
			public static String targetSchedulingActivity = "SoftwareBehavior::SbCommunicationRelation::properties::targetSchedulingActivity";
			
			
			public static String sourceSchedulingActivity = "SoftwareBehavior::SbCommunicationRelation::properties::sourceSchedulingActivity";
			
			
			public static String commResource = "SoftwareBehavior::SbCommunicationRelation::properties::commResource";
			
	
		}
	
	}

	/**
	 * SbAcquireStep view descriptor
	 * 
	 */
	public static class SbAcquireStep {
		public static class Properties {
	
			
			public static String name = "SoftwareBehavior::SbAcquireStep::properties::name";
			
			
			public static String inputStepRelation = "SoftwareBehavior::SbAcquireStep::properties::inputStepRelation";
			
			
			public static String outputStepRelation = "SoftwareBehavior::SbAcquireStep::properties::outputStepRelation";
			
			
			public static String representedOperation = "SoftwareBehavior::SbAcquireStep::properties::representedOperation";
			
			
			public static String interactionResource = "SoftwareBehavior::SbAcquireStep::properties::interactionResource";
			
			
			public static String rtpExecutionTime = "SoftwareBehavior::SbAcquireStep::properties::rtpExecutionTime";
			
			
			public static String rtpDeadline = "SoftwareBehavior::SbAcquireStep::properties::rtpDeadline";
			
			
			public static String rtpBlockingTime = "SoftwareBehavior::SbAcquireStep::properties::rtpBlockingTime";
			
			
			public static String rtpRepetition = "SoftwareBehavior::SbAcquireStep::properties::rtpRepetition";
			
	
		}
	
	}

	/**
	 * SbSendStep view descriptor
	 * 
	 */
	public static class SbSendStep {
		public static class Properties {
	
			
			public static String name = "SoftwareBehavior::SbSendStep::properties::name";
			
			
			public static String inputStepRelation = "SoftwareBehavior::SbSendStep::properties::inputStepRelation";
			
			
			public static String outputStepRelation = "SoftwareBehavior::SbSendStep::properties::outputStepRelation";
			
			
			public static String representedOperation = "SoftwareBehavior::SbSendStep::properties::representedOperation";
			
			
			public static String interactionResource = "SoftwareBehavior::SbSendStep::properties::interactionResource";
			
			
			public static String rtpExecutionTime = "SoftwareBehavior::SbSendStep::properties::rtpExecutionTime";
			
			
			public static String rtpDeadline = "SoftwareBehavior::SbSendStep::properties::rtpDeadline";
			
			
			public static String rtpBlockingTime = "SoftwareBehavior::SbSendStep::properties::rtpBlockingTime";
			
			
			public static String rtpRepetition = "SoftwareBehavior::SbSendStep::properties::rtpRepetition";
			
	
		}
	
	}

	/**
	 * SbReceiveStep view descriptor
	 * 
	 */
	public static class SbReceiveStep {
		public static class Properties {
	
			
			public static String name = "SoftwareBehavior::SbReceiveStep::properties::name";
			
			
			public static String inputStepRelation = "SoftwareBehavior::SbReceiveStep::properties::inputStepRelation";
			
			
			public static String outputStepRelation = "SoftwareBehavior::SbReceiveStep::properties::outputStepRelation";
			
			
			public static String representedOperation = "SoftwareBehavior::SbReceiveStep::properties::representedOperation";
			
			
			public static String interactionResource = "SoftwareBehavior::SbReceiveStep::properties::interactionResource";
			
			
			public static String rtpExecutionTime = "SoftwareBehavior::SbReceiveStep::properties::rtpExecutionTime";
			
			
			public static String rtpDeadline = "SoftwareBehavior::SbReceiveStep::properties::rtpDeadline";
			
			
			public static String rtpBlockingTime = "SoftwareBehavior::SbReceiveStep::properties::rtpBlockingTime";
			
			
			public static String rtpRepetition = "SoftwareBehavior::SbReceiveStep::properties::rtpRepetition";
			
	
		}
	
	}

	/**
	 * SbWriteStep view descriptor
	 * 
	 */
	public static class SbWriteStep {
		public static class Properties {
	
			
			public static String name = "SoftwareBehavior::SbWriteStep::properties::name";
			
			
			public static String inputStepRelation = "SoftwareBehavior::SbWriteStep::properties::inputStepRelation";
			
			
			public static String outputStepRelation = "SoftwareBehavior::SbWriteStep::properties::outputStepRelation";
			
			
			public static String representedOperation = "SoftwareBehavior::SbWriteStep::properties::representedOperation";
			
			
			public static String interactionResource = "SoftwareBehavior::SbWriteStep::properties::interactionResource";
			
			
			public static String rtpExecutionTime = "SoftwareBehavior::SbWriteStep::properties::rtpExecutionTime";
			
			
			public static String rtpDeadline = "SoftwareBehavior::SbWriteStep::properties::rtpDeadline";
			
			
			public static String rtpBlockingTime = "SoftwareBehavior::SbWriteStep::properties::rtpBlockingTime";
			
			
			public static String rtpRepetition = "SoftwareBehavior::SbWriteStep::properties::rtpRepetition";
			
	
		}
	
	}

	/**
	 * SbReleaseStep view descriptor
	 * 
	 */
	public static class SbReleaseStep {
		public static class Properties {
	
			
			public static String name = "SoftwareBehavior::SbReleaseStep::properties::name";
			
			
			public static String inputStepRelation = "SoftwareBehavior::SbReleaseStep::properties::inputStepRelation";
			
			
			public static String outputStepRelation = "SoftwareBehavior::SbReleaseStep::properties::outputStepRelation";
			
			
			public static String representedOperation = "SoftwareBehavior::SbReleaseStep::properties::representedOperation";
			
			
			public static String interactionResource = "SoftwareBehavior::SbReleaseStep::properties::interactionResource";
			
			
			public static String rtpExecutionTime = "SoftwareBehavior::SbReleaseStep::properties::rtpExecutionTime";
			
			
			public static String rtpDeadline = "SoftwareBehavior::SbReleaseStep::properties::rtpDeadline";
			
			
			public static String rtpBlockingTime = "SoftwareBehavior::SbReleaseStep::properties::rtpBlockingTime";
			
			
			public static String rtpRepetition = "SoftwareBehavior::SbReleaseStep::properties::rtpRepetition";
			
	
		}
	
	}

	/**
	 * SbReadStep view descriptor
	 * 
	 */
	public static class SbReadStep {
		public static class Properties {
	
			
			public static String name = "SoftwareBehavior::SbReadStep::properties::name";
			
			
			public static String inputStepRelation = "SoftwareBehavior::SbReadStep::properties::inputStepRelation";
			
			
			public static String outputStepRelation = "SoftwareBehavior::SbReadStep::properties::outputStepRelation";
			
			
			public static String representedOperation = "SoftwareBehavior::SbReadStep::properties::representedOperation";
			
			
			public static String interactionResource = "SoftwareBehavior::SbReadStep::properties::interactionResource";
			
			
			public static String rtpExecutionTime = "SoftwareBehavior::SbReadStep::properties::rtpExecutionTime";
			
			
			public static String rtpDeadline = "SoftwareBehavior::SbReadStep::properties::rtpDeadline";
			
			
			public static String rtpBlockingTime = "SoftwareBehavior::SbReadStep::properties::rtpBlockingTime";
			
			
			public static String rtpRepetition = "SoftwareBehavior::SbReadStep::properties::rtpRepetition";
			
	
		}
	
	}

	/**
	 * SbStepPrecedenceRelation view descriptor
	 * 
	 */
	public static class SbStepPrecedenceRelation {
		public static class Properties {
	
			
			public static String name = "SoftwareBehavior::SbStepPrecedenceRelation::properties::name";
			
			
			public static String sourceStep = "SoftwareBehavior::SbStepPrecedenceRelation::properties::sourceStep";
			
			
			public static String targetStep = "SoftwareBehavior::SbStepPrecedenceRelation::properties::targetStep";
			
	
		}
	
	}

	/**
	 * SbActionStep view descriptor
	 * 
	 */
	public static class SbActionStep {
		public static class Properties {
	
			
			public static String name = "SoftwareBehavior::SbActionStep::properties::name";
			
			
			public static String inputStepRelation = "SoftwareBehavior::SbActionStep::properties::inputStepRelation";
			
			
			public static String outputStepRelation = "SoftwareBehavior::SbActionStep::properties::outputStepRelation";
			
			
			public static String representedOperation = "SoftwareBehavior::SbActionStep::properties::representedOperation";
			
			
			public static String interactionResource = "SoftwareBehavior::SbActionStep::properties::interactionResource";
			
			
			public static String rtpExecutionTime = "SoftwareBehavior::SbActionStep::properties::rtpExecutionTime";
			
			
			public static String rtpDeadline = "SoftwareBehavior::SbActionStep::properties::rtpDeadline";
			
			
			public static String rtpBlockingTime = "SoftwareBehavior::SbActionStep::properties::rtpBlockingTime";
			
			
			public static String rtpRepetition = "SoftwareBehavior::SbActionStep::properties::rtpRepetition";
			
	
		}
	
	}

}
