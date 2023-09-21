/**
 */
package generator.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import generator.Ability;
import generator.ElementSize;
import generator.ElementType;
import generator.GeneratorPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.ElementTypeImpl#getSize <em>Size</em>}</li>
 *   <li>{@link generator.impl.ElementTypeImpl#getID <em>ID</em>}</li>
 *   <li>{@link generator.impl.ElementTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link generator.impl.ElementTypeImpl#getNbDisplays <em>Nb Displays</em>}</li>
 *   <li>{@link generator.impl.ElementTypeImpl#getAbility <em>Ability</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElementTypeImpl extends MinimalEObjectImpl.Container implements ElementType {
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
	protected static final String TYPE_EDEFAULT = null;

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
	 * The default value of the '{@link #getNbDisplays() <em>Nb Displays</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbDisplays()
	 * @generated
	 * @ordered
	 */
	protected static final int NB_DISPLAYS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNbDisplays() <em>Nb Displays</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbDisplays()
	 * @generated
	 * @ordered
	 */
	protected int nbDisplays = NB_DISPLAYS_EDEFAULT;

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
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.ELEMENT_TYPE__SIZE, oldSize, size));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.ELEMENT_TYPE__ID, oldID, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.ELEMENT_TYPE__TYPE, oldType, type));
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
	public int getNbDisplays() {
		return nbDisplays;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbDisplays(int newNbDisplays) {
		int oldNbDisplays = nbDisplays;
		nbDisplays = newNbDisplays;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.ELEMENT_TYPE__NB_DISPLAYS,
					oldNbDisplays, nbDisplays));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDisplayableElement() {
		return this.nbDisplays > 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GeneratorPackage.ELEMENT_TYPE__SIZE:
			return getSize();
		case GeneratorPackage.ELEMENT_TYPE__ID:
			return getID();
		case GeneratorPackage.ELEMENT_TYPE__TYPE:
			return getType();
		case GeneratorPackage.ELEMENT_TYPE__NB_DISPLAYS:
			return getNbDisplays();
		case GeneratorPackage.ELEMENT_TYPE__ABILITY:
			if (resolve)
				return getAbility();
			return basicGetAbility();
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
		case GeneratorPackage.ELEMENT_TYPE__SIZE:
			setSize((ElementSize) newValue);
			return;
		case GeneratorPackage.ELEMENT_TYPE__ID:
			setID((String) newValue);
			return;
		case GeneratorPackage.ELEMENT_TYPE__TYPE:
			setType((String) newValue);
			return;
		case GeneratorPackage.ELEMENT_TYPE__NB_DISPLAYS:
			setNbDisplays((Integer) newValue);
			return;
		case GeneratorPackage.ELEMENT_TYPE__ABILITY:
			setAbility((Ability) newValue);
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
		case GeneratorPackage.ELEMENT_TYPE__SIZE:
			setSize(SIZE_EDEFAULT);
			return;
		case GeneratorPackage.ELEMENT_TYPE__ID:
			setID(ID_EDEFAULT);
			return;
		case GeneratorPackage.ELEMENT_TYPE__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case GeneratorPackage.ELEMENT_TYPE__NB_DISPLAYS:
			setNbDisplays(NB_DISPLAYS_EDEFAULT);
			return;
		case GeneratorPackage.ELEMENT_TYPE__ABILITY:
			setAbility((Ability) null);
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
		case GeneratorPackage.ELEMENT_TYPE__SIZE:
			return size != SIZE_EDEFAULT;
		case GeneratorPackage.ELEMENT_TYPE__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case GeneratorPackage.ELEMENT_TYPE__TYPE:
			return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
		case GeneratorPackage.ELEMENT_TYPE__NB_DISPLAYS:
			return nbDisplays != NB_DISPLAYS_EDEFAULT;
		case GeneratorPackage.ELEMENT_TYPE__ABILITY:
			return ability != null;
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
		case GeneratorPackage.ELEMENT_TYPE___IS_DISPLAYABLE_ELEMENT:
			return isDisplayableElement();
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
		result.append(" (size: ");
		result.append(size);
		result.append(", ID: ");
		result.append(id);
		result.append(", type: ");
		result.append(type);
		result.append(", nbDisplays: ");
		result.append(nbDisplays);
		result.append(')');
		return result.toString();
	}

} //ElementTypeImpl
