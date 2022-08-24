/**
 */
package generator;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Level</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.Level#getID <em>ID</em>}</li>
 *   <li>{@link generator.Level#getSubobjectives <em>Subobjectives</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getLevel()
 * @model abstract="true"
 * @generated
 */
public interface Level extends EObject {
	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see generator.GeneratorPackage#getLevel_ID()
	 * @model id="true" changeable="false"
	 * @generated
	 */
	String getID();

	/**
	 * Returns the value of the '<em><b>Subobjectives</b></em>' containment reference list.
	 * The list contents are of type {@link generator.SubObjective}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subobjectives</em>' containment reference list.
	 * @see generator.GeneratorPackage#getLevel_Subobjectives()
	 * @model containment="true"
	 * @generated
	 */
	EList<SubObjective> getSubobjectives();

} // Level
