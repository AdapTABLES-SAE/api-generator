/**
 */
package generator.impl;

import generator.CoreElements;
import generator.ElementTypes;
import generator.Equipments;
import generator.GeneratorPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Types</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.ElementTypesImpl#getEquipments <em>Equipments</em>}</li>
 *   <li>{@link generator.impl.ElementTypesImpl#getGameplayElements <em>Gameplay Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElementTypesImpl extends MinimalEObjectImpl.Container implements ElementTypes {
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
	 * The cached value of the '{@link #getGameplayElements() <em>Gameplay Elements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGameplayElements()
	 * @generated
	 * @ordered
	 */
	protected CoreElements gameplayElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementTypesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.ELEMENT_TYPES;
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
					GeneratorPackage.ELEMENT_TYPES__EQUIPMENTS, oldEquipments, newEquipments);
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
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.ELEMENT_TYPES__EQUIPMENTS, null, msgs);
			if (newEquipments != null)
				msgs = ((InternalEObject) newEquipments).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.ELEMENT_TYPES__EQUIPMENTS, null, msgs);
			msgs = basicSetEquipments(newEquipments, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.ELEMENT_TYPES__EQUIPMENTS,
					newEquipments, newEquipments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreElements getGameplayElements() {
		return gameplayElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGameplayElements(CoreElements newGameplayElements, NotificationChain msgs) {
		CoreElements oldGameplayElements = gameplayElements;
		gameplayElements = newGameplayElements;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.ELEMENT_TYPES__GAMEPLAY_ELEMENTS, oldGameplayElements, newGameplayElements);
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
	public void setGameplayElements(CoreElements newGameplayElements) {
		if (newGameplayElements != gameplayElements) {
			NotificationChain msgs = null;
			if (gameplayElements != null)
				msgs = ((InternalEObject) gameplayElements).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.ELEMENT_TYPES__GAMEPLAY_ELEMENTS, null, msgs);
			if (newGameplayElements != null)
				msgs = ((InternalEObject) newGameplayElements).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.ELEMENT_TYPES__GAMEPLAY_ELEMENTS, null, msgs);
			msgs = basicSetGameplayElements(newGameplayElements, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.ELEMENT_TYPES__GAMEPLAY_ELEMENTS,
					newGameplayElements, newGameplayElements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GeneratorPackage.ELEMENT_TYPES__EQUIPMENTS:
			return basicSetEquipments(null, msgs);
		case GeneratorPackage.ELEMENT_TYPES__GAMEPLAY_ELEMENTS:
			return basicSetGameplayElements(null, msgs);
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
		case GeneratorPackage.ELEMENT_TYPES__EQUIPMENTS:
			return getEquipments();
		case GeneratorPackage.ELEMENT_TYPES__GAMEPLAY_ELEMENTS:
			return getGameplayElements();
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
		case GeneratorPackage.ELEMENT_TYPES__EQUIPMENTS:
			setEquipments((Equipments) newValue);
			return;
		case GeneratorPackage.ELEMENT_TYPES__GAMEPLAY_ELEMENTS:
			setGameplayElements((CoreElements) newValue);
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
		case GeneratorPackage.ELEMENT_TYPES__EQUIPMENTS:
			setEquipments((Equipments) null);
			return;
		case GeneratorPackage.ELEMENT_TYPES__GAMEPLAY_ELEMENTS:
			setGameplayElements((CoreElements) null);
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
		case GeneratorPackage.ELEMENT_TYPES__EQUIPMENTS:
			return equipments != null;
		case GeneratorPackage.ELEMENT_TYPES__GAMEPLAY_ELEMENTS:
			return gameplayElements != null;
		}
		return super.eIsSet(featureID);
	}

} //ElementTypesImpl
