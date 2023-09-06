/**
 */
package generator.impl;

import generator.GeneratorPackage;
import generator.Level;
import generator.Prerequisite;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Prerequisite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.PrerequisiteImpl#getSuccessPercent <em>Success Percent</em>}</li>
 *   <li>{@link generator.impl.PrerequisiteImpl#getRequiredLevel <em>Required Level</em>}</li>
 *   <li>{@link generator.impl.PrerequisiteImpl#getEncountersPercent <em>Encounters Percent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrerequisiteImpl extends MinimalEObjectImpl.Container implements Prerequisite {
	/**
	 * The default value of the '{@link #getSuccessPercent() <em>Success Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccessPercent()
	 * @generated
	 * @ordered
	 */
	protected static final double SUCCESS_PERCENT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSuccessPercent() <em>Success Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccessPercent()
	 * @generated
	 * @ordered
	 */
	protected double successPercent = SUCCESS_PERCENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRequiredLevel() <em>Required Level</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredLevel()
	 * @generated
	 * @ordered
	 */
	protected Level requiredLevel;

	/**
	 * The default value of the '{@link #getEncountersPercent() <em>Encounters Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncountersPercent()
	 * @generated
	 * @ordered
	 */
	protected static final double ENCOUNTERS_PERCENT_EDEFAULT = 100.0;

	/**
	 * The cached value of the '{@link #getEncountersPercent() <em>Encounters Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncountersPercent()
	 * @generated
	 * @ordered
	 */
	protected double encountersPercent = ENCOUNTERS_PERCENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrerequisiteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.PREREQUISITE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSuccessPercent() {
		return successPercent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuccessPercent(double newSuccessPercent) {
		double oldSuccessPercent = successPercent;
		successPercent = newSuccessPercent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.PREREQUISITE__SUCCESS_PERCENT,
					oldSuccessPercent, successPercent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Level getRequiredLevel() {
		if (requiredLevel != null && requiredLevel.eIsProxy()) {
			InternalEObject oldRequiredLevel = (InternalEObject) requiredLevel;
			requiredLevel = (Level) eResolveProxy(oldRequiredLevel);
			if (requiredLevel != oldRequiredLevel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							GeneratorPackage.PREREQUISITE__REQUIRED_LEVEL, oldRequiredLevel, requiredLevel));
			}
		}
		return requiredLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Level basicGetRequiredLevel() {
		return requiredLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredLevel(Level newRequiredLevel) {
		Level oldRequiredLevel = requiredLevel;
		requiredLevel = newRequiredLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.PREREQUISITE__REQUIRED_LEVEL,
					oldRequiredLevel, requiredLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getEncountersPercent() {
		return encountersPercent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEncountersPercent(double newEncountersPercent) {
		double oldEncountersPercent = encountersPercent;
		encountersPercent = newEncountersPercent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.PREREQUISITE__ENCOUNTERS_PERCENT,
					oldEncountersPercent, encountersPercent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GeneratorPackage.PREREQUISITE__SUCCESS_PERCENT:
			return getSuccessPercent();
		case GeneratorPackage.PREREQUISITE__REQUIRED_LEVEL:
			if (resolve)
				return getRequiredLevel();
			return basicGetRequiredLevel();
		case GeneratorPackage.PREREQUISITE__ENCOUNTERS_PERCENT:
			return getEncountersPercent();
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
		case GeneratorPackage.PREREQUISITE__SUCCESS_PERCENT:
			setSuccessPercent((Double) newValue);
			return;
		case GeneratorPackage.PREREQUISITE__REQUIRED_LEVEL:
			setRequiredLevel((Level) newValue);
			return;
		case GeneratorPackage.PREREQUISITE__ENCOUNTERS_PERCENT:
			setEncountersPercent((Double) newValue);
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
		case GeneratorPackage.PREREQUISITE__SUCCESS_PERCENT:
			setSuccessPercent(SUCCESS_PERCENT_EDEFAULT);
			return;
		case GeneratorPackage.PREREQUISITE__REQUIRED_LEVEL:
			setRequiredLevel((Level) null);
			return;
		case GeneratorPackage.PREREQUISITE__ENCOUNTERS_PERCENT:
			setEncountersPercent(ENCOUNTERS_PERCENT_EDEFAULT);
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
		case GeneratorPackage.PREREQUISITE__SUCCESS_PERCENT:
			return successPercent != SUCCESS_PERCENT_EDEFAULT;
		case GeneratorPackage.PREREQUISITE__REQUIRED_LEVEL:
			return requiredLevel != null;
		case GeneratorPackage.PREREQUISITE__ENCOUNTERS_PERCENT:
			return encountersPercent != ENCOUNTERS_PERCENT_EDEFAULT;
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
		result.append(" (successPercent: ");
		result.append(successPercent);
		result.append(", encountersPercent: ");
		result.append(encountersPercent);
		result.append(')');
		return result.toString();
	}

} //PrerequisiteImpl
