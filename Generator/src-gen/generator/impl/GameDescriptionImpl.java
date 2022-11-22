/**
 */
package generator.impl;

import generator.Abilities;
import generator.ElementTypes;
import generator.Elements;
import generator.GameDescription;
import generator.Gameplays;
import generator.GeneratorPackage;
import generator.RoomTypes;

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
 * An implementation of the model object '<em><b>Game Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.GameDescriptionImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link generator.impl.GameDescriptionImpl#getGameplays <em>Gameplays</em>}</li>
 *   <li>{@link generator.impl.GameDescriptionImpl#getElementtypes <em>Elementtypes</em>}</li>
 *   <li>{@link generator.impl.GameDescriptionImpl#getAbilities <em>Abilities</em>}</li>
 *   <li>{@link generator.impl.GameDescriptionImpl#getRoomtypes <em>Roomtypes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GameDescriptionImpl extends MinimalEObjectImpl.Container implements GameDescription {
	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected Elements elements;

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
	 * The cached value of the '{@link #getElementtypes() <em>Elementtypes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementtypes()
	 * @generated
	 * @ordered
	 */
	protected ElementTypes elementtypes;

	/**
	 * The cached value of the '{@link #getAbilities() <em>Abilities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbilities()
	 * @generated
	 * @ordered
	 */
	protected EList<Abilities> abilities;

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
	public Elements getElements() {
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElements(Elements newElements, NotificationChain msgs) {
		Elements oldElements = elements;
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
	public void setElements(Elements newElements) {
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
	public ElementTypes getElementtypes() {
		return elementtypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElementtypes(ElementTypes newElementtypes, NotificationChain msgs) {
		ElementTypes oldElementtypes = elementtypes;
		elementtypes = newElementtypes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.GAME_DESCRIPTION__ELEMENTTYPES, oldElementtypes, newElementtypes);
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
	public void setElementtypes(ElementTypes newElementtypes) {
		if (newElementtypes != elementtypes) {
			NotificationChain msgs = null;
			if (elementtypes != null)
				msgs = ((InternalEObject) elementtypes).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.GAME_DESCRIPTION__ELEMENTTYPES, null, msgs);
			if (newElementtypes != null)
				msgs = ((InternalEObject) newElementtypes).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.GAME_DESCRIPTION__ELEMENTTYPES, null, msgs);
			msgs = basicSetElementtypes(newElementtypes, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.GAME_DESCRIPTION__ELEMENTTYPES,
					newElementtypes, newElementtypes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Abilities> getAbilities() {
		if (abilities == null) {
			abilities = new EObjectContainmentEList<Abilities>(Abilities.class, this,
					GeneratorPackage.GAME_DESCRIPTION__ABILITIES);
		}
		return abilities;
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
		case GeneratorPackage.GAME_DESCRIPTION__ELEMENTS:
			return basicSetElements(null, msgs);
		case GeneratorPackage.GAME_DESCRIPTION__GAMEPLAYS:
			return basicSetGameplays(null, msgs);
		case GeneratorPackage.GAME_DESCRIPTION__ELEMENTTYPES:
			return basicSetElementtypes(null, msgs);
		case GeneratorPackage.GAME_DESCRIPTION__ABILITIES:
			return ((InternalEList<?>) getAbilities()).basicRemove(otherEnd, msgs);
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
		case GeneratorPackage.GAME_DESCRIPTION__ELEMENTS:
			return getElements();
		case GeneratorPackage.GAME_DESCRIPTION__GAMEPLAYS:
			return getGameplays();
		case GeneratorPackage.GAME_DESCRIPTION__ELEMENTTYPES:
			return getElementtypes();
		case GeneratorPackage.GAME_DESCRIPTION__ABILITIES:
			return getAbilities();
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case GeneratorPackage.GAME_DESCRIPTION__ELEMENTS:
			setElements((Elements) newValue);
			return;
		case GeneratorPackage.GAME_DESCRIPTION__GAMEPLAYS:
			setGameplays((Gameplays) newValue);
			return;
		case GeneratorPackage.GAME_DESCRIPTION__ELEMENTTYPES:
			setElementtypes((ElementTypes) newValue);
			return;
		case GeneratorPackage.GAME_DESCRIPTION__ABILITIES:
			getAbilities().clear();
			getAbilities().addAll((Collection<? extends Abilities>) newValue);
			return;
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
		case GeneratorPackage.GAME_DESCRIPTION__ELEMENTS:
			setElements((Elements) null);
			return;
		case GeneratorPackage.GAME_DESCRIPTION__GAMEPLAYS:
			setGameplays((Gameplays) null);
			return;
		case GeneratorPackage.GAME_DESCRIPTION__ELEMENTTYPES:
			setElementtypes((ElementTypes) null);
			return;
		case GeneratorPackage.GAME_DESCRIPTION__ABILITIES:
			getAbilities().clear();
			return;
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
		case GeneratorPackage.GAME_DESCRIPTION__ELEMENTS:
			return elements != null;
		case GeneratorPackage.GAME_DESCRIPTION__GAMEPLAYS:
			return gameplays != null;
		case GeneratorPackage.GAME_DESCRIPTION__ELEMENTTYPES:
			return elementtypes != null;
		case GeneratorPackage.GAME_DESCRIPTION__ABILITIES:
			return abilities != null && !abilities.isEmpty();
		case GeneratorPackage.GAME_DESCRIPTION__ROOMTYPES:
			return roomtypes != null;
		}
		return super.eIsSet(featureID);
	}

} //GameDescriptionImpl
