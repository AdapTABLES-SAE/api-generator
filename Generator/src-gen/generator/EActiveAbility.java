/**
 */
package generator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>EActive Ability</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see generator.GeneratorPackage#getEActiveAbility()
 * @model
 * @generated
 */
public enum EActiveAbility implements Enumerator {
	/**
	 * The '<em><b>PORTABLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PORTABLE_VALUE
	 * @generated
	 * @ordered
	 */
	PORTABLE(0, "PORTABLE", "PORTABLE"),

	/**
	 * The '<em><b>PUSHABLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUSHABLE_VALUE
	 * @generated
	 * @ordered
	 */
	PUSHABLE(1, "PUSHABLE", "PUSHABLE"),

	/**
	 * The '<em><b>KILLABLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KILLABLE_VALUE
	 * @generated
	 * @ordered
	 */
	KILLABLE(3, "KILLABLE", "KILLABLE"),

	/**
	 * The '<em><b>BREAKABLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BREAKABLE_VALUE
	 * @generated
	 * @ordered
	 */
	BREAKABLE(3, "BREAKABLE", "BREAKABLE"),

	/**
	 * The '<em><b>PULLABLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PULLABLE_VALUE
	 * @generated
	 * @ordered
	 */
	PULLABLE(4, "PULLABLE", "PULLABLE"),

	/**
	 * The '<em><b>NONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(5, "NONE", "NONE"),

	/**
	 * The '<em><b>OPENABLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPENABLE_VALUE
	 * @generated
	 * @ordered
	 */
	OPENABLE(6, "OPENABLE", "OPENABLE");

	/**
	 * The '<em><b>PORTABLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PORTABLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PORTABLE_VALUE = 0;

	/**
	 * The '<em><b>PUSHABLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUSHABLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PUSHABLE_VALUE = 1;

	/**
	 * The '<em><b>KILLABLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KILLABLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int KILLABLE_VALUE = 3;

	/**
	 * The '<em><b>BREAKABLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BREAKABLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BREAKABLE_VALUE = 3;

	/**
	 * The '<em><b>PULLABLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PULLABLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PULLABLE_VALUE = 4;

	/**
	 * The '<em><b>NONE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NONE_VALUE = 5;

	/**
	 * The '<em><b>OPENABLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPENABLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OPENABLE_VALUE = 6;

	/**
	 * An array of all the '<em><b>EActive Ability</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EActiveAbility[] VALUES_ARRAY = new EActiveAbility[] { PORTABLE, PUSHABLE, KILLABLE, BREAKABLE,
			PULLABLE, NONE, OPENABLE, };

	/**
	 * A public read-only list of all the '<em><b>EActive Ability</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EActiveAbility> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>EActive Ability</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EActiveAbility get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EActiveAbility result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EActive Ability</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EActiveAbility getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EActiveAbility result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EActive Ability</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EActiveAbility get(int value) {
		switch (value) {
		case PORTABLE_VALUE:
			return PORTABLE;
		case PUSHABLE_VALUE:
			return PUSHABLE;
		case KILLABLE_VALUE:
			return KILLABLE;
		case PULLABLE_VALUE:
			return PULLABLE;
		case NONE_VALUE:
			return NONE;
		case OPENABLE_VALUE:
			return OPENABLE;
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
	private EActiveAbility(int value, String name, String literal) {
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

} //EActiveAbility
