/**
 */
package generator.impl;

import generator.AvatarEquipment;
import generator.GameRule;
import generator.Gameplay;
import generator.GeneratorPackage;

import java.lang.reflect.InvocationTargetException;

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
 * An implementation of the model object '<em><b>Gameplay</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.GameplayImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link generator.impl.GameplayImpl#getGamerules <em>Gamerules</em>}</li>
 *   <li>{@link generator.impl.GameplayImpl#getRequirement <em>Requirement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GameplayImpl extends MinimalEObjectImpl.Container implements Gameplay {
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGamerules() <em>Gamerules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGamerules()
	 * @generated
	 * @ordered
	 */
	protected EList<GameRule> gamerules;

	/**
	 * The cached value of the '{@link #getRequirement() <em>Requirement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirement()
	 * @generated
	 * @ordered
	 */
	protected AvatarEquipment requirement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GameplayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.GAMEPLAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.GAMEPLAY__DESCRIPTION,
					oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GameRule> getGamerules() {
		if (gamerules == null) {
			gamerules = new EObjectContainmentEList<GameRule>(GameRule.class, this,
					GeneratorPackage.GAMEPLAY__GAMERULES);
		}
		return gamerules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AvatarEquipment getRequirement() {
		if (requirement != null && requirement.eIsProxy()) {
			InternalEObject oldRequirement = (InternalEObject) requirement;
			requirement = (AvatarEquipment) eResolveProxy(oldRequirement);
			if (requirement != oldRequirement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GeneratorPackage.GAMEPLAY__REQUIREMENT,
							oldRequirement, requirement));
			}
		}
		return requirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AvatarEquipment basicGetRequirement() {
		return requirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequirement(AvatarEquipment newRequirement) {
		AvatarEquipment oldRequirement = requirement;
		requirement = newRequirement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.GAMEPLAY__REQUIREMENT,
					oldRequirement, requirement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAvailable() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GeneratorPackage.GAMEPLAY__GAMERULES:
			return ((InternalEList<?>) getGamerules()).basicRemove(otherEnd, msgs);
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
		case GeneratorPackage.GAMEPLAY__DESCRIPTION:
			return getDescription();
		case GeneratorPackage.GAMEPLAY__GAMERULES:
			return getGamerules();
		case GeneratorPackage.GAMEPLAY__REQUIREMENT:
			if (resolve)
				return getRequirement();
			return basicGetRequirement();
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
		case GeneratorPackage.GAMEPLAY__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case GeneratorPackage.GAMEPLAY__GAMERULES:
			getGamerules().clear();
			getGamerules().addAll((Collection<? extends GameRule>) newValue);
			return;
		case GeneratorPackage.GAMEPLAY__REQUIREMENT:
			setRequirement((AvatarEquipment) newValue);
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
		case GeneratorPackage.GAMEPLAY__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case GeneratorPackage.GAMEPLAY__GAMERULES:
			getGamerules().clear();
			return;
		case GeneratorPackage.GAMEPLAY__REQUIREMENT:
			setRequirement((AvatarEquipment) null);
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
		case GeneratorPackage.GAMEPLAY__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case GeneratorPackage.GAMEPLAY__GAMERULES:
			return gamerules != null && !gamerules.isEmpty();
		case GeneratorPackage.GAMEPLAY__REQUIREMENT:
			return requirement != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case GeneratorPackage.GAMEPLAY___IS_AVAILABLE:
			return isAvailable();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //GameplayImpl
