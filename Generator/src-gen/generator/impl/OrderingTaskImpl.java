/**
 */
package generator.impl;

import generator.ATask;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import generator.ETaskType;
import generator.GeneratorPackage;
import generator.OrderingTask;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ordering Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.OrderingTaskImpl#getType <em>Type</em>}</li>
 *   <li>{@link generator.impl.OrderingTaskImpl#isCheckOnLearnerAction <em>Check On Learner Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class OrderingTaskImpl extends ATaskImpl implements OrderingTask {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ETaskType TYPE_EDEFAULT = ETaskType.ORDER;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ETaskType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isCheckOnLearnerAction() <em>Check On Learner Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCheckOnLearnerAction()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CHECK_ON_LEARNER_ACTION_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isCheckOnLearnerAction() <em>Check On Learner Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCheckOnLearnerAction()
	 * @generated
	 * @ordered
	 */
	protected boolean checkOnLearnerAction = CHECK_ON_LEARNER_ACTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderingTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.ORDERING_TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ETaskType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCheckOnLearnerAction() {
		return checkOnLearnerAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCheckOnLearnerAction(boolean newCheckOnLearnerAction) {
		boolean oldCheckOnLearnerAction = checkOnLearnerAction;
		checkOnLearnerAction = newCheckOnLearnerAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.ORDERING_TASK__CHECK_ON_LEARNER_ACTION, oldCheckOnLearnerAction,
					checkOnLearnerAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNbExpectedAnswers() {
		return this.getNbFacts();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GeneratorPackage.ORDERING_TASK__TYPE:
			return getType();
		case GeneratorPackage.ORDERING_TASK__CHECK_ON_LEARNER_ACTION:
			return isCheckOnLearnerAction();
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
		case GeneratorPackage.ORDERING_TASK__CHECK_ON_LEARNER_ACTION:
			setCheckOnLearnerAction((Boolean) newValue);
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
		case GeneratorPackage.ORDERING_TASK__CHECK_ON_LEARNER_ACTION:
			setCheckOnLearnerAction(CHECK_ON_LEARNER_ACTION_EDEFAULT);
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
		case GeneratorPackage.ORDERING_TASK__TYPE:
			return type != TYPE_EDEFAULT;
		case GeneratorPackage.ORDERING_TASK__CHECK_ON_LEARNER_ACTION:
			return checkOnLearnerAction != CHECK_ON_LEARNER_ACTION_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == ATask.class) {
			switch (baseOperationID) {
			case GeneratorPackage.ATASK___GET_NB_EXPECTED_ANSWERS:
				return GeneratorPackage.ORDERING_TASK___GET_NB_EXPECTED_ANSWERS;
			default:
				return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case GeneratorPackage.ORDERING_TASK___GET_NB_EXPECTED_ANSWERS:
			return getNbExpectedAnswers();
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
		result.append(" (type: ");
		result.append(type);
		result.append(", checkOnLearnerAction: ");
		result.append(checkOnLearnerAction);
		result.append(')');
		return result.toString();
	}

} //OrderingTaskImpl
