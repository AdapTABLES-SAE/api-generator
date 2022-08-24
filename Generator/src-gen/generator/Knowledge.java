/**
 */
package generator;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Knowledge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.Knowledge#getName <em>Name</em>}</li>
 *   <li>{@link generator.Knowledge#getKnowledgefacts <em>Knowledgefacts</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getKnowledge()
 * @model
 * @generated
 */
public interface Knowledge extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see generator.GeneratorPackage#getKnowledge_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link generator.Knowledge#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Knowledgefacts</b></em>' containment reference list.
	 * The list contents are of type {@link generator.AbstractFact}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Knowledgefacts</em>' containment reference list.
	 * @see generator.GeneratorPackage#getKnowledge_Knowledgefacts()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractFact> getKnowledgefacts();

} // Knowledge
