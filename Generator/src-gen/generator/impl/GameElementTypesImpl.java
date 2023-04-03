/**
 */
package generator.impl;

import generator.Equipments;
import generator.GPElementsTypes;
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
 *   <li>{@link generator.impl.GameElementTypesImpl#getGpElements <em>Gp Elements</em>}</li>
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
	 * The cached value of the '{@link #getGpElements() <em>Gp Elements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGpElements()
	 * @generated
	 * @ordered
	 */
	protected GPElementsTypes gpElements;

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
	public GPElementsTypes getGpElements() {
		return gpElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGpElements(GPElementsTypes newGpElements, NotificationChain msgs) {
		GPElementsTypes oldGpElements = gpElements;
		gpElements = newGpElements;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.GAME_ELEMENT_TYPES__GP_ELEMENTS, oldGpElements, newGpElements);
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
	public void setGpElements(GPElementsTypes newGpElements) {
		if (newGpElements != gpElements) {
			NotificationChain msgs = null;
			if (gpElements != null)
				msgs = ((InternalEObject) gpElements).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.GAME_ELEMENT_TYPES__GP_ELEMENTS, null, msgs);
			if (newGpElements != null)
				msgs = ((InternalEObject) newGpElements).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.GAME_ELEMENT_TYPES__GP_ELEMENTS, null, msgs);
			msgs = basicSetGpElements(newGpElements, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.GAME_ELEMENT_TYPES__GP_ELEMENTS,
					newGpElements, newGpElements));
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
		case GeneratorPackage.GAME_ELEMENT_TYPES__GP_ELEMENTS:
			return basicSetGpElements(null, msgs);
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
		case GeneratorPackage.GAME_ELEMENT_TYPES__GP_ELEMENTS:
			return getGpElements();
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
		case GeneratorPackage.GAME_ELEMENT_TYPES__GP_ELEMENTS:
			setGpElements((GPElementsTypes) newValue);
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
		case GeneratorPackage.GAME_ELEMENT_TYPES__GP_ELEMENTS:
			setGpElements((GPElementsTypes) null);
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
		case GeneratorPackage.GAME_ELEMENT_TYPES__GP_ELEMENTS:
			return gpElements != null;
		}
		return super.eIsSet(featureID);
	}

} //GameElementTypesImpl
