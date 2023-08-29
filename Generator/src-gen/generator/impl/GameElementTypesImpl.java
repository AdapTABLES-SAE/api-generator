/**
 */
package generator.impl;

import generator.Curses;
import generator.ElementsTypes;
import generator.Equipments;
import generator.GameElementTypes;
import generator.GeneratorPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Game Element Types</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.GameElementTypesImpl#getEquipments <em>Equipments</em>}</li>
 *   <li>{@link generator.impl.GameElementTypesImpl#getElementTypes <em>Element Types</em>}</li>
 *   <li>{@link generator.impl.GameElementTypesImpl#getCurses <em>Curses</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GameElementTypesImpl extends MinimalEObjectImpl.Container implements GameElementTypes {
	/**
	 * The cached value of the '{@link #getEquipments() <em>Equipments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEquipments()
	 * @generated
	 * @ordered
	 */
	protected Equipments equipments;

	/**
	 * The cached value of the '{@link #getElementTypes() <em>Element Types</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementTypes()
	 * @generated
	 * @ordered
	 */
	protected ElementsTypes elementTypes;

	/**
	 * The cached value of the '{@link #getCurses() <em>Curses</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurses()
	 * @generated
	 * @ordered
	 */
	protected Curses curses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GameElementTypesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.GAME_ELEMENT_TYPES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Equipments getEquipments() {
		return equipments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEquipments(Equipments newEquipments, NotificationChain msgs) {
		Equipments oldEquipments = equipments;
		equipments = newEquipments;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.GAME_ELEMENT_TYPES__EQUIPMENTS, oldEquipments, newEquipments);
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
	public void setEquipments(Equipments newEquipments) {
		if (newEquipments != equipments) {
			NotificationChain msgs = null;
			if (equipments != null)
				msgs = ((InternalEObject) equipments).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.GAME_ELEMENT_TYPES__EQUIPMENTS, null, msgs);
			if (newEquipments != null)
				msgs = ((InternalEObject) newEquipments).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.GAME_ELEMENT_TYPES__EQUIPMENTS, null, msgs);
			msgs = basicSetEquipments(newEquipments, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.GAME_ELEMENT_TYPES__EQUIPMENTS,
					newEquipments, newEquipments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementsTypes getElementTypes() {
		return elementTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElementTypes(ElementsTypes newElementTypes, NotificationChain msgs) {
		ElementsTypes oldElementTypes = elementTypes;
		elementTypes = newElementTypes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.GAME_ELEMENT_TYPES__ELEMENT_TYPES, oldElementTypes, newElementTypes);
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
	public void setElementTypes(ElementsTypes newElementTypes) {
		if (newElementTypes != elementTypes) {
			NotificationChain msgs = null;
			if (elementTypes != null)
				msgs = ((InternalEObject) elementTypes).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.GAME_ELEMENT_TYPES__ELEMENT_TYPES, null, msgs);
			if (newElementTypes != null)
				msgs = ((InternalEObject) newElementTypes).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.GAME_ELEMENT_TYPES__ELEMENT_TYPES, null, msgs);
			msgs = basicSetElementTypes(newElementTypes, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.GAME_ELEMENT_TYPES__ELEMENT_TYPES,
					newElementTypes, newElementTypes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Curses getCurses() {
		return curses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCurses(Curses newCurses, NotificationChain msgs) {
		Curses oldCurses = curses;
		curses = newCurses;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.GAME_ELEMENT_TYPES__CURSES, oldCurses, newCurses);
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
	public void setCurses(Curses newCurses) {
		if (newCurses != curses) {
			NotificationChain msgs = null;
			if (curses != null)
				msgs = ((InternalEObject) curses).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.GAME_ELEMENT_TYPES__CURSES, null, msgs);
			if (newCurses != null)
				msgs = ((InternalEObject) newCurses).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.GAME_ELEMENT_TYPES__CURSES, null, msgs);
			msgs = basicSetCurses(newCurses, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.GAME_ELEMENT_TYPES__CURSES,
					newCurses, newCurses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GeneratorPackage.GAME_ELEMENT_TYPES__EQUIPMENTS:
			return basicSetEquipments(null, msgs);
		case GeneratorPackage.GAME_ELEMENT_TYPES__ELEMENT_TYPES:
			return basicSetElementTypes(null, msgs);
		case GeneratorPackage.GAME_ELEMENT_TYPES__CURSES:
			return basicSetCurses(null, msgs);
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
		case GeneratorPackage.GAME_ELEMENT_TYPES__EQUIPMENTS:
			return getEquipments();
		case GeneratorPackage.GAME_ELEMENT_TYPES__ELEMENT_TYPES:
			return getElementTypes();
		case GeneratorPackage.GAME_ELEMENT_TYPES__CURSES:
			return getCurses();
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
		case GeneratorPackage.GAME_ELEMENT_TYPES__EQUIPMENTS:
			setEquipments((Equipments) newValue);
			return;
		case GeneratorPackage.GAME_ELEMENT_TYPES__ELEMENT_TYPES:
			setElementTypes((ElementsTypes) newValue);
			return;
		case GeneratorPackage.GAME_ELEMENT_TYPES__CURSES:
			setCurses((Curses) newValue);
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
		case GeneratorPackage.GAME_ELEMENT_TYPES__EQUIPMENTS:
			setEquipments((Equipments) null);
			return;
		case GeneratorPackage.GAME_ELEMENT_TYPES__ELEMENT_TYPES:
			setElementTypes((ElementsTypes) null);
			return;
		case GeneratorPackage.GAME_ELEMENT_TYPES__CURSES:
			setCurses((Curses) null);
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
		case GeneratorPackage.GAME_ELEMENT_TYPES__EQUIPMENTS:
			return equipments != null;
		case GeneratorPackage.GAME_ELEMENT_TYPES__ELEMENT_TYPES:
			return elementTypes != null;
		case GeneratorPackage.GAME_ELEMENT_TYPES__CURSES:
			return curses != null;
		}
		return super.eIsSet(featureID);
	}

} //GameElementTypesImpl
