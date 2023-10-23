/**
 */
package generator;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Map Solution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.MapSolution#getValue <em>Value</em>}</li>
 *   <li>{@link generator.MapSolution#getMapPosition <em>Map Position</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getMapSolution()
 * @model
 * @generated
 */
public interface MapSolution extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see generator.GeneratorPackage#getMapSolution_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link generator.MapSolution#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Map Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Map Position</em>' reference.
	 * @see #setMapPosition(VizualisationPosition)
	 * @see generator.GeneratorPackage#getMapSolution_MapPosition()
	 * @model required="true"
	 * @generated
	 */
	VizualisationPosition getMapPosition();

	/**
	 * Sets the value of the '{@link generator.MapSolution#getMapPosition <em>Map Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Map Position</em>' reference.
	 * @see #getMapPosition()
	 * @generated
	 */
	void setMapPosition(VizualisationPosition value);

} // MapSolution
