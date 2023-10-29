/**
 */
package generator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Judo Questionable Technique Fact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.JudoQuestionableTechniqueFact#getSourceElementType <em>Source Element Type</em>}</li>
 *   <li>{@link generator.JudoQuestionableTechniqueFact#getMissingElement <em>Missing Element</em>}</li>
 *   <li>{@link generator.JudoQuestionableTechniqueFact#getSourceElement <em>Source Element</em>}</li>
 *   <li>{@link generator.JudoQuestionableTechniqueFact#getMissingElementType <em>Missing Element Type</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getJudoQuestionableTechniqueFact()
 * @model
 * @generated
 */
public interface JudoQuestionableTechniqueFact extends QuestionableFact {
	/**
	 * Returns the value of the '<em><b>Source Element Type</b></em>' attribute.
	 * The literals are from the enumeration {@link generator.EJudoTarget}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Element Type</em>' attribute.
	 * @see generator.EJudoTarget
	 * @see #setSourceElementType(EJudoTarget)
	 * @see generator.GeneratorPackage#getJudoQuestionableTechniqueFact_SourceElementType()
	 * @model
	 * @generated
	 */
	EJudoTarget getSourceElementType();

	/**
	 * Sets the value of the '{@link generator.JudoQuestionableTechniqueFact#getSourceElementType <em>Source Element Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Element Type</em>' attribute.
	 * @see generator.EJudoTarget
	 * @see #getSourceElementType()
	 * @generated
	 */
	void setSourceElementType(EJudoTarget value);

	/**
	 * Returns the value of the '<em><b>Missing Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Missing Element</em>' attribute.
	 * @see #setMissingElement(String)
	 * @see generator.GeneratorPackage#getJudoQuestionableTechniqueFact_MissingElement()
	 * @model
	 * @generated
	 */
	String getMissingElement();

	/**
	 * Sets the value of the '{@link generator.JudoQuestionableTechniqueFact#getMissingElement <em>Missing Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Missing Element</em>' attribute.
	 * @see #getMissingElement()
	 * @generated
	 */
	void setMissingElement(String value);

	/**
	 * Returns the value of the '<em><b>Source Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Element</em>' attribute.
	 * @see #setSourceElement(String)
	 * @see generator.GeneratorPackage#getJudoQuestionableTechniqueFact_SourceElement()
	 * @model
	 * @generated
	 */
	String getSourceElement();

	/**
	 * Sets the value of the '{@link generator.JudoQuestionableTechniqueFact#getSourceElement <em>Source Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Element</em>' attribute.
	 * @see #getSourceElement()
	 * @generated
	 */
	void setSourceElement(String value);

	/**
	 * Returns the value of the '<em><b>Missing Element Type</b></em>' attribute.
	 * The literals are from the enumeration {@link generator.EJudoTarget}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Missing Element Type</em>' attribute.
	 * @see generator.EJudoTarget
	 * @see #setMissingElementType(EJudoTarget)
	 * @see generator.GeneratorPackage#getJudoQuestionableTechniqueFact_MissingElementType()
	 * @model
	 * @generated
	 */
	EJudoTarget getMissingElementType();

	/**
	 * Sets the value of the '{@link generator.JudoQuestionableTechniqueFact#getMissingElementType <em>Missing Element Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Missing Element Type</em>' attribute.
	 * @see generator.EJudoTarget
	 * @see #getMissingElementType()
	 * @generated
	 */
	void setMissingElementType(EJudoTarget value);

} // JudoQuestionableTechniqueFact
