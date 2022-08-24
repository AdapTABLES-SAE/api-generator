/**
 */
package generator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Sub Objective Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see generator.GeneratorPackage#getSubObjectiveType()
 * @model
 * @generated
 */
public enum SubObjectiveType implements Enumerator {
	/**
	 * The '<em><b>COMPLETION1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPLETION1_VALUE
	 * @generated
	 * @ordered
	 */
	COMPLETION1(0, "COMPLETION1", "COMPLETION1"),

	/**
	 * The '<em><b>COMPLETION2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPLETION2_VALUE
	 * @generated
	 * @ordered
	 */
	COMPLETION2(1, "COMPLETION2", "COMPLETION2"),

	/**
	 * The '<em><b>RECONSTRUCTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RECONSTRUCTION_VALUE
	 * @generated
	 * @ordered
	 */
	RECONSTRUCTION(2, "RECONSTRUCTION", "RECONSTRUCTION"),

	/**
	 * The '<em><b>QF VALIDITY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QF_VALIDITY_VALUE
	 * @generated
	 * @ordered
	 */
	QF_VALIDITY(3, "QF_VALIDITY", "QF_VALIDITY"),

	/**
	 * The '<em><b>RES VALIDITY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RES_VALIDITY_VALUE
	 * @generated
	 * @ordered
	 */
	RES_VALIDITY(4, "RES_VALIDITY", "RES_VALIDITY"),

	/**
	 * The '<em><b>PB RESOLUTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PB_RESOLUTION_VALUE
	 * @generated
	 * @ordered
	 */
	PB_RESOLUTION(5, "PB_RESOLUTION", "PB_RESOLUTION");

	/**
	 * The '<em><b>COMPLETION1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPLETION1
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COMPLETION1_VALUE = 0;

	/**
	 * The '<em><b>COMPLETION2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPLETION2
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COMPLETION2_VALUE = 1;

	/**
	 * The '<em><b>RECONSTRUCTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RECONSTRUCTION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RECONSTRUCTION_VALUE = 2;

	/**
	 * The '<em><b>QF VALIDITY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QF_VALIDITY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int QF_VALIDITY_VALUE = 3;

	/**
	 * The '<em><b>RES VALIDITY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RES_VALIDITY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RES_VALIDITY_VALUE = 4;

	/**
	 * The '<em><b>PB RESOLUTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PB_RESOLUTION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PB_RESOLUTION_VALUE = 5;

	/**
	 * An array of all the '<em><b>Sub Objective Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SubObjectiveType[] VALUES_ARRAY = new SubObjectiveType[] { COMPLETION1, COMPLETION2,
			RECONSTRUCTION, QF_VALIDITY, RES_VALIDITY, PB_RESOLUTION, };

	/**
	 * A public read-only list of all the '<em><b>Sub Objective Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SubObjectiveType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Sub Objective Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SubObjectiveType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SubObjectiveType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Sub Objective Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SubObjectiveType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SubObjectiveType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Sub Objective Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SubObjectiveType get(int value) {
		switch (value) {
		case COMPLETION1_VALUE:
			return COMPLETION1;
		case COMPLETION2_VALUE:
			return COMPLETION2;
		case RECONSTRUCTION_VALUE:
			return RECONSTRUCTION;
		case QF_VALIDITY_VALUE:
			return QF_VALIDITY;
		case RES_VALIDITY_VALUE:
			return RES_VALIDITY;
		case PB_RESOLUTION_VALUE:
			return PB_RESOLUTION;
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
	private SubObjectiveType(int value, String name, String literal) {
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

} //SubObjectiveType
