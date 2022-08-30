/**
 */
package generator;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.TaskType#getNbPropositions <em>Nb Propositions</em>}</li>
 *   <li>{@link generator.TaskType#isEnterResponseAllowed <em>Enter Response Allowed</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getTaskType()
 * @model abstract="true"
 * @generated
 */
public interface TaskType extends EObject {
	/**
	 * Returns the value of the '<em><b>Nb Propositions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Propositions</em>' attribute.
	 * @see #setNbPropositions(int)
	 * @see generator.GeneratorPackage#getTaskType_NbPropositions()
	 * @model
	 * @generated
	 */
	int getNbPropositions();

	/**
	 * Sets the value of the '{@link generator.TaskType#getNbPropositions <em>Nb Propositions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Propositions</em>' attribute.
	 * @see #getNbPropositions()
	 * @generated
	 */
	void setNbPropositions(int value);

	/**
	 * Returns the value of the '<em><b>Enter Response Allowed</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enter Response Allowed</em>' attribute.
	 * @see #setEnterResponseAllowed(boolean)
	 * @see generator.GeneratorPackage#getTaskType_EnterResponseAllowed()
	 * @model default="false"
	 * @generated
	 */
	boolean isEnterResponseAllowed();

	/**
	 * Sets the value of the '{@link generator.TaskType#isEnterResponseAllowed <em>Enter Response Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enter Response Allowed</em>' attribute.
	 * @see #isEnterResponseAllowed()
	 * @generated
	 */
	void setEnterResponseAllowed(boolean value);

} // TaskType
