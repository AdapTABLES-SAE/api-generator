/**
 */
package generator;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Results</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.Results#getResultsbytask <em>Resultsbytask</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getResults()
 * @model
 * @generated
 */
public interface Results extends EObject {
	/**
	 * Returns the value of the '<em><b>Resultsbytask</b></em>' containment reference list.
	 * The list contents are of type {@link generator.ResultsByTask}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resultsbytask</em>' containment reference list.
	 * @see generator.GeneratorPackage#getResults_Resultsbytask()
	 * @model containment="true"
	 * @generated
	 */
	EList<ResultsByTask> getResultsbytask();

} // Results
