/**
 */
package generator.impl;

import generator.GeneratorPackage;
import generator.ResponseModalities;
import generator.ResponseModality;

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
 * An implementation of the model object '<em><b>Response Modalities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.ResponseModalitiesImpl#getResponsemodalities <em>Responsemodalities</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResponseModalitiesImpl extends MinimalEObjectImpl.Container implements ResponseModalities {
	/**
	 * The cached value of the '{@link #getResponsemodalities() <em>Responsemodalities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsemodalities()
	 * @generated
	 * @ordered
	 */
	protected EList<ResponseModality> responsemodalities;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseModalitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.RESPONSE_MODALITIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResponseModality> getResponsemodalities() {
		if (responsemodalities == null) {
			responsemodalities = new EObjectContainmentEList<ResponseModality>(ResponseModality.class, this,
					GeneratorPackage.RESPONSE_MODALITIES__RESPONSEMODALITIES);
		}
		return responsemodalities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GeneratorPackage.RESPONSE_MODALITIES__RESPONSEMODALITIES:
			return ((InternalEList<?>) getResponsemodalities()).basicRemove(otherEnd, msgs);
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
		case GeneratorPackage.RESPONSE_MODALITIES__RESPONSEMODALITIES:
			return getResponsemodalities();
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
		case GeneratorPackage.RESPONSE_MODALITIES__RESPONSEMODALITIES:
			getResponsemodalities().clear();
			getResponsemodalities().addAll((Collection<? extends ResponseModality>) newValue);
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
		case GeneratorPackage.RESPONSE_MODALITIES__RESPONSEMODALITIES:
			getResponsemodalities().clear();
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
		case GeneratorPackage.RESPONSE_MODALITIES__RESPONSEMODALITIES:
			return responsemodalities != null && !responsemodalities.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ResponseModalitiesImpl
