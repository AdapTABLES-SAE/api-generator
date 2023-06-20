/**
 */
package generator.impl;

import generator.AComponent;
import generator.Ability;
import generator.GeneratorPackage;
import generator.Size;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AComponent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.AComponentImpl#getAllowedAbility <em>Allowed Ability</em>}</li>
 *   <li>{@link generator.impl.AComponentImpl#getExpectedSize <em>Expected Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AComponentImpl extends MinimalEObjectImpl.Container implements AComponent {
	/**
	 * The cached value of the '{@link #getAllowedAbility() <em>Allowed Ability</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowedAbility()
	 * @generated
	 * @ordered
	 */
	protected Ability allowedAbility;
	/**
	 * The cached value of the '{@link #getExpectedSize() <em>Expected Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpectedSize()
	 * @generated
	 * @ordered
	 */
	protected Size expectedSize;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.ACOMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ability getAllowedAbility() {
		if (allowedAbility != null && allowedAbility.eIsProxy()) {
			InternalEObject oldAllowedAbility = (InternalEObject) allowedAbility;
			allowedAbility = (Ability) eResolveProxy(oldAllowedAbility);
			if (allowedAbility != oldAllowedAbility) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							GeneratorPackage.ACOMPONENT__ALLOWED_ABILITY, oldAllowedAbility, allowedAbility));
			}
		}
		return allowedAbility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ability basicGetAllowedAbility() {
		return allowedAbility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowedAbility(Ability newAllowedAbility) {
		Ability oldAllowedAbility = allowedAbility;
		allowedAbility = newAllowedAbility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.ACOMPONENT__ALLOWED_ABILITY,
					oldAllowedAbility, allowedAbility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Size getExpectedSize() {
		return expectedSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpectedSize(Size newExpectedSize, NotificationChain msgs) {
		Size oldExpectedSize = expectedSize;
		expectedSize = newExpectedSize;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.ACOMPONENT__EXPECTED_SIZE, oldExpectedSize, newExpectedSize);
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
	public void setExpectedSize(Size newExpectedSize) {
		if (newExpectedSize != expectedSize) {
			NotificationChain msgs = null;
			if (expectedSize != null)
				msgs = ((InternalEObject) expectedSize).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.ACOMPONENT__EXPECTED_SIZE, null, msgs);
			if (newExpectedSize != null)
				msgs = ((InternalEObject) newExpectedSize).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.ACOMPONENT__EXPECTED_SIZE, null, msgs);
			msgs = basicSetExpectedSize(newExpectedSize, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.ACOMPONENT__EXPECTED_SIZE,
					newExpectedSize, newExpectedSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GeneratorPackage.ACOMPONENT__EXPECTED_SIZE:
			return basicSetExpectedSize(null, msgs);
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
		case GeneratorPackage.ACOMPONENT__ALLOWED_ABILITY:
			if (resolve)
				return getAllowedAbility();
			return basicGetAllowedAbility();
		case GeneratorPackage.ACOMPONENT__EXPECTED_SIZE:
			return getExpectedSize();
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
		case GeneratorPackage.ACOMPONENT__ALLOWED_ABILITY:
			setAllowedAbility((Ability) newValue);
			return;
		case GeneratorPackage.ACOMPONENT__EXPECTED_SIZE:
			setExpectedSize((Size) newValue);
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
		case GeneratorPackage.ACOMPONENT__ALLOWED_ABILITY:
			setAllowedAbility((Ability) null);
			return;
		case GeneratorPackage.ACOMPONENT__EXPECTED_SIZE:
			setExpectedSize((Size) null);
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
		case GeneratorPackage.ACOMPONENT__ALLOWED_ABILITY:
			return allowedAbility != null;
		case GeneratorPackage.ACOMPONENT__EXPECTED_SIZE:
			return expectedSize != null;
		}
		return super.eIsSet(featureID);
	}

} //AComponentImpl
