/**
 */
package generator;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prompt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.Prompt#getPrompt <em>Prompt</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getPrompt()
 * @model
 * @generated
 */
public interface Prompt extends EObject {
	/**
	 * Returns the value of the '<em><b>Prompt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prompt</em>' attribute.
	 * @see #setPrompt(String)
	 * @see generator.GeneratorPackage#getPrompt_Prompt()
	 * @model
	 * @generated
	 */
	String getPrompt();

	/**
	 * Sets the value of the '{@link generator.Prompt#getPrompt <em>Prompt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prompt</em>' attribute.
	 * @see #getPrompt()
	 * @generated
	 */
	void setPrompt(String value);

} // Prompt
