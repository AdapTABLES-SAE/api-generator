/**
 */
package generator.impl;

import generator.GeneratorPackage;
import generator.MTQFCompletion1;

import java.util.Objects;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MTQF Completion1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.MTQFCompletion1Impl#getLeftOperand <em>Left Operand</em>}</li>
 *   <li>{@link generator.impl.MTQFCompletion1Impl#getRightOperand <em>Right Operand</em>}</li>
 *   <li>{@link generator.impl.MTQFCompletion1Impl#getResult <em>Result</em>}</li>
 *   <li>{@link generator.impl.MTQFCompletion1Impl#getSoluce <em>Soluce</em>}</li>
 *   <li>{@link generator.impl.MTQFCompletion1Impl#isResultOnRight <em>Result On Right</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MTQFCompletion1Impl extends QuestionableFactImpl implements MTQFCompletion1 {
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
	 * The default value of the '{@link #getSoluce() <em>Soluce</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoluce()
	 * @generated
	 * @ordered
	 */
	protected static final int SOLUCE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSoluce() <em>Soluce</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoluce()
	 * @generated
	 * @ordered
	 */
	protected int soluce = SOLUCE_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MTQFCompletion1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.MTQF_COMPLETION1;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.MTQF_COMPLETION1__LEFT_OPERAND,
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
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.MTQF_COMPLETION1__RIGHT_OPERAND,
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
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.MTQF_COMPLETION1__RESULT, oldResult,
					result));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSoluce() {
		return soluce;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSoluce(int newSoluce) {
		int oldSoluce = soluce;
		soluce = newSoluce;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.MTQF_COMPLETION1__SOLUCE, oldSoluce,
					soluce));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.MTQF_COMPLETION1__RESULT_ON_RIGHT,
					oldResultOnRight, resultOnRight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GeneratorPackage.MTQF_COMPLETION1__LEFT_OPERAND:
			return getLeftOperand();
		case GeneratorPackage.MTQF_COMPLETION1__RIGHT_OPERAND:
			return getRightOperand();
		case GeneratorPackage.MTQF_COMPLETION1__RESULT:
			return getResult();
		case GeneratorPackage.MTQF_COMPLETION1__SOLUCE:
			return getSoluce();
		case GeneratorPackage.MTQF_COMPLETION1__RESULT_ON_RIGHT:
			return isResultOnRight();
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
		case GeneratorPackage.MTQF_COMPLETION1__LEFT_OPERAND:
			setLeftOperand((Integer) newValue);
			return;
		case GeneratorPackage.MTQF_COMPLETION1__RIGHT_OPERAND:
			setRightOperand((Integer) newValue);
			return;
		case GeneratorPackage.MTQF_COMPLETION1__RESULT:
			setResult((Integer) newValue);
			return;
		case GeneratorPackage.MTQF_COMPLETION1__SOLUCE:
			setSoluce((Integer) newValue);
			return;
		case GeneratorPackage.MTQF_COMPLETION1__RESULT_ON_RIGHT:
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
		case GeneratorPackage.MTQF_COMPLETION1__LEFT_OPERAND:
			setLeftOperand(LEFT_OPERAND_EDEFAULT);
			return;
		case GeneratorPackage.MTQF_COMPLETION1__RIGHT_OPERAND:
			setRightOperand(RIGHT_OPERAND_EDEFAULT);
			return;
		case GeneratorPackage.MTQF_COMPLETION1__RESULT:
			setResult(RESULT_EDEFAULT);
			return;
		case GeneratorPackage.MTQF_COMPLETION1__SOLUCE:
			setSoluce(SOLUCE_EDEFAULT);
			return;
		case GeneratorPackage.MTQF_COMPLETION1__RESULT_ON_RIGHT:
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
		case GeneratorPackage.MTQF_COMPLETION1__LEFT_OPERAND:
			return leftOperand != LEFT_OPERAND_EDEFAULT;
		case GeneratorPackage.MTQF_COMPLETION1__RIGHT_OPERAND:
			return rightOperand != RIGHT_OPERAND_EDEFAULT;
		case GeneratorPackage.MTQF_COMPLETION1__RESULT:
			return result != RESULT_EDEFAULT;
		case GeneratorPackage.MTQF_COMPLETION1__SOLUCE:
			return soluce != SOLUCE_EDEFAULT;
		case GeneratorPackage.MTQF_COMPLETION1__RESULT_ON_RIGHT:
			return resultOnRight != RESULT_ON_RIGHT_EDEFAULT;
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
		result.append(" (leftOperand: ");
		result.append(leftOperand);
		result.append(", rightOperand: ");
		result.append(rightOperand);
		result.append(", result: ");
		result.append(result);
		result.append(", soluce: ");
		result.append(soluce);
		result.append(", resultOnRight: ");
		result.append(resultOnRight);
		result.append(')');
		return result.toString();
	}

	@Override
	public String getQuestionableFact() {
		String left = getLeftOperand() == -1 ? "?" : getLeftOperand() + "";
		String right = getRightOperand() == -1 ? "?" : getRightOperand() + "";
		String res = getResult() == -1 ? "?" : getResult() + "";

		if (resultOnRight) {
			return left + " x " + right + " = " + res; //+ " (" + soluce + ")";
		} else {
			return res + " = " + left + " x " + right; // + " (" + soluce + ")";
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(leftOperand, result, resultOnRight, rightOperand, soluce);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MTQFCompletion1Impl other = (MTQFCompletion1Impl) obj;
		return leftOperand == other.leftOperand && result == other.result && resultOnRight == other.resultOnRight
				&& rightOperand == other.rightOperand && soluce == other.soluce;
	}

} //MTQFCompletion1Impl
