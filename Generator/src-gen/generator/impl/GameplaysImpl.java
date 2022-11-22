/**
 */
package generator.impl;

import generator.Gameplay;
import generator.Gameplays;
import generator.GeneratorPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gameplays</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.GameplaysImpl#getGameplays <em>Gameplays</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GameplaysImpl extends MinimalEObjectImpl.Container implements Gameplays {
	/**
	 * The cached value of the '{@link #getGameplays() <em>Gameplays</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGameplays()
	 * @generated
	 * @ordered
	 */
	protected EList<Gameplay> gameplays;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GameplaysImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.GAMEPLAYS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Gameplay> getGameplays() {
		if (gameplays == null) {
			gameplays = new EObjectContainmentEList<Gameplay>(Gameplay.class, this,
					GeneratorPackage.GAMEPLAYS__GAMEPLAYS);
		}
		return gameplays;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GeneratorPackage.GAMEPLAYS__GAMEPLAYS:
			return ((InternalEList<?>) getGameplays()).basicRemove(otherEnd, msgs);
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
		case GeneratorPackage.GAMEPLAYS__GAMEPLAYS:
			return getGameplays();
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
		case GeneratorPackage.GAMEPLAYS__GAMEPLAYS:
			getGameplays().clear();
			getGameplays().addAll((Collection<? extends Gameplay>) newValue);
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
		case GeneratorPackage.GAMEPLAYS__GAMEPLAYS:
			getGameplays().clear();
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
		case GeneratorPackage.GAMEPLAYS__GAMEPLAYS:
			return gameplays != null && !gameplays.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GameplaysImpl
