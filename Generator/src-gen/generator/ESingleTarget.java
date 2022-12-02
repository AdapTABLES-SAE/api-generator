/**
 */
package generator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ESingle Target</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see generator.GeneratorPackage#getESingleTarget()
 * @model
 * @generated
 */
public enum ESingleTarget implements Enumerator {
	/**
	 * The '<em><b>RESULT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESULT_VALUE
	 * @generated
	 * @ordered
	 */
	RESULT(0, "RESULT", "RESULT"),

	/**
	 * The '<em><b>TABLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TABLE_VALUE
	 * @generated
	 * @ordered
	 */
	TABLE(1, "TABLE", "TABLE"),

	/**
	 * The '<em><b>OPERAND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPERAND_VALUE
	 * @generated
	 * @ordered
	 */
	OPERAND(2, "OPERAND", "OPERAND");

	/**
	 * The '<em><b>RESULT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESULT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RESULT_VALUE = 0;

	/**
	 * The '<em><b>TABLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TABLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TABLE_VALUE = 1;

	/**
	 * The '<em><b>OPERAND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPERAND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OPERAND_VALUE = 2;

	/**
	 * An array of all the '<em><b>ESingle Target</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ESingleTarget[] VALUES_ARRAY = new ESingleTarget[] { RESULT, TABLE, OPERAND, };

	/**
	 * A public read-only list of all the '<em><b>ESingle Target</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ESingleTarget> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ESingle Target</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ESingleTarget get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ESingleTarget result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ESingle Target</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ESingleTarget getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ESingleTarget result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ESingle Target</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ESingleTarget get(int value) {
		switch (value) {
		case RESULT_VALUE:
			return RESULT;
		case TABLE_VALUE:
			return TABLE;
		case OPERAND_VALUE:
			return OPERAND;
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
	private ESingleTarget(int value, String name, String literal) {
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

} //ESingleTarget
