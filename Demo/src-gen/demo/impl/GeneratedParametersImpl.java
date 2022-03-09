/**
 */
package demo.impl;

import demo.DemoPackage;
import demo.GeneratedParameters;
import demo.LearningObjective;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generated Parameters</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link demo.impl.GeneratedParametersImpl#getLearningobjective <em>Learningobjective</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GeneratedParametersImpl extends MinimalEObjectImpl.Container implements GeneratedParameters {
	/**
	 * The cached value of the '{@link #getLearningobjective() <em>Learningobjective</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLearningobjective()
	 * @generated
	 * @ordered
	 */
	protected LearningObjective learningobjective;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneratedParametersImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DemoPackage.Literals.GENERATED_PARAMETERS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LearningObjective getLearningobjective() {
		if (learningobjective != null && learningobjective.eIsProxy()) {
			InternalEObject oldLearningobjective = (InternalEObject) learningobjective;
			learningobjective = (LearningObjective) eResolveProxy(oldLearningobjective);
			if (learningobjective != oldLearningobjective) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							DemoPackage.GENERATED_PARAMETERS__LEARNINGOBJECTIVE, oldLearningobjective,
							learningobjective));
			}
		}
		return learningobjective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LearningObjective basicGetLearningobjective() {
		return learningobjective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLearningobjective(LearningObjective newLearningobjective) {
		LearningObjective oldLearningobjective = learningobjective;
		learningobjective = newLearningobjective;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DemoPackage.GENERATED_PARAMETERS__LEARNINGOBJECTIVE,
					oldLearningobjective, learningobjective));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DemoPackage.GENERATED_PARAMETERS__LEARNINGOBJECTIVE:
			if (resolve)
				return getLearningobjective();
			return basicGetLearningobjective();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case DemoPackage.GENERATED_PARAMETERS__LEARNINGOBJECTIVE:
			setLearningobjective((LearningObjective) newValue);
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
		case DemoPackage.GENERATED_PARAMETERS__LEARNINGOBJECTIVE:
			setLearningobjective((LearningObjective) null);
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
		case DemoPackage.GENERATED_PARAMETERS__LEARNINGOBJECTIVE:
			return learningobjective != null;
		}
		return super.eIsSet(featureID);
	}

} //GeneratedParametersImpl
