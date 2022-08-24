/**
 */
package generator;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.Location#getAcceptedElements <em>Accepted Elements</em>}</li>
 *   <li>{@link generator.Location#getMaxshape <em>Maxshape</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getLocation()
 * @model
 * @generated
 */
public interface Location extends EObject {
	/**
	 * Returns the value of the '<em><b>Accepted Elements</b></em>' reference list.
	 * The list contents are of type {@link generator.IRoomElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accepted Elements</em>' reference list.
	 * @see generator.GeneratorPackage#getLocation_AcceptedElements()
	 * @model required="true"
	 * @generated
	 */
	EList<IRoomElement> getAcceptedElements();

	/**
	 * Returns the value of the '<em><b>Maxshape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maxshape</em>' containment reference.
	 * @see #setMaxshape(ElementShape)
	 * @see generator.GeneratorPackage#getLocation_Maxshape()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ElementShape getMaxshape();

	/**
	 * Sets the value of the '{@link generator.Location#getMaxshape <em>Maxshape</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maxshape</em>' containment reference.
	 * @see #getMaxshape()
	 * @generated
	 */
	void setMaxshape(ElementShape value);

} // Location
