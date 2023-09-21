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
 *   <li>{@link generator.Level#getTasks <em>Tasks</em>}</li>
 *   <li>{@link generator.Level#getCompletionCriteria <em>Completion Criteria</em>}</li>
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
	 * @see #isSetID()
	 * @see #unsetID()
	 * @see #setID(String)
	 * @see generator.GeneratorPackage#getLevel_ID()
	 * @model unsettable="true" id="true"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link generator.Level#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #isSetID()
	 * @see #unsetID()
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Unsets the value of the '{@link generator.Level#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetID()
	 * @see #getID()
	 * @see #setID(String)
	 * @generated
	 */
	void unsetID();

	/**
	 * Returns whether the value of the '{@link generator.Level#getID <em>ID</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID</em>' attribute is set.
	 * @see #unsetID()
	 * @see #getID()
	 * @see #setID(String)
	 * @generated
	 */
	boolean isSetID();

	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' containment reference list.
	 * The list contents are of type {@link generator.ATask}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' containment reference list.
	 * @see generator.GeneratorPackage#getLevel_Tasks()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ATask> getTasks();

	/**
	 * Returns the value of the '<em><b>Completion Criteria</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Completion Criteria</em>' containment reference.
	 * @see #setCompletionCriteria(CompletionCriteria)
	 * @see generator.GeneratorPackage#getLevel_CompletionCriteria()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CompletionCriteria getCompletionCriteria();

	/**
	 * Sets the value of the '{@link generator.Level#getCompletionCriteria <em>Completion Criteria</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Completion Criteria</em>' containment reference.
	 * @see #getCompletionCriteria()
	 * @generated
	 */
	void setCompletionCriteria(CompletionCriteria value);

} // Level
