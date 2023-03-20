/**
 */
package generator.impl;

import generator.Ability;
import generator.CoreElement;
import generator.Display;
import generator.ElementCategory;
import generator.ElementSize;
import generator.GeneratorPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Core Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.CoreElementImpl#getID <em>ID</em>}</li>
 *   <li>{@link generator.impl.CoreElementImpl#getType <em>Type</em>}</li>
 *   <li>{@link generator.impl.CoreElementImpl#getAbility <em>Ability</em>}</li>
 *   <li>{@link generator.impl.CoreElementImpl#getSize <em>Size</em>}</li>
 *   <li>{@link generator.impl.CoreElementImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link generator.impl.CoreElementImpl#getDisplay <em>Display</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CoreElementImpl extends MinimalEObjectImpl.Container implements CoreElement {
	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

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
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final ElementSize SIZE_EDEFAULT = ElementSize.SMALL;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected ElementSize size = SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected static final ElementCategory CATEGORY_EDEFAULT = ElementCategory.DECORATIVE;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected ElementCategory category = CATEGORY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDisplay() <em>Display</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplay()
	 * @generated
	 * @ordered
	 */
	protected Display display;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.CORE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getID() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID(String newID) {
		String oldID = id;
		id = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.CORE_ELEMENT__ID, oldID, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.CORE_ELEMENT__TYPE, oldType, type));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GeneratorPackage.CORE_ELEMENT__ABILITY,
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
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.CORE_ELEMENT__ABILITY, oldAbility,
					ability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementSize getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(ElementSize newSize) {
		ElementSize oldSize = size;
		size = newSize == null ? SIZE_EDEFAULT : newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.CORE_ELEMENT__SIZE, oldSize, size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementCategory getCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(ElementCategory newCategory) {
		ElementCategory oldCategory = category;
		category = newCategory == null ? CATEGORY_EDEFAULT : newCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.CORE_ELEMENT__CATEGORY, oldCategory,
					category));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Display getDisplay() {
		return display;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDisplay(Display newDisplay, NotificationChain msgs) {
		Display oldDisplay = display;
		display = newDisplay;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.CORE_ELEMENT__DISPLAY, oldDisplay, newDisplay);
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
	public void setDisplay(Display newDisplay) {
		if (newDisplay != display) {
			NotificationChain msgs = null;
			if (display != null)
				msgs = ((InternalEObject) display).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.CORE_ELEMENT__DISPLAY, null, msgs);
			if (newDisplay != null)
				msgs = ((InternalEObject) newDisplay).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.CORE_ELEMENT__DISPLAY, null, msgs);
			msgs = basicSetDisplay(newDisplay, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.CORE_ELEMENT__DISPLAY, newDisplay,
					newDisplay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GeneratorPackage.CORE_ELEMENT__DISPLAY:
			return basicSetDisplay(null, msgs);
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
		case GeneratorPackage.CORE_ELEMENT__ID:
			return getID();
		case GeneratorPackage.CORE_ELEMENT__TYPE:
			return getType();
		case GeneratorPackage.CORE_ELEMENT__ABILITY:
			if (resolve)
				return getAbility();
			return basicGetAbility();
		case GeneratorPackage.CORE_ELEMENT__SIZE:
			return getSize();
		case GeneratorPackage.CORE_ELEMENT__CATEGORY:
			return getCategory();
		case GeneratorPackage.CORE_ELEMENT__DISPLAY:
			return getDisplay();
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
		case GeneratorPackage.CORE_ELEMENT__ID:
			setID((String) newValue);
			return;
		case GeneratorPackage.CORE_ELEMENT__TYPE:
			setType((String) newValue);
			return;
		case GeneratorPackage.CORE_ELEMENT__ABILITY:
			setAbility((Ability) newValue);
			return;
		case GeneratorPackage.CORE_ELEMENT__SIZE:
			setSize((ElementSize) newValue);
			return;
		case GeneratorPackage.CORE_ELEMENT__CATEGORY:
			setCategory((ElementCategory) newValue);
			return;
		case GeneratorPackage.CORE_ELEMENT__DISPLAY:
			setDisplay((Display) newValue);
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
		case GeneratorPackage.CORE_ELEMENT__ID:
			setID(ID_EDEFAULT);
			return;
		case GeneratorPackage.CORE_ELEMENT__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case GeneratorPackage.CORE_ELEMENT__ABILITY:
			setAbility((Ability) null);
			return;
		case GeneratorPackage.CORE_ELEMENT__SIZE:
			setSize(SIZE_EDEFAULT);
			return;
		case GeneratorPackage.CORE_ELEMENT__CATEGORY:
			setCategory(CATEGORY_EDEFAULT);
			return;
		case GeneratorPackage.CORE_ELEMENT__DISPLAY:
			setDisplay((Display) null);
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
		case GeneratorPackage.CORE_ELEMENT__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case GeneratorPackage.CORE_ELEMENT__TYPE:
			return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
		case GeneratorPackage.CORE_ELEMENT__ABILITY:
			return ability != null;
		case GeneratorPackage.CORE_ELEMENT__SIZE:
			return size != SIZE_EDEFAULT;
		case GeneratorPackage.CORE_ELEMENT__CATEGORY:
			return category != CATEGORY_EDEFAULT;
		case GeneratorPackage.CORE_ELEMENT__DISPLAY:
			return display != null;
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
		result.append(" (ID: ");
		result.append(id);
		result.append(", type: ");
		result.append(type);
		result.append(", size: ");
		result.append(size);
		result.append(", category: ");
		result.append(category);
		result.append(')');
		return result.toString();
	}

} //CoreElementImpl
