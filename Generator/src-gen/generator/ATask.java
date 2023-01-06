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
 *   <li>{@link generator.ATask#getPercentOfApparition <em>Percent Of Apparition</em>}</li>
 *   <li>{@link generator.ATask#getNbConsecutiveSuccess <em>Nb Consecutive Success</em>}</li>
 *   <li>{@link generator.ATask#getResponsemodalities <em>Responsemodalities</em>}</li>
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
