/**
 */
package generator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Teachers</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.Teachers#getTeachers <em>Teachers</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getTeachers()
 * @model
 * @generated
 */
public interface Teachers extends EObject {
	/**
	 * Returns the value of the '<em><b>Teachers</b></em>' containment reference list.
	 * The list contents are of type {@link generator.Teacher}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Teachers</em>' containment reference list.
	 * @see generator.GeneratorPackage#getTeachers_Teachers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Teacher> getTeachers();

} // Teachers
