/**
 */
package generator.impl;

import generator.Ability;
import generator.ElementType;
import generator.GeneratorPackage;

import generator.InteractiveStatement;
import generator.StructureStatement;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

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
 *   <li>{@link generator.impl.ElementTypeImpl#getInsideStructureStatement <em>Inside Structure Statement</em>}</li>
 *   <li>{@link generator.impl.ElementTypeImpl#getInteractiveStatement <em>Interactive Statement</em>}</li>
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
	 * The cached value of the '{@link #getInsideStructureStatement() <em>Inside Structure Statement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsideStructureStatement()
	 * @generated
	 * @ordered
	 */
	protected EList<StructureStatement> insideStructureStatement;
	/**
	 * The cached value of the '{@link #getInteractiveStatement() <em>Interactive Statement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteractiveStatement()
	 * @generated
	 * @ordered
	 */
	protected EList<InteractiveStatement> interactiveStatement;

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
	public EList<StructureStatement> getInsideStructureStatement() {
		if (insideStructureStatement == null) {
			insideStructureStatement = new EObjectContainmentEList<StructureStatement>(StructureStatement.class, this,
					GeneratorPackage.ELEMENT_TYPE__INSIDE_STRUCTURE_STATEMENT);
		}
		return insideStructureStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InteractiveStatement> getInteractiveStatement() {
		if (interactiveStatement == null) {
			interactiveStatement = new EObjectContainmentEList<InteractiveStatement>(InteractiveStatement.class, this,
					GeneratorPackage.ELEMENT_TYPE__INTERACTIVE_STATEMENT);
		}
		return interactiveStatement;
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GeneratorPackage.ELEMENT_TYPE__INSIDE_STRUCTURE_STATEMENT:
			return ((InternalEList<?>) getInsideStructureStatement()).basicRemove(otherEnd, msgs);
		case GeneratorPackage.ELEMENT_TYPE__INTERACTIVE_STATEMENT:
			return ((InternalEList<?>) getInteractiveStatement()).basicRemove(otherEnd, msgs);
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
		case GeneratorPackage.ELEMENT_TYPE__ABILITY:
			if (resolve)
				return getAbility();
			return basicGetAbility();
		case GeneratorPackage.ELEMENT_TYPE__NUMBER_OF_DISPLAYS:
			return getNumberOfDisplays();
		case GeneratorPackage.ELEMENT_TYPE__INSIDE_STRUCTURE_STATEMENT:
			return getInsideStructureStatement();
		case GeneratorPackage.ELEMENT_TYPE__INTERACTIVE_STATEMENT:
			return getInteractiveStatement();
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
		case GeneratorPackage.ELEMENT_TYPE__INSIDE_STRUCTURE_STATEMENT:
			getInsideStructureStatement().clear();
			getInsideStructureStatement().addAll((Collection<? extends StructureStatement>) newValue);
			return;
		case GeneratorPackage.ELEMENT_TYPE__INTERACTIVE_STATEMENT:
			getInteractiveStatement().clear();
			getInteractiveStatement().addAll((Collection<? extends InteractiveStatement>) newValue);
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
		case GeneratorPackage.ELEMENT_TYPE__INSIDE_STRUCTURE_STATEMENT:
			getInsideStructureStatement().clear();
			return;
		case GeneratorPackage.ELEMENT_TYPE__INTERACTIVE_STATEMENT:
			getInteractiveStatement().clear();
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
		case GeneratorPackage.ELEMENT_TYPE__INSIDE_STRUCTURE_STATEMENT:
			return insideStructureStatement != null && !insideStructureStatement.isEmpty();
		case GeneratorPackage.ELEMENT_TYPE__INTERACTIVE_STATEMENT:
			return interactiveStatement != null && !interactiveStatement.isEmpty();
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
