/**
 */
package generator.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import generator.GeneratorPackage;
import generator.MTRecontruction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MT Recontruction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.MTRecontructionImpl#getNbMissingElements <em>Nb Missing Elements</em>}</li>
 *   <li>{@link generator.impl.MTRecontructionImpl#isCheckOnLearnerAction <em>Check On Learner Action</em>}</li>
 *   <li>{@link generator.impl.MTRecontructionImpl#isNoStatementTask <em>No Statement Task</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MTRecontructionImpl extends CompletionTaskImpl implements MTRecontruction {
	/**
	 * The default value of the '{@link #getNbMissingElements() <em>Nb Missing Elements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbMissingElements()
	 * @generated
	 * @ordered
	 */
	protected static final int NB_MISSING_ELEMENTS_EDEFAULT = 3;
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
	 * The default value of the '{@link #isCheckOnLearnerAction() <em>Check On Learner Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCheckOnLearnerAction()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CHECK_ON_LEARNER_ACTION_EDEFAULT = true;
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
	 * The default value of the '{@link #isNoStatementTask() <em>No Statement Task</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNoStatementTask()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NO_STATEMENT_TASK_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isNoStatementTask() <em>No Statement Task</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNoStatementTask()
	 * @generated
	 * @ordered
	 */
	protected boolean noStatementTask = NO_STATEMENT_TASK_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MTRecontructionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.MT_RECONTRUCTION;
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
	public boolean isCheckOnLearnerAction() {
		return checkOnLearnerAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GeneratorPackage.MT_RECONTRUCTION__NB_MISSING_ELEMENTS:
			return getNbMissingElements();
		case GeneratorPackage.MT_RECONTRUCTION__CHECK_ON_LEARNER_ACTION:
			return isCheckOnLearnerAction();
		case GeneratorPackage.MT_RECONTRUCTION__NO_STATEMENT_TASK:
			return isNoStatementTask();
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
		case GeneratorPackage.MT_RECONTRUCTION__CHECK_ON_LEARNER_ACTION:
			setCheckOnLearnerAction((Boolean) newValue);
			return;
		case GeneratorPackage.MT_RECONTRUCTION__NO_STATEMENT_TASK:
			setNoStatementTask((Boolean) newValue);
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
		case GeneratorPackage.MT_RECONTRUCTION__CHECK_ON_LEARNER_ACTION:
			setCheckOnLearnerAction(CHECK_ON_LEARNER_ACTION_EDEFAULT);
			return;
		case GeneratorPackage.MT_RECONTRUCTION__NO_STATEMENT_TASK:
			setNoStatementTask(NO_STATEMENT_TASK_EDEFAULT);
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
		case GeneratorPackage.MT_RECONTRUCTION__NB_MISSING_ELEMENTS:
			return isSetNbMissingElements();
		case GeneratorPackage.MT_RECONTRUCTION__CHECK_ON_LEARNER_ACTION:
			return checkOnLearnerAction != CHECK_ON_LEARNER_ACTION_EDEFAULT;
		case GeneratorPackage.MT_RECONTRUCTION__NO_STATEMENT_TASK:
			return noStatementTask != NO_STATEMENT_TASK_EDEFAULT;
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
		result.append(" (nbMissingElements: ");
		if (nbMissingElementsESet)
			result.append(nbMissingElements);
		else
			result.append("<unset>");
		result.append(", checkOnLearnerAction: ");
		result.append(checkOnLearnerAction);
		result.append(", noStatementTask: ");
		result.append(noStatementTask);
		result.append(')');
		return result.toString();
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
					GeneratorPackage.MT_RECONTRUCTION__CHECK_ON_LEARNER_ACTION, oldCheckOnLearnerAction,
					checkOnLearnerAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNoStatementTask() {
		return noStatementTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNoStatementTask(boolean newNoStatementTask) {
		boolean oldNoStatementTask = noStatementTask;
		noStatementTask = newNoStatementTask;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.MT_RECONTRUCTION__NO_STATEMENT_TASK,
					oldNoStatementTask, noStatementTask));
	}

} //MTRecontructionImpl
