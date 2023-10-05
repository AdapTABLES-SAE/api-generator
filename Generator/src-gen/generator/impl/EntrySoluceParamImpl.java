/**
 */
package generator.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import generator.ECorrectness;
import generator.EntrySoluceParam;
import generator.GeneratorPackage;
import generator.MapValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entry Soluce Param</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.EntrySoluceParamImpl#getState <em>State</em>}</li>
 *   <li>{@link generator.impl.EntrySoluceParamImpl#getMapValue <em>Map Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntrySoluceParamImpl extends ParameterImpl implements EntrySoluceParam {
	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final ECorrectness STATE_EDEFAULT = ECorrectness.CORRECT;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected ECorrectness state = STATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMapValue() <em>Map Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapValue()
	 * @generated
	 * @ordered
	 */
	protected MapValue mapValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntrySoluceParamImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.ENTRY_SOLUCE_PARAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ECorrectness getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(ECorrectness newState) {
		ECorrectness oldState = state;
		state = newState == null ? STATE_EDEFAULT : newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.ENTRY_SOLUCE_PARAM__STATE, oldState,
					state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapValue getMapValue() {
		return mapValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMapValue(MapValue newMapValue, NotificationChain msgs) {
		MapValue oldMapValue = mapValue;
		mapValue = newMapValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.ENTRY_SOLUCE_PARAM__MAP_VALUE, oldMapValue, newMapValue);
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
	public void setMapValue(MapValue newMapValue) {
		if (newMapValue != mapValue) {
			NotificationChain msgs = null;
			if (mapValue != null)
				msgs = ((InternalEObject) mapValue).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.ENTRY_SOLUCE_PARAM__MAP_VALUE, null, msgs);
			if (newMapValue != null)
				msgs = ((InternalEObject) newMapValue).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.ENTRY_SOLUCE_PARAM__MAP_VALUE, null, msgs);
			msgs = basicSetMapValue(newMapValue, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.ENTRY_SOLUCE_PARAM__MAP_VALUE,
					newMapValue, newMapValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GeneratorPackage.ENTRY_SOLUCE_PARAM__MAP_VALUE:
			return basicSetMapValue(null, msgs);
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
		case GeneratorPackage.ENTRY_SOLUCE_PARAM__STATE:
			return getState();
		case GeneratorPackage.ENTRY_SOLUCE_PARAM__MAP_VALUE:
			return getMapValue();
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
		case GeneratorPackage.ENTRY_SOLUCE_PARAM__STATE:
			setState((ECorrectness) newValue);
			return;
		case GeneratorPackage.ENTRY_SOLUCE_PARAM__MAP_VALUE:
			setMapValue((MapValue) newValue);
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
		case GeneratorPackage.ENTRY_SOLUCE_PARAM__STATE:
			setState(STATE_EDEFAULT);
			return;
		case GeneratorPackage.ENTRY_SOLUCE_PARAM__MAP_VALUE:
			setMapValue((MapValue) null);
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
		case GeneratorPackage.ENTRY_SOLUCE_PARAM__STATE:
			return state != STATE_EDEFAULT;
		case GeneratorPackage.ENTRY_SOLUCE_PARAM__MAP_VALUE:
			return mapValue != null;
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
		result.append(" (state: ");
		result.append(state);
		result.append(')');
		return result.toString();
	}

} //EntrySoluceParamImpl
