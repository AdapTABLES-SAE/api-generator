/**
 */
package generator.impl;

import generator.GeneratorPackage;
import generator.MTQFCompletion2;

import java.lang.reflect.InvocationTargetException;
import java.util.Objects;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MTQF Completion2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.MTQFCompletion2Impl#getLeftOperand <em>Left Operand</em>}</li>
 *   <li>{@link generator.impl.MTQFCompletion2Impl#getRightOperand <em>Right Operand</em>}</li>
 *   <li>{@link generator.impl.MTQFCompletion2Impl#getResult <em>Result</em>}</li>
 *   <li>{@link generator.impl.MTQFCompletion2Impl#getSoluceLeft <em>Soluce Left</em>}</li>
 *   <li>{@link generator.impl.MTQFCompletion2Impl#getSoluceRight <em>Soluce Right</em>}</li>
 *   <li>{@link generator.impl.MTQFCompletion2Impl#getSoluceRes <em>Soluce Res</em>}</li>
 *   <li>{@link generator.impl.MTQFCompletion2Impl#isResultOnRight <em>Result On Right</em>}</li>
 *   <li>{@link generator.impl.MTQFCompletion2Impl#getNO_VALUE <em>NO VALUE</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MTQFCompletion2Impl extends QuestionableFactImpl implements MTQFCompletion2 {
	/**
	 * The default value of the '{@link #getLeftOperand() <em>Left Operand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftOperand()
	 * @generated
	 * @ordered
	 */
	protected static final int LEFT_OPERAND_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLeftOperand() <em>Left Operand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftOperand()
	 * @generated
	 * @ordered
	 */
	protected int leftOperand = LEFT_OPERAND_EDEFAULT;

	/**
	 * The default value of the '{@link #getRightOperand() <em>Right Operand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightOperand()
	 * @generated
	 * @ordered
	 */
	protected static final int RIGHT_OPERAND_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRightOperand() <em>Right Operand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightOperand()
	 * @generated
	 * @ordered
	 */
	protected int rightOperand = RIGHT_OPERAND_EDEFAULT;

	/**
	 * The default value of the '{@link #getResult() <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
	protected static final int RESULT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getResult() <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
	protected int result = RESULT_EDEFAULT;

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
	 * The default value of the '{@link #getNO_VALUE() <em>NO VALUE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNO_VALUE()
	 * @generated
	 * @ordered
	 */
	protected static final int NO_VALUE_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getNO_VALUE() <em>NO VALUE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNO_VALUE()
	 * @generated
	 * @ordered
	 */
	protected int nO_VALUE = NO_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MTQFCompletion2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.MTQF_COMPLETION2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLeftOperand() {
		return leftOperand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeftOperand(int newLeftOperand) {
		int oldLeftOperand = leftOperand;
		leftOperand = newLeftOperand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.MTQF_COMPLETION2__LEFT_OPERAND,
					oldLeftOperand, leftOperand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRightOperand() {
		return rightOperand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRightOperand(int newRightOperand) {
		int oldRightOperand = rightOperand;
		rightOperand = newRightOperand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.MTQF_COMPLETION2__RIGHT_OPERAND,
					oldRightOperand, rightOperand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getResult() {
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResult(int newResult) {
		int oldResult = result;
		result = newResult;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.MTQF_COMPLETION2__RESULT, oldResult,
					result));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.MTQF_COMPLETION2__SOLUCE_LEFT,
					oldSoluceLeft, soluceLeft));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.MTQF_COMPLETION2__SOLUCE_RIGHT,
					oldSoluceRight, soluceRight));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.MTQF_COMPLETION2__SOLUCE_RES,
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
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.MTQF_COMPLETION2__RESULT_ON_RIGHT,
					oldResultOnRight, resultOnRight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNO_VALUE() {
		return nO_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getQuestionableFact() {
		String left = getLeftOperand() == getNO_VALUE() ? "?" : getLeftOperand() + "";
		String right = getRightOperand() == getNO_VALUE() ? "?" : getRightOperand() + "";
		String res = getResult() == getNO_VALUE() ? "?" : getResult() + "";

		if (resultOnRight) {
			return left + " x " + right + " = " + res + " (" + soluceLeft + "x" + soluceRight + "=" + soluceRes + ")";
		} else {
			return res + " = " + left + " x " + right + " (" + soluceRes + "=" + soluceLeft + "x" + soluceRight + ")";
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GeneratorPackage.MTQF_COMPLETION2__LEFT_OPERAND:
			return getLeftOperand();
		case GeneratorPackage.MTQF_COMPLETION2__RIGHT_OPERAND:
			return getRightOperand();
		case GeneratorPackage.MTQF_COMPLETION2__RESULT:
			return getResult();
		case GeneratorPackage.MTQF_COMPLETION2__SOLUCE_LEFT:
			return getSoluceLeft();
		case GeneratorPackage.MTQF_COMPLETION2__SOLUCE_RIGHT:
			return getSoluceRight();
		case GeneratorPackage.MTQF_COMPLETION2__SOLUCE_RES:
			return getSoluceRes();
		case GeneratorPackage.MTQF_COMPLETION2__RESULT_ON_RIGHT:
			return isResultOnRight();
		case GeneratorPackage.MTQF_COMPLETION2__NO_VALUE:
			return getNO_VALUE();
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
		case GeneratorPackage.MTQF_COMPLETION2__LEFT_OPERAND:
			setLeftOperand((Integer) newValue);
			return;
		case GeneratorPackage.MTQF_COMPLETION2__RIGHT_OPERAND:
			setRightOperand((Integer) newValue);
			return;
		case GeneratorPackage.MTQF_COMPLETION2__RESULT:
			setResult((Integer) newValue);
			return;
		case GeneratorPackage.MTQF_COMPLETION2__SOLUCE_LEFT:
			setSoluceLeft((Integer) newValue);
			return;
		case GeneratorPackage.MTQF_COMPLETION2__SOLUCE_RIGHT:
			setSoluceRight((Integer) newValue);
			return;
		case GeneratorPackage.MTQF_COMPLETION2__SOLUCE_RES:
			setSoluceRes((Integer) newValue);
			return;
		case GeneratorPackage.MTQF_COMPLETION2__RESULT_ON_RIGHT:
			setResultOnRight((Boolean) newValue);
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
		case GeneratorPackage.MTQF_COMPLETION2__LEFT_OPERAND:
			setLeftOperand(LEFT_OPERAND_EDEFAULT);
			return;
		case GeneratorPackage.MTQF_COMPLETION2__RIGHT_OPERAND:
			setRightOperand(RIGHT_OPERAND_EDEFAULT);
			return;
		case GeneratorPackage.MTQF_COMPLETION2__RESULT:
			setResult(RESULT_EDEFAULT);
			return;
		case GeneratorPackage.MTQF_COMPLETION2__SOLUCE_LEFT:
			setSoluceLeft(SOLUCE_LEFT_EDEFAULT);
			return;
		case GeneratorPackage.MTQF_COMPLETION2__SOLUCE_RIGHT:
			setSoluceRight(SOLUCE_RIGHT_EDEFAULT);
			return;
		case GeneratorPackage.MTQF_COMPLETION2__SOLUCE_RES:
			setSoluceRes(SOLUCE_RES_EDEFAULT);
			return;
		case GeneratorPackage.MTQF_COMPLETION2__RESULT_ON_RIGHT:
			setResultOnRight(RESULT_ON_RIGHT_EDEFAULT);
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
		case GeneratorPackage.MTQF_COMPLETION2__LEFT_OPERAND:
			return leftOperand != LEFT_OPERAND_EDEFAULT;
		case GeneratorPackage.MTQF_COMPLETION2__RIGHT_OPERAND:
			return rightOperand != RIGHT_OPERAND_EDEFAULT;
		case GeneratorPackage.MTQF_COMPLETION2__RESULT:
			return result != RESULT_EDEFAULT;
		case GeneratorPackage.MTQF_COMPLETION2__SOLUCE_LEFT:
			return soluceLeft != SOLUCE_LEFT_EDEFAULT;
		case GeneratorPackage.MTQF_COMPLETION2__SOLUCE_RIGHT:
			return soluceRight != SOLUCE_RIGHT_EDEFAULT;
		case GeneratorPackage.MTQF_COMPLETION2__SOLUCE_RES:
			return soluceRes != SOLUCE_RES_EDEFAULT;
		case GeneratorPackage.MTQF_COMPLETION2__RESULT_ON_RIGHT:
			return resultOnRight != RESULT_ON_RIGHT_EDEFAULT;
		case GeneratorPackage.MTQF_COMPLETION2__NO_VALUE:
			return nO_VALUE != NO_VALUE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case GeneratorPackage.MTQF_COMPLETION2___GET_QUESTIONABLE_FACT:
			return getQuestionableFact();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (leftOperand: ");
		result.append(leftOperand);
		result.append(", rightOperand: ");
		result.append(rightOperand);
		result.append(", result: ");
		result.append(result);
		result.append(", soluceLeft: ");
		result.append(soluceLeft);
		result.append(", soluceRight: ");
		result.append(soluceRight);
		result.append(", soluceRes: ");
		result.append(soluceRes);
		result.append(", resultOnRight: ");
		result.append(resultOnRight);
		result.append(", NO_VALUE: ");
		result.append(nO_VALUE);
		result.append(')');
		return result.toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(leftOperand, nO_VALUE, result, resultOnRight, rightOperand, soluceLeft, soluceRes,
				soluceRight);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MTQFCompletion2Impl other = (MTQFCompletion2Impl) obj;
		return leftOperand == other.leftOperand && nO_VALUE == other.nO_VALUE && result == other.result
				&& resultOnRight == other.resultOnRight && rightOperand == other.rightOperand
				&& soluceLeft == other.soluceLeft && soluceRes == other.soluceRes && soluceRight == other.soluceRight;
	}

} //MTQFCompletion2Impl
