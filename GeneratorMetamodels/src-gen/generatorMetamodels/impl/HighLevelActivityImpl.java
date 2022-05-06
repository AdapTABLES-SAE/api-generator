/**
 */
package generatorMetamodels.impl;

import generatorMetamodels.GameMode;
import generatorMetamodels.GamingObjective;
import generatorMetamodels.GeneratorMetamodelsPackage;
import generatorMetamodels.HighLevelActivity;
import generatorMetamodels.Level;
import generatorMetamodels.RoomType;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>High Level Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generatorMetamodels.impl.HighLevelActivityImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link generatorMetamodels.impl.HighLevelActivityImpl#getNumberOfQuestions <em>Number Of Questions</em>}</li>
 *   <li>{@link generatorMetamodels.impl.HighLevelActivityImpl#getGamingobjective <em>Gamingobjective</em>}</li>
 *   <li>{@link generatorMetamodels.impl.HighLevelActivityImpl#getSelectedMode <em>Selected Mode</em>}</li>
 *   <li>{@link generatorMetamodels.impl.HighLevelActivityImpl#getRoomTypesByPercentage <em>Room Types By Percentage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HighLevelActivityImpl extends MinimalEObjectImpl.Container implements HighLevelActivity {
	/**
	 * The cached value of the '{@link #getLevel() <em>Level</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected Level level;

	/**
	 * The default value of the '{@link #getNumberOfQuestions() <em>Number Of Questions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfQuestions()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_QUESTIONS_EDEFAULT = 10;

	/**
	 * The cached value of the '{@link #getNumberOfQuestions() <em>Number Of Questions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfQuestions()
	 * @generated
	 * @ordered
	 */
	protected int numberOfQuestions = NUMBER_OF_QUESTIONS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGamingobjective() <em>Gamingobjective</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGamingobjective()
	 * @generated
	 * @ordered
	 */
	protected GamingObjective gamingobjective;

	/**
	 * The default value of the '{@link #getSelectedMode() <em>Selected Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectedMode()
	 * @generated
	 * @ordered
	 */
	protected static final GameMode SELECTED_MODE_EDEFAULT = GameMode.NONE;

	/**
	 * The cached value of the '{@link #getSelectedMode() <em>Selected Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectedMode()
	 * @generated
	 * @ordered
	 */
	protected GameMode selectedMode = SELECTED_MODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRoomTypesByPercentage() <em>Room Types By Percentage</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomTypesByPercentage()
	 * @generated
	 * @ordered
	 */
	protected EMap<RoomType, Integer> roomTypesByPercentage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HighLevelActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorMetamodelsPackage.Literals.HIGH_LEVEL_ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Level getLevel() {
		if (level != null && level.eIsProxy()) {
			InternalEObject oldLevel = (InternalEObject) level;
			level = (Level) eResolveProxy(oldLevel);
			if (level != oldLevel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							GeneratorMetamodelsPackage.HIGH_LEVEL_ACTIVITY__LEVEL, oldLevel, level));
			}
		}
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Level basicGetLevel() {
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel(Level newLevel) {
		Level oldLevel = level;
		level = newLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorMetamodelsPackage.HIGH_LEVEL_ACTIVITY__LEVEL,
					oldLevel, level));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfQuestions() {
		return numberOfQuestions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfQuestions(int newNumberOfQuestions) {
		int oldNumberOfQuestions = numberOfQuestions;
		numberOfQuestions = newNumberOfQuestions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GeneratorMetamodelsPackage.HIGH_LEVEL_ACTIVITY__NUMBER_OF_QUESTIONS, oldNumberOfQuestions,
					numberOfQuestions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GamingObjective getGamingobjective() {
		if (gamingobjective != null && gamingobjective.eIsProxy()) {
			InternalEObject oldGamingobjective = (InternalEObject) gamingobjective;
			gamingobjective = (GamingObjective) eResolveProxy(oldGamingobjective);
			if (gamingobjective != oldGamingobjective) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							GeneratorMetamodelsPackage.HIGH_LEVEL_ACTIVITY__GAMINGOBJECTIVE, oldGamingobjective,
							gamingobjective));
			}
		}
		return gamingobjective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GamingObjective basicGetGamingobjective() {
		return gamingobjective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGamingobjective(GamingObjective newGamingobjective) {
		GamingObjective oldGamingobjective = gamingobjective;
		gamingobjective = newGamingobjective;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GeneratorMetamodelsPackage.HIGH_LEVEL_ACTIVITY__GAMINGOBJECTIVE, oldGamingobjective,
					gamingobjective));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GameMode getSelectedMode() {
		return selectedMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectedMode(GameMode newSelectedMode) {
		GameMode oldSelectedMode = selectedMode;
		selectedMode = newSelectedMode == null ? SELECTED_MODE_EDEFAULT : newSelectedMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GeneratorMetamodelsPackage.HIGH_LEVEL_ACTIVITY__SELECTED_MODE, oldSelectedMode, selectedMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<RoomType, Integer> getRoomTypesByPercentage() {
		if (roomTypesByPercentage == null) {
			roomTypesByPercentage = new EcoreEMap<RoomType, Integer>(
					GeneratorMetamodelsPackage.Literals.ROOM_TYPE_TO_EINT_MAP, RoomTypeToEIntMapImpl.class, this,
					GeneratorMetamodelsPackage.HIGH_LEVEL_ACTIVITY__ROOM_TYPES_BY_PERCENTAGE);
		}
		return roomTypesByPercentage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addRoomPercentage(Map.Entry<RoomType, Integer> entry) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GeneratorMetamodelsPackage.HIGH_LEVEL_ACTIVITY__ROOM_TYPES_BY_PERCENTAGE:
			return ((InternalEList<?>) getRoomTypesByPercentage()).basicRemove(otherEnd, msgs);
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
		case GeneratorMetamodelsPackage.HIGH_LEVEL_ACTIVITY__LEVEL:
			if (resolve)
				return getLevel();
			return basicGetLevel();
		case GeneratorMetamodelsPackage.HIGH_LEVEL_ACTIVITY__NUMBER_OF_QUESTIONS:
			return getNumberOfQuestions();
		case GeneratorMetamodelsPackage.HIGH_LEVEL_ACTIVITY__GAMINGOBJECTIVE:
			if (resolve)
				return getGamingobjective();
			return basicGetGamingobjective();
		case GeneratorMetamodelsPackage.HIGH_LEVEL_ACTIVITY__SELECTED_MODE:
			return getSelectedMode();
		case GeneratorMetamodelsPackage.HIGH_LEVEL_ACTIVITY__ROOM_TYPES_BY_PERCENTAGE:
			if (coreType)
				return getRoomTypesByPercentage();
			else
				return getRoomTypesByPercentage().map();
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
		case GeneratorMetamodelsPackage.HIGH_LEVEL_ACTIVITY__LEVEL:
			setLevel((Level) newValue);
			return;
		case GeneratorMetamodelsPackage.HIGH_LEVEL_ACTIVITY__NUMBER_OF_QUESTIONS:
			setNumberOfQuestions((Integer) newValue);
			return;
		case GeneratorMetamodelsPackage.HIGH_LEVEL_ACTIVITY__GAMINGOBJECTIVE:
			setGamingobjective((GamingObjective) newValue);
			return;
		case GeneratorMetamodelsPackage.HIGH_LEVEL_ACTIVITY__SELECTED_MODE:
			setSelectedMode((GameMode) newValue);
			return;
		case GeneratorMetamodelsPackage.HIGH_LEVEL_ACTIVITY__ROOM_TYPES_BY_PERCENTAGE:
			((EStructuralFeature.Setting) getRoomTypesByPercentage()).set(newValue);
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
		case GeneratorMetamodelsPackage.HIGH_LEVEL_ACTIVITY__LEVEL:
			setLevel((Level) null);
			return;
		case GeneratorMetamodelsPackage.HIGH_LEVEL_ACTIVITY__NUMBER_OF_QUESTIONS:
			setNumberOfQuestions(NUMBER_OF_QUESTIONS_EDEFAULT);
			return;
		case GeneratorMetamodelsPackage.HIGH_LEVEL_ACTIVITY__GAMINGOBJECTIVE:
			setGamingobjective((GamingObjective) null);
			return;
		case GeneratorMetamodelsPackage.HIGH_LEVEL_ACTIVITY__SELECTED_MODE:
			setSelectedMode(SELECTED_MODE_EDEFAULT);
			return;
		case GeneratorMetamodelsPackage.HIGH_LEVEL_ACTIVITY__ROOM_TYPES_BY_PERCENTAGE:
			getRoomTypesByPercentage().clear();
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
		case GeneratorMetamodelsPackage.HIGH_LEVEL_ACTIVITY__LEVEL:
			return level != null;
		case GeneratorMetamodelsPackage.HIGH_LEVEL_ACTIVITY__NUMBER_OF_QUESTIONS:
			return numberOfQuestions != NUMBER_OF_QUESTIONS_EDEFAULT;
		case GeneratorMetamodelsPackage.HIGH_LEVEL_ACTIVITY__GAMINGOBJECTIVE:
			return gamingobjective != null;
		case GeneratorMetamodelsPackage.HIGH_LEVEL_ACTIVITY__SELECTED_MODE:
			return selectedMode != SELECTED_MODE_EDEFAULT;
		case GeneratorMetamodelsPackage.HIGH_LEVEL_ACTIVITY__ROOM_TYPES_BY_PERCENTAGE:
			return roomTypesByPercentage != null && !roomTypesByPercentage.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case GeneratorMetamodelsPackage.HIGH_LEVEL_ACTIVITY___ADD_ROOM_PERCENTAGE__EMAP:
			addRoomPercentage((Map.Entry<RoomType, Integer>) arguments.get(0));
			return null;
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
		result.append(" (numberOfQuestions: ");
		result.append(numberOfQuestions);
		result.append(", selectedMode: ");
		result.append(selectedMode);
		result.append(')');
		return result.toString();
	}

} //HighLevelActivityImpl
