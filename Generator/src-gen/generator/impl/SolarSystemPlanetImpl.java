/**
 */
package generator.impl;

import generator.GeneratorPackage;
import generator.SolarSystemPlanet;

import generator.VisualizationPosition;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Solar System Planet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.SolarSystemPlanetImpl#getName <em>Name</em>}</li>
 *   <li>{@link generator.impl.SolarSystemPlanetImpl#getSunDistance <em>Sun Distance</em>}</li>
 *   <li>{@link generator.impl.SolarSystemPlanetImpl#getOrbitPosition <em>Orbit Position</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SolarSystemPlanetImpl extends AbstractFactImpl implements SolarSystemPlanet {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSunDistance() <em>Sun Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSunDistance()
	 * @generated
	 * @ordered
	 */
	protected static final long SUN_DISTANCE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getSunDistance() <em>Sun Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSunDistance()
	 * @generated
	 * @ordered
	 */
	protected long sunDistance = SUN_DISTANCE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOrbitPosition() <em>Orbit Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrbitPosition()
	 * @generated
	 * @ordered
	 */
	protected VisualizationPosition orbitPosition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolarSystemPlanetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.SOLAR_SYSTEM_PLANET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.SOLAR_SYSTEM_PLANET__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getSunDistance() {
		return sunDistance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSunDistance(long newSunDistance) {
		long oldSunDistance = sunDistance;
		sunDistance = newSunDistance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.SOLAR_SYSTEM_PLANET__SUN_DISTANCE,
					oldSunDistance, sunDistance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisualizationPosition getOrbitPosition() {
		if (orbitPosition != null && orbitPosition.eIsProxy()) {
			InternalEObject oldOrbitPosition = (InternalEObject) orbitPosition;
			orbitPosition = (VisualizationPosition) eResolveProxy(oldOrbitPosition);
			if (orbitPosition != oldOrbitPosition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							GeneratorPackage.SOLAR_SYSTEM_PLANET__ORBIT_POSITION, oldOrbitPosition, orbitPosition));
			}
		}
		return orbitPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisualizationPosition basicGetOrbitPosition() {
		return orbitPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrbitPosition(VisualizationPosition newOrbitPosition) {
		VisualizationPosition oldOrbitPosition = orbitPosition;
		orbitPosition = newOrbitPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.SOLAR_SYSTEM_PLANET__ORBIT_POSITION,
					oldOrbitPosition, orbitPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GeneratorPackage.SOLAR_SYSTEM_PLANET__NAME:
			return getName();
		case GeneratorPackage.SOLAR_SYSTEM_PLANET__SUN_DISTANCE:
			return getSunDistance();
		case GeneratorPackage.SOLAR_SYSTEM_PLANET__ORBIT_POSITION:
			if (resolve)
				return getOrbitPosition();
			return basicGetOrbitPosition();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case GeneratorPackage.SOLAR_SYSTEM_PLANET__NAME:
			setName((String) newValue);
			return;
		case GeneratorPackage.SOLAR_SYSTEM_PLANET__SUN_DISTANCE:
			setSunDistance((Long) newValue);
			return;
		case GeneratorPackage.SOLAR_SYSTEM_PLANET__ORBIT_POSITION:
			setOrbitPosition((VisualizationPosition) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case GeneratorPackage.SOLAR_SYSTEM_PLANET__NAME:
			setName(NAME_EDEFAULT);
			return;
		case GeneratorPackage.SOLAR_SYSTEM_PLANET__SUN_DISTANCE:
			setSunDistance(SUN_DISTANCE_EDEFAULT);
			return;
		case GeneratorPackage.SOLAR_SYSTEM_PLANET__ORBIT_POSITION:
			setOrbitPosition((VisualizationPosition) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case GeneratorPackage.SOLAR_SYSTEM_PLANET__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case GeneratorPackage.SOLAR_SYSTEM_PLANET__SUN_DISTANCE:
			return sunDistance != SUN_DISTANCE_EDEFAULT;
		case GeneratorPackage.SOLAR_SYSTEM_PLANET__ORBIT_POSITION:
			return orbitPosition != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", sunDistance: ");
		result.append(sunDistance);
		result.append(')');
		return result.toString();
	}

} //SolarSystemPlanetImpl
