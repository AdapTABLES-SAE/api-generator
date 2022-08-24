/**
 */
package generator;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Placed Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.PlacedObject#getDisplayValue <em>Display Value</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getPlacedObject()
 * @model
 * @generated
 */
public interface PlacedObject extends EObject {
	/**
	 * Returns the value of the '<em><b>Display Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Value</em>' attribute.
	 * @see #setDisplayValue(String)
	 * @see generator.GeneratorPackage#getPlacedObject_DisplayValue()
	 * @model
	 * @generated
	 */
	String getDisplayValue();

	/**
	 * Sets the value of the '{@link generator.PlacedObject#getDisplayValue <em>Display Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Value</em>' attribute.
	 * @see #getDisplayValue()
	 * @generated
	 */
	void setDisplayValue(String value);

} // PlacedObject
