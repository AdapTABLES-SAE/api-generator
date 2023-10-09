/**
 */
package generator.impl;

import generator.GeneratorPackage;
import generator.HChronology;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HChronology</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.HChronologyImpl#isMixDatePeriod <em>Mix Date Period</em>}</li>
 *   <li>{@link generator.impl.HChronologyImpl#isGraphicTask <em>Graphic Task</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HChronologyImpl extends OrderingTaskImpl implements HChronology {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HChronologyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.HCHRONOLOGY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.HCHRONOLOGY__MIX_DATE_PERIOD,
					oldMixDatePeriod, mixDatePeriod));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.HCHRONOLOGY__GRAPHIC_TASK,
					oldGraphicTask, graphicTask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GeneratorPackage.HCHRONOLOGY__MIX_DATE_PERIOD:
			return isMixDatePeriod();
		case GeneratorPackage.HCHRONOLOGY__GRAPHIC_TASK:
			return isGraphicTask();
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
		case GeneratorPackage.HCHRONOLOGY__MIX_DATE_PERIOD:
			setMixDatePeriod((Boolean) newValue);
			return;
		case GeneratorPackage.HCHRONOLOGY__GRAPHIC_TASK:
			setGraphicTask((Boolean) newValue);
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
		case GeneratorPackage.HCHRONOLOGY__MIX_DATE_PERIOD:
			setMixDatePeriod(MIX_DATE_PERIOD_EDEFAULT);
			return;
		case GeneratorPackage.HCHRONOLOGY__GRAPHIC_TASK:
			setGraphicTask(GRAPHIC_TASK_EDEFAULT);
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
		case GeneratorPackage.HCHRONOLOGY__MIX_DATE_PERIOD:
			return mixDatePeriod != MIX_DATE_PERIOD_EDEFAULT;
		case GeneratorPackage.HCHRONOLOGY__GRAPHIC_TASK:
			return graphicTask != GRAPHIC_TASK_EDEFAULT;
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
		result.append(')');
		return result.toString();
	}

} //HChronologyImpl
