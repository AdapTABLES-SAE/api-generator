/**
 */
package generator;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gameplay</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.Gameplay#getQuantifiedElements <em>Quantified Elements</em>}</li>
 *   <li>{@link generator.Gameplay#getName <em>Name</em>}</li>
 *   <li>{@link generator.Gameplay#getAllowedStatements <em>Allowed Statements</em>}</li>
 *   <li>{@link generator.Gameplay#getCategory <em>Category</em>}</li>
 *   <li>{@link generator.Gameplay#getType <em>Type</em>}</li>
 *   <li>{@link generator.Gameplay#getStructures <em>Structures</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getGameplay()
 * @model
 * @generated
 */
public interface Gameplay extends EObject {
	/**
	 * Returns the value of the '<em><b>Quantified Elements</b></em>' containment reference list.
	 * The list contents are of type {@link generator.QuantifiedElements}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantified Elements</em>' containment reference list.
	 * @see generator.GeneratorPackage#getGameplay_QuantifiedElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<QuantifiedElements> getQuantifiedElements();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see generator.GeneratorPackage#getGameplay_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link generator.Gameplay#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Allowed Statements</b></em>' attribute list.
	 * The list contents are of type {@link generator.StatementType}.
	 * The literals are from the enumeration {@link generator.StatementType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allowed Statements</em>' attribute list.
	 * @see generator.StatementType
	 * @see generator.GeneratorPackage#getGameplay_AllowedStatements()
	 * @model
	 * @generated
	 */
	EList<StatementType> getAllowedStatements();

	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * The literals are from the enumeration {@link generator.GPCategory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see generator.GPCategory
	 * @see #setCategory(GPCategory)
	 * @see generator.GeneratorPackage#getGameplay_Category()
	 * @model
	 * @generated
	 */
	GPCategory getCategory();

	/**
	 * Sets the value of the '{@link generator.Gameplay#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see generator.GPCategory
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(GPCategory value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link generator.GPType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see generator.GPType
	 * @see #setType(GPType)
	 * @see generator.GeneratorPackage#getGameplay_Type()
	 * @model
	 * @generated
	 */
	GPType getType();

	/**
	 * Sets the value of the '{@link generator.Gameplay#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see generator.GPType
	 * @see #getType()
	 * @generated
	 */
	void setType(GPType value);

	/**
	 * Returns the value of the '<em><b>Structures</b></em>' containment reference list.
	 * The list contents are of type {@link generator.StructureElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structures</em>' containment reference list.
	 * @see generator.GeneratorPackage#getGameplay_Structures()
	 * @model containment="true"
	 * @generated
	 */
	EList<StructureElement> getStructures();

} // Gameplay
