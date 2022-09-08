/**
 */
package MoSaRTBackEnd_AnalysisRepository;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Timing Kind Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see MoSaRTBackEnd_AnalysisRepository.MoSaRTBackEnd_AnalysisRepositoryPackage#getTimingKindType()
 * @model
 * @generated
 */
public enum TimingKindType implements Enumerator {
	/**
	 * The '<em><b>Improving</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMPROVING_VALUE
	 * @generated
	 * @ordered
	 */
	IMPROVING(2, "improving", "improving"),

	/**
	 * The '<em><b>Worsening</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WORSENING_VALUE
	 * @generated
	 * @ordered
	 */
	WORSENING(1, "worsening", "worsening"),

	/**
	 * The '<em><b>Indifferent</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INDIFFERENT_VALUE
	 * @generated
	 * @ordered
	 */
	INDIFFERENT(0, "indifferent", "indifferent");

	/**
	 * The '<em><b>Improving</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Improving</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IMPROVING
	 * @model name="improving"
	 * @generated
	 * @ordered
	 */
	public static final int IMPROVING_VALUE = 2;

	/**
	 * The '<em><b>Worsening</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Worsening</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WORSENING
	 * @model name="worsening"
	 * @generated
	 * @ordered
	 */
	public static final int WORSENING_VALUE = 1;

	/**
	 * The '<em><b>Indifferent</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Indifferent</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INDIFFERENT
	 * @model name="indifferent"
	 * @generated
	 * @ordered
	 */
	public static final int INDIFFERENT_VALUE = 0;

	/**
	 * An array of all the '<em><b>Timing Kind Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TimingKindType[] VALUES_ARRAY =
		new TimingKindType[] {
			IMPROVING,
			WORSENING,
			INDIFFERENT,
		};

	/**
	 * A public read-only list of all the '<em><b>Timing Kind Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TimingKindType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Timing Kind Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TimingKindType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TimingKindType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Timing Kind Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TimingKindType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TimingKindType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Timing Kind Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TimingKindType get(int value) {
		switch (value) {
			case IMPROVING_VALUE: return IMPROVING;
			case WORSENING_VALUE: return WORSENING;
			case INDIFFERENT_VALUE: return INDIFFERENT;
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
	private TimingKindType(int value, String name, String literal) {
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
	
} //TimingKindType
