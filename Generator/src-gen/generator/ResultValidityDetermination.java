/**
 */
package generator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Result Validity Determination</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.ResultValidityDetermination#getNewAttribute <em>New Attribute</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getResultValidityDetermination()
 * @model abstract="true"
 * @generated
 */
public interface ResultValidityDetermination extends SubObjective {
	/**
	 * Returns the value of the '<em><b>New Attribute</b></em>' attribute.
	 * The default value is <code>"RES_VALIDITY"</code>.
	 * The literals are from the enumeration {@link generator.SubObjectiveType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Attribute</em>' attribute.
	 * @see generator.SubObjectiveType
	 * @see #isSetNewAttribute()
	 * @see generator.GeneratorPackage#getResultValidityDetermination_NewAttribute()
	 * @model default="RES_VALIDITY" unsettable="true" changeable="false"
	 * @generated
	 */
	SubObjectiveType getNewAttribute();

	/**
	 * Returns whether the value of the '{@link generator.ResultValidityDetermination#getNewAttribute <em>New Attribute</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>New Attribute</em>' attribute is set.
	 * @see #getNewAttribute()
	 * @generated
	 */
	boolean isSetNewAttribute();

} // ResultValidityDetermination
