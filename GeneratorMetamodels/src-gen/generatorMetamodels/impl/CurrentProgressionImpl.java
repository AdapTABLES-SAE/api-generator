/**
 */
package generatorMetamodels.impl;

import generatorMetamodels.CurrentProgression;
import generatorMetamodels.GeneratorMetamodelsPackage;
import generatorMetamodels.LearningObjective;
import generatorMetamodels.Level;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Current Progression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generatorMetamodels.impl.CurrentProgressionImpl#getLearningobjective <em>Learningobjective</em>}</li>
 *   <li>{@link generatorMetamodels.impl.CurrentProgressionImpl#getLevel <em>Level</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CurrentProgressionImpl extends MinimalEObjectImpl.Container implements CurrentProgression {
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
	 * The cached value of the '{@link #getLevel() <em>Level</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected Level level;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CurrentProgressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorMetamodelsPackage.Literals.CURRENT_PROGRESSION;
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
							GeneratorMetamodelsPackage.CURRENT_PROGRESSION__LEARNINGOBJECTIVE, oldLearningobjective,
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					GeneratorMetamodelsPackage.CURRENT_PROGRESSION__LEARNINGOBJECTIVE, oldLearningobjective,
					learningobjective));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Level getLevel() {
		if (level != null && level.eIsProxy()) {
			InternalEObject oldLevel = (InternalEObject) level;
			level = (Level) eResolveProxy(oldLevel);
			if (level != oldLevel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							GeneratorMetamodelsPackage.CURRENT_PROGRESSION__LEVEL, oldLevel, level));
			}
		}
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Level basicGetLevel() {
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel(Level newLevel) {
		Level oldLevel = level;
		level = newLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorMetamodelsPackage.CURRENT_PROGRESSION__LEVEL,
					oldLevel, level));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GeneratorMetamodelsPackage.CURRENT_PROGRESSION__LEARNINGOBJECTIVE:
			if (resolve)
				return getLearningobjective();
			return basicGetLearningobjective();
		case GeneratorMetamodelsPackage.CURRENT_PROGRESSION__LEVEL:
			if (resolve)
				return getLevel();
			return basicGetLevel();
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
		case GeneratorMetamodelsPackage.CURRENT_PROGRESSION__LEARNINGOBJECTIVE:
			setLearningobjective((LearningObjective) newValue);
			return;
		case GeneratorMetamodelsPackage.CURRENT_PROGRESSION__LEVEL:
			setLevel((Level) newValue);
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
		case GeneratorMetamodelsPackage.CURRENT_PROGRESSION__LEARNINGOBJECTIVE:
			setLearningobjective((LearningObjective) null);
			return;
		case GeneratorMetamodelsPackage.CURRENT_PROGRESSION__LEVEL:
			setLevel((Level) null);
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
		case GeneratorMetamodelsPackage.CURRENT_PROGRESSION__LEARNINGOBJECTIVE:
			return learningobjective != null;
		case GeneratorMetamodelsPackage.CURRENT_PROGRESSION__LEVEL:
			return level != null;
		}
		return super.eIsSet(featureID);
	}

} //CurrentProgressionImpl
