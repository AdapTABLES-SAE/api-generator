/**
 */
package generator.impl;

import generator.ATask;
import generator.GeneratorPackage;
import generator.QuestionableFact;
import generator.ResultsByTask;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Results By Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.ResultsByTaskImpl#getTask <em>Task</em>}</li>
 *   <li>{@link generator.impl.ResultsByTaskImpl#getQuestionedfacts <em>Questionedfacts</em>}</li>
 *   <li>{@link generator.impl.ResultsByTaskImpl#getSucessPercent <em>Sucess Percent</em>}</li>
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
	 * The cached value of the '{@link #getQuestionedfacts() <em>Questionedfacts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestionedfacts()
	 * @generated
	 * @ordered
	 */
	protected EList<QuestionableFact> questionedfacts;

	/**
	 * The default value of the '{@link #getSucessPercent() <em>Sucess Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSucessPercent()
	 * @generated
	 * @ordered
	 */
	protected static final double SUCESS_PERCENT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSucessPercent() <em>Sucess Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSucessPercent()
	 * @generated
	 * @ordered
	 */
	protected double sucessPercent = SUCESS_PERCENT_EDEFAULT;

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
	public EList<QuestionableFact> getQuestionedfacts() {
		if (questionedfacts == null) {
			questionedfacts = new EObjectContainmentEList<QuestionableFact>(QuestionableFact.class, this,
					GeneratorPackage.RESULTS_BY_TASK__QUESTIONEDFACTS);
		}
		return questionedfacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSucessPercent() {
		return sucessPercent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSucessPercent(double newSucessPercent) {
		double oldSucessPercent = sucessPercent;
		sucessPercent = newSucessPercent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.RESULTS_BY_TASK__SUCESS_PERCENT,
					oldSucessPercent, sucessPercent));
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
		case GeneratorPackage.RESULTS_BY_TASK__QUESTIONEDFACTS:
			return ((InternalEList<?>) getQuestionedfacts()).basicRemove(otherEnd, msgs);
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
		case GeneratorPackage.RESULTS_BY_TASK__QUESTIONEDFACTS:
			return getQuestionedfacts();
		case GeneratorPackage.RESULTS_BY_TASK__SUCESS_PERCENT:
			return getSucessPercent();
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
		case GeneratorPackage.RESULTS_BY_TASK__QUESTIONEDFACTS:
			getQuestionedfacts().clear();
			getQuestionedfacts().addAll((Collection<? extends QuestionableFact>) newValue);
			return;
		case GeneratorPackage.RESULTS_BY_TASK__SUCESS_PERCENT:
			setSucessPercent((Double) newValue);
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
		case GeneratorPackage.RESULTS_BY_TASK__QUESTIONEDFACTS:
			getQuestionedfacts().clear();
			return;
		case GeneratorPackage.RESULTS_BY_TASK__SUCESS_PERCENT:
			setSucessPercent(SUCESS_PERCENT_EDEFAULT);
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
		case GeneratorPackage.RESULTS_BY_TASK__QUESTIONEDFACTS:
			return questionedfacts != null && !questionedfacts.isEmpty();
		case GeneratorPackage.RESULTS_BY_TASK__SUCESS_PERCENT:
			return sucessPercent != SUCESS_PERCENT_EDEFAULT;
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
		result.append(" (sucessPercent: ");
		result.append(sucessPercent);
		result.append(", encountersPercent: ");
		result.append(encountersPercent);
		result.append(')');
		return result.toString();
	}

} //ResultsByTaskImpl
