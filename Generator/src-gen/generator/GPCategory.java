/**
 */
package generator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>GP Category</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see generator.GeneratorPackage#getGPCategory()
 * @model
 * @generated
 */
public enum GPCategory implements Enumerator {
	/**
	 * The '<em><b>SELECT UNIQUE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SELECT_UNIQUE_VALUE
	 * @generated
	 * @ordered
	 */
	SELECT_UNIQUE(0, "SELECT_UNIQUE", "SELECT_UNIQUE"),

	/**
	 * The '<em><b>SELECT MULTIPLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SELECT_MULTIPLE_VALUE
	 * @generated
	 * @ordered
	 */
	SELECT_MULTIPLE(0, "SELECT_MULTIPLE", "SELECT_MULTIPLE"),

	/**
	 * The '<em><b>DIRECT RESPONSE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIRECT_RESPONSE_VALUE
	 * @generated
	 * @ordered
	 */
	DIRECT_RESPONSE(1, "DIRECT_RESPONSE", "DIRECT_RESPONSE"),

	/**
	 * The '<em><b>MOVE UNIQUE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOVE_UNIQUE_VALUE
	 * @generated
	 * @ordered
	 */
	MOVE_UNIQUE(7, "MOVE_UNIQUE", "MOVE_UNIQUE"),

	/**
	 * The '<em><b>MOVE MULTIPLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOVE_MULTIPLE_VALUE
	 * @generated
	 * @ordered
	 */
	MOVE_MULTIPLE(8, "MOVE_MULTIPLE", "MOVE_MULTIPLE"),
	/**
	 * The '<em><b>ORIENT UNIQUE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #ORIENT_UNIQUE_VALUE
	 * @generated
	 * @ordered
	 */
	ORIENT_UNIQUE(5, "ORIENT_UNIQUE", "ORIENT_UNIQUE");

	/**
	 * The '<em><b>SELECT UNIQUE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SELECT_UNIQUE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SELECT_UNIQUE_VALUE = 0;

	/**
	 * The '<em><b>SELECT MULTIPLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SELECT_MULTIPLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SELECT_MULTIPLE_VALUE = 0;

	/**
	 * The '<em><b>DIRECT RESPONSE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIRECT_RESPONSE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DIRECT_RESPONSE_VALUE = 1;

	/**
	 * The '<em><b>MOVE UNIQUE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOVE_UNIQUE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MOVE_UNIQUE_VALUE = 7;

	/**
	 * The '<em><b>MOVE MULTIPLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOVE_MULTIPLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MOVE_MULTIPLE_VALUE = 8;

	/**
	 * The '<em><b>ORIENT UNIQUE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORIENT_UNIQUE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ORIENT_UNIQUE_VALUE = 5;

	/**
	 * An array of all the '<em><b>GP Category</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final GPCategory[] VALUES_ARRAY = new GPCategory[] { SELECT_UNIQUE, SELECT_MULTIPLE, DIRECT_RESPONSE,
			MOVE_UNIQUE, MOVE_MULTIPLE, ORIENT_UNIQUE, };

	/**
	 * A public read-only list of all the '<em><b>GP Category</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<GPCategory> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>GP Category</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GPCategory get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GPCategory result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>GP Category</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GPCategory getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GPCategory result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>GP Category</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GPCategory get(int value) {
		switch (value) {
		case SELECT_UNIQUE_VALUE:
			return SELECT_UNIQUE;
		case DIRECT_RESPONSE_VALUE:
			return DIRECT_RESPONSE;
		case MOVE_UNIQUE_VALUE:
			return MOVE_UNIQUE;
		case MOVE_MULTIPLE_VALUE:
			return MOVE_MULTIPLE;
		case ORIENT_UNIQUE_VALUE:
			return ORIENT_UNIQUE;
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
	private GPCategory(int value, String name, String literal) {
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

} //GPCategory
