/**
 */
package generator.impl;

import generator.GeneratorPackage;
import generator.Task;
import generator.TaskType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.TaskImpl#getTasktype <em>Tasktype</em>}</li>
 *   <li>{@link generator.impl.TaskImpl#getPercentageOfApparition <em>Percentage Of Apparition</em>}</li>
 *   <li>{@link generator.impl.TaskImpl#getNbConsecutiveSuccess <em>Nb Consecutive Success</em>}</li>
 *   <li>{@link generator.impl.TaskImpl#getPercentageOfValidFacts <em>Percentage Of Valid Facts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskImpl extends MinimalEObjectImpl.Container implements Task {
	/**
	 * The cached value of the '{@link #getTasktype() <em>Tasktype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTasktype()
	 * @generated
	 * @ordered
	 */
	protected TaskType tasktype;

	/**
	 * The default value of the '{@link #getPercentageOfApparition() <em>Percentage Of Apparition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentageOfApparition()
	 * @generated
	 * @ordered
	 */
	protected static final int PERCENTAGE_OF_APPARITION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPercentageOfApparition() <em>Percentage Of Apparition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentageOfApparition()
	 * @generated
	 * @ordered
	 */
	protected int percentageOfApparition = PERCENTAGE_OF_APPARITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getNbConsecutiveSuccess() <em>Nb Consecutive Success</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbConsecutiveSuccess()
	 * @generated
	 * @ordered
	 */
	protected static final int NB_CONSECUTIVE_SUCCESS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNbConsecutiveSuccess() <em>Nb Consecutive Success</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbConsecutiveSuccess()
	 * @generated
	 * @ordered
	 */
	protected int nbConsecutiveSuccess = NB_CONSECUTIVE_SUCCESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPercentageOfValidFacts() <em>Percentage Of Valid Facts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentageOfValidFacts()
	 * @generated
	 * @ordered
	 */
	protected static final int PERCENTAGE_OF_VALID_FACTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPercentageOfValidFacts() <em>Percentage Of Valid Facts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentageOfValidFacts()
	 * @generated
	 * @ordered
	 */
	protected int percentageOfValidFacts = PERCENTAGE_OF_VALID_FACTS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskType getTasktype() {
		if (tasktype != null && tasktype.eIsProxy()) {
			InternalEObject oldTasktype = (InternalEObject) tasktype;
			tasktype = (TaskType) eResolveProxy(oldTasktype);
			if (tasktype != oldTasktype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GeneratorPackage.TASK__TASKTYPE,
							oldTasktype, tasktype));
			}
		}
		return tasktype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskType basicGetTasktype() {
		return tasktype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTasktype(TaskType newTasktype) {
		TaskType oldTasktype = tasktype;
		tasktype = newTasktype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.TASK__TASKTYPE, oldTasktype,
					tasktype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPercentageOfApparition() {
		return percentageOfApparition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPercentageOfApparition(int newPercentageOfApparition) {
		int oldPercentageOfApparition = percentageOfApparition;
		percentageOfApparition = newPercentageOfApparition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.TASK__PERCENTAGE_OF_APPARITION,
					oldPercentageOfApparition, percentageOfApparition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNbConsecutiveSuccess() {
		return nbConsecutiveSuccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbConsecutiveSuccess(int newNbConsecutiveSuccess) {
		int oldNbConsecutiveSuccess = nbConsecutiveSuccess;
		nbConsecutiveSuccess = newNbConsecutiveSuccess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.TASK__NB_CONSECUTIVE_SUCCESS,
					oldNbConsecutiveSuccess, nbConsecutiveSuccess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPercentageOfValidFacts() {
		return percentageOfValidFacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPercentageOfValidFacts(int newPercentageOfValidFacts) {
		int oldPercentageOfValidFacts = percentageOfValidFacts;
		percentageOfValidFacts = newPercentageOfValidFacts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.TASK__PERCENTAGE_OF_VALID_FACTS,
					oldPercentageOfValidFacts, percentageOfValidFacts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GeneratorPackage.TASK__TASKTYPE:
			if (resolve)
				return getTasktype();
			return basicGetTasktype();
		case GeneratorPackage.TASK__PERCENTAGE_OF_APPARITION:
			return getPercentageOfApparition();
		case GeneratorPackage.TASK__NB_CONSECUTIVE_SUCCESS:
			return getNbConsecutiveSuccess();
		case GeneratorPackage.TASK__PERCENTAGE_OF_VALID_FACTS:
			return getPercentageOfValidFacts();
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
		case GeneratorPackage.TASK__TASKTYPE:
			setTasktype((TaskType) newValue);
			return;
		case GeneratorPackage.TASK__PERCENTAGE_OF_APPARITION:
			setPercentageOfApparition((Integer) newValue);
			return;
		case GeneratorPackage.TASK__NB_CONSECUTIVE_SUCCESS:
			setNbConsecutiveSuccess((Integer) newValue);
			return;
		case GeneratorPackage.TASK__PERCENTAGE_OF_VALID_FACTS:
			setPercentageOfValidFacts((Integer) newValue);
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
		case GeneratorPackage.TASK__TASKTYPE:
			setTasktype((TaskType) null);
			return;
		case GeneratorPackage.TASK__PERCENTAGE_OF_APPARITION:
			setPercentageOfApparition(PERCENTAGE_OF_APPARITION_EDEFAULT);
			return;
		case GeneratorPackage.TASK__NB_CONSECUTIVE_SUCCESS:
			setNbConsecutiveSuccess(NB_CONSECUTIVE_SUCCESS_EDEFAULT);
			return;
		case GeneratorPackage.TASK__PERCENTAGE_OF_VALID_FACTS:
			setPercentageOfValidFacts(PERCENTAGE_OF_VALID_FACTS_EDEFAULT);
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
		case GeneratorPackage.TASK__TASKTYPE:
			return tasktype != null;
		case GeneratorPackage.TASK__PERCENTAGE_OF_APPARITION:
			return percentageOfApparition != PERCENTAGE_OF_APPARITION_EDEFAULT;
		case GeneratorPackage.TASK__NB_CONSECUTIVE_SUCCESS:
			return nbConsecutiveSuccess != NB_CONSECUTIVE_SUCCESS_EDEFAULT;
		case GeneratorPackage.TASK__PERCENTAGE_OF_VALID_FACTS:
			return percentageOfValidFacts != PERCENTAGE_OF_VALID_FACTS_EDEFAULT;
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
		result.append(" (percentageOfApparition: ");
		result.append(percentageOfApparition);
		result.append(", nbConsecutiveSuccess: ");
		result.append(nbConsecutiveSuccess);
		result.append(", percentageOfValidFacts: ");
		result.append(percentageOfValidFacts);
		result.append(')');
		return result.toString();
	}

} //TaskImpl
