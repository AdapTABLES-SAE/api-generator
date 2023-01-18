/**
 */
package generator.impl;

import generator.GeneratorPackage;
import generator.MTQFRebuild;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MTQF Rebuild</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.MTQFRebuildImpl#getSoluceLeft <em>Soluce Left</em>}</li>
 *   <li>{@link generator.impl.MTQFRebuildImpl#getSoluceRes <em>Soluce Res</em>}</li>
 *   <li>{@link generator.impl.MTQFRebuildImpl#isResultOnRight <em>Result On Right</em>}</li>
 *   <li>{@link generator.impl.MTQFRebuildImpl#getSoluceRight <em>Soluce Right</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MTQFRebuildImpl extends QuestionableFactImpl implements MTQFRebuild {
	/**
	 * The default value of the '{@link #getSoluceLeft() <em>Soluce Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoluceLeft()
	 * @generated
	 * @ordered
	 */
	protected static final int SOLUCE_LEFT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSoluceLeft() <em>Soluce Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoluceLeft()
	 * @generated
	 * @ordered
	 */
	protected int soluceLeft = SOLUCE_LEFT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSoluceRes() <em>Soluce Res</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoluceRes()
	 * @generated
	 * @ordered
	 */
	protected static final int SOLUCE_RES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSoluceRes() <em>Soluce Res</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoluceRes()
	 * @generated
	 * @ordered
	 */
	protected int soluceRes = SOLUCE_RES_EDEFAULT;

	/**
	 * The default value of the '{@link #isResultOnRight() <em>Result On Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isResultOnRight()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RESULT_ON_RIGHT_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isResultOnRight() <em>Result On Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isResultOnRight()
	 * @generated
	 * @ordered
	 */
	protected boolean resultOnRight = RESULT_ON_RIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSoluceRight() <em>Soluce Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoluceRight()
	 * @generated
	 * @ordered
	 */
	protected static final int SOLUCE_RIGHT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSoluceRight() <em>Soluce Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoluceRight()
	 * @generated
	 * @ordered
	 */
	protected int soluceRight = SOLUCE_RIGHT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MTQFRebuildImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.MTQF_REBUILD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSoluceLeft() {
		return soluceLeft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSoluceLeft(int newSoluceLeft) {
		int oldSoluceLeft = soluceLeft;
		soluceLeft = newSoluceLeft;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.MTQF_REBUILD__SOLUCE_LEFT,
					oldSoluceLeft, soluceLeft));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSoluceRes() {
		return soluceRes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSoluceRes(int newSoluceRes) {
		int oldSoluceRes = soluceRes;
		soluceRes = newSoluceRes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.MTQF_REBUILD__SOLUCE_RES,
					oldSoluceRes, soluceRes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isResultOnRight() {
		return resultOnRight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResultOnRight(boolean newResultOnRight) {
		boolean oldResultOnRight = resultOnRight;
		resultOnRight = newResultOnRight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.MTQF_REBUILD__RESULT_ON_RIGHT,
					oldResultOnRight, resultOnRight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSoluceRight() {
		return soluceRight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSoluceRight(int newSoluceRight) {
		int oldSoluceRight = soluceRight;
		soluceRight = newSoluceRight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.MTQF_REBUILD__SOLUCE_RIGHT,
					oldSoluceRight, soluceRight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GeneratorPackage.MTQF_REBUILD__SOLUCE_LEFT:
			return getSoluceLeft();
		case GeneratorPackage.MTQF_REBUILD__SOLUCE_RES:
			return getSoluceRes();
		case GeneratorPackage.MTQF_REBUILD__RESULT_ON_RIGHT:
			return isResultOnRight();
		case GeneratorPackage.MTQF_REBUILD__SOLUCE_RIGHT:
			return getSoluceRight();
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
		case GeneratorPackage.MTQF_REBUILD__SOLUCE_LEFT:
			setSoluceLeft((Integer) newValue);
			return;
		case GeneratorPackage.MTQF_REBUILD__SOLUCE_RES:
			setSoluceRes((Integer) newValue);
			return;
		case GeneratorPackage.MTQF_REBUILD__RESULT_ON_RIGHT:
			setResultOnRight((Boolean) newValue);
			return;
		case GeneratorPackage.MTQF_REBUILD__SOLUCE_RIGHT:
			setSoluceRight((Integer) newValue);
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
		case GeneratorPackage.MTQF_REBUILD__SOLUCE_LEFT:
			setSoluceLeft(SOLUCE_LEFT_EDEFAULT);
			return;
		case GeneratorPackage.MTQF_REBUILD__SOLUCE_RES:
			setSoluceRes(SOLUCE_RES_EDEFAULT);
			return;
		case GeneratorPackage.MTQF_REBUILD__RESULT_ON_RIGHT:
			setResultOnRight(RESULT_ON_RIGHT_EDEFAULT);
			return;
		case GeneratorPackage.MTQF_REBUILD__SOLUCE_RIGHT:
			setSoluceRight(SOLUCE_RIGHT_EDEFAULT);
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
		case GeneratorPackage.MTQF_REBUILD__SOLUCE_LEFT:
			return soluceLeft != SOLUCE_LEFT_EDEFAULT;
		case GeneratorPackage.MTQF_REBUILD__SOLUCE_RES:
			return soluceRes != SOLUCE_RES_EDEFAULT;
		case GeneratorPackage.MTQF_REBUILD__RESULT_ON_RIGHT:
			return resultOnRight != RESULT_ON_RIGHT_EDEFAULT;
		case GeneratorPackage.MTQF_REBUILD__SOLUCE_RIGHT:
			return soluceRight != SOLUCE_RIGHT_EDEFAULT;
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
		result.append(" (soluceLeft: ");
		result.append(soluceLeft);
		result.append(", soluceRes: ");
		result.append(soluceRes);
		result.append(", resultOnRight: ");
		result.append(resultOnRight);
		result.append(", soluceRight: ");
		result.append(soluceRight);
		result.append(')');
		return result.toString();
	}

	@Override
	public String getQuestionableFact() {
        if (resultOnRight) {
            return "? x ? = ? (" + getSoluceLeft() + " x " + getSoluceRight() + " = " + getSoluceRes() + ")";
        } else {
            return "? = ? x ? (" + getSoluceRes() + " = " + getSoluceLeft() + " x " + getSoluceRight() + ")";
        }
	}

} //MTQFRebuildImpl
