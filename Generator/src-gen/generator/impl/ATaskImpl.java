/**
 */
package generator.impl;

import generator.ATask;
import generator.ETaskType;
import generator.GeneratorPackage;
import generator.ResponseModality;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ATask</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.ATaskImpl#getPercentageOfApparition <em>Percentage Of Apparition</em>}</li>
 *   <li>{@link generator.impl.ATaskImpl#getNbConsecutiveSuccess <em>Nb Consecutive Success</em>}</li>
 *   <li>{@link generator.impl.ATaskImpl#getPercentageOfValidFacts <em>Percentage Of Valid Facts</em>}</li>
 *   <li>{@link generator.impl.ATaskImpl#getResponsemodalities <em>Responsemodalities</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ATaskImpl extends MinimalEObjectImpl.Container implements ATask {
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
	 * The cached value of the '{@link #getResponsemodalities() <em>Responsemodalities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsemodalities()
	 * @generated
	 * @ordered
	 */
	protected EList<ResponseModality> responsemodalities;

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
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.ATASK__PERCENTAGE_OF_APPARITION,
					oldPercentageOfApparition, percentageOfApparition));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.ATASK__PERCENTAGE_OF_VALID_FACTS,
					oldPercentageOfValidFacts, percentageOfValidFacts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResponseModality> getResponsemodalities() {
		if (responsemodalities == null) {
			responsemodalities = new EObjectContainmentEList<ResponseModality>(ResponseModality.class, this,
					GeneratorPackage.ATASK__RESPONSEMODALITIES);
		}
		return responsemodalities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ETaskType getType() {
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
		case GeneratorPackage.ATASK__RESPONSEMODALITIES:
			return ((InternalEList<?>) getResponsemodalities()).basicRemove(otherEnd, msgs);
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
		case GeneratorPackage.ATASK__PERCENTAGE_OF_APPARITION:
			return getPercentageOfApparition();
		case GeneratorPackage.ATASK__NB_CONSECUTIVE_SUCCESS:
			return getNbConsecutiveSuccess();
		case GeneratorPackage.ATASK__PERCENTAGE_OF_VALID_FACTS:
			return getPercentageOfValidFacts();
		case GeneratorPackage.ATASK__RESPONSEMODALITIES:
			return getResponsemodalities();
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
		case GeneratorPackage.ATASK__PERCENTAGE_OF_APPARITION:
			setPercentageOfApparition((Integer) newValue);
			return;
		case GeneratorPackage.ATASK__NB_CONSECUTIVE_SUCCESS:
			setNbConsecutiveSuccess((Integer) newValue);
			return;
		case GeneratorPackage.ATASK__PERCENTAGE_OF_VALID_FACTS:
			setPercentageOfValidFacts((Integer) newValue);
			return;
		case GeneratorPackage.ATASK__RESPONSEMODALITIES:
			getResponsemodalities().clear();
			getResponsemodalities().addAll((Collection<? extends ResponseModality>) newValue);
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
		case GeneratorPackage.ATASK__PERCENTAGE_OF_APPARITION:
			setPercentageOfApparition(PERCENTAGE_OF_APPARITION_EDEFAULT);
			return;
		case GeneratorPackage.ATASK__NB_CONSECUTIVE_SUCCESS:
			setNbConsecutiveSuccess(NB_CONSECUTIVE_SUCCESS_EDEFAULT);
			return;
		case GeneratorPackage.ATASK__PERCENTAGE_OF_VALID_FACTS:
			setPercentageOfValidFacts(PERCENTAGE_OF_VALID_FACTS_EDEFAULT);
			return;
		case GeneratorPackage.ATASK__RESPONSEMODALITIES:
			getResponsemodalities().clear();
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
		case GeneratorPackage.ATASK__PERCENTAGE_OF_APPARITION:
			return percentageOfApparition != PERCENTAGE_OF_APPARITION_EDEFAULT;
		case GeneratorPackage.ATASK__NB_CONSECUTIVE_SUCCESS:
			return nbConsecutiveSuccess != NB_CONSECUTIVE_SUCCESS_EDEFAULT;
		case GeneratorPackage.ATASK__PERCENTAGE_OF_VALID_FACTS:
			return percentageOfValidFacts != PERCENTAGE_OF_VALID_FACTS_EDEFAULT;
		case GeneratorPackage.ATASK__RESPONSEMODALITIES:
			return responsemodalities != null && !responsemodalities.isEmpty();
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
		case GeneratorPackage.ATASK___GET_TYPE:
			return getType();
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
		result.append(" (percentageOfApparition: ");
		result.append(percentageOfApparition);
		result.append(", nbConsecutiveSuccess: ");
		result.append(nbConsecutiveSuccess);
		result.append(", percentageOfValidFacts: ");
		result.append(percentageOfValidFacts);
		result.append(')');
		return result.toString();
	}

} //ATaskImpl
