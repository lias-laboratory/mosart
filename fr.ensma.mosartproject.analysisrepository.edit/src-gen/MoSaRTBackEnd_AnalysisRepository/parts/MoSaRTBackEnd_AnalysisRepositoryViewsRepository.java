/**
 * Generated with Acceleo
 */
package MoSaRTBackEnd_AnalysisRepository.parts;

/**
 * 
 * 
 */
public class MoSaRTBackEnd_AnalysisRepositoryViewsRepository {

	public static final int SWT_KIND = 0;

	public static final int FORM_KIND = 1;


	/**
	 * AnalysisRepository view descriptor
	 * 
	 */
	public static class AnalysisRepository {
		public static class Properties {
	
			
			public static String name = "MoSaRTBackEnd_AnalysisRepository::AnalysisRepository::properties::name";
			
			
			public static String description = "MoSaRTBackEnd_AnalysisRepository::AnalysisRepository::properties::description";
			
			
			public static String generalizationRelationships = "MoSaRTBackEnd_AnalysisRepository::AnalysisRepository::properties::generalization Relationships";
			
			
			public static String contextModels = "MoSaRTBackEnd_AnalysisRepository::AnalysisRepository::properties::context Models";
			
			
			public static String identificationRules = "MoSaRTBackEnd_AnalysisRepository::AnalysisRepository::properties::identification Rules";
			
			
			public static String analysisTools = "MoSaRTBackEnd_AnalysisRepository::AnalysisRepository::properties::analysis Tools";
			
			
			public static String metaModelOfMoSaRT = "MoSaRTBackEnd_AnalysisRepository::AnalysisRepository::properties::metaModel of MoSaRT";
			
			
			public static String testFamilies = "MoSaRTBackEnd_AnalysisRepository::AnalysisRepository::properties::test Families";
			
	
		}
	
	}

	/**
	 * ContextModel view descriptor
	 * 
	 */
	public static class ContextModel {
		public static class Properties {
	
			
			public static String name = "MoSaRTBackEnd_AnalysisRepository::ContextModel::properties::name";
			
			
			public static String description = "MoSaRTBackEnd_AnalysisRepository::ContextModel::properties::description";
			
			
			public static String references = "MoSaRTBackEnd_AnalysisRepository::ContextModel::properties::references";
			
			
			public static String falseEvaluation = "MoSaRTBackEnd_AnalysisRepository::ContextModel::properties::false Evaluation";
			
			
			public static String trueEvaluation = "MoSaRTBackEnd_AnalysisRepository::ContextModel::properties::true Evaluation";
			
			
			public static String undefinedEvaluation = "MoSaRTBackEnd_AnalysisRepository::ContextModel::properties::undefined Evaluation";
			
			
			public static String analysisTests = "MoSaRTBackEnd_AnalysisRepository::ContextModel::properties::analysisTests";
			
	
		}
	
	}

	/**
	 * Test view descriptor
	 * 
	 */
	public static class Test {
		public static class Properties {
	
			
			public static String id = "MoSaRTBackEnd_AnalysisRepository::Test::properties::id";
			
			
			public static String name = "MoSaRTBackEnd_AnalysisRepository::Test::properties::name";
			
			
			public static String references = "MoSaRTBackEnd_AnalysisRepository::Test::properties::references";
			
			
			public static String description = "MoSaRTBackEnd_AnalysisRepository::Test::properties::description";
			
			
			public static String toolsToApply = "MoSaRTBackEnd_AnalysisRepository::Test::properties::tools To Apply";
			
			
			public static String itsTestFamily = "MoSaRTBackEnd_AnalysisRepository::Test::properties::its Test Family";
			
			
			public static String characteristics = "MoSaRTBackEnd_AnalysisRepository::Test::properties::characteristics";
			
	
		}
	
	}

	/**
	 * IdentificationRule view descriptor
	 * 
	 */
	public static class IdentificationRule {
		public static class Properties {
	
			
			public static String id = "MoSaRTBackEnd_AnalysisRepository::IdentificationRule::properties::id";
			
			
			public static String componentKind = "MoSaRTBackEnd_AnalysisRepository::IdentificationRule::properties::component Kind";
			
			
			public static String timingKind = "MoSaRTBackEnd_AnalysisRepository::IdentificationRule::properties::timing Kind";
			
			
			public static String rule = "MoSaRTBackEnd_AnalysisRepository::IdentificationRule::properties::rule";
			
			
			public static String ruleContext = "MoSaRTBackEnd_AnalysisRepository::IdentificationRule::properties::rule Context";
			
			
			public static String description = "MoSaRTBackEnd_AnalysisRepository::IdentificationRule::properties::description";
			
	
		}
	
	}

	/**
	 * Tool view descriptor
	 * 
	 */
	public static class Tool {
		public static class Properties {
	
			
			public static String id = "MoSaRTBackEnd_AnalysisRepository::Tool::properties::id";
			
			
			public static String name = "MoSaRTBackEnd_AnalysisRepository::Tool::properties::name";
			
			
			public static String description = "MoSaRTBackEnd_AnalysisRepository::Tool::properties::description";
			
			
			public static String locationOfMoSaRTToToolTransformationProgram = "MoSaRTBackEnd_AnalysisRepository::Tool::properties::location of MoSaRT to Tool transformation program";
			
			
			public static String locationOfToolToMoSaRTTransformationProgram = "MoSaRTBackEnd_AnalysisRepository::Tool::properties::location of Tool to MoSaRT transformation program";
			
	
		}
	
	}

	/**
	 * TestFamily view descriptor
	 * 
	 */
	public static class TestFamily {
		public static class Properties {
	
			
			public static String name = "MoSaRTBackEnd_AnalysisRepository::TestFamily::properties::name";
			
			
			public static String description = "MoSaRTBackEnd_AnalysisRepository::TestFamily::properties::description";
			
			
			public static String references = "MoSaRTBackEnd_AnalysisRepository::TestFamily::properties::references";
			
			
			public static String containedTests = "MoSaRTBackEnd_AnalysisRepository::TestFamily::properties::contained Tests";
			
	
		}
	
	}

	/**
	 * GeneralizationRelationship view descriptor
	 * 
	 */
	public static class GeneralizationRelationship {
		public static class Properties {
	
			
			public static String name = "MoSaRTBackEnd_AnalysisRepository::GeneralizationRelationship::properties::name";
			
			
			public static String description = "MoSaRTBackEnd_AnalysisRepository::GeneralizationRelationship::properties::description";
			
			
			public static String specificModel = "MoSaRTBackEnd_AnalysisRepository::GeneralizationRelationship::properties::specific Model";
			
			
			public static String genericModel = "MoSaRTBackEnd_AnalysisRepository::GeneralizationRelationship::properties::generic Model";
			
			
			public static String behaviorKind = "MoSaRTBackEnd_AnalysisRepository::GeneralizationRelationship::properties::behavior Kind";
			
			
			public static String locationOfGenericToSpecificModelTransformationProgram = "MoSaRTBackEnd_AnalysisRepository::GeneralizationRelationship::properties::location of generic to specific model transformation program";
			
			
			public static String locationOfSpecificToGenericModelTransformationProgram = "MoSaRTBackEnd_AnalysisRepository::GeneralizationRelationship::properties::location of specific to generic model transformation program";
			
	
		}
	
	}

	/**
	 * Deadline_Sustainability view descriptor
	 * 
	 */
	public static class Deadline_Sustainability {
		public static class Properties {
	
			
			public static String contexts = "MoSaRTBackEnd_AnalysisRepository::Deadline_Sustainability::properties::contexts";
			
			
			public static String comment = "MoSaRTBackEnd_AnalysisRepository::Deadline_Sustainability::properties::comment";
			
	
		}
	
	}

	/**
	 * Jitter_Sustainability view descriptor
	 * 
	 */
	public static class Jitter_Sustainability {
		public static class Properties {
	
			
			public static String contexts = "MoSaRTBackEnd_AnalysisRepository::Jitter_Sustainability::properties::contexts";
			
			
			public static String comment = "MoSaRTBackEnd_AnalysisRepository::Jitter_Sustainability::properties::comment";
			
	
		}
	
	}

	/**
	 * Period_Sustainability view descriptor
	 * 
	 */
	public static class Period_Sustainability {
		public static class Properties {
	
			
			public static String comment = "MoSaRTBackEnd_AnalysisRepository::Period_Sustainability::properties::comment";
			
			
			public static String contexts = "MoSaRTBackEnd_AnalysisRepository::Period_Sustainability::properties::contexts";
			
	
		}
	
	}

	/**
	 * ExecutionTime_Sustainability view descriptor
	 * 
	 */
	public static class ExecutionTime_Sustainability {
		public static class Properties {
	
			
			public static String comment = "MoSaRTBackEnd_AnalysisRepository::ExecutionTime_Sustainability::properties::comment";
			
			
			public static String contexts = "MoSaRTBackEnd_AnalysisRepository::ExecutionTime_Sustainability::properties::contexts";
			
	
		}
	
	}

	/**
	 * SufficientCondition view descriptor
	 * 
	 */
	public static class SufficientCondition {
		public static class Properties {
	
			
			public static String contexts = "MoSaRTBackEnd_AnalysisRepository::SufficientCondition::properties::contexts";
			
			
			public static String comment = "MoSaRTBackEnd_AnalysisRepository::SufficientCondition::properties::comment";
			
	
		}
	
	}

	/**
	 * NecessaryCondition view descriptor
	 * 
	 */
	public static class NecessaryCondition {
		public static class Properties {
	
			
			public static String comment = "MoSaRTBackEnd_AnalysisRepository::NecessaryCondition::properties::comment";
			
			
			public static String contexts = "MoSaRTBackEnd_AnalysisRepository::NecessaryCondition::properties::contexts";
			
	
		}
	
	}

}
