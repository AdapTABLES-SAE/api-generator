/**
 */
package generator;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MTQF Membership</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.MTQFMembership#getGoodChoices <em>Good Choices</em>}</li>
 *   <li>{@link generator.MTQFMembership#getTable <em>Table</em>}</li>
 *   <li>{@link generator.MTQFMembership#isResultOfTable <em>Result Of Table</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getMTQFMembership()
 * @model
 * @generated
 */
public interface MTQFMembership extends QuestionableFact {
	/**
	 * Returns the value of the '<em><b>Good Choices</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Good Choices</em>' attribute list.
	 * @see generator.GeneratorPackage#getMTQFMembership_GoodChoices()
	 * @model required="true"
	 * @generated
	 */
	EList<Integer> getGoodChoices();

	/**
	 * Returns the value of the '<em><b>Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' attribute.
	 * @see #setTable(int)
	 * @see generator.GeneratorPackage#getMTQFMembership_Table()
	 * @model
	 * @generated
	 */
	int getTable();

	/**
	 * Sets the value of the '{@link generator.MTQFMembership#getTable <em>Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table</em>' attribute.
	 * @see #getTable()
	 * @generated
	 */
	void setTable(int value);

	/**
	 * Returns the value of the '<em><b>Result Of Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result Of Table</em>' attribute.
	 * @see #setResultOfTable(boolean)
	 * @see generator.GeneratorPackage#getMTQFMembership_ResultOfTable()
	 * @model
	 * @generated
	 */
	boolean isResultOfTable();

	/**
	 * Sets the value of the '{@link generator.MTQFMembership#isResultOfTable <em>Result Of Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result Of Table</em>' attribute.
	 * @see #isResultOfTable()
	 * @generated
	 */
	void setResultOfTable(boolean value);

} // MTQFMembership
