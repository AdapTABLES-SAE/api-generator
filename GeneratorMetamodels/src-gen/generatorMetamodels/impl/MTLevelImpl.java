/**
 */
package generatorMetamodels.impl;

import generatorMetamodels.GeneratorMetamodelsPackage;
import generatorMetamodels.MTLevel;
import generatorMetamodels.ResultPosition;
import generatorMetamodels.TableBuild;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MT Level</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generatorMetamodels.impl.MTLevelImpl#getBuildTableSetup <em>Build Table Setup</em>}</li>
 *   <li>{@link generatorMetamodels.impl.MTLevelImpl#getResultPositionSetup <em>Result Position Setup</em>}</li>
 *   <li>{@link generatorMetamodels.impl.MTLevelImpl#getMinInterval <em>Min Interval</em>}</li>
 *   <li>{@link generatorMetamodels.impl.MTLevelImpl#getMaxInterval <em>Max Interval</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MTLevelImpl extends LevelImpl implements MTLevel {
	/**
	 * The default value of the '{@link #getBuildTableSetup() <em>Build Table Setup</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuildTableSetup()
	 * @generated
	 * @ordered
	 */
	protected static final TableBuild BUILD_TABLE_SETUP_EDEFAULT = TableBuild.TABLE_OPERAND;

	/**
	 * The cached value of the '{@link #getBuildTableSetup() <em>Build Table Setup</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuildTableSetup()
	 * @generated
	 * @ordered
	 */
	protected TableBuild buildTableSetup = BUILD_TABLE_SETUP_EDEFAULT;

	/**
	 * The default value of the '{@link #getResultPositionSetup() <em>Result Position Setup</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultPositionSetup()
	 * @generated
	 * @ordered
	 */
	protected static final ResultPosition RESULT_POSITION_SETUP_EDEFAULT = ResultPosition.RIGHT;

	/**
	 * The cached value of the '{@link #getResultPositionSetup() <em>Result Position Setup</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultPositionSetup()
	 * @generated
	 * @ordered
	 */
	protected ResultPosition resultPositionSetup = RESULT_POSITION_SETUP_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MTLevelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorMetamodelsPackage.Literals.MT_LEVEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableBuild getBuildTableSetup() {
		return buildTableSetup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBuildTableSetup(TableBuild newBuildTableSetup) {
		TableBuild oldBuildTableSetup = buildTableSetup;
		buildTableSetup = newBuildTableSetup == null ? BUILD_TABLE_SETUP_EDEFAULT : newBuildTableSetup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GeneratorMetamodelsPackage.MT_LEVEL__BUILD_TABLE_SETUP, oldBuildTableSetup, buildTableSetup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultPosition getResultPositionSetup() {
		return resultPositionSetup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResultPositionSetup(ResultPosition newResultPositionSetup) {
		ResultPosition oldResultPositionSetup = resultPositionSetup;
		resultPositionSetup = newResultPositionSetup == null ? RESULT_POSITION_SETUP_EDEFAULT : newResultPositionSetup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GeneratorMetamodelsPackage.MT_LEVEL__RESULT_POSITION_SETUP, oldResultPositionSetup,
					resultPositionSetup));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorMetamodelsPackage.MT_LEVEL__MIN_INTERVAL,
					oldMinInterval, minInterval));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorMetamodelsPackage.MT_LEVEL__MAX_INTERVAL,
					oldMaxInterval, maxInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GeneratorMetamodelsPackage.MT_LEVEL__BUILD_TABLE_SETUP:
			return getBuildTableSetup();
		case GeneratorMetamodelsPackage.MT_LEVEL__RESULT_POSITION_SETUP:
			return getResultPositionSetup();
		case GeneratorMetamodelsPackage.MT_LEVEL__MIN_INTERVAL:
			return getMinInterval();
		case GeneratorMetamodelsPackage.MT_LEVEL__MAX_INTERVAL:
			return getMaxInterval();
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
		case GeneratorMetamodelsPackage.MT_LEVEL__BUILD_TABLE_SETUP:
			setBuildTableSetup((TableBuild) newValue);
			return;
		case GeneratorMetamodelsPackage.MT_LEVEL__RESULT_POSITION_SETUP:
			setResultPositionSetup((ResultPosition) newValue);
			return;
		case GeneratorMetamodelsPackage.MT_LEVEL__MIN_INTERVAL:
			setMinInterval((Integer) newValue);
			return;
		case GeneratorMetamodelsPackage.MT_LEVEL__MAX_INTERVAL:
			setMaxInterval((Integer) newValue);
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
		case GeneratorMetamodelsPackage.MT_LEVEL__BUILD_TABLE_SETUP:
			setBuildTableSetup(BUILD_TABLE_SETUP_EDEFAULT);
			return;
		case GeneratorMetamodelsPackage.MT_LEVEL__RESULT_POSITION_SETUP:
			setResultPositionSetup(RESULT_POSITION_SETUP_EDEFAULT);
			return;
		case GeneratorMetamodelsPackage.MT_LEVEL__MIN_INTERVAL:
			setMinInterval(MIN_INTERVAL_EDEFAULT);
			return;
		case GeneratorMetamodelsPackage.MT_LEVEL__MAX_INTERVAL:
			setMaxInterval(MAX_INTERVAL_EDEFAULT);
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
		case GeneratorMetamodelsPackage.MT_LEVEL__BUILD_TABLE_SETUP:
			return buildTableSetup != BUILD_TABLE_SETUP_EDEFAULT;
		case GeneratorMetamodelsPackage.MT_LEVEL__RESULT_POSITION_SETUP:
			return resultPositionSetup != RESULT_POSITION_SETUP_EDEFAULT;
		case GeneratorMetamodelsPackage.MT_LEVEL__MIN_INTERVAL:
			return minInterval != MIN_INTERVAL_EDEFAULT;
		case GeneratorMetamodelsPackage.MT_LEVEL__MAX_INTERVAL:
			return maxInterval != MAX_INTERVAL_EDEFAULT;
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
		result.append(" (buildTableSetup: ");
		result.append(buildTableSetup);
		result.append(", resultPositionSetup: ");
		result.append(resultPositionSetup);
		result.append(", minInterval: ");
		result.append(minInterval);
		result.append(", maxInterval: ");
		result.append(maxInterval);
		result.append(')');
		return result.toString();
	}

} //MTLevelImpl
