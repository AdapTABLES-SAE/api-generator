/**
 */
package generator.impl;

import generator.GeneratorPackage;
import generator.SubObjective;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sub Objective</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.SubObjectiveImpl#getPercentageOfApparition <em>Percentage Of Apparition</em>}</li>
 *   <li>{@link generator.impl.SubObjectiveImpl#getPercentageOfValidFacts <em>Percentage Of Valid Facts</em>}</li>
 *   <li>{@link generator.impl.SubObjectiveImpl#getNbConsecutiveSuccess <em>Nb Consecutive Success</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SubObjectiveImpl extends MinimalEObjectImpl.Container implements SubObjective {
	/**
	 * The default value of the '{@link #getPercentageOfApparition() <em>Percentage Of Apparition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentageOfApparition()
	 * @generated
	 * @ordered
	 */
	protected static final int PERCENTAGE_OF_APPARITION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPercentageOfApparition() <em>Percentage Of Apparition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentageOfApparition()
	 * @generated
	 * @ordered
	 */
	protected int percentageOfApparition = PERCENTAGE_OF_APPARITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPercentageOfValidFacts() <em>Percentage Of Valid Facts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentageOfValidFacts()
	 * @generated
	 * @ordered
	 */
	protected static final int PERCENTAGE_OF_VALID_FACTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPercentageOfValidFacts() <em>Percentage Of Valid Facts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentageOfValidFacts()
	 * @generated
	 * @ordered
	 */
	protected int percentageOfValidFacts = PERCENTAGE_OF_VALID_FACTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNbConsecutiveSuccess() <em>Nb Consecutive Success</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbConsecutiveSuccess()
	 * @generated
	 * @ordered
	 */
	protected static final int NB_CONSECUTIVE_SUCCESS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNbConsecutiveSuccess() <em>Nb Consecutive Success</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbConsecutiveSuccess()
	 * @generated
	 * @ordered
	 */
	protected int nbConsecutiveSuccess = NB_CONSECUTIVE_SUCCESS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubObjectiveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.SUB_OBJECTIVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPercentageOfApparition() {
		return percentageOfApparition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPercentageOfApparition(int newPercentageOfApparition) {
		int oldPercentageOfApparition = percentageOfApparition;
		percentageOfApparition = newPercentageOfApparition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.SUB_OBJECTIVE__PERCENTAGE_OF_APPARITION, oldPercentageOfApparition,
					percentageOfApparition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPercentageOfValidFacts() {
		return percentageOfValidFacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPercentageOfValidFacts(int newPercentageOfValidFacts) {
		int oldPercentageOfValidFacts = percentageOfValidFacts;
		percentageOfValidFacts = newPercentageOfValidFacts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.SUB_OBJECTIVE__PERCENTAGE_OF_VALID_FACTS, oldPercentageOfValidFacts,
					percentageOfValidFacts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNbConsecutiveSuccess() {
		return nbConsecutiveSuccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbConsecutiveSuccess(int newNbConsecutiveSuccess) {
		int oldNbConsecutiveSuccess = nbConsecutiveSuccess;
		nbConsecutiveSuccess = newNbConsecutiveSuccess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.SUB_OBJECTIVE__NB_CONSECUTIVE_SUCCESS, oldNbConsecutiveSuccess,
					nbConsecutiveSuccess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GeneratorPackage.SUB_OBJECTIVE__PERCENTAGE_OF_APPARITION:
			return getPercentageOfApparition();
		case GeneratorPackage.SUB_OBJECTIVE__PERCENTAGE_OF_VALID_FACTS:
			return getPercentageOfValidFacts();
		case GeneratorPackage.SUB_OBJECTIVE__NB_CONSECUTIVE_SUCCESS:
			return getNbConsecutiveSuccess();
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
		case GeneratorPackage.SUB_OBJECTIVE__PERCENTAGE_OF_APPARITION:
			setPercentageOfApparition((Integer) newValue);
			return;
		case GeneratorPackage.SUB_OBJECTIVE__PERCENTAGE_OF_VALID_FACTS:
			setPercentageOfValidFacts((Integer) newValue);
			return;
		case GeneratorPackage.SUB_OBJECTIVE__NB_CONSECUTIVE_SUCCESS:
			setNbConsecutiveSuccess((Integer) newValue);
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
		case GeneratorPackage.SUB_OBJECTIVE__PERCENTAGE_OF_APPARITION:
			setPercentageOfApparition(PERCENTAGE_OF_APPARITION_EDEFAULT);
			return;
		case GeneratorPackage.SUB_OBJECTIVE__PERCENTAGE_OF_VALID_FACTS:
			setPercentageOfValidFacts(PERCENTAGE_OF_VALID_FACTS_EDEFAULT);
			return;
		case GeneratorPackage.SUB_OBJECTIVE__NB_CONSECUTIVE_SUCCESS:
			setNbConsecutiveSuccess(NB_CONSECUTIVE_SUCCESS_EDEFAULT);
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
		case GeneratorPackage.SUB_OBJECTIVE__PERCENTAGE_OF_APPARITION:
			return percentageOfApparition != PERCENTAGE_OF_APPARITION_EDEFAULT;
		case GeneratorPackage.SUB_OBJECTIVE__PERCENTAGE_OF_VALID_FACTS:
			return percentageOfValidFacts != PERCENTAGE_OF_VALID_FACTS_EDEFAULT;
		case GeneratorPackage.SUB_OBJECTIVE__NB_CONSECUTIVE_SUCCESS:
			return nbConsecutiveSuccess != NB_CONSECUTIVE_SUCCESS_EDEFAULT;
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
		result.append(" (percentageOfApparition: ");
		result.append(percentageOfApparition);
		result.append(", percentageOfValidFacts: ");
		result.append(percentageOfValidFacts);
		result.append(", nbConsecutiveSuccess: ");
		result.append(nbConsecutiveSuccess);
		result.append(')');
		return result.toString();
	}

} //SubObjectiveImpl
