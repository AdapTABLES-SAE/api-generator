/**
 */
package generator;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data For Wrong Answers</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.DataForWrongAnswers#getType <em>Type</em>}</li>
 *   <li>{@link generator.DataForWrongAnswers#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getDataForWrongAnswers()
 * @model
 * @generated
 */
public interface DataForWrongAnswers extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link generator.EGeographyValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see generator.EGeographyValue
	 * @see #setType(EGeographyValue)
	 * @see generator.GeneratorPackage#getDataForWrongAnswers_Type()
	 * @model
	 * @generated
	 */
	EGeographyValue getType();

	/**
	 * Sets the value of the '{@link generator.DataForWrongAnswers#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see generator.EGeographyValue
	 * @see #getType()
	 * @generated
	 */
	void setType(EGeographyValue value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see generator.GeneratorPackage#getDataForWrongAnswers_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link generator.DataForWrongAnswers#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // DataForWrongAnswers
