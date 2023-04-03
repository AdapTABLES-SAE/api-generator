/**
 */
package generator.impl;

import generator.AComponent;
import generator.GeneratorPackage;
import generator.Structure;
import generator.StructureType;

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
 * An implementation of the model object '<em><b>Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.StructureImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link generator.impl.StructureImpl#getStructureType <em>Structure Type</em>}</li>
 *   <li>{@link generator.impl.StructureImpl#isIsPerFact <em>Is Per Fact</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StructureImpl extends AComponentImpl implements Structure {
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
	 * The cached value of the '{@link #getStructureType() <em>Structure Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructureType()
	 * @generated
	 * @ordered
	 */
	protected StructureType structureType;

	/**
	 * The default value of the '{@link #isIsPerFact() <em>Is Per Fact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPerFact()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PER_FACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsPerFact() <em>Is Per Fact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPerFact()
	 * @generated
	 * @ordered
	 */
	protected boolean isPerFact = IS_PER_FACT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.STRUCTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AComponent> getComponents() {
		if (components == null) {
			components = new EObjectContainmentEList<AComponent>(AComponent.class, this,
					GeneratorPackage.STRUCTURE__COMPONENTS);
		}
		return components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureType getStructureType() {
		if (structureType != null && structureType.eIsProxy()) {
			InternalEObject oldStructureType = (InternalEObject) structureType;
			structureType = (StructureType) eResolveProxy(oldStructureType);
			if (structureType != oldStructureType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							GeneratorPackage.STRUCTURE__STRUCTURE_TYPE, oldStructureType, structureType));
			}
		}
		return structureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureType basicGetStructureType() {
		return structureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStructureType(StructureType newStructureType) {
		StructureType oldStructureType = structureType;
		structureType = newStructureType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.STRUCTURE__STRUCTURE_TYPE,
					oldStructureType, structureType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsPerFact() {
		return isPerFact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsPerFact(boolean newIsPerFact) {
		boolean oldIsPerFact = isPerFact;
		isPerFact = newIsPerFact;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.STRUCTURE__IS_PER_FACT, oldIsPerFact,
					isPerFact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GeneratorPackage.STRUCTURE__COMPONENTS:
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
		case GeneratorPackage.STRUCTURE__COMPONENTS:
			return getComponents();
		case GeneratorPackage.STRUCTURE__STRUCTURE_TYPE:
			if (resolve)
				return getStructureType();
			return basicGetStructureType();
		case GeneratorPackage.STRUCTURE__IS_PER_FACT:
			return isIsPerFact();
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
		case GeneratorPackage.STRUCTURE__COMPONENTS:
			getComponents().clear();
			getComponents().addAll((Collection<? extends AComponent>) newValue);
			return;
		case GeneratorPackage.STRUCTURE__STRUCTURE_TYPE:
			setStructureType((StructureType) newValue);
			return;
		case GeneratorPackage.STRUCTURE__IS_PER_FACT:
			setIsPerFact((Boolean) newValue);
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
		case GeneratorPackage.STRUCTURE__COMPONENTS:
			getComponents().clear();
			return;
		case GeneratorPackage.STRUCTURE__STRUCTURE_TYPE:
			setStructureType((StructureType) null);
			return;
		case GeneratorPackage.STRUCTURE__IS_PER_FACT:
			setIsPerFact(IS_PER_FACT_EDEFAULT);
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
		case GeneratorPackage.STRUCTURE__COMPONENTS:
			return components != null && !components.isEmpty();
		case GeneratorPackage.STRUCTURE__STRUCTURE_TYPE:
			return structureType != null;
		case GeneratorPackage.STRUCTURE__IS_PER_FACT:
			return isPerFact != IS_PER_FACT_EDEFAULT;
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
		result.append(" (isPerFact: ");
		result.append(isPerFact);
		result.append(')');
		return result.toString();
	}

} //StructureImpl
