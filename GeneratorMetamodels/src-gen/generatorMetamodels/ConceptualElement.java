/**
 */
package generatorMetamodels;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conceptual Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generatorMetamodels.ConceptualElement#getRepresentations <em>Representations</em>}</li>
 *   <li>{@link generatorMetamodels.ConceptualElement#isAdaptable <em>Adaptable</em>}</li>
 * </ul>
 *
 * @see generatorMetamodels.GeneratorMetamodelsPackage#getConceptualElement()
 * @model
 * @generated
 */
public interface ConceptualElement extends GameElements {
	/**
	 * Returns the value of the '<em><b>Representations</b></em>' reference list.
	 * The list contents are of type {@link generatorMetamodels.ConcreteElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Representations</em>' reference list.
	 * @see generatorMetamodels.GeneratorMetamodelsPackage#getConceptualElement_Representations()
	 * @model required="true"
	 * @generated
	 */
	EList<ConcreteElement> getRepresentations();

	/**
	 * Returns the value of the '<em><b>Adaptable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adaptable</em>' attribute.
	 * @see #setAdaptable(boolean)
	 * @see generatorMetamodels.GeneratorMetamodelsPackage#getConceptualElement_Adaptable()
	 * @model
	 * @generated
	 */
	boolean isAdaptable();

	/**
	 * Sets the value of the '{@link generatorMetamodels.ConceptualElement#isAdaptable <em>Adaptable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adaptable</em>' attribute.
	 * @see #isAdaptable()
	 * @generated
	 */
	void setAdaptable(boolean value);

} // ConceptualElement
