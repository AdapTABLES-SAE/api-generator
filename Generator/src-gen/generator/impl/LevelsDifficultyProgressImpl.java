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

import generator.CurseEligibility;
import generator.GeneratorPackage;
import generator.LevelsDifficultyProgress;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Levels Difficulty Progress</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.LevelsDifficultyProgressImpl#getNbQRoomIncrease <em>Nb QRoom Increase</em>}</li>
 *   <li>{@link generator.impl.LevelsDifficultyProgressImpl#getNbNQRoomIncrease <em>Nb NQ Room Increase</em>}</li>
 *   <li>{@link generator.impl.LevelsDifficultyProgressImpl#getInitNbQRoom <em>Init Nb QRoom</em>}</li>
 *   <li>{@link generator.impl.LevelsDifficultyProgressImpl#getInitNbNQRoom <em>Init Nb NQ Room</em>}</li>
 *   <li>{@link generator.impl.LevelsDifficultyProgressImpl#getCursesAvailabilities <em>Curses Availabilities</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LevelsDifficultyProgressImpl extends MinimalEObjectImpl.Container implements LevelsDifficultyProgress {
	/**
	 * The default value of the '{@link #getNbQRoomIncrease() <em>Nb QRoom Increase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbQRoomIncrease()
	 * @generated
	 * @ordered
	 */
	protected static final int NB_QROOM_INCREASE_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getNbQRoomIncrease() <em>Nb QRoom Increase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbQRoomIncrease()
	 * @generated
	 * @ordered
	 */
	protected int nbQRoomIncrease = NB_QROOM_INCREASE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNbNQRoomIncrease() <em>Nb NQ Room Increase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbNQRoomIncrease()
	 * @generated
	 * @ordered
	 */
	protected static final int NB_NQ_ROOM_INCREASE_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getNbNQRoomIncrease() <em>Nb NQ Room Increase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbNQRoomIncrease()
	 * @generated
	 * @ordered
	 */
	protected int nbNQRoomIncrease = NB_NQ_ROOM_INCREASE_EDEFAULT;

	/**
	 * The default value of the '{@link #getInitNbQRoom() <em>Init Nb QRoom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitNbQRoom()
	 * @generated
	 * @ordered
	 */
	protected static final int INIT_NB_QROOM_EDEFAULT = 5;

	/**
	 * The cached value of the '{@link #getInitNbQRoom() <em>Init Nb QRoom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitNbQRoom()
	 * @generated
	 * @ordered
	 */
	protected int initNbQRoom = INIT_NB_QROOM_EDEFAULT;

	/**
	 * The default value of the '{@link #getInitNbNQRoom() <em>Init Nb NQ Room</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitNbNQRoom()
	 * @generated
	 * @ordered
	 */
	protected static final int INIT_NB_NQ_ROOM_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getInitNbNQRoom() <em>Init Nb NQ Room</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitNbNQRoom()
	 * @generated
	 * @ordered
	 */
	protected int initNbNQRoom = INIT_NB_NQ_ROOM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCursesAvailabilities() <em>Curses Availabilities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCursesAvailabilities()
	 * @generated
	 * @ordered
	 */
	protected EList<CurseEligibility> cursesAvailabilities;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LevelsDifficultyProgressImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.LEVELS_DIFFICULTY_PROGRESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNbQRoomIncrease() {
		return nbQRoomIncrease;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbQRoomIncrease(int newNbQRoomIncrease) {
		int oldNbQRoomIncrease = nbQRoomIncrease;
		nbQRoomIncrease = newNbQRoomIncrease;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.LEVELS_DIFFICULTY_PROGRESS__NB_QROOM_INCREASE, oldNbQRoomIncrease,
					nbQRoomIncrease));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNbNQRoomIncrease() {
		return nbNQRoomIncrease;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbNQRoomIncrease(int newNbNQRoomIncrease) {
		int oldNbNQRoomIncrease = nbNQRoomIncrease;
		nbNQRoomIncrease = newNbNQRoomIncrease;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.LEVELS_DIFFICULTY_PROGRESS__NB_NQ_ROOM_INCREASE, oldNbNQRoomIncrease,
					nbNQRoomIncrease));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getInitNbQRoom() {
		return initNbQRoom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitNbQRoom(int newInitNbQRoom) {
		int oldInitNbQRoom = initNbQRoom;
		initNbQRoom = newInitNbQRoom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.LEVELS_DIFFICULTY_PROGRESS__INIT_NB_QROOM, oldInitNbQRoom, initNbQRoom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getInitNbNQRoom() {
		return initNbNQRoom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitNbNQRoom(int newInitNbNQRoom) {
		int oldInitNbNQRoom = initNbNQRoom;
		initNbNQRoom = newInitNbNQRoom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.LEVELS_DIFFICULTY_PROGRESS__INIT_NB_NQ_ROOM, oldInitNbNQRoom, initNbNQRoom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CurseEligibility> getCursesAvailabilities() {
		if (cursesAvailabilities == null) {
			cursesAvailabilities = new EObjectContainmentEList<CurseEligibility>(CurseEligibility.class, this,
					GeneratorPackage.LEVELS_DIFFICULTY_PROGRESS__CURSES_AVAILABILITIES);
		}
		return cursesAvailabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GeneratorPackage.LEVELS_DIFFICULTY_PROGRESS__CURSES_AVAILABILITIES:
			return ((InternalEList<?>) getCursesAvailabilities()).basicRemove(otherEnd, msgs);
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
		case GeneratorPackage.LEVELS_DIFFICULTY_PROGRESS__NB_QROOM_INCREASE:
			return getNbQRoomIncrease();
		case GeneratorPackage.LEVELS_DIFFICULTY_PROGRESS__NB_NQ_ROOM_INCREASE:
			return getNbNQRoomIncrease();
		case GeneratorPackage.LEVELS_DIFFICULTY_PROGRESS__INIT_NB_QROOM:
			return getInitNbQRoom();
		case GeneratorPackage.LEVELS_DIFFICULTY_PROGRESS__INIT_NB_NQ_ROOM:
			return getInitNbNQRoom();
		case GeneratorPackage.LEVELS_DIFFICULTY_PROGRESS__CURSES_AVAILABILITIES:
			return getCursesAvailabilities();
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
		case GeneratorPackage.LEVELS_DIFFICULTY_PROGRESS__NB_QROOM_INCREASE:
			setNbQRoomIncrease((Integer) newValue);
			return;
		case GeneratorPackage.LEVELS_DIFFICULTY_PROGRESS__NB_NQ_ROOM_INCREASE:
			setNbNQRoomIncrease((Integer) newValue);
			return;
		case GeneratorPackage.LEVELS_DIFFICULTY_PROGRESS__INIT_NB_QROOM:
			setInitNbQRoom((Integer) newValue);
			return;
		case GeneratorPackage.LEVELS_DIFFICULTY_PROGRESS__INIT_NB_NQ_ROOM:
			setInitNbNQRoom((Integer) newValue);
			return;
		case GeneratorPackage.LEVELS_DIFFICULTY_PROGRESS__CURSES_AVAILABILITIES:
			getCursesAvailabilities().clear();
			getCursesAvailabilities().addAll((Collection<? extends CurseEligibility>) newValue);
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
		case GeneratorPackage.LEVELS_DIFFICULTY_PROGRESS__NB_QROOM_INCREASE:
			setNbQRoomIncrease(NB_QROOM_INCREASE_EDEFAULT);
			return;
		case GeneratorPackage.LEVELS_DIFFICULTY_PROGRESS__NB_NQ_ROOM_INCREASE:
			setNbNQRoomIncrease(NB_NQ_ROOM_INCREASE_EDEFAULT);
			return;
		case GeneratorPackage.LEVELS_DIFFICULTY_PROGRESS__INIT_NB_QROOM:
			setInitNbQRoom(INIT_NB_QROOM_EDEFAULT);
			return;
		case GeneratorPackage.LEVELS_DIFFICULTY_PROGRESS__INIT_NB_NQ_ROOM:
			setInitNbNQRoom(INIT_NB_NQ_ROOM_EDEFAULT);
			return;
		case GeneratorPackage.LEVELS_DIFFICULTY_PROGRESS__CURSES_AVAILABILITIES:
			getCursesAvailabilities().clear();
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
		case GeneratorPackage.LEVELS_DIFFICULTY_PROGRESS__NB_QROOM_INCREASE:
			return nbQRoomIncrease != NB_QROOM_INCREASE_EDEFAULT;
		case GeneratorPackage.LEVELS_DIFFICULTY_PROGRESS__NB_NQ_ROOM_INCREASE:
			return nbNQRoomIncrease != NB_NQ_ROOM_INCREASE_EDEFAULT;
		case GeneratorPackage.LEVELS_DIFFICULTY_PROGRESS__INIT_NB_QROOM:
			return initNbQRoom != INIT_NB_QROOM_EDEFAULT;
		case GeneratorPackage.LEVELS_DIFFICULTY_PROGRESS__INIT_NB_NQ_ROOM:
			return initNbNQRoom != INIT_NB_NQ_ROOM_EDEFAULT;
		case GeneratorPackage.LEVELS_DIFFICULTY_PROGRESS__CURSES_AVAILABILITIES:
			return cursesAvailabilities != null && !cursesAvailabilities.isEmpty();
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
		result.append(" (nbQRoomIncrease: ");
		result.append(nbQRoomIncrease);
		result.append(", nbNQRoomIncrease: ");
		result.append(nbNQRoomIncrease);
		result.append(", initNbQRoom: ");
		result.append(initNbQRoom);
		result.append(", initNbNQRoom: ");
		result.append(initNbNQRoom);
		result.append(')');
		return result.toString();
	}

} //LevelsDifficultyProgressImpl
