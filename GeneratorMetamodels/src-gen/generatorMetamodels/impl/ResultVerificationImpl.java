/**
 */
package generatorMetamodels.impl;

import generatorMetamodels.GeneratorMetamodelsPackage;
import generatorMetamodels.ResultVerification;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Result Verification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generatorMetamodels.impl.ResultVerificationImpl#isCheckIsRight <em>Check Is Right</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResultVerificationImpl extends SubObjectiveImpl implements ResultVerification {
	/**
	 * The default value of the '{@link #isCheckIsRight() <em>Check Is Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCheckIsRight()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CHECK_IS_RIGHT_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isCheckIsRight() <em>Check Is Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCheckIsRight()
	 * @generated
	 * @ordered
	 */
	protected boolean checkIsRight = CHECK_IS_RIGHT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResultVerificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorMetamodelsPackage.Literals.RESULT_VERIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCheckIsRight() {
		return checkIsRight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCheckIsRight(boolean newCheckIsRight) {
		boolean oldCheckIsRight = checkIsRight;
		checkIsRight = newCheckIsRight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GeneratorMetamodelsPackage.RESULT_VERIFICATION__CHECK_IS_RIGHT, oldCheckIsRight, checkIsRight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GeneratorMetamodelsPackage.RESULT_VERIFICATION__CHECK_IS_RIGHT:
			return isCheckIsRight();
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
		case GeneratorMetamodelsPackage.RESULT_VERIFICATION__CHECK_IS_RIGHT:
			setCheckIsRight((Boolean) newValue);
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
		case GeneratorMetamodelsPackage.RESULT_VERIFICATION__CHECK_IS_RIGHT:
			setCheckIsRight(CHECK_IS_RIGHT_EDEFAULT);
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
		case GeneratorMetamodelsPackage.RESULT_VERIFICATION__CHECK_IS_RIGHT:
			return checkIsRight != CHECK_IS_RIGHT_EDEFAULT;
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
		result.append(" (checkIsRight: ");
		result.append(checkIsRight);
		result.append(')');
		return result.toString();
	}

} //ResultVerificationImpl
