/**
 */
package generator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Position</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.Position#getSize <em>Size</em>}</li>
 *   <li>{@link generator.Position#getRestrictedTo <em>Restricted To</em>}</li>
 *   <li>{@link generator.Position#getID <em>ID</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getPosition()
 * @model
 * @generated
 */
public interface Position extends EObject {

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * The literals are from the enumeration {@link generator.ElementSize}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see generator.ElementSize
	 * @see #setSize(ElementSize)
	 * @see generator.GeneratorPackage#getPosition_Size()
	 * @model
	 * @generated
	 */
	ElementSize getSize();

	/**
	 * Sets the value of the '{@link generator.Position#getSize <em>Size</em>}' attribute.
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
	 * @see generator.GeneratorPackage#getPosition_RestrictedTo()
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
	 * @see generator.GeneratorPackage#getPosition_ID()
	 * @model id="true"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link generator.Position#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);
} // Position
