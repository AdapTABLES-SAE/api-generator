/**
 */
package generator;

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
 *   <li>{@link generator.ATask#getPercentOfApparition <em>Percent Of Apparition</em>}</li>
 *   <li>{@link generator.ATask#getNbConsecutiveSuccess <em>Nb Consecutive Success</em>}</li>
 *   <li>{@link generator.ATask#getResponseModality <em>Response Modality</em>}</li>
 *   <li>{@link generator.ATask#getID <em>ID</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getATask()
 * @model abstract="true"
 * @generated
 */
public interface ATask extends EObject {
	/**
	 * Returns the value of the '<em><b>Percent Of Apparition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Percent Of Apparition</em>' attribute.
	 * @see #setPercentOfApparition(int)
	 * @see generator.GeneratorPackage#getATask_PercentOfApparition()
	 * @model
	 * @generated
	 */
	int getPercentOfApparition();

	/**
	 * Sets the value of the '{@link generator.ATask#getPercentOfApparition <em>Percent Of Apparition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Percent Of Apparition</em>' attribute.
	 * @see #getPercentOfApparition()
	 * @generated
	 */
	void setPercentOfApparition(int value);

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
	 * Returns the value of the '<em><b>Response Modality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response Modality</em>' containment reference.
	 * @see #setResponseModality(ResponseModality)
	 * @see generator.GeneratorPackage#getATask_ResponseModality()
	 * @model containment="true"
	 * @generated
	 */
	ResponseModality getResponseModality();

	/**
	 * Sets the value of the '{@link generator.ATask#getResponseModality <em>Response Modality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response Modality</em>' containment reference.
	 * @see #getResponseModality()
	 * @generated
	 */
	void setResponseModality(ResponseModality value);

	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see generator.GeneratorPackage#getATask_ID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link generator.ATask#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	ETaskType getType();

} // ATask
