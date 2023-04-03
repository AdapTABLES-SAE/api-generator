/**
 */
package generator;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AComponent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.AComponent#getPriority <em>Priority</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getAComponent()
 * @model abstract="true"
 * @generated
 */
public interface AComponent extends EObject {
	/**
	 * Returns the value of the '<em><b>Priority</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' containment reference.
	 * @see #setPriority(Priority)
	 * @see generator.GeneratorPackage#getAComponent_Priority()
	 * @model containment="true"
	 * @generated
	 */
	Priority getPriority();

	/**
	 * Sets the value of the '{@link generator.AComponent#getPriority <em>Priority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' containment reference.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(Priority value);

} // AComponent
