/**
 */
package generator;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Progression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.Progression#getCurrentobjectivelevels <em>Currentobjectivelevels</em>}</li>
 *   <li>{@link generator.Progression#getCurrentGameLevel <em>Current Game Level</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getProgression()
 * @model
 * @generated
 */
public interface Progression extends EObject {
	/**
	 * Returns the value of the '<em><b>Currentobjectivelevels</b></em>' containment reference list.
	 * The list contents are of type {@link generator.CurrentObjectiveLevel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currentobjectivelevels</em>' containment reference list.
	 * @see generator.GeneratorPackage#getProgression_Currentobjectivelevels()
	 * @model containment="true"
	 * @generated
	 */
	EList<CurrentObjectiveLevel> getCurrentobjectivelevels();

	/**
	 * Returns the value of the '<em><b>Current Game Level</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Game Level</em>' containment reference.
	 * @see #setCurrentGameLevel(CurrentGameLevel)
	 * @see generator.GeneratorPackage#getProgression_CurrentGameLevel()
	 * @model containment="true"
	 * @generated
	 */
	CurrentGameLevel getCurrentGameLevel();

	/**
	 * Sets the value of the '{@link generator.Progression#getCurrentGameLevel <em>Current Game Level</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Game Level</em>' containment reference.
	 * @see #getCurrentGameLevel()
	 * @generated
	 */
	void setCurrentGameLevel(CurrentGameLevel value);

} // Progression
