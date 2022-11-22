/**
 */
package generator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>EPassive Ability</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see generator.GeneratorPackage#getEPassiveAbility()
 * @model
 * @generated
 */
public enum EPassiveAbility implements Enumerator {
	/**
	 * The '<em><b>DETECT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DETECT_VALUE
	 * @generated
	 * @ordered
	 */
	DETECT(0, "DETECT", "DETECT"),

	/**
	 * The '<em><b>KILL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KILL_VALUE
	 * @generated
	 * @ordered
	 */
	KILL(1, "KILL", "KILL");

	/**
	 * The '<em><b>DETECT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DETECT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DETECT_VALUE = 0;

	/**
	 * The '<em><b>KILL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KILL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int KILL_VALUE = 1;

	/**
	 * An array of all the '<em><b>EPassive Ability</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EPassiveAbility[] VALUES_ARRAY = new EPassiveAbility[] { DETECT, KILL, };

	/**
	 * A public read-only list of all the '<em><b>EPassive Ability</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EPassiveAbility> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>EPassive Ability</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EPassiveAbility get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EPassiveAbility result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EPassive Ability</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EPassiveAbility getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EPassiveAbility result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EPassive Ability</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EPassiveAbility get(int value) {
		switch (value) {
		case DETECT_VALUE:
			return DETECT;
		case KILL_VALUE:
			return KILL;
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
	private EPassiveAbility(int value, String name, String literal) {
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

} //EPassiveAbility
