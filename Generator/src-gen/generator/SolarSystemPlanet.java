/**
 */
package generator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Solar System Planet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.SolarSystemPlanet#getName <em>Name</em>}</li>
 *   <li>{@link generator.SolarSystemPlanet#getSunDistance <em>Sun Distance</em>}</li>
 *   <li>{@link generator.SolarSystemPlanet#getOrbitPosition <em>Orbit Position</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getSolarSystemPlanet()
 * @model
 * @generated
 */
public interface SolarSystemPlanet extends AbstractFact {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see generator.GeneratorPackage#getSolarSystemPlanet_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link generator.SolarSystemPlanet#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Sun Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sun Distance</em>' attribute.
	 * @see #setSunDistance(long)
	 * @see generator.GeneratorPackage#getSolarSystemPlanet_SunDistance()
	 * @model
	 * @generated
	 */
	long getSunDistance();

	/**
	 * Sets the value of the '{@link generator.SolarSystemPlanet#getSunDistance <em>Sun Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sun Distance</em>' attribute.
	 * @see #getSunDistance()
	 * @generated
	 */
	void setSunDistance(long value);

	/**
	 * Returns the value of the '<em><b>Orbit Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orbit Position</em>' reference.
	 * @see #setOrbitPosition(VisualizationPosition)
	 * @see generator.GeneratorPackage#getSolarSystemPlanet_OrbitPosition()
	 * @model
	 * @generated
	 */
	VisualizationPosition getOrbitPosition();

	/**
	 * Sets the value of the '{@link generator.SolarSystemPlanet#getOrbitPosition <em>Orbit Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orbit Position</em>' reference.
	 * @see #getOrbitPosition()
	 * @generated
	 */
	void setOrbitPosition(VisualizationPosition value);

} // SolarSystemPlanet
