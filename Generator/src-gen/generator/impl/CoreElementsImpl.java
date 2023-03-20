/**
 */
package generator.impl;

import generator.CoreElement;
import generator.CoreElements;
import generator.GeneratorPackage;

import generator.StructureElement;
import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Core Elements</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.CoreElementsImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link generator.impl.CoreElementsImpl#getStructures <em>Structures</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CoreElementsImpl extends MinimalEObjectImpl.Container implements CoreElements {
	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<CoreElement> elements;

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
	public CoreElementsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.CORE_ELEMENTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CoreElement> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<CoreElement>(CoreElement.class, this,
					GeneratorPackage.CORE_ELEMENTS__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StructureElement> getStructures() {
		if (structures == null) {
			structures = new EObjectContainmentEList<StructureElement>(StructureElement.class, this,
					GeneratorPackage.CORE_ELEMENTS__STRUCTURES);
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
		case GeneratorPackage.CORE_ELEMENTS__ELEMENTS:
			return ((InternalEList<?>) getElements()).basicRemove(otherEnd, msgs);
		case GeneratorPackage.CORE_ELEMENTS__STRUCTURES:
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
		case GeneratorPackage.CORE_ELEMENTS__ELEMENTS:
			return getElements();
		case GeneratorPackage.CORE_ELEMENTS__STRUCTURES:
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
		case GeneratorPackage.CORE_ELEMENTS__ELEMENTS:
			getElements().clear();
			getElements().addAll((Collection<? extends CoreElement>) newValue);
			return;
		case GeneratorPackage.CORE_ELEMENTS__STRUCTURES:
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
		case GeneratorPackage.CORE_ELEMENTS__ELEMENTS:
			getElements().clear();
			return;
		case GeneratorPackage.CORE_ELEMENTS__STRUCTURES:
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
		case GeneratorPackage.CORE_ELEMENTS__ELEMENTS:
			return elements != null && !elements.isEmpty();
		case GeneratorPackage.CORE_ELEMENTS__STRUCTURES:
			return structures != null && !structures.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CoreElementsImpl
