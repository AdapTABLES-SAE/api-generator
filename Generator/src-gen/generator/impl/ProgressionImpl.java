/**
 */
package generator.impl;

import generator.CurrentGameLevel;
import generator.CurrentObjectiveLevel;
import generator.GeneratorPackage;
import generator.Progression;

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
 * An implementation of the model object '<em><b>Progression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.ProgressionImpl#getCurrentobjectivelevels <em>Currentobjectivelevels</em>}</li>
 *   <li>{@link generator.impl.ProgressionImpl#getCurrentGameLevel <em>Current Game Level</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgressionImpl extends MinimalEObjectImpl.Container implements Progression {
	/**
	 * The cached value of the '{@link #getCurrentobjectivelevels() <em>Currentobjectivelevels</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentobjectivelevels()
	 * @generated
	 * @ordered
	 */
	protected EList<CurrentObjectiveLevel> currentobjectivelevels;

	/**
	 * The cached value of the '{@link #getCurrentGameLevel() <em>Current Game Level</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentGameLevel()
	 * @generated
	 * @ordered
	 */
	protected CurrentGameLevel currentGameLevel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.PROGRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CurrentObjectiveLevel> getCurrentobjectivelevels() {
		if (currentobjectivelevels == null) {
			currentobjectivelevels = new EObjectContainmentEList<CurrentObjectiveLevel>(CurrentObjectiveLevel.class,
					this, GeneratorPackage.PROGRESSION__CURRENTOBJECTIVELEVELS);
		}
		return currentobjectivelevels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurrentGameLevel getCurrentGameLevel() {
		return currentGameLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCurrentGameLevel(CurrentGameLevel newCurrentGameLevel, NotificationChain msgs) {
		CurrentGameLevel oldCurrentGameLevel = currentGameLevel;
		currentGameLevel = newCurrentGameLevel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.PROGRESSION__CURRENT_GAME_LEVEL, oldCurrentGameLevel, newCurrentGameLevel);
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
	public void setCurrentGameLevel(CurrentGameLevel newCurrentGameLevel) {
		if (newCurrentGameLevel != currentGameLevel) {
			NotificationChain msgs = null;
			if (currentGameLevel != null)
				msgs = ((InternalEObject) currentGameLevel).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.PROGRESSION__CURRENT_GAME_LEVEL, null, msgs);
			if (newCurrentGameLevel != null)
				msgs = ((InternalEObject) newCurrentGameLevel).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.PROGRESSION__CURRENT_GAME_LEVEL, null, msgs);
			msgs = basicSetCurrentGameLevel(newCurrentGameLevel, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.PROGRESSION__CURRENT_GAME_LEVEL,
					newCurrentGameLevel, newCurrentGameLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GeneratorPackage.PROGRESSION__CURRENTOBJECTIVELEVELS:
			return ((InternalEList<?>) getCurrentobjectivelevels()).basicRemove(otherEnd, msgs);
		case GeneratorPackage.PROGRESSION__CURRENT_GAME_LEVEL:
			return basicSetCurrentGameLevel(null, msgs);
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
		case GeneratorPackage.PROGRESSION__CURRENTOBJECTIVELEVELS:
			return getCurrentobjectivelevels();
		case GeneratorPackage.PROGRESSION__CURRENT_GAME_LEVEL:
			return getCurrentGameLevel();
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
		case GeneratorPackage.PROGRESSION__CURRENTOBJECTIVELEVELS:
			getCurrentobjectivelevels().clear();
			getCurrentobjectivelevels().addAll((Collection<? extends CurrentObjectiveLevel>) newValue);
			return;
		case GeneratorPackage.PROGRESSION__CURRENT_GAME_LEVEL:
			setCurrentGameLevel((CurrentGameLevel) newValue);
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
		case GeneratorPackage.PROGRESSION__CURRENTOBJECTIVELEVELS:
			getCurrentobjectivelevels().clear();
			return;
		case GeneratorPackage.PROGRESSION__CURRENT_GAME_LEVEL:
			setCurrentGameLevel((CurrentGameLevel) null);
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
		case GeneratorPackage.PROGRESSION__CURRENTOBJECTIVELEVELS:
			return currentobjectivelevels != null && !currentobjectivelevels.isEmpty();
		case GeneratorPackage.PROGRESSION__CURRENT_GAME_LEVEL:
			return currentGameLevel != null;
		}
		return super.eIsSet(featureID);
	}

} //ProgressionImpl
