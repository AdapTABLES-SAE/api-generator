/**
 */
package generator.impl;

import generator.ATask;
import generator.Gameplay;
import generator.GeneratorPackage;
import generator.PositionedElement;
import generator.QuestionedFact;
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
 *   <li>{@link generator.impl.RoomImpl#getQuestionedFacts <em>Questioned Facts</em>}</li>
 *   <li>{@link generator.impl.RoomImpl#getTask <em>Task</em>}</li>
 *   <li>{@link generator.impl.RoomImpl#getPositionedElement <em>Positioned Element</em>}</li>
 *   <li>{@link generator.impl.RoomImpl#getGameplay <em>Gameplay</em>}</li>
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
	 * The cached value of the '{@link #getQuestionedFacts() <em>Questioned Facts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestionedFacts()
	 * @generated
	 * @ordered
	 */
	protected EList<QuestionedFact> questionedFacts;

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
	 * The cached value of the '{@link #getPositionedElement() <em>Positioned Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionedElement()
	 * @generated
	 * @ordered
	 */
	protected EList<PositionedElement> positionedElement;

	/**
	 * The cached value of the '{@link #getGameplay() <em>Gameplay</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGameplay()
	 * @generated
	 * @ordered
	 */
	protected Gameplay gameplay;

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
	public EList<QuestionedFact> getQuestionedFacts() {
		if (questionedFacts == null) {
			questionedFacts = new EObjectContainmentEList<QuestionedFact>(QuestionedFact.class, this,
					GeneratorPackage.ROOM__QUESTIONED_FACTS);
		}
		return questionedFacts;
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
	public EList<PositionedElement> getPositionedElement() {
		if (positionedElement == null) {
			positionedElement = new EObjectContainmentEList<PositionedElement>(PositionedElement.class, this,
					GeneratorPackage.ROOM__POSITIONED_ELEMENT);
		}
		return positionedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gameplay getGameplay() {
		if (gameplay != null && gameplay.eIsProxy()) {
			InternalEObject oldGameplay = (InternalEObject) gameplay;
			gameplay = (Gameplay) eResolveProxy(oldGameplay);
			if (gameplay != oldGameplay) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GeneratorPackage.ROOM__GAMEPLAY,
							oldGameplay, gameplay));
			}
		}
		return gameplay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gameplay basicGetGameplay() {
		return gameplay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGameplay(Gameplay newGameplay) {
		Gameplay oldGameplay = gameplay;
		gameplay = newGameplay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.ROOM__GAMEPLAY, oldGameplay,
					gameplay));
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
		case GeneratorPackage.ROOM__QUESTIONED_FACTS:
			return ((InternalEList<?>) getQuestionedFacts()).basicRemove(otherEnd, msgs);
		case GeneratorPackage.ROOM__POSITIONED_ELEMENT:
			return ((InternalEList<?>) getPositionedElement()).basicRemove(otherEnd, msgs);
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
		case GeneratorPackage.ROOM__QUESTIONED_FACTS:
			return getQuestionedFacts();
		case GeneratorPackage.ROOM__TASK:
			if (resolve)
				return getTask();
			return basicGetTask();
		case GeneratorPackage.ROOM__POSITIONED_ELEMENT:
			return getPositionedElement();
		case GeneratorPackage.ROOM__GAMEPLAY:
			if (resolve)
				return getGameplay();
			return basicGetGameplay();
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
		case GeneratorPackage.ROOM__QUESTIONED_FACTS:
			getQuestionedFacts().clear();
			getQuestionedFacts().addAll((Collection<? extends QuestionedFact>) newValue);
			return;
		case GeneratorPackage.ROOM__TASK:
			setTask((ATask) newValue);
			return;
		case GeneratorPackage.ROOM__POSITIONED_ELEMENT:
			getPositionedElement().clear();
			getPositionedElement().addAll((Collection<? extends PositionedElement>) newValue);
			return;
		case GeneratorPackage.ROOM__GAMEPLAY:
			setGameplay((Gameplay) newValue);
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
		case GeneratorPackage.ROOM__QUESTIONED_FACTS:
			getQuestionedFacts().clear();
			return;
		case GeneratorPackage.ROOM__TASK:
			setTask((ATask) null);
			return;
		case GeneratorPackage.ROOM__POSITIONED_ELEMENT:
			getPositionedElement().clear();
			return;
		case GeneratorPackage.ROOM__GAMEPLAY:
			setGameplay((Gameplay) null);
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
		case GeneratorPackage.ROOM__QUESTIONED_FACTS:
			return questionedFacts != null && !questionedFacts.isEmpty();
		case GeneratorPackage.ROOM__TASK:
			return task != null;
		case GeneratorPackage.ROOM__POSITIONED_ELEMENT:
			return positionedElement != null && !positionedElement.isEmpty();
		case GeneratorPackage.ROOM__GAMEPLAY:
			return gameplay != null;
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
