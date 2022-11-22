/**
 */
package generator.impl;

import generator.ComplianceRelations;
import generator.GeneratorPackage;
import generator.MappingModel;

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
 * An implementation of the model object '<em><b>Mapping Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.MappingModelImpl#getCompliancerelations <em>Compliancerelations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MappingModelImpl extends MinimalEObjectImpl.Container implements MappingModel {
	/**
	 * The cached value of the '{@link #getCompliancerelations() <em>Compliancerelations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompliancerelations()
	 * @generated
	 * @ordered
	 */
	protected EList<ComplianceRelations> compliancerelations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.MAPPING_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComplianceRelations> getCompliancerelations() {
		if (compliancerelations == null) {
			compliancerelations = new EObjectContainmentEList<ComplianceRelations>(ComplianceRelations.class, this,
					GeneratorPackage.MAPPING_MODEL__COMPLIANCERELATIONS);
		}
		return compliancerelations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GeneratorPackage.MAPPING_MODEL__COMPLIANCERELATIONS:
			return ((InternalEList<?>) getCompliancerelations()).basicRemove(otherEnd, msgs);
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
		case GeneratorPackage.MAPPING_MODEL__COMPLIANCERELATIONS:
			return getCompliancerelations();
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
		case GeneratorPackage.MAPPING_MODEL__COMPLIANCERELATIONS:
			getCompliancerelations().clear();
			getCompliancerelations().addAll((Collection<? extends ComplianceRelations>) newValue);
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
		case GeneratorPackage.MAPPING_MODEL__COMPLIANCERELATIONS:
			getCompliancerelations().clear();
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
		case GeneratorPackage.MAPPING_MODEL__COMPLIANCERELATIONS:
			return compliancerelations != null && !compliancerelations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MappingModelImpl
