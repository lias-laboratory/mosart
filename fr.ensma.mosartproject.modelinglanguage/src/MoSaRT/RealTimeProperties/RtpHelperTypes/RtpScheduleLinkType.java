/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.RealTimeProperties.RtpHelperTypes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Rtp Schedule Link Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpHelperTypesPackage#getRtpScheduleLinkType()
 * @model
 * @generated
 */
public enum RtpScheduleLinkType implements Enumerator {
	/**
	 * The '<em><b>After the beginning of</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AFTER_THE_BEGINNING_OF_VALUE
	 * @generated
	 * @ordered
	 */
	AFTER_THE_BEGINNING_OF(0, "after_the_beginning_of", "after_the_beginning_of"),

	/**
	 * The '<em><b>After the end of</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AFTER_THE_END_OF_VALUE
	 * @generated
	 * @ordered
	 */
	AFTER_THE_END_OF(1, "after_the_end_of", "after_the_end_of");

	/**
	 * The '<em><b>After the beginning of</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>After the beginning of</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AFTER_THE_BEGINNING_OF
	 * @model name="after_the_beginning_of"
	 * @generated
	 * @ordered
	 */
	public static final int AFTER_THE_BEGINNING_OF_VALUE = 0;

	/**
	 * The '<em><b>After the end of</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>After the end of</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AFTER_THE_END_OF
	 * @model name="after_the_end_of"
	 * @generated
	 * @ordered
	 */
	public static final int AFTER_THE_END_OF_VALUE = 1;

	/**
	 * An array of all the '<em><b>Rtp Schedule Link Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RtpScheduleLinkType[] VALUES_ARRAY =
		new RtpScheduleLinkType[] {
			AFTER_THE_BEGINNING_OF,
			AFTER_THE_END_OF,
		};

	/**
	 * A public read-only list of all the '<em><b>Rtp Schedule Link Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RtpScheduleLinkType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Rtp Schedule Link Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RtpScheduleLinkType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RtpScheduleLinkType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Rtp Schedule Link Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RtpScheduleLinkType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RtpScheduleLinkType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Rtp Schedule Link Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RtpScheduleLinkType get(int value) {
		switch (value) {
			case AFTER_THE_BEGINNING_OF_VALUE: return AFTER_THE_BEGINNING_OF;
			case AFTER_THE_END_OF_VALUE: return AFTER_THE_END_OF;
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
	private RtpScheduleLinkType(int value, String name, String literal) {
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
	
} //RtpScheduleLinkType
