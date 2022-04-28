/**
 */
package generatorMetamodels;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Of Facts</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generatorMetamodels.SetOfFacts#getFacts <em>Facts</em>}</li>
 *   <li>{@link generatorMetamodels.SetOfFacts#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see generatorMetamodels.GeneratorMetamodelsPackage#getSetOfFacts()
 * @model
 * @generated
 */
public interface SetOfFacts extends AbstractFact {
	/**
	 * Returns the value of the '<em><b>Facts</b></em>' containment reference list.
	 * The list contents are of type {@link generatorMetamodels.AbstractFact}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facts</em>' containment reference list.
	 * @see generatorMetamodels.GeneratorMetamodelsPackage#getSetOfFacts_Facts()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<AbstractFact> getFacts();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see generatorMetamodels.GeneratorMetamodelsPackage#getSetOfFacts_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link generatorMetamodels.SetOfFacts#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // SetOfFacts
