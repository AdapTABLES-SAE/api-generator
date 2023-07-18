/**
 */
package generator.impl;

import generator.GeneratorPackage;
import generator.LearnerPlayer;
import generator.LearnerPlayers;

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
 * An implementation of the model object '<em><b>Learner Players</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.LearnerPlayersImpl#getLearnerPlayers <em>Learner Players</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LearnerPlayersImpl extends MinimalEObjectImpl.Container implements LearnerPlayers {
	/**
	 * The cached value of the '{@link #getLearnerPlayers() <em>Learner Players</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLearnerPlayers()
	 * @generated
	 * @ordered
	 */
	protected EList<LearnerPlayer> learnerPlayers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LearnerPlayersImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.LEARNER_PLAYERS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LearnerPlayer> getLearnerPlayers() {
		if (learnerPlayers == null) {
			learnerPlayers = new EObjectContainmentEList<LearnerPlayer>(LearnerPlayer.class, this,
					GeneratorPackage.LEARNER_PLAYERS__LEARNER_PLAYERS);
		}
		return learnerPlayers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GeneratorPackage.LEARNER_PLAYERS__LEARNER_PLAYERS:
			return ((InternalEList<?>) getLearnerPlayers()).basicRemove(otherEnd, msgs);
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
		case GeneratorPackage.LEARNER_PLAYERS__LEARNER_PLAYERS:
			return getLearnerPlayers();
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
		case GeneratorPackage.LEARNER_PLAYERS__LEARNER_PLAYERS:
			getLearnerPlayers().clear();
			getLearnerPlayers().addAll((Collection<? extends LearnerPlayer>) newValue);
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
		case GeneratorPackage.LEARNER_PLAYERS__LEARNER_PLAYERS:
			getLearnerPlayers().clear();
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
		case GeneratorPackage.LEARNER_PLAYERS__LEARNER_PLAYERS:
			return learnerPlayers != null && !learnerPlayers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LearnerPlayersImpl
