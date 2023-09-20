/**
 */
package generator.impl;

import generator.GeneratorPackage;
import generator.Map;
import generator.MapQuestionParam;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Map Question Param</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.MapQuestionParamImpl#getMap <em>Map</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MapQuestionParamImpl extends AQuestionParamImpl implements MapQuestionParam {
	/**
	 * The cached value of the '{@link #getMap() <em>Map</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMap()
	 * @generated
	 * @ordered
	 */
	protected Map map;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapQuestionParamImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.MAP_QUESTION_PARAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map getMap() {
		if (map != null && map.eIsProxy()) {
			InternalEObject oldMap = (InternalEObject) map;
			map = (Map) eResolveProxy(oldMap);
			if (map != oldMap) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GeneratorPackage.MAP_QUESTION_PARAM__MAP,
							oldMap, map));
			}
		}
		return map;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map basicGetMap() {
		return map;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMap(Map newMap) {
		Map oldMap = map;
		map = newMap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.MAP_QUESTION_PARAM__MAP, oldMap,
					map));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GeneratorPackage.MAP_QUESTION_PARAM__MAP:
			if (resolve)
				return getMap();
			return basicGetMap();
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
		case GeneratorPackage.MAP_QUESTION_PARAM__MAP:
			setMap((Map) newValue);
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
		case GeneratorPackage.MAP_QUESTION_PARAM__MAP:
			setMap((Map) null);
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
		case GeneratorPackage.MAP_QUESTION_PARAM__MAP:
			return map != null;
		}
		return super.eIsSet(featureID);
	}

} //MapQuestionParamImpl
