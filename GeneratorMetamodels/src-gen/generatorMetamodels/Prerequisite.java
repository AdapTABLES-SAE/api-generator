/**
 */
package generatorMetamodels;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prerequisite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generatorMetamodels.Prerequisite#getSuccessPercentage <em>Success Percentage</em>}</li>
 *   <li>{@link generatorMetamodels.Prerequisite#getPrerequisite <em>Prerequisite</em>}</li>
 * </ul>
 *
 * @see generatorMetamodels.GeneratorMetamodelsPackage#getPrerequisite()
 * @model
 * @generated
 */
public interface Prerequisite extends EObject {
	/**
	 * Returns the value of the '<em><b>Success Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Success Percentage</em>' attribute.
	 * @see #setSuccessPercentage(int)
	 * @see generatorMetamodels.GeneratorMetamodelsPackage#getPrerequisite_SuccessPercentage()
	 * @model
	 * @generated
	 */
	int getSuccessPercentage();

	/**
	 * Sets the value of the '{@link generatorMetamodels.Prerequisite#getSuccessPercentage <em>Success Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Success Percentage</em>' attribute.
	 * @see #getSuccessPercentage()
	 * @generated
	 */
	void setSuccessPercentage(int value);

	/**
	 * Returns the value of the '<em><b>Prerequisite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prerequisite</em>' reference.
	 * @see #setPrerequisite(Level)
	 * @see generatorMetamodels.GeneratorMetamodelsPackage#getPrerequisite_Prerequisite()
	 * @model required="true"
	 * @generated
	 */
	Level getPrerequisite();

	/**
	 * Sets the value of the '{@link generatorMetamodels.Prerequisite#getPrerequisite <em>Prerequisite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prerequisite</em>' reference.
	 * @see #getPrerequisite()
	 * @generated
	 */
	void setPrerequisite(Level value);

} // Prerequisite
