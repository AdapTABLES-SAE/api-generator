/**
 */
package generator.impl;

import generator.GeneratorPackage;
import generator.LearnerPlayer;
import generator.LearningPath;
import generator.Progression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Learner Player</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.LearnerPlayerImpl#getProgression <em>Progression</em>}</li>
 *   <li>{@link generator.impl.LearnerPlayerImpl#getName <em>Name</em>}</li>
 *   <li>{@link generator.impl.LearnerPlayerImpl#getLearningpath <em>Learningpath</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LearnerPlayerImpl extends MinimalEObjectImpl.Container implements LearnerPlayer {
	/**
	 * The cached value of the '{@link #getProgression() <em>Progression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgression()
	 * @generated
	 * @ordered
	 */
	protected Progression progression;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LearnerPlayerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.LEARNER_PLAYER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Progression getProgression() {
		return progression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProgression(Progression newProgression, NotificationChain msgs) {
		Progression oldProgression = progression;
		progression = newProgression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.LEARNER_PLAYER__PROGRESSION, oldProgression, newProgression);
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
	public void setProgression(Progression newProgression) {
		if (newProgression != progression) {
			NotificationChain msgs = null;
			if (progression != null)
				msgs = ((InternalEObject) progression).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.LEARNER_PLAYER__PROGRESSION, null, msgs);
			if (newProgression != null)
				msgs = ((InternalEObject) newProgression).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.LEARNER_PLAYER__PROGRESSION, null, msgs);
			msgs = basicSetProgression(newProgression, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.LEARNER_PLAYER__PROGRESSION,
					newProgression, newProgression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.LEARNER_PLAYER__NAME, oldName,
					name));
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
							GeneratorPackage.LEARNER_PLAYER__LEARNINGPATH, oldLearningpath, learningpath));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.LEARNER_PLAYER__LEARNINGPATH,
					oldLearningpath, learningpath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GeneratorPackage.LEARNER_PLAYER__PROGRESSION:
			return basicSetProgression(null, msgs);
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
		case GeneratorPackage.LEARNER_PLAYER__PROGRESSION:
			return getProgression();
		case GeneratorPackage.LEARNER_PLAYER__NAME:
			return getName();
		case GeneratorPackage.LEARNER_PLAYER__LEARNINGPATH:
			if (resolve)
				return getLearningpath();
			return basicGetLearningpath();
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
		case GeneratorPackage.LEARNER_PLAYER__PROGRESSION:
			setProgression((Progression) newValue);
			return;
		case GeneratorPackage.LEARNER_PLAYER__NAME:
			setName((String) newValue);
			return;
		case GeneratorPackage.LEARNER_PLAYER__LEARNINGPATH:
			setLearningpath((LearningPath) newValue);
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
		case GeneratorPackage.LEARNER_PLAYER__PROGRESSION:
			setProgression((Progression) null);
			return;
		case GeneratorPackage.LEARNER_PLAYER__NAME:
			setName(NAME_EDEFAULT);
			return;
		case GeneratorPackage.LEARNER_PLAYER__LEARNINGPATH:
			setLearningpath((LearningPath) null);
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
		case GeneratorPackage.LEARNER_PLAYER__PROGRESSION:
			return progression != null;
		case GeneratorPackage.LEARNER_PLAYER__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case GeneratorPackage.LEARNER_PLAYER__LEARNINGPATH:
			return learningpath != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //LearnerPlayerImpl
