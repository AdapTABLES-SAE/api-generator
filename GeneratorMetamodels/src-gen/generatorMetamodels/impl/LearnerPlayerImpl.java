/**
 */
package generatorMetamodels.impl;

import generatorMetamodels.GameProfile;
import generatorMetamodels.GeneratorMetamodelsPackage;
import generatorMetamodels.LearnerPlayer;
import generatorMetamodels.LearningProfile;

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
 *   <li>{@link generatorMetamodels.impl.LearnerPlayerImpl#getLearningprofile <em>Learningprofile</em>}</li>
 *   <li>{@link generatorMetamodels.impl.LearnerPlayerImpl#getGameprofile <em>Gameprofile</em>}</li>
 *   <li>{@link generatorMetamodels.impl.LearnerPlayerImpl#getFirstname <em>Firstname</em>}</li>
 *   <li>{@link generatorMetamodels.impl.LearnerPlayerImpl#getLastname <em>Lastname</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LearnerPlayerImpl extends MinimalEObjectImpl.Container implements LearnerPlayer {
	/**
	 * The cached value of the '{@link #getLearningprofile() <em>Learningprofile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLearningprofile()
	 * @generated
	 * @ordered
	 */
	protected LearningProfile learningprofile;

	/**
	 * The cached value of the '{@link #getGameprofile() <em>Gameprofile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGameprofile()
	 * @generated
	 * @ordered
	 */
	protected GameProfile gameprofile;

	/**
	 * The default value of the '{@link #getFirstname() <em>Firstname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstname()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRSTNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirstname() <em>Firstname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstname()
	 * @generated
	 * @ordered
	 */
	protected String firstname = FIRSTNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastname() <em>Lastname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastname()
	 * @generated
	 * @ordered
	 */
	protected static final String LASTNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastname() <em>Lastname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastname()
	 * @generated
	 * @ordered
	 */
	protected String lastname = LASTNAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LearnerPlayerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorMetamodelsPackage.Literals.LEARNER_PLAYER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LearningProfile getLearningprofile() {
		return learningprofile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLearningprofile(LearningProfile newLearningprofile, NotificationChain msgs) {
		LearningProfile oldLearningprofile = learningprofile;
		learningprofile = newLearningprofile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GeneratorMetamodelsPackage.LEARNER_PLAYER__LEARNINGPROFILE, oldLearningprofile, newLearningprofile);
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
	public void setLearningprofile(LearningProfile newLearningprofile) {
		if (newLearningprofile != learningprofile) {
			NotificationChain msgs = null;
			if (learningprofile != null)
				msgs = ((InternalEObject) learningprofile).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GeneratorMetamodelsPackage.LEARNER_PLAYER__LEARNINGPROFILE, null,
						msgs);
			if (newLearningprofile != null)
				msgs = ((InternalEObject) newLearningprofile).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GeneratorMetamodelsPackage.LEARNER_PLAYER__LEARNINGPROFILE, null,
						msgs);
			msgs = basicSetLearningprofile(newLearningprofile, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GeneratorMetamodelsPackage.LEARNER_PLAYER__LEARNINGPROFILE, newLearningprofile,
					newLearningprofile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GameProfile getGameprofile() {
		return gameprofile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGameprofile(GameProfile newGameprofile, NotificationChain msgs) {
		GameProfile oldGameprofile = gameprofile;
		gameprofile = newGameprofile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GeneratorMetamodelsPackage.LEARNER_PLAYER__GAMEPROFILE, oldGameprofile, newGameprofile);
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
	public void setGameprofile(GameProfile newGameprofile) {
		if (newGameprofile != gameprofile) {
			NotificationChain msgs = null;
			if (gameprofile != null)
				msgs = ((InternalEObject) gameprofile).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GeneratorMetamodelsPackage.LEARNER_PLAYER__GAMEPROFILE, null, msgs);
			if (newGameprofile != null)
				msgs = ((InternalEObject) newGameprofile).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GeneratorMetamodelsPackage.LEARNER_PLAYER__GAMEPROFILE, null, msgs);
			msgs = basicSetGameprofile(newGameprofile, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GeneratorMetamodelsPackage.LEARNER_PLAYER__GAMEPROFILE, newGameprofile, newGameprofile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFirstname() {
		return firstname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstname(String newFirstname) {
		String oldFirstname = firstname;
		firstname = newFirstname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorMetamodelsPackage.LEARNER_PLAYER__FIRSTNAME,
					oldFirstname, firstname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLastname() {
		return lastname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastname(String newLastname) {
		String oldLastname = lastname;
		lastname = newLastname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorMetamodelsPackage.LEARNER_PLAYER__LASTNAME,
					oldLastname, lastname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GeneratorMetamodelsPackage.LEARNER_PLAYER__LEARNINGPROFILE:
			return basicSetLearningprofile(null, msgs);
		case GeneratorMetamodelsPackage.LEARNER_PLAYER__GAMEPROFILE:
			return basicSetGameprofile(null, msgs);
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
		case GeneratorMetamodelsPackage.LEARNER_PLAYER__LEARNINGPROFILE:
			return getLearningprofile();
		case GeneratorMetamodelsPackage.LEARNER_PLAYER__GAMEPROFILE:
			return getGameprofile();
		case GeneratorMetamodelsPackage.LEARNER_PLAYER__FIRSTNAME:
			return getFirstname();
		case GeneratorMetamodelsPackage.LEARNER_PLAYER__LASTNAME:
			return getLastname();
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
		case GeneratorMetamodelsPackage.LEARNER_PLAYER__LEARNINGPROFILE:
			setLearningprofile((LearningProfile) newValue);
			return;
		case GeneratorMetamodelsPackage.LEARNER_PLAYER__GAMEPROFILE:
			setGameprofile((GameProfile) newValue);
			return;
		case GeneratorMetamodelsPackage.LEARNER_PLAYER__FIRSTNAME:
			setFirstname((String) newValue);
			return;
		case GeneratorMetamodelsPackage.LEARNER_PLAYER__LASTNAME:
			setLastname((String) newValue);
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
		case GeneratorMetamodelsPackage.LEARNER_PLAYER__LEARNINGPROFILE:
			setLearningprofile((LearningProfile) null);
			return;
		case GeneratorMetamodelsPackage.LEARNER_PLAYER__GAMEPROFILE:
			setGameprofile((GameProfile) null);
			return;
		case GeneratorMetamodelsPackage.LEARNER_PLAYER__FIRSTNAME:
			setFirstname(FIRSTNAME_EDEFAULT);
			return;
		case GeneratorMetamodelsPackage.LEARNER_PLAYER__LASTNAME:
			setLastname(LASTNAME_EDEFAULT);
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
		case GeneratorMetamodelsPackage.LEARNER_PLAYER__LEARNINGPROFILE:
			return learningprofile != null;
		case GeneratorMetamodelsPackage.LEARNER_PLAYER__GAMEPROFILE:
			return gameprofile != null;
		case GeneratorMetamodelsPackage.LEARNER_PLAYER__FIRSTNAME:
			return FIRSTNAME_EDEFAULT == null ? firstname != null : !FIRSTNAME_EDEFAULT.equals(firstname);
		case GeneratorMetamodelsPackage.LEARNER_PLAYER__LASTNAME:
			return LASTNAME_EDEFAULT == null ? lastname != null : !LASTNAME_EDEFAULT.equals(lastname);
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
		result.append(" (firstname: ");
		result.append(firstname);
		result.append(", lastname: ");
		result.append(lastname);
		result.append(')');
		return result.toString();
	}

} //LearnerPlayerImpl
