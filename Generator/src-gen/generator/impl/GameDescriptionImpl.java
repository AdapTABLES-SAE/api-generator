/**
 */
package generator.impl;

import generator.Abilities;
import generator.ElementTypes;
import generator.GameDescription;
import generator.Gameplays;
import generator.GeneratorPackage;
import generator.LevelsDifficultyProgress;
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
 *   <li>{@link generator.impl.GameDescriptionImpl#getLevelsDifficultyProgress <em>Levels Difficulty Progress</em>}</li>
 *   <li>{@link generator.impl.GameDescriptionImpl#getGameplays <em>Gameplays</em>}</li>
 *   <li>{@link generator.impl.GameDescriptionImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link generator.impl.GameDescriptionImpl#getAbilities <em>Abilities</em>}</li>
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
	 * The cached value of the '{@link #getLevelsDifficultyProgress() <em>Levels Difficulty Progress</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevelsDifficultyProgress()
	 * @generated
	 * @ordered
	 */
	protected LevelsDifficultyProgress levelsDifficultyProgress;

	/**
	 * The cached value of the '{@link #getGameplays() <em>Gameplays</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGameplays()
	 * @generated
	 * @ordered
	 */
	protected Gameplays gameplays;

	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected ElementTypes elements;

	/**
	 * The cached value of the '{@link #getAbilities() <em>Abilities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbilities()
	 * @generated
	 * @ordered
	 */
	protected Abilities abilities;

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
	public LevelsDifficultyProgress getLevelsDifficultyProgress() {
		return levelsDifficultyProgress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLevelsDifficultyProgress(LevelsDifficultyProgress newLevelsDifficultyProgress,
			NotificationChain msgs) {
		LevelsDifficultyProgress oldLevelsDifficultyProgress = levelsDifficultyProgress;
		levelsDifficultyProgress = newLevelsDifficultyProgress;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.GAME_DESCRIPTION__LEVELS_DIFFICULTY_PROGRESS, oldLevelsDifficultyProgress,
					newLevelsDifficultyProgress);
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
	public void setLevelsDifficultyProgress(LevelsDifficultyProgress newLevelsDifficultyProgress) {
		if (newLevelsDifficultyProgress != levelsDifficultyProgress) {
			NotificationChain msgs = null;
			if (levelsDifficultyProgress != null)
				msgs = ((InternalEObject) levelsDifficultyProgress).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.GAME_DESCRIPTION__LEVELS_DIFFICULTY_PROGRESS, null,
						msgs);
			if (newLevelsDifficultyProgress != null)
				msgs = ((InternalEObject) newLevelsDifficultyProgress).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.GAME_DESCRIPTION__LEVELS_DIFFICULTY_PROGRESS, null,
						msgs);
			msgs = basicSetLevelsDifficultyProgress(newLevelsDifficultyProgress, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.GAME_DESCRIPTION__LEVELS_DIFFICULTY_PROGRESS, newLevelsDifficultyProgress,
					newLevelsDifficultyProgress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gameplays getGameplays() {
		return gameplays;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGameplays(Gameplays newGameplays, NotificationChain msgs) {
		Gameplays oldGameplays = gameplays;
		gameplays = newGameplays;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.GAME_DESCRIPTION__GAMEPLAYS, oldGameplays, newGameplays);
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
	public void setGameplays(Gameplays newGameplays) {
		if (newGameplays != gameplays) {
			NotificationChain msgs = null;
			if (gameplays != null)
				msgs = ((InternalEObject) gameplays).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.GAME_DESCRIPTION__GAMEPLAYS, null, msgs);
			if (newGameplays != null)
				msgs = ((InternalEObject) newGameplays).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.GAME_DESCRIPTION__GAMEPLAYS, null, msgs);
			msgs = basicSetGameplays(newGameplays, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.GAME_DESCRIPTION__GAMEPLAYS,
					newGameplays, newGameplays));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementTypes getElements() {
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElements(ElementTypes newElements, NotificationChain msgs) {
		ElementTypes oldElements = elements;
		elements = newElements;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.GAME_DESCRIPTION__ELEMENTS, oldElements, newElements);
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
	public void setElements(ElementTypes newElements) {
		if (newElements != elements) {
			NotificationChain msgs = null;
			if (elements != null)
				msgs = ((InternalEObject) elements).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.GAME_DESCRIPTION__ELEMENTS, null, msgs);
			if (newElements != null)
				msgs = ((InternalEObject) newElements).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.GAME_DESCRIPTION__ELEMENTS, null, msgs);
			msgs = basicSetElements(newElements, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.GAME_DESCRIPTION__ELEMENTS,
					newElements, newElements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Abilities getAbilities() {
		return abilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbilities(Abilities newAbilities, NotificationChain msgs) {
		Abilities oldAbilities = abilities;
		abilities = newAbilities;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.GAME_DESCRIPTION__ABILITIES, oldAbilities, newAbilities);
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
	public void setAbilities(Abilities newAbilities) {
		if (newAbilities != abilities) {
			NotificationChain msgs = null;
			if (abilities != null)
				msgs = ((InternalEObject) abilities).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.GAME_DESCRIPTION__ABILITIES, null, msgs);
			if (newAbilities != null)
				msgs = ((InternalEObject) newAbilities).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.GAME_DESCRIPTION__ABILITIES, null, msgs);
			msgs = basicSetAbilities(newAbilities, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.GAME_DESCRIPTION__ABILITIES,
					newAbilities, newAbilities));
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
		case GeneratorPackage.GAME_DESCRIPTION__LEVELS_DIFFICULTY_PROGRESS:
			return basicSetLevelsDifficultyProgress(null, msgs);
		case GeneratorPackage.GAME_DESCRIPTION__GAMEPLAYS:
			return basicSetGameplays(null, msgs);
		case GeneratorPackage.GAME_DESCRIPTION__ELEMENTS:
			return basicSetElements(null, msgs);
		case GeneratorPackage.GAME_DESCRIPTION__ABILITIES:
			return basicSetAbilities(null, msgs);
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
		case GeneratorPackage.GAME_DESCRIPTION__LEVELS_DIFFICULTY_PROGRESS:
			return getLevelsDifficultyProgress();
		case GeneratorPackage.GAME_DESCRIPTION__GAMEPLAYS:
			return getGameplays();
		case GeneratorPackage.GAME_DESCRIPTION__ELEMENTS:
			return getElements();
		case GeneratorPackage.GAME_DESCRIPTION__ABILITIES:
			return getAbilities();
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
		case GeneratorPackage.GAME_DESCRIPTION__ROOMTYPES:
			setRoomtypes((RoomTypes) newValue);
			return;
		case GeneratorPackage.GAME_DESCRIPTION__LEVELS_DIFFICULTY_PROGRESS:
			setLevelsDifficultyProgress((LevelsDifficultyProgress) newValue);
			return;
		case GeneratorPackage.GAME_DESCRIPTION__GAMEPLAYS:
			setGameplays((Gameplays) newValue);
			return;
		case GeneratorPackage.GAME_DESCRIPTION__ELEMENTS:
			setElements((ElementTypes) newValue);
			return;
		case GeneratorPackage.GAME_DESCRIPTION__ABILITIES:
			setAbilities((Abilities) newValue);
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
		case GeneratorPackage.GAME_DESCRIPTION__LEVELS_DIFFICULTY_PROGRESS:
			setLevelsDifficultyProgress((LevelsDifficultyProgress) null);
			return;
		case GeneratorPackage.GAME_DESCRIPTION__GAMEPLAYS:
			setGameplays((Gameplays) null);
			return;
		case GeneratorPackage.GAME_DESCRIPTION__ELEMENTS:
			setElements((ElementTypes) null);
			return;
		case GeneratorPackage.GAME_DESCRIPTION__ABILITIES:
			setAbilities((Abilities) null);
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
		case GeneratorPackage.GAME_DESCRIPTION__LEVELS_DIFFICULTY_PROGRESS:
			return levelsDifficultyProgress != null;
		case GeneratorPackage.GAME_DESCRIPTION__GAMEPLAYS:
			return gameplays != null;
		case GeneratorPackage.GAME_DESCRIPTION__ELEMENTS:
			return elements != null;
		case GeneratorPackage.GAME_DESCRIPTION__ABILITIES:
			return abilities != null;
		}
		return super.eIsSet(featureID);
	}

} //GameDescriptionImpl
