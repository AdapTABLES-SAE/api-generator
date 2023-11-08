/**
 */
package generator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ERoom Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see generator.GeneratorPackage#getERoomType()
 * @model
 * @generated
 */
public enum ERoomType implements Enumerator {
	/**
	 * The '<em><b>ENTRY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENTRY_VALUE
	 * @generated
	 * @ordered
	 */
	ENTRY(0, "ENTRY", "ENTRY"),

	/**
	 * The '<em><b>EXIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXIT_VALUE
	 * @generated
	 * @ordered
	 */
	EXIT(1, "EXIT", "EXIT"),

	/**
	 * The '<em><b>QUESTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QUESTION_VALUE
	 * @generated
	 * @ordered
	 */
	QUESTION(2, "QUESTION", "QUESTION"),

	/**
	 * The '<em><b>TRAP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRAP_VALUE
	 * @generated
	 * @ordered
	 */
	TRAP(3, "TRAP", "TRAP"),
	/**
	 * The '<em><b>PORTAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #PORTAL_VALUE
	 * @generated
	 * @ordered
	 */
	PORTAL(3, "PORTAL", "PORTAL");

	/**
	 * The '<em><b>ENTRY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENTRY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ENTRY_VALUE = 0;

	/**
	 * The '<em><b>EXIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EXIT_VALUE = 1;

	/**
	 * The '<em><b>QUESTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QUESTION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int QUESTION_VALUE = 2;

	/**
	 * The '<em><b>TRAP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRAP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TRAP_VALUE = 3;

	/**
	 * The '<em><b>PORTAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PORTAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PORTAL_VALUE = 3;

	/**
	 * An array of all the '<em><b>ERoom Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ERoomType[] VALUES_ARRAY = new ERoomType[] { ENTRY, EXIT, QUESTION, TRAP, PORTAL, };

	/**
	 * A public read-only list of all the '<em><b>ERoom Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ERoomType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ERoom Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ERoomType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ERoomType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ERoom Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ERoomType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ERoomType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ERoom Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ERoomType get(int value) {
		switch (value) {
		case ENTRY_VALUE:
			return ENTRY;
		case EXIT_VALUE:
			return EXIT;
		case QUESTION_VALUE:
			return QUESTION;
		case TRAP_VALUE:
			return TRAP;
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
	private ERoomType(int value, String name, String literal) {
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

} //ERoomType
