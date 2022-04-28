/**
 */
package generatorMetamodels.impl;

import generatorMetamodels.CurrentProgression;
import generatorMetamodels.GeneratorMetamodelsPackage;
import generatorMetamodels.LearningPath;
import generatorMetamodels.LearningProfile;

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
 * An implementation of the model object '<em><b>Learning Profile</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generatorMetamodels.impl.LearningProfileImpl#getLearningpath <em>Learningpath</em>}</li>
 *   <li>{@link generatorMetamodels.impl.LearningProfileImpl#getCurrentprogressions <em>Currentprogressions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LearningProfileImpl extends MinimalEObjectImpl.Container implements LearningProfile {
	/**
	 * The cached value of the '{@link #getLearningpath() <em>Learningpath</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLearningpath()
	 * @generated
	 * @ordered
	 */
	protected LearningPath learningpath;

	/**
	 * The cached value of the '{@link #getCurrentprogressions() <em>Currentprogressions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentprogressions()
	 * @generated
	 * @ordered
	 */
	protected EList<CurrentProgression> currentprogressions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LearningProfileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorMetamodelsPackage.Literals.LEARNING_PROFILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LearningPath getLearningpath() {
		if (learningpath != null && learningpath.eIsProxy()) {
			InternalEObject oldLearningpath = (InternalEObject) learningpath;
			learningpath = (LearningPath) eResolveProxy(oldLearningpath);
			if (learningpath != oldLearningpath) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							GeneratorMetamodelsPackage.LEARNING_PROFILE__LEARNINGPATH, oldLearningpath, learningpath));
			}
		}
		return learningpath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LearningPath basicGetLearningpath() {
		return learningpath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLearningpath(LearningPath newLearningpath) {
		LearningPath oldLearningpath = learningpath;
		learningpath = newLearningpath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GeneratorMetamodelsPackage.LEARNING_PROFILE__LEARNINGPATH, oldLearningpath, learningpath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CurrentProgression> getCurrentprogressions() {
		if (currentprogressions == null) {
			currentprogressions = new EObjectContainmentEList<CurrentProgression>(CurrentProgression.class, this,
					GeneratorMetamodelsPackage.LEARNING_PROFILE__CURRENTPROGRESSIONS);
		}
		return currentprogressions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GeneratorMetamodelsPackage.LEARNING_PROFILE__CURRENTPROGRESSIONS:
			return ((InternalEList<?>) getCurrentprogressions()).basicRemove(otherEnd, msgs);
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
		case GeneratorMetamodelsPackage.LEARNING_PROFILE__LEARNINGPATH:
			if (resolve)
				return getLearningpath();
			return basicGetLearningpath();
		case GeneratorMetamodelsPackage.LEARNING_PROFILE__CURRENTPROGRESSIONS:
			return getCurrentprogressions();
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
		case GeneratorMetamodelsPackage.LEARNING_PROFILE__LEARNINGPATH:
			setLearningpath((LearningPath) newValue);
			return;
		case GeneratorMetamodelsPackage.LEARNING_PROFILE__CURRENTPROGRESSIONS:
			getCurrentprogressions().clear();
			getCurrentprogressions().addAll((Collection<? extends CurrentProgression>) newValue);
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
		case GeneratorMetamodelsPackage.LEARNING_PROFILE__LEARNINGPATH:
			setLearningpath((LearningPath) null);
			return;
		case GeneratorMetamodelsPackage.LEARNING_PROFILE__CURRENTPROGRESSIONS:
			getCurrentprogressions().clear();
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
		case GeneratorMetamodelsPackage.LEARNING_PROFILE__LEARNINGPATH:
			return learningpath != null;
		case GeneratorMetamodelsPackage.LEARNING_PROFILE__CURRENTPROGRESSIONS:
			return currentprogressions != null && !currentprogressions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LearningProfileImpl
