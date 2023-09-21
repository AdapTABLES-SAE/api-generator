/**
 */
package generator.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import generator.ATask;
import generator.GeneratorPackage;
import generator.QuestionableFact;
import generator.ResultsByTask;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Results By Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.ResultsByTaskImpl#getTask <em>Task</em>}</li>
 *   <li>{@link generator.impl.ResultsByTaskImpl#getQuestionableFacts <em>Questionable Facts</em>}</li>
 *   <li>{@link generator.impl.ResultsByTaskImpl#getSuccessPercent <em>Success Percent</em>}</li>
 *   <li>{@link generator.impl.ResultsByTaskImpl#getEncountersPercent <em>Encounters Percent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResultsByTaskImpl extends MinimalEObjectImpl.Container implements ResultsByTask {
	/**
	 * The cached value of the '{@link #getTask() <em>Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTask()
	 * @generated
	 * @ordered
	 */
	protected ATask task;

	/**
	 * The cached value of the '{@link #getQuestionableFacts() <em>Questionable Facts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestionableFacts()
	 * @generated
	 * @ordered
	 */
	protected EList<QuestionableFact> questionableFacts;

	/**
	 * The default value of the '{@link #getSuccessPercent() <em>Success Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccessPercent()
	 * @generated
	 * @ordered
	 */
	protected static final double SUCCESS_PERCENT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSuccessPercent() <em>Success Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccessPercent()
	 * @generated
	 * @ordered
	 */
	protected double successPercent = SUCCESS_PERCENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getEncountersPercent() <em>Encounters Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncountersPercent()
	 * @generated
	 * @ordered
	 */
	protected static final double ENCOUNTERS_PERCENT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getEncountersPercent() <em>Encounters Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncountersPercent()
	 * @generated
	 * @ordered
	 */
	protected double encountersPercent = ENCOUNTERS_PERCENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultsByTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.RESULTS_BY_TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ATask getTask() {
		if (task != null && task.eIsProxy()) {
			InternalEObject oldTask = (InternalEObject) task;
			task = (ATask) eResolveProxy(oldTask);
			if (task != oldTask) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GeneratorPackage.RESULTS_BY_TASK__TASK,
							oldTask, task));
			}
		}
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ATask basicGetTask() {
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTask(ATask newTask) {
		ATask oldTask = task;
		task = newTask;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.RESULTS_BY_TASK__TASK, oldTask,
					task));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QuestionableFact> getQuestionableFacts() {
		if (questionableFacts == null) {
			questionableFacts = new EObjectContainmentEList<QuestionableFact>(QuestionableFact.class, this,
					GeneratorPackage.RESULTS_BY_TASK__QUESTIONABLE_FACTS);
		}
		return questionableFacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSuccessPercent() {
		return successPercent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuccessPercent(double newSuccessPercent) {
		double oldSuccessPercent = successPercent;
		successPercent = newSuccessPercent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.RESULTS_BY_TASK__SUCCESS_PERCENT,
					oldSuccessPercent, successPercent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getEncountersPercent() {
		return encountersPercent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEncountersPercent(double newEncountersPercent) {
		double oldEncountersPercent = encountersPercent;
		encountersPercent = newEncountersPercent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.RESULTS_BY_TASK__ENCOUNTERS_PERCENT,
					oldEncountersPercent, encountersPercent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GeneratorPackage.RESULTS_BY_TASK__QUESTIONABLE_FACTS:
			return ((InternalEList<?>) getQuestionableFacts()).basicRemove(otherEnd, msgs);
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
		case GeneratorPackage.RESULTS_BY_TASK__TASK:
			if (resolve)
				return getTask();
			return basicGetTask();
		case GeneratorPackage.RESULTS_BY_TASK__QUESTIONABLE_FACTS:
			return getQuestionableFacts();
		case GeneratorPackage.RESULTS_BY_TASK__SUCCESS_PERCENT:
			return getSuccessPercent();
		case GeneratorPackage.RESULTS_BY_TASK__ENCOUNTERS_PERCENT:
			return getEncountersPercent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case GeneratorPackage.RESULTS_BY_TASK__TASK:
			setTask((ATask) newValue);
			return;
		case GeneratorPackage.RESULTS_BY_TASK__QUESTIONABLE_FACTS:
			getQuestionableFacts().clear();
			getQuestionableFacts().addAll((Collection<? extends QuestionableFact>) newValue);
			return;
		case GeneratorPackage.RESULTS_BY_TASK__SUCCESS_PERCENT:
			setSuccessPercent((Double) newValue);
			return;
		case GeneratorPackage.RESULTS_BY_TASK__ENCOUNTERS_PERCENT:
			setEncountersPercent((Double) newValue);
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
		case GeneratorPackage.RESULTS_BY_TASK__TASK:
			setTask((ATask) null);
			return;
		case GeneratorPackage.RESULTS_BY_TASK__QUESTIONABLE_FACTS:
			getQuestionableFacts().clear();
			return;
		case GeneratorPackage.RESULTS_BY_TASK__SUCCESS_PERCENT:
			setSuccessPercent(SUCCESS_PERCENT_EDEFAULT);
			return;
		case GeneratorPackage.RESULTS_BY_TASK__ENCOUNTERS_PERCENT:
			setEncountersPercent(ENCOUNTERS_PERCENT_EDEFAULT);
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
		case GeneratorPackage.RESULTS_BY_TASK__TASK:
			return task != null;
		case GeneratorPackage.RESULTS_BY_TASK__QUESTIONABLE_FACTS:
			return questionableFacts != null && !questionableFacts.isEmpty();
		case GeneratorPackage.RESULTS_BY_TASK__SUCCESS_PERCENT:
			return successPercent != SUCCESS_PERCENT_EDEFAULT;
		case GeneratorPackage.RESULTS_BY_TASK__ENCOUNTERS_PERCENT:
			return encountersPercent != ENCOUNTERS_PERCENT_EDEFAULT;
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
		result.append(" (successPercent: ");
		result.append(successPercent);
		result.append(", encountersPercent: ");
		result.append(encountersPercent);
		result.append(')');
		return result.toString();
	}

} //ResultsByTaskImpl
