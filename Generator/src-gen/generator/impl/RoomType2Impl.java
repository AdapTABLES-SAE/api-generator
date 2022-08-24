/**
 */
package generator.impl;

import generator.Floor;
import generator.GeneratorPackage;
import generator.RoomPaths;
import generator.RoomType2;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room Type2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.RoomType2Impl#getDescription <em>Description</em>}</li>
 *   <li>{@link generator.impl.RoomType2Impl#getAcceptedfloors <em>Acceptedfloors</em>}</li>
 *   <li>{@link generator.impl.RoomType2Impl#getPaths <em>Paths</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoomType2Impl extends MinimalEObjectImpl.Container implements RoomType2 {
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAcceptedfloors() <em>Acceptedfloors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcceptedfloors()
	 * @generated
	 * @ordered
	 */
	protected EList<Floor> acceptedfloors;

	/**
	 * The cached value of the '{@link #getPaths() <em>Paths</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaths()
	 * @generated
	 * @ordered
	 */
	protected EList<RoomPaths> paths;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomType2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.ROOM_TYPE2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.ROOM_TYPE2__DESCRIPTION,
					oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Floor> getAcceptedfloors() {
		if (acceptedfloors == null) {
			acceptedfloors = new EObjectResolvingEList<Floor>(Floor.class, this,
					GeneratorPackage.ROOM_TYPE2__ACCEPTEDFLOORS);
		}
		return acceptedfloors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoomPaths> getPaths() {
		if (paths == null) {
			paths = new EDataTypeUniqueEList<RoomPaths>(RoomPaths.class, this, GeneratorPackage.ROOM_TYPE2__PATHS);
		}
		return paths;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GeneratorPackage.ROOM_TYPE2__DESCRIPTION:
			return getDescription();
		case GeneratorPackage.ROOM_TYPE2__ACCEPTEDFLOORS:
			return getAcceptedfloors();
		case GeneratorPackage.ROOM_TYPE2__PATHS:
			return getPaths();
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
		case GeneratorPackage.ROOM_TYPE2__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case GeneratorPackage.ROOM_TYPE2__ACCEPTEDFLOORS:
			getAcceptedfloors().clear();
			getAcceptedfloors().addAll((Collection<? extends Floor>) newValue);
			return;
		case GeneratorPackage.ROOM_TYPE2__PATHS:
			getPaths().clear();
			getPaths().addAll((Collection<? extends RoomPaths>) newValue);
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
		case GeneratorPackage.ROOM_TYPE2__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case GeneratorPackage.ROOM_TYPE2__ACCEPTEDFLOORS:
			getAcceptedfloors().clear();
			return;
		case GeneratorPackage.ROOM_TYPE2__PATHS:
			getPaths().clear();
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
		case GeneratorPackage.ROOM_TYPE2__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case GeneratorPackage.ROOM_TYPE2__ACCEPTEDFLOORS:
			return acceptedfloors != null && !acceptedfloors.isEmpty();
		case GeneratorPackage.ROOM_TYPE2__PATHS:
			return paths != null && !paths.isEmpty();
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
		result.append(" (description: ");
		result.append(description);
		result.append(", paths: ");
		result.append(paths);
		result.append(')');
		return result.toString();
	}

} //RoomType2Impl
