/**
 */
package generator.impl;

import generator.GeneratorPackage;
import generator.HistoricalChronology;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Historical Chronology</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.HistoricalChronologyImpl#isMixDatePeriod <em>Mix Date Period</em>}</li>
 *   <li>{@link generator.impl.HistoricalChronologyImpl#isGraphicTask <em>Graphic Task</em>}</li>
 *   <li>{@link generator.impl.HistoricalChronologyImpl#isCheckOnLearnerAction <em>Check On Learner Action</em>}</li>
 *   <li>{@link generator.impl.HistoricalChronologyImpl#getNbMissingElements <em>Nb Missing Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HistoricalChronologyImpl extends CompletionTaskImpl implements HistoricalChronology {
	/**
	 * The default value of the '{@link #isMixDatePeriod() <em>Mix Date Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMixDatePeriod()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MIX_DATE_PERIOD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMixDatePeriod() <em>Mix Date Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMixDatePeriod()
	 * @generated
	 * @ordered
	 */
	protected boolean mixDatePeriod = MIX_DATE_PERIOD_EDEFAULT;

	/**
	 * The default value of the '{@link #isGraphicTask() <em>Graphic Task</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGraphicTask()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GRAPHIC_TASK_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isGraphicTask() <em>Graphic Task</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGraphicTask()
	 * @generated
	 * @ordered
	 */
	protected boolean graphicTask = GRAPHIC_TASK_EDEFAULT;

	/**
	 * The default value of the '{@link #isCheckOnLearnerAction() <em>Check On Learner Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCheckOnLearnerAction()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CHECK_ON_LEARNER_ACTION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCheckOnLearnerAction() <em>Check On Learner Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCheckOnLearnerAction()
	 * @generated
	 * @ordered
	 */
	protected boolean checkOnLearnerAction = CHECK_ON_LEARNER_ACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getNbMissingElements() <em>Nb Missing Elements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbMissingElements()
	 * @generated
	 * @ordered
	 */
	protected static final int NB_MISSING_ELEMENTS_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getNbMissingElements() <em>Nb Missing Elements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbMissingElements()
	 * @generated
	 * @ordered
	 */
	protected int nbMissingElements = NB_MISSING_ELEMENTS_EDEFAULT;

	/**
	 * This is true if the Nb Missing Elements attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nbMissingElementsESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoricalChronologyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.HISTORICAL_CHRONOLOGY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMixDatePeriod() {
		return mixDatePeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMixDatePeriod(boolean newMixDatePeriod) {
		boolean oldMixDatePeriod = mixDatePeriod;
		mixDatePeriod = newMixDatePeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.HISTORICAL_CHRONOLOGY__MIX_DATE_PERIOD, oldMixDatePeriod, mixDatePeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGraphicTask() {
		return graphicTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGraphicTask(boolean newGraphicTask) {
		boolean oldGraphicTask = graphicTask;
		graphicTask = newGraphicTask;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.HISTORICAL_CHRONOLOGY__GRAPHIC_TASK,
					oldGraphicTask, graphicTask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCheckOnLearnerAction() {
		return checkOnLearnerAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCheckOnLearnerAction(boolean newCheckOnLearnerAction) {
		boolean oldCheckOnLearnerAction = checkOnLearnerAction;
		checkOnLearnerAction = newCheckOnLearnerAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.HISTORICAL_CHRONOLOGY__CHECK_ON_LEARNER_ACTION, oldCheckOnLearnerAction,
					checkOnLearnerAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNbMissingElements() {
		return nbMissingElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNbMissingElements() {
		return nbMissingElementsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GeneratorPackage.HISTORICAL_CHRONOLOGY__MIX_DATE_PERIOD:
			return isMixDatePeriod();
		case GeneratorPackage.HISTORICAL_CHRONOLOGY__GRAPHIC_TASK:
			return isGraphicTask();
		case GeneratorPackage.HISTORICAL_CHRONOLOGY__CHECK_ON_LEARNER_ACTION:
			return isCheckOnLearnerAction();
		case GeneratorPackage.HISTORICAL_CHRONOLOGY__NB_MISSING_ELEMENTS:
			return getNbMissingElements();
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
		case GeneratorPackage.HISTORICAL_CHRONOLOGY__MIX_DATE_PERIOD:
			setMixDatePeriod((Boolean) newValue);
			return;
		case GeneratorPackage.HISTORICAL_CHRONOLOGY__GRAPHIC_TASK:
			setGraphicTask((Boolean) newValue);
			return;
		case GeneratorPackage.HISTORICAL_CHRONOLOGY__CHECK_ON_LEARNER_ACTION:
			setCheckOnLearnerAction((Boolean) newValue);
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
		case GeneratorPackage.HISTORICAL_CHRONOLOGY__MIX_DATE_PERIOD:
			setMixDatePeriod(MIX_DATE_PERIOD_EDEFAULT);
			return;
		case GeneratorPackage.HISTORICAL_CHRONOLOGY__GRAPHIC_TASK:
			setGraphicTask(GRAPHIC_TASK_EDEFAULT);
			return;
		case GeneratorPackage.HISTORICAL_CHRONOLOGY__CHECK_ON_LEARNER_ACTION:
			setCheckOnLearnerAction(CHECK_ON_LEARNER_ACTION_EDEFAULT);
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
		case GeneratorPackage.HISTORICAL_CHRONOLOGY__MIX_DATE_PERIOD:
			return mixDatePeriod != MIX_DATE_PERIOD_EDEFAULT;
		case GeneratorPackage.HISTORICAL_CHRONOLOGY__GRAPHIC_TASK:
			return graphicTask != GRAPHIC_TASK_EDEFAULT;
		case GeneratorPackage.HISTORICAL_CHRONOLOGY__CHECK_ON_LEARNER_ACTION:
			return checkOnLearnerAction != CHECK_ON_LEARNER_ACTION_EDEFAULT;
		case GeneratorPackage.HISTORICAL_CHRONOLOGY__NB_MISSING_ELEMENTS:
			return isSetNbMissingElements();
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
		result.append(" (mixDatePeriod: ");
		result.append(mixDatePeriod);
		result.append(", graphicTask: ");
		result.append(graphicTask);
		result.append(", checkOnLearnerAction: ");
		result.append(checkOnLearnerAction);
		result.append(", nbMissingElements: ");
		if (nbMissingElementsESet)
			result.append(nbMissingElements);
		else
			result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //HistoricalChronologyImpl
