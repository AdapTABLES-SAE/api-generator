/**
 */
package generator.impl;

import generator.CurrentObjectiveLevel;
import generator.GeneratorPackage;
import generator.Level;
import generator.Objective;
import generator.Results;

import java.util.Objects;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

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
 *   <li>{@link generator.impl.CurrentObjectiveLevelImpl#getObjective <em>Objective</em>}</li>
 *   <li>{@link generator.impl.CurrentObjectiveLevelImpl#isAchieved <em>Achieved</em>}</li>
 *   <li>{@link generator.impl.CurrentObjectiveLevelImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link generator.impl.CurrentObjectiveLevelImpl#getResults <em>Results</em>}</li>
 *   <li>{@link generator.impl.CurrentObjectiveLevelImpl#getEncountersPercent <em>Encounters Percent</em>}</li>
 *   <li>{@link generator.impl.CurrentObjectiveLevelImpl#getSucessPercent <em>Sucess Percent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CurrentObjectiveLevelImpl extends MinimalEObjectImpl.Container implements CurrentObjectiveLevel {
	/**
	 * The cached value of the '{@link #getObjective() <em>Objective</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjective()
	 * @generated
	 * @ordered
	 */
	protected Objective objective;

	/**
	 * The default value of the '{@link #isAchieved() <em>Achieved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAchieved()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ACHIEVED_EDEFAULT = true;

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
	 * The cached value of the '{@link #getResults() <em>Results</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResults()
	 * @generated
	 * @ordered
	 */
	protected Results results;

	/**
	 * The default value of the '{@link #getEncountersPercent() <em>Encounters Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncountersPercent()
	 * @generated
	 * @ordered
	 */
	protected static final double ENCOUNTERS_PERCENT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getEncountersPercent() <em>Encounters Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncountersPercent()
	 * @generated
	 * @ordered
	 */
	protected double encountersPercent = ENCOUNTERS_PERCENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSucessPercent() <em>Sucess Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSucessPercent()
	 * @generated
	 * @ordered
	 */
	protected static final double SUCESS_PERCENT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSucessPercent() <em>Sucess Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSucessPercent()
	 * @generated
	 * @ordered
	 */
	protected double sucessPercent = SUCESS_PERCENT_EDEFAULT;

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
	public Objective getObjective() {
		if (objective != null && objective.eIsProxy()) {
			InternalEObject oldObjective = (InternalEObject) objective;
			objective = (Objective) eResolveProxy(oldObjective);
			if (objective != oldObjective) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							GeneratorPackage.CURRENT_OBJECTIVE_LEVEL__OBJECTIVE, oldObjective, objective));
			}
		}
		return objective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Objective basicGetObjective() {
		return objective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjective(Objective newObjective) {
		Objective oldObjective = objective;
		objective = newObjective;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.CURRENT_OBJECTIVE_LEVEL__OBJECTIVE,
					oldObjective, objective));
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
	public Results getResults() {
		return results;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResults(Results newResults, NotificationChain msgs) {
		Results oldResults = results;
		results = newResults;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.CURRENT_OBJECTIVE_LEVEL__RESULTS, oldResults, newResults);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResults(Results newResults) {
		if (newResults != results) {
			NotificationChain msgs = null;
			if (results != null)
				msgs = ((InternalEObject) results).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.CURRENT_OBJECTIVE_LEVEL__RESULTS, null, msgs);
			if (newResults != null)
				msgs = ((InternalEObject) newResults).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.CURRENT_OBJECTIVE_LEVEL__RESULTS, null, msgs);
			msgs = basicSetResults(newResults, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.CURRENT_OBJECTIVE_LEVEL__RESULTS,
					newResults, newResults));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getEncountersPercent() {
		return encountersPercent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEncountersPercent(double newEncountersPercent) {
		double oldEncountersPercent = encountersPercent;
		encountersPercent = newEncountersPercent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.CURRENT_OBJECTIVE_LEVEL__ENCOUNTERS_PERCENT, oldEncountersPercent,
					encountersPercent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSucessPercent() {
		return sucessPercent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSucessPercent(double newSucessPercent) {
		double oldSucessPercent = sucessPercent;
		sucessPercent = newSucessPercent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.CURRENT_OBJECTIVE_LEVEL__SUCESS_PERCENT, oldSucessPercent, sucessPercent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GeneratorPackage.CURRENT_OBJECTIVE_LEVEL__RESULTS:
			return basicSetResults(null, msgs);
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
		case GeneratorPackage.CURRENT_OBJECTIVE_LEVEL__OBJECTIVE:
			if (resolve)
				return getObjective();
			return basicGetObjective();
		case GeneratorPackage.CURRENT_OBJECTIVE_LEVEL__ACHIEVED:
			return isAchieved();
		case GeneratorPackage.CURRENT_OBJECTIVE_LEVEL__LEVEL:
			if (resolve)
				return getLevel();
			return basicGetLevel();
		case GeneratorPackage.CURRENT_OBJECTIVE_LEVEL__RESULTS:
			return getResults();
		case GeneratorPackage.CURRENT_OBJECTIVE_LEVEL__ENCOUNTERS_PERCENT:
			return getEncountersPercent();
		case GeneratorPackage.CURRENT_OBJECTIVE_LEVEL__SUCESS_PERCENT:
			return getSucessPercent();
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
		case GeneratorPackage.CURRENT_OBJECTIVE_LEVEL__OBJECTIVE:
			setObjective((Objective) newValue);
			return;
		case GeneratorPackage.CURRENT_OBJECTIVE_LEVEL__ACHIEVED:
			setAchieved((Boolean) newValue);
			return;
		case GeneratorPackage.CURRENT_OBJECTIVE_LEVEL__LEVEL:
			setLevel((Level) newValue);
			return;
		case GeneratorPackage.CURRENT_OBJECTIVE_LEVEL__RESULTS:
			setResults((Results) newValue);
			return;
		case GeneratorPackage.CURRENT_OBJECTIVE_LEVEL__ENCOUNTERS_PERCENT:
			setEncountersPercent((Double) newValue);
			return;
		case GeneratorPackage.CURRENT_OBJECTIVE_LEVEL__SUCESS_PERCENT:
			setSucessPercent((Double) newValue);
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
		case GeneratorPackage.CURRENT_OBJECTIVE_LEVEL__OBJECTIVE:
			setObjective((Objective) null);
			return;
		case GeneratorPackage.CURRENT_OBJECTIVE_LEVEL__ACHIEVED:
			setAchieved(ACHIEVED_EDEFAULT);
			return;
		case GeneratorPackage.CURRENT_OBJECTIVE_LEVEL__LEVEL:
			setLevel((Level) null);
			return;
		case GeneratorPackage.CURRENT_OBJECTIVE_LEVEL__RESULTS:
			setResults((Results) null);
			return;
		case GeneratorPackage.CURRENT_OBJECTIVE_LEVEL__ENCOUNTERS_PERCENT:
			setEncountersPercent(ENCOUNTERS_PERCENT_EDEFAULT);
			return;
		case GeneratorPackage.CURRENT_OBJECTIVE_LEVEL__SUCESS_PERCENT:
			setSucessPercent(SUCESS_PERCENT_EDEFAULT);
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
		case GeneratorPackage.CURRENT_OBJECTIVE_LEVEL__OBJECTIVE:
			return objective != null;
		case GeneratorPackage.CURRENT_OBJECTIVE_LEVEL__ACHIEVED:
			return achieved != ACHIEVED_EDEFAULT;
		case GeneratorPackage.CURRENT_OBJECTIVE_LEVEL__LEVEL:
			return level != null;
		case GeneratorPackage.CURRENT_OBJECTIVE_LEVEL__RESULTS:
			return results != null;
		case GeneratorPackage.CURRENT_OBJECTIVE_LEVEL__ENCOUNTERS_PERCENT:
			return encountersPercent != ENCOUNTERS_PERCENT_EDEFAULT;
		case GeneratorPackage.CURRENT_OBJECTIVE_LEVEL__SUCESS_PERCENT:
			return sucessPercent != SUCESS_PERCENT_EDEFAULT;
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
		result.append(", encountersPercent: ");
		result.append(encountersPercent);
		result.append(", sucessPercent: ");
		result.append(sucessPercent);
		result.append(')');
		return result.toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(achieved, level, objective, results);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CurrentObjectiveLevelImpl other = (CurrentObjectiveLevelImpl) obj;
		return achieved == other.achieved && Objects.equals(level, other.level)
				&& Objects.equals(objective, other.objective) && Objects.equals(results, other.results);
	}

} //CurrentObjectiveLevelImpl
