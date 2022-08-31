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
 *   <li>{@link generator.CurrentObjectiveLevel#getLearningobjective <em>Learningobjective</em>}</li>
 *   <li>{@link generator.CurrentObjectiveLevel#isAchieved <em>Achieved</em>}</li>
 *   <li>{@link generator.CurrentObjectiveLevel#getLevel <em>Level</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getCurrentObjectiveLevel()
 * @model
 * @generated
 */
public interface CurrentObjectiveLevel extends EObject {
	/**
	 * Returns the value of the '<em><b>Learningobjective</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Learningobjective</em>' reference.
	 * @see #setLearningobjective(LearningObjective)
	 * @see generator.GeneratorPackage#getCurrentObjectiveLevel_Learningobjective()
	 * @model required="true"
	 * @generated
	 */
	LearningObjective getLearningobjective();

	/**
	 * Sets the value of the '{@link generator.CurrentObjectiveLevel#getLearningobjective <em>Learningobjective</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Learningobjective</em>' reference.
	 * @see #getLearningobjective()
	 * @generated
	 */
	void setLearningobjective(LearningObjective value);

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

} // CurrentObjectiveLevel
