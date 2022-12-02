/**
 */
package generator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MT Fact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.MTFact#getTable <em>Table</em>}</li>
 *   <li>{@link generator.MTFact#getOp <em>Op</em>}</li>
 *   <li>{@link generator.MTFact#getRes <em>Res</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getMTFact()
 * @model
 * @generated
 */
public interface MTFact extends AbstractFact {
	/**
	 * Returns the value of the '<em><b>Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' attribute.
	 * @see #setTable(int)
	 * @see generator.GeneratorPackage#getMTFact_Table()
	 * @model
	 * @generated
	 */
	int getTable();

	/**
	 * Sets the value of the '{@link generator.MTFact#getTable <em>Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table</em>' attribute.
	 * @see #getTable()
	 * @generated
	 */
	void setTable(int value);

	/**
	 * Returns the value of the '<em><b>Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op</em>' attribute.
	 * @see #setOp(int)
	 * @see generator.GeneratorPackage#getMTFact_Op()
	 * @model
	 * @generated
	 */
	int getOp();

	/**
	 * Sets the value of the '{@link generator.MTFact#getOp <em>Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op</em>' attribute.
	 * @see #getOp()
	 * @generated
	 */
	void setOp(int value);

	/**
	 * Returns the value of the '<em><b>Res</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Res</em>' attribute.
	 * @see #setRes(int)
	 * @see generator.GeneratorPackage#getMTFact_Res()
	 * @model
	 * @generated
	 */
	int getRes();

	/**
	 * Sets the value of the '{@link generator.MTFact#getRes <em>Res</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Res</em>' attribute.
	 * @see #getRes()
	 * @generated
	 */
	void setRes(int value);

} // MTFact
