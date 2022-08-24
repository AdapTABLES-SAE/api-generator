/**
 */
package generator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>GP Bricks</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see generator.GeneratorPackage#getGPBricks()
 * @model
 * @generated
 */
public enum GPBricks implements Enumerator {
	/**
	 * The '<em><b>SELECT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SELECT_VALUE
	 * @generated
	 * @ordered
	 */
	SELECT(0, "SELECT", "SELECT"),

	/**
	 * The '<em><b>MOVE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOVE_VALUE
	 * @generated
	 * @ordered
	 */
	MOVE(1, "MOVE", "MOVE"),

	/**
	 * The '<em><b>AVOID</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AVOID_VALUE
	 * @generated
	 * @ordered
	 */
	AVOID(2, "AVOID", "AVOID"),

	/**
	 * The '<em><b>DESTROY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DESTROY_VALUE
	 * @generated
	 * @ordered
	 */
	DESTROY(3, "DESTROY", "DESTROY"),

	/**
	 * The '<em><b>MANAGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANAGE_VALUE
	 * @generated
	 * @ordered
	 */
	MANAGE(4, "MANAGE", "MANAGE"),

	/**
	 * The '<em><b>WRITE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WRITE_VALUE
	 * @generated
	 * @ordered
	 */
	WRITE(5, "WRITE", "WRITE");

	/**
	 * The '<em><b>SELECT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SELECT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SELECT_VALUE = 0;

	/**
	 * The '<em><b>MOVE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOVE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MOVE_VALUE = 1;

	/**
	 * The '<em><b>AVOID</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AVOID
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AVOID_VALUE = 2;

	/**
	 * The '<em><b>DESTROY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DESTROY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DESTROY_VALUE = 3;

	/**
	 * The '<em><b>MANAGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANAGE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MANAGE_VALUE = 4;

	/**
	 * The '<em><b>WRITE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WRITE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WRITE_VALUE = 5;

	/**
	 * An array of all the '<em><b>GP Bricks</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final GPBricks[] VALUES_ARRAY = new GPBricks[] { SELECT, MOVE, AVOID, DESTROY, MANAGE, WRITE, };

	/**
	 * A public read-only list of all the '<em><b>GP Bricks</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<GPBricks> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>GP Bricks</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GPBricks get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GPBricks result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>GP Bricks</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GPBricks getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GPBricks result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>GP Bricks</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GPBricks get(int value) {
		switch (value) {
		case SELECT_VALUE:
			return SELECT;
		case MOVE_VALUE:
			return MOVE;
		case AVOID_VALUE:
			return AVOID;
		case DESTROY_VALUE:
			return DESTROY;
		case MANAGE_VALUE:
			return MANAGE;
		case WRITE_VALUE:
			return WRITE;
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
	private GPBricks(int value, String name, String literal) {
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

} //GPBricks
