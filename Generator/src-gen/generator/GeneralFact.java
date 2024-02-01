/**
 */
package generator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>General Fact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.GeneralFact#getWrongData <em>Wrong Data</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getGeneralFact()
 * @model abstract="true"
 * @generated
 */
public interface GeneralFact extends EObject {

	/**
	 * Returns the value of the '<em><b>Wrong Data</b></em>' containment reference list.
	 * The list contents are of type {@link generator.WrongData}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wrong Data</em>' containment reference list.
	 * @see generator.GeneratorPackage#getGeneralFact_WrongData()
	 * @model containment="true"
	 * @generated
	 */
	EList<WrongData> getWrongData();
} // GeneralFact
