/**
 */
package generator.impl;

import generator.EJudoTarget;
import generator.GeneratorPackage;
import generator.IdentifyTechnique;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Identify Technique</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.IdentifyTechniqueImpl#getNbMissingElements <em>Nb Missing Elements</em>}</li>
 *   <li>{@link generator.impl.IdentifyTechniqueImpl#isCheckOnLearnerAction <em>Check On Learner Action</em>}</li>
 *   <li>{@link generator.impl.IdentifyTechniqueImpl#getMissing <em>Missing</em>}</li>
 *   <li>{@link generator.impl.IdentifyTechniqueImpl#getSource <em>Source</em>}</li>
 *   <li>{@link generator.impl.IdentifyTechniqueImpl#isNoStatementTask <em>No Statement Task</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IdentifyTechniqueImpl extends CompletionTaskImpl implements IdentifyTechnique {
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
	 * The default value of the '{@link #getMissing() <em>Missing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMissing()
	 * @generated
	 * @ordered
	 */
	protected static final EJudoTarget MISSING_EDEFAULT = EJudoTarget.TECHNIQUE;

	/**
	 * The cached value of the '{@link #getMissing() <em>Missing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMissing()
	 * @generated
	 * @ordered
	 */
	protected EJudoTarget missing = MISSING_EDEFAULT;

	/**
	 * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected static final EJudoTarget SOURCE_EDEFAULT = EJudoTarget.NAME;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected EJudoTarget source = SOURCE_EDEFAULT;

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
	public IdentifyTechniqueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.IDENTIFY_TECHNIQUE;
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
	public void setCheckOnLearnerAction(boolean newCheckOnLearnerAction) {
		boolean oldCheckOnLearnerAction = checkOnLearnerAction;
		checkOnLearnerAction = newCheckOnLearnerAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.IDENTIFY_TECHNIQUE__CHECK_ON_LEARNER_ACTION, oldCheckOnLearnerAction,
					checkOnLearnerAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EJudoTarget getMissing() {
		return missing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMissing(EJudoTarget newMissing) {
		EJudoTarget oldMissing = missing;
		missing = newMissing == null ? MISSING_EDEFAULT : newMissing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.IDENTIFY_TECHNIQUE__MISSING,
					oldMissing, missing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EJudoTarget getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(EJudoTarget newSource) {
		EJudoTarget oldSource = source;
		source = newSource == null ? SOURCE_EDEFAULT : newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.IDENTIFY_TECHNIQUE__SOURCE,
					oldSource, source));
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.IDENTIFY_TECHNIQUE__NO_STATEMENT_TASK, oldNoStatementTask, noStatementTask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GeneratorPackage.IDENTIFY_TECHNIQUE__NB_MISSING_ELEMENTS:
			return getNbMissingElements();
		case GeneratorPackage.IDENTIFY_TECHNIQUE__CHECK_ON_LEARNER_ACTION:
			return isCheckOnLearnerAction();
		case GeneratorPackage.IDENTIFY_TECHNIQUE__MISSING:
			return getMissing();
		case GeneratorPackage.IDENTIFY_TECHNIQUE__SOURCE:
			return getSource();
		case GeneratorPackage.IDENTIFY_TECHNIQUE__NO_STATEMENT_TASK:
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
		case GeneratorPackage.IDENTIFY_TECHNIQUE__CHECK_ON_LEARNER_ACTION:
			setCheckOnLearnerAction((Boolean) newValue);
			return;
		case GeneratorPackage.IDENTIFY_TECHNIQUE__MISSING:
			setMissing((EJudoTarget) newValue);
			return;
		case GeneratorPackage.IDENTIFY_TECHNIQUE__SOURCE:
			setSource((EJudoTarget) newValue);
			return;
		case GeneratorPackage.IDENTIFY_TECHNIQUE__NO_STATEMENT_TASK:
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
		case GeneratorPackage.IDENTIFY_TECHNIQUE__CHECK_ON_LEARNER_ACTION:
			setCheckOnLearnerAction(CHECK_ON_LEARNER_ACTION_EDEFAULT);
			return;
		case GeneratorPackage.IDENTIFY_TECHNIQUE__MISSING:
			setMissing(MISSING_EDEFAULT);
			return;
		case GeneratorPackage.IDENTIFY_TECHNIQUE__SOURCE:
			setSource(SOURCE_EDEFAULT);
			return;
		case GeneratorPackage.IDENTIFY_TECHNIQUE__NO_STATEMENT_TASK:
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
		case GeneratorPackage.IDENTIFY_TECHNIQUE__NB_MISSING_ELEMENTS:
			return isSetNbMissingElements();
		case GeneratorPackage.IDENTIFY_TECHNIQUE__CHECK_ON_LEARNER_ACTION:
			return checkOnLearnerAction != CHECK_ON_LEARNER_ACTION_EDEFAULT;
		case GeneratorPackage.IDENTIFY_TECHNIQUE__MISSING:
			return missing != MISSING_EDEFAULT;
		case GeneratorPackage.IDENTIFY_TECHNIQUE__SOURCE:
			return source != SOURCE_EDEFAULT;
		case GeneratorPackage.IDENTIFY_TECHNIQUE__NO_STATEMENT_TASK:
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
		result.append(", missing: ");
		result.append(missing);
		result.append(", source: ");
		result.append(source);
		result.append(", noStatementTask: ");
		result.append(noStatementTask);
		result.append(')');
		return result.toString();
	}

} //IdentifyTechniqueImpl
