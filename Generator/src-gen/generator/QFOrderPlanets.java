/**
 */
package generator;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QF Order Planets</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.QFOrderPlanets#getSolutions <em>Solutions</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getQFOrderPlanets()
 * @model
 * @generated
 */
public interface QFOrderPlanets extends QuestionableFact {
	/**
	 * Returns the value of the '<em><b>Solutions</b></em>' containment reference list.
	 * The list contents are of type {@link generator.PlanetOrder}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solutions</em>' containment reference list.
	 * @see generator.GeneratorPackage#getQFOrderPlanets_Solutions()
	 * @model containment="true"
	 * @generated
	 */
	EList<PlanetOrder> getSolutions();

} // QFOrderPlanets
