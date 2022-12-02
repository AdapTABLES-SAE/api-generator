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
 *   <li>{@link generator.impl.PrerequisiteImpl#getSuccesPercent <em>Succes Percent</em>}</li>
 *   <li>{@link generator.impl.PrerequisiteImpl#getRequiredLevel <em>Required Level</em>}</li>
 *   <li>{@link generator.impl.PrerequisiteImpl#getAchievementPercent <em>Achievement Percent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrerequisiteImpl extends MinimalEObjectImpl.Container implements Prerequisite {
	/**
	 * The default value of the '{@link #getSuccesPercent() <em>Succes Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccesPercent()
	 * @generated
	 * @ordered
	 */
	protected static final int SUCCES_PERCENT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSuccesPercent() <em>Succes Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccesPercent()
	 * @generated
	 * @ordered
	 */
	protected int succesPercent = SUCCES_PERCENT_EDEFAULT;

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
	 * The default value of the '{@link #getAchievementPercent() <em>Achievement Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAchievementPercent()
	 * @generated
	 * @ordered
	 */
	protected static final int ACHIEVEMENT_PERCENT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAchievementPercent() <em>Achievement Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAchievementPercent()
	 * @generated
	 * @ordered
	 */
	protected int achievementPercent = ACHIEVEMENT_PERCENT_EDEFAULT;

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
	public int getSuccesPercent() {
		return succesPercent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuccesPercent(int newSuccesPercent) {
		int oldSuccesPercent = succesPercent;
		succesPercent = newSuccesPercent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.PREREQUISITE__SUCCES_PERCENT,
					oldSuccesPercent, succesPercent));
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
	public int getAchievementPercent() {
		return achievementPercent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAchievementPercent(int newAchievementPercent) {
		int oldAchievementPercent = achievementPercent;
		achievementPercent = newAchievementPercent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.PREREQUISITE__ACHIEVEMENT_PERCENT,
					oldAchievementPercent, achievementPercent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GeneratorPackage.PREREQUISITE__SUCCES_PERCENT:
			return getSuccesPercent();
		case GeneratorPackage.PREREQUISITE__REQUIRED_LEVEL:
			if (resolve)
				return getRequiredLevel();
			return basicGetRequiredLevel();
		case GeneratorPackage.PREREQUISITE__ACHIEVEMENT_PERCENT:
			return getAchievementPercent();
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
		case GeneratorPackage.PREREQUISITE__SUCCES_PERCENT:
			setSuccesPercent((Integer) newValue);
			return;
		case GeneratorPackage.PREREQUISITE__REQUIRED_LEVEL:
			setRequiredLevel((Level) newValue);
			return;
		case GeneratorPackage.PREREQUISITE__ACHIEVEMENT_PERCENT:
			setAchievementPercent((Integer) newValue);
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
		case GeneratorPackage.PREREQUISITE__SUCCES_PERCENT:
			setSuccesPercent(SUCCES_PERCENT_EDEFAULT);
			return;
		case GeneratorPackage.PREREQUISITE__REQUIRED_LEVEL:
			setRequiredLevel((Level) null);
			return;
		case GeneratorPackage.PREREQUISITE__ACHIEVEMENT_PERCENT:
			setAchievementPercent(ACHIEVEMENT_PERCENT_EDEFAULT);
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
		case GeneratorPackage.PREREQUISITE__SUCCES_PERCENT:
			return succesPercent != SUCCES_PERCENT_EDEFAULT;
		case GeneratorPackage.PREREQUISITE__REQUIRED_LEVEL:
			return requiredLevel != null;
		case GeneratorPackage.PREREQUISITE__ACHIEVEMENT_PERCENT:
			return achievementPercent != ACHIEVEMENT_PERCENT_EDEFAULT;
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
		result.append(", achievementPercent: ");
		result.append(achievementPercent);
		result.append(')');
		return result.toString();
	}

} //PrerequisiteImpl
