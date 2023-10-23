/**
 */
package generator;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vizualisation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.Vizualisation#getPositions <em>Positions</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getVizualisation()
 * @model
 * @generated
 */
public interface Vizualisation extends Image {
	/**
	 * Returns the value of the '<em><b>Positions</b></em>' containment reference list.
	 * The list contents are of type {@link generator.VizualisationPosition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Positions</em>' containment reference list.
	 * @see generator.GeneratorPackage#getVizualisation_Positions()
	 * @model containment="true"
	 * @generated
	 */
	EList<VizualisationPosition> getPositions();

} // Vizualisation
