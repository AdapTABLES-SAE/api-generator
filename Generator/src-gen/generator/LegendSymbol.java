/**
 */
package generator;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Legend Symbol</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.LegendSymbol#getImage <em>Image</em>}</li>
 *   <li>{@link generator.LegendSymbol#getPosition <em>Position</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getLegendSymbol()
 * @model
 * @generated
 */
public interface LegendSymbol extends EObject {
	/**
	 * Returns the value of the '<em><b>Image</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image</em>' containment reference.
	 * @see #setImage(Image)
	 * @see generator.GeneratorPackage#getLegendSymbol_Image()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Image getImage();

	/**
	 * Sets the value of the '{@link generator.LegendSymbol#getImage <em>Image</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image</em>' containment reference.
	 * @see #getImage()
	 * @generated
	 */
	void setImage(Image value);

	/**
	 * Returns the value of the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' reference.
	 * @see #setPosition(VizualisationPosition)
	 * @see generator.GeneratorPackage#getLegendSymbol_Position()
	 * @model required="true"
	 * @generated
	 */
	VizualisationPosition getPosition();

	/**
	 * Sets the value of the '{@link generator.LegendSymbol#getPosition <em>Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' reference.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(VizualisationPosition value);

} // LegendSymbol
