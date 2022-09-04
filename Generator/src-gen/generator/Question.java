/**
 */
package generator;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Question</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.Question#getPosition <em>Position</em>}</li>
 *   <li>{@link generator.Question#getIncompleteFact <em>Incomplete Fact</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getQuestion()
 * @model
 * @generated
 */
public interface Question extends EObject {
	/**
	 * Returns the value of the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' reference.
	 * @see #setPosition(Position)
	 * @see generator.GeneratorPackage#getQuestion_Position()
	 * @model required="true"
	 * @generated
	 */
	Position getPosition();

	/**
	 * Sets the value of the '{@link generator.Question#getPosition <em>Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' reference.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(Position value);

	/**
	 * Returns the value of the '<em><b>Incomplete Fact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incomplete Fact</em>' attribute.
	 * @see #setIncompleteFact(String)
	 * @see generator.GeneratorPackage#getQuestion_IncompleteFact()
	 * @model
	 * @generated
	 */
	String getIncompleteFact();

	/**
	 * Sets the value of the '{@link generator.Question#getIncompleteFact <em>Incomplete Fact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incomplete Fact</em>' attribute.
	 * @see #getIncompleteFact()
	 * @generated
	 */
	void setIncompleteFact(String value);

} // Question
