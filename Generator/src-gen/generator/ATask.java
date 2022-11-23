/**
 */
package generator;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ATask</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.ATask#getPercentageOfApparition <em>Percentage Of Apparition</em>}</li>
 *   <li>{@link generator.ATask#getNbConsecutiveSuccess <em>Nb Consecutive Success</em>}</li>
 *   <li>{@link generator.ATask#getPercentageOfValidFacts <em>Percentage Of Valid Facts</em>}</li>
 *   <li>{@link generator.ATask#getResponsemodalities <em>Responsemodalities</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getATask()
 * @model abstract="true"
 * @generated
 */
public interface ATask extends EObject {
	/**
	 * Returns the value of the '<em><b>Percentage Of Apparition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Percentage Of Apparition</em>' attribute.
	 * @see #setPercentageOfApparition(int)
	 * @see generator.GeneratorPackage#getATask_PercentageOfApparition()
	 * @model
	 * @generated
	 */
	int getPercentageOfApparition();

	/**
	 * Sets the value of the '{@link generator.ATask#getPercentageOfApparition <em>Percentage Of Apparition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Percentage Of Apparition</em>' attribute.
	 * @see #getPercentageOfApparition()
	 * @generated
	 */
	void setPercentageOfApparition(int value);

	/**
	 * Returns the value of the '<em><b>Nb Consecutive Success</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Consecutive Success</em>' attribute.
	 * @see #setNbConsecutiveSuccess(int)
	 * @see generator.GeneratorPackage#getATask_NbConsecutiveSuccess()
	 * @model
	 * @generated
	 */
	int getNbConsecutiveSuccess();

	/**
	 * Sets the value of the '{@link generator.ATask#getNbConsecutiveSuccess <em>Nb Consecutive Success</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Consecutive Success</em>' attribute.
	 * @see #getNbConsecutiveSuccess()
	 * @generated
	 */
	void setNbConsecutiveSuccess(int value);

	/**
	 * Returns the value of the '<em><b>Percentage Of Valid Facts</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Percentage Of Valid Facts</em>' attribute.
	 * @see #setPercentageOfValidFacts(int)
	 * @see generator.GeneratorPackage#getATask_PercentageOfValidFacts()
	 * @model default="0"
	 * @generated
	 */
	int getPercentageOfValidFacts();

	/**
	 * Sets the value of the '{@link generator.ATask#getPercentageOfValidFacts <em>Percentage Of Valid Facts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Percentage Of Valid Facts</em>' attribute.
	 * @see #getPercentageOfValidFacts()
	 * @generated
	 */
	void setPercentageOfValidFacts(int value);

	/**
	 * Returns the value of the '<em><b>Responsemodalities</b></em>' containment reference list.
	 * The list contents are of type {@link generator.ResponseModality}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsemodalities</em>' containment reference list.
	 * @see generator.GeneratorPackage#getATask_Responsemodalities()
	 * @model containment="true"
	 * @generated
	 */
	EList<ResponseModality> getResponsemodalities();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	ETaskType getType();

} // ATask
