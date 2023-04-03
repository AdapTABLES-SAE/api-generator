/**
 */
package generator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ECorrectness</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see generator.GeneratorPackage#getECorrectness()
 * @model
 * @generated
 */
public enum ECorrectness implements Enumerator {
	/**
	 * The '<em><b>CORRECT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CORRECT_VALUE
	 * @generated
	 * @ordered
	 */
	CORRECT(0, "CORRECT", "CORRECT"),

	/**
	 * The '<em><b>INCORRECT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INCORRECT_VALUE
	 * @generated
	 * @ordered
	 */
	INCORRECT(0, "INCORRECT", "INCORRECT"),

	/**
	 * The '<em><b>FACT CORRECTNESS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FACT_CORRECTNESS_VALUE
	 * @generated
	 * @ordered
	 */
	FACT_CORRECTNESS(2, "FACT_CORRECTNESS", "FACT_CORRECTNESS"),

	/**
	 * The '<em><b>NOT FACT CORRECTNESS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_FACT_CORRECTNESS_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_FACT_CORRECTNESS(3, "NOT_FACT_CORRECTNESS", "NOT_FACT_CORRECTNESS");

	/**
	 * The '<em><b>CORRECT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CORRECT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CORRECT_VALUE = 0;

	/**
	 * The '<em><b>INCORRECT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INCORRECT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INCORRECT_VALUE = 0;

	/**
	 * The '<em><b>FACT CORRECTNESS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FACT_CORRECTNESS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FACT_CORRECTNESS_VALUE = 2;

	/**
	 * The '<em><b>NOT FACT CORRECTNESS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_FACT_CORRECTNESS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NOT_FACT_CORRECTNESS_VALUE = 3;

	/**
	 * An array of all the '<em><b>ECorrectness</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ECorrectness[] VALUES_ARRAY = new ECorrectness[] { CORRECT, INCORRECT, FACT_CORRECTNESS,
			NOT_FACT_CORRECTNESS, };

	/**
	 * A public read-only list of all the '<em><b>ECorrectness</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ECorrectness> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ECorrectness</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ECorrectness get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ECorrectness result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ECorrectness</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ECorrectness getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ECorrectness result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ECorrectness</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ECorrectness get(int value) {
		switch (value) {
		case CORRECT_VALUE:
			return CORRECT;
		case FACT_CORRECTNESS_VALUE:
			return FACT_CORRECTNESS;
		case NOT_FACT_CORRECTNESS_VALUE:
			return NOT_FACT_CORRECTNESS;
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
	private ECorrectness(int value, String name, String literal) {
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

} //ECorrectness
