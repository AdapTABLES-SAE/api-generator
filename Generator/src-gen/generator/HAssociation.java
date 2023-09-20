/**
 */
package generator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HAssociation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.HAssociation#getNbMissingElements <em>Nb Missing Elements</em>}</li>
 *   <li>{@link generator.HAssociation#getSource <em>Source</em>}</li>
 *   <li>{@link generator.HAssociation#getMissing <em>Missing</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getHAssociation()
 * @model
 * @generated
 */
public interface HAssociation extends CompletionTask {
	/**
	 * Returns the value of the '<em><b>Nb Missing Elements</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Missing Elements</em>' attribute.
	 * @see #isSetNbMissingElements()
	 * @see generator.GeneratorPackage#getHAssociation_NbMissingElements()
	 * @model default="1" unsettable="true" transient="true" changeable="false"
	 * @generated
	 */
	int getNbMissingElements();

	/**
	 * Returns whether the value of the '{@link generator.HAssociation#getNbMissingElements <em>Nb Missing Elements</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nb Missing Elements</em>' attribute is set.
	 * @see #getNbMissingElements()
	 * @generated
	 */
	boolean isSetNbMissingElements();

	/**
	 * Returns the value of the '<em><b>Source</b></em>' attribute.
	 * The literals are from the enumeration {@link generator.EHistoryTarget}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' attribute.
	 * @see generator.EHistoryTarget
	 * @see #setSource(EHistoryTarget)
	 * @see generator.GeneratorPackage#getHAssociation_Source()
	 * @model
	 * @generated
	 */
	EHistoryTarget getSource();

	/**
	 * Sets the value of the '{@link generator.HAssociation#getSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' attribute.
	 * @see generator.EHistoryTarget
	 * @see #getSource()
	 * @generated
	 */
	void setSource(EHistoryTarget value);

	/**
	 * Returns the value of the '<em><b>Missing</b></em>' attribute.
	 * The default value is <code>"TIME"</code>.
	 * The literals are from the enumeration {@link generator.EHistoryTarget}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Missing</em>' attribute.
	 * @see generator.EHistoryTarget
	 * @see #setMissing(EHistoryTarget)
	 * @see generator.GeneratorPackage#getHAssociation_Missing()
	 * @model default="TIME"
	 * @generated
	 */
	EHistoryTarget getMissing();

	/**
	 * Sets the value of the '{@link generator.HAssociation#getMissing <em>Missing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Missing</em>' attribute.
	 * @see generator.EHistoryTarget
	 * @see #getMissing()
	 * @generated
	 */
	void setMissing(EHistoryTarget value);

} // HAssociation
