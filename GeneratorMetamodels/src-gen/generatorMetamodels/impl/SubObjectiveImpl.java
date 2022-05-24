/**
 */
package generatorMetamodels.impl;

import generatorMetamodels.GeneratorMetamodelsPackage;
import generatorMetamodels.ResponseModality;
import generatorMetamodels.SubObjective;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

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
 *   <li>{@link generatorMetamodels.impl.SubObjectiveImpl#getPercentageOfApparition <em>Percentage Of Apparition</em>}</li>
 *   <li>{@link generatorMetamodels.impl.SubObjectiveImpl#getPercentageOfValidFacts <em>Percentage Of Valid Facts</em>}</li>
 *   <li>{@link generatorMetamodels.impl.SubObjectiveImpl#getNbConsecutiveSuccess <em>Nb Consecutive Success</em>}</li>
 *   <li>{@link generatorMetamodels.impl.SubObjectiveImpl#getResponsemodality <em>Responsemodality</em>}</li>
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
	 * The cached value of the '{@link #getResponsemodality() <em>Responsemodality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsemodality()
	 * @generated
	 * @ordered
	 */
	protected ResponseModality responsemodality;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubObjectiveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorMetamodelsPackage.Literals.SUB_OBJECTIVE;
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
					GeneratorMetamodelsPackage.SUB_OBJECTIVE__PERCENTAGE_OF_APPARITION, oldPercentageOfApparition,
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
					GeneratorMetamodelsPackage.SUB_OBJECTIVE__PERCENTAGE_OF_VALID_FACTS, oldPercentageOfValidFacts,
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
					GeneratorMetamodelsPackage.SUB_OBJECTIVE__NB_CONSECUTIVE_SUCCESS, oldNbConsecutiveSuccess,
					nbConsecutiveSuccess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseModality getResponsemodality() {
		return responsemodality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResponsemodality(ResponseModality newResponsemodality, NotificationChain msgs) {
		ResponseModality oldResponsemodality = responsemodality;
		responsemodality = newResponsemodality;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GeneratorMetamodelsPackage.SUB_OBJECTIVE__RESPONSEMODALITY, oldResponsemodality,
					newResponsemodality);
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
	public void setResponsemodality(ResponseModality newResponsemodality) {
		if (newResponsemodality != responsemodality) {
			NotificationChain msgs = null;
			if (responsemodality != null)
				msgs = ((InternalEObject) responsemodality).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GeneratorMetamodelsPackage.SUB_OBJECTIVE__RESPONSEMODALITY, null,
						msgs);
			if (newResponsemodality != null)
				msgs = ((InternalEObject) newResponsemodality).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GeneratorMetamodelsPackage.SUB_OBJECTIVE__RESPONSEMODALITY, null,
						msgs);
			msgs = basicSetResponsemodality(newResponsemodality, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GeneratorMetamodelsPackage.SUB_OBJECTIVE__RESPONSEMODALITY, newResponsemodality,
					newResponsemodality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GeneratorMetamodelsPackage.SUB_OBJECTIVE__RESPONSEMODALITY:
			return basicSetResponsemodality(null, msgs);
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
		case GeneratorMetamodelsPackage.SUB_OBJECTIVE__PERCENTAGE_OF_APPARITION:
			return getPercentageOfApparition();
		case GeneratorMetamodelsPackage.SUB_OBJECTIVE__PERCENTAGE_OF_VALID_FACTS:
			return getPercentageOfValidFacts();
		case GeneratorMetamodelsPackage.SUB_OBJECTIVE__NB_CONSECUTIVE_SUCCESS:
			return getNbConsecutiveSuccess();
		case GeneratorMetamodelsPackage.SUB_OBJECTIVE__RESPONSEMODALITY:
			return getResponsemodality();
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
		case GeneratorMetamodelsPackage.SUB_OBJECTIVE__PERCENTAGE_OF_APPARITION:
			setPercentageOfApparition((Integer) newValue);
			return;
		case GeneratorMetamodelsPackage.SUB_OBJECTIVE__PERCENTAGE_OF_VALID_FACTS:
			setPercentageOfValidFacts((Integer) newValue);
			return;
		case GeneratorMetamodelsPackage.SUB_OBJECTIVE__NB_CONSECUTIVE_SUCCESS:
			setNbConsecutiveSuccess((Integer) newValue);
			return;
		case GeneratorMetamodelsPackage.SUB_OBJECTIVE__RESPONSEMODALITY:
			setResponsemodality((ResponseModality) newValue);
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
		case GeneratorMetamodelsPackage.SUB_OBJECTIVE__PERCENTAGE_OF_APPARITION:
			setPercentageOfApparition(PERCENTAGE_OF_APPARITION_EDEFAULT);
			return;
		case GeneratorMetamodelsPackage.SUB_OBJECTIVE__PERCENTAGE_OF_VALID_FACTS:
			setPercentageOfValidFacts(PERCENTAGE_OF_VALID_FACTS_EDEFAULT);
			return;
		case GeneratorMetamodelsPackage.SUB_OBJECTIVE__NB_CONSECUTIVE_SUCCESS:
			setNbConsecutiveSuccess(NB_CONSECUTIVE_SUCCESS_EDEFAULT);
			return;
		case GeneratorMetamodelsPackage.SUB_OBJECTIVE__RESPONSEMODALITY:
			setResponsemodality((ResponseModality) null);
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
		case GeneratorMetamodelsPackage.SUB_OBJECTIVE__PERCENTAGE_OF_APPARITION:
			return percentageOfApparition != PERCENTAGE_OF_APPARITION_EDEFAULT;
		case GeneratorMetamodelsPackage.SUB_OBJECTIVE__PERCENTAGE_OF_VALID_FACTS:
			return percentageOfValidFacts != PERCENTAGE_OF_VALID_FACTS_EDEFAULT;
		case GeneratorMetamodelsPackage.SUB_OBJECTIVE__NB_CONSECUTIVE_SUCCESS:
			return nbConsecutiveSuccess != NB_CONSECUTIVE_SUCCESS_EDEFAULT;
		case GeneratorMetamodelsPackage.SUB_OBJECTIVE__RESPONSEMODALITY:
			return responsemodality != null;
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
