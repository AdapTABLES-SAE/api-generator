/**
 */
package generator.impl;

import generator.CoreGPElements;
import generator.Equipments;
import generator.GameElements;
import generator.GeneratorPackage;

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
 * An implementation of the model object '<em><b>Game Elements</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.GameElementsImpl#getEquipments <em>Equipments</em>}</li>
 *   <li>{@link generator.impl.GameElementsImpl#getGameplayElements <em>Gameplay Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GameElementsImpl extends MinimalEObjectImpl.Container implements GameElements {
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
	 * The cached value of the '{@link #getGameplayElements() <em>Gameplay Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGameplayElements()
	 * @generated
	 * @ordered
	 */
	protected EList<CoreGPElements> gameplayElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GameElementsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.GAME_ELEMENTS;
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
					GeneratorPackage.GAME_ELEMENTS__EQUIPMENTS, oldEquipments, newEquipments);
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
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.GAME_ELEMENTS__EQUIPMENTS, null, msgs);
			if (newEquipments != null)
				msgs = ((InternalEObject) newEquipments).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.GAME_ELEMENTS__EQUIPMENTS, null, msgs);
			msgs = basicSetEquipments(newEquipments, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.GAME_ELEMENTS__EQUIPMENTS,
					newEquipments, newEquipments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CoreGPElements> getGameplayElements() {
		if (gameplayElements == null) {
			gameplayElements = new EObjectContainmentEList<CoreGPElements>(CoreGPElements.class, this,
					GeneratorPackage.GAME_ELEMENTS__GAMEPLAY_ELEMENTS);
		}
		return gameplayElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GeneratorPackage.GAME_ELEMENTS__EQUIPMENTS:
			return basicSetEquipments(null, msgs);
		case GeneratorPackage.GAME_ELEMENTS__GAMEPLAY_ELEMENTS:
			return ((InternalEList<?>) getGameplayElements()).basicRemove(otherEnd, msgs);
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
		case GeneratorPackage.GAME_ELEMENTS__EQUIPMENTS:
			return getEquipments();
		case GeneratorPackage.GAME_ELEMENTS__GAMEPLAY_ELEMENTS:
			return getGameplayElements();
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
		case GeneratorPackage.GAME_ELEMENTS__EQUIPMENTS:
			setEquipments((Equipments) newValue);
			return;
		case GeneratorPackage.GAME_ELEMENTS__GAMEPLAY_ELEMENTS:
			getGameplayElements().clear();
			getGameplayElements().addAll((Collection<? extends CoreGPElements>) newValue);
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
		case GeneratorPackage.GAME_ELEMENTS__EQUIPMENTS:
			setEquipments((Equipments) null);
			return;
		case GeneratorPackage.GAME_ELEMENTS__GAMEPLAY_ELEMENTS:
			getGameplayElements().clear();
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
		case GeneratorPackage.GAME_ELEMENTS__EQUIPMENTS:
			return equipments != null;
		case GeneratorPackage.GAME_ELEMENTS__GAMEPLAY_ELEMENTS:
			return gameplayElements != null && !gameplayElements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GameElementsImpl
