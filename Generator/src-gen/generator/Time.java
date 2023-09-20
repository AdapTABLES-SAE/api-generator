/**
 */
package generator;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.Time#getMap <em>Map</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getTime()
 * @model abstract="true"
 * @generated
 */
public interface Time extends EObject {

	/**
	 * Returns the value of the '<em><b>Map</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Map</em>' reference.
	 * @see #setMap(Map)
	 * @see generator.GeneratorPackage#getTime_Map()
	 * @model required="true"
	 * @generated
	 */
	Map getMap();

	/**
	 * Sets the value of the '{@link generator.Time#getMap <em>Map</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Map</em>' reference.
	 * @see #getMap()
	 * @generated
	 */
	void setMap(Map value);
} // Time
