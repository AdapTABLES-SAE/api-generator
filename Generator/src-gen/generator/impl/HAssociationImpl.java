/**
 */
package generator.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import generator.EHistoryTarget;
import generator.ETimeTarget;
import generator.GeneratorPackage;
import generator.HAssociation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HAssociation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.HAssociationImpl#getSource <em>Source</em>}</li>
 *   <li>{@link generator.impl.HAssociationImpl#getMissing <em>Missing</em>}</li>
 *   <li>{@link generator.impl.HAssociationImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link generator.impl.HAssociationImpl#isCheckOnLearnerAction <em>Check On Learner Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HAssociationImpl extends CompletionTaskImpl implements HAssociation {
	/**
	 * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected static final EHistoryTarget SOURCE_EDEFAULT = EHistoryTarget.EVENT;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected EHistoryTarget source = SOURCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMissing() <em>Missing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMissing()
	 * @generated
	 * @ordered
	 */
	protected static final EHistoryTarget MISSING_EDEFAULT = EHistoryTarget.TIME;

	/**
	 * The cached value of the '{@link #getMissing() <em>Missing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMissing()
	 * @generated
	 * @ordered
	 */
	protected EHistoryTarget missing = MISSING_EDEFAULT;

	/**
	 * The default value of the '{@link #getTarget() <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected static final ETimeTarget TARGET_EDEFAULT = ETimeTarget.NONE;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected ETimeTarget target = TARGET_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HAssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.HASSOCIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EHistoryTarget getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(EHistoryTarget newSource) {
		EHistoryTarget oldSource = source;
		source = newSource == null ? SOURCE_EDEFAULT : newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.HASSOCIATION__SOURCE, oldSource,
					source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EHistoryTarget getMissing() {
		return missing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMissing(EHistoryTarget newMissing) {
		EHistoryTarget oldMissing = missing;
		missing = newMissing == null ? MISSING_EDEFAULT : newMissing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.HASSOCIATION__MISSING, oldMissing,
					missing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ETimeTarget getTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(ETimeTarget newTarget) {
		ETimeTarget oldTarget = target;
		target = newTarget == null ? TARGET_EDEFAULT : newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.HASSOCIATION__TARGET, oldTarget,
					target));
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
		case GeneratorPackage.HASSOCIATION__SOURCE:
			return getSource();
		case GeneratorPackage.HASSOCIATION__MISSING:
			return getMissing();
		case GeneratorPackage.HASSOCIATION__TARGET:
			return getTarget();
		case GeneratorPackage.HASSOCIATION__CHECK_ON_LEARNER_ACTION:
			return isCheckOnLearnerAction();
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
		case GeneratorPackage.HASSOCIATION__SOURCE:
			setSource((EHistoryTarget) newValue);
			return;
		case GeneratorPackage.HASSOCIATION__MISSING:
			setMissing((EHistoryTarget) newValue);
			return;
		case GeneratorPackage.HASSOCIATION__TARGET:
			setTarget((ETimeTarget) newValue);
			return;
		case GeneratorPackage.HASSOCIATION__CHECK_ON_LEARNER_ACTION:
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
		case GeneratorPackage.HASSOCIATION__SOURCE:
			setSource(SOURCE_EDEFAULT);
			return;
		case GeneratorPackage.HASSOCIATION__MISSING:
			setMissing(MISSING_EDEFAULT);
			return;
		case GeneratorPackage.HASSOCIATION__TARGET:
			setTarget(TARGET_EDEFAULT);
			return;
		case GeneratorPackage.HASSOCIATION__CHECK_ON_LEARNER_ACTION:
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
		case GeneratorPackage.HASSOCIATION__SOURCE:
			return source != SOURCE_EDEFAULT;
		case GeneratorPackage.HASSOCIATION__MISSING:
			return missing != MISSING_EDEFAULT;
		case GeneratorPackage.HASSOCIATION__TARGET:
			return target != TARGET_EDEFAULT;
		case GeneratorPackage.HASSOCIATION__CHECK_ON_LEARNER_ACTION:
			return checkOnLearnerAction != CHECK_ON_LEARNER_ACTION_EDEFAULT;
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
		result.append(" (source: ");
		result.append(source);
		result.append(", missing: ");
		result.append(missing);
		result.append(", target: ");
		result.append(target);
		result.append(", checkOnLearnerAction: ");
		result.append(checkOnLearnerAction);
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
					GeneratorPackage.HASSOCIATION__CHECK_ON_LEARNER_ACTION, oldCheckOnLearnerAction,
					checkOnLearnerAction));
	}

	@Override
	public int getNbMissingElements() {
		if (this.target.equals(ETimeTarget.DATE) || this.target.equals(ETimeTarget.MIX)) {
			return 1 * this.getNbFacts();
		} else {
			return 2 * this.getNbFacts();
		}
	}

} //HAssociationImpl
