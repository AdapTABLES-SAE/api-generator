/**
 */
package generator;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MT Qe FRebuild</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.MTQeFRebuild#getPropositions <em>Propositions</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getMTQeFRebuild()
 * @model
 * @generated
 */
public interface MTQeFRebuild extends QuestionedFact {
	/**
	 * Returns the value of the '<em><b>Propositions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Propositions</em>' attribute list.
	 * @see generator.GeneratorPackage#getMTQeFRebuild_Propositions()
	 * @model lower="3"
	 * @generated
	 */
	EList<Integer> getPropositions();

} // MTQeFRebuild
