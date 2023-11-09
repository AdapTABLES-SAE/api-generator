/**
 */
package generator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Legend AMap</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.LegendAMap#getNbMissingElements <em>Nb Missing Elements</em>}</li>
 *   <li>{@link generator.LegendAMap#getMissing <em>Missing</em>}</li>
 *   <li>{@link generator.LegendAMap#isGraphicTask <em>Graphic Task</em>}</li>
 *   <li>{@link generator.LegendAMap#isCheckOnLearnerAction <em>Check On Learner Action</em>}</li>
 *   <li>{@link generator.LegendAMap#isNoStatementTask <em>No Statement Task</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getLegendAMap()
 * @model
 * @generated
 */
public interface LegendAMap extends CompletionTask {
	/**
	 * Returns the value of the '<em><b>Nb Missing Elements</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Missing Elements</em>' attribute.
	 * @see #isSetNbMissingElements()
	 * @see generator.GeneratorPackage#getLegendAMap_NbMissingElements()
	 * @model default="1" unsettable="true" transient="true" changeable="false"
	 * @generated
	 */
	int getNbMissingElements();

	/**
	 * Returns whether the value of the '{@link generator.LegendAMap#getNbMissingElements <em>Nb Missing Elements</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nb Missing Elements</em>' attribute is set.
	 * @see #getNbMissingElements()
	 * @generated
	 */
	boolean isSetNbMissingElements();

	/**
	 * Returns the value of the '<em><b>Missing</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * The literals are from the enumeration {@link generator.ELegendTarget}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Missing</em>' attribute.
	 * @see generator.ELegendTarget
	 * @see #setMissing(ELegendTarget)
	 * @see generator.GeneratorPackage#getLegendAMap_Missing()
	 * @model default=""
	 * @generated
	 */
	ELegendTarget getMissing();

	/**
	 * Sets the value of the '{@link generator.LegendAMap#getMissing <em>Missing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Missing</em>' attribute.
	 * @see generator.ELegendTarget
	 * @see #getMissing()
	 * @generated
	 */
	void setMissing(ELegendTarget value);

	/**
	 * Returns the value of the '<em><b>Graphic Task</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graphic Task</em>' attribute.
	 * @see #setGraphicTask(boolean)
	 * @see generator.GeneratorPackage#getLegendAMap_GraphicTask()
	 * @model default="true"
	 * @generated
	 */
	boolean isGraphicTask();

	/**
	 * Sets the value of the '{@link generator.LegendAMap#isGraphicTask <em>Graphic Task</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graphic Task</em>' attribute.
	 * @see #isGraphicTask()
	 * @generated
	 */
	void setGraphicTask(boolean value);

	/**
	 * Returns the value of the '<em><b>Check On Learner Action</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Check On Learner Action</em>' attribute.
	 * @see #setCheckOnLearnerAction(boolean)
	 * @see generator.GeneratorPackage#getLegendAMap_CheckOnLearnerAction()
	 * @model default="false"
	 * @generated
	 */
	boolean isCheckOnLearnerAction();

	/**
	 * Sets the value of the '{@link generator.LegendAMap#isCheckOnLearnerAction <em>Check On Learner Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Check On Learner Action</em>' attribute.
	 * @see #isCheckOnLearnerAction()
	 * @generated
	 */
	void setCheckOnLearnerAction(boolean value);

	/**
	 * Returns the value of the '<em><b>No Statement Task</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>No Statement Task</em>' attribute.
	 * @see #setNoStatementTask(boolean)
	 * @see generator.GeneratorPackage#getLegendAMap_NoStatementTask()
	 * @model default="true"
	 * @generated
	 */
	boolean isNoStatementTask();

	/**
	 * Sets the value of the '{@link generator.LegendAMap#isNoStatementTask <em>No Statement Task</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Statement Task</em>' attribute.
	 * @see #isNoStatementTask()
	 * @generated
	 */
	void setNoStatementTask(boolean value);

} // LegendAMap
