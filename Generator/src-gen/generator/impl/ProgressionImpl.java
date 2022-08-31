/**
 */
package generator.impl;

import generator.CurrentObjectiveLevel;
import generator.GeneratorPackage;
import generator.Progression;

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
 * An implementation of the model object '<em><b>Progression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.ProgressionImpl#getCurrentobjectivelevels <em>Currentobjectivelevels</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgressionImpl extends MinimalEObjectImpl.Container implements Progression {
	/**
	 * The cached value of the '{@link #getCurrentobjectivelevels() <em>Currentobjectivelevels</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentobjectivelevels()
	 * @generated
	 * @ordered
	 */
	protected EList<CurrentObjectiveLevel> currentobjectivelevels;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.PROGRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CurrentObjectiveLevel> getCurrentobjectivelevels() {
		if (currentobjectivelevels == null) {
			currentobjectivelevels = new EObjectContainmentEList<CurrentObjectiveLevel>(CurrentObjectiveLevel.class,
					this, GeneratorPackage.PROGRESSION__CURRENTOBJECTIVELEVELS);
		}
		return currentobjectivelevels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GeneratorPackage.PROGRESSION__CURRENTOBJECTIVELEVELS:
			return ((InternalEList<?>) getCurrentobjectivelevels()).basicRemove(otherEnd, msgs);
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
		case GeneratorPackage.PROGRESSION__CURRENTOBJECTIVELEVELS:
			return getCurrentobjectivelevels();
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
		case GeneratorPackage.PROGRESSION__CURRENTOBJECTIVELEVELS:
			getCurrentobjectivelevels().clear();
			getCurrentobjectivelevels().addAll((Collection<? extends CurrentObjectiveLevel>) newValue);
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
		case GeneratorPackage.PROGRESSION__CURRENTOBJECTIVELEVELS:
			getCurrentobjectivelevels().clear();
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
		case GeneratorPackage.PROGRESSION__CURRENTOBJECTIVELEVELS:
			return currentobjectivelevels != null && !currentobjectivelevels.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProgressionImpl
