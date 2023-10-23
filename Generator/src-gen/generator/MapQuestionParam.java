/**
 */
package generator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Map Question Param</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.MapQuestionParam#getMap <em>Map</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getMapQuestionParam()
 * @model
 * @generated
 */
public interface MapQuestionParam extends AQuestionParam {
	/**
	 * Returns the value of the '<em><b>Map</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Map</em>' reference.
	 * @see #setMap(Visualization)
	 * @see generator.GeneratorPackage#getMapQuestionParam_Map()
	 * @model required="true"
	 * @generated
	 */
	Visualization getMap();

	/**
	 * Sets the value of the '{@link generator.MapQuestionParam#getMap <em>Map</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Map</em>' reference.
	 * @see #getMap()
	 * @generated
	 */
	void setMap(Visualization value);

} // MapQuestionParam
