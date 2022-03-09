/**
 */
package demo;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generated Parameters</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link demo.GeneratedParameters#getLearningobjective <em>Learningobjective</em>}</li>
 * </ul>
 *
 * @see demo.DemoPackage#getGeneratedParameters()
 * @model
 * @generated
 */
public interface GeneratedParameters extends EObject {
	/**
	 * Returns the value of the '<em><b>Learningobjective</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Learningobjective</em>' reference.
	 * @see #setLearningobjective(LearningObjective)
	 * @see demo.DemoPackage#getGeneratedParameters_Learningobjective()
	 * @model required="true"
	 * @generated
	 */
	LearningObjective getLearningobjective();

	/**
	 * Sets the value of the '{@link demo.GeneratedParameters#getLearningobjective <em>Learningobjective</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Learningobjective</em>' reference.
	 * @see #getLearningobjective()
	 * @generated
	 */
	void setLearningobjective(LearningObjective value);

} // GeneratedParameters
