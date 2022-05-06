/**
 */
package generatorMetamodels;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Game Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generatorMetamodels.GameDomain#getGamingobjectives <em>Gamingobjectives</em>}</li>
 *   <li>{@link generatorMetamodels.GameDomain#getGameelements <em>Gameelements</em>}</li>
 * </ul>
 *
 * @see generatorMetamodels.GeneratorMetamodelsPackage#getGameDomain()
 * @model
 * @generated
 */
public interface GameDomain extends EObject {
	/**
	 * Returns the value of the '<em><b>Gamingobjectives</b></em>' containment reference list.
	 * The list contents are of type {@link generatorMetamodels.GamingObjective}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gamingobjectives</em>' containment reference list.
	 * @see generatorMetamodels.GeneratorMetamodelsPackage#getGameDomain_Gamingobjectives()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<GamingObjective> getGamingobjectives();

	/**
	 * Returns the value of the '<em><b>Gameelements</b></em>' containment reference list.
	 * The list contents are of type {@link generatorMetamodels.GameElements}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gameelements</em>' containment reference list.
	 * @see generatorMetamodels.GeneratorMetamodelsPackage#getGameDomain_Gameelements()
	 * @model containment="true"
	 * @generated
	 */
	EList<GameElements> getGameelements();

} // GameDomain
