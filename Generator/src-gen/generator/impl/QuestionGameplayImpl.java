/**
 */
package generator.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import generator.EStatementType;
import generator.ETaskType;
import generator.GPCategory;
import generator.GeneratorPackage;
import generator.QuestionGameplay;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Question Gameplay</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.QuestionGameplayImpl#isManualValidation <em>Manual Validation</em>}</li>
 *   <li>{@link generator.impl.QuestionGameplayImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link generator.impl.QuestionGameplayImpl#isHasIntegratedPropositions <em>Has Integrated Propositions</em>}</li>
 *   <li>{@link generator.impl.QuestionGameplayImpl#getRestrictedTo <em>Restricted To</em>}</li>
 *   <li>{@link generator.impl.QuestionGameplayImpl#getStatementType <em>Statement Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuestionGameplayImpl extends GameplayImpl implements QuestionGameplay {
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
	 * The cached value of the '{@link #getRestrictedTo() <em>Restricted To</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestrictedTo()
	 * @generated
	 * @ordered
	 */
	protected EList<ETaskType> restrictedTo;

	/**
	 * The default value of the '{@link #getStatementType() <em>Statement Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatementType()
	 * @generated
	 * @ordered
	 */
	protected static final EStatementType STATEMENT_TYPE_EDEFAULT = EStatementType.CLASSIC;

	/**
	 * The cached value of the '{@link #getStatementType() <em>Statement Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatementType()
	 * @generated
	 * @ordered
	 */
	protected EStatementType statementType = STATEMENT_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionGameplayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.QUESTION_GAMEPLAY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.QUESTION_GAMEPLAY__MANUAL_VALIDATION,
					oldManualValidation, manualValidation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.QUESTION_GAMEPLAY__CATEGORY,
					oldCategory, category));
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
					GeneratorPackage.QUESTION_GAMEPLAY__HAS_INTEGRATED_PROPOSITIONS, oldHasIntegratedPropositions,
					hasIntegratedPropositions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ETaskType> getRestrictedTo() {
		if (restrictedTo == null) {
			restrictedTo = new EDataTypeUniqueEList<ETaskType>(ETaskType.class, this,
					GeneratorPackage.QUESTION_GAMEPLAY__RESTRICTED_TO);
		}
		return restrictedTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EStatementType getStatementType() {
		return statementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatementType(EStatementType newStatementType) {
		EStatementType oldStatementType = statementType;
		statementType = newStatementType == null ? STATEMENT_TYPE_EDEFAULT : newStatementType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.QUESTION_GAMEPLAY__STATEMENT_TYPE,
					oldStatementType, statementType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GeneratorPackage.QUESTION_GAMEPLAY__MANUAL_VALIDATION:
			return isManualValidation();
		case GeneratorPackage.QUESTION_GAMEPLAY__CATEGORY:
			return getCategory();
		case GeneratorPackage.QUESTION_GAMEPLAY__HAS_INTEGRATED_PROPOSITIONS:
			return isHasIntegratedPropositions();
		case GeneratorPackage.QUESTION_GAMEPLAY__RESTRICTED_TO:
			return getRestrictedTo();
		case GeneratorPackage.QUESTION_GAMEPLAY__STATEMENT_TYPE:
			return getStatementType();
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
		case GeneratorPackage.QUESTION_GAMEPLAY__MANUAL_VALIDATION:
			setManualValidation((Boolean) newValue);
			return;
		case GeneratorPackage.QUESTION_GAMEPLAY__CATEGORY:
			setCategory((GPCategory) newValue);
			return;
		case GeneratorPackage.QUESTION_GAMEPLAY__HAS_INTEGRATED_PROPOSITIONS:
			setHasIntegratedPropositions((Boolean) newValue);
			return;
		case GeneratorPackage.QUESTION_GAMEPLAY__RESTRICTED_TO:
			getRestrictedTo().clear();
			getRestrictedTo().addAll((Collection<? extends ETaskType>) newValue);
			return;
		case GeneratorPackage.QUESTION_GAMEPLAY__STATEMENT_TYPE:
			setStatementType((EStatementType) newValue);
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
		case GeneratorPackage.QUESTION_GAMEPLAY__MANUAL_VALIDATION:
			setManualValidation(MANUAL_VALIDATION_EDEFAULT);
			return;
		case GeneratorPackage.QUESTION_GAMEPLAY__CATEGORY:
			setCategory(CATEGORY_EDEFAULT);
			return;
		case GeneratorPackage.QUESTION_GAMEPLAY__HAS_INTEGRATED_PROPOSITIONS:
			setHasIntegratedPropositions(HAS_INTEGRATED_PROPOSITIONS_EDEFAULT);
			return;
		case GeneratorPackage.QUESTION_GAMEPLAY__RESTRICTED_TO:
			getRestrictedTo().clear();
			return;
		case GeneratorPackage.QUESTION_GAMEPLAY__STATEMENT_TYPE:
			setStatementType(STATEMENT_TYPE_EDEFAULT);
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
		case GeneratorPackage.QUESTION_GAMEPLAY__MANUAL_VALIDATION:
			return manualValidation != MANUAL_VALIDATION_EDEFAULT;
		case GeneratorPackage.QUESTION_GAMEPLAY__CATEGORY:
			return category != CATEGORY_EDEFAULT;
		case GeneratorPackage.QUESTION_GAMEPLAY__HAS_INTEGRATED_PROPOSITIONS:
			return hasIntegratedPropositions != HAS_INTEGRATED_PROPOSITIONS_EDEFAULT;
		case GeneratorPackage.QUESTION_GAMEPLAY__RESTRICTED_TO:
			return restrictedTo != null && !restrictedTo.isEmpty();
		case GeneratorPackage.QUESTION_GAMEPLAY__STATEMENT_TYPE:
			return statementType != STATEMENT_TYPE_EDEFAULT;
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
		result.append(" (manualValidation: ");
		result.append(manualValidation);
		result.append(", category: ");
		result.append(category);
		result.append(", hasIntegratedPropositions: ");
		result.append(hasIntegratedPropositions);
		result.append(", restrictedTo: ");
		result.append(restrictedTo);
		result.append(", statementType: ");
		result.append(statementType);
		result.append(')');
		return result.toString();
	}

} //QuestionGameplayImpl
