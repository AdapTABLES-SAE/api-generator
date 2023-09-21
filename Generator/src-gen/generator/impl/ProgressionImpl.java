/**
 */
package generator.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import generator.GeneratorPackage;
import generator.LearnerProgress;
import generator.PlayerProgress;
import generator.Progression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Progression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.ProgressionImpl#getPlayerProgress <em>Player Progress</em>}</li>
 *   <li>{@link generator.impl.ProgressionImpl#getLearnerProgress <em>Learner Progress</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgressionImpl extends MinimalEObjectImpl.Container implements Progression {
	/**
	 * The cached value of the '{@link #getPlayerProgress() <em>Player Progress</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayerProgress()
	 * @generated
	 * @ordered
	 */
	protected PlayerProgress playerProgress;

	/**
	 * The cached value of the '{@link #getLearnerProgress() <em>Learner Progress</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLearnerProgress()
	 * @generated
	 * @ordered
	 */
	protected LearnerProgress learnerProgress;

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
	public PlayerProgress getPlayerProgress() {
		return playerProgress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlayerProgress(PlayerProgress newPlayerProgress, NotificationChain msgs) {
		PlayerProgress oldPlayerProgress = playerProgress;
		playerProgress = newPlayerProgress;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.PROGRESSION__PLAYER_PROGRESS, oldPlayerProgress, newPlayerProgress);
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
	public void setPlayerProgress(PlayerProgress newPlayerProgress) {
		if (newPlayerProgress != playerProgress) {
			NotificationChain msgs = null;
			if (playerProgress != null)
				msgs = ((InternalEObject) playerProgress).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.PROGRESSION__PLAYER_PROGRESS, null, msgs);
			if (newPlayerProgress != null)
				msgs = ((InternalEObject) newPlayerProgress).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.PROGRESSION__PLAYER_PROGRESS, null, msgs);
			msgs = basicSetPlayerProgress(newPlayerProgress, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.PROGRESSION__PLAYER_PROGRESS,
					newPlayerProgress, newPlayerProgress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LearnerProgress getLearnerProgress() {
		return learnerProgress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLearnerProgress(LearnerProgress newLearnerProgress, NotificationChain msgs) {
		LearnerProgress oldLearnerProgress = learnerProgress;
		learnerProgress = newLearnerProgress;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.PROGRESSION__LEARNER_PROGRESS, oldLearnerProgress, newLearnerProgress);
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
	public void setLearnerProgress(LearnerProgress newLearnerProgress) {
		if (newLearnerProgress != learnerProgress) {
			NotificationChain msgs = null;
			if (learnerProgress != null)
				msgs = ((InternalEObject) learnerProgress).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.PROGRESSION__LEARNER_PROGRESS, null, msgs);
			if (newLearnerProgress != null)
				msgs = ((InternalEObject) newLearnerProgress).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.PROGRESSION__LEARNER_PROGRESS, null, msgs);
			msgs = basicSetLearnerProgress(newLearnerProgress, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.PROGRESSION__LEARNER_PROGRESS,
					newLearnerProgress, newLearnerProgress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GeneratorPackage.PROGRESSION__PLAYER_PROGRESS:
			return basicSetPlayerProgress(null, msgs);
		case GeneratorPackage.PROGRESSION__LEARNER_PROGRESS:
			return basicSetLearnerProgress(null, msgs);
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
		case GeneratorPackage.PROGRESSION__PLAYER_PROGRESS:
			return getPlayerProgress();
		case GeneratorPackage.PROGRESSION__LEARNER_PROGRESS:
			return getLearnerProgress();
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
		case GeneratorPackage.PROGRESSION__PLAYER_PROGRESS:
			setPlayerProgress((PlayerProgress) newValue);
			return;
		case GeneratorPackage.PROGRESSION__LEARNER_PROGRESS:
			setLearnerProgress((LearnerProgress) newValue);
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
		case GeneratorPackage.PROGRESSION__PLAYER_PROGRESS:
			setPlayerProgress((PlayerProgress) null);
			return;
		case GeneratorPackage.PROGRESSION__LEARNER_PROGRESS:
			setLearnerProgress((LearnerProgress) null);
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
		case GeneratorPackage.PROGRESSION__PLAYER_PROGRESS:
			return playerProgress != null;
		case GeneratorPackage.PROGRESSION__LEARNER_PROGRESS:
			return learnerProgress != null;
		}
		return super.eIsSet(featureID);
	}

} //ProgressionImpl
