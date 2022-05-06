/**
 */
package generatorMetamodels;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gaming Objective</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generatorMetamodels.GamingObjective#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see generatorMetamodels.GeneratorMetamodelsPackage#getGamingObjective()
 * @model
 * @generated
 */
public interface GamingObjective extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see generatorMetamodels.GeneratorMetamodelsPackage#getGamingObjective_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link generatorMetamodels.GamingObjective#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // GamingObjective
