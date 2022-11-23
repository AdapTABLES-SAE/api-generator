/**
 */
package generator;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Current Objective Level</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.CurrentObjectiveLevel#getObjective <em>Objective</em>}</li>
 *   <li>{@link generator.CurrentObjectiveLevel#isAchieved <em>Achieved</em>}</li>
 *   <li>{@link generator.CurrentObjectiveLevel#getLevel <em>Level</em>}</li>
 *   <li>{@link generator.CurrentObjectiveLevel#getResults <em>Results</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getCurrentObjectiveLevel()
 * @model
 * @generated
 */
public interface CurrentObjectiveLevel extends EObject {
	/**
	 * Returns the value of the '<em><b>Objective</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objective</em>' reference.
	 * @see #setObjective(Objective)
	 * @see generator.GeneratorPackage#getCurrentObjectiveLevel_Objective()
	 * @model required="true"
	 * @generated
	 */
	Objective getObjective();

	/**
	 * Sets the value of the '{@link generator.CurrentObjectiveLevel#getObjective <em>Objective</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Objective</em>' reference.
	 * @see #getObjective()
	 * @generated
	 */
	void setObjective(Objective value);

	/**
	 * Returns the value of the '<em><b>Achieved</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Achieved</em>' attribute.
	 * @see #setAchieved(boolean)
	 * @see generator.GeneratorPackage#getCurrentObjectiveLevel_Achieved()
	 * @model
	 * @generated
	 */
	boolean isAchieved();

	/**
	 * Sets the value of the '{@link generator.CurrentObjectiveLevel#isAchieved <em>Achieved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Achieved</em>' attribute.
	 * @see #isAchieved()
	 * @generated
	 */
	void setAchieved(boolean value);

	/**
	 * Returns the value of the '<em><b>Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' reference.
	 * @see #setLevel(Level)
	 * @see generator.GeneratorPackage#getCurrentObjectiveLevel_Level()
	 * @model required="true"
	 * @generated
	 */
	Level getLevel();

	/**
	 * Sets the value of the '{@link generator.CurrentObjectiveLevel#getLevel <em>Level</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' reference.
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(Level value);

	/**
	 * Returns the value of the '<em><b>Results</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Results</em>' containment reference.
	 * @see #setResults(Results)
	 * @see generator.GeneratorPackage#getCurrentObjectiveLevel_Results()
	 * @model containment="true"
	 * @generated
	 */
	Results getResults();

	/**
	 * Sets the value of the '{@link generator.CurrentObjectiveLevel#getResults <em>Results</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Results</em>' containment reference.
	 * @see #getResults()
	 * @generated
	 */
	void setResults(Results value);

} // CurrentObjectiveLevel
