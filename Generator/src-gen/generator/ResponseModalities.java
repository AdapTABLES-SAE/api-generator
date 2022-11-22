/**
 */
package generator;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Response Modalities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.ResponseModalities#getResponsemodalities <em>Responsemodalities</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getResponseModalities()
 * @model
 * @generated
 */
public interface ResponseModalities extends EObject {
	/**
	 * Returns the value of the '<em><b>Responsemodalities</b></em>' containment reference list.
	 * The list contents are of type {@link generator.ResponseModality}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsemodalities</em>' containment reference list.
	 * @see generator.GeneratorPackage#getResponseModalities_Responsemodalities()
	 * @model containment="true"
	 * @generated
	 */
	EList<ResponseModality> getResponsemodalities();

} // ResponseModalities
