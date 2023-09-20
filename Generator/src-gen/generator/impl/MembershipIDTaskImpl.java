/**
 */
package generator.impl;

import generator.ATask;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import generator.ETaskType;
import generator.GeneratorPackage;
import generator.MembershipIDTask;
import generator.MultipleChoice;
import java.lang.reflect.InvocationTargetException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Membership ID Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.MembershipIDTaskImpl#getType <em>Type</em>}</li>
 *   <li>{@link generator.impl.MembershipIDTaskImpl#isIdentifySharedProperty <em>Identify Shared Property</em>}</li>
 *   <li>{@link generator.impl.MembershipIDTaskImpl#isCheckLearnerAction <em>Check Learner Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class MembershipIDTaskImpl extends ATaskImpl implements MembershipIDTask {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ETaskType TYPE_EDEFAULT = ETaskType.MEMBERSHIP;

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
	 * The default value of the '{@link #isIdentifySharedProperty() <em>Identify Shared Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIdentifySharedProperty()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IDENTIFY_SHARED_PROPERTY_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isIdentifySharedProperty() <em>Identify Shared Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIdentifySharedProperty()
	 * @generated
	 * @ordered
	 */
	protected boolean identifySharedProperty = IDENTIFY_SHARED_PROPERTY_EDEFAULT;

	/**
	 * The default value of the '{@link #isCheckLearnerAction() <em>Check Learner Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCheckLearnerAction()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CHECK_LEARNER_ACTION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCheckLearnerAction() <em>Check Learner Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCheckLearnerAction()
	 * @generated
	 * @ordered
	 */
	protected boolean checkLearnerAction = CHECK_LEARNER_ACTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MembershipIDTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.MEMBERSHIP_ID_TASK;
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
	public boolean isIdentifySharedProperty() {
		return identifySharedProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifySharedProperty(boolean newIdentifySharedProperty) {
		boolean oldIdentifySharedProperty = identifySharedProperty;
		identifySharedProperty = newIdentifySharedProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.MEMBERSHIP_ID_TASK__IDENTIFY_SHARED_PROPERTY, oldIdentifySharedProperty,
					identifySharedProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCheckLearnerAction() {
		return checkLearnerAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCheckLearnerAction(boolean newCheckLearnerAction) {
		boolean oldCheckLearnerAction = checkLearnerAction;
		checkLearnerAction = newCheckLearnerAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.MEMBERSHIP_ID_TASK__CHECK_LEARNER_ACTION, oldCheckLearnerAction,
					checkLearnerAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNbExpectedAnswers() {
		MultipleChoice mc = (MultipleChoice) this.getResponseModality();
		return mc.getNbChoices() - mc.getNbBadChoices();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GeneratorPackage.MEMBERSHIP_ID_TASK__TYPE:
			return getType();
		case GeneratorPackage.MEMBERSHIP_ID_TASK__IDENTIFY_SHARED_PROPERTY:
			return isIdentifySharedProperty();
		case GeneratorPackage.MEMBERSHIP_ID_TASK__CHECK_LEARNER_ACTION:
			return isCheckLearnerAction();
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
		case GeneratorPackage.MEMBERSHIP_ID_TASK__IDENTIFY_SHARED_PROPERTY:
			setIdentifySharedProperty((Boolean) newValue);
			return;
		case GeneratorPackage.MEMBERSHIP_ID_TASK__CHECK_LEARNER_ACTION:
			setCheckLearnerAction((Boolean) newValue);
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
		case GeneratorPackage.MEMBERSHIP_ID_TASK__IDENTIFY_SHARED_PROPERTY:
			setIdentifySharedProperty(IDENTIFY_SHARED_PROPERTY_EDEFAULT);
			return;
		case GeneratorPackage.MEMBERSHIP_ID_TASK__CHECK_LEARNER_ACTION:
			setCheckLearnerAction(CHECK_LEARNER_ACTION_EDEFAULT);
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
		case GeneratorPackage.MEMBERSHIP_ID_TASK__TYPE:
			return type != TYPE_EDEFAULT;
		case GeneratorPackage.MEMBERSHIP_ID_TASK__IDENTIFY_SHARED_PROPERTY:
			return identifySharedProperty != IDENTIFY_SHARED_PROPERTY_EDEFAULT;
		case GeneratorPackage.MEMBERSHIP_ID_TASK__CHECK_LEARNER_ACTION:
			return checkLearnerAction != CHECK_LEARNER_ACTION_EDEFAULT;
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
				return GeneratorPackage.MEMBERSHIP_ID_TASK___GET_NB_EXPECTED_ANSWERS;
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
		case GeneratorPackage.MEMBERSHIP_ID_TASK___GET_NB_EXPECTED_ANSWERS:
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
		result.append(", identifySharedProperty: ");
		result.append(identifySharedProperty);
		result.append(", checkLearnerAction: ");
		result.append(checkLearnerAction);
		result.append(')');
		return result.toString();
	}

} //MembershipIDTaskImpl
