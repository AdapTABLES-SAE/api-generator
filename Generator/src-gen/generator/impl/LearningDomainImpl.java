/**
 */
package generator.impl;

import generator.GeneratorPackage;
import generator.LearningDomain;
import generator.LearningPath;
import generator.ResponseModalities;
import generator.TaskTypes;

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
 * An implementation of the model object '<em><b>Learning Domain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.LearningDomainImpl#getLearningpaths <em>Learningpaths</em>}</li>
 *   <li>{@link generator.impl.LearningDomainImpl#getTasktypes <em>Tasktypes</em>}</li>
 *   <li>{@link generator.impl.LearningDomainImpl#getResponsemodalities <em>Responsemodalities</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LearningDomainImpl extends MinimalEObjectImpl.Container implements LearningDomain {
	/**
	 * The cached value of the '{@link #getLearningpaths() <em>Learningpaths</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLearningpaths()
	 * @generated
	 * @ordered
	 */
	protected EList<LearningPath> learningpaths;

	/**
	 * The cached value of the '{@link #getTasktypes() <em>Tasktypes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTasktypes()
	 * @generated
	 * @ordered
	 */
	protected TaskTypes tasktypes;

	/**
	 * The cached value of the '{@link #getResponsemodalities() <em>Responsemodalities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsemodalities()
	 * @generated
	 * @ordered
	 */
	protected ResponseModalities responsemodalities;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LearningDomainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.LEARNING_DOMAIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LearningPath> getLearningpaths() {
		if (learningpaths == null) {
			learningpaths = new EObjectContainmentEList<LearningPath>(LearningPath.class, this,
					GeneratorPackage.LEARNING_DOMAIN__LEARNINGPATHS);
		}
		return learningpaths;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskTypes getTasktypes() {
		return tasktypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTasktypes(TaskTypes newTasktypes, NotificationChain msgs) {
		TaskTypes oldTasktypes = tasktypes;
		tasktypes = newTasktypes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.LEARNING_DOMAIN__TASKTYPES, oldTasktypes, newTasktypes);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTasktypes(TaskTypes newTasktypes) {
		if (newTasktypes != tasktypes) {
			NotificationChain msgs = null;
			if (tasktypes != null)
				msgs = ((InternalEObject) tasktypes).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.LEARNING_DOMAIN__TASKTYPES, null, msgs);
			if (newTasktypes != null)
				msgs = ((InternalEObject) newTasktypes).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.LEARNING_DOMAIN__TASKTYPES, null, msgs);
			msgs = basicSetTasktypes(newTasktypes, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.LEARNING_DOMAIN__TASKTYPES,
					newTasktypes, newTasktypes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseModalities getResponsemodalities() {
		return responsemodalities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResponsemodalities(ResponseModalities newResponsemodalities,
			NotificationChain msgs) {
		ResponseModalities oldResponsemodalities = responsemodalities;
		responsemodalities = newResponsemodalities;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.LEARNING_DOMAIN__RESPONSEMODALITIES, oldResponsemodalities, newResponsemodalities);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponsemodalities(ResponseModalities newResponsemodalities) {
		if (newResponsemodalities != responsemodalities) {
			NotificationChain msgs = null;
			if (responsemodalities != null)
				msgs = ((InternalEObject) responsemodalities).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.LEARNING_DOMAIN__RESPONSEMODALITIES, null, msgs);
			if (newResponsemodalities != null)
				msgs = ((InternalEObject) newResponsemodalities).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.LEARNING_DOMAIN__RESPONSEMODALITIES, null, msgs);
			msgs = basicSetResponsemodalities(newResponsemodalities, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.LEARNING_DOMAIN__RESPONSEMODALITIES,
					newResponsemodalities, newResponsemodalities));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GeneratorPackage.LEARNING_DOMAIN__LEARNINGPATHS:
			return ((InternalEList<?>) getLearningpaths()).basicRemove(otherEnd, msgs);
		case GeneratorPackage.LEARNING_DOMAIN__TASKTYPES:
			return basicSetTasktypes(null, msgs);
		case GeneratorPackage.LEARNING_DOMAIN__RESPONSEMODALITIES:
			return basicSetResponsemodalities(null, msgs);
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
		case GeneratorPackage.LEARNING_DOMAIN__LEARNINGPATHS:
			return getLearningpaths();
		case GeneratorPackage.LEARNING_DOMAIN__TASKTYPES:
			return getTasktypes();
		case GeneratorPackage.LEARNING_DOMAIN__RESPONSEMODALITIES:
			return getResponsemodalities();
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
		case GeneratorPackage.LEARNING_DOMAIN__LEARNINGPATHS:
			getLearningpaths().clear();
			getLearningpaths().addAll((Collection<? extends LearningPath>) newValue);
			return;
		case GeneratorPackage.LEARNING_DOMAIN__TASKTYPES:
			setTasktypes((TaskTypes) newValue);
			return;
		case GeneratorPackage.LEARNING_DOMAIN__RESPONSEMODALITIES:
			setResponsemodalities((ResponseModalities) newValue);
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
		case GeneratorPackage.LEARNING_DOMAIN__LEARNINGPATHS:
			getLearningpaths().clear();
			return;
		case GeneratorPackage.LEARNING_DOMAIN__TASKTYPES:
			setTasktypes((TaskTypes) null);
			return;
		case GeneratorPackage.LEARNING_DOMAIN__RESPONSEMODALITIES:
			setResponsemodalities((ResponseModalities) null);
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
		case GeneratorPackage.LEARNING_DOMAIN__LEARNINGPATHS:
			return learningpaths != null && !learningpaths.isEmpty();
		case GeneratorPackage.LEARNING_DOMAIN__TASKTYPES:
			return tasktypes != null;
		case GeneratorPackage.LEARNING_DOMAIN__RESPONSEMODALITIES:
			return responsemodalities != null;
		}
		return super.eIsSet(featureID);
	}

} //LearningDomainImpl
