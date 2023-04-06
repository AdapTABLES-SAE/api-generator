/**
 */
package generator.impl;

import generator.AComponent;
import generator.ETaskType;
import generator.GPCategory;
import generator.Gameplay;
import generator.GeneratorPackage;
import generator.Prompt;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
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
 *   <li>{@link generator.impl.GameplayImpl#isManualValidation <em>Manual Validation</em>}</li>
 *   <li>{@link generator.impl.GameplayImpl#getPrompt <em>Prompt</em>}</li>
 *   <li>{@link generator.impl.GameplayImpl#getRestrictedTo <em>Restricted To</em>}</li>
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
	 * The default value of the '{@link #isManualValidation() <em>Manual Validation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isManualValidation()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MANUAL_VALIDATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isManualValidation() <em>Manual Validation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isManualValidation()
	 * @generated
	 * @ordered
	 */
	protected boolean manualValidation = MANUAL_VALIDATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPrompt() <em>Prompt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrompt()
	 * @generated
	 * @ordered
	 */
	protected Prompt prompt;

	/**
	 * The cached value of the '{@link #getRestrictedTo() <em>Restricted To</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestrictedTo()
	 * @generated
	 * @ordered
	 */
	protected EList<ETaskType> restrictedTo;

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
	public boolean isManualValidation() {
		return manualValidation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManualValidation(boolean newManualValidation) {
		boolean oldManualValidation = manualValidation;
		manualValidation = newManualValidation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.GAMEPLAY__MANUAL_VALIDATION,
					oldManualValidation, manualValidation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Prompt getPrompt() {
		return prompt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrompt(Prompt newPrompt, NotificationChain msgs) {
		Prompt oldPrompt = prompt;
		prompt = newPrompt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.GAMEPLAY__PROMPT, oldPrompt, newPrompt);
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
	public void setPrompt(Prompt newPrompt) {
		if (newPrompt != prompt) {
			NotificationChain msgs = null;
			if (prompt != null)
				msgs = ((InternalEObject) prompt).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.GAMEPLAY__PROMPT, null, msgs);
			if (newPrompt != null)
				msgs = ((InternalEObject) newPrompt).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.GAMEPLAY__PROMPT, null, msgs);
			msgs = basicSetPrompt(newPrompt, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.GAMEPLAY__PROMPT, newPrompt,
					newPrompt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ETaskType> getRestrictedTo() {
		if (restrictedTo == null) {
			restrictedTo = new EDataTypeUniqueEList<ETaskType>(ETaskType.class, this,
					GeneratorPackage.GAMEPLAY__RESTRICTED_TO);
		}
		return restrictedTo;
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
		case GeneratorPackage.GAMEPLAY__PROMPT:
			return basicSetPrompt(null, msgs);
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
		case GeneratorPackage.GAMEPLAY__MANUAL_VALIDATION:
			return isManualValidation();
		case GeneratorPackage.GAMEPLAY__PROMPT:
			return getPrompt();
		case GeneratorPackage.GAMEPLAY__RESTRICTED_TO:
			return getRestrictedTo();
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
		case GeneratorPackage.GAMEPLAY__MANUAL_VALIDATION:
			setManualValidation((Boolean) newValue);
			return;
		case GeneratorPackage.GAMEPLAY__PROMPT:
			setPrompt((Prompt) newValue);
			return;
		case GeneratorPackage.GAMEPLAY__RESTRICTED_TO:
			getRestrictedTo().clear();
			getRestrictedTo().addAll((Collection<? extends ETaskType>) newValue);
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
		case GeneratorPackage.GAMEPLAY__MANUAL_VALIDATION:
			setManualValidation(MANUAL_VALIDATION_EDEFAULT);
			return;
		case GeneratorPackage.GAMEPLAY__PROMPT:
			setPrompt((Prompt) null);
			return;
		case GeneratorPackage.GAMEPLAY__RESTRICTED_TO:
			getRestrictedTo().clear();
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
		case GeneratorPackage.GAMEPLAY__MANUAL_VALIDATION:
			return manualValidation != MANUAL_VALIDATION_EDEFAULT;
		case GeneratorPackage.GAMEPLAY__PROMPT:
			return prompt != null;
		case GeneratorPackage.GAMEPLAY__RESTRICTED_TO:
			return restrictedTo != null && !restrictedTo.isEmpty();
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
		result.append(", manualValidation: ");
		result.append(manualValidation);
		result.append(", restrictedTo: ");
		result.append(restrictedTo);
		result.append(')');
		return result.toString();
	}

} //GameplayImpl
