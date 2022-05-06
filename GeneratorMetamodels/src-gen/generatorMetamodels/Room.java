/**
 */
package generatorMetamodels;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generatorMetamodels.Room#getConcreteelements <em>Concreteelements</em>}</li>
 * </ul>
 *
 * @see generatorMetamodels.GeneratorMetamodelsPackage#getRoom()
 * @model abstract="true"
 * @generated
 */
public interface Room extends EObject {
	/**
	 * Returns the value of the '<em><b>Concreteelements</b></em>' reference list.
	 * The list contents are of type {@link generatorMetamodels.ConcreteElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concreteelements</em>' reference list.
	 * @see generatorMetamodels.GeneratorMetamodelsPackage#getRoom_Concreteelements()
	 * @model
	 * @generated
	 */
	EList<ConcreteElement> getConcreteelements();

} // Room
