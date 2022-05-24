/**
 */
package generatorMetamodels;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Objective</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generatorMetamodels.SubObjective#getPercentageOfApparition <em>Percentage Of Apparition</em>}</li>
 *   <li>{@link generatorMetamodels.SubObjective#getPercentageOfValidFacts <em>Percentage Of Valid Facts</em>}</li>
 *   <li>{@link generatorMetamodels.SubObjective#getNbConsecutiveSuccess <em>Nb Consecutive Success</em>}</li>
 *   <li>{@link generatorMetamodels.SubObjective#getResponsemodality <em>Responsemodality</em>}</li>
 * </ul>
 *
 * @see generatorMetamodels.GeneratorMetamodelsPackage#getSubObjective()
 * @model abstract="true"
 * @generated
 */
public interface SubObjective extends EObject {
	/**
	 * Returns the value of the '<em><b>Percentage Of Apparition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Percentage Of Apparition</em>' attribute.
	 * @see #setPercentageOfApparition(int)
	 * @see generatorMetamodels.GeneratorMetamodelsPackage#getSubObjective_PercentageOfApparition()
	 * @model
	 * @generated
	 */
	int getPercentageOfApparition();

	/**
	 * Sets the value of the '{@link generatorMetamodels.SubObjective#getPercentageOfApparition <em>Percentage Of Apparition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Percentage Of Apparition</em>' attribute.
	 * @see #getPercentageOfApparition()
	 * @generated
	 */
	void setPercentageOfApparition(int value);

	/**
	 * Returns the value of the '<em><b>Percentage Of Valid Facts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Percentage Of Valid Facts</em>' attribute.
	 * @see #setPercentageOfValidFacts(int)
	 * @see generatorMetamodels.GeneratorMetamodelsPackage#getSubObjective_PercentageOfValidFacts()
	 * @model
	 * @generated
	 */
	int getPercentageOfValidFacts();

	/**
	 * Sets the value of the '{@link generatorMetamodels.SubObjective#getPercentageOfValidFacts <em>Percentage Of Valid Facts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Percentage Of Valid Facts</em>' attribute.
	 * @see #getPercentageOfValidFacts()
	 * @generated
	 */
	void setPercentageOfValidFacts(int value);

	/**
	 * Returns the value of the '<em><b>Nb Consecutive Success</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Consecutive Success</em>' attribute.
	 * @see #setNbConsecutiveSuccess(int)
	 * @see generatorMetamodels.GeneratorMetamodelsPackage#getSubObjective_NbConsecutiveSuccess()
	 * @model
	 * @generated
	 */
	int getNbConsecutiveSuccess();

	/**
	 * Sets the value of the '{@link generatorMetamodels.SubObjective#getNbConsecutiveSuccess <em>Nb Consecutive Success</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Consecutive Success</em>' attribute.
	 * @see #getNbConsecutiveSuccess()
	 * @generated
	 */
	void setNbConsecutiveSuccess(int value);

	/**
	 * Returns the value of the '<em><b>Responsemodality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsemodality</em>' containment reference.
	 * @see #setResponsemodality(ResponseModality)
	 * @see generatorMetamodels.GeneratorMetamodelsPackage#getSubObjective_Responsemodality()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ResponseModality getResponsemodality();

	/**
	 * Sets the value of the '{@link generatorMetamodels.SubObjective#getResponsemodality <em>Responsemodality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responsemodality</em>' containment reference.
	 * @see #getResponsemodality()
	 * @generated
	 */
	void setResponsemodality(ResponseModality value);

} // SubObjective
