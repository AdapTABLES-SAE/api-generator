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
 *   <li>{@link generator.impl.CompletionCriteriaImpl#getSuccesPercent <em>Succes Percent</em>}</li>
 *   <li>{@link generator.impl.CompletionCriteriaImpl#getEncountersPercent <em>Encounters Percent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompletionCriteriaImpl extends MinimalEObjectImpl.Container implements CompletionCriteria {
	/**
	 * The default value of the '{@link #getSuccesPercent() <em>Succes Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccesPercent()
	 * @generated
	 * @ordered
	 */
	protected static final double SUCCES_PERCENT_EDEFAULT = 80.0;

	/**
	 * The cached value of the '{@link #getSuccesPercent() <em>Succes Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccesPercent()
	 * @generated
	 * @ordered
	 */
	protected double succesPercent = SUCCES_PERCENT_EDEFAULT;

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
	public double getSuccesPercent() {
		return succesPercent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuccesPercent(double newSuccesPercent) {
		double oldSuccesPercent = succesPercent;
		succesPercent = newSuccesPercent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.COMPLETION_CRITERIA__SUCCES_PERCENT,
					oldSuccesPercent, succesPercent));
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
		case GeneratorPackage.COMPLETION_CRITERIA__SUCCES_PERCENT:
			return getSuccesPercent();
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
		case GeneratorPackage.COMPLETION_CRITERIA__SUCCES_PERCENT:
			setSuccesPercent((Double) newValue);
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
		case GeneratorPackage.COMPLETION_CRITERIA__SUCCES_PERCENT:
			setSuccesPercent(SUCCES_PERCENT_EDEFAULT);
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
		case GeneratorPackage.COMPLETION_CRITERIA__SUCCES_PERCENT:
			return succesPercent != SUCCES_PERCENT_EDEFAULT;
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
		result.append(" (succesPercent: ");
		result.append(succesPercent);
		result.append(", encountersPercent: ");
		result.append(encountersPercent);
		result.append(')');
		return result.toString();
	}

} //CompletionCriteriaImpl
