/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRTBackEnd_AnalysisRepository;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Behavior Kind Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see MoSaRTBackEnd_AnalysisRepository.MoSaRTBackEnd_AnalysisRepositoryPackage#getBehaviorKindType()
 * @model
 * @generated
 */
public enum BehaviorKindType implements Enumerator {
	/**
	 * The '<em><b>Worst Case Behavior</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WORST_CASE_BEHAVIOR_VALUE
	 * @generated
	 * @ordered
	 */
	WORST_CASE_BEHAVIOR(0, "worstCaseBehavior", "worstCaseBehavior"),

	/**
	 * The '<em><b>Best Case Behavior</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BEST_CASE_BEHAVIOR_VALUE
	 * @generated
	 * @ordered
	 */
	BEST_CASE_BEHAVIOR(1, "bestCaseBehavior", "bestCaseBehavior");

	/**
	 * The '<em><b>Worst Case Behavior</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Worst Case Behavior</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WORST_CASE_BEHAVIOR
	 * @model name="worstCaseBehavior"
	 * @generated
	 * @ordered
	 */
	public static final int WORST_CASE_BEHAVIOR_VALUE = 0;

	/**
	 * The '<em><b>Best Case Behavior</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Best Case Behavior</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BEST_CASE_BEHAVIOR
	 * @model name="bestCaseBehavior"
	 * @generated
	 * @ordered
	 */
	public static final int BEST_CASE_BEHAVIOR_VALUE = 1;

	/**
	 * An array of all the '<em><b>Behavior Kind Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final BehaviorKindType[] VALUES_ARRAY =
		new BehaviorKindType[] {
			WORST_CASE_BEHAVIOR,
			BEST_CASE_BEHAVIOR,
		};

	/**
	 * A public read-only list of all the '<em><b>Behavior Kind Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<BehaviorKindType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Behavior Kind Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BehaviorKindType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BehaviorKindType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Behavior Kind Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BehaviorKindType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BehaviorKindType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Behavior Kind Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BehaviorKindType get(int value) {
		switch (value) {
			case WORST_CASE_BEHAVIOR_VALUE: return WORST_CASE_BEHAVIOR;
			case BEST_CASE_BEHAVIOR_VALUE: return BEST_CASE_BEHAVIOR;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private BehaviorKindType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //BehaviorKindType
