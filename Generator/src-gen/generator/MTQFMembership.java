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
 *   <li>{@link generator.MTQFMembership#getGoodResults <em>Good Results</em>}</li>
 *   <li>{@link generator.MTQFMembership#getTable <em>Table</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getMTQFMembership()
 * @model
 * @generated
 */
public interface MTQFMembership extends QuestionableFact {
	/**
	 * Returns the value of the '<em><b>Good Results</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Good Results</em>' attribute list.
	 * @see generator.GeneratorPackage#getMTQFMembership_GoodResults()
	 * @model required="true"
	 * @generated
	 */
	EList<Integer> getGoodResults();

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getQuestionableFact();

} // MTQFMembership
