/**
 */
package generator.impl;

import generator.GeneratorPackage;
import generator.PlanetOrder;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Planet Order</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.PlanetOrderImpl#getPlanet <em>Planet</em>}</li>
 *   <li>{@link generator.impl.PlanetOrderImpl#getOrder <em>Order</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlanetOrderImpl extends MinimalEObjectImpl.Container implements PlanetOrder {
	/**
	 * The default value of the '{@link #getPlanet() <em>Planet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanet()
	 * @generated
	 * @ordered
	 */
	protected static final String PLANET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlanet() <em>Planet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanet()
	 * @generated
	 * @ordered
	 */
	protected String planet = PLANET_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrder() <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected static final int ORDER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOrder() <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected int order = ORDER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanetOrderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.PLANET_ORDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPlanet() {
		return planet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlanet(String newPlanet) {
		String oldPlanet = planet;
		planet = newPlanet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.PLANET_ORDER__PLANET, oldPlanet,
					planet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOrder() {
		return order;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrder(int newOrder) {
		int oldOrder = order;
		order = newOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.PLANET_ORDER__ORDER, oldOrder,
					order));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GeneratorPackage.PLANET_ORDER__PLANET:
			return getPlanet();
		case GeneratorPackage.PLANET_ORDER__ORDER:
			return getOrder();
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
		case GeneratorPackage.PLANET_ORDER__PLANET:
			setPlanet((String) newValue);
			return;
		case GeneratorPackage.PLANET_ORDER__ORDER:
			setOrder((Integer) newValue);
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
		case GeneratorPackage.PLANET_ORDER__PLANET:
			setPlanet(PLANET_EDEFAULT);
			return;
		case GeneratorPackage.PLANET_ORDER__ORDER:
			setOrder(ORDER_EDEFAULT);
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
		case GeneratorPackage.PLANET_ORDER__PLANET:
			return PLANET_EDEFAULT == null ? planet != null : !PLANET_EDEFAULT.equals(planet);
		case GeneratorPackage.PLANET_ORDER__ORDER:
			return order != ORDER_EDEFAULT;
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
		result.append(" (planet: ");
		result.append(planet);
		result.append(", order: ");
		result.append(order);
		result.append(')');
		return result.toString();
	}

} //PlanetOrderImpl
