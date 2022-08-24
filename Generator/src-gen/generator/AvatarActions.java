/**
 */
package generator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Avatar Actions</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see generator.GeneratorPackage#getAvatarActions()
 * @model
 * @generated
 */
public enum AvatarActions implements Enumerator {
	/**
	 * The '<em><b>TOUCH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOUCH_VALUE
	 * @generated
	 * @ordered
	 */
	TOUCH(0, "TOUCH", "TOUCH"),

	/**
	 * The '<em><b>GO THROUGH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GO_THROUGH_VALUE
	 * @generated
	 * @ordered
	 */
	GO_THROUGH(1, "GO_THROUGH", "GO_THROUGH"),

	/**
	 * The '<em><b>STRIKE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRIKE_VALUE
	 * @generated
	 * @ordered
	 */
	STRIKE(2, "STRIKE", "STRIKE"),

	/**
	 * The '<em><b>WALK RUN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WALK_RUN_VALUE
	 * @generated
	 * @ordered
	 */
	WALK_RUN(3, "WALK_RUN", "WALK_RUN"),

	/**
	 * The '<em><b>PICKUP CARRY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PICKUP_CARRY_VALUE
	 * @generated
	 * @ordered
	 */
	PICKUP_CARRY(4, "PICKUP_CARRY", "PICKUP_CARRY"),

	/**
	 * The '<em><b>NONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(5, "NONE", "NONE");

	/**
	 * The '<em><b>TOUCH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOUCH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TOUCH_VALUE = 0;

	/**
	 * The '<em><b>GO THROUGH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GO_THROUGH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GO_THROUGH_VALUE = 1;

	/**
	 * The '<em><b>STRIKE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRIKE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STRIKE_VALUE = 2;

	/**
	 * The '<em><b>WALK RUN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WALK_RUN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WALK_RUN_VALUE = 3;

	/**
	 * The '<em><b>PICKUP CARRY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PICKUP_CARRY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PICKUP_CARRY_VALUE = 4;

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
	 * An array of all the '<em><b>Avatar Actions</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AvatarActions[] VALUES_ARRAY = new AvatarActions[] { TOUCH, GO_THROUGH, STRIKE, WALK_RUN,
			PICKUP_CARRY, NONE, };

	/**
	 * A public read-only list of all the '<em><b>Avatar Actions</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AvatarActions> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Avatar Actions</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AvatarActions get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AvatarActions result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Avatar Actions</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AvatarActions getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AvatarActions result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Avatar Actions</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AvatarActions get(int value) {
		switch (value) {
		case TOUCH_VALUE:
			return TOUCH;
		case GO_THROUGH_VALUE:
			return GO_THROUGH;
		case STRIKE_VALUE:
			return STRIKE;
		case WALK_RUN_VALUE:
			return WALK_RUN;
		case PICKUP_CARRY_VALUE:
			return PICKUP_CARRY;
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
	private AvatarActions(int value, String name, String literal) {
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

} //AvatarActions
