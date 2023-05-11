/**
 */
package generator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement Element Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.StatementElementType#isForStructure <em>For Structure</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getStatementElementType()
 * @model
 * @generated
 */
public interface StatementElementType extends ElementType {
	/**
	 * Returns the value of the '<em><b>For Structure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>For Structure</em>' attribute.
	 * @see #setForStructure(boolean)
	 * @see generator.GeneratorPackage#getStatementElementType_ForStructure()
	 * @model
	 * @generated
	 */
	boolean isForStructure();

	/**
	 * Sets the value of the '{@link generator.StatementElementType#isForStructure <em>For Structure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>For Structure</em>' attribute.
	 * @see #isForStructure()
	 * @generated
	 */
	void setForStructure(boolean value);

} // StatementElementType
