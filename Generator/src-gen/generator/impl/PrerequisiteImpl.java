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
 *   <li>{@link generator.impl.PrerequisiteImpl#getSuccessPercentage <em>Success Percentage</em>}</li>
 *   <li>{@link generator.impl.PrerequisiteImpl#getPrerequisite <em>Prerequisite</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrerequisiteImpl extends MinimalEObjectImpl.Container implements Prerequisite {
	/**
	 * The default value of the '{@link #getSuccessPercentage() <em>Success Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccessPercentage()
	 * @generated
	 * @ordered
	 */
	protected static final int SUCCESS_PERCENTAGE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSuccessPercentage() <em>Success Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccessPercentage()
	 * @generated
	 * @ordered
	 */
	protected int successPercentage = SUCCESS_PERCENTAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPrerequisite() <em>Prerequisite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrerequisite()
	 * @generated
	 * @ordered
	 */
	protected Level prerequisite;

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
	public int getSuccessPercentage() {
		return successPercentage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuccessPercentage(int newSuccessPercentage) {
		int oldSuccessPercentage = successPercentage;
		successPercentage = newSuccessPercentage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.PREREQUISITE__SUCCESS_PERCENTAGE,
					oldSuccessPercentage, successPercentage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Level getPrerequisite() {
		if (prerequisite != null && prerequisite.eIsProxy()) {
			InternalEObject oldPrerequisite = (InternalEObject) prerequisite;
			prerequisite = (Level) eResolveProxy(oldPrerequisite);
			if (prerequisite != oldPrerequisite) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							GeneratorPackage.PREREQUISITE__PREREQUISITE, oldPrerequisite, prerequisite));
			}
		}
		return prerequisite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Level basicGetPrerequisite() {
		return prerequisite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrerequisite(Level newPrerequisite) {
		Level oldPrerequisite = prerequisite;
		prerequisite = newPrerequisite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.PREREQUISITE__PREREQUISITE,
					oldPrerequisite, prerequisite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GeneratorPackage.PREREQUISITE__SUCCESS_PERCENTAGE:
			return getSuccessPercentage();
		case GeneratorPackage.PREREQUISITE__PREREQUISITE:
			if (resolve)
				return getPrerequisite();
			return basicGetPrerequisite();
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
		case GeneratorPackage.PREREQUISITE__SUCCESS_PERCENTAGE:
			setSuccessPercentage((Integer) newValue);
			return;
		case GeneratorPackage.PREREQUISITE__PREREQUISITE:
			setPrerequisite((Level) newValue);
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
		case GeneratorPackage.PREREQUISITE__SUCCESS_PERCENTAGE:
			setSuccessPercentage(SUCCESS_PERCENTAGE_EDEFAULT);
			return;
		case GeneratorPackage.PREREQUISITE__PREREQUISITE:
			setPrerequisite((Level) null);
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
		case GeneratorPackage.PREREQUISITE__SUCCESS_PERCENTAGE:
			return successPercentage != SUCCESS_PERCENTAGE_EDEFAULT;
		case GeneratorPackage.PREREQUISITE__PREREQUISITE:
			return prerequisite != null;
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
		result.append(" (successPercentage: ");
		result.append(successPercentage);
		result.append(')');
		return result.toString();
	}

} //PrerequisiteImpl
