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
 *   <li>{@link generator.ElementType#getAbility <em>Ability</em>}</li>
 *   <li>{@link generator.ElementType#getNumberOfDisplays <em>Number Of Displays</em>}</li>
 *   <li>{@link generator.ElementType#getInsideStructureStatement <em>Inside Structure Statement</em>}</li>
 *   <li>{@link generator.ElementType#getInteractiveStatement <em>Interactive Statement</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getElementType()
 * @model
 * @generated
 */
public interface ElementType extends GPElementType {
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
	 * Returns the value of the '<em><b>Number Of Displays</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Displays</em>' attribute.
	 * @see #setNumberOfDisplays(int)
	 * @see generator.GeneratorPackage#getElementType_NumberOfDisplays()
	 * @model
	 * @generated
	 */
	int getNumberOfDisplays();

	/**
	 * Sets the value of the '{@link generator.ElementType#getNumberOfDisplays <em>Number Of Displays</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Displays</em>' attribute.
	 * @see #getNumberOfDisplays()
	 * @generated
	 */
	void setNumberOfDisplays(int value);

	/**
	 * Returns the value of the '<em><b>Inside Structure Statement</b></em>' containment reference list.
	 * The list contents are of type {@link generator.StructureStatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inside Structure Statement</em>' containment reference list.
	 * @see generator.GeneratorPackage#getElementType_InsideStructureStatement()
	 * @model containment="true"
	 * @generated
	 */
	EList<StructureStatement> getInsideStructureStatement();

	/**
	 * Returns the value of the '<em><b>Interactive Statement</b></em>' containment reference list.
	 * The list contents are of type {@link generator.InteractiveStatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interactive Statement</em>' containment reference list.
	 * @see generator.GeneratorPackage#getElementType_InteractiveStatement()
	 * @model containment="true"
	 * @generated
	 */
	EList<InteractiveStatement> getInteractiveStatement();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isElementDisplayable();

} // ElementType
