/**
 */
package generator.impl;

import generator.GeneratorPackage;
import generator.LocateOnAMap;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Locate On AMap</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.LocateOnAMapImpl#getNbExpectedAnswers <em>Nb Expected Answers</em>}</li>
 *   <li>{@link generator.impl.LocateOnAMapImpl#isLearnersChoices <em>Learners Choices</em>}</li>
 *   <li>{@link generator.impl.LocateOnAMapImpl#isGraphicTask <em>Graphic Task</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LocateOnAMapImpl extends MembershipIDTaskImpl implements LocateOnAMap {
	/**
	 * The default value of the '{@link #getNbExpectedAnswers() <em>Nb Expected Answers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbExpectedAnswers()
	 * @generated
	 * @ordered
	 */
	protected static final int NB_EXPECTED_ANSWERS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNbExpectedAnswers() <em>Nb Expected Answers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbExpectedAnswers()
	 * @generated
	 * @ordered
	 */
	protected int nbExpectedAnswers = NB_EXPECTED_ANSWERS_EDEFAULT;

	/**
	 * The default value of the '{@link #isLearnersChoices() <em>Learners Choices</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLearnersChoices()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LEARNERS_CHOICES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLearnersChoices() <em>Learners Choices</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLearnersChoices()
	 * @generated
	 * @ordered
	 */
	protected boolean learnersChoices = LEARNERS_CHOICES_EDEFAULT;

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
	public LocateOnAMapImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.LOCATE_ON_AMAP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNbExpectedAnswers() {
		return nbExpectedAnswers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbExpectedAnswers(int newNbExpectedAnswers) {
		int oldNbExpectedAnswers = nbExpectedAnswers;
		nbExpectedAnswers = newNbExpectedAnswers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.LOCATE_ON_AMAP__NB_EXPECTED_ANSWERS,
					oldNbExpectedAnswers, nbExpectedAnswers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLearnersChoices() {
		return learnersChoices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLearnersChoices(boolean newLearnersChoices) {
		boolean oldLearnersChoices = learnersChoices;
		learnersChoices = newLearnersChoices;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.LOCATE_ON_AMAP__LEARNERS_CHOICES,
					oldLearnersChoices, learnersChoices));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.LOCATE_ON_AMAP__GRAPHIC_TASK,
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
		case GeneratorPackage.LOCATE_ON_AMAP__NB_EXPECTED_ANSWERS:
			return getNbExpectedAnswers();
		case GeneratorPackage.LOCATE_ON_AMAP__LEARNERS_CHOICES:
			return isLearnersChoices();
		case GeneratorPackage.LOCATE_ON_AMAP__GRAPHIC_TASK:
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
		case GeneratorPackage.LOCATE_ON_AMAP__NB_EXPECTED_ANSWERS:
			setNbExpectedAnswers((Integer) newValue);
			return;
		case GeneratorPackage.LOCATE_ON_AMAP__LEARNERS_CHOICES:
			setLearnersChoices((Boolean) newValue);
			return;
		case GeneratorPackage.LOCATE_ON_AMAP__GRAPHIC_TASK:
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
		case GeneratorPackage.LOCATE_ON_AMAP__NB_EXPECTED_ANSWERS:
			setNbExpectedAnswers(NB_EXPECTED_ANSWERS_EDEFAULT);
			return;
		case GeneratorPackage.LOCATE_ON_AMAP__LEARNERS_CHOICES:
			setLearnersChoices(LEARNERS_CHOICES_EDEFAULT);
			return;
		case GeneratorPackage.LOCATE_ON_AMAP__GRAPHIC_TASK:
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
		case GeneratorPackage.LOCATE_ON_AMAP__NB_EXPECTED_ANSWERS:
			return nbExpectedAnswers != NB_EXPECTED_ANSWERS_EDEFAULT;
		case GeneratorPackage.LOCATE_ON_AMAP__LEARNERS_CHOICES:
			return learnersChoices != LEARNERS_CHOICES_EDEFAULT;
		case GeneratorPackage.LOCATE_ON_AMAP__GRAPHIC_TASK:
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
		result.append(" (nbExpectedAnswers: ");
		result.append(nbExpectedAnswers);
		result.append(", learnersChoices: ");
		result.append(learnersChoices);
		result.append(", graphicTask: ");
		result.append(graphicTask);
		result.append(')');
		return result.toString();
	}

} //LocateOnAMapImpl
