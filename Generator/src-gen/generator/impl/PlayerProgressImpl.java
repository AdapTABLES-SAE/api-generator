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
import generator.Items;
import generator.PlayerProgress;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Player Progress</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.PlayerProgressImpl#getCurrentLevel <em>Current Level</em>}</li>
 *   <li>{@link generator.impl.PlayerProgressImpl#getCoins <em>Coins</em>}</li>
 *   <li>{@link generator.impl.PlayerProgressImpl#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlayerProgressImpl extends MinimalEObjectImpl.Container implements PlayerProgress {
	/**
	 * The default value of the '{@link #getCurrentLevel() <em>Current Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentLevel()
	 * @generated
	 * @ordered
	 */
	protected static final int CURRENT_LEVEL_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getCurrentLevel() <em>Current Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentLevel()
	 * @generated
	 * @ordered
	 */
	protected int currentLevel = CURRENT_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getCoins() <em>Coins</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoins()
	 * @generated
	 * @ordered
	 */
	protected static final int COINS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCoins() <em>Coins</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoins()
	 * @generated
	 * @ordered
	 */
	protected int coins = COINS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getItems() <em>Items</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItems()
	 * @generated
	 * @ordered
	 */
	protected Items items;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlayerProgressImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.PLAYER_PROGRESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCurrentLevel() {
		return currentLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentLevel(int newCurrentLevel) {
		int oldCurrentLevel = currentLevel;
		currentLevel = newCurrentLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.PLAYER_PROGRESS__CURRENT_LEVEL,
					oldCurrentLevel, currentLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCoins() {
		return coins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoins(int newCoins) {
		int oldCoins = coins;
		coins = newCoins;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.PLAYER_PROGRESS__COINS, oldCoins,
					coins));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Items getItems() {
		return items;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetItems(Items newItems, NotificationChain msgs) {
		Items oldItems = items;
		items = newItems;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.PLAYER_PROGRESS__ITEMS, oldItems, newItems);
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
	public void setItems(Items newItems) {
		if (newItems != items) {
			NotificationChain msgs = null;
			if (items != null)
				msgs = ((InternalEObject) items).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.PLAYER_PROGRESS__ITEMS, null, msgs);
			if (newItems != null)
				msgs = ((InternalEObject) newItems).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.PLAYER_PROGRESS__ITEMS, null, msgs);
			msgs = basicSetItems(newItems, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.PLAYER_PROGRESS__ITEMS, newItems,
					newItems));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GeneratorPackage.PLAYER_PROGRESS__ITEMS:
			return basicSetItems(null, msgs);
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
		case GeneratorPackage.PLAYER_PROGRESS__CURRENT_LEVEL:
			return getCurrentLevel();
		case GeneratorPackage.PLAYER_PROGRESS__COINS:
			return getCoins();
		case GeneratorPackage.PLAYER_PROGRESS__ITEMS:
			return getItems();
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
		case GeneratorPackage.PLAYER_PROGRESS__CURRENT_LEVEL:
			setCurrentLevel((Integer) newValue);
			return;
		case GeneratorPackage.PLAYER_PROGRESS__COINS:
			setCoins((Integer) newValue);
			return;
		case GeneratorPackage.PLAYER_PROGRESS__ITEMS:
			setItems((Items) newValue);
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
		case GeneratorPackage.PLAYER_PROGRESS__CURRENT_LEVEL:
			setCurrentLevel(CURRENT_LEVEL_EDEFAULT);
			return;
		case GeneratorPackage.PLAYER_PROGRESS__COINS:
			setCoins(COINS_EDEFAULT);
			return;
		case GeneratorPackage.PLAYER_PROGRESS__ITEMS:
			setItems((Items) null);
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
		case GeneratorPackage.PLAYER_PROGRESS__CURRENT_LEVEL:
			return currentLevel != CURRENT_LEVEL_EDEFAULT;
		case GeneratorPackage.PLAYER_PROGRESS__COINS:
			return coins != COINS_EDEFAULT;
		case GeneratorPackage.PLAYER_PROGRESS__ITEMS:
			return items != null;
		}
		return super.eIsSet(featureID);
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
		result.append(" (currentLevel: ");
		result.append(currentLevel);
		result.append(", coins: ");
		result.append(coins);
		result.append(')');
		return result.toString();
	}

} //PlayerProgressImpl
