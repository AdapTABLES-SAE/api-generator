/**
 */
package generatorMetamodels.impl;

import generatorMetamodels.Dungeon;
import generatorMetamodels.EntryRoom;
import generatorMetamodels.GameMode;
import generatorMetamodels.GamingObjective;
import generatorMetamodels.GeneratorMetamodelsPackage;
import generatorMetamodels.Room;

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
 * An implementation of the model object '<em><b>Dungeon</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generatorMetamodels.impl.DungeonImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link generatorMetamodels.impl.DungeonImpl#getRooms <em>Rooms</em>}</li>
 *   <li>{@link generatorMetamodels.impl.DungeonImpl#getEntry <em>Entry</em>}</li>
 *   <li>{@link generatorMetamodels.impl.DungeonImpl#getNumberOfRooms <em>Number Of Rooms</em>}</li>
 *   <li>{@link generatorMetamodels.impl.DungeonImpl#getGamingobjective <em>Gamingobjective</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DungeonImpl extends MinimalEObjectImpl.Container implements Dungeon {
	/**
	 * The default value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected static final GameMode MODE_EDEFAULT = GameMode.NONE;

	/**
	 * The cached value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected GameMode mode = MODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRooms() <em>Rooms</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRooms()
	 * @generated
	 * @ordered
	 */
	protected EList<Room> rooms;

	/**
	 * The cached value of the '{@link #getEntry() <em>Entry</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntry()
	 * @generated
	 * @ordered
	 */
	protected EntryRoom entry;

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
	 * The cached value of the '{@link #getGamingobjective() <em>Gamingobjective</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGamingobjective()
	 * @generated
	 * @ordered
	 */
	protected GamingObjective gamingobjective;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DungeonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorMetamodelsPackage.Literals.DUNGEON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GameMode getMode() {
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMode(GameMode newMode) {
		GameMode oldMode = mode;
		mode = newMode == null ? MODE_EDEFAULT : newMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorMetamodelsPackage.DUNGEON__MODE, oldMode,
					mode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Room> getRooms() {
		if (rooms == null) {
			rooms = new EObjectContainmentEList<Room>(Room.class, this, GeneratorMetamodelsPackage.DUNGEON__ROOMS);
		}
		return rooms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryRoom getEntry() {
		if (entry != null && entry.eIsProxy()) {
			InternalEObject oldEntry = (InternalEObject) entry;
			entry = (EntryRoom) eResolveProxy(oldEntry);
			if (entry != oldEntry) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GeneratorMetamodelsPackage.DUNGEON__ENTRY,
							oldEntry, entry));
			}
		}
		return entry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryRoom basicGetEntry() {
		return entry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntry(EntryRoom newEntry) {
		EntryRoom oldEntry = entry;
		entry = newEntry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorMetamodelsPackage.DUNGEON__ENTRY, oldEntry,
					entry));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorMetamodelsPackage.DUNGEON__NUMBER_OF_ROOMS,
					oldNumberOfRooms, numberOfRooms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GamingObjective getGamingobjective() {
		if (gamingobjective != null && gamingobjective.eIsProxy()) {
			InternalEObject oldGamingobjective = (InternalEObject) gamingobjective;
			gamingobjective = (GamingObjective) eResolveProxy(oldGamingobjective);
			if (gamingobjective != oldGamingobjective) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							GeneratorMetamodelsPackage.DUNGEON__GAMINGOBJECTIVE, oldGamingobjective, gamingobjective));
			}
		}
		return gamingobjective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GamingObjective basicGetGamingobjective() {
		return gamingobjective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGamingobjective(GamingObjective newGamingobjective) {
		GamingObjective oldGamingobjective = gamingobjective;
		gamingobjective = newGamingobjective;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorMetamodelsPackage.DUNGEON__GAMINGOBJECTIVE,
					oldGamingobjective, gamingobjective));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GeneratorMetamodelsPackage.DUNGEON__ROOMS:
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
		case GeneratorMetamodelsPackage.DUNGEON__MODE:
			return getMode();
		case GeneratorMetamodelsPackage.DUNGEON__ROOMS:
			return getRooms();
		case GeneratorMetamodelsPackage.DUNGEON__ENTRY:
			if (resolve)
				return getEntry();
			return basicGetEntry();
		case GeneratorMetamodelsPackage.DUNGEON__NUMBER_OF_ROOMS:
			return getNumberOfRooms();
		case GeneratorMetamodelsPackage.DUNGEON__GAMINGOBJECTIVE:
			if (resolve)
				return getGamingobjective();
			return basicGetGamingobjective();
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
		case GeneratorMetamodelsPackage.DUNGEON__MODE:
			setMode((GameMode) newValue);
			return;
		case GeneratorMetamodelsPackage.DUNGEON__ROOMS:
			getRooms().clear();
			getRooms().addAll((Collection<? extends Room>) newValue);
			return;
		case GeneratorMetamodelsPackage.DUNGEON__ENTRY:
			setEntry((EntryRoom) newValue);
			return;
		case GeneratorMetamodelsPackage.DUNGEON__NUMBER_OF_ROOMS:
			setNumberOfRooms((Integer) newValue);
			return;
		case GeneratorMetamodelsPackage.DUNGEON__GAMINGOBJECTIVE:
			setGamingobjective((GamingObjective) newValue);
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
		case GeneratorMetamodelsPackage.DUNGEON__MODE:
			setMode(MODE_EDEFAULT);
			return;
		case GeneratorMetamodelsPackage.DUNGEON__ROOMS:
			getRooms().clear();
			return;
		case GeneratorMetamodelsPackage.DUNGEON__ENTRY:
			setEntry((EntryRoom) null);
			return;
		case GeneratorMetamodelsPackage.DUNGEON__NUMBER_OF_ROOMS:
			setNumberOfRooms(NUMBER_OF_ROOMS_EDEFAULT);
			return;
		case GeneratorMetamodelsPackage.DUNGEON__GAMINGOBJECTIVE:
			setGamingobjective((GamingObjective) null);
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
		case GeneratorMetamodelsPackage.DUNGEON__MODE:
			return mode != MODE_EDEFAULT;
		case GeneratorMetamodelsPackage.DUNGEON__ROOMS:
			return rooms != null && !rooms.isEmpty();
		case GeneratorMetamodelsPackage.DUNGEON__ENTRY:
			return entry != null;
		case GeneratorMetamodelsPackage.DUNGEON__NUMBER_OF_ROOMS:
			return numberOfRooms != NUMBER_OF_ROOMS_EDEFAULT;
		case GeneratorMetamodelsPackage.DUNGEON__GAMINGOBJECTIVE:
			return gamingobjective != null;
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
		result.append(" (mode: ");
		result.append(mode);
		result.append(", numberOfRooms: ");
		result.append(numberOfRooms);
		result.append(')');
		return result.toString();
	}

} //DungeonImpl
