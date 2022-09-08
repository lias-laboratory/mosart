package MoSaRT.util;

import java.util.Hashtable;
import java.util.Vector;


/**
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated NOT
 */

public class AnalysisRulesInformation {
	
	Hashtable<Object, Object> analysisRulesBase;
	
	Hashtable<Object, Object> taskModelsBase;
	
	Hashtable<Object, Object> taskModelsGeneralization;
	
	Hashtable<Object, Object> taskModelsContext;
	
	Hashtable<Object, Hashtable<Object, Object>> timingTests;
	
	Hashtable<Object, Object> analysisTools;
	
	Hashtable<Object, Object> decisionTree;
	
	String summary;
	
	public AnalysisRulesInformation(){
		
		analysisRulesBase=new Hashtable<Object, Object>();
		analysisRulesBase.put("UniProcessorAnalysisRule1", "The hardware architecture is uniprocessor");
		analysisRulesBase.put("NoNetworkAnalysisRule2", "The hardware architecture does not contain a network");
		analysisRulesBase.put("NoHierarchicalSchedulingAnalysisRule3", "The system architecture does not contain a Hierarchical Scheduling");
		analysisRulesBase.put("OneSchedulerUsedAnalyisRule4", "Just one scheduler is used");
		analysisRulesBase.put("FixedPrioritySchedulingPolicyAnalysisRule5", "The type of scheduling policy is a fixed priority");
		analysisRulesBase.put("TasksPrioritiesFixedAnalysisRule6", "The scheduling policy is based on task priorities");
		analysisRulesBase.put("EveryTaskPriorityIsGivenAnalysisRule7", "All task priorities are given");
		analysisRulesBase.put("EveryTaskPriorityIsPositiveAnalysisRule8", "All task priorities are positive integer values");
		analysisRulesBase.put("NoSequencingRelationAnalysisRule9", "There is no communication or precedence relation");
		analysisRulesBase.put("EveryReleasedTimeIsGivenAnalysisRule10", "All released times are given");
		analysisRulesBase.put("IndependantReleasedTimesAnalysisRule11", "There is no dependence relation between released times");
		analysisRulesBase.put("EveryReleasedTimeIsPositiveAnalysisRule12", "All released time values are correct");
		analysisRulesBase.put("EveryTriggerPeriodicityIsGivenAnalysisRule13", "All task periodicities are given");
		analysisRulesBase.put("EveryTriggerIsPeriodicAnalysisRule14", "All Tasks are periodic");
		analysisRulesBase.put("EveryPeriodValueIsPositiveAnalysisRule15", "All period value are correct");
		analysisRulesBase.put("EveryTaskDeadlineIsGivenAnalysisRule16", "All task deadlines are given");
		analysisRulesBase.put("EveryTaskDeadlineValueIsPositiveAnalysisRule17", "All task deadline values are correct");
		analysisRulesBase.put("EveryTaskDeadlineEqualToPeriodAnalysisRule18", "For all tasks: deadline value equals to period value");
		analysisRulesBase.put("NoJitterValueAnalysisRule19", "No task jitter is mentionned");
		analysisRulesBase.put("EveryTaskIsPreemptibleAnalysisRule20", "All task are preemptible");
		analysisRulesBase.put("SimultaneousTasksAnalysisRule21", "All tasks are simultaneous");
		analysisRulesBase.put("NoSelfSuspensionTaskAnalysisRule22", "No task can be suspended by itself ");
		analysisRulesBase.put("EveryTaskExecutionTimeLessThanPeriodAnalysisRule23", "For all tasks: the execution time is less than the period");	
		
		taskModelsBase=new Hashtable<Object, Object>();
		taskModelsBase.put("Liu and Layland model", "C. L. Liu and J. W. Layland, Scheduling algorithms for multiprogramming in a hard-real-time environment, J. ACM, vol. 20, no. 1, pp. 46–61, 1973");
		taskModelsBase.put("The generalized multiframe (GMF) model", "S. Baruah, D. Chen, S. Gorinsky, and A. Mok, “Generalized multiframe tasks,” Real-Time Syst., pp. 5–22, July 1999");
		taskModelsBase.put("the sporadic model", "A. K. Mok, “Fundamental design problems of distributed systems for the hard-real-time environment,” Cambridge, MA, USA, Tech. Rep., 1983");
		taskModelsBase.put("the multiframe model", "A. K. Mok and D. Chen, “A multiframe model for real-time tasks,” IEEE Transactions on Software Engineering, vol. 23, pp. 635–645, 1996");
		taskModelsBase.put("The transaction model", "J. C. Palencia and M. Gonz´alez Harbour, “Schedulability analysis for tasks with static and dynamic offsets,” in Proceedings of the IEEE Real-Time Systems Symposium, ser. RTSS ’98. Washington, DC, USA: IEEE Computer Society, 1998");
		taskModelsBase.put("The recurring branching model", "S. K. Baruah, “Feasibility analysis of recurring branching tasks,” in ECRTS, 1998, pp. 138–145");
		taskModelsBase.put("The recurring model", "S. K. Baruah, “Dynamic and static priority scheduling of recurring real-time tasks,” vol. 24, no. 1, 2003, pp. 93–128");
		taskModelsBase.put("The non-cyclic generalized multiframe model", "N. Tchidjo Moyo, ´ E. Nicollet, F. Lafaye, and C. Moy, “On Schedulability Analysis of Non-Cyclic Generalized Multiframe Tasks,” in Proceedings of 22nd Euromicro Conference on Real-Time Systems, ECRTS’10, Bruxelles, Belgique, Jul.2010");
		taskModelsBase.put("The non-cyclic recurring model", "S. Baruah, “The non-cyclic recurring real-time task model,” in Proceedings of the 2010 31st IEEE Real-Time Systems Symposium, ser. RTSS ’10. Washington, DC, USA: IEEE Computer Society, 2010, pp. 173–182");
		taskModelsBase.put("The digraph (DRT) model", "M. Stigge, P. Ekberg, N. Guan, and W. Yi, “The digraph real-time task model,” in 17th IEEE Real-Time and Embedded Technology and Applications Symposium, RTAS 2011, Chicago, Illinois, USA, 11-14 April 2011. IEEE Computer Society, 2011, pp. 71–80");

		taskModelsGeneralization=new Hashtable<Object, Object>();
		taskModelsGeneralization.put("Liu and Layland model", "The multiframe model *AND* The sporadic model");
		taskModelsGeneralization.put("The multiframe model", "The generalized multiframe (GMF) model");
		taskModelsGeneralization.put("The generalized multiframe (GMF) model", "The recurring branching model");
		taskModelsGeneralization.put("The recurring branching model", "The recurring model");
		taskModelsGeneralization.put("The recurring model", "The non-cyclic recurring model");
		taskModelsGeneralization.put("The non-cyclic recurring model", "The digraph (DRT) model");
		taskModelsGeneralization.put("The sporadic model", "The generalized multiframe (GMF) model *AND* The non-cyclic generalized multiframe model *AND* The transaction model");
		taskModelsGeneralization.put("The non-cyclic generalized multiframe model", "The non-cyclic recurring model");
		
		taskModelsContext=new Hashtable<Object, Object>();
		taskModelsContext.put("Liu and Layland model", "1**2**3**4**5**6**7**8**9**10**11**12**13**14**15**16**17**18**19**20**21**22**23**");
	
		timingTests=new Hashtable<Object, Hashtable<Object, Object>>();
		analysisTools= new Hashtable<Object, Object>();
		
		analysisTools.clear();
		analysisTools.put("Simulation", "Cheddar");
		analysisTools.put("Response time", "Cheddar *AND* MAST");
		analysisTools.put("Utilization factor", "Cheddar *AND* MAST");
		timingTests.put("Liu and Layland model", analysisTools);
		
		decisionTree.put("Root", "NoNetworkAnalysisRule2");
		decisionTree.put("NoNetworkAnalysisRule2", "UniProcessorAnalysisRule1");
		decisionTree.put("UniProcessorAnalysisRule1", "NoHierarchicalSchedulingAnalysisRule3");
		decisionTree.put("NoHierarchicalSchedulingAnalysisRule3", "OneSchedulerUsedAnalyisRule4");
		decisionTree.put("OneSchedulerUsedAnalyisRule4", "FixedPrioritySchedulingPolicyAnalysisRule5");
		decisionTree.put("FixedPrioritySchedulingPolicyAnalysisRule5", "TasksPrioritiesFixedAnalysisRule6");
		decisionTree.put("TasksPrioritiesFixedAnalysisRule6", "EveryTaskPriorityIsGivenAnalysisRule7");
		decisionTree.put("EveryTaskPriorityIsGivenAnalysisRule7", "EveryTaskPriorityIsPositiveAnalysisRule8");
		decisionTree.put("EveryTaskPriorityIsPositiveAnalysisRule8", "NoSequencingRelationAnalysisRule9");
		decisionTree.put("NoSequencingRelationAnalysisRule9", "EveryReleasedTimeIsGivenAnalysisRule10");
		decisionTree.put("EveryReleasedTimeIsGivenAnalysisRule10", "IndependantReleasedTimesAnalysisRule11");
		decisionTree.put("IndependantReleasedTimesAnalysisRule11", "EveryReleasedTimeIsPositiveAnalysisRule12");
		decisionTree.put("EveryReleasedTimeIsPositiveAnalysisRule12", "EveryTriggerPeriodicityIsGivenAnalysisRule13");
		decisionTree.put("EveryTriggerPeriodicityIsGivenAnalysisRule13", "EveryTriggerIsPeriodicAnalysisRule14");
		decisionTree.put("EveryTriggerIsPeriodicAnalysisRule14", "EveryPeriodValueIsPositiveAnalysisRule15");
		decisionTree.put("EveryPeriodValueIsPositiveAnalysisRule15", "EveryTaskDeadlineIsGivenAnalysisRule16");
		decisionTree.put("EveryTaskDeadlineIsGivenAnalysisRule16", "EveryTaskDeadlineValueIsPositiveAnalysisRule17");
		decisionTree.put("EveryTaskDeadlineValueIsPositiveAnalysisRule17", "EveryTaskDeadlineEqualToPeriodAnalysisRule18");
		decisionTree.put("EveryTaskDeadlineEqualToPeriodAnalysisRule18", "NoJitterValueAnalysisRule19");
		decisionTree.put("NoJitterValueAnalysisRule19", "EveryTaskIsPreemptibleAnalysisRule20");
		decisionTree.put("EveryTaskIsPreemptibleAnalysisRule20", "SimultaneousTasksAnalysisRule21");
		decisionTree.put("SimultaneousTasksAnalysisRule21", "NoSelfSuspensionTaskAnalysisRule22");
		decisionTree.put("NoSelfSuspensionTaskAnalysisRule22", "EveryTaskExecutionTimeLessThanPeriodAnalysisRule23");
	
	}
	
	public String getAppropriateMessage (String rule) {
		
		return (String) analysisRulesBase.get(rule);
	}
	
	public Vector<String> start() {
		
		Vector<String> rules=new Vector<String>();
		
		String [] rslt= ((String)decisionTree.get("Root")).split("*OR*");
		
		for(int i=0; i< rslt.length;i++){
			rules.addElement(rslt[i].trim());
		}
		
		return rules;
	}
	
	public Vector<String> subRules(String rule) {
			
			Vector<String> subrules=new Vector<String>();
			
			String [] rslt= ((String)decisionTree.get(rule)).split("*OR*");
			
			for(int i=0; i< rslt.length;i++){
				subrules.addElement(rslt[i].trim());
			}
			
		return subrules;
	}
	
	public boolean taskModelFound(String s){
		
		return taskModelsContext.containsValue(s);
		
	}
	
	public void updateSummary(String s){
		
		summary=s;
		
	}

}
