/**
 */
package generator;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Shape</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.ElementShape#getHeight <em>Height</em>}</li>
 *   <li>{@link generator.ElementShape#getWidth <em>Width</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getElementShape()
 * @model
 * @generated
 */
public interface ElementShape extends EObject {
	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(float)
	 * @see generator.GeneratorPackage#getElementShape_Height()
	 * @model
	 * @generated
	 */
	float getHeight();

	/**
	 * Sets the value of the '{@link generator.ElementShape#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(float value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(float)
	 * @see generator.GeneratorPackage#getElementShape_Width()
	 * @model
	 * @generated
	 */
	float getWidth();

	/**
	 * Sets the value of the '{@link generator.ElementShape#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(float value);

} // ElementShape
