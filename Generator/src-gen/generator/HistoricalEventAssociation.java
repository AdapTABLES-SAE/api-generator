/**
 */
package generator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Historical Event Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.HistoricalEventAssociation#getSource <em>Source</em>}</li>
 *   <li>{@link generator.HistoricalEventAssociation#getMissing <em>Missing</em>}</li>
 *   <li>{@link generator.HistoricalEventAssociation#getTarget <em>Target</em>}</li>
 *   <li>{@link generator.HistoricalEventAssociation#isCheckOnLearnerAction <em>Check On Learner Action</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getHistoricalEventAssociation()
 * @model
 * @generated
 */
public interface HistoricalEventAssociation extends CompletionTask {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' attribute.
	 * The literals are from the enumeration {@link generator.EHistoryTarget}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' attribute.
	 * @see generator.EHistoryTarget
	 * @see #setSource(EHistoryTarget)
	 * @see generator.GeneratorPackage#getHistoricalEventAssociation_Source()
	 * @model
	 * @generated
	 */
	EHistoryTarget getSource();

	/**
	 * Sets the value of the '{@link generator.HistoricalEventAssociation#getSource <em>Source</em>}' attribute.
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
	 * @see generator.GeneratorPackage#getHistoricalEventAssociation_Missing()
	 * @model default="TIME"
	 * @generated
	 */
	EHistoryTarget getMissing();

	/**
	 * Sets the value of the '{@link generator.HistoricalEventAssociation#getMissing <em>Missing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Missing</em>' attribute.
	 * @see generator.EHistoryTarget
	 * @see #getMissing()
	 * @generated
	 */
	void setMissing(EHistoryTarget value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' attribute.
	 * The default value is <code>"NONE"</code>.
	 * The literals are from the enumeration {@link generator.ETimeTarget}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' attribute.
	 * @see generator.ETimeTarget
	 * @see #setTarget(ETimeTarget)
	 * @see generator.GeneratorPackage#getHistoricalEventAssociation_Target()
	 * @model default="NONE"
	 * @generated
	 */
	ETimeTarget getTarget();

	/**
	 * Sets the value of the '{@link generator.HistoricalEventAssociation#getTarget <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' attribute.
	 * @see generator.ETimeTarget
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(ETimeTarget value);

	/**
	 * Returns the value of the '<em><b>Check On Learner Action</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Check On Learner Action</em>' attribute.
	 * @see #setCheckOnLearnerAction(boolean)
	 * @see generator.GeneratorPackage#getHistoricalEventAssociation_CheckOnLearnerAction()
	 * @model default="true"
	 * @generated
	 */
	boolean isCheckOnLearnerAction();

	/**
	 * Sets the value of the '{@link generator.HistoricalEventAssociation#isCheckOnLearnerAction <em>Check On Learner Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Check On Learner Action</em>' attribute.
	 * @see #isCheckOnLearnerAction()
	 * @generated
	 */
	void setCheckOnLearnerAction(boolean value);

} // HistoricalEventAssociation
