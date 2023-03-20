/**
 */
package generator;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Core Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.CoreElement#getID <em>ID</em>}</li>
 *   <li>{@link generator.CoreElement#getType <em>Type</em>}</li>
 *   <li>{@link generator.CoreElement#getAbility <em>Ability</em>}</li>
 *   <li>{@link generator.CoreElement#getSize <em>Size</em>}</li>
 *   <li>{@link generator.CoreElement#getCategory <em>Category</em>}</li>
 *   <li>{@link generator.CoreElement#getDisplay <em>Display</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getCoreElement()
 * @model
 * @generated
 */
public interface CoreElement extends EObject {
	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see generator.GeneratorPackage#getCoreElement_ID()
	 * @model id="true"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link generator.CoreElement#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see generator.GeneratorPackage#getCoreElement_Type()
	 * @model default=""
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link generator.CoreElement#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Ability</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ability</em>' reference.
	 * @see #setAbility(Ability)
	 * @see generator.GeneratorPackage#getCoreElement_Ability()
	 * @model
	 * @generated
	 */
	Ability getAbility();

	/**
	 * Sets the value of the '{@link generator.CoreElement#getAbility <em>Ability</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ability</em>' reference.
	 * @see #getAbility()
	 * @generated
	 */
	void setAbility(Ability value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * The literals are from the enumeration {@link generator.ElementSize}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see generator.ElementSize
	 * @see #setSize(ElementSize)
	 * @see generator.GeneratorPackage#getCoreElement_Size()
	 * @model
	 * @generated
	 */
	ElementSize getSize();

	/**
	 * Sets the value of the '{@link generator.CoreElement#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see generator.ElementSize
	 * @see #getSize()
	 * @generated
	 */
	void setSize(ElementSize value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * The literals are from the enumeration {@link generator.ElementCategory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see generator.ElementCategory
	 * @see #setCategory(ElementCategory)
	 * @see generator.GeneratorPackage#getCoreElement_Category()
	 * @model
	 * @generated
	 */
	ElementCategory getCategory();

	/**
	 * Sets the value of the '{@link generator.CoreElement#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see generator.ElementCategory
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(ElementCategory value);

	/**
	 * Returns the value of the '<em><b>Display</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display</em>' containment reference.
	 * @see #setDisplay(Display)
	 * @see generator.GeneratorPackage#getCoreElement_Display()
	 * @model containment="true"
	 * @generated
	 */
	Display getDisplay();

	/**
	 * Sets the value of the '{@link generator.CoreElement#getDisplay <em>Display</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display</em>' containment reference.
	 * @see #getDisplay()
	 * @generated
	 */
	void setDisplay(Display value);

} // CoreElement
