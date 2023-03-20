/**
 */
package generator.impl;

import generator.GPCategory;
import generator.GPType;
import generator.Gameplay;
import generator.GeneratorPackage;
import generator.QuantifiedElements;
import generator.StatementType;
import generator.StructureElement;
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
 *   <li>{@link generator.impl.GameplayImpl#getQuantifiedElements <em>Quantified Elements</em>}</li>
 *   <li>{@link generator.impl.GameplayImpl#getName <em>Name</em>}</li>
 *   <li>{@link generator.impl.GameplayImpl#getAllowedStatements <em>Allowed Statements</em>}</li>
 *   <li>{@link generator.impl.GameplayImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link generator.impl.GameplayImpl#getType <em>Type</em>}</li>
 *   <li>{@link generator.impl.GameplayImpl#getStructures <em>Structures</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GameplayImpl extends MinimalEObjectImpl.Container implements Gameplay {
	/**
	 * The cached value of the '{@link #getQuantifiedElements() <em>Quantified Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantifiedElements()
	 * @generated
	 * @ordered
	 */
	protected EList<QuantifiedElements> quantifiedElements;

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
	 * The cached value of the '{@link #getAllowedStatements() <em>Allowed Statements</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowedStatements()
	 * @generated
	 * @ordered
	 */
	protected EList<StatementType> allowedStatements;

	/**
	 * The default value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected static final GPCategory CATEGORY_EDEFAULT = GPCategory.POSITION;

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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final GPType TYPE_EDEFAULT = GPType.UNIQUE;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected GPType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStructures() <em>Structures</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructures()
	 * @generated
	 * @ordered
	 */
	protected EList<StructureElement> structures;

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
	public EList<QuantifiedElements> getQuantifiedElements() {
		if (quantifiedElements == null) {
			quantifiedElements = new EObjectContainmentEList<QuantifiedElements>(QuantifiedElements.class, this,
					GeneratorPackage.GAMEPLAY__QUANTIFIED_ELEMENTS);
		}
		return quantifiedElements;
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
	public EList<StatementType> getAllowedStatements() {
		if (allowedStatements == null) {
			allowedStatements = new EDataTypeUniqueEList<StatementType>(StatementType.class, this,
					GeneratorPackage.GAMEPLAY__ALLOWED_STATEMENTS);
		}
		return allowedStatements;
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
	public GPType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(GPType newType) {
		GPType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.GAMEPLAY__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StructureElement> getStructures() {
		if (structures == null) {
			structures = new EObjectContainmentEList<StructureElement>(StructureElement.class, this,
					GeneratorPackage.GAMEPLAY__STRUCTURES);
		}
		return structures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GeneratorPackage.GAMEPLAY__QUANTIFIED_ELEMENTS:
			return ((InternalEList<?>) getQuantifiedElements()).basicRemove(otherEnd, msgs);
		case GeneratorPackage.GAMEPLAY__STRUCTURES:
			return ((InternalEList<?>) getStructures()).basicRemove(otherEnd, msgs);
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
		case GeneratorPackage.GAMEPLAY__QUANTIFIED_ELEMENTS:
			return getQuantifiedElements();
		case GeneratorPackage.GAMEPLAY__NAME:
			return getName();
		case GeneratorPackage.GAMEPLAY__ALLOWED_STATEMENTS:
			return getAllowedStatements();
		case GeneratorPackage.GAMEPLAY__CATEGORY:
			return getCategory();
		case GeneratorPackage.GAMEPLAY__TYPE:
			return getType();
		case GeneratorPackage.GAMEPLAY__STRUCTURES:
			return getStructures();
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
		case GeneratorPackage.GAMEPLAY__QUANTIFIED_ELEMENTS:
			getQuantifiedElements().clear();
			getQuantifiedElements().addAll((Collection<? extends QuantifiedElements>) newValue);
			return;
		case GeneratorPackage.GAMEPLAY__NAME:
			setName((String) newValue);
			return;
		case GeneratorPackage.GAMEPLAY__ALLOWED_STATEMENTS:
			getAllowedStatements().clear();
			getAllowedStatements().addAll((Collection<? extends StatementType>) newValue);
			return;
		case GeneratorPackage.GAMEPLAY__CATEGORY:
			setCategory((GPCategory) newValue);
			return;
		case GeneratorPackage.GAMEPLAY__TYPE:
			setType((GPType) newValue);
			return;
		case GeneratorPackage.GAMEPLAY__STRUCTURES:
			getStructures().clear();
			getStructures().addAll((Collection<? extends StructureElement>) newValue);
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
		case GeneratorPackage.GAMEPLAY__QUANTIFIED_ELEMENTS:
			getQuantifiedElements().clear();
			return;
		case GeneratorPackage.GAMEPLAY__NAME:
			setName(NAME_EDEFAULT);
			return;
		case GeneratorPackage.GAMEPLAY__ALLOWED_STATEMENTS:
			getAllowedStatements().clear();
			return;
		case GeneratorPackage.GAMEPLAY__CATEGORY:
			setCategory(CATEGORY_EDEFAULT);
			return;
		case GeneratorPackage.GAMEPLAY__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case GeneratorPackage.GAMEPLAY__STRUCTURES:
			getStructures().clear();
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
		case GeneratorPackage.GAMEPLAY__QUANTIFIED_ELEMENTS:
			return quantifiedElements != null && !quantifiedElements.isEmpty();
		case GeneratorPackage.GAMEPLAY__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case GeneratorPackage.GAMEPLAY__ALLOWED_STATEMENTS:
			return allowedStatements != null && !allowedStatements.isEmpty();
		case GeneratorPackage.GAMEPLAY__CATEGORY:
			return category != CATEGORY_EDEFAULT;
		case GeneratorPackage.GAMEPLAY__TYPE:
			return type != TYPE_EDEFAULT;
		case GeneratorPackage.GAMEPLAY__STRUCTURES:
			return structures != null && !structures.isEmpty();
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
		result.append(", allowedStatements: ");
		result.append(allowedStatements);
		result.append(", category: ");
		result.append(category);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //GameplayImpl
