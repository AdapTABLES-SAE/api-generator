/**
 */
package generator.impl;

import generator.GeneratorPackage;
import generator.TaskType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.TaskTypeImpl#getNbPropositions <em>Nb Propositions</em>}</li>
 *   <li>{@link generator.impl.TaskTypeImpl#isEnterResponseAllowed <em>Enter Response Allowed</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TaskTypeImpl extends MinimalEObjectImpl.Container implements TaskType {
	/**
	 * The default value of the '{@link #getNbPropositions() <em>Nb Propositions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbPropositions()
	 * @generated
	 * @ordered
	 */
	protected static final int NB_PROPOSITIONS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNbPropositions() <em>Nb Propositions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbPropositions()
	 * @generated
	 * @ordered
	 */
	protected int nbPropositions = NB_PROPOSITIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #isEnterResponseAllowed() <em>Enter Response Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnterResponseAllowed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENTER_RESPONSE_ALLOWED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEnterResponseAllowed() <em>Enter Response Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnterResponseAllowed()
	 * @generated
	 * @ordered
	 */
	protected boolean enterResponseAllowed = ENTER_RESPONSE_ALLOWED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.TASK_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNbPropositions() {
		return nbPropositions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbPropositions(int newNbPropositions) {
		int oldNbPropositions = nbPropositions;
		nbPropositions = newNbPropositions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.TASK_TYPE__NB_PROPOSITIONS,
					oldNbPropositions, nbPropositions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEnterResponseAllowed() {
		return enterResponseAllowed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnterResponseAllowed(boolean newEnterResponseAllowed) {
		boolean oldEnterResponseAllowed = enterResponseAllowed;
		enterResponseAllowed = newEnterResponseAllowed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.TASK_TYPE__ENTER_RESPONSE_ALLOWED,
					oldEnterResponseAllowed, enterResponseAllowed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GeneratorPackage.TASK_TYPE__NB_PROPOSITIONS:
			return getNbPropositions();
		case GeneratorPackage.TASK_TYPE__ENTER_RESPONSE_ALLOWED:
			return isEnterResponseAllowed();
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
		case GeneratorPackage.TASK_TYPE__NB_PROPOSITIONS:
			setNbPropositions((Integer) newValue);
			return;
		case GeneratorPackage.TASK_TYPE__ENTER_RESPONSE_ALLOWED:
			setEnterResponseAllowed((Boolean) newValue);
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
		case GeneratorPackage.TASK_TYPE__NB_PROPOSITIONS:
			setNbPropositions(NB_PROPOSITIONS_EDEFAULT);
			return;
		case GeneratorPackage.TASK_TYPE__ENTER_RESPONSE_ALLOWED:
			setEnterResponseAllowed(ENTER_RESPONSE_ALLOWED_EDEFAULT);
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
		case GeneratorPackage.TASK_TYPE__NB_PROPOSITIONS:
			return nbPropositions != NB_PROPOSITIONS_EDEFAULT;
		case GeneratorPackage.TASK_TYPE__ENTER_RESPONSE_ALLOWED:
			return enterResponseAllowed != ENTER_RESPONSE_ALLOWED_EDEFAULT;
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
		result.append(" (nbPropositions: ");
		result.append(nbPropositions);
		result.append(", enterResponseAllowed: ");
		result.append(enterResponseAllowed);
		result.append(')');
		return result.toString();
	}

} //TaskTypeImpl
