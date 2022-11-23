/**
 */
package generator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ETask Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see generator.GeneratorPackage#getETaskType()
 * @model
 * @generated
 */
public enum ETaskType implements Enumerator {
	/**
	 * The '<em><b>COMPLETE1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPLETE1_VALUE
	 * @generated
	 * @ordered
	 */
	COMPLETE1(0, "COMPLETE1", "COMPLETE1"),

	/**
	 * The '<em><b>COMPLETE2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPLETE2_VALUE
	 * @generated
	 * @ordered
	 */
	COMPLETE2(1, "COMPLETE2", "COMPLETE2"),

	/**
	 * The '<em><b>REBUILD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REBUILD_VALUE
	 * @generated
	 * @ordered
	 */
	REBUILD(2, "REBUILD", "REBUILD"),

	/**
	 * The '<em><b>IDENTIFY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IDENTIFY_VALUE
	 * @generated
	 * @ordered
	 */
	IDENTIFY(3, "IDENTIFY", "IDENTIFY"),

	/**
	 * The '<em><b>MEMBERSHIP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEMBERSHIP_VALUE
	 * @generated
	 * @ordered
	 */
	MEMBERSHIP(4, "MEMBERSHIP", "MEMBERSHIP");

	/**
	 * The '<em><b>COMPLETE1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPLETE1
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COMPLETE1_VALUE = 0;

	/**
	 * The '<em><b>COMPLETE2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPLETE2
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COMPLETE2_VALUE = 1;

	/**
	 * The '<em><b>REBUILD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REBUILD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REBUILD_VALUE = 2;

	/**
	 * The '<em><b>IDENTIFY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IDENTIFY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IDENTIFY_VALUE = 3;

	/**
	 * The '<em><b>MEMBERSHIP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEMBERSHIP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MEMBERSHIP_VALUE = 4;

	/**
	 * An array of all the '<em><b>ETask Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ETaskType[] VALUES_ARRAY = new ETaskType[] { COMPLETE1, COMPLETE2, REBUILD, IDENTIFY,
			MEMBERSHIP, };

	/**
	 * A public read-only list of all the '<em><b>ETask Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ETaskType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ETask Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ETaskType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ETaskType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ETask Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ETaskType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ETaskType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ETask Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ETaskType get(int value) {
		switch (value) {
		case COMPLETE1_VALUE:
			return COMPLETE1;
		case COMPLETE2_VALUE:
			return COMPLETE2;
		case REBUILD_VALUE:
			return REBUILD;
		case IDENTIFY_VALUE:
			return IDENTIFY;
		case MEMBERSHIP_VALUE:
			return MEMBERSHIP;
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
	private ETaskType(int value, String name, String literal) {
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

} //ETaskType
