/**
 */
package generator.impl;

import generator.GeneratorPackage;
import generator.VerificationType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Verification Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.VerificationTypeImpl#isVerifyTrue <em>Verify True</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class VerificationTypeImpl extends TaskTypeImpl implements VerificationType {
	/**
	 * The default value of the '{@link #isVerifyTrue() <em>Verify True</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVerifyTrue()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VERIFY_TRUE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isVerifyTrue() <em>Verify True</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVerifyTrue()
	 * @generated
	 * @ordered
	 */
	protected boolean verifyTrue = VERIFY_TRUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerificationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.VERIFICATION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isVerifyTrue() {
		return verifyTrue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVerifyTrue(boolean newVerifyTrue) {
		boolean oldVerifyTrue = verifyTrue;
		verifyTrue = newVerifyTrue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.VERIFICATION_TYPE__VERIFY_TRUE,
					oldVerifyTrue, verifyTrue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GeneratorPackage.VERIFICATION_TYPE__VERIFY_TRUE:
			return isVerifyTrue();
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
		case GeneratorPackage.VERIFICATION_TYPE__VERIFY_TRUE:
			setVerifyTrue((Boolean) newValue);
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
		case GeneratorPackage.VERIFICATION_TYPE__VERIFY_TRUE:
			setVerifyTrue(VERIFY_TRUE_EDEFAULT);
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
		case GeneratorPackage.VERIFICATION_TYPE__VERIFY_TRUE:
			return verifyTrue != VERIFY_TRUE_EDEFAULT;
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
		result.append(" (verifyTrue: ");
		result.append(verifyTrue);
		result.append(')');
		return result.toString();
	}

} //VerificationTypeImpl
