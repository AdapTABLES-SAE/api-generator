/**
 */
package generatorMetamodels.impl;

import generatorMetamodels.GeneratorMetamodelsPackage;
import generatorMetamodels.IParameter;
import generatorMetamodels.Parameter2RoomIncompliance;
import generatorMetamodels.RoomType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter2 Room Incompliance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generatorMetamodels.impl.Parameter2RoomIncomplianceImpl#getRoomType <em>Room Type</em>}</li>
 *   <li>{@link generatorMetamodels.impl.Parameter2RoomIncomplianceImpl#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Parameter2RoomIncomplianceImpl extends SemanticRelationImpl implements Parameter2RoomIncompliance {
	/**
	 * The default value of the '{@link #getRoomType() <em>Room Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomType()
	 * @generated
	 * @ordered
	 */
	protected static final RoomType ROOM_TYPE_EDEFAULT = RoomType.DOOR;

	/**
	 * The cached value of the '{@link #getRoomType() <em>Room Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomType()
	 * @generated
	 * @ordered
	 */
	protected RoomType roomType = ROOM_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected IParameter parameter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Parameter2RoomIncomplianceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorMetamodelsPackage.Literals.PARAMETER2_ROOM_INCOMPLIANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomType getRoomType() {
		return roomType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoomType(RoomType newRoomType) {
		RoomType oldRoomType = roomType;
		roomType = newRoomType == null ? ROOM_TYPE_EDEFAULT : newRoomType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GeneratorMetamodelsPackage.PARAMETER2_ROOM_INCOMPLIANCE__ROOM_TYPE, oldRoomType, roomType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IParameter getParameter() {
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameter(IParameter newParameter, NotificationChain msgs) {
		IParameter oldParameter = parameter;
		parameter = newParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GeneratorMetamodelsPackage.PARAMETER2_ROOM_INCOMPLIANCE__PARAMETER, oldParameter, newParameter);
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
	public void setParameter(IParameter newParameter) {
		if (newParameter != parameter) {
			NotificationChain msgs = null;
			if (parameter != null)
				msgs = ((InternalEObject) parameter).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GeneratorMetamodelsPackage.PARAMETER2_ROOM_INCOMPLIANCE__PARAMETER,
						null, msgs);
			if (newParameter != null)
				msgs = ((InternalEObject) newParameter).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GeneratorMetamodelsPackage.PARAMETER2_ROOM_INCOMPLIANCE__PARAMETER,
						null, msgs);
			msgs = basicSetParameter(newParameter, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GeneratorMetamodelsPackage.PARAMETER2_ROOM_INCOMPLIANCE__PARAMETER, newParameter, newParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GeneratorMetamodelsPackage.PARAMETER2_ROOM_INCOMPLIANCE__PARAMETER:
			return basicSetParameter(null, msgs);
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
		case GeneratorMetamodelsPackage.PARAMETER2_ROOM_INCOMPLIANCE__ROOM_TYPE:
			return getRoomType();
		case GeneratorMetamodelsPackage.PARAMETER2_ROOM_INCOMPLIANCE__PARAMETER:
			return getParameter();
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
		case GeneratorMetamodelsPackage.PARAMETER2_ROOM_INCOMPLIANCE__ROOM_TYPE:
			setRoomType((RoomType) newValue);
			return;
		case GeneratorMetamodelsPackage.PARAMETER2_ROOM_INCOMPLIANCE__PARAMETER:
			setParameter((IParameter) newValue);
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
		case GeneratorMetamodelsPackage.PARAMETER2_ROOM_INCOMPLIANCE__ROOM_TYPE:
			setRoomType(ROOM_TYPE_EDEFAULT);
			return;
		case GeneratorMetamodelsPackage.PARAMETER2_ROOM_INCOMPLIANCE__PARAMETER:
			setParameter((IParameter) null);
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
		case GeneratorMetamodelsPackage.PARAMETER2_ROOM_INCOMPLIANCE__ROOM_TYPE:
			return roomType != ROOM_TYPE_EDEFAULT;
		case GeneratorMetamodelsPackage.PARAMETER2_ROOM_INCOMPLIANCE__PARAMETER:
			return parameter != null;
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
		result.append(" (roomType: ");
		result.append(roomType);
		result.append(')');
		return result.toString();
	}

} //Parameter2RoomIncomplianceImpl
