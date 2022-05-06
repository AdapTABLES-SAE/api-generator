/**
 */
package generatorMetamodels;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Game Element Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see generatorMetamodels.GeneratorMetamodelsPackage#getGameElementType()
 * @model
 * @generated
 */
public enum GameElementType implements Enumerator {
	/**
	 * The '<em><b>CONTENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTENT_VALUE
	 * @generated
	 * @ordered
	 */
	CONTENT(0, "CONTENT", "CONTENT"),

	/**
	 * The '<em><b>RULE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RULE_VALUE
	 * @generated
	 * @ordered
	 */
	RULE(1, "RULE", "RULE"),

	/**
	 * The '<em><b>AESTHETIC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AESTHETIC_VALUE
	 * @generated
	 * @ordered
	 */
	AESTHETIC(2, "AESTHETIC", "AESTHETIC"),

	/**
	 * The '<em><b>OTHER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(3, "OTHER", "OTHER");

	/**
	 * The '<em><b>CONTENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONTENT_VALUE = 0;

	/**
	 * The '<em><b>RULE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RULE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RULE_VALUE = 1;

	/**
	 * The '<em><b>AESTHETIC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AESTHETIC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AESTHETIC_VALUE = 2;

	/**
	 * The '<em><b>OTHER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 3;

	/**
	 * An array of all the '<em><b>Game Element Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final GameElementType[] VALUES_ARRAY = new GameElementType[] { CONTENT, RULE, AESTHETIC, OTHER, };

	/**
	 * A public read-only list of all the '<em><b>Game Element Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<GameElementType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Game Element Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GameElementType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GameElementType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Game Element Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GameElementType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GameElementType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Game Element Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GameElementType get(int value) {
		switch (value) {
		case CONTENT_VALUE:
			return CONTENT;
		case RULE_VALUE:
			return RULE;
		case AESTHETIC_VALUE:
			return AESTHETIC;
		case OTHER_VALUE:
			return OTHER;
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
	private GameElementType(int value, String name, String literal) {
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

} //GameElementType
