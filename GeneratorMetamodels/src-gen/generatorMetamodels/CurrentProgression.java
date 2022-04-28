/**
 */
package generatorMetamodels;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Current Progression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generatorMetamodels.CurrentProgression#getLearningobjective <em>Learningobjective</em>}</li>
 *   <li>{@link generatorMetamodels.CurrentProgression#getLevel <em>Level</em>}</li>
 * </ul>
 *
 * @see generatorMetamodels.GeneratorMetamodelsPackage#getCurrentProgression()
 * @model
 * @generated
 */
public interface CurrentProgression extends EObject {
	/**
	 * Returns the value of the '<em><b>Learningobjective</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Learningobjective</em>' reference.
	 * @see #setLearningobjective(LearningObjective)
	 * @see generatorMetamodels.GeneratorMetamodelsPackage#getCurrentProgression_Learningobjective()
	 * @model required="true"
	 * @generated
	 */
	LearningObjective getLearningobjective();

	/**
	 * Sets the value of the '{@link generatorMetamodels.CurrentProgression#getLearningobjective <em>Learningobjective</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Learningobjective</em>' reference.
	 * @see #getLearningobjective()
	 * @generated
	 */
	void setLearningobjective(LearningObjective value);

	/**
	 * Returns the value of the '<em><b>Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' reference.
	 * @see #setLevel(Level)
	 * @see generatorMetamodels.GeneratorMetamodelsPackage#getCurrentProgression_Level()
	 * @model required="true"
	 * @generated
	 */
	Level getLevel();

	/**
	 * Sets the value of the '{@link generatorMetamodels.CurrentProgression#getLevel <em>Level</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' reference.
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(Level value);

} // CurrentProgression
