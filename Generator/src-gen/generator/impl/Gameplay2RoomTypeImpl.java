/**
 */
package generator.impl;

import generator.Gameplay;
import generator.Gameplay2RoomType;
import generator.GeneratorPackage;
import generator.RoomType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gameplay2 Room Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.Gameplay2RoomTypeImpl#getRoomtype <em>Roomtype</em>}</li>
 *   <li>{@link generator.impl.Gameplay2RoomTypeImpl#getGameplay <em>Gameplay</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Gameplay2RoomTypeImpl extends ComplianceRelationsImpl implements Gameplay2RoomType {
	/**
	 * The cached value of the '{@link #getRoomtype() <em>Roomtype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomtype()
	 * @generated
	 * @ordered
	 */
	protected RoomType roomtype;

	/**
	 * The cached value of the '{@link #getGameplay() <em>Gameplay</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGameplay()
	 * @generated
	 * @ordered
	 */
	protected EList<Gameplay> gameplay;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gameplay2RoomTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.GAMEPLAY2_ROOM_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomType getRoomtype() {
		if (roomtype != null && roomtype.eIsProxy()) {
			InternalEObject oldRoomtype = (InternalEObject) roomtype;
			roomtype = (RoomType) eResolveProxy(oldRoomtype);
			if (roomtype != oldRoomtype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							GeneratorPackage.GAMEPLAY2_ROOM_TYPE__ROOMTYPE, oldRoomtype, roomtype));
			}
		}
		return roomtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomType basicGetRoomtype() {
		return roomtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoomtype(RoomType newRoomtype) {
		RoomType oldRoomtype = roomtype;
		roomtype = newRoomtype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.GAMEPLAY2_ROOM_TYPE__ROOMTYPE,
					oldRoomtype, roomtype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Gameplay> getGameplay() {
		if (gameplay == null) {
			gameplay = new EObjectResolvingEList<Gameplay>(Gameplay.class, this,
					GeneratorPackage.GAMEPLAY2_ROOM_TYPE__GAMEPLAY);
		}
		return gameplay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GeneratorPackage.GAMEPLAY2_ROOM_TYPE__ROOMTYPE:
			if (resolve)
				return getRoomtype();
			return basicGetRoomtype();
		case GeneratorPackage.GAMEPLAY2_ROOM_TYPE__GAMEPLAY:
			return getGameplay();
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
		case GeneratorPackage.GAMEPLAY2_ROOM_TYPE__ROOMTYPE:
			setRoomtype((RoomType) newValue);
			return;
		case GeneratorPackage.GAMEPLAY2_ROOM_TYPE__GAMEPLAY:
			getGameplay().clear();
			getGameplay().addAll((Collection<? extends Gameplay>) newValue);
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
		case GeneratorPackage.GAMEPLAY2_ROOM_TYPE__ROOMTYPE:
			setRoomtype((RoomType) null);
			return;
		case GeneratorPackage.GAMEPLAY2_ROOM_TYPE__GAMEPLAY:
			getGameplay().clear();
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
		case GeneratorPackage.GAMEPLAY2_ROOM_TYPE__ROOMTYPE:
			return roomtype != null;
		case GeneratorPackage.GAMEPLAY2_ROOM_TYPE__GAMEPLAY:
			return gameplay != null && !gameplay.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Gameplay2RoomTypeImpl
