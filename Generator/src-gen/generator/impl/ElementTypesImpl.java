/**
 */
package generator.impl;

import generator.ElementType;
import generator.ElementTypes;
import generator.GeneratorPackage;

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
 * An implementation of the model object '<em><b>Element Types</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.ElementTypesImpl#getElementtypes <em>Elementtypes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElementTypesImpl extends MinimalEObjectImpl.Container implements ElementTypes {
	/**
	 * The cached value of the '{@link #getElementtypes() <em>Elementtypes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementtypes()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementType> elementtypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementTypesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.ELEMENT_TYPES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElementType> getElementtypes() {
		if (elementtypes == null) {
			elementtypes = new EObjectContainmentEList<ElementType>(ElementType.class, this,
					GeneratorPackage.ELEMENT_TYPES__ELEMENTTYPES);
		}
		return elementtypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GeneratorPackage.ELEMENT_TYPES__ELEMENTTYPES:
			return ((InternalEList<?>) getElementtypes()).basicRemove(otherEnd, msgs);
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
		case GeneratorPackage.ELEMENT_TYPES__ELEMENTTYPES:
			return getElementtypes();
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
		case GeneratorPackage.ELEMENT_TYPES__ELEMENTTYPES:
			getElementtypes().clear();
			getElementtypes().addAll((Collection<? extends ElementType>) newValue);
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
		case GeneratorPackage.ELEMENT_TYPES__ELEMENTTYPES:
			getElementtypes().clear();
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
		case GeneratorPackage.ELEMENT_TYPES__ELEMENTTYPES:
			return elementtypes != null && !elementtypes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ElementTypesImpl
