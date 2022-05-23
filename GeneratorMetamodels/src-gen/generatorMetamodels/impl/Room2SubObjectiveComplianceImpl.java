/**
 */
package generatorMetamodels.impl;

import generatorMetamodels.GeneratorMetamodelsPackage;
import generatorMetamodels.Room2SubObjectiveCompliance;
import generatorMetamodels.RoomType;
import generatorMetamodels.SubObjectiveType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room2 Sub Objective Compliance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generatorMetamodels.impl.Room2SubObjectiveComplianceImpl#getRoomType <em>Room Type</em>}</li>
 *   <li>{@link generatorMetamodels.impl.Room2SubObjectiveComplianceImpl#getSubObjType <em>Sub Obj Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Room2SubObjectiveComplianceImpl extends SemanticRelationImpl implements Room2SubObjectiveCompliance {
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
	 * The default value of the '{@link #getSubObjType() <em>Sub Obj Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubObjType()
	 * @generated
	 * @ordered
	 */
	protected static final SubObjectiveType SUB_OBJ_TYPE_EDEFAULT = SubObjectiveType.COMPLETION1;

	/**
	 * The cached value of the '{@link #getSubObjType() <em>Sub Obj Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubObjType()
	 * @generated
	 * @ordered
	 */
	protected SubObjectiveType subObjType = SUB_OBJ_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Room2SubObjectiveComplianceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorMetamodelsPackage.Literals.ROOM2_SUB_OBJECTIVE_COMPLIANCE;
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
					GeneratorMetamodelsPackage.ROOM2_SUB_OBJECTIVE_COMPLIANCE__ROOM_TYPE, oldRoomType, roomType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubObjectiveType getSubObjType() {
		return subObjType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubObjType(SubObjectiveType newSubObjType) {
		SubObjectiveType oldSubObjType = subObjType;
		subObjType = newSubObjType == null ? SUB_OBJ_TYPE_EDEFAULT : newSubObjType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GeneratorMetamodelsPackage.ROOM2_SUB_OBJECTIVE_COMPLIANCE__SUB_OBJ_TYPE, oldSubObjType,
					subObjType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GeneratorMetamodelsPackage.ROOM2_SUB_OBJECTIVE_COMPLIANCE__ROOM_TYPE:
			return getRoomType();
		case GeneratorMetamodelsPackage.ROOM2_SUB_OBJECTIVE_COMPLIANCE__SUB_OBJ_TYPE:
			return getSubObjType();
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
		case GeneratorMetamodelsPackage.ROOM2_SUB_OBJECTIVE_COMPLIANCE__ROOM_TYPE:
			setRoomType((RoomType) newValue);
			return;
		case GeneratorMetamodelsPackage.ROOM2_SUB_OBJECTIVE_COMPLIANCE__SUB_OBJ_TYPE:
			setSubObjType((SubObjectiveType) newValue);
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
		case GeneratorMetamodelsPackage.ROOM2_SUB_OBJECTIVE_COMPLIANCE__ROOM_TYPE:
			setRoomType(ROOM_TYPE_EDEFAULT);
			return;
		case GeneratorMetamodelsPackage.ROOM2_SUB_OBJECTIVE_COMPLIANCE__SUB_OBJ_TYPE:
			setSubObjType(SUB_OBJ_TYPE_EDEFAULT);
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
		case GeneratorMetamodelsPackage.ROOM2_SUB_OBJECTIVE_COMPLIANCE__ROOM_TYPE:
			return roomType != ROOM_TYPE_EDEFAULT;
		case GeneratorMetamodelsPackage.ROOM2_SUB_OBJECTIVE_COMPLIANCE__SUB_OBJ_TYPE:
			return subObjType != SUB_OBJ_TYPE_EDEFAULT;
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
		result.append(", subObjType: ");
		result.append(subObjType);
		result.append(')');
		return result.toString();
	}

} //Room2SubObjectiveComplianceImpl
