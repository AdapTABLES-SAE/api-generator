/**
 */
package generator.impl;

import generator.APosition;
import generator.CoreElement;
import generator.Correctness;
import generator.Display;
import generator.GeneratorPackage;
import generator.PositionedElement;

import generator.StructureElement;
import generator.WantedAnswer;
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
 *   <li>{@link generator.impl.PositionedElementImpl#getDisplay <em>Display</em>}</li>
 *   <li>{@link generator.impl.PositionedElementImpl#getElement <em>Element</em>}</li>
 *   <li>{@link generator.impl.PositionedElementImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link generator.impl.PositionedElementImpl#getCorrectness <em>Correctness</em>}</li>
 *   <li>{@link generator.impl.PositionedElementImpl#getWantedAnswer <em>Wanted Answer</em>}</li>
 *   <li>{@link generator.impl.PositionedElementImpl#getStructure <em>Structure</em>}</li>
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
	 * The cached value of the '{@link #getDisplay() <em>Display</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplay()
	 * @generated
	 * @ordered
	 */
	protected Display display;
	/**
	 * The cached value of the '{@link #getElement() <em>Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected CoreElement element;

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
	 * The cached value of the '{@link #getWantedAnswer() <em>Wanted Answer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWantedAnswer()
	 * @generated
	 * @ordered
	 */
	protected WantedAnswer wantedAnswer;

	/**
	 * The cached value of the '{@link #getStructure() <em>Structure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructure()
	 * @generated
	 * @ordered
	 */
	protected StructureElement structure;

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
	public WantedAnswer getWantedAnswer() {
		return wantedAnswer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWantedAnswer(WantedAnswer newWantedAnswer, NotificationChain msgs) {
		WantedAnswer oldWantedAnswer = wantedAnswer;
		wantedAnswer = newWantedAnswer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.POSITIONED_ELEMENT__WANTED_ANSWER, oldWantedAnswer, newWantedAnswer);
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
	public void setWantedAnswer(WantedAnswer newWantedAnswer) {
		if (newWantedAnswer != wantedAnswer) {
			NotificationChain msgs = null;
			if (wantedAnswer != null)
				msgs = ((InternalEObject) wantedAnswer).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.POSITIONED_ELEMENT__WANTED_ANSWER, null, msgs);
			if (newWantedAnswer != null)
				msgs = ((InternalEObject) newWantedAnswer).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.POSITIONED_ELEMENT__WANTED_ANSWER, null, msgs);
			msgs = basicSetWantedAnswer(newWantedAnswer, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.POSITIONED_ELEMENT__WANTED_ANSWER,
					newWantedAnswer, newWantedAnswer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureElement getStructure() {
		if (structure != null && structure.eIsProxy()) {
			InternalEObject oldStructure = (InternalEObject) structure;
			structure = (StructureElement) eResolveProxy(oldStructure);
			if (structure != oldStructure) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							GeneratorPackage.POSITIONED_ELEMENT__STRUCTURE, oldStructure, structure));
			}
		}
		return structure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureElement basicGetStructure() {
		return structure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStructure(StructureElement newStructure) {
		StructureElement oldStructure = structure;
		structure = newStructure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.POSITIONED_ELEMENT__STRUCTURE,
					oldStructure, structure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreElement getElement() {
		if (element != null && element.eIsProxy()) {
			InternalEObject oldElement = (InternalEObject) element;
			element = (CoreElement) eResolveProxy(oldElement);
			if (element != oldElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							GeneratorPackage.POSITIONED_ELEMENT__ELEMENT, oldElement, element));
			}
		}
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreElement basicGetElement() {
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElement(CoreElement newElement) {
		CoreElement oldElement = element;
		element = newElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.POSITIONED_ELEMENT__ELEMENT,
					oldElement, element));
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GeneratorPackage.POSITIONED_ELEMENT__DISPLAY:
			return basicSetDisplay(null, msgs);
		case GeneratorPackage.POSITIONED_ELEMENT__CORRECTNESS:
			return basicSetCorrectness(null, msgs);
		case GeneratorPackage.POSITIONED_ELEMENT__WANTED_ANSWER:
			return basicSetWantedAnswer(null, msgs);
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
		case GeneratorPackage.POSITIONED_ELEMENT__DISPLAY:
			return getDisplay();
		case GeneratorPackage.POSITIONED_ELEMENT__ELEMENT:
			if (resolve)
				return getElement();
			return basicGetElement();
		case GeneratorPackage.POSITIONED_ELEMENT__POSITION:
			if (resolve)
				return getPosition();
			return basicGetPosition();
		case GeneratorPackage.POSITIONED_ELEMENT__CORRECTNESS:
			return getCorrectness();
		case GeneratorPackage.POSITIONED_ELEMENT__WANTED_ANSWER:
			return getWantedAnswer();
		case GeneratorPackage.POSITIONED_ELEMENT__STRUCTURE:
			if (resolve)
				return getStructure();
			return basicGetStructure();
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
		case GeneratorPackage.POSITIONED_ELEMENT__ID:
			setID((String) newValue);
			return;
		case GeneratorPackage.POSITIONED_ELEMENT__DISPLAY:
			setDisplay((Display) newValue);
			return;
		case GeneratorPackage.POSITIONED_ELEMENT__ELEMENT:
			setElement((CoreElement) newValue);
			return;
		case GeneratorPackage.POSITIONED_ELEMENT__POSITION:
			setPosition((APosition) newValue);
			return;
		case GeneratorPackage.POSITIONED_ELEMENT__CORRECTNESS:
			setCorrectness((Correctness) newValue);
			return;
		case GeneratorPackage.POSITIONED_ELEMENT__WANTED_ANSWER:
			setWantedAnswer((WantedAnswer) newValue);
			return;
		case GeneratorPackage.POSITIONED_ELEMENT__STRUCTURE:
			setStructure((StructureElement) newValue);
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
		case GeneratorPackage.POSITIONED_ELEMENT__DISPLAY:
			setDisplay((Display) null);
			return;
		case GeneratorPackage.POSITIONED_ELEMENT__ELEMENT:
			setElement((CoreElement) null);
			return;
		case GeneratorPackage.POSITIONED_ELEMENT__POSITION:
			setPosition((APosition) null);
			return;
		case GeneratorPackage.POSITIONED_ELEMENT__CORRECTNESS:
			setCorrectness((Correctness) null);
			return;
		case GeneratorPackage.POSITIONED_ELEMENT__WANTED_ANSWER:
			setWantedAnswer((WantedAnswer) null);
			return;
		case GeneratorPackage.POSITIONED_ELEMENT__STRUCTURE:
			setStructure((StructureElement) null);
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
		case GeneratorPackage.POSITIONED_ELEMENT__DISPLAY:
			return display != null;
		case GeneratorPackage.POSITIONED_ELEMENT__ELEMENT:
			return element != null;
		case GeneratorPackage.POSITIONED_ELEMENT__POSITION:
			return position != null;
		case GeneratorPackage.POSITIONED_ELEMENT__CORRECTNESS:
			return correctness != null;
		case GeneratorPackage.POSITIONED_ELEMENT__WANTED_ANSWER:
			return wantedAnswer != null;
		case GeneratorPackage.POSITIONED_ELEMENT__STRUCTURE:
			return structure != null;
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
