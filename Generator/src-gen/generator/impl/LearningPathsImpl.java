/**
 */
package generator.impl;

import generator.GeneratorPackage;
import generator.LearningPath;
import generator.LearningPaths;

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
 * An implementation of the model object '<em><b>Learning Paths</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.LearningPathsImpl#getLearningpaths <em>Learningpaths</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LearningPathsImpl extends MinimalEObjectImpl.Container implements LearningPaths {
	/**
	 * The cached value of the '{@link #getLearningpaths() <em>Learningpaths</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLearningpaths()
	 * @generated
	 * @ordered
	 */
	protected EList<LearningPath> learningpaths;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LearningPathsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.LEARNING_PATHS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LearningPath> getLearningpaths() {
		if (learningpaths == null) {
			learningpaths = new EObjectContainmentEList<LearningPath>(LearningPath.class, this,
					GeneratorPackage.LEARNING_PATHS__LEARNINGPATHS);
		}
		return learningpaths;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GeneratorPackage.LEARNING_PATHS__LEARNINGPATHS:
			return ((InternalEList<?>) getLearningpaths()).basicRemove(otherEnd, msgs);
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
		case GeneratorPackage.LEARNING_PATHS__LEARNINGPATHS:
			return getLearningpaths();
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
		case GeneratorPackage.LEARNING_PATHS__LEARNINGPATHS:
			getLearningpaths().clear();
			getLearningpaths().addAll((Collection<? extends LearningPath>) newValue);
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
		case GeneratorPackage.LEARNING_PATHS__LEARNINGPATHS:
			getLearningpaths().clear();
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
		case GeneratorPackage.LEARNING_PATHS__LEARNINGPATHS:
			return learningpaths != null && !learningpaths.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LearningPathsImpl
