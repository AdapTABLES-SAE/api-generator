/**
 */
package generator.impl;

import generator.ATask;
import generator.GeneratorPackage;
import generator.Question;
import generator.Room;
import generator.RoomAccess;
import generator.RoomType;

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
 * An implementation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.RoomImpl#getX <em>X</em>}</li>
 *   <li>{@link generator.impl.RoomImpl#getY <em>Y</em>}</li>
 *   <li>{@link generator.impl.RoomImpl#getRoomaccess <em>Roomaccess</em>}</li>
 *   <li>{@link generator.impl.RoomImpl#getRoomtype <em>Roomtype</em>}</li>
 *   <li>{@link generator.impl.RoomImpl#getQuestion <em>Question</em>}</li>
 *   <li>{@link generator.impl.RoomImpl#getTask <em>Task</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoomImpl extends MinimalEObjectImpl.Container implements Room {
	/**
	 * The default value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected static final int X_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected int x = X_EDEFAULT;

	/**
	 * The default value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected static final int Y_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected int y = Y_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRoomaccess() <em>Roomaccess</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomaccess()
	 * @generated
	 * @ordered
	 */
	protected EList<RoomAccess> roomaccess;

	/**
	 * The cached value of the '{@link #getRoomtype() <em>Roomtype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomtype()
	 * @generated
	 * @ordered
	 */
	protected RoomType roomtype;

	/**
	 * The cached value of the '{@link #getQuestion() <em>Question</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestion()
	 * @generated
	 * @ordered
	 */
	protected Question question;

	/**
	 * The cached value of the '{@link #getTask() <em>Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTask()
	 * @generated
	 * @ordered
	 */
	protected ATask task;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.ROOM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getX() {
		return x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX(int newX) {
		int oldX = x;
		x = newX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.ROOM__X, oldX, x));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getY() {
		return y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY(int newY) {
		int oldY = y;
		y = newY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.ROOM__Y, oldY, y));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoomAccess> getRoomaccess() {
		if (roomaccess == null) {
			roomaccess = new EObjectContainmentEList<RoomAccess>(RoomAccess.class, this,
					GeneratorPackage.ROOM__ROOMACCESS);
		}
		return roomaccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomType getRoomtype() {
		if (roomtype != null && roomtype.eIsProxy()) {
			InternalEObject oldRoomtype = (InternalEObject) roomtype;
			roomtype = (RoomType) eResolveProxy(oldRoomtype);
			if (roomtype != oldRoomtype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GeneratorPackage.ROOM__ROOMTYPE,
							oldRoomtype, roomtype));
			}
		}
		return roomtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomType basicGetRoomtype() {
		return roomtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoomtype(RoomType newRoomtype) {
		RoomType oldRoomtype = roomtype;
		roomtype = newRoomtype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.ROOM__ROOMTYPE, oldRoomtype,
					roomtype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Question getQuestion() {
		return question;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuestion(Question newQuestion, NotificationChain msgs) {
		Question oldQuestion = question;
		question = newQuestion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.ROOM__QUESTION, oldQuestion, newQuestion);
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
	public void setQuestion(Question newQuestion) {
		if (newQuestion != question) {
			NotificationChain msgs = null;
			if (question != null)
				msgs = ((InternalEObject) question).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.ROOM__QUESTION, null, msgs);
			if (newQuestion != null)
				msgs = ((InternalEObject) newQuestion).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.ROOM__QUESTION, null, msgs);
			msgs = basicSetQuestion(newQuestion, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.ROOM__QUESTION, newQuestion,
					newQuestion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ATask getTask() {
		if (task != null && task.eIsProxy()) {
			InternalEObject oldTask = (InternalEObject) task;
			task = (ATask) eResolveProxy(oldTask);
			if (task != oldTask) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GeneratorPackage.ROOM__TASK, oldTask,
							task));
			}
		}
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ATask basicGetTask() {
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTask(ATask newTask) {
		ATask oldTask = task;
		task = newTask;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.ROOM__TASK, oldTask, task));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GeneratorPackage.ROOM__ROOMACCESS:
			return ((InternalEList<?>) getRoomaccess()).basicRemove(otherEnd, msgs);
		case GeneratorPackage.ROOM__QUESTION:
			return basicSetQuestion(null, msgs);
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
		case GeneratorPackage.ROOM__X:
			return getX();
		case GeneratorPackage.ROOM__Y:
			return getY();
		case GeneratorPackage.ROOM__ROOMACCESS:
			return getRoomaccess();
		case GeneratorPackage.ROOM__ROOMTYPE:
			if (resolve)
				return getRoomtype();
			return basicGetRoomtype();
		case GeneratorPackage.ROOM__QUESTION:
			return getQuestion();
		case GeneratorPackage.ROOM__TASK:
			if (resolve)
				return getTask();
			return basicGetTask();
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
		case GeneratorPackage.ROOM__X:
			setX((Integer) newValue);
			return;
		case GeneratorPackage.ROOM__Y:
			setY((Integer) newValue);
			return;
		case GeneratorPackage.ROOM__ROOMACCESS:
			getRoomaccess().clear();
			getRoomaccess().addAll((Collection<? extends RoomAccess>) newValue);
			return;
		case GeneratorPackage.ROOM__ROOMTYPE:
			setRoomtype((RoomType) newValue);
			return;
		case GeneratorPackage.ROOM__QUESTION:
			setQuestion((Question) newValue);
			return;
		case GeneratorPackage.ROOM__TASK:
			setTask((ATask) newValue);
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
		case GeneratorPackage.ROOM__X:
			setX(X_EDEFAULT);
			return;
		case GeneratorPackage.ROOM__Y:
			setY(Y_EDEFAULT);
			return;
		case GeneratorPackage.ROOM__ROOMACCESS:
			getRoomaccess().clear();
			return;
		case GeneratorPackage.ROOM__ROOMTYPE:
			setRoomtype((RoomType) null);
			return;
		case GeneratorPackage.ROOM__QUESTION:
			setQuestion((Question) null);
			return;
		case GeneratorPackage.ROOM__TASK:
			setTask((ATask) null);
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
		case GeneratorPackage.ROOM__X:
			return x != X_EDEFAULT;
		case GeneratorPackage.ROOM__Y:
			return y != Y_EDEFAULT;
		case GeneratorPackage.ROOM__ROOMACCESS:
			return roomaccess != null && !roomaccess.isEmpty();
		case GeneratorPackage.ROOM__ROOMTYPE:
			return roomtype != null;
		case GeneratorPackage.ROOM__QUESTION:
			return question != null;
		case GeneratorPackage.ROOM__TASK:
			return task != null;
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
		result.append(" (x: ");
		result.append(x);
		result.append(", y: ");
		result.append(y);
		result.append(')');
		return result.toString();
	}

} //RoomImpl
