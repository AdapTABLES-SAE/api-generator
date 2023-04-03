/**
 */
package generator.impl;

import generator.AComponent;
import generator.GPCategory;
import generator.Gameplay;
import generator.GeneratorPackage;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gameplay</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.GameplayImpl#getName <em>Name</em>}</li>
 *   <li>{@link generator.impl.GameplayImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link generator.impl.GameplayImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link generator.impl.GameplayImpl#isHasIntegratedPropositions <em>Has Integrated Propositions</em>}</li>
 *   <li>{@link generator.impl.GameplayImpl#isOptionalValidator <em>Optional Validator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GameplayImpl extends MinimalEObjectImpl.Container implements Gameplay {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected static final GPCategory CATEGORY_EDEFAULT = GPCategory.SELECT_UNIQUE;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected GPCategory category = CATEGORY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getComponents() <em>Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<AComponent> components;

	/**
	 * The default value of the '{@link #isHasIntegratedPropositions() <em>Has Integrated Propositions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasIntegratedPropositions()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_INTEGRATED_PROPOSITIONS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHasIntegratedPropositions() <em>Has Integrated Propositions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasIntegratedPropositions()
	 * @generated
	 * @ordered
	 */
	protected boolean hasIntegratedPropositions = HAS_INTEGRATED_PROPOSITIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #isOptionalValidator() <em>Optional Validator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOptionalValidator()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OPTIONAL_VALIDATOR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOptionalValidator() <em>Optional Validator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOptionalValidator()
	 * @generated
	 * @ordered
	 */
	protected boolean optionalValidator = OPTIONAL_VALIDATOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GameplayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.GAMEPLAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.GAMEPLAY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GPCategory getCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(GPCategory newCategory) {
		GPCategory oldCategory = category;
		category = newCategory == null ? CATEGORY_EDEFAULT : newCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.GAMEPLAY__CATEGORY, oldCategory,
					category));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AComponent> getComponents() {
		if (components == null) {
			components = new EObjectContainmentEList<AComponent>(AComponent.class, this,
					GeneratorPackage.GAMEPLAY__COMPONENTS);
		}
		return components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHasIntegratedPropositions() {
		return hasIntegratedPropositions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasIntegratedPropositions(boolean newHasIntegratedPropositions) {
		boolean oldHasIntegratedPropositions = hasIntegratedPropositions;
		hasIntegratedPropositions = newHasIntegratedPropositions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.GAMEPLAY__HAS_INTEGRATED_PROPOSITIONS, oldHasIntegratedPropositions,
					hasIntegratedPropositions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOptionalValidator() {
		return optionalValidator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptionalValidator(boolean newOptionalValidator) {
		boolean oldOptionalValidator = optionalValidator;
		optionalValidator = newOptionalValidator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.GAMEPLAY__OPTIONAL_VALIDATOR,
					oldOptionalValidator, optionalValidator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GeneratorPackage.GAMEPLAY__COMPONENTS:
			return ((InternalEList<?>) getComponents()).basicRemove(otherEnd, msgs);
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
		case GeneratorPackage.GAMEPLAY__NAME:
			return getName();
		case GeneratorPackage.GAMEPLAY__CATEGORY:
			return getCategory();
		case GeneratorPackage.GAMEPLAY__COMPONENTS:
			return getComponents();
		case GeneratorPackage.GAMEPLAY__HAS_INTEGRATED_PROPOSITIONS:
			return isHasIntegratedPropositions();
		case GeneratorPackage.GAMEPLAY__OPTIONAL_VALIDATOR:
			return isOptionalValidator();
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
		case GeneratorPackage.GAMEPLAY__NAME:
			setName((String) newValue);
			return;
		case GeneratorPackage.GAMEPLAY__CATEGORY:
			setCategory((GPCategory) newValue);
			return;
		case GeneratorPackage.GAMEPLAY__COMPONENTS:
			getComponents().clear();
			getComponents().addAll((Collection<? extends AComponent>) newValue);
			return;
		case GeneratorPackage.GAMEPLAY__HAS_INTEGRATED_PROPOSITIONS:
			setHasIntegratedPropositions((Boolean) newValue);
			return;
		case GeneratorPackage.GAMEPLAY__OPTIONAL_VALIDATOR:
			setOptionalValidator((Boolean) newValue);
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
		case GeneratorPackage.GAMEPLAY__NAME:
			setName(NAME_EDEFAULT);
			return;
		case GeneratorPackage.GAMEPLAY__CATEGORY:
			setCategory(CATEGORY_EDEFAULT);
			return;
		case GeneratorPackage.GAMEPLAY__COMPONENTS:
			getComponents().clear();
			return;
		case GeneratorPackage.GAMEPLAY__HAS_INTEGRATED_PROPOSITIONS:
			setHasIntegratedPropositions(HAS_INTEGRATED_PROPOSITIONS_EDEFAULT);
			return;
		case GeneratorPackage.GAMEPLAY__OPTIONAL_VALIDATOR:
			setOptionalValidator(OPTIONAL_VALIDATOR_EDEFAULT);
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
		case GeneratorPackage.GAMEPLAY__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case GeneratorPackage.GAMEPLAY__CATEGORY:
			return category != CATEGORY_EDEFAULT;
		case GeneratorPackage.GAMEPLAY__COMPONENTS:
			return components != null && !components.isEmpty();
		case GeneratorPackage.GAMEPLAY__HAS_INTEGRATED_PROPOSITIONS:
			return hasIntegratedPropositions != HAS_INTEGRATED_PROPOSITIONS_EDEFAULT;
		case GeneratorPackage.GAMEPLAY__OPTIONAL_VALIDATOR:
			return optionalValidator != OPTIONAL_VALIDATOR_EDEFAULT;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", category: ");
		result.append(category);
		result.append(", hasIntegratedPropositions: ");
		result.append(hasIntegratedPropositions);
		result.append(", optionalValidator: ");
		result.append(optionalValidator);
		result.append(')');
		return result.toString();
	}

} //GameplayImpl
