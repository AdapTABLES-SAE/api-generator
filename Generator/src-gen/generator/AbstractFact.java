/**
 */
package generator;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Fact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.AbstractFact#getRepresentation <em>Representation</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getAbstractFact()
 * @model abstract="true"
 * @generated
 */
public interface AbstractFact extends EObject {
	/**
	 * Returns the value of the '<em><b>Representation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Representation</em>' containment reference.
	 * @see #setRepresentation(Image)
	 * @see generator.GeneratorPackage#getAbstractFact_Representation()
	 * @model containment="true"
	 * @generated
	 */
	Image getRepresentation();

	/**
	 * Sets the value of the '{@link generator.AbstractFact#getRepresentation <em>Representation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Representation</em>' containment reference.
	 * @see #getRepresentation()
	 * @generated
	 */
	void setRepresentation(Image value);

} // AbstractFact
