/**
 */
package generator.impl;

import generator.GeneratorPackage;
import generator.Modality2RoomType;
import generator.ResponseModality;
import generator.RoomType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modality2 Room Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.Modality2RoomTypeImpl#getResponsemodality <em>Responsemodality</em>}</li>
 *   <li>{@link generator.impl.Modality2RoomTypeImpl#getRoomtype <em>Roomtype</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Modality2RoomTypeImpl extends ComplianceRelationsImpl implements Modality2RoomType {
	/**
	 * The cached value of the '{@link #getResponsemodality() <em>Responsemodality</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsemodality()
	 * @generated
	 * @ordered
	 */
	protected ResponseModality responsemodality;

	/**
	 * The cached value of the '{@link #getRoomtype() <em>Roomtype</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomtype()
	 * @generated
	 * @ordered
	 */
	protected EList<RoomType> roomtype;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Modality2RoomTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.MODALITY2_ROOM_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseModality getResponsemodality() {
		if (responsemodality != null && responsemodality.eIsProxy()) {
			InternalEObject oldResponsemodality = (InternalEObject) responsemodality;
			responsemodality = (ResponseModality) eResolveProxy(oldResponsemodality);
			if (responsemodality != oldResponsemodality) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							GeneratorPackage.MODALITY2_ROOM_TYPE__RESPONSEMODALITY, oldResponsemodality,
							responsemodality));
			}
		}
		return responsemodality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseModality basicGetResponsemodality() {
		return responsemodality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponsemodality(ResponseModality newResponsemodality) {
		ResponseModality oldResponsemodality = responsemodality;
		responsemodality = newResponsemodality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.MODALITY2_ROOM_TYPE__RESPONSEMODALITY, oldResponsemodality, responsemodality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoomType> getRoomtype() {
		if (roomtype == null) {
			roomtype = new EObjectResolvingEList<RoomType>(RoomType.class, this,
					GeneratorPackage.MODALITY2_ROOM_TYPE__ROOMTYPE);
		}
		return roomtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GeneratorPackage.MODALITY2_ROOM_TYPE__RESPONSEMODALITY:
			if (resolve)
				return getResponsemodality();
			return basicGetResponsemodality();
		case GeneratorPackage.MODALITY2_ROOM_TYPE__ROOMTYPE:
			return getRoomtype();
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
		case GeneratorPackage.MODALITY2_ROOM_TYPE__RESPONSEMODALITY:
			setResponsemodality((ResponseModality) newValue);
			return;
		case GeneratorPackage.MODALITY2_ROOM_TYPE__ROOMTYPE:
			getRoomtype().clear();
			getRoomtype().addAll((Collection<? extends RoomType>) newValue);
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
		case GeneratorPackage.MODALITY2_ROOM_TYPE__RESPONSEMODALITY:
			setResponsemodality((ResponseModality) null);
			return;
		case GeneratorPackage.MODALITY2_ROOM_TYPE__ROOMTYPE:
			getRoomtype().clear();
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
		case GeneratorPackage.MODALITY2_ROOM_TYPE__RESPONSEMODALITY:
			return responsemodality != null;
		case GeneratorPackage.MODALITY2_ROOM_TYPE__ROOMTYPE:
			return roomtype != null && !roomtype.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Modality2RoomTypeImpl
