/**
 */
package generator.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import generator.Curse;
import generator.CurseEligibility;
import generator.GeneratorPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Curse Eligibility</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.CurseEligibilityImpl#getStartLevel <em>Start Level</em>}</li>
 *   <li>{@link generator.impl.CurseEligibilityImpl#getCurse <em>Curse</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CurseEligibilityImpl extends MinimalEObjectImpl.Container implements CurseEligibility {
	/**
	 * The default value of the '{@link #getStartLevel() <em>Start Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartLevel()
	 * @generated
	 * @ordered
	 */
	protected static final int START_LEVEL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStartLevel() <em>Start Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartLevel()
	 * @generated
	 * @ordered
	 */
	protected int startLevel = START_LEVEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCurse() <em>Curse</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurse()
	 * @generated
	 * @ordered
	 */
	protected Curse curse;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurseEligibilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.CURSE_ELIGIBILITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStartLevel() {
		return startLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartLevel(int newStartLevel) {
		int oldStartLevel = startLevel;
		startLevel = newStartLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.CURSE_ELIGIBILITY__START_LEVEL,
					oldStartLevel, startLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Curse getCurse() {
		if (curse != null && curse.eIsProxy()) {
			InternalEObject oldCurse = (InternalEObject) curse;
			curse = (Curse) eResolveProxy(oldCurse);
			if (curse != oldCurse) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GeneratorPackage.CURSE_ELIGIBILITY__CURSE,
							oldCurse, curse));
			}
		}
		return curse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Curse basicGetCurse() {
		return curse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurse(Curse newCurse) {
		Curse oldCurse = curse;
		curse = newCurse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.CURSE_ELIGIBILITY__CURSE, oldCurse,
					curse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GeneratorPackage.CURSE_ELIGIBILITY__START_LEVEL:
			return getStartLevel();
		case GeneratorPackage.CURSE_ELIGIBILITY__CURSE:
			if (resolve)
				return getCurse();
			return basicGetCurse();
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
		case GeneratorPackage.CURSE_ELIGIBILITY__START_LEVEL:
			setStartLevel((Integer) newValue);
			return;
		case GeneratorPackage.CURSE_ELIGIBILITY__CURSE:
			setCurse((Curse) newValue);
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
		case GeneratorPackage.CURSE_ELIGIBILITY__START_LEVEL:
			setStartLevel(START_LEVEL_EDEFAULT);
			return;
		case GeneratorPackage.CURSE_ELIGIBILITY__CURSE:
			setCurse((Curse) null);
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
		case GeneratorPackage.CURSE_ELIGIBILITY__START_LEVEL:
			return startLevel != START_LEVEL_EDEFAULT;
		case GeneratorPackage.CURSE_ELIGIBILITY__CURSE:
			return curse != null;
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
		result.append(" (startLevel: ");
		result.append(startLevel);
		result.append(')');
		return result.toString();
	}

} //CurseEligibilityImpl
