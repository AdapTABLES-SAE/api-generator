/**
 */
package generator.impl;

import generator.CompletionCriteria;
import generator.GeneratorPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Completion Criteria</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.CompletionCriteriaImpl#getSuccessPercent <em>Success Percent</em>}</li>
 *   <li>{@link generator.impl.CompletionCriteriaImpl#getEncountersPercent <em>Encounters Percent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompletionCriteriaImpl extends MinimalEObjectImpl.Container implements CompletionCriteria {
	/**
	 * The default value of the '{@link #getSuccessPercent() <em>Success Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccessPercent()
	 * @generated
	 * @ordered
	 */
	protected static final double SUCCESS_PERCENT_EDEFAULT = 80.0;

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
	public CompletionCriteriaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.COMPLETION_CRITERIA;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.COMPLETION_CRITERIA__SUCCESS_PERCENT,
					oldSuccessPercent, successPercent));
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.COMPLETION_CRITERIA__ENCOUNTERS_PERCENT, oldEncountersPercent, encountersPercent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GeneratorPackage.COMPLETION_CRITERIA__SUCCESS_PERCENT:
			return getSuccessPercent();
		case GeneratorPackage.COMPLETION_CRITERIA__ENCOUNTERS_PERCENT:
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
		case GeneratorPackage.COMPLETION_CRITERIA__SUCCESS_PERCENT:
			setSuccessPercent((Double) newValue);
			return;
		case GeneratorPackage.COMPLETION_CRITERIA__ENCOUNTERS_PERCENT:
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
		case GeneratorPackage.COMPLETION_CRITERIA__SUCCESS_PERCENT:
			setSuccessPercent(SUCCESS_PERCENT_EDEFAULT);
			return;
		case GeneratorPackage.COMPLETION_CRITERIA__ENCOUNTERS_PERCENT:
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
		case GeneratorPackage.COMPLETION_CRITERIA__SUCCESS_PERCENT:
			return successPercent != SUCCESS_PERCENT_EDEFAULT;
		case GeneratorPackage.COMPLETION_CRITERIA__ENCOUNTERS_PERCENT:
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

} //CompletionCriteriaImpl
