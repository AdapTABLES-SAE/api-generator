/**
 */
package generator;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Planet Order</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.PlanetOrder#getPlanet <em>Planet</em>}</li>
 *   <li>{@link generator.PlanetOrder#getOrder <em>Order</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getPlanetOrder()
 * @model
 * @generated
 */
public interface PlanetOrder extends EObject {
	/**
	 * Returns the value of the '<em><b>Planet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Planet</em>' attribute.
	 * @see #setPlanet(String)
	 * @see generator.GeneratorPackage#getPlanetOrder_Planet()
	 * @model
	 * @generated
	 */
	String getPlanet();

	/**
	 * Sets the value of the '{@link generator.PlanetOrder#getPlanet <em>Planet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Planet</em>' attribute.
	 * @see #getPlanet()
	 * @generated
	 */
	void setPlanet(String value);

	/**
	 * Returns the value of the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order</em>' attribute.
	 * @see #setOrder(int)
	 * @see generator.GeneratorPackage#getPlanetOrder_Order()
	 * @model
	 * @generated
	 */
	int getOrder();

	/**
	 * Sets the value of the '{@link generator.PlanetOrder#getOrder <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order</em>' attribute.
	 * @see #getOrder()
	 * @generated
	 */
	void setOrder(int value);

} // PlanetOrder
