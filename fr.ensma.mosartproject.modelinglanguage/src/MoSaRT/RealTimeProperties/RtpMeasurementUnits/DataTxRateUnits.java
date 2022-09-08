/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.RealTimeProperties.RtpMeasurementUnits;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Data Tx Rate Units</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see MoSaRT.RealTimeProperties.RtpMeasurementUnits.RtpMeasurementUnitsPackage#getDataTxRateUnits()
 * @model
 * @generated
 */
public enum DataTxRateUnits implements Enumerator {
	/**
	 * The '<em><b>Bper s</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BPER_S_VALUE
	 * @generated
	 * @ordered
	 */
	BPER_S(0, "b_per_s", "b_per_s"), /**
	 * The '<em><b>Kb per s</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KB_PER_S_VALUE
	 * @generated
	 * @ordered
	 */
	KB_PER_S(1, "Kb_per_s", "Kb_per_s"),

	/**
	 * The '<em><b>Mb per s</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MB_PER_S_VALUE
	 * @generated
	 * @ordered
	 */
	MB_PER_S(2, "Mb_per_s", "Mb_per_s"), /**
	 * The '<em><b>Gb per s</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GB_PER_S_VALUE
	 * @generated
	 * @ordered
	 */
	GB_PER_S(3, "Gb_per_s", "Gb_per_s");

	/**
	 * The '<em><b>Bper s</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Bper s</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BPER_S
	 * @model name="b_per_s"
	 * @generated
	 * @ordered
	 */
	public static final int BPER_S_VALUE = 0;

	/**
	 * The '<em><b>Kb per s</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Kb per s</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KB_PER_S
	 * @model name="Kb_per_s"
	 * @generated
	 * @ordered
	 */
	public static final int KB_PER_S_VALUE = 1;

	/**
	 * The '<em><b>Mb per s</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mb per s</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MB_PER_S
	 * @model name="Mb_per_s"
	 * @generated
	 * @ordered
	 */
	public static final int MB_PER_S_VALUE = 2;

	/**
	 * The '<em><b>Gb per s</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Gb per s</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GB_PER_S
	 * @model name="Gb_per_s"
	 * @generated
	 * @ordered
	 */
	public static final int GB_PER_S_VALUE = 3;

	/**
	 * An array of all the '<em><b>Data Tx Rate Units</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DataTxRateUnits[] VALUES_ARRAY =
		new DataTxRateUnits[] {
			BPER_S,
			KB_PER_S,
			MB_PER_S,
			GB_PER_S,
		};

	/**
	 * A public read-only list of all the '<em><b>Data Tx Rate Units</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DataTxRateUnits> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Data Tx Rate Units</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataTxRateUnits get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DataTxRateUnits result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Data Tx Rate Units</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataTxRateUnits getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DataTxRateUnits result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Data Tx Rate Units</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataTxRateUnits get(int value) {
		switch (value) {
			case BPER_S_VALUE: return BPER_S;
			case KB_PER_S_VALUE: return KB_PER_S;
			case MB_PER_S_VALUE: return MB_PER_S;
			case GB_PER_S_VALUE: return GB_PER_S;
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
	private DataTxRateUnits(int value, String name, String literal) {
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
	
} //DataTxRateUnits
