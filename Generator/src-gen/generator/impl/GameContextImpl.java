/**
 */
package generator.impl;

import generator.DungeonMode;
import generator.GameContext;
import generator.GeneratorPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Game Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.GameContextImpl#getNumberOfRooms <em>Number Of Rooms</em>}</li>
 *   <li>{@link generator.impl.GameContextImpl#getMode <em>Mode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GameContextImpl extends MinimalEObjectImpl.Container implements GameContext {
	/**
	 * The default value of the '{@link #getNumberOfRooms() <em>Number Of Rooms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfRooms()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_ROOMS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfRooms() <em>Number Of Rooms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfRooms()
	 * @generated
	 * @ordered
	 */
	protected int numberOfRooms = NUMBER_OF_ROOMS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected static final DungeonMode MODE_EDEFAULT = DungeonMode.LINEAR;

	/**
	 * The cached value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected DungeonMode mode = MODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GameContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.GAME_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfRooms() {
		return numberOfRooms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfRooms(int newNumberOfRooms) {
		int oldNumberOfRooms = numberOfRooms;
		numberOfRooms = newNumberOfRooms;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.GAME_CONTEXT__NUMBER_OF_ROOMS,
					oldNumberOfRooms, numberOfRooms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DungeonMode getMode() {
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMode(DungeonMode newMode) {
		DungeonMode oldMode = mode;
		mode = newMode == null ? MODE_EDEFAULT : newMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.GAME_CONTEXT__MODE, oldMode, mode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GeneratorPackage.GAME_CONTEXT__NUMBER_OF_ROOMS:
			return getNumberOfRooms();
		case GeneratorPackage.GAME_CONTEXT__MODE:
			return getMode();
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
		case GeneratorPackage.GAME_CONTEXT__NUMBER_OF_ROOMS:
			setNumberOfRooms((Integer) newValue);
			return;
		case GeneratorPackage.GAME_CONTEXT__MODE:
			setMode((DungeonMode) newValue);
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
		case GeneratorPackage.GAME_CONTEXT__NUMBER_OF_ROOMS:
			setNumberOfRooms(NUMBER_OF_ROOMS_EDEFAULT);
			return;
		case GeneratorPackage.GAME_CONTEXT__MODE:
			setMode(MODE_EDEFAULT);
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
		case GeneratorPackage.GAME_CONTEXT__NUMBER_OF_ROOMS:
			return numberOfRooms != NUMBER_OF_ROOMS_EDEFAULT;
		case GeneratorPackage.GAME_CONTEXT__MODE:
			return mode != MODE_EDEFAULT;
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
		result.append(" (numberOfRooms: ");
		result.append(numberOfRooms);
		result.append(", mode: ");
		result.append(mode);
		result.append(')');
		return result.toString();
	}

} //GameContextImpl
