/**
 */
package generator;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Map Questionable Fact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.MapQuestionableFact#getMap <em>Map</em>}</li>
 *   <li>{@link generator.MapQuestionableFact#getMapsolutions <em>Mapsolutions</em>}</li>
 *   <li>{@link generator.MapQuestionableFact#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getMapQuestionableFact()
 * @model
 * @generated
 */
public interface MapQuestionableFact extends AQuestionableFact {
	/**
	 * Returns the value of the '<em><b>Map</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Map</em>' reference.
	 * @see #setMap(Map)
	 * @see generator.GeneratorPackage#getMapQuestionableFact_Map()
	 * @model required="true"
	 * @generated
	 */
	Map getMap();

	/**
	 * Sets the value of the '{@link generator.MapQuestionableFact#getMap <em>Map</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Map</em>' reference.
	 * @see #getMap()
	 * @generated
	 */
	void setMap(Map value);

	/**
	 * Returns the value of the '<em><b>Mapsolutions</b></em>' containment reference list.
	 * The list contents are of type {@link generator.MapSolution}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapsolutions</em>' containment reference list.
	 * @see generator.GeneratorPackage#getMapQuestionableFact_Mapsolutions()
	 * @model containment="true"
	 * @generated
	 */
	EList<MapSolution> getMapsolutions();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link generator.EGeographyValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see generator.EGeographyValue
	 * @see #setType(EGeographyValue)
	 * @see generator.GeneratorPackage#getMapQuestionableFact_Type()
	 * @model
	 * @generated
	 */
	EGeographyValue getType();

	/**
	 * Sets the value of the '{@link generator.MapQuestionableFact#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see generator.EGeographyValue
	 * @see #getType()
	 * @generated
	 */
	void setType(EGeographyValue value);

} // MapQuestionableFact
