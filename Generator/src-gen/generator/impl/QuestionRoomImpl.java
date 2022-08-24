/**
 */
package generator.impl;

import generator.GeneratorPackage;
import generator.QuestionRoom;
import generator.State;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Question Room</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.QuestionRoomImpl#getSucessState <em>Sucess State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuestionRoomImpl extends RoomOLDImpl implements QuestionRoom {
	/**
	 * The cached value of the '{@link #getSucessState() <em>Sucess State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSucessState()
	 * @generated
	 * @ordered
	 */
	protected State sucessState;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionRoomImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.QUESTION_ROOM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getSucessState() {
		return sucessState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSucessState(State newSucessState, NotificationChain msgs) {
		State oldSucessState = sucessState;
		sucessState = newSucessState;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.QUESTION_ROOM__SUCESS_STATE, oldSucessState, newSucessState);
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
	public void setSucessState(State newSucessState) {
		if (newSucessState != sucessState) {
			NotificationChain msgs = null;
			if (sucessState != null)
				msgs = ((InternalEObject) sucessState).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.QUESTION_ROOM__SUCESS_STATE, null, msgs);
			if (newSucessState != null)
				msgs = ((InternalEObject) newSucessState).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.QUESTION_ROOM__SUCESS_STATE, null, msgs);
			msgs = basicSetSucessState(newSucessState, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.QUESTION_ROOM__SUCESS_STATE,
					newSucessState, newSucessState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GeneratorPackage.QUESTION_ROOM__SUCESS_STATE:
			return basicSetSucessState(null, msgs);
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
		case GeneratorPackage.QUESTION_ROOM__SUCESS_STATE:
			return getSucessState();
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
		case GeneratorPackage.QUESTION_ROOM__SUCESS_STATE:
			setSucessState((State) newValue);
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
		case GeneratorPackage.QUESTION_ROOM__SUCESS_STATE:
			setSucessState((State) null);
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
		case GeneratorPackage.QUESTION_ROOM__SUCESS_STATE:
			return sucessState != null;
		}
		return super.eIsSet(featureID);
	}

} //QuestionRoomImpl
