/**
 */
package generator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enter Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.EnterResponse#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getEnterResponse()
 * @model
 * @generated
 */
public interface EnterResponse extends ResponseModality {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"INPUT"</code>.
	 * The literals are from the enumeration {@link generator.EModality}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see generator.EModality
	 * @see generator.GeneratorPackage#getEnterResponse_Type()
	 * @model default="INPUT" changeable="false"
	 * @generated
	 */
	EModality getType();

} // EnterResponse
