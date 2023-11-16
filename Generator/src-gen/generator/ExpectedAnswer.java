/**
 */
package generator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expected Answer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.ExpectedAnswer#isImage <em>Image</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getExpectedAnswer()
 * @model
 * @generated
 */
public interface ExpectedAnswer extends Parameter {

	/**
	 * Returns the value of the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image</em>' attribute.
	 * @see #setImage(boolean)
	 * @see generator.GeneratorPackage#getExpectedAnswer_Image()
	 * @model
	 * @generated
	 */
	boolean isImage();

	/**
	 * Sets the value of the '{@link generator.ExpectedAnswer#isImage <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image</em>' attribute.
	 * @see #isImage()
	 * @generated
	 */
	void setImage(boolean value);
} // ExpectedAnswer
