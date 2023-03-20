/**
 */
package generator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Element Category</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see generator.GeneratorPackage#getElementCategory()
 * @model
 * @generated
 */
public enum ElementCategory implements Enumerator {
	/**
	 * The '<em><b>DECORATIVE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DECORATIVE_VALUE
	 * @generated
	 * @ordered
	 */
	DECORATIVE(0, "DECORATIVE", "DECORATIVE"),

	/**
	 * The '<em><b>SINGLE ANSWER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SINGLE_ANSWER_VALUE
	 * @generated
	 * @ordered
	 */
	SINGLE_ANSWER(1, "SINGLE_ANSWER", "SINGLE_ANSWER"),

	/**
	 * The '<em><b>MULTIPLE ANSWER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTIPLE_ANSWER_VALUE
	 * @generated
	 * @ordered
	 */
	MULTIPLE_ANSWER(2, "MULTIPLE_ANSWER", "MULTIPLE_ANSWER");

	/**
	 * The '<em><b>DECORATIVE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DECORATIVE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DECORATIVE_VALUE = 0;

	/**
	 * The '<em><b>SINGLE ANSWER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SINGLE_ANSWER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SINGLE_ANSWER_VALUE = 1;

	/**
	 * The '<em><b>MULTIPLE ANSWER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTIPLE_ANSWER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MULTIPLE_ANSWER_VALUE = 2;

	/**
	 * An array of all the '<em><b>Element Category</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ElementCategory[] VALUES_ARRAY = new ElementCategory[] { DECORATIVE, SINGLE_ANSWER,
			MULTIPLE_ANSWER, };

	/**
	 * A public read-only list of all the '<em><b>Element Category</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ElementCategory> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Element Category</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ElementCategory get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ElementCategory result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Element Category</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ElementCategory getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ElementCategory result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Element Category</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ElementCategory get(int value) {
		switch (value) {
		case DECORATIVE_VALUE:
			return DECORATIVE;
		case SINGLE_ANSWER_VALUE:
			return SINGLE_ANSWER;
		case MULTIPLE_ANSWER_VALUE:
			return MULTIPLE_ANSWER;
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
	private ElementCategory(int value, String name, String literal) {
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

} //ElementCategory
