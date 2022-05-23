/**
 */
package generatorMetamodels.impl;

import generatorMetamodels.AdaptedLearningGameActivity;
import generatorMetamodels.Dungeon;
import generatorMetamodels.GeneratorMetamodelsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Adapted Learning Game Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generatorMetamodels.impl.AdaptedLearningGameActivityImpl#getDungeon <em>Dungeon</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AdaptedLearningGameActivityImpl extends MinimalEObjectImpl.Container
		implements AdaptedLearningGameActivity {
	/**
	 * The cached value of the '{@link #getDungeon() <em>Dungeon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDungeon()
	 * @generated
	 * @ordered
	 */
	protected Dungeon dungeon;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdaptedLearningGameActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorMetamodelsPackage.Literals.ADAPTED_LEARNING_GAME_ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dungeon getDungeon() {
		return dungeon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDungeon(Dungeon newDungeon, NotificationChain msgs) {
		Dungeon oldDungeon = dungeon;
		dungeon = newDungeon;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GeneratorMetamodelsPackage.ADAPTED_LEARNING_GAME_ACTIVITY__DUNGEON, oldDungeon, newDungeon);
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
	public void setDungeon(Dungeon newDungeon) {
		if (newDungeon != dungeon) {
			NotificationChain msgs = null;
			if (dungeon != null)
				msgs = ((InternalEObject) dungeon).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GeneratorMetamodelsPackage.ADAPTED_LEARNING_GAME_ACTIVITY__DUNGEON,
						null, msgs);
			if (newDungeon != null)
				msgs = ((InternalEObject) newDungeon).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GeneratorMetamodelsPackage.ADAPTED_LEARNING_GAME_ACTIVITY__DUNGEON,
						null, msgs);
			msgs = basicSetDungeon(newDungeon, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GeneratorMetamodelsPackage.ADAPTED_LEARNING_GAME_ACTIVITY__DUNGEON, newDungeon, newDungeon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GeneratorMetamodelsPackage.ADAPTED_LEARNING_GAME_ACTIVITY__DUNGEON:
			return basicSetDungeon(null, msgs);
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
		case GeneratorMetamodelsPackage.ADAPTED_LEARNING_GAME_ACTIVITY__DUNGEON:
			return getDungeon();
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
		case GeneratorMetamodelsPackage.ADAPTED_LEARNING_GAME_ACTIVITY__DUNGEON:
			setDungeon((Dungeon) newValue);
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
		case GeneratorMetamodelsPackage.ADAPTED_LEARNING_GAME_ACTIVITY__DUNGEON:
			setDungeon((Dungeon) null);
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
		case GeneratorMetamodelsPackage.ADAPTED_LEARNING_GAME_ACTIVITY__DUNGEON:
			return dungeon != null;
		}
		return super.eIsSet(featureID);
	}

} //AdaptedLearningGameActivityImpl
