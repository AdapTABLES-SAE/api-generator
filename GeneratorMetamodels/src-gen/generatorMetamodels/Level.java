/**
 */
package generatorMetamodels;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Level</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generatorMetamodels.Level#getSubobjectives <em>Subobjectives</em>}</li>
 *   <li>{@link generatorMetamodels.Level#getID <em>ID</em>}</li>
 *   <li>{@link generatorMetamodels.Level#getSettings <em>Settings</em>}</li>
 * </ul>
 *
 * @see generatorMetamodels.GeneratorMetamodelsPackage#getLevel()
 * @model
 * @generated
 */
public interface Level extends EObject {
	/**
	 * Returns the value of the '<em><b>Subobjectives</b></em>' reference list.
	 * The list contents are of type {@link generatorMetamodels.SubObjective}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subobjectives</em>' reference list.
	 * @see generatorMetamodels.GeneratorMetamodelsPackage#getLevel_Subobjectives()
	 * @model
	 * @generated
	 */
	EList<SubObjective> getSubobjectives();

	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see generatorMetamodels.GeneratorMetamodelsPackage#getLevel_ID()
	 * @model id="true"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link generatorMetamodels.Level#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Returns the value of the '<em><b>Settings</b></em>' containment reference list.
	 * The list contents are of type {@link generatorMetamodels.Settings}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Settings</em>' containment reference list.
	 * @see generatorMetamodels.GeneratorMetamodelsPackage#getLevel_Settings()
	 * @model containment="true"
	 * @generated
	 */
	EList<Settings> getSettings();

} // Level
