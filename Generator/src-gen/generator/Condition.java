/**
 */
package generator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.Condition#getStatementTypes <em>Statement Types</em>}</li>
 *   <li>{@link generator.Condition#getNbFacts <em>Nb Facts</em>}</li>
 *   <li>{@link generator.Condition#getAnswerModality <em>Answer Modality</em>}</li>
 *   <li>{@link generator.Condition#getNbExpectedAnswers <em>Nb Expected Answers</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getCondition()
 * @model
 * @generated
 */
public interface Condition extends EObject {
	/**
	 * Returns the value of the '<em><b>Statement Types</b></em>' attribute list.
	 * The list contents are of type {@link generator.EStatementType}.
	 * The literals are from the enumeration {@link generator.EStatementType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statement Types</em>' attribute list.
	 * @see generator.EStatementType
	 * @see generator.GeneratorPackage#getCondition_StatementTypes()
	 * @model required="true"
	 * @generated
	 */
	EList<EStatementType> getStatementTypes();

	/**
	 * Returns the value of the '<em><b>Nb Facts</b></em>' attribute.
	 * The literals are from the enumeration {@link generator.EBoundary}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Facts</em>' attribute.
	 * @see generator.EBoundary
	 * @see #setNbFacts(EBoundary)
	 * @see generator.GeneratorPackage#getCondition_NbFacts()
	 * @model
	 * @generated
	 */
	EBoundary getNbFacts();

	/**
	 * Sets the value of the '{@link generator.Condition#getNbFacts <em>Nb Facts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Facts</em>' attribute.
	 * @see generator.EBoundary
	 * @see #getNbFacts()
	 * @generated
	 */
	void setNbFacts(EBoundary value);

	/**
	 * Returns the value of the '<em><b>Nb Expected Answers</b></em>' attribute.
	 * The literals are from the enumeration {@link generator.EBoundary}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Expected Answers</em>' attribute.
	 * @see generator.EBoundary
	 * @see #setNbExpectedAnswers(EBoundary)
	 * @see generator.GeneratorPackage#getCondition_NbExpectedAnswers()
	 * @model
	 * @generated
	 */
	EBoundary getNbExpectedAnswers();

	/**
	 * Sets the value of the '{@link generator.Condition#getNbExpectedAnswers <em>Nb Expected Answers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Expected Answers</em>' attribute.
	 * @see generator.EBoundary
	 * @see #getNbExpectedAnswers()
	 * @generated
	 */
	void setNbExpectedAnswers(EBoundary value);

	/**
	 * Returns the value of the '<em><b>Answer Modality</b></em>' attribute.
	 * The literals are from the enumeration {@link generator.EModality}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Answer Modality</em>' attribute.
	 * @see generator.EModality
	 * @see #setAnswerModality(EModality)
	 * @see generator.GeneratorPackage#getCondition_AnswerModality()
	 * @model
	 * @generated
	 */
	EModality getAnswerModality();

	/**
	 * Sets the value of the '{@link generator.Condition#getAnswerModality <em>Answer Modality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Answer Modality</em>' attribute.
	 * @see generator.EModality
	 * @see #getAnswerModality()
	 * @generated
	 */
	void setAnswerModality(EModality value);

} // Condition
