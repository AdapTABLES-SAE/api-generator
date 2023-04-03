/**
 */
package generator.impl;

import generator.APosition;
import generator.Correctness;
import generator.Display;
import generator.ExpectedAnswer;
import generator.GPElementType;
import generator.GeneratorPackage;
import generator.PositionedElement;
import generator.Priority;
import generator.QuestionedFact;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Positioned Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.PositionedElementImpl#getID <em>ID</em>}</li>
 *   <li>{@link generator.impl.PositionedElementImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link generator.impl.PositionedElementImpl#getCorrectness <em>Correctness</em>}</li>
 *   <li>{@link generator.impl.PositionedElementImpl#getDisplay <em>Display</em>}</li>
 *   <li>{@link generator.impl.PositionedElementImpl#getElementType <em>Element Type</em>}</li>
 *   <li>{@link generator.impl.PositionedElementImpl#getExpectedAnswer <em>Expected Answer</em>}</li>
 *   <li>{@link generator.impl.PositionedElementImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link generator.impl.PositionedElementImpl#getFact <em>Fact</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PositionedElementImpl extends MinimalEObjectImpl.Container implements PositionedElement {
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
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected APosition position;

	/**
	 * The cached value of the '{@link #getCorrectness() <em>Correctness</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrectness()
	 * @generated
	 * @ordered
	 */
	protected Correctness correctness;

	/**
	 * The cached value of the '{@link #getDisplay() <em>Display</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplay()
	 * @generated
	 * @ordered
	 */
	protected Display display;

	/**
	 * The cached value of the '{@link #getElementType() <em>Element Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementType()
	 * @generated
	 * @ordered
	 */
	protected GPElementType elementType;

	/**
	 * The cached value of the '{@link #getExpectedAnswer() <em>Expected Answer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpectedAnswer()
	 * @generated
	 * @ordered
	 */
	protected ExpectedAnswer expectedAnswer;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected Priority priority;

	/**
	 * The cached value of the '{@link #getFact() <em>Fact</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFact()
	 * @generated
	 * @ordered
	 */
	protected QuestionedFact fact;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositionedElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.POSITIONED_ELEMENT;
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
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.POSITIONED_ELEMENT__ID, oldID, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Display getDisplay() {
		return display;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDisplay(Display newDisplay, NotificationChain msgs) {
		Display oldDisplay = display;
		display = newDisplay;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.POSITIONED_ELEMENT__DISPLAY, oldDisplay, newDisplay);
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
	public void setDisplay(Display newDisplay) {
		if (newDisplay != display) {
			NotificationChain msgs = null;
			if (display != null)
				msgs = ((InternalEObject) display).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.POSITIONED_ELEMENT__DISPLAY, null, msgs);
			if (newDisplay != null)
				msgs = ((InternalEObject) newDisplay).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.POSITIONED_ELEMENT__DISPLAY, null, msgs);
			msgs = basicSetDisplay(newDisplay, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.POSITIONED_ELEMENT__DISPLAY,
					newDisplay, newDisplay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GPElementType getElementType() {
		if (elementType != null && elementType.eIsProxy()) {
			InternalEObject oldElementType = (InternalEObject) elementType;
			elementType = (GPElementType) eResolveProxy(oldElementType);
			if (elementType != oldElementType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							GeneratorPackage.POSITIONED_ELEMENT__ELEMENT_TYPE, oldElementType, elementType));
			}
		}
		return elementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GPElementType basicGetElementType() {
		return elementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementType(GPElementType newElementType) {
		GPElementType oldElementType = elementType;
		elementType = newElementType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.POSITIONED_ELEMENT__ELEMENT_TYPE,
					oldElementType, elementType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpectedAnswer getExpectedAnswer() {
		return expectedAnswer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpectedAnswer(ExpectedAnswer newExpectedAnswer, NotificationChain msgs) {
		ExpectedAnswer oldExpectedAnswer = expectedAnswer;
		expectedAnswer = newExpectedAnswer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.POSITIONED_ELEMENT__EXPECTED_ANSWER, oldExpectedAnswer, newExpectedAnswer);
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
	public void setExpectedAnswer(ExpectedAnswer newExpectedAnswer) {
		if (newExpectedAnswer != expectedAnswer) {
			NotificationChain msgs = null;
			if (expectedAnswer != null)
				msgs = ((InternalEObject) expectedAnswer).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.POSITIONED_ELEMENT__EXPECTED_ANSWER, null, msgs);
			if (newExpectedAnswer != null)
				msgs = ((InternalEObject) newExpectedAnswer).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.POSITIONED_ELEMENT__EXPECTED_ANSWER, null, msgs);
			msgs = basicSetExpectedAnswer(newExpectedAnswer, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.POSITIONED_ELEMENT__EXPECTED_ANSWER,
					newExpectedAnswer, newExpectedAnswer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Priority getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPriority(Priority newPriority, NotificationChain msgs) {
		Priority oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.POSITIONED_ELEMENT__PRIORITY, oldPriority, newPriority);
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
	public void setPriority(Priority newPriority) {
		if (newPriority != priority) {
			NotificationChain msgs = null;
			if (priority != null)
				msgs = ((InternalEObject) priority).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.POSITIONED_ELEMENT__PRIORITY, null, msgs);
			if (newPriority != null)
				msgs = ((InternalEObject) newPriority).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.POSITIONED_ELEMENT__PRIORITY, null, msgs);
			msgs = basicSetPriority(newPriority, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.POSITIONED_ELEMENT__PRIORITY,
					newPriority, newPriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionedFact getFact() {
		if (fact != null && fact.eIsProxy()) {
			InternalEObject oldFact = (InternalEObject) fact;
			fact = (QuestionedFact) eResolveProxy(oldFact);
			if (fact != oldFact) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GeneratorPackage.POSITIONED_ELEMENT__FACT,
							oldFact, fact));
			}
		}
		return fact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionedFact basicGetFact() {
		return fact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFact(QuestionedFact newFact) {
		QuestionedFact oldFact = fact;
		fact = newFact;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.POSITIONED_ELEMENT__FACT, oldFact,
					fact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APosition getPosition() {
		if (position != null && position.eIsProxy()) {
			InternalEObject oldPosition = (InternalEObject) position;
			position = (APosition) eResolveProxy(oldPosition);
			if (position != oldPosition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							GeneratorPackage.POSITIONED_ELEMENT__POSITION, oldPosition, position));
			}
		}
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APosition basicGetPosition() {
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosition(APosition newPosition) {
		APosition oldPosition = position;
		position = newPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.POSITIONED_ELEMENT__POSITION,
					oldPosition, position));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Correctness getCorrectness() {
		return correctness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCorrectness(Correctness newCorrectness, NotificationChain msgs) {
		Correctness oldCorrectness = correctness;
		correctness = newCorrectness;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.POSITIONED_ELEMENT__CORRECTNESS, oldCorrectness, newCorrectness);
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
	public void setCorrectness(Correctness newCorrectness) {
		if (newCorrectness != correctness) {
			NotificationChain msgs = null;
			if (correctness != null)
				msgs = ((InternalEObject) correctness).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.POSITIONED_ELEMENT__CORRECTNESS, null, msgs);
			if (newCorrectness != null)
				msgs = ((InternalEObject) newCorrectness).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.POSITIONED_ELEMENT__CORRECTNESS, null, msgs);
			msgs = basicSetCorrectness(newCorrectness, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.POSITIONED_ELEMENT__CORRECTNESS,
					newCorrectness, newCorrectness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GeneratorPackage.POSITIONED_ELEMENT__CORRECTNESS:
			return basicSetCorrectness(null, msgs);
		case GeneratorPackage.POSITIONED_ELEMENT__DISPLAY:
			return basicSetDisplay(null, msgs);
		case GeneratorPackage.POSITIONED_ELEMENT__EXPECTED_ANSWER:
			return basicSetExpectedAnswer(null, msgs);
		case GeneratorPackage.POSITIONED_ELEMENT__PRIORITY:
			return basicSetPriority(null, msgs);
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
		case GeneratorPackage.POSITIONED_ELEMENT__ID:
			return getID();
		case GeneratorPackage.POSITIONED_ELEMENT__POSITION:
			if (resolve)
				return getPosition();
			return basicGetPosition();
		case GeneratorPackage.POSITIONED_ELEMENT__CORRECTNESS:
			return getCorrectness();
		case GeneratorPackage.POSITIONED_ELEMENT__DISPLAY:
			return getDisplay();
		case GeneratorPackage.POSITIONED_ELEMENT__ELEMENT_TYPE:
			if (resolve)
				return getElementType();
			return basicGetElementType();
		case GeneratorPackage.POSITIONED_ELEMENT__EXPECTED_ANSWER:
			return getExpectedAnswer();
		case GeneratorPackage.POSITIONED_ELEMENT__PRIORITY:
			return getPriority();
		case GeneratorPackage.POSITIONED_ELEMENT__FACT:
			if (resolve)
				return getFact();
			return basicGetFact();
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
		case GeneratorPackage.POSITIONED_ELEMENT__ID:
			setID((String) newValue);
			return;
		case GeneratorPackage.POSITIONED_ELEMENT__POSITION:
			setPosition((APosition) newValue);
			return;
		case GeneratorPackage.POSITIONED_ELEMENT__CORRECTNESS:
			setCorrectness((Correctness) newValue);
			return;
		case GeneratorPackage.POSITIONED_ELEMENT__DISPLAY:
			setDisplay((Display) newValue);
			return;
		case GeneratorPackage.POSITIONED_ELEMENT__ELEMENT_TYPE:
			setElementType((GPElementType) newValue);
			return;
		case GeneratorPackage.POSITIONED_ELEMENT__EXPECTED_ANSWER:
			setExpectedAnswer((ExpectedAnswer) newValue);
			return;
		case GeneratorPackage.POSITIONED_ELEMENT__PRIORITY:
			setPriority((Priority) newValue);
			return;
		case GeneratorPackage.POSITIONED_ELEMENT__FACT:
			setFact((QuestionedFact) newValue);
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
		case GeneratorPackage.POSITIONED_ELEMENT__ID:
			setID(ID_EDEFAULT);
			return;
		case GeneratorPackage.POSITIONED_ELEMENT__POSITION:
			setPosition((APosition) null);
			return;
		case GeneratorPackage.POSITIONED_ELEMENT__CORRECTNESS:
			setCorrectness((Correctness) null);
			return;
		case GeneratorPackage.POSITIONED_ELEMENT__DISPLAY:
			setDisplay((Display) null);
			return;
		case GeneratorPackage.POSITIONED_ELEMENT__ELEMENT_TYPE:
			setElementType((GPElementType) null);
			return;
		case GeneratorPackage.POSITIONED_ELEMENT__EXPECTED_ANSWER:
			setExpectedAnswer((ExpectedAnswer) null);
			return;
		case GeneratorPackage.POSITIONED_ELEMENT__PRIORITY:
			setPriority((Priority) null);
			return;
		case GeneratorPackage.POSITIONED_ELEMENT__FACT:
			setFact((QuestionedFact) null);
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
		case GeneratorPackage.POSITIONED_ELEMENT__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case GeneratorPackage.POSITIONED_ELEMENT__POSITION:
			return position != null;
		case GeneratorPackage.POSITIONED_ELEMENT__CORRECTNESS:
			return correctness != null;
		case GeneratorPackage.POSITIONED_ELEMENT__DISPLAY:
			return display != null;
		case GeneratorPackage.POSITIONED_ELEMENT__ELEMENT_TYPE:
			return elementType != null;
		case GeneratorPackage.POSITIONED_ELEMENT__EXPECTED_ANSWER:
			return expectedAnswer != null;
		case GeneratorPackage.POSITIONED_ELEMENT__PRIORITY:
			return priority != null;
		case GeneratorPackage.POSITIONED_ELEMENT__FACT:
			return fact != null;
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
		result.append(" (ID: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //PositionedElementImpl
