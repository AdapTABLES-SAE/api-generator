/**
 */
package generator.impl;

import generator.Directions;
import generator.GeneratorPackage;
import generator.SmallRoomType;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Small Room Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.SmallRoomTypeImpl#getDirections <em>Directions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SmallRoomTypeImpl extends RoomTypeImpl implements SmallRoomType {
	/**
	 * The cached value of the '{@link #getDirections() <em>Directions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirections()
	 * @generated
	 * @ordered
	 */
	protected EList<Directions> directions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmallRoomTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.SMALL_ROOM_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Directions> getDirections() {
		if (directions == null) {
			directions = new EDataTypeUniqueEList<Directions>(Directions.class, this,
					GeneratorPackage.SMALL_ROOM_TYPE__DIRECTIONS);
		}
		return directions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GeneratorPackage.SMALL_ROOM_TYPE__DIRECTIONS:
			return getDirections();
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
		case GeneratorPackage.SMALL_ROOM_TYPE__DIRECTIONS:
			getDirections().clear();
			getDirections().addAll((Collection<? extends Directions>) newValue);
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
		case GeneratorPackage.SMALL_ROOM_TYPE__DIRECTIONS:
			getDirections().clear();
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
		case GeneratorPackage.SMALL_ROOM_TYPE__DIRECTIONS:
			return directions != null && !directions.isEmpty();
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
		result.append(" (directions: ");
		result.append(directions);
		result.append(')');
		return result.toString();
	}

} //SmallRoomTypeImpl
