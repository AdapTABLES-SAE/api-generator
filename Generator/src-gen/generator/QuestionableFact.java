/**
 */
package generator;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Questionable Fact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.QuestionableFact#getQfresults <em>Qfresults</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getQuestionableFact()
 * @model abstract="true"
 * @generated
 */
public interface QuestionableFact extends EObject {
	/**
	 * Returns the value of the '<em><b>Qfresults</b></em>' containment reference list.
	 * The list contents are of type {@link generator.QFResults}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qfresults</em>' containment reference list.
	 * @see generator.GeneratorPackage#getQuestionableFact_Qfresults()
	 * @model containment="true"
	 * @generated
	 */
	EList<QFResults> getQfresults();

} // QuestionableFact
