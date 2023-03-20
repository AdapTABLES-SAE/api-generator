/**
 */
package generator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Statement Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see generator.GeneratorPackage#getStatementType()
 * @model
 * @generated
 */
public enum StatementType implements Enumerator {
	/**
	 * The '<em><b>TEXTUAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXTUAL_VALUE
	 * @generated
	 * @ordered
	 */
	TEXTUAL(0, "TEXTUAL", "TEXTUAL"),

	/**
	 * The '<em><b>GRAPHIC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GRAPHIC_VALUE
	 * @generated
	 * @ordered
	 */
	GRAPHIC(1, "GRAPHIC", "GRAPHIC"),

	/**
	 * The '<em><b>TO FILL IN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TO_FILL_IN_VALUE
	 * @generated
	 * @ordered
	 */
	TO_FILL_IN(2, "TO_FILL_IN", "TO_FILL_IN"),

	/**
	 * The '<em><b>NONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(3, "NONE", "NONE"),
	/**
	 * The '<em><b>TEXTUAL INTERACTIVE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #TEXTUAL_INTERACTIVE_VALUE
	 * @generated
	 * @ordered
	 */
	TEXTUAL_INTERACTIVE(0, "TEXTUAL_INTERACTIVE", "TEXTUAL_INTERACTIVE");

	/**
	 * The '<em><b>TEXTUAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXTUAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TEXTUAL_VALUE = 0;

	/**
	 * The '<em><b>GRAPHIC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GRAPHIC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GRAPHIC_VALUE = 1;

	/**
	 * The '<em><b>TO FILL IN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TO_FILL_IN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TO_FILL_IN_VALUE = 2;

	/**
	 * The '<em><b>NONE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NONE_VALUE = 3;

	/**
	 * The '<em><b>TEXTUAL INTERACTIVE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXTUAL_INTERACTIVE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TEXTUAL_INTERACTIVE_VALUE = 0;

	/**
	 * An array of all the '<em><b>Statement Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final StatementType[] VALUES_ARRAY = new StatementType[] { TEXTUAL, GRAPHIC, TO_FILL_IN, NONE,
			TEXTUAL_INTERACTIVE, };

	/**
	 * A public read-only list of all the '<em><b>Statement Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<StatementType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Statement Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StatementType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StatementType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Statement Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StatementType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StatementType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Statement Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StatementType get(int value) {
		switch (value) {
		case TEXTUAL_VALUE:
			return TEXTUAL;
		case GRAPHIC_VALUE:
			return GRAPHIC;
		case TO_FILL_IN_VALUE:
			return TO_FILL_IN;
		case NONE_VALUE:
			return NONE;
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
	private StatementType(int value, String name, String literal) {
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

} //StatementType
