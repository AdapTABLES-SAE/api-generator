/**
 */
package generatorMetamodels;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Adapted Learning Game Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generatorMetamodels.AdaptedLearningGameActivity#getDungeon <em>Dungeon</em>}</li>
 * </ul>
 *
 * @see generatorMetamodels.GeneratorMetamodelsPackage#getAdaptedLearningGameActivity()
 * @model
 * @generated
 */
public interface AdaptedLearningGameActivity extends EObject {
	/**
	 * Returns the value of the '<em><b>Dungeon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dungeon</em>' containment reference.
	 * @see #setDungeon(Dungeon)
	 * @see generatorMetamodels.GeneratorMetamodelsPackage#getAdaptedLearningGameActivity_Dungeon()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Dungeon getDungeon();

	/**
	 * Sets the value of the '{@link generatorMetamodels.AdaptedLearningGameActivity#getDungeon <em>Dungeon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dungeon</em>' containment reference.
	 * @see #getDungeon()
	 * @generated
	 */
	void setDungeon(Dungeon value);

} // AdaptedLearningGameActivity
