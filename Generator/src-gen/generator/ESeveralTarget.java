/**
 */
package generator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ESeveral Target</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see generator.GeneratorPackage#getESeveralTarget()
 * @model
 * @generated
 */
public enum ESeveralTarget implements Enumerator {
	/**
	 * The '<em><b>OPERAND TABLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPERAND_TABLE_VALUE
	 * @generated
	 * @ordered
	 */
	OPERAND_TABLE(0, "OPERAND_TABLE", "OPERAND_TABLE"),

	/**
	 * The '<em><b>OPERAND RESULT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPERAND_RESULT_VALUE
	 * @generated
	 * @ordered
	 */
	OPERAND_RESULT(1, "OPERAND_RESULT", "OPERAND_RESULT"),

	/**
	 * The '<em><b>TABLE RESULT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TABLE_RESULT_VALUE
	 * @generated
	 * @ordered
	 */
	TABLE_RESULT(2, "TABLE_RESULT", "TABLE_RESULT");

	/**
	 * The '<em><b>OPERAND TABLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPERAND_TABLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OPERAND_TABLE_VALUE = 0;

	/**
	 * The '<em><b>OPERAND RESULT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPERAND_RESULT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OPERAND_RESULT_VALUE = 1;

	/**
	 * The '<em><b>TABLE RESULT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TABLE_RESULT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TABLE_RESULT_VALUE = 2;

	/**
	 * An array of all the '<em><b>ESeveral Target</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ESeveralTarget[] VALUES_ARRAY = new ESeveralTarget[] { OPERAND_TABLE, OPERAND_RESULT,
			TABLE_RESULT, };

	/**
	 * A public read-only list of all the '<em><b>ESeveral Target</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ESeveralTarget> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ESeveral Target</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ESeveralTarget get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ESeveralTarget result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ESeveral Target</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ESeveralTarget getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ESeveralTarget result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ESeveral Target</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ESeveralTarget get(int value) {
		switch (value) {
		case OPERAND_TABLE_VALUE:
			return OPERAND_TABLE;
		case OPERAND_RESULT_VALUE:
			return OPERAND_RESULT;
		case TABLE_RESULT_VALUE:
			return TABLE_RESULT;
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
	private ESeveralTarget(int value, String name, String literal) {
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

} //ESeveralTarget
