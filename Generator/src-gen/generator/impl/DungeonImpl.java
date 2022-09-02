/**
 */
package generator.impl;

import generator.Dungeon;
import generator.DungeonMode;
import generator.GeneratorPackage;
import generator.LearningObjective;
import generator.Level;
import generator.Room;

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
 *   <li>{@link generator.impl.DungeonImpl#getRooms <em>Rooms</em>}</li>
 *   <li>{@link generator.impl.DungeonImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link generator.impl.DungeonImpl#getEntry <em>Entry</em>}</li>
 *   <li>{@link generator.impl.DungeonImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link generator.impl.DungeonImpl#getLearningobjective <em>Learningobjective</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DungeonImpl extends MinimalEObjectImpl.Container implements Dungeon {
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
	 * The default value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected static final DungeonMode MODE_EDEFAULT = DungeonMode.LINEAR;

	/**
	 * The cached value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected DungeonMode mode = MODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEntry() <em>Entry</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntry()
	 * @generated
	 * @ordered
	 */
	protected Room entry;

	/**
	 * The cached value of the '{@link #getLevel() <em>Level</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected Level level;

	/**
	 * The cached value of the '{@link #getLearningobjective() <em>Learningobjective</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLearningobjective()
	 * @generated
	 * @ordered
	 */
	protected LearningObjective learningobjective;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DungeonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.DUNGEON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Room> getRooms() {
		if (rooms == null) {
			rooms = new EObjectContainmentEList<Room>(Room.class, this, GeneratorPackage.DUNGEON__ROOMS);
		}
		return rooms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DungeonMode getMode() {
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMode(DungeonMode newMode) {
		DungeonMode oldMode = mode;
		mode = newMode == null ? MODE_EDEFAULT : newMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.DUNGEON__MODE, oldMode, mode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room getEntry() {
		if (entry != null && entry.eIsProxy()) {
			InternalEObject oldEntry = (InternalEObject) entry;
			entry = (Room) eResolveProxy(oldEntry);
			if (entry != oldEntry) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GeneratorPackage.DUNGEON__ENTRY, oldEntry,
							entry));
			}
		}
		return entry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room basicGetEntry() {
		return entry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntry(Room newEntry) {
		Room oldEntry = entry;
		entry = newEntry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.DUNGEON__ENTRY, oldEntry, entry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Level getLevel() {
		if (level != null && level.eIsProxy()) {
			InternalEObject oldLevel = (InternalEObject) level;
			level = (Level) eResolveProxy(oldLevel);
			if (level != oldLevel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GeneratorPackage.DUNGEON__LEVEL, oldLevel,
							level));
			}
		}
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Level basicGetLevel() {
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel(Level newLevel) {
		Level oldLevel = level;
		level = newLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.DUNGEON__LEVEL, oldLevel, level));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LearningObjective getLearningobjective() {
		if (learningobjective != null && learningobjective.eIsProxy()) {
			InternalEObject oldLearningobjective = (InternalEObject) learningobjective;
			learningobjective = (LearningObjective) eResolveProxy(oldLearningobjective);
			if (learningobjective != oldLearningobjective) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							GeneratorPackage.DUNGEON__LEARNINGOBJECTIVE, oldLearningobjective, learningobjective));
			}
		}
		return learningobjective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LearningObjective basicGetLearningobjective() {
		return learningobjective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLearningobjective(LearningObjective newLearningobjective) {
		LearningObjective oldLearningobjective = learningobjective;
		learningobjective = newLearningobjective;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.DUNGEON__LEARNINGOBJECTIVE,
					oldLearningobjective, learningobjective));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GeneratorPackage.DUNGEON__ROOMS:
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
		case GeneratorPackage.DUNGEON__ROOMS:
			return getRooms();
		case GeneratorPackage.DUNGEON__MODE:
			return getMode();
		case GeneratorPackage.DUNGEON__ENTRY:
			if (resolve)
				return getEntry();
			return basicGetEntry();
		case GeneratorPackage.DUNGEON__LEVEL:
			if (resolve)
				return getLevel();
			return basicGetLevel();
		case GeneratorPackage.DUNGEON__LEARNINGOBJECTIVE:
			if (resolve)
				return getLearningobjective();
			return basicGetLearningobjective();
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
		case GeneratorPackage.DUNGEON__ROOMS:
			getRooms().clear();
			getRooms().addAll((Collection<? extends Room>) newValue);
			return;
		case GeneratorPackage.DUNGEON__MODE:
			setMode((DungeonMode) newValue);
			return;
		case GeneratorPackage.DUNGEON__ENTRY:
			setEntry((Room) newValue);
			return;
		case GeneratorPackage.DUNGEON__LEVEL:
			setLevel((Level) newValue);
			return;
		case GeneratorPackage.DUNGEON__LEARNINGOBJECTIVE:
			setLearningobjective((LearningObjective) newValue);
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
		case GeneratorPackage.DUNGEON__ROOMS:
			getRooms().clear();
			return;
		case GeneratorPackage.DUNGEON__MODE:
			setMode(MODE_EDEFAULT);
			return;
		case GeneratorPackage.DUNGEON__ENTRY:
			setEntry((Room) null);
			return;
		case GeneratorPackage.DUNGEON__LEVEL:
			setLevel((Level) null);
			return;
		case GeneratorPackage.DUNGEON__LEARNINGOBJECTIVE:
			setLearningobjective((LearningObjective) null);
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
		case GeneratorPackage.DUNGEON__ROOMS:
			return rooms != null && !rooms.isEmpty();
		case GeneratorPackage.DUNGEON__MODE:
			return mode != MODE_EDEFAULT;
		case GeneratorPackage.DUNGEON__ENTRY:
			return entry != null;
		case GeneratorPackage.DUNGEON__LEVEL:
			return level != null;
		case GeneratorPackage.DUNGEON__LEARNINGOBJECTIVE:
			return learningobjective != null;
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
		result.append(')');
		return result.toString();
	}

} //DungeonImpl
