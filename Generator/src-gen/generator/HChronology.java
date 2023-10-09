/**
 */
package generator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HChronology</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.HChronology#isMixDatePeriod <em>Mix Date Period</em>}</li>
 *   <li>{@link generator.HChronology#isGraphicTask <em>Graphic Task</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getHChronology()
 * @model
 * @generated
 */
public interface HChronology extends OrderingTask {
	/**
	 * Returns the value of the '<em><b>Mix Date Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mix Date Period</em>' attribute.
	 * @see #setMixDatePeriod(boolean)
	 * @see generator.GeneratorPackage#getHChronology_MixDatePeriod()
	 * @model
	 * @generated
	 */
	boolean isMixDatePeriod();

	/**
	 * Sets the value of the '{@link generator.HChronology#isMixDatePeriod <em>Mix Date Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mix Date Period</em>' attribute.
	 * @see #isMixDatePeriod()
	 * @generated
	 */
	void setMixDatePeriod(boolean value);

	/**
	 * Returns the value of the '<em><b>Graphic Task</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graphic Task</em>' attribute.
	 * @see #setGraphicTask(boolean)
	 * @see generator.GeneratorPackage#getHChronology_GraphicTask()
	 * @model default="true"
	 * @generated
	 */
	boolean isGraphicTask();

	/**
	 * Sets the value of the '{@link generator.HChronology#isGraphicTask <em>Graphic Task</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graphic Task</em>' attribute.
	 * @see #isGraphicTask()
	 * @generated
	 */
	void setGraphicTask(boolean value);

} // HChronology
