/**
 */
package generator.impl;

import generator.Gameplay;
import generator.GeneratorPackage;
import generator.TaskType;
import generator.TaskType2Gameplay;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task Type2 Gameplay</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.TaskType2GameplayImpl#getGameplay <em>Gameplay</em>}</li>
 *   <li>{@link generator.impl.TaskType2GameplayImpl#getTasktype <em>Tasktype</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskType2GameplayImpl extends ComplianceRelationsImpl implements TaskType2Gameplay {
	/**
	 * The cached value of the '{@link #getGameplay() <em>Gameplay</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGameplay()
	 * @generated
	 * @ordered
	 */
	protected EList<Gameplay> gameplay;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskType2GameplayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.TASK_TYPE2_GAMEPLAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Gameplay> getGameplay() {
		if (gameplay == null) {
			gameplay = new EObjectResolvingEList<Gameplay>(Gameplay.class, this,
					GeneratorPackage.TASK_TYPE2_GAMEPLAY__GAMEPLAY);
		}
		return gameplay;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							GeneratorPackage.TASK_TYPE2_GAMEPLAY__TASKTYPE, oldTasktype, tasktype));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.TASK_TYPE2_GAMEPLAY__TASKTYPE,
					oldTasktype, tasktype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GeneratorPackage.TASK_TYPE2_GAMEPLAY__GAMEPLAY:
			return getGameplay();
		case GeneratorPackage.TASK_TYPE2_GAMEPLAY__TASKTYPE:
			if (resolve)
				return getTasktype();
			return basicGetTasktype();
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
		case GeneratorPackage.TASK_TYPE2_GAMEPLAY__GAMEPLAY:
			getGameplay().clear();
			getGameplay().addAll((Collection<? extends Gameplay>) newValue);
			return;
		case GeneratorPackage.TASK_TYPE2_GAMEPLAY__TASKTYPE:
			setTasktype((TaskType) newValue);
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
		case GeneratorPackage.TASK_TYPE2_GAMEPLAY__GAMEPLAY:
			getGameplay().clear();
			return;
		case GeneratorPackage.TASK_TYPE2_GAMEPLAY__TASKTYPE:
			setTasktype((TaskType) null);
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
		case GeneratorPackage.TASK_TYPE2_GAMEPLAY__GAMEPLAY:
			return gameplay != null && !gameplay.isEmpty();
		case GeneratorPackage.TASK_TYPE2_GAMEPLAY__TASKTYPE:
			return tasktype != null;
		}
		return super.eIsSet(featureID);
	}

} //TaskType2GameplayImpl
