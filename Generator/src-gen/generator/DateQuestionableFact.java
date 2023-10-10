/**
 */
package generator;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Date Questionable Fact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.DateQuestionableFact#getSourceElement <em>Source Element</em>}</li>
 *   <li>{@link generator.DateQuestionableFact#getMissingElements <em>Missing Elements</em>}</li>
 *   <li>{@link generator.DateQuestionableFact#getSourceElementType <em>Source Element Type</em>}</li>
 *   <li>{@link generator.DateQuestionableFact#getMissingElementsType <em>Missing Elements Type</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getDateQuestionableFact()
 * @model
 * @generated
 */
public interface DateQuestionableFact extends QuestionableFact {

	/**
	 * Returns the value of the '<em><b>Source Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Element</em>' attribute.
	 * @see #setSourceElement(String)
	 * @see generator.GeneratorPackage#getDateQuestionableFact_SourceElement()
	 * @model
	 * @generated
	 */
	String getSourceElement();

	/**
	 * Sets the value of the '{@link generator.DateQuestionableFact#getSourceElement <em>Source Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Element</em>' attribute.
	 * @see #getSourceElement()
	 * @generated
	 */
	void setSourceElement(String value);

	/**
	 * Returns the value of the '<em><b>Missing Elements</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Missing Elements</em>' attribute list.
	 * @see generator.GeneratorPackage#getDateQuestionableFact_MissingElements()
	 * @model upper="2"
	 * @generated
	 */
	EList<String> getMissingElements();

	/**
	 * Returns the value of the '<em><b>Source Element Type</b></em>' attribute.
	 * The literals are from the enumeration {@link generator.EHistoryTarget}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Element Type</em>' attribute.
	 * @see generator.EHistoryTarget
	 * @see #setSourceElementType(EHistoryTarget)
	 * @see generator.GeneratorPackage#getDateQuestionableFact_SourceElementType()
	 * @model
	 * @generated
	 */
	EHistoryTarget getSourceElementType();

	/**
	 * Sets the value of the '{@link generator.DateQuestionableFact#getSourceElementType <em>Source Element Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Element Type</em>' attribute.
	 * @see generator.EHistoryTarget
	 * @see #getSourceElementType()
	 * @generated
	 */
	void setSourceElementType(EHistoryTarget value);

	/**
	 * Returns the value of the '<em><b>Missing Elements Type</b></em>' attribute.
	 * The literals are from the enumeration {@link generator.EHistoryTarget}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Missing Elements Type</em>' attribute.
	 * @see generator.EHistoryTarget
	 * @see #setMissingElementsType(EHistoryTarget)
	 * @see generator.GeneratorPackage#getDateQuestionableFact_MissingElementsType()
	 * @model
	 * @generated
	 */
	EHistoryTarget getMissingElementsType();

	/**
	 * Sets the value of the '{@link generator.DateQuestionableFact#getMissingElementsType <em>Missing Elements Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Missing Elements Type</em>' attribute.
	 * @see generator.EHistoryTarget
	 * @see #getMissingElementsType()
	 * @generated
	 */
	void setMissingElementsType(EHistoryTarget value);
} // DateQuestionableFact
