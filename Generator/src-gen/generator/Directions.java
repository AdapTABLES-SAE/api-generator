/**
 */
package generator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Directions</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see generator.GeneratorPackage#getDirections()
 * @model
 * @generated
 */
public enum Directions implements Enumerator {
	/**
	 * The '<em><b>SOUTH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOUTH_VALUE
	 * @generated
	 * @ordered
	 */
	SOUTH(0, "SOUTH", "SOUTH"),

	/**
	 * The '<em><b>EAST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EAST_VALUE
	 * @generated
	 * @ordered
	 */
	EAST(1, "EAST", "EAST"),

	/**
	 * The '<em><b>NORTH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NORTH_VALUE
	 * @generated
	 * @ordered
	 */
	NORTH(2, "NORTH", "NORTH"),

	/**
	 * The '<em><b>WEST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEST_VALUE
	 * @generated
	 * @ordered
	 */
	WEST(3, "WEST", "WEST"),

	/**
	 * The '<em><b>SOUTH EAST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOUTH_EAST_VALUE
	 * @generated
	 * @ordered
	 */
	SOUTH_EAST(4, "SOUTH_EAST", "SOUTH_EAST"),

	/**
	 * The '<em><b>SOUTH WEST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOUTH_WEST_VALUE
	 * @generated
	 * @ordered
	 */
	SOUTH_WEST(5, "SOUTH_WEST", "SOUTH_WEST"),

	/**
	 * The '<em><b>NORTH EAST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NORTH_EAST_VALUE
	 * @generated
	 * @ordered
	 */
	NORTH_EAST(6, "NORTH_EAST", "NORTH_EAST"),

	/**
	 * The '<em><b>NORTH WEST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NORTH_WEST_VALUE
	 * @generated
	 * @ordered
	 */
	NORTH_WEST(7, "NORTH_WEST", "NORTH_WEST"),

	/**
	 * The '<em><b>EAST SOUTH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EAST_SOUTH_VALUE
	 * @generated
	 * @ordered
	 */
	EAST_SOUTH(8, "EAST_SOUTH", "EAST_SOUTH"),

	/**
	 * The '<em><b>EAST NORTH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EAST_NORTH_VALUE
	 * @generated
	 * @ordered
	 */
	EAST_NORTH(9, "EAST_NORTH", "EAST_NORTH"),

	/**
	 * The '<em><b>WEST NORTH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEST_NORTH_VALUE
	 * @generated
	 * @ordered
	 */
	WEST_NORTH(10, "WEST_NORTH", "WEST_NORTH"),

	/**
	 * The '<em><b>WEST SOUTH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEST_SOUTH_VALUE
	 * @generated
	 * @ordered
	 */
	WEST_SOUTH(11, "WEST_SOUTH", "WEST_SOUTH"),

	/**
	 * The '<em><b>NONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(12, "NONE", "NONE");

	/**
	 * The '<em><b>SOUTH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOUTH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SOUTH_VALUE = 0;

	/**
	 * The '<em><b>EAST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EAST
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EAST_VALUE = 1;

	/**
	 * The '<em><b>NORTH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NORTH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NORTH_VALUE = 2;

	/**
	 * The '<em><b>WEST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEST
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WEST_VALUE = 3;

	/**
	 * The '<em><b>SOUTH EAST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOUTH_EAST
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SOUTH_EAST_VALUE = 4;

	/**
	 * The '<em><b>SOUTH WEST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOUTH_WEST
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SOUTH_WEST_VALUE = 5;

	/**
	 * The '<em><b>NORTH EAST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NORTH_EAST
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NORTH_EAST_VALUE = 6;

	/**
	 * The '<em><b>NORTH WEST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NORTH_WEST
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NORTH_WEST_VALUE = 7;

	/**
	 * The '<em><b>EAST SOUTH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EAST_SOUTH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EAST_SOUTH_VALUE = 8;

	/**
	 * The '<em><b>EAST NORTH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EAST_NORTH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EAST_NORTH_VALUE = 9;

	/**
	 * The '<em><b>WEST NORTH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEST_NORTH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WEST_NORTH_VALUE = 10;

	/**
	 * The '<em><b>WEST SOUTH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEST_SOUTH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WEST_SOUTH_VALUE = 11;

	/**
	 * The '<em><b>NONE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NONE_VALUE = 12;

	/**
	 * An array of all the '<em><b>Directions</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Directions[] VALUES_ARRAY = new Directions[] { SOUTH, EAST, NORTH, WEST, SOUTH_EAST,
			SOUTH_WEST, NORTH_EAST, NORTH_WEST, EAST_SOUTH, EAST_NORTH, WEST_NORTH, WEST_SOUTH, NONE, };

	/**
	 * A public read-only list of all the '<em><b>Directions</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Directions> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Directions</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Directions get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Directions result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Directions</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Directions getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Directions result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Directions</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Directions get(int value) {
		switch (value) {
		case SOUTH_VALUE:
			return SOUTH;
		case EAST_VALUE:
			return EAST;
		case NORTH_VALUE:
			return NORTH;
		case WEST_VALUE:
			return WEST;
		case SOUTH_EAST_VALUE:
			return SOUTH_EAST;
		case SOUTH_WEST_VALUE:
			return SOUTH_WEST;
		case NORTH_EAST_VALUE:
			return NORTH_EAST;
		case NORTH_WEST_VALUE:
			return NORTH_WEST;
		case EAST_SOUTH_VALUE:
			return EAST_SOUTH;
		case EAST_NORTH_VALUE:
			return EAST_NORTH;
		case WEST_NORTH_VALUE:
			return WEST_NORTH;
		case WEST_SOUTH_VALUE:
			return WEST_SOUTH;
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
	private Directions(int value, String name, String literal) {
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

} //Directions
