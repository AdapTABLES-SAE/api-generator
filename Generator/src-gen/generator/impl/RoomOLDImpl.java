/**
 */
package generator.impl;

import generator.GeneratorPackage;
import generator.Pathway;
import generator.RoomOLD;
import generator.RoomType2;
import generator.State;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room OLD</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.RoomOLDImpl#getSouth <em>South</em>}</li>
 *   <li>{@link generator.impl.RoomOLDImpl#getNorth <em>North</em>}</li>
 *   <li>{@link generator.impl.RoomOLDImpl#getEast <em>East</em>}</li>
 *   <li>{@link generator.impl.RoomOLDImpl#getWest <em>West</em>}</li>
 *   <li>{@link generator.impl.RoomOLDImpl#getRoomtype <em>Roomtype</em>}</li>
 *   <li>{@link generator.impl.RoomOLDImpl#getInitialState <em>Initial State</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class RoomOLDImpl extends MinimalEObjectImpl.Container implements RoomOLD {
	/**
	 * The cached value of the '{@link #getSouth() <em>South</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSouth()
	 * @generated
	 * @ordered
	 */
	protected Pathway south;

	/**
	 * The cached value of the '{@link #getNorth() <em>North</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNorth()
	 * @generated
	 * @ordered
	 */
	protected Pathway north;

	/**
	 * The cached value of the '{@link #getEast() <em>East</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEast()
	 * @generated
	 * @ordered
	 */
	protected Pathway east;

	/**
	 * The cached value of the '{@link #getWest() <em>West</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWest()
	 * @generated
	 * @ordered
	 */
	protected Pathway west;

	/**
	 * The cached value of the '{@link #getRoomtype() <em>Roomtype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomtype()
	 * @generated
	 * @ordered
	 */
	protected RoomType2 roomtype;

	/**
	 * The cached value of the '{@link #getInitialState() <em>Initial State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialState()
	 * @generated
	 * @ordered
	 */
	protected State initialState;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomOLDImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.ROOM_OLD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pathway getSouth() {
		return south;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSouth(Pathway newSouth, NotificationChain msgs) {
		Pathway oldSouth = south;
		south = newSouth;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.ROOM_OLD__SOUTH, oldSouth, newSouth);
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
	public void setSouth(Pathway newSouth) {
		if (newSouth != south) {
			NotificationChain msgs = null;
			if (south != null)
				msgs = ((InternalEObject) south).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.ROOM_OLD__SOUTH, null, msgs);
			if (newSouth != null)
				msgs = ((InternalEObject) newSouth).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.ROOM_OLD__SOUTH, null, msgs);
			msgs = basicSetSouth(newSouth, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.ROOM_OLD__SOUTH, newSouth,
					newSouth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pathway getNorth() {
		return north;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNorth(Pathway newNorth, NotificationChain msgs) {
		Pathway oldNorth = north;
		north = newNorth;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.ROOM_OLD__NORTH, oldNorth, newNorth);
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
	public void setNorth(Pathway newNorth) {
		if (newNorth != north) {
			NotificationChain msgs = null;
			if (north != null)
				msgs = ((InternalEObject) north).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.ROOM_OLD__NORTH, null, msgs);
			if (newNorth != null)
				msgs = ((InternalEObject) newNorth).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.ROOM_OLD__NORTH, null, msgs);
			msgs = basicSetNorth(newNorth, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.ROOM_OLD__NORTH, newNorth,
					newNorth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pathway getEast() {
		return east;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEast(Pathway newEast, NotificationChain msgs) {
		Pathway oldEast = east;
		east = newEast;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.ROOM_OLD__EAST, oldEast, newEast);
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
	public void setEast(Pathway newEast) {
		if (newEast != east) {
			NotificationChain msgs = null;
			if (east != null)
				msgs = ((InternalEObject) east).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.ROOM_OLD__EAST, null, msgs);
			if (newEast != null)
				msgs = ((InternalEObject) newEast).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.ROOM_OLD__EAST, null, msgs);
			msgs = basicSetEast(newEast, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.ROOM_OLD__EAST, newEast, newEast));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pathway getWest() {
		return west;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWest(Pathway newWest, NotificationChain msgs) {
		Pathway oldWest = west;
		west = newWest;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.ROOM_OLD__WEST, oldWest, newWest);
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
	public void setWest(Pathway newWest) {
		if (newWest != west) {
			NotificationChain msgs = null;
			if (west != null)
				msgs = ((InternalEObject) west).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.ROOM_OLD__WEST, null, msgs);
			if (newWest != null)
				msgs = ((InternalEObject) newWest).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.ROOM_OLD__WEST, null, msgs);
			msgs = basicSetWest(newWest, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.ROOM_OLD__WEST, newWest, newWest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomType2 getRoomtype() {
		if (roomtype != null && roomtype.eIsProxy()) {
			InternalEObject oldRoomtype = (InternalEObject) roomtype;
			roomtype = (RoomType2) eResolveProxy(oldRoomtype);
			if (roomtype != oldRoomtype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GeneratorPackage.ROOM_OLD__ROOMTYPE,
							oldRoomtype, roomtype));
			}
		}
		return roomtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomType2 basicGetRoomtype() {
		return roomtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoomtype(RoomType2 newRoomtype) {
		RoomType2 oldRoomtype = roomtype;
		roomtype = newRoomtype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.ROOM_OLD__ROOMTYPE, oldRoomtype,
					roomtype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getInitialState() {
		return initialState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitialState(State newInitialState, NotificationChain msgs) {
		State oldInitialState = initialState;
		initialState = newInitialState;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.ROOM_OLD__INITIAL_STATE, oldInitialState, newInitialState);
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
	public void setInitialState(State newInitialState) {
		if (newInitialState != initialState) {
			NotificationChain msgs = null;
			if (initialState != null)
				msgs = ((InternalEObject) initialState).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.ROOM_OLD__INITIAL_STATE, null, msgs);
			if (newInitialState != null)
				msgs = ((InternalEObject) newInitialState).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.ROOM_OLD__INITIAL_STATE, null, msgs);
			msgs = basicSetInitialState(newInitialState, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.ROOM_OLD__INITIAL_STATE,
					newInitialState, newInitialState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GeneratorPackage.ROOM_OLD__SOUTH:
			return basicSetSouth(null, msgs);
		case GeneratorPackage.ROOM_OLD__NORTH:
			return basicSetNorth(null, msgs);
		case GeneratorPackage.ROOM_OLD__EAST:
			return basicSetEast(null, msgs);
		case GeneratorPackage.ROOM_OLD__WEST:
			return basicSetWest(null, msgs);
		case GeneratorPackage.ROOM_OLD__INITIAL_STATE:
			return basicSetInitialState(null, msgs);
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
		case GeneratorPackage.ROOM_OLD__SOUTH:
			return getSouth();
		case GeneratorPackage.ROOM_OLD__NORTH:
			return getNorth();
		case GeneratorPackage.ROOM_OLD__EAST:
			return getEast();
		case GeneratorPackage.ROOM_OLD__WEST:
			return getWest();
		case GeneratorPackage.ROOM_OLD__ROOMTYPE:
			if (resolve)
				return getRoomtype();
			return basicGetRoomtype();
		case GeneratorPackage.ROOM_OLD__INITIAL_STATE:
			return getInitialState();
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
		case GeneratorPackage.ROOM_OLD__SOUTH:
			setSouth((Pathway) newValue);
			return;
		case GeneratorPackage.ROOM_OLD__NORTH:
			setNorth((Pathway) newValue);
			return;
		case GeneratorPackage.ROOM_OLD__EAST:
			setEast((Pathway) newValue);
			return;
		case GeneratorPackage.ROOM_OLD__WEST:
			setWest((Pathway) newValue);
			return;
		case GeneratorPackage.ROOM_OLD__ROOMTYPE:
			setRoomtype((RoomType2) newValue);
			return;
		case GeneratorPackage.ROOM_OLD__INITIAL_STATE:
			setInitialState((State) newValue);
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
		case GeneratorPackage.ROOM_OLD__SOUTH:
			setSouth((Pathway) null);
			return;
		case GeneratorPackage.ROOM_OLD__NORTH:
			setNorth((Pathway) null);
			return;
		case GeneratorPackage.ROOM_OLD__EAST:
			setEast((Pathway) null);
			return;
		case GeneratorPackage.ROOM_OLD__WEST:
			setWest((Pathway) null);
			return;
		case GeneratorPackage.ROOM_OLD__ROOMTYPE:
			setRoomtype((RoomType2) null);
			return;
		case GeneratorPackage.ROOM_OLD__INITIAL_STATE:
			setInitialState((State) null);
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
		case GeneratorPackage.ROOM_OLD__SOUTH:
			return south != null;
		case GeneratorPackage.ROOM_OLD__NORTH:
			return north != null;
		case GeneratorPackage.ROOM_OLD__EAST:
			return east != null;
		case GeneratorPackage.ROOM_OLD__WEST:
			return west != null;
		case GeneratorPackage.ROOM_OLD__ROOMTYPE:
			return roomtype != null;
		case GeneratorPackage.ROOM_OLD__INITIAL_STATE:
			return initialState != null;
		}
		return super.eIsSet(featureID);
	}

} //RoomOLDImpl
