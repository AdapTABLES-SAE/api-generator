/**
 */
package generator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Ability</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see generator.GeneratorPackage#getAbility()
 * @model
 * @generated
 */
public enum Ability implements Enumerator {
	/**
	 * The '<em><b>MOVABLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOVABLE_VALUE
	 * @generated
	 * @ordered
	 */
	MOVABLE(0, "MOVABLE", "MOVABLE"),

	/**
	 * The '<em><b>TOUCHABLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOUCHABLE_VALUE
	 * @generated
	 * @ordered
	 */
	TOUCHABLE(1, "TOUCHABLE", "TOUCHABLE"),

	/**
	 * The '<em><b>PUSHABLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUSHABLE_VALUE
	 * @generated
	 * @ordered
	 */
	PUSHABLE(2, "PUSHABLE", "PUSHABLE"),

	/**
	 * The '<em><b>OPENABLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPENABLE_VALUE
	 * @generated
	 * @ordered
	 */
	OPENABLE(3, "OPENABLE", "OPENABLE"),

	/**
	 * The '<em><b>ROTABLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROTABLE_VALUE
	 * @generated
	 * @ordered
	 */
	ROTABLE(4, "ROTABLE", "ROTABLE"),

	/**
	 * The '<em><b>DETECTOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DETECTOR_VALUE
	 * @generated
	 * @ordered
	 */
	DETECTOR(5, "DETECTOR", "DETECTOR"),

	/**
	 * The '<em><b>VERIFICATOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VERIFICATOR_VALUE
	 * @generated
	 * @ordered
	 */
	VERIFICATOR(6, "VERIFICATOR", "VERIFICATOR");

	/**
	 * The '<em><b>MOVABLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOVABLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MOVABLE_VALUE = 0;

	/**
	 * The '<em><b>TOUCHABLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOUCHABLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TOUCHABLE_VALUE = 1;

	/**
	 * The '<em><b>PUSHABLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUSHABLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PUSHABLE_VALUE = 2;

	/**
	 * The '<em><b>OPENABLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPENABLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OPENABLE_VALUE = 3;

	/**
	 * The '<em><b>ROTABLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROTABLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ROTABLE_VALUE = 4;

	/**
	 * The '<em><b>DETECTOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DETECTOR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DETECTOR_VALUE = 5;

	/**
	 * The '<em><b>VERIFICATOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VERIFICATOR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VERIFICATOR_VALUE = 6;

	/**
	 * An array of all the '<em><b>Ability</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Ability[] VALUES_ARRAY = new Ability[] { MOVABLE, TOUCHABLE, PUSHABLE, OPENABLE, ROTABLE,
			DETECTOR, VERIFICATOR, };

	/**
	 * A public read-only list of all the '<em><b>Ability</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Ability> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Ability</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Ability get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Ability result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ability</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Ability getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Ability result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ability</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Ability get(int value) {
		switch (value) {
		case MOVABLE_VALUE:
			return MOVABLE;
		case TOUCHABLE_VALUE:
			return TOUCHABLE;
		case PUSHABLE_VALUE:
			return PUSHABLE;
		case OPENABLE_VALUE:
			return OPENABLE;
		case ROTABLE_VALUE:
			return ROTABLE;
		case DETECTOR_VALUE:
			return DETECTOR;
		case VERIFICATOR_VALUE:
			return VERIFICATOR;
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
	private Ability(int value, String name, String literal) {
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

} //Ability
