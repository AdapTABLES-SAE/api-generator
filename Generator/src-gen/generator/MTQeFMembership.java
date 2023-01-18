/**
 */
package generator;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MT Qe FMembership</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.MTQeFMembership#getBadPropositions <em>Bad Propositions</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getMTQeFMembership()
 * @model
 * @generated
 */
public interface MTQeFMembership extends QuestionedFact {
	/**
	 * Returns the value of the '<em><b>Bad Propositions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bad Propositions</em>' attribute list.
	 * @see generator.GeneratorPackage#getMTQeFMembership_BadPropositions()
	 * @model
	 * @generated
	 */
	EList<Integer> getBadPropositions();

} // MTQeFMembership
