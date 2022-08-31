/**
 */
package generator.impl;

import generator.CurrentObjectiveLevel;
import generator.GeneratorPackage;
import generator.LearningObjective;
import generator.Level;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Current Objective Level</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.CurrentObjectiveLevelImpl#getLearningobjective <em>Learningobjective</em>}</li>
 *   <li>{@link generator.impl.CurrentObjectiveLevelImpl#isAchieved <em>Achieved</em>}</li>
 *   <li>{@link generator.impl.CurrentObjectiveLevelImpl#getLevel <em>Level</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CurrentObjectiveLevelImpl extends MinimalEObjectImpl.Container implements CurrentObjectiveLevel {
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
	 * The default value of the '{@link #isAchieved() <em>Achieved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAchieved()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ACHIEVED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAchieved() <em>Achieved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAchieved()
	 * @generated
	 * @ordered
	 */
	protected boolean achieved = ACHIEVED_EDEFAULT;

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
	public CurrentObjectiveLevelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.CURRENT_OBJECTIVE_LEVEL;
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
							GeneratorPackage.CURRENT_OBJECTIVE_LEVEL__LEARNINGOBJECTIVE, oldLearningobjective,
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
					GeneratorPackage.CURRENT_OBJECTIVE_LEVEL__LEARNINGOBJECTIVE, oldLearningobjective,
					learningobjective));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAchieved() {
		return achieved;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAchieved(boolean newAchieved) {
		boolean oldAchieved = achieved;
		achieved = newAchieved;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.CURRENT_OBJECTIVE_LEVEL__ACHIEVED,
					oldAchieved, achieved));
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
							GeneratorPackage.CURRENT_OBJECTIVE_LEVEL__LEVEL, oldLevel, level));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.CURRENT_OBJECTIVE_LEVEL__LEVEL,
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
		case GeneratorPackage.CURRENT_OBJECTIVE_LEVEL__LEARNINGOBJECTIVE:
			if (resolve)
				return getLearningobjective();
			return basicGetLearningobjective();
		case GeneratorPackage.CURRENT_OBJECTIVE_LEVEL__ACHIEVED:
			return isAchieved();
		case GeneratorPackage.CURRENT_OBJECTIVE_LEVEL__LEVEL:
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
		case GeneratorPackage.CURRENT_OBJECTIVE_LEVEL__LEARNINGOBJECTIVE:
			setLearningobjective((LearningObjective) newValue);
			return;
		case GeneratorPackage.CURRENT_OBJECTIVE_LEVEL__ACHIEVED:
			setAchieved((Boolean) newValue);
			return;
		case GeneratorPackage.CURRENT_OBJECTIVE_LEVEL__LEVEL:
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
		case GeneratorPackage.CURRENT_OBJECTIVE_LEVEL__LEARNINGOBJECTIVE:
			setLearningobjective((LearningObjective) null);
			return;
		case GeneratorPackage.CURRENT_OBJECTIVE_LEVEL__ACHIEVED:
			setAchieved(ACHIEVED_EDEFAULT);
			return;
		case GeneratorPackage.CURRENT_OBJECTIVE_LEVEL__LEVEL:
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
		case GeneratorPackage.CURRENT_OBJECTIVE_LEVEL__LEARNINGOBJECTIVE:
			return learningobjective != null;
		case GeneratorPackage.CURRENT_OBJECTIVE_LEVEL__ACHIEVED:
			return achieved != ACHIEVED_EDEFAULT;
		case GeneratorPackage.CURRENT_OBJECTIVE_LEVEL__LEVEL:
			return level != null;
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
		result.append(" (achieved: ");
		result.append(achieved);
		result.append(')');
		return result.toString();
	}

} //CurrentObjectiveLevelImpl
