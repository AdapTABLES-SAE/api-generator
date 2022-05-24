/**
 */
package generatorMetamodels.impl;

import generatorMetamodels.GeneratorMetamodelsPackage;
import generatorMetamodels.MTLevelParam;
import generatorMetamodels.MTResultPosition;
import generatorMetamodels.MTTableBuilding;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MT Level Param</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generatorMetamodels.impl.MTLevelParamImpl#getMaxInterval <em>Max Interval</em>}</li>
 *   <li>{@link generatorMetamodels.impl.MTLevelParamImpl#getMinInterval <em>Min Interval</em>}</li>
 *   <li>{@link generatorMetamodels.impl.MTLevelParamImpl#getBuildTableSetup <em>Build Table Setup</em>}</li>
 *   <li>{@link generatorMetamodels.impl.MTLevelParamImpl#getResultPositionSetup <em>Result Position Setup</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MTLevelParamImpl extends LevelImpl implements MTLevelParam {
	/**
	 * The default value of the '{@link #getMaxInterval() <em>Max Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxInterval()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_INTERVAL_EDEFAULT = 10;

	/**
	 * The cached value of the '{@link #getMaxInterval() <em>Max Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxInterval()
	 * @generated
	 * @ordered
	 */
	protected int maxInterval = MAX_INTERVAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinInterval() <em>Min Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinInterval()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_INTERVAL_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getMinInterval() <em>Min Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinInterval()
	 * @generated
	 * @ordered
	 */
	protected int minInterval = MIN_INTERVAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBuildTableSetup() <em>Build Table Setup</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuildTableSetup()
	 * @generated
	 * @ordered
	 */
	protected MTTableBuilding buildTableSetup;

	/**
	 * The cached value of the '{@link #getResultPositionSetup() <em>Result Position Setup</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultPositionSetup()
	 * @generated
	 * @ordered
	 */
	protected MTResultPosition resultPositionSetup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MTLevelParamImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorMetamodelsPackage.Literals.MT_LEVEL_PARAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxInterval() {
		return maxInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxInterval(int newMaxInterval) {
		int oldMaxInterval = maxInterval;
		maxInterval = newMaxInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GeneratorMetamodelsPackage.MT_LEVEL_PARAM__MAX_INTERVAL, oldMaxInterval, maxInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinInterval() {
		return minInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinInterval(int newMinInterval) {
		int oldMinInterval = minInterval;
		minInterval = newMinInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GeneratorMetamodelsPackage.MT_LEVEL_PARAM__MIN_INTERVAL, oldMinInterval, minInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MTTableBuilding getBuildTableSetup() {
		return buildTableSetup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBuildTableSetup(MTTableBuilding newBuildTableSetup, NotificationChain msgs) {
		MTTableBuilding oldBuildTableSetup = buildTableSetup;
		buildTableSetup = newBuildTableSetup;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GeneratorMetamodelsPackage.MT_LEVEL_PARAM__BUILD_TABLE_SETUP, oldBuildTableSetup,
					newBuildTableSetup);
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
	public void setBuildTableSetup(MTTableBuilding newBuildTableSetup) {
		if (newBuildTableSetup != buildTableSetup) {
			NotificationChain msgs = null;
			if (buildTableSetup != null)
				msgs = ((InternalEObject) buildTableSetup).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GeneratorMetamodelsPackage.MT_LEVEL_PARAM__BUILD_TABLE_SETUP, null,
						msgs);
			if (newBuildTableSetup != null)
				msgs = ((InternalEObject) newBuildTableSetup).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GeneratorMetamodelsPackage.MT_LEVEL_PARAM__BUILD_TABLE_SETUP, null,
						msgs);
			msgs = basicSetBuildTableSetup(newBuildTableSetup, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GeneratorMetamodelsPackage.MT_LEVEL_PARAM__BUILD_TABLE_SETUP, newBuildTableSetup,
					newBuildTableSetup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MTResultPosition getResultPositionSetup() {
		return resultPositionSetup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResultPositionSetup(MTResultPosition newResultPositionSetup,
			NotificationChain msgs) {
		MTResultPosition oldResultPositionSetup = resultPositionSetup;
		resultPositionSetup = newResultPositionSetup;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GeneratorMetamodelsPackage.MT_LEVEL_PARAM__RESULT_POSITION_SETUP, oldResultPositionSetup,
					newResultPositionSetup);
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
	public void setResultPositionSetup(MTResultPosition newResultPositionSetup) {
		if (newResultPositionSetup != resultPositionSetup) {
			NotificationChain msgs = null;
			if (resultPositionSetup != null)
				msgs = ((InternalEObject) resultPositionSetup).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GeneratorMetamodelsPackage.MT_LEVEL_PARAM__RESULT_POSITION_SETUP, null,
						msgs);
			if (newResultPositionSetup != null)
				msgs = ((InternalEObject) newResultPositionSetup).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GeneratorMetamodelsPackage.MT_LEVEL_PARAM__RESULT_POSITION_SETUP, null,
						msgs);
			msgs = basicSetResultPositionSetup(newResultPositionSetup, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GeneratorMetamodelsPackage.MT_LEVEL_PARAM__RESULT_POSITION_SETUP, newResultPositionSetup,
					newResultPositionSetup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GeneratorMetamodelsPackage.MT_LEVEL_PARAM__BUILD_TABLE_SETUP:
			return basicSetBuildTableSetup(null, msgs);
		case GeneratorMetamodelsPackage.MT_LEVEL_PARAM__RESULT_POSITION_SETUP:
			return basicSetResultPositionSetup(null, msgs);
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
		case GeneratorMetamodelsPackage.MT_LEVEL_PARAM__MAX_INTERVAL:
			return getMaxInterval();
		case GeneratorMetamodelsPackage.MT_LEVEL_PARAM__MIN_INTERVAL:
			return getMinInterval();
		case GeneratorMetamodelsPackage.MT_LEVEL_PARAM__BUILD_TABLE_SETUP:
			return getBuildTableSetup();
		case GeneratorMetamodelsPackage.MT_LEVEL_PARAM__RESULT_POSITION_SETUP:
			return getResultPositionSetup();
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
		case GeneratorMetamodelsPackage.MT_LEVEL_PARAM__MAX_INTERVAL:
			setMaxInterval((Integer) newValue);
			return;
		case GeneratorMetamodelsPackage.MT_LEVEL_PARAM__MIN_INTERVAL:
			setMinInterval((Integer) newValue);
			return;
		case GeneratorMetamodelsPackage.MT_LEVEL_PARAM__BUILD_TABLE_SETUP:
			setBuildTableSetup((MTTableBuilding) newValue);
			return;
		case GeneratorMetamodelsPackage.MT_LEVEL_PARAM__RESULT_POSITION_SETUP:
			setResultPositionSetup((MTResultPosition) newValue);
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
		case GeneratorMetamodelsPackage.MT_LEVEL_PARAM__MAX_INTERVAL:
			setMaxInterval(MAX_INTERVAL_EDEFAULT);
			return;
		case GeneratorMetamodelsPackage.MT_LEVEL_PARAM__MIN_INTERVAL:
			setMinInterval(MIN_INTERVAL_EDEFAULT);
			return;
		case GeneratorMetamodelsPackage.MT_LEVEL_PARAM__BUILD_TABLE_SETUP:
			setBuildTableSetup((MTTableBuilding) null);
			return;
		case GeneratorMetamodelsPackage.MT_LEVEL_PARAM__RESULT_POSITION_SETUP:
			setResultPositionSetup((MTResultPosition) null);
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
		case GeneratorMetamodelsPackage.MT_LEVEL_PARAM__MAX_INTERVAL:
			return maxInterval != MAX_INTERVAL_EDEFAULT;
		case GeneratorMetamodelsPackage.MT_LEVEL_PARAM__MIN_INTERVAL:
			return minInterval != MIN_INTERVAL_EDEFAULT;
		case GeneratorMetamodelsPackage.MT_LEVEL_PARAM__BUILD_TABLE_SETUP:
			return buildTableSetup != null;
		case GeneratorMetamodelsPackage.MT_LEVEL_PARAM__RESULT_POSITION_SETUP:
			return resultPositionSetup != null;
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
		result.append(" (maxInterval: ");
		result.append(maxInterval);
		result.append(", minInterval: ");
		result.append(minInterval);
		result.append(')');
		return result.toString();
	}

} //MTLevelParamImpl
