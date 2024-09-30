/**
 */
package generator.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import generator.ETaskType;
import generator.GeneratorPackage;
import generator.MembershipIDTask;
import generator.MultipleChoice;
import generator.ResponseModality;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Membership ID Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.MembershipIDTaskImpl#getPercentOfApparition <em>Percent Of Apparition</em>}</li>
 *   <li>{@link generator.impl.MembershipIDTaskImpl#getNbConsecutiveSuccess <em>Nb Consecutive Success</em>}</li>
 *   <li>{@link generator.impl.MembershipIDTaskImpl#getResponseModality <em>Response Modality</em>}</li>
 *   <li>{@link generator.impl.MembershipIDTaskImpl#getID <em>ID</em>}</li>
 *   <li>{@link generator.impl.MembershipIDTaskImpl#getMaxTime <em>Max Time</em>}</li>
 *   <li>{@link generator.impl.MembershipIDTaskImpl#getNbFacts <em>Nb Facts</em>}</li>
 *   <li>{@link generator.impl.MembershipIDTaskImpl#getType <em>Type</em>}</li>
 *   <li>{@link generator.impl.MembershipIDTaskImpl#isIdentifySharedProperty <em>Identify Shared Property</em>}</li>
 *   <li>{@link generator.impl.MembershipIDTaskImpl#isCheckOnLearnerAction <em>Check On Learner Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class MembershipIDTaskImpl extends MinimalEObjectImpl.Container implements MembershipIDTask {
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
	protected static final int NB_CONSECUTIVE_SUCCESS_EDEFAULT = 1;

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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ETaskType TYPE_EDEFAULT = ETaskType.MEMBERSHIP;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ETaskType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIdentifySharedProperty() <em>Identify Shared Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIdentifySharedProperty()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IDENTIFY_SHARED_PROPERTY_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isIdentifySharedProperty() <em>Identify Shared Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIdentifySharedProperty()
	 * @generated
	 * @ordered
	 */
	protected boolean identifySharedProperty = IDENTIFY_SHARED_PROPERTY_EDEFAULT;

	/**
	 * The default value of the '{@link #isCheckOnLearnerAction() <em>Check On Learner Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCheckOnLearnerAction()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CHECK_ON_LEARNER_ACTION_EDEFAULT = false;

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
	public MembershipIDTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.MEMBERSHIP_ID_TASK;
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.MEMBERSHIP_ID_TASK__PERCENT_OF_APPARITION, oldPercentOfApparition,
					percentOfApparition));
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
					GeneratorPackage.MEMBERSHIP_ID_TASK__NB_CONSECUTIVE_SUCCESS, oldNbConsecutiveSuccess,
					nbConsecutiveSuccess));
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
					GeneratorPackage.MEMBERSHIP_ID_TASK__RESPONSE_MODALITY, oldResponseModality, newResponseModality);
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
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.MEMBERSHIP_ID_TASK__RESPONSE_MODALITY, null, msgs);
			if (newResponseModality != null)
				msgs = ((InternalEObject) newResponseModality).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.MEMBERSHIP_ID_TASK__RESPONSE_MODALITY, null, msgs);
			msgs = basicSetResponseModality(newResponseModality, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.MEMBERSHIP_ID_TASK__RESPONSE_MODALITY, newResponseModality, newResponseModality));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.MEMBERSHIP_ID_TASK__ID, oldID, id,
					!oldIDESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, GeneratorPackage.MEMBERSHIP_ID_TASK__ID, oldID,
					ID_EDEFAULT, oldIDESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.MEMBERSHIP_ID_TASK__MAX_TIME,
					oldMaxTime, maxTime));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.MEMBERSHIP_ID_TASK__NB_FACTS,
					oldNbFacts, nbFacts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ETaskType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIdentifySharedProperty() {
		return identifySharedProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifySharedProperty(boolean newIdentifySharedProperty) {
		boolean oldIdentifySharedProperty = identifySharedProperty;
		identifySharedProperty = newIdentifySharedProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.MEMBERSHIP_ID_TASK__IDENTIFY_SHARED_PROPERTY, oldIdentifySharedProperty,
					identifySharedProperty));
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
					GeneratorPackage.MEMBERSHIP_ID_TASK__CHECK_ON_LEARNER_ACTION, oldCheckOnLearnerAction,
					checkOnLearnerAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNbExpectedAnswers() {
		MultipleChoice mc = (MultipleChoice) this.getResponseModality();
		return mc.getNbChoices() - mc.getNbBadChoices();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGraphicTask() {
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GeneratorPackage.MEMBERSHIP_ID_TASK__RESPONSE_MODALITY:
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
		case GeneratorPackage.MEMBERSHIP_ID_TASK__PERCENT_OF_APPARITION:
			return getPercentOfApparition();
		case GeneratorPackage.MEMBERSHIP_ID_TASK__NB_CONSECUTIVE_SUCCESS:
			return getNbConsecutiveSuccess();
		case GeneratorPackage.MEMBERSHIP_ID_TASK__RESPONSE_MODALITY:
			return getResponseModality();
		case GeneratorPackage.MEMBERSHIP_ID_TASK__ID:
			return getID();
		case GeneratorPackage.MEMBERSHIP_ID_TASK__MAX_TIME:
			return getMaxTime();
		case GeneratorPackage.MEMBERSHIP_ID_TASK__NB_FACTS:
			return getNbFacts();
		case GeneratorPackage.MEMBERSHIP_ID_TASK__TYPE:
			return getType();
		case GeneratorPackage.MEMBERSHIP_ID_TASK__IDENTIFY_SHARED_PROPERTY:
			return isIdentifySharedProperty();
		case GeneratorPackage.MEMBERSHIP_ID_TASK__CHECK_ON_LEARNER_ACTION:
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
		case GeneratorPackage.MEMBERSHIP_ID_TASK__PERCENT_OF_APPARITION:
			setPercentOfApparition((Integer) newValue);
			return;
		case GeneratorPackage.MEMBERSHIP_ID_TASK__NB_CONSECUTIVE_SUCCESS:
			setNbConsecutiveSuccess((Integer) newValue);
			return;
		case GeneratorPackage.MEMBERSHIP_ID_TASK__RESPONSE_MODALITY:
			setResponseModality((ResponseModality) newValue);
			return;
		case GeneratorPackage.MEMBERSHIP_ID_TASK__ID:
			setID((String) newValue);
			return;
		case GeneratorPackage.MEMBERSHIP_ID_TASK__MAX_TIME:
			setMaxTime((Integer) newValue);
			return;
		case GeneratorPackage.MEMBERSHIP_ID_TASK__NB_FACTS:
			setNbFacts((Integer) newValue);
			return;
		case GeneratorPackage.MEMBERSHIP_ID_TASK__IDENTIFY_SHARED_PROPERTY:
			setIdentifySharedProperty((Boolean) newValue);
			return;
		case GeneratorPackage.MEMBERSHIP_ID_TASK__CHECK_ON_LEARNER_ACTION:
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
		case GeneratorPackage.MEMBERSHIP_ID_TASK__PERCENT_OF_APPARITION:
			setPercentOfApparition(PERCENT_OF_APPARITION_EDEFAULT);
			return;
		case GeneratorPackage.MEMBERSHIP_ID_TASK__NB_CONSECUTIVE_SUCCESS:
			setNbConsecutiveSuccess(NB_CONSECUTIVE_SUCCESS_EDEFAULT);
			return;
		case GeneratorPackage.MEMBERSHIP_ID_TASK__RESPONSE_MODALITY:
			setResponseModality((ResponseModality) null);
			return;
		case GeneratorPackage.MEMBERSHIP_ID_TASK__ID:
			unsetID();
			return;
		case GeneratorPackage.MEMBERSHIP_ID_TASK__MAX_TIME:
			setMaxTime(MAX_TIME_EDEFAULT);
			return;
		case GeneratorPackage.MEMBERSHIP_ID_TASK__NB_FACTS:
			setNbFacts(NB_FACTS_EDEFAULT);
			return;
		case GeneratorPackage.MEMBERSHIP_ID_TASK__IDENTIFY_SHARED_PROPERTY:
			setIdentifySharedProperty(IDENTIFY_SHARED_PROPERTY_EDEFAULT);
			return;
		case GeneratorPackage.MEMBERSHIP_ID_TASK__CHECK_ON_LEARNER_ACTION:
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
		case GeneratorPackage.MEMBERSHIP_ID_TASK__PERCENT_OF_APPARITION:
			return percentOfApparition != PERCENT_OF_APPARITION_EDEFAULT;
		case GeneratorPackage.MEMBERSHIP_ID_TASK__NB_CONSECUTIVE_SUCCESS:
			return nbConsecutiveSuccess != NB_CONSECUTIVE_SUCCESS_EDEFAULT;
		case GeneratorPackage.MEMBERSHIP_ID_TASK__RESPONSE_MODALITY:
			return responseModality != null;
		case GeneratorPackage.MEMBERSHIP_ID_TASK__ID:
			return isSetID();
		case GeneratorPackage.MEMBERSHIP_ID_TASK__MAX_TIME:
			return maxTime != MAX_TIME_EDEFAULT;
		case GeneratorPackage.MEMBERSHIP_ID_TASK__NB_FACTS:
			return nbFacts != NB_FACTS_EDEFAULT;
		case GeneratorPackage.MEMBERSHIP_ID_TASK__TYPE:
			return type != TYPE_EDEFAULT;
		case GeneratorPackage.MEMBERSHIP_ID_TASK__IDENTIFY_SHARED_PROPERTY:
			return identifySharedProperty != IDENTIFY_SHARED_PROPERTY_EDEFAULT;
		case GeneratorPackage.MEMBERSHIP_ID_TASK__CHECK_ON_LEARNER_ACTION:
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case GeneratorPackage.MEMBERSHIP_ID_TASK___GET_NB_EXPECTED_ANSWERS:
			return getNbExpectedAnswers();
		case GeneratorPackage.MEMBERSHIP_ID_TASK___IS_GRAPHIC_TASK:
			return isGraphicTask();
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
		result.append(", type: ");
		result.append(type);
		result.append(", identifySharedProperty: ");
		result.append(identifySharedProperty);
		result.append(", checkOnLearnerAction: ");
		result.append(checkOnLearnerAction);
		result.append(')');
		return result.toString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof MembershipIDTaskImpl))
			return false;
		MembershipIDTaskImpl other = (MembershipIDTaskImpl) obj;
		if (checkOnLearnerAction != other.checkOnLearnerAction)
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (idESet != other.idESet)
			return false;
		if (identifySharedProperty != other.identifySharedProperty)
			return false;
		if (maxTime != other.maxTime)
			return false;
		if (nbConsecutiveSuccess != other.nbConsecutiveSuccess)
			return false;
		if (nbFacts != other.nbFacts)
			return false;
		if (percentOfApparition != other.percentOfApparition)
			return false;
		if (responseModality == null) {
			if (other.responseModality != null)
				return false;
		} else if (!responseModality.equals(other.responseModality))
			return false;
		if (type != other.type)
			return false;
		return true;
	}
	
	

} //MembershipIDTaskImpl
