/**
 */
package generator;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MT Qe FCompletion1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.MTQeFCompletion1#getPropositions <em>Propositions</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getMTQeFCompletion1()
 * @model
 * @generated
 */
public interface MTQeFCompletion1 extends QuestionedFact {
	/**
	 * Returns the value of the '<em><b>Propositions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Propositions</em>' attribute list.
	 * @see generator.GeneratorPackage#getMTQeFCompletion1_Propositions()
	 * @model unique="false"
	 * @generated
	 */
	EList<Integer> getPropositions();

} // MTQeFCompletion1
