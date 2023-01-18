/**
 */
package generator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MTQF Completion1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.MTQFCompletion1#getLeftOperand <em>Left Operand</em>}</li>
 *   <li>{@link generator.MTQFCompletion1#getRightOperand <em>Right Operand</em>}</li>
 *   <li>{@link generator.MTQFCompletion1#getResult <em>Result</em>}</li>
 *   <li>{@link generator.MTQFCompletion1#getSoluce <em>Soluce</em>}</li>
 *   <li>{@link generator.MTQFCompletion1#isResultOnRight <em>Result On Right</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getMTQFCompletion1()
 * @model
 * @generated
 */
public interface MTQFCompletion1 extends QuestionableFact {
	/**
	 * Returns the value of the '<em><b>Left Operand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Operand</em>' attribute.
	 * @see #setLeftOperand(int)
	 * @see generator.GeneratorPackage#getMTQFCompletion1_LeftOperand()
	 * @model
	 * @generated
	 */
	int getLeftOperand();

	/**
	 * Sets the value of the '{@link generator.MTQFCompletion1#getLeftOperand <em>Left Operand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Operand</em>' attribute.
	 * @see #getLeftOperand()
	 * @generated
	 */
	void setLeftOperand(int value);

	/**
	 * Returns the value of the '<em><b>Right Operand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Operand</em>' attribute.
	 * @see #setRightOperand(int)
	 * @see generator.GeneratorPackage#getMTQFCompletion1_RightOperand()
	 * @model
	 * @generated
	 */
	int getRightOperand();

	/**
	 * Sets the value of the '{@link generator.MTQFCompletion1#getRightOperand <em>Right Operand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Operand</em>' attribute.
	 * @see #getRightOperand()
	 * @generated
	 */
	void setRightOperand(int value);

	/**
	 * Returns the value of the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result</em>' attribute.
	 * @see #setResult(int)
	 * @see generator.GeneratorPackage#getMTQFCompletion1_Result()
	 * @model
	 * @generated
	 */
	int getResult();

	/**
	 * Sets the value of the '{@link generator.MTQFCompletion1#getResult <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' attribute.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(int value);

	/**
	 * Returns the value of the '<em><b>Soluce</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Soluce</em>' attribute.
	 * @see #setSoluce(int)
	 * @see generator.GeneratorPackage#getMTQFCompletion1_Soluce()
	 * @model
	 * @generated
	 */
	int getSoluce();

	/**
	 * Sets the value of the '{@link generator.MTQFCompletion1#getSoluce <em>Soluce</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Soluce</em>' attribute.
	 * @see #getSoluce()
	 * @generated
	 */
	void setSoluce(int value);

	/**
	 * Returns the value of the '<em><b>Result On Right</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result On Right</em>' attribute.
	 * @see #setResultOnRight(boolean)
	 * @see generator.GeneratorPackage#getMTQFCompletion1_ResultOnRight()
	 * @model default="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isResultOnRight();

	/**
	 * Sets the value of the '{@link generator.MTQFCompletion1#isResultOnRight <em>Result On Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result On Right</em>' attribute.
	 * @see #isResultOnRight()
	 * @generated
	 */
	void setResultOnRight(boolean value);

} // MTQFCompletion1
