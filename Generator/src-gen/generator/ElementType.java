/**
 */
package generator;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.ElementType#getName <em>Name</em>}</li>
 *   <li>{@link generator.ElementType#getAcceptedActions <em>Accepted Actions</em>}</li>
 *   <li>{@link generator.ElementType#getShape <em>Shape</em>}</li>
 *   <li>{@link generator.ElementType#getState <em>State</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getElementType()
 * @model
 * @generated
 */
public interface ElementType extends IRoomElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see generator.GeneratorPackage#getElementType_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link generator.ElementType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Accepted Actions</b></em>' attribute list.
	 * The list contents are of type {@link generator.AvatarActions}.
	 * The literals are from the enumeration {@link generator.AvatarActions}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accepted Actions</em>' attribute list.
	 * @see generator.AvatarActions
	 * @see generator.GeneratorPackage#getElementType_AcceptedActions()
	 * @model required="true"
	 * @generated
	 */
	EList<AvatarActions> getAcceptedActions();

	/**
	 * Returns the value of the '<em><b>Shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shape</em>' containment reference.
	 * @see #setShape(ElementShape)
	 * @see generator.GeneratorPackage#getElementType_Shape()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ElementShape getShape();

	/**
	 * Sets the value of the '{@link generator.ElementType#getShape <em>Shape</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shape</em>' containment reference.
	 * @see #getShape()
	 * @generated
	 */
	void setShape(ElementShape value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' containment reference list.
	 * The list contents are of type {@link generator.ElementState}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' containment reference list.
	 * @see generator.GeneratorPackage#getElementType_State()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ElementState> getState();

} // ElementType
