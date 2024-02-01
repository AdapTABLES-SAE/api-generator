/**
 */
package generator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HGQF Identification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.HGQFIdentification#isSoluce <em>Soluce</em>}</li>
 *   <li>{@link generator.HGQFIdentification#getEvent <em>Event</em>}</li>
 *   <li>{@link generator.HGQFIdentification#getTime <em>Time</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getHGQFIdentification()
 * @model
 * @generated
 */
public interface HGQFIdentification extends QuestionableFact {
	/**
	 * Returns the value of the '<em><b>Soluce</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Soluce</em>' attribute.
	 * @see #setSoluce(boolean)
	 * @see generator.GeneratorPackage#getHGQFIdentification_Soluce()
	 * @model
	 * @generated
	 */
	boolean isSoluce();

	/**
	 * Sets the value of the '{@link generator.HGQFIdentification#isSoluce <em>Soluce</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Soluce</em>' attribute.
	 * @see #isSoluce()
	 * @generated
	 */
	void setSoluce(boolean value);

	/**
	 * Returns the value of the '<em><b>Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' attribute.
	 * @see #setEvent(String)
	 * @see generator.GeneratorPackage#getHGQFIdentification_Event()
	 * @model
	 * @generated
	 */
	String getEvent();

	/**
	 * Sets the value of the '{@link generator.HGQFIdentification#getEvent <em>Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' attribute.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(String value);

	/**
	 * Returns the value of the '<em><b>Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' containment reference.
	 * @see #setTime(Time)
	 * @see generator.GeneratorPackage#getHGQFIdentification_Time()
	 * @model containment="true"
	 * @generated
	 */
	Time getTime();

	/**
	 * Sets the value of the '{@link generator.HGQFIdentification#getTime <em>Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' containment reference.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(Time value);

} // HGQFIdentification
