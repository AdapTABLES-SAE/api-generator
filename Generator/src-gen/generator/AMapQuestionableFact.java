/**
 */
package generator;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AMap Questionable Fact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.AMapQuestionableFact#getMap <em>Map</em>}</li>
 *   <li>{@link generator.AMapQuestionableFact#getMapsolutions <em>Mapsolutions</em>}</li>
 *   <li>{@link generator.AMapQuestionableFact#getConsigne <em>Consigne</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getAMapQuestionableFact()
 * @model abstract="true"
 * @generated
 */
public interface AMapQuestionableFact extends AQuestionableFact {
	/**
	 * Returns the value of the '<em><b>Map</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Map</em>' reference.
	 * @see #setMap(Map)
	 * @see generator.GeneratorPackage#getAMapQuestionableFact_Map()
	 * @model required="true"
	 * @generated
	 */
	Map getMap();

	/**
	 * Sets the value of the '{@link generator.AMapQuestionableFact#getMap <em>Map</em>}' reference.
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
	 * @see generator.GeneratorPackage#getAMapQuestionableFact_Mapsolutions()
	 * @model containment="true"
	 * @generated
	 */
	EList<MapSolution> getMapsolutions();

	/**
	 * Returns the value of the '<em><b>Consigne</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consigne</em>' attribute.
	 * @see #setConsigne(String)
	 * @see generator.GeneratorPackage#getAMapQuestionableFact_Consigne()
	 * @model
	 * @generated
	 */
	String getConsigne();

	/**
	 * Sets the value of the '{@link generator.AMapQuestionableFact#getConsigne <em>Consigne</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consigne</em>' attribute.
	 * @see #getConsigne()
	 * @generated
	 */
	void setConsigne(String value);

} // AMapQuestionableFact
