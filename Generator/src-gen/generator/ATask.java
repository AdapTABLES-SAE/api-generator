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
 *   <li>{@link generator.ATask#getMaxTime <em>Max Time</em>}</li>
 *   <li>{@link generator.ATask#getNbFacts <em>Nb Facts</em>}</li>
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
	 * @see #isSetID()
	 * @see #unsetID()
	 * @see #setID(String)
	 * @see generator.GeneratorPackage#getATask_ID()
	 * @model unsettable="true" id="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link generator.ATask#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #isSetID()
	 * @see #unsetID()
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Unsets the value of the '{@link generator.ATask#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetID()
	 * @see #getID()
	 * @see #setID(String)
	 * @generated
	 */
	void unsetID();

	/**
	 * Returns whether the value of the '{@link generator.ATask#getID <em>ID</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID</em>' attribute is set.
	 * @see #unsetID()
	 * @see #getID()
	 * @see #setID(String)
	 * @generated
	 */
	boolean isSetID();

	/**
	 * Returns the value of the '<em><b>Max Time</b></em>' attribute.
	 * The default value is <code>"20"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Time</em>' attribute.
	 * @see #setMaxTime(int)
	 * @see generator.GeneratorPackage#getATask_MaxTime()
	 * @model default="20"
	 * @generated
	 */
	int getMaxTime();

	/**
	 * Sets the value of the '{@link generator.ATask#getMaxTime <em>Max Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Time</em>' attribute.
	 * @see #getMaxTime()
	 * @generated
	 */
	void setMaxTime(int value);

	/**
	 * Returns the value of the '<em><b>Nb Facts</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Facts</em>' attribute.
	 * @see #setNbFacts(int)
	 * @see generator.GeneratorPackage#getATask_NbFacts()
	 * @model default="1"
	 * @generated
	 */
	int getNbFacts();

	/**
	 * Sets the value of the '{@link generator.ATask#getNbFacts <em>Nb Facts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Facts</em>' attribute.
	 * @see #getNbFacts()
	 * @generated
	 */
	void setNbFacts(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	ETaskType getType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isCheckOnLearnerAction();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	int nbExpectedAnswers();

} // ATask
