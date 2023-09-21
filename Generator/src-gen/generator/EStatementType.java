/**
 */
package generator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>EStatement Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see generator.GeneratorPackage#getEStatementType()
 * @model
 * @generated
 */
public enum EStatementType implements Enumerator {
	/**
	 * The '<em><b>CLASSIC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLASSIC_VALUE
	 * @generated
	 * @ordered
	 */
	CLASSIC(0, "CLASSIC", "CLASSIC"),

	/**
	 * The '<em><b>FILL IN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FILL_IN_VALUE
	 * @generated
	 * @ordered
	 */
	FILL_IN(1, "FILL_IN", "FILL_IN"),
	/**
	 * The '<em><b>GRAPHIC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #GRAPHIC_VALUE
	 * @generated
	 * @ordered
	 */
	GRAPHIC(2, "GRAPHIC", "GRAPHIC");

	/**
	 * The '<em><b>CLASSIC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLASSIC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CLASSIC_VALUE = 0;

	/**
	 * The '<em><b>FILL IN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FILL_IN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FILL_IN_VALUE = 1;

	/**
	 * The '<em><b>GRAPHIC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GRAPHIC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GRAPHIC_VALUE = 2;

	/**
	 * An array of all the '<em><b>EStatement Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EStatementType[] VALUES_ARRAY = new EStatementType[] { CLASSIC, FILL_IN, GRAPHIC, };

	/**
	 * A public read-only list of all the '<em><b>EStatement Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EStatementType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>EStatement Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EStatementType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EStatementType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EStatement Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EStatementType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EStatementType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EStatement Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EStatementType get(int value) {
		switch (value) {
		case CLASSIC_VALUE:
			return CLASSIC;
		case FILL_IN_VALUE:
			return FILL_IN;
		case GRAPHIC_VALUE:
			return GRAPHIC;
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
	private EStatementType(int value, String name, String literal) {
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

} //EStatementType
