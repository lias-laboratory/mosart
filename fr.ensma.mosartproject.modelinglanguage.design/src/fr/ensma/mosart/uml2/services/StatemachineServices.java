package fr.ensma.mosart.uml2.services;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Pseudostate;
import org.eclipse.uml2.uml.PseudostateKind;
import org.eclipse.uml2.uml.Region;
import org.eclipse.uml2.uml.StateMachine;
import org.eclipse.uml2.uml.UMLFactory;

public class StatemachineServices {
	/**
	 * Create an statemachine under a behaviored classifier (class, component, use case).
	 * 
	 * @param parent
	 *            The parent
	 * @return An statemachine
	 */
	public StateMachine initStatemachineForClass(org.eclipse.uml2.uml.BehavioredClassifier parent) {
		StateMachine statemachine = getStatemachine(parent);
		parent.getOwnedBehaviors().add(statemachine);
		return statemachine;
	}

	/**
	 * Create an statemachine under a package.
	 * 
	 * @param pkg
	 *            The package
	 * @return An statemachine
	 */
	public StateMachine initStatemachineForPackage(org.eclipse.uml2.uml.Package pkg) {
		StateMachine statemachine = getStatemachine(pkg);
		pkg.getPackagedElements().add(statemachine);
		return statemachine;
	}

	/**
	 * Get an statemachine.
	 * 
	 * @param parent
	 *            Parent
	 * @return Statemachine
	 */
	private StateMachine getStatemachine(NamedElement parent) {
		// Check if an statemachine already exists
		if (parent.eContents() != null && parent.eContents().size() > 0) {
			for (EObject obj : parent.eContents()) {
				if (obj instanceof StateMachine) {
					// There's already an statemachine
					// Do nothing
					return (StateMachine)obj;
				}
			}
		}
		StateMachine statemachine = UMLFactory.eINSTANCE.createStateMachine();
		String statemachineLabel = parent.getName() + " statemachine";
		Region region = UMLFactory.eINSTANCE.createRegion();
		region.setName("Region1");
		statemachine.getRegions().add(region);
		statemachine.setName(statemachineLabel);
		return statemachine;
	}

	public boolean isInitialState(Pseudostate state) {
		return state.getKind().equals(PseudostateKind.INITIAL_LITERAL);
	}

	public boolean isForkState(Pseudostate state) {
		return state.getKind().equals(PseudostateKind.FORK_LITERAL);
	}

	public boolean isJoinState(Pseudostate state) {
		return state.getKind().equals(PseudostateKind.JOIN_LITERAL);
	}

	public boolean isChoiceState(Pseudostate state) {
		return state.getKind().equals(PseudostateKind.CHOICE_LITERAL);
	}

	public boolean isJunctionState(Pseudostate state) {
		return state.getKind().equals(PseudostateKind.JUNCTION_LITERAL);
	}

	public boolean isTerminateState(Pseudostate state) {
		return state.getKind().equals(PseudostateKind.TERMINATE_LITERAL);
	}

	public boolean isShallowHistoryState(Pseudostate state) {
		return state.getKind().equals(PseudostateKind.SHALLOW_HISTORY_LITERAL);
	}

	public boolean isDeepHistoryState(Pseudostate state) {
		return state.getKind().equals(PseudostateKind.DEEP_HISTORY_LITERAL);
	}

	public boolean isExitPoint(Pseudostate state) {
		return state.getKind().equals(PseudostateKind.EXIT_POINT_LITERAL);
	}
}
