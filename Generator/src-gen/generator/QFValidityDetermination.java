/**
 */
package generator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QF Validity Determination</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.QFValidityDetermination#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getQFValidityDetermination()
 * @model abstract="true"
 * @generated
 */
public interface QFValidityDetermination extends SubObjective {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"QF_VALIDITY"</code>.
	 * The literals are from the enumeration {@link generator.SubObjectiveType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see generator.SubObjectiveType
	 * @see #isSetType()
	 * @see generator.GeneratorPackage#getQFValidityDetermination_Type()
	 * @model default="QF_VALIDITY" unsettable="true" changeable="false"
	 * @generated
	 */
	SubObjectiveType getType();

	/**
	 * Returns whether the value of the '{@link generator.QFValidityDetermination#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #getType()
	 * @generated
	 */
	boolean isSetType();

} // QFValidityDetermination
