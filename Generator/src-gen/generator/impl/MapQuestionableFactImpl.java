/**
 */
package generator.impl;

import generator.EGeographyValue;
import generator.GeneratorPackage;
import generator.Map;
import generator.MapQuestionableFact;
import generator.MapSolution;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Map Questionable Fact</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.MapQuestionableFactImpl#getMap <em>Map</em>}</li>
 *   <li>{@link generator.impl.MapQuestionableFactImpl#getMapsolutions <em>Mapsolutions</em>}</li>
 *   <li>{@link generator.impl.MapQuestionableFactImpl#getType <em>Type</em>}</li>
 *   <li>{@link generator.impl.MapQuestionableFactImpl#getConsigne <em>Consigne</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MapQuestionableFactImpl extends AQuestionableFactImpl implements MapQuestionableFact {
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
	 * The cached value of the '{@link #getMapsolutions() <em>Mapsolutions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapsolutions()
	 * @generated
	 * @ordered
	 */
	protected EList<MapSolution> mapsolutions;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final EGeographyValue TYPE_EDEFAULT = EGeographyValue.NONE;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EGeographyValue type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getConsigne() <em>Consigne</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsigne()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSIGNE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConsigne() <em>Consigne</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsigne()
	 * @generated
	 * @ordered
	 */
	protected String consigne = CONSIGNE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapQuestionableFactImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.MAP_QUESTIONABLE_FACT;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							GeneratorPackage.MAP_QUESTIONABLE_FACT__MAP, oldMap, map));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.MAP_QUESTIONABLE_FACT__MAP, oldMap,
					map));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MapSolution> getMapsolutions() {
		if (mapsolutions == null) {
			mapsolutions = new EObjectContainmentEList<MapSolution>(MapSolution.class, this,
					GeneratorPackage.MAP_QUESTIONABLE_FACT__MAPSOLUTIONS);
		}
		return mapsolutions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EGeographyValue getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(EGeographyValue newType) {
		EGeographyValue oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.MAP_QUESTIONABLE_FACT__TYPE, oldType,
					type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConsigne() {
		return consigne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConsigne(String newConsigne) {
		String oldConsigne = consigne;
		consigne = newConsigne;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.MAP_QUESTIONABLE_FACT__CONSIGNE,
					oldConsigne, consigne));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GeneratorPackage.MAP_QUESTIONABLE_FACT__MAPSOLUTIONS:
			return ((InternalEList<?>) getMapsolutions()).basicRemove(otherEnd, msgs);
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
		case GeneratorPackage.MAP_QUESTIONABLE_FACT__MAP:
			if (resolve)
				return getMap();
			return basicGetMap();
		case GeneratorPackage.MAP_QUESTIONABLE_FACT__MAPSOLUTIONS:
			return getMapsolutions();
		case GeneratorPackage.MAP_QUESTIONABLE_FACT__TYPE:
			return getType();
		case GeneratorPackage.MAP_QUESTIONABLE_FACT__CONSIGNE:
			return getConsigne();
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
		case GeneratorPackage.MAP_QUESTIONABLE_FACT__MAP:
			setMap((Map) newValue);
			return;
		case GeneratorPackage.MAP_QUESTIONABLE_FACT__MAPSOLUTIONS:
			getMapsolutions().clear();
			getMapsolutions().addAll((Collection<? extends MapSolution>) newValue);
			return;
		case GeneratorPackage.MAP_QUESTIONABLE_FACT__TYPE:
			setType((EGeographyValue) newValue);
			return;
		case GeneratorPackage.MAP_QUESTIONABLE_FACT__CONSIGNE:
			setConsigne((String) newValue);
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
		case GeneratorPackage.MAP_QUESTIONABLE_FACT__MAP:
			setMap((Map) null);
			return;
		case GeneratorPackage.MAP_QUESTIONABLE_FACT__MAPSOLUTIONS:
			getMapsolutions().clear();
			return;
		case GeneratorPackage.MAP_QUESTIONABLE_FACT__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case GeneratorPackage.MAP_QUESTIONABLE_FACT__CONSIGNE:
			setConsigne(CONSIGNE_EDEFAULT);
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
		case GeneratorPackage.MAP_QUESTIONABLE_FACT__MAP:
			return map != null;
		case GeneratorPackage.MAP_QUESTIONABLE_FACT__MAPSOLUTIONS:
			return mapsolutions != null && !mapsolutions.isEmpty();
		case GeneratorPackage.MAP_QUESTIONABLE_FACT__TYPE:
			return type != TYPE_EDEFAULT;
		case GeneratorPackage.MAP_QUESTIONABLE_FACT__CONSIGNE:
			return CONSIGNE_EDEFAULT == null ? consigne != null : !CONSIGNE_EDEFAULT.equals(consigne);
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
		result.append(" (type: ");
		result.append(type);
		result.append(", consigne: ");
		result.append(consigne);
		result.append(')');
		return result.toString();
	}

} //MapQuestionableFactImpl
