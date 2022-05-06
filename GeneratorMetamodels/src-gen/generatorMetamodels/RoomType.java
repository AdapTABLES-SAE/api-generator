/**
 */
package generatorMetamodels;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Room Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see generatorMetamodels.GeneratorMetamodelsPackage#getRoomType()
 * @model
 * @generated
 */
public enum RoomType implements Enumerator {
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
	 * The '<em><b>SIMPLE QUESTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIMPLE_QUESTION_VALUE
	 * @generated
	 * @ordered
	 */
	SIMPLE_QUESTION(2, "SIMPLE_QUESTION", "SIMPLE_QUESTION"),

	/**
	 * The '<em><b>BOSS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOSS_VALUE
	 * @generated
	 * @ordered
	 */
	BOSS(3, "BOSS", "BOSS");

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
	 * The '<em><b>SIMPLE QUESTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIMPLE_QUESTION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SIMPLE_QUESTION_VALUE = 2;

	/**
	 * The '<em><b>BOSS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOSS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BOSS_VALUE = 3;

	/**
	 * An array of all the '<em><b>Room Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RoomType[] VALUES_ARRAY = new RoomType[] { ENTRY, EXIT, SIMPLE_QUESTION, BOSS, };

	/**
	 * A public read-only list of all the '<em><b>Room Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RoomType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Room Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RoomType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RoomType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Room Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RoomType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RoomType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Room Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RoomType get(int value) {
		switch (value) {
		case ENTRY_VALUE:
			return ENTRY;
		case EXIT_VALUE:
			return EXIT;
		case SIMPLE_QUESTION_VALUE:
			return SIMPLE_QUESTION;
		case BOSS_VALUE:
			return BOSS;
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
	private RoomType(int value, String name, String literal) {
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

} //RoomType
