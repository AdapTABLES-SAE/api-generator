/**
 */
package generator;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HG Order Questionable Fact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.HGOrderQuestionableFact#getSolutions <em>Solutions</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getHGOrderQuestionableFact()
 * @model
 * @generated
 */
public interface HGOrderQuestionableFact extends QuestionableFact {
	/**
	 * Returns the value of the '<em><b>Solutions</b></em>' containment reference list.
	 * The list contents are of type {@link generator.HGOrderSolution}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solutions</em>' containment reference list.
	 * @see generator.GeneratorPackage#getHGOrderQuestionableFact_Solutions()
	 * @model containment="true"
	 * @generated
	 */
	EList<HGOrderSolution> getSolutions();

} // HGOrderQuestionableFact
