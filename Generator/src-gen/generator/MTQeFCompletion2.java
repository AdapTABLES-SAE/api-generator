/**
 */
package generator;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MT Qe FCompletion2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.MTQeFCompletion2#getPropositions <em>Propositions</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getMTQeFCompletion2()
 * @model
 * @generated
 */
public interface MTQeFCompletion2 extends QuestionedFact {
	/**
	 * Returns the value of the '<em><b>Propositions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Propositions</em>' attribute list.
	 * @see generator.GeneratorPackage#getMTQeFCompletion2_Propositions()
	 * @model unique="false"
	 * @generated
	 */
	EList<Integer> getPropositions();

} // MTQeFCompletion2
