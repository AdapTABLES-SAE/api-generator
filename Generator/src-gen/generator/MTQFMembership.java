/**
 */
package generator;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MTQF Membership</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.MTQFMembership#getGoodResults <em>Good Results</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getMTQFMembership()
 * @model
 * @generated
 */
public interface MTQFMembership extends QuestionableFact {
	/**
	 * Returns the value of the '<em><b>Good Results</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Good Results</em>' attribute list.
	 * @see generator.GeneratorPackage#getMTQFMembership_GoodResults()
	 * @model required="true"
	 * @generated
	 */
	EList<Integer> getGoodResults();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getQuestionableFact();

} // MTQFMembership
