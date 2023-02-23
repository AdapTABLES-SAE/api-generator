/**
 */
package generator;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Core GP Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.CoreGPElement#getID <em>ID</em>}</li>
 *   <li>{@link generator.CoreGPElement#getType <em>Type</em>}</li>
 *   <li>{@link generator.CoreGPElement#getAbility <em>Ability</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getCoreGPElement()
 * @model abstract="true"
 * @generated
 */
public interface CoreGPElement extends EObject {
	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #isSetID()
	 * @see generator.GeneratorPackage#getCoreGPElement_ID()
	 * @model unsettable="true" id="true" changeable="false"
	 * @generated
	 */
	String getID();

	/**
	 * Returns whether the value of the '{@link generator.CoreGPElement#getID <em>ID</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID</em>' attribute is set.
	 * @see #getID()
	 * @generated
	 */
	boolean isSetID();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #isSetType()
	 * @see generator.GeneratorPackage#getCoreGPElement_Type()
	 * @model default="" unsettable="true" changeable="false"
	 * @generated
	 */
	String getType();

	/**
	 * Returns whether the value of the '{@link generator.CoreGPElement#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #getType()
	 * @generated
	 */
	boolean isSetType();

	/**
	 * Returns the value of the '<em><b>Ability</b></em>' attribute.
	 * The literals are from the enumeration {@link generator.Ability}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ability</em>' attribute.
	 * @see generator.Ability
	 * @see #setAbility(Ability)
	 * @see generator.GeneratorPackage#getCoreGPElement_Ability()
	 * @model
	 * @generated
	 */
	Ability getAbility();

	/**
	 * Sets the value of the '{@link generator.CoreGPElement#getAbility <em>Ability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ability</em>' attribute.
	 * @see generator.Ability
	 * @see #getAbility()
	 * @generated
	 */
	void setAbility(Ability value);

} // CoreGPElement
