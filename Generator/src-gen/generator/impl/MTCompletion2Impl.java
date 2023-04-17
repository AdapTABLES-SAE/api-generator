/**
 */
package generator.impl;

import generator.ESeveralTarget;
import generator.GeneratorPackage;
import generator.MTCompletion2;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MT Completion2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.MTCompletion2Impl#getTargets <em>Targets</em>}</li>
 *   <li>{@link generator.impl.MTCompletion2Impl#getNbMissingElements <em>Nb Missing Elements</em>}</li>
 *   <li>{@link generator.impl.MTCompletion2Impl#isCheckLearnerAction <em>Check Learner Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MTCompletion2Impl extends CompletionTaskImpl implements MTCompletion2 {
	/**
	 * The cached value of the '{@link #getTargets() <em>Targets</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargets()
	 * @generated
	 * @ordered
	 */
	protected EList<ESeveralTarget> targets;

	/**
	 * The default value of the '{@link #getNbMissingElements() <em>Nb Missing Elements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbMissingElements()
	 * @generated
	 * @ordered
	 */
	protected static final int NB_MISSING_ELEMENTS_EDEFAULT = 2;
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
	 * The default value of the '{@link #isCheckLearnerAction() <em>Check Learner Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCheckLearnerAction()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CHECK_LEARNER_ACTION_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isCheckLearnerAction() <em>Check Learner Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCheckLearnerAction()
	 * @generated
	 * @ordered
	 */
	protected boolean checkLearnerAction = CHECK_LEARNER_ACTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MTCompletion2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.MT_COMPLETION2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ESeveralTarget> getTargets() {
		if (targets == null) {
			targets = new EDataTypeUniqueEList<ESeveralTarget>(ESeveralTarget.class, this,
					GeneratorPackage.MT_COMPLETION2__TARGETS);
		}
		return targets;
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
	public boolean isCheckLearnerAction() {
		return checkLearnerAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCheckLearnerAction(boolean newCheckLearnerAction) {
		boolean oldCheckLearnerAction = checkLearnerAction;
		checkLearnerAction = newCheckLearnerAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.MT_COMPLETION2__CHECK_LEARNER_ACTION,
					oldCheckLearnerAction, checkLearnerAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GeneratorPackage.MT_COMPLETION2__TARGETS:
			return getTargets();
		case GeneratorPackage.MT_COMPLETION2__NB_MISSING_ELEMENTS:
			return getNbMissingElements();
		case GeneratorPackage.MT_COMPLETION2__CHECK_LEARNER_ACTION:
			return isCheckLearnerAction();
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
		case GeneratorPackage.MT_COMPLETION2__TARGETS:
			getTargets().clear();
			getTargets().addAll((Collection<? extends ESeveralTarget>) newValue);
			return;
		case GeneratorPackage.MT_COMPLETION2__CHECK_LEARNER_ACTION:
			setCheckLearnerAction((Boolean) newValue);
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
		case GeneratorPackage.MT_COMPLETION2__TARGETS:
			getTargets().clear();
			return;
		case GeneratorPackage.MT_COMPLETION2__CHECK_LEARNER_ACTION:
			setCheckLearnerAction(CHECK_LEARNER_ACTION_EDEFAULT);
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
		case GeneratorPackage.MT_COMPLETION2__TARGETS:
			return targets != null && !targets.isEmpty();
		case GeneratorPackage.MT_COMPLETION2__NB_MISSING_ELEMENTS:
			return isSetNbMissingElements();
		case GeneratorPackage.MT_COMPLETION2__CHECK_LEARNER_ACTION:
			return checkLearnerAction != CHECK_LEARNER_ACTION_EDEFAULT;
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
		result.append(" (targets: ");
		result.append(targets);
		result.append(", nbMissingElements: ");
		if (nbMissingElementsESet)
			result.append(nbMissingElements);
		else
			result.append("<unset>");
		result.append(", checkLearnerAction: ");
		result.append(checkLearnerAction);
		result.append(')');
		return result.toString();
	}

	@Override
	public boolean isCheckOnLearnerAction() {
		// TODO Auto-generated method stub
		return false;
	}

} //MTCompletion2Impl
