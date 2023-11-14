/**
 */
package generator;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Order Questionable Fact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.OrderQuestionableFact#getSolutions <em>Solutions</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getOrderQuestionableFact()
 * @model
 * @generated
 */
public interface OrderQuestionableFact extends QuestionableFact {
	/**
	 * Returns the value of the '<em><b>Solutions</b></em>' containment reference list.
	 * The list contents are of type {@link generator.OrderSolution}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solutions</em>' containment reference list.
	 * @see generator.GeneratorPackage#getOrderQuestionableFact_Solutions()
	 * @model containment="true"
	 * @generated
	 */
	EList<OrderSolution> getSolutions();

} // OrderQuestionableFact
