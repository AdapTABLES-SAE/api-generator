/**
 */
package generatorMetamodels.impl;

import generatorMetamodels.GameDomain;
import generatorMetamodels.GameElements;
import generatorMetamodels.GamingObjective;
import generatorMetamodels.GeneratorMetamodelsPackage;

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
 * An implementation of the model object '<em><b>Game Domain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generatorMetamodels.impl.GameDomainImpl#getGamingobjectives <em>Gamingobjectives</em>}</li>
 *   <li>{@link generatorMetamodels.impl.GameDomainImpl#getGameelements <em>Gameelements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GameDomainImpl extends MinimalEObjectImpl.Container implements GameDomain {
	/**
	 * The cached value of the '{@link #getGamingobjectives() <em>Gamingobjectives</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGamingobjectives()
	 * @generated
	 * @ordered
	 */
	protected EList<GamingObjective> gamingobjectives;

	/**
	 * The cached value of the '{@link #getGameelements() <em>Gameelements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGameelements()
	 * @generated
	 * @ordered
	 */
	protected EList<GameElements> gameelements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GameDomainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorMetamodelsPackage.Literals.GAME_DOMAIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GamingObjective> getGamingobjectives() {
		if (gamingobjectives == null) {
			gamingobjectives = new EObjectContainmentEList<GamingObjective>(GamingObjective.class, this,
					GeneratorMetamodelsPackage.GAME_DOMAIN__GAMINGOBJECTIVES);
		}
		return gamingobjectives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GameElements> getGameelements() {
		if (gameelements == null) {
			gameelements = new EObjectContainmentEList<GameElements>(GameElements.class, this,
					GeneratorMetamodelsPackage.GAME_DOMAIN__GAMEELEMENTS);
		}
		return gameelements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GeneratorMetamodelsPackage.GAME_DOMAIN__GAMINGOBJECTIVES:
			return ((InternalEList<?>) getGamingobjectives()).basicRemove(otherEnd, msgs);
		case GeneratorMetamodelsPackage.GAME_DOMAIN__GAMEELEMENTS:
			return ((InternalEList<?>) getGameelements()).basicRemove(otherEnd, msgs);
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
		case GeneratorMetamodelsPackage.GAME_DOMAIN__GAMINGOBJECTIVES:
			return getGamingobjectives();
		case GeneratorMetamodelsPackage.GAME_DOMAIN__GAMEELEMENTS:
			return getGameelements();
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
		case GeneratorMetamodelsPackage.GAME_DOMAIN__GAMINGOBJECTIVES:
			getGamingobjectives().clear();
			getGamingobjectives().addAll((Collection<? extends GamingObjective>) newValue);
			return;
		case GeneratorMetamodelsPackage.GAME_DOMAIN__GAMEELEMENTS:
			getGameelements().clear();
			getGameelements().addAll((Collection<? extends GameElements>) newValue);
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
		case GeneratorMetamodelsPackage.GAME_DOMAIN__GAMINGOBJECTIVES:
			getGamingobjectives().clear();
			return;
		case GeneratorMetamodelsPackage.GAME_DOMAIN__GAMEELEMENTS:
			getGameelements().clear();
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
		case GeneratorMetamodelsPackage.GAME_DOMAIN__GAMINGOBJECTIVES:
			return gamingobjectives != null && !gamingobjectives.isEmpty();
		case GeneratorMetamodelsPackage.GAME_DOMAIN__GAMEELEMENTS:
			return gameelements != null && !gameelements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GameDomainImpl
