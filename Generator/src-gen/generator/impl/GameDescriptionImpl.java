/**
 */
package generator.impl;

import generator.GameDescription;
import generator.GeneratorPackage;
import generator.RoomTypes;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Game Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.GameDescriptionImpl#getRoomtypes <em>Roomtypes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GameDescriptionImpl extends MinimalEObjectImpl.Container implements GameDescription {
	/**
	 * The cached value of the '{@link #getRoomtypes() <em>Roomtypes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomtypes()
	 * @generated
	 * @ordered
	 */
	protected RoomTypes roomtypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GameDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.GAME_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomTypes getRoomtypes() {
		return roomtypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoomtypes(RoomTypes newRoomtypes, NotificationChain msgs) {
		RoomTypes oldRoomtypes = roomtypes;
		roomtypes = newRoomtypes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.GAME_DESCRIPTION__ROOMTYPES, oldRoomtypes, newRoomtypes);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoomtypes(RoomTypes newRoomtypes) {
		if (newRoomtypes != roomtypes) {
			NotificationChain msgs = null;
			if (roomtypes != null)
				msgs = ((InternalEObject) roomtypes).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.GAME_DESCRIPTION__ROOMTYPES, null, msgs);
			if (newRoomtypes != null)
				msgs = ((InternalEObject) newRoomtypes).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.GAME_DESCRIPTION__ROOMTYPES, null, msgs);
			msgs = basicSetRoomtypes(newRoomtypes, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.GAME_DESCRIPTION__ROOMTYPES,
					newRoomtypes, newRoomtypes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GeneratorPackage.GAME_DESCRIPTION__ROOMTYPES:
			return basicSetRoomtypes(null, msgs);
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
		case GeneratorPackage.GAME_DESCRIPTION__ROOMTYPES:
			return getRoomtypes();
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
		case GeneratorPackage.GAME_DESCRIPTION__ROOMTYPES:
			setRoomtypes((RoomTypes) newValue);
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
		case GeneratorPackage.GAME_DESCRIPTION__ROOMTYPES:
			setRoomtypes((RoomTypes) null);
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
		case GeneratorPackage.GAME_DESCRIPTION__ROOMTYPES:
			return roomtypes != null;
		}
		return super.eIsSet(featureID);
	}

} //GameDescriptionImpl
