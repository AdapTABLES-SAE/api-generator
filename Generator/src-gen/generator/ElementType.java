/**
 */
package generator;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.ElementType#getSize <em>Size</em>}</li>
 *   <li>{@link generator.ElementType#getID <em>ID</em>}</li>
 *   <li>{@link generator.ElementType#getType <em>Type</em>}</li>
 *   <li>{@link generator.ElementType#getNbDisplays <em>Nb Displays</em>}</li>
 *   <li>{@link generator.ElementType#getAbility <em>Ability</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getElementType()
 * @model
 * @generated
 */
public interface ElementType extends EObject {
	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * The literals are from the enumeration {@link generator.ElementSize}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see generator.ElementSize
	 * @see #setSize(ElementSize)
	 * @see generator.GeneratorPackage#getElementType_Size()
	 * @model
	 * @generated
	 */
	ElementSize getSize();

	/**
	 * Sets the value of the '{@link generator.ElementType#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see generator.ElementSize
	 * @see #getSize()
	 * @generated
	 */
	void setSize(ElementSize value);

	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see generator.GeneratorPackage#getElementType_ID()
	 * @model id="true"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link generator.ElementType#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see generator.GeneratorPackage#getElementType_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link generator.ElementType#getType <em>Type</em>}' attribute.
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
	 * @see generator.GeneratorPackage#getElementType_Ability()
	 * @model
	 * @generated
	 */
	Ability getAbility();

	/**
	 * Sets the value of the '{@link generator.ElementType#getAbility <em>Ability</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ability</em>' reference.
	 * @see #getAbility()
	 * @generated
	 */
	void setAbility(Ability value);

	/**
	 * Returns the value of the '<em><b>Nb Displays</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Displays</em>' attribute.
	 * @see #setNbDisplays(int)
	 * @see generator.GeneratorPackage#getElementType_NbDisplays()
	 * @model
	 * @generated
	 */
	int getNbDisplays();

	/**
	 * Sets the value of the '{@link generator.ElementType#getNbDisplays <em>Nb Displays</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Displays</em>' attribute.
	 * @see #getNbDisplays()
	 * @generated
	 */
	void setNbDisplays(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isDisplayableElement();

} // ElementType
