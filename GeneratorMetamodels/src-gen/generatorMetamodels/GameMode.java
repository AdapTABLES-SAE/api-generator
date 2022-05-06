/**
 */
package generatorMetamodels;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Game Mode</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see generatorMetamodels.GeneratorMetamodelsPackage#getGameMode()
 * @model
 * @generated
 */
public enum GameMode implements Enumerator {
	/**
	 * The '<em><b>LINEAR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINEAR_VALUE
	 * @generated
	 * @ordered
	 */
	LINEAR(0, "LINEAR", "LINEAR"),

	/**
	 * The '<em><b>LABIRINTHINE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LABIRINTHINE_VALUE
	 * @generated
	 * @ordered
	 */
	LABIRINTHINE(1, "LABIRINTHINE", "LABIRINTHINE"),

	/**
	 * The '<em><b>RAMDOM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RAMDOM_VALUE
	 * @generated
	 * @ordered
	 */
	RAMDOM(2, "RAMDOM", "RAMDOM"),

	/**
	 * The '<em><b>NONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(3, "NONE", "NONE");

	/**
	 * The '<em><b>LINEAR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINEAR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LINEAR_VALUE = 0;

	/**
	 * The '<em><b>LABIRINTHINE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LABIRINTHINE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LABIRINTHINE_VALUE = 1;

	/**
	 * The '<em><b>RAMDOM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RAMDOM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RAMDOM_VALUE = 2;

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
	 * An array of all the '<em><b>Game Mode</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final GameMode[] VALUES_ARRAY = new GameMode[] { LINEAR, LABIRINTHINE, RAMDOM, NONE, };

	/**
	 * A public read-only list of all the '<em><b>Game Mode</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<GameMode> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Game Mode</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GameMode get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GameMode result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Game Mode</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GameMode getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GameMode result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Game Mode</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GameMode get(int value) {
		switch (value) {
		case LINEAR_VALUE:
			return LINEAR;
		case LABIRINTHINE_VALUE:
			return LABIRINTHINE;
		case RAMDOM_VALUE:
			return RAMDOM;
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
	private GameMode(int value, String name, String literal) {
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

} //GameMode
