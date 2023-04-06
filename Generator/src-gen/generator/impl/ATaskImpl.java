/**
 */
package generator.impl;

import generator.ATask;
import generator.ETaskType;
import generator.GeneratorPackage;
import generator.ResponseModality;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ATask</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.ATaskImpl#getPercentOfApparition <em>Percent Of Apparition</em>}</li>
 *   <li>{@link generator.impl.ATaskImpl#getNbConsecutiveSuccess <em>Nb Consecutive Success</em>}</li>
 *   <li>{@link generator.impl.ATaskImpl#getResponseModality <em>Response Modality</em>}</li>
 *   <li>{@link generator.impl.ATaskImpl#getID <em>ID</em>}</li>
 *   <li>{@link generator.impl.ATaskImpl#getMaxTime <em>Max Time</em>}</li>
 *   <li>{@link generator.impl.ATaskImpl#getNbFacts <em>Nb Facts</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ATaskImpl extends MinimalEObjectImpl.Container implements ATask {
	/**
	 * The default value of the '{@link #getPercentOfApparition() <em>Percent Of Apparition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentOfApparition()
	 * @generated
	 * @ordered
	 */
	protected static final int PERCENT_OF_APPARITION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPercentOfApparition() <em>Percent Of Apparition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentOfApparition()
	 * @generated
	 * @ordered
	 */
	protected int percentOfApparition = PERCENT_OF_APPARITION_EDEFAULT;

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
	 * The cached value of the '{@link #getResponseModality() <em>Response Modality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseModality()
	 * @generated
	 * @ordered
	 */
	protected ResponseModality responseModality;

	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * This is true if the ID attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean idESet;

	/**
	 * The default value of the '{@link #getMaxTime() <em>Max Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxTime()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_TIME_EDEFAULT = 20;

	/**
	 * The cached value of the '{@link #getMaxTime() <em>Max Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxTime()
	 * @generated
	 * @ordered
	 */
	protected int maxTime = MAX_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNbFacts() <em>Nb Facts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbFacts()
	 * @generated
	 * @ordered
	 */
	protected static final int NB_FACTS_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getNbFacts() <em>Nb Facts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbFacts()
	 * @generated
	 * @ordered
	 */
	protected int nbFacts = NB_FACTS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ATaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.ATASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPercentOfApparition() {
		return percentOfApparition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPercentOfApparition(int newPercentOfApparition) {
		int oldPercentOfApparition = percentOfApparition;
		percentOfApparition = newPercentOfApparition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.ATASK__PERCENT_OF_APPARITION,
					oldPercentOfApparition, percentOfApparition));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.ATASK__NB_CONSECUTIVE_SUCCESS,
					oldNbConsecutiveSuccess, nbConsecutiveSuccess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseModality getResponseModality() {
		return responseModality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResponseModality(ResponseModality newResponseModality, NotificationChain msgs) {
		ResponseModality oldResponseModality = responseModality;
		responseModality = newResponseModality;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.ATASK__RESPONSE_MODALITY, oldResponseModality, newResponseModality);
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
	public void setResponseModality(ResponseModality newResponseModality) {
		if (newResponseModality != responseModality) {
			NotificationChain msgs = null;
			if (responseModality != null)
				msgs = ((InternalEObject) responseModality).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.ATASK__RESPONSE_MODALITY, null, msgs);
			if (newResponseModality != null)
				msgs = ((InternalEObject) newResponseModality).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.ATASK__RESPONSE_MODALITY, null, msgs);
			msgs = basicSetResponseModality(newResponseModality, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.ATASK__RESPONSE_MODALITY,
					newResponseModality, newResponseModality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getID() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID(String newID) {
		String oldID = id;
		id = newID;
		boolean oldIDESet = idESet;
		idESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.ATASK__ID, oldID, id, !oldIDESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetID() {
		String oldID = id;
		boolean oldIDESet = idESet;
		id = ID_EDEFAULT;
		idESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, GeneratorPackage.ATASK__ID, oldID, ID_EDEFAULT,
					oldIDESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetID() {
		return idESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxTime() {
		return maxTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxTime(int newMaxTime) {
		int oldMaxTime = maxTime;
		maxTime = newMaxTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.ATASK__MAX_TIME, oldMaxTime,
					maxTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNbFacts() {
		return nbFacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbFacts(int newNbFacts) {
		int oldNbFacts = nbFacts;
		nbFacts = newNbFacts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.ATASK__NB_FACTS, oldNbFacts,
					nbFacts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public abstract boolean validationOnLearnerAction();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public abstract ETaskType getType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCheckOnLearnerAction() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GeneratorPackage.ATASK__RESPONSE_MODALITY:
			return basicSetResponseModality(null, msgs);
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
		case GeneratorPackage.ATASK__PERCENT_OF_APPARITION:
			return getPercentOfApparition();
		case GeneratorPackage.ATASK__NB_CONSECUTIVE_SUCCESS:
			return getNbConsecutiveSuccess();
		case GeneratorPackage.ATASK__RESPONSE_MODALITY:
			return getResponseModality();
		case GeneratorPackage.ATASK__ID:
			return getID();
		case GeneratorPackage.ATASK__MAX_TIME:
			return getMaxTime();
		case GeneratorPackage.ATASK__NB_FACTS:
			return getNbFacts();
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
		case GeneratorPackage.ATASK__PERCENT_OF_APPARITION:
			setPercentOfApparition((Integer) newValue);
			return;
		case GeneratorPackage.ATASK__NB_CONSECUTIVE_SUCCESS:
			setNbConsecutiveSuccess((Integer) newValue);
			return;
		case GeneratorPackage.ATASK__RESPONSE_MODALITY:
			setResponseModality((ResponseModality) newValue);
			return;
		case GeneratorPackage.ATASK__ID:
			setID((String) newValue);
			return;
		case GeneratorPackage.ATASK__MAX_TIME:
			setMaxTime((Integer) newValue);
			return;
		case GeneratorPackage.ATASK__NB_FACTS:
			setNbFacts((Integer) newValue);
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
		case GeneratorPackage.ATASK__PERCENT_OF_APPARITION:
			setPercentOfApparition(PERCENT_OF_APPARITION_EDEFAULT);
			return;
		case GeneratorPackage.ATASK__NB_CONSECUTIVE_SUCCESS:
			setNbConsecutiveSuccess(NB_CONSECUTIVE_SUCCESS_EDEFAULT);
			return;
		case GeneratorPackage.ATASK__RESPONSE_MODALITY:
			setResponseModality((ResponseModality) null);
			return;
		case GeneratorPackage.ATASK__ID:
			unsetID();
			return;
		case GeneratorPackage.ATASK__MAX_TIME:
			setMaxTime(MAX_TIME_EDEFAULT);
			return;
		case GeneratorPackage.ATASK__NB_FACTS:
			setNbFacts(NB_FACTS_EDEFAULT);
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
		case GeneratorPackage.ATASK__PERCENT_OF_APPARITION:
			return percentOfApparition != PERCENT_OF_APPARITION_EDEFAULT;
		case GeneratorPackage.ATASK__NB_CONSECUTIVE_SUCCESS:
			return nbConsecutiveSuccess != NB_CONSECUTIVE_SUCCESS_EDEFAULT;
		case GeneratorPackage.ATASK__RESPONSE_MODALITY:
			return responseModality != null;
		case GeneratorPackage.ATASK__ID:
			return isSetID();
		case GeneratorPackage.ATASK__MAX_TIME:
			return maxTime != MAX_TIME_EDEFAULT;
		case GeneratorPackage.ATASK__NB_FACTS:
			return nbFacts != NB_FACTS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case GeneratorPackage.ATASK___VALIDATION_ON_LEARNER_ACTION:
			return validationOnLearnerAction();
		case GeneratorPackage.ATASK___GET_TYPE:
			return getType();
		case GeneratorPackage.ATASK___IS_CHECK_ON_LEARNER_ACTION:
			return isCheckOnLearnerAction();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (percentOfApparition: ");
		result.append(percentOfApparition);
		result.append(", nbConsecutiveSuccess: ");
		result.append(nbConsecutiveSuccess);
		result.append(", ID: ");
		if (idESet)
			result.append(id);
		else
			result.append("<unset>");
		result.append(", maxTime: ");
		result.append(maxTime);
		result.append(", nbFacts: ");
		result.append(nbFacts);
		result.append(')');
		return result.toString();
	}

} //ATaskImpl
