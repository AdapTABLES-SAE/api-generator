/**
 */
package generator;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>APosition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.APosition#getSize <em>Size</em>}</li>
 *   <li>{@link generator.APosition#getRestrictedTo <em>Restricted To</em>}</li>
 *   <li>{@link generator.APosition#getID <em>ID</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getAPosition()
 * @model abstract="true"
 * @generated
 */
public interface APosition extends EObject {
	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * The literals are from the enumeration {@link generator.ElementSize}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see generator.ElementSize
	 * @see #setSize(ElementSize)
	 * @see generator.GeneratorPackage#getAPosition_Size()
	 * @model
	 * @generated
	 */
	ElementSize getSize();

	/**
	 * Sets the value of the '{@link generator.APosition#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see generator.ElementSize
	 * @see #getSize()
	 * @generated
	 */
	void setSize(ElementSize value);

	/**
	 * Returns the value of the '<em><b>Restricted To</b></em>' reference list.
	 * The list contents are of type {@link generator.Ability}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Restricted To</em>' reference list.
	 * @see generator.GeneratorPackage#getAPosition_RestrictedTo()
	 * @model
	 * @generated
	 */
	EList<Ability> getRestrictedTo();

	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see generator.GeneratorPackage#getAPosition_ID()
	 * @model id="true"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link generator.APosition#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

} // APosition
