/**
 */
package generator.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import generator.Directions;
import generator.GeneratorPackage;
import generator.RoomAccess;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room Access</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.RoomAccessImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link generator.impl.RoomAccessImpl#getOtherroomaccess <em>Otherroomaccess</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoomAccessImpl extends MinimalEObjectImpl.Container implements RoomAccess {
	/**
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final Directions DIRECTION_EDEFAULT = Directions.SOUTH;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected Directions direction = DIRECTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOtherroomaccess() <em>Otherroomaccess</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherroomaccess()
	 * @generated
	 * @ordered
	 */
	protected RoomAccess otherroomaccess;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomAccessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.ROOM_ACCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Directions getDirection() {
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirection(Directions newDirection) {
		Directions oldDirection = direction;
		direction = newDirection == null ? DIRECTION_EDEFAULT : newDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.ROOM_ACCESS__DIRECTION, oldDirection,
					direction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomAccess getOtherroomaccess() {
		if (otherroomaccess != null && otherroomaccess.eIsProxy()) {
			InternalEObject oldOtherroomaccess = (InternalEObject) otherroomaccess;
			otherroomaccess = (RoomAccess) eResolveProxy(oldOtherroomaccess);
			if (otherroomaccess != oldOtherroomaccess) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							GeneratorPackage.ROOM_ACCESS__OTHERROOMACCESS, oldOtherroomaccess, otherroomaccess));
			}
		}
		return otherroomaccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomAccess basicGetOtherroomaccess() {
		return otherroomaccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOtherroomaccess(RoomAccess newOtherroomaccess) {
		RoomAccess oldOtherroomaccess = otherroomaccess;
		otherroomaccess = newOtherroomaccess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.ROOM_ACCESS__OTHERROOMACCESS,
					oldOtherroomaccess, otherroomaccess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GeneratorPackage.ROOM_ACCESS__DIRECTION:
			return getDirection();
		case GeneratorPackage.ROOM_ACCESS__OTHERROOMACCESS:
			if (resolve)
				return getOtherroomaccess();
			return basicGetOtherroomaccess();
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
		case GeneratorPackage.ROOM_ACCESS__DIRECTION:
			setDirection((Directions) newValue);
			return;
		case GeneratorPackage.ROOM_ACCESS__OTHERROOMACCESS:
			setOtherroomaccess((RoomAccess) newValue);
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
		case GeneratorPackage.ROOM_ACCESS__DIRECTION:
			setDirection(DIRECTION_EDEFAULT);
			return;
		case GeneratorPackage.ROOM_ACCESS__OTHERROOMACCESS:
			setOtherroomaccess((RoomAccess) null);
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
		case GeneratorPackage.ROOM_ACCESS__DIRECTION:
			return direction != DIRECTION_EDEFAULT;
		case GeneratorPackage.ROOM_ACCESS__OTHERROOMACCESS:
			return otherroomaccess != null;
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
		result.append(" (direction: ");
		result.append(direction);
		result.append(')');
		return result.toString();
	}

} //RoomAccessImpl
