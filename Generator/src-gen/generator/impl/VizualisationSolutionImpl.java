/**
 */
package generator.impl;

import generator.GeneratorPackage;
import generator.VizualisationPosition;
import generator.VizualisationSolution;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vizualisation Solution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.VizualisationSolutionImpl#getValue <em>Value</em>}</li>
 *   <li>{@link generator.impl.VizualisationSolutionImpl#getVizualisationPosition <em>Vizualisation Position</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VizualisationSolutionImpl extends MinimalEObjectImpl.Container implements VizualisationSolution {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVizualisationPosition() <em>Vizualisation Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVizualisationPosition()
	 * @generated
	 * @ordered
	 */
	protected VizualisationPosition vizualisationPosition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VizualisationSolutionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.VIZUALISATION_SOLUTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.VIZUALISATION_SOLUTION__VALUE,
					oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VizualisationPosition getVizualisationPosition() {
		if (vizualisationPosition != null && vizualisationPosition.eIsProxy()) {
			InternalEObject oldVizualisationPosition = (InternalEObject) vizualisationPosition;
			vizualisationPosition = (VizualisationPosition) eResolveProxy(oldVizualisationPosition);
			if (vizualisationPosition != oldVizualisationPosition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							GeneratorPackage.VIZUALISATION_SOLUTION__VIZUALISATION_POSITION, oldVizualisationPosition,
							vizualisationPosition));
			}
		}
		return vizualisationPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VizualisationPosition basicGetVizualisationPosition() {
		return vizualisationPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVizualisationPosition(VizualisationPosition newVizualisationPosition) {
		VizualisationPosition oldVizualisationPosition = vizualisationPosition;
		vizualisationPosition = newVizualisationPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.VIZUALISATION_SOLUTION__VIZUALISATION_POSITION, oldVizualisationPosition,
					vizualisationPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GeneratorPackage.VIZUALISATION_SOLUTION__VALUE:
			return getValue();
		case GeneratorPackage.VIZUALISATION_SOLUTION__VIZUALISATION_POSITION:
			if (resolve)
				return getVizualisationPosition();
			return basicGetVizualisationPosition();
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
		case GeneratorPackage.VIZUALISATION_SOLUTION__VALUE:
			setValue((String) newValue);
			return;
		case GeneratorPackage.VIZUALISATION_SOLUTION__VIZUALISATION_POSITION:
			setVizualisationPosition((VizualisationPosition) newValue);
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
		case GeneratorPackage.VIZUALISATION_SOLUTION__VALUE:
			setValue(VALUE_EDEFAULT);
			return;
		case GeneratorPackage.VIZUALISATION_SOLUTION__VIZUALISATION_POSITION:
			setVizualisationPosition((VizualisationPosition) null);
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
		case GeneratorPackage.VIZUALISATION_SOLUTION__VALUE:
			return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
		case GeneratorPackage.VIZUALISATION_SOLUTION__VIZUALISATION_POSITION:
			return vizualisationPosition != null;
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
		result.append(" (value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //VizualisationSolutionImpl
