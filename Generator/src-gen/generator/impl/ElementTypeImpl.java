/**
 */
package generator.impl;

import generator.Ability;
import generator.ElementType;
import generator.GeneratorPackage;
import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.ElementTypeImpl#getAbility <em>Ability</em>}</li>
 *   <li>{@link generator.impl.ElementTypeImpl#getNumberOfDisplays <em>Number Of Displays</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElementTypeImpl extends GPElementTypeImpl implements ElementType {
	/**
	 * The cached value of the '{@link #getAbility() <em>Ability</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbility()
	 * @generated
	 * @ordered
	 */
	protected Ability ability;

	/**
	 * The default value of the '{@link #getNumberOfDisplays() <em>Number Of Displays</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfDisplays()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_DISPLAYS_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getNumberOfDisplays() <em>Number Of Displays</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfDisplays()
	 * @generated
	 * @ordered
	 */
	protected int numberOfDisplays = NUMBER_OF_DISPLAYS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.ELEMENT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ability getAbility() {
		if (ability != null && ability.eIsProxy()) {
			InternalEObject oldAbility = (InternalEObject) ability;
			ability = (Ability) eResolveProxy(oldAbility);
			if (ability != oldAbility) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GeneratorPackage.ELEMENT_TYPE__ABILITY,
							oldAbility, ability));
			}
		}
		return ability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ability basicGetAbility() {
		return ability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbility(Ability newAbility) {
		Ability oldAbility = ability;
		ability = newAbility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.ELEMENT_TYPE__ABILITY, oldAbility,
					ability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfDisplays() {
		return numberOfDisplays;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfDisplays(int newNumberOfDisplays) {
		int oldNumberOfDisplays = numberOfDisplays;
		numberOfDisplays = newNumberOfDisplays;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.ELEMENT_TYPE__NUMBER_OF_DISPLAYS,
					oldNumberOfDisplays, numberOfDisplays));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isElementDisplayable() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GeneratorPackage.ELEMENT_TYPE__ABILITY:
			if (resolve)
				return getAbility();
			return basicGetAbility();
		case GeneratorPackage.ELEMENT_TYPE__NUMBER_OF_DISPLAYS:
			return getNumberOfDisplays();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case GeneratorPackage.ELEMENT_TYPE__ABILITY:
			setAbility((Ability) newValue);
			return;
		case GeneratorPackage.ELEMENT_TYPE__NUMBER_OF_DISPLAYS:
			setNumberOfDisplays((Integer) newValue);
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
		case GeneratorPackage.ELEMENT_TYPE__ABILITY:
			setAbility((Ability) null);
			return;
		case GeneratorPackage.ELEMENT_TYPE__NUMBER_OF_DISPLAYS:
			setNumberOfDisplays(NUMBER_OF_DISPLAYS_EDEFAULT);
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
		case GeneratorPackage.ELEMENT_TYPE__ABILITY:
			return ability != null;
		case GeneratorPackage.ELEMENT_TYPE__NUMBER_OF_DISPLAYS:
			return numberOfDisplays != NUMBER_OF_DISPLAYS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case GeneratorPackage.ELEMENT_TYPE___IS_ELEMENT_DISPLAYABLE:
			return isElementDisplayable();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (numberOfDisplays: ");
		result.append(numberOfDisplays);
		result.append(')');
		return result.toString();
	}

} //ElementTypeImpl
