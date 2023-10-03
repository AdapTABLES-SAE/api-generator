/**
 */
package generator;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classrooms</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.Classrooms#getClassrooms <em>Classrooms</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getClassrooms()
 * @model
 * @generated
 */
public interface Classrooms extends EObject {
	/**
	 * Returns the value of the '<em><b>Classrooms</b></em>' containment reference list.
	 * The list contents are of type {@link generator.Classroom}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classrooms</em>' containment reference list.
	 * @see generator.GeneratorPackage#getClassrooms_Classrooms()
	 * @model containment="true"
	 * @generated
	 */
	EList<Classroom> getClassrooms();

} // Classrooms
