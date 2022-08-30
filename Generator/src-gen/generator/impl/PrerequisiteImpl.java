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
 *   <li>{@link generator.impl.PrerequisiteImpl#getSuccesPercentage <em>Succes Percentage</em>}</li>
 *   <li>{@link generator.impl.PrerequisiteImpl#getRequiredLevel <em>Required Level</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrerequisiteImpl extends MinimalEObjectImpl.Container implements Prerequisite {
	/**
	 * The default value of the '{@link #getSuccesPercentage() <em>Succes Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccesPercentage()
	 * @generated
	 * @ordered
	 */
	protected static final int SUCCES_PERCENTAGE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSuccesPercentage() <em>Succes Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccesPercentage()
	 * @generated
	 * @ordered
	 */
	protected int succesPercentage = SUCCES_PERCENTAGE_EDEFAULT;

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
	public int getSuccesPercentage() {
		return succesPercentage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuccesPercentage(int newSuccesPercentage) {
		int oldSuccesPercentage = succesPercentage;
		succesPercentage = newSuccesPercentage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.PREREQUISITE__SUCCES_PERCENTAGE,
					oldSuccesPercentage, succesPercentage));
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GeneratorPackage.PREREQUISITE__SUCCES_PERCENTAGE:
			return getSuccesPercentage();
		case GeneratorPackage.PREREQUISITE__REQUIRED_LEVEL:
			if (resolve)
				return getRequiredLevel();
			return basicGetRequiredLevel();
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
		case GeneratorPackage.PREREQUISITE__SUCCES_PERCENTAGE:
			setSuccesPercentage((Integer) newValue);
			return;
		case GeneratorPackage.PREREQUISITE__REQUIRED_LEVEL:
			setRequiredLevel((Level) newValue);
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
		case GeneratorPackage.PREREQUISITE__SUCCES_PERCENTAGE:
			setSuccesPercentage(SUCCES_PERCENTAGE_EDEFAULT);
			return;
		case GeneratorPackage.PREREQUISITE__REQUIRED_LEVEL:
			setRequiredLevel((Level) null);
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
		case GeneratorPackage.PREREQUISITE__SUCCES_PERCENTAGE:
			return succesPercentage != SUCCES_PERCENTAGE_EDEFAULT;
		case GeneratorPackage.PREREQUISITE__REQUIRED_LEVEL:
			return requiredLevel != null;
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
		result.append(" (succesPercentage: ");
		result.append(succesPercentage);
		result.append(')');
		return result.toString();
	}

} //PrerequisiteImpl
