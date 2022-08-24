/**
 */
package generator.impl;

import generator.DungeonOLD;
import generator.GameObjective;
import generator.GeneratorPackage;
import generator.RoomOLD;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dungeon OLD</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.DungeonOLDImpl#getNumberOfRooms <em>Number Of Rooms</em>}</li>
 *   <li>{@link generator.impl.DungeonOLDImpl#getGameobjective <em>Gameobjective</em>}</li>
 *   <li>{@link generator.impl.DungeonOLDImpl#getRooms <em>Rooms</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DungeonOLDImpl extends MinimalEObjectImpl.Container implements DungeonOLD {
	/**
	 * The default value of the '{@link #getNumberOfRooms() <em>Number Of Rooms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfRooms()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_ROOMS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfRooms() <em>Number Of Rooms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfRooms()
	 * @generated
	 * @ordered
	 */
	protected int numberOfRooms = NUMBER_OF_ROOMS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGameobjective() <em>Gameobjective</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGameobjective()
	 * @generated
	 * @ordered
	 */
	protected GameObjective gameobjective;

	/**
	 * The cached value of the '{@link #getRooms() <em>Rooms</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRooms()
	 * @generated
	 * @ordered
	 */
	protected EList<RoomOLD> rooms;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DungeonOLDImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.DUNGEON_OLD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfRooms() {
		return numberOfRooms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfRooms(int newNumberOfRooms) {
		int oldNumberOfRooms = numberOfRooms;
		numberOfRooms = newNumberOfRooms;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.DUNGEON_OLD__NUMBER_OF_ROOMS,
					oldNumberOfRooms, numberOfRooms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GameObjective getGameobjective() {
		if (gameobjective != null && gameobjective.eIsProxy()) {
			InternalEObject oldGameobjective = (InternalEObject) gameobjective;
			gameobjective = (GameObjective) eResolveProxy(oldGameobjective);
			if (gameobjective != oldGameobjective) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							GeneratorPackage.DUNGEON_OLD__GAMEOBJECTIVE, oldGameobjective, gameobjective));
			}
		}
		return gameobjective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GameObjective basicGetGameobjective() {
		return gameobjective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGameobjective(GameObjective newGameobjective) {
		GameObjective oldGameobjective = gameobjective;
		gameobjective = newGameobjective;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.DUNGEON_OLD__GAMEOBJECTIVE,
					oldGameobjective, gameobjective));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoomOLD> getRooms() {
		if (rooms == null) {
			rooms = new EObjectContainmentEList<RoomOLD>(RoomOLD.class, this, GeneratorPackage.DUNGEON_OLD__ROOMS);
		}
		return rooms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GeneratorPackage.DUNGEON_OLD__ROOMS:
			return ((InternalEList<?>) getRooms()).basicRemove(otherEnd, msgs);
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
		case GeneratorPackage.DUNGEON_OLD__NUMBER_OF_ROOMS:
			return getNumberOfRooms();
		case GeneratorPackage.DUNGEON_OLD__GAMEOBJECTIVE:
			if (resolve)
				return getGameobjective();
			return basicGetGameobjective();
		case GeneratorPackage.DUNGEON_OLD__ROOMS:
			return getRooms();
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
		case GeneratorPackage.DUNGEON_OLD__NUMBER_OF_ROOMS:
			setNumberOfRooms((Integer) newValue);
			return;
		case GeneratorPackage.DUNGEON_OLD__GAMEOBJECTIVE:
			setGameobjective((GameObjective) newValue);
			return;
		case GeneratorPackage.DUNGEON_OLD__ROOMS:
			getRooms().clear();
			getRooms().addAll((Collection<? extends RoomOLD>) newValue);
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
		case GeneratorPackage.DUNGEON_OLD__NUMBER_OF_ROOMS:
			setNumberOfRooms(NUMBER_OF_ROOMS_EDEFAULT);
			return;
		case GeneratorPackage.DUNGEON_OLD__GAMEOBJECTIVE:
			setGameobjective((GameObjective) null);
			return;
		case GeneratorPackage.DUNGEON_OLD__ROOMS:
			getRooms().clear();
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
		case GeneratorPackage.DUNGEON_OLD__NUMBER_OF_ROOMS:
			return numberOfRooms != NUMBER_OF_ROOMS_EDEFAULT;
		case GeneratorPackage.DUNGEON_OLD__GAMEOBJECTIVE:
			return gameobjective != null;
		case GeneratorPackage.DUNGEON_OLD__ROOMS:
			return rooms != null && !rooms.isEmpty();
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
		result.append(" (numberOfRooms: ");
		result.append(numberOfRooms);
		result.append(')');
		return result.toString();
	}

} //DungeonOLDImpl
