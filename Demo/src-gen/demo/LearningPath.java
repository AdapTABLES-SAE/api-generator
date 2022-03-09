/**
 */
package demo;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Learning Path</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link demo.LearningPath#getLearningobjective <em>Learningobjective</em>}</li>
 *   <li>{@link demo.LearningPath#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see demo.DemoPackage#getLearningPath()
 * @model
 * @generated
 */
public interface LearningPath extends EObject {
	/**
	 * Returns the value of the '<em><b>Learningobjective</b></em>' containment reference list.
	 * The list contents are of type {@link demo.LearningObjective}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Learningobjective</em>' containment reference list.
	 * @see demo.DemoPackage#getLearningPath_Learningobjective()
	 * @model containment="true"
	 * @generated
	 */
	EList<LearningObjective> getLearningobjective();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see demo.DemoPackage#getLearningPath_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link demo.LearningPath#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // LearningPath
