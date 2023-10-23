/**
 */
package generator.impl;

import generator.GeneratorPackage;
import generator.Position;
import generator.PositionedMapElement;

import generator.Visualization;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Positioned Map Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.PositionedMapElementImpl#getCreatedPositions <em>Created Positions</em>}</li>
 *   <li>{@link generator.impl.PositionedMapElementImpl#getMap <em>Map</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PositionedMapElementImpl extends PositionedElementImpl implements PositionedMapElement {
	/**
	 * The cached value of the '{@link #getCreatedPositions() <em>Created Positions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedPositions()
	 * @generated
	 * @ordered
	 */
	protected EList<Position> createdPositions;

	/**
	 * The cached value of the '{@link #getMap() <em>Map</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMap()
	 * @generated
	 * @ordered
	 */
	protected Visualization map;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositionedMapElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.POSITIONED_MAP_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Position> getCreatedPositions() {
		if (createdPositions == null) {
			createdPositions = new EObjectContainmentEList<Position>(Position.class, this,
					GeneratorPackage.POSITIONED_MAP_ELEMENT__CREATED_POSITIONS);
		}
		return createdPositions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Visualization getMap() {
		if (map != null && map.eIsProxy()) {
			InternalEObject oldMap = (InternalEObject) map;
			map = (Visualization) eResolveProxy(oldMap);
			if (map != oldMap) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							GeneratorPackage.POSITIONED_MAP_ELEMENT__MAP, oldMap, map));
			}
		}
		return map;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Visualization basicGetMap() {
		return map;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMap(Visualization newMap) {
		Visualization oldMap = map;
		map = newMap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.POSITIONED_MAP_ELEMENT__MAP, oldMap,
					map));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GeneratorPackage.POSITIONED_MAP_ELEMENT__CREATED_POSITIONS:
			return ((InternalEList<?>) getCreatedPositions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GeneratorPackage.POSITIONED_MAP_ELEMENT__CREATED_POSITIONS:
			return getCreatedPositions();
		case GeneratorPackage.POSITIONED_MAP_ELEMENT__MAP:
			if (resolve)
				return getMap();
			return basicGetMap();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case GeneratorPackage.POSITIONED_MAP_ELEMENT__CREATED_POSITIONS:
			getCreatedPositions().clear();
			getCreatedPositions().addAll((Collection<? extends Position>) newValue);
			return;
		case GeneratorPackage.POSITIONED_MAP_ELEMENT__MAP:
			setMap((Visualization) newValue);
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
		case GeneratorPackage.POSITIONED_MAP_ELEMENT__CREATED_POSITIONS:
			getCreatedPositions().clear();
			return;
		case GeneratorPackage.POSITIONED_MAP_ELEMENT__MAP:
			setMap((Visualization) null);
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
		case GeneratorPackage.POSITIONED_MAP_ELEMENT__CREATED_POSITIONS:
			return createdPositions != null && !createdPositions.isEmpty();
		case GeneratorPackage.POSITIONED_MAP_ELEMENT__MAP:
			return map != null;
		}
		return super.eIsSet(featureID);
	}

} //PositionedMapElementImpl
