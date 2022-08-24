/**
 */
package generator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Problem Resolution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.ProblemResolution#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getProblemResolution()
 * @model abstract="true"
 * @generated
 */
public interface ProblemResolution extends SubObjective {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"PB_RESOLUTION"</code>.
	 * The literals are from the enumeration {@link generator.SubObjectiveType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see generator.SubObjectiveType
	 * @see #isSetType()
	 * @see generator.GeneratorPackage#getProblemResolution_Type()
	 * @model default="PB_RESOLUTION" unsettable="true" changeable="false"
	 * @generated
	 */
	SubObjectiveType getType();

	/**
	 * Returns whether the value of the '{@link generator.ProblemResolution#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #getType()
	 * @generated
	 */
	boolean isSetType();

} // ProblemResolution
