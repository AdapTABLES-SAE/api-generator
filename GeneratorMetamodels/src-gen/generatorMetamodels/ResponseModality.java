/**
 */
package generatorMetamodels;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Response Modality</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generatorMetamodels.ResponseModality#getResponseTime <em>Response Time</em>}</li>
 * </ul>
 *
 * @see generatorMetamodels.GeneratorMetamodelsPackage#getResponseModality()
 * @model abstract="true"
 * @generated
 */
public interface ResponseModality extends EObject {
	/**
	 * Returns the value of the '<em><b>Response Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response Time</em>' attribute.
	 * @see #setResponseTime(int)
	 * @see generatorMetamodels.GeneratorMetamodelsPackage#getResponseModality_ResponseTime()
	 * @model
	 * @generated
	 */
	int getResponseTime();

	/**
	 * Sets the value of the '{@link generatorMetamodels.ResponseModality#getResponseTime <em>Response Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response Time</em>' attribute.
	 * @see #getResponseTime()
	 * @generated
	 */
	void setResponseTime(int value);

} // ResponseModality
