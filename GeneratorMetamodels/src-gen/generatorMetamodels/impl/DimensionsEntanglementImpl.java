/**
 */
package generatorMetamodels.impl;

import generatorMetamodels.DimensionsEntanglement;
import generatorMetamodels.GeneratorMetamodelsPackage;
import generatorMetamodels.SemanticRelation;

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
 * An implementation of the model object '<em><b>Dimensions Entanglement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generatorMetamodels.impl.DimensionsEntanglementImpl#getSemanticrelations <em>Semanticrelations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DimensionsEntanglementImpl extends MinimalEObjectImpl.Container implements DimensionsEntanglement {
	/**
	 * The cached value of the '{@link #getSemanticrelations() <em>Semanticrelations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticrelations()
	 * @generated
	 * @ordered
	 */
	protected EList<SemanticRelation> semanticrelations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DimensionsEntanglementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorMetamodelsPackage.Literals.DIMENSIONS_ENTANGLEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SemanticRelation> getSemanticrelations() {
		if (semanticrelations == null) {
			semanticrelations = new EObjectContainmentEList<SemanticRelation>(SemanticRelation.class, this,
					GeneratorMetamodelsPackage.DIMENSIONS_ENTANGLEMENT__SEMANTICRELATIONS);
		}
		return semanticrelations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GeneratorMetamodelsPackage.DIMENSIONS_ENTANGLEMENT__SEMANTICRELATIONS:
			return ((InternalEList<?>) getSemanticrelations()).basicRemove(otherEnd, msgs);
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
		case GeneratorMetamodelsPackage.DIMENSIONS_ENTANGLEMENT__SEMANTICRELATIONS:
			return getSemanticrelations();
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
		case GeneratorMetamodelsPackage.DIMENSIONS_ENTANGLEMENT__SEMANTICRELATIONS:
			getSemanticrelations().clear();
			getSemanticrelations().addAll((Collection<? extends SemanticRelation>) newValue);
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
		case GeneratorMetamodelsPackage.DIMENSIONS_ENTANGLEMENT__SEMANTICRELATIONS:
			getSemanticrelations().clear();
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
		case GeneratorMetamodelsPackage.DIMENSIONS_ENTANGLEMENT__SEMANTICRELATIONS:
			return semanticrelations != null && !semanticrelations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DimensionsEntanglementImpl
