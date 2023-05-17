/**
 */
package generator.impl;

import generator.Correctness;
import generator.Display;
import generator.ExpectedAnswer;
import generator.FactSolutionParam;
import generator.GPElementType;
import generator.GeneratorPackage;
import generator.Position;
import generator.PositionedElement;
import generator.QuestionedFact;
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
 * An implementation of the model object '<em><b>Positioned Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.PositionedElementImpl#getID <em>ID</em>}</li>
 *   <li>{@link generator.impl.PositionedElementImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link generator.impl.PositionedElementImpl#getCorrectness <em>Correctness</em>}</li>
 *   <li>{@link generator.impl.PositionedElementImpl#getDisplays <em>Displays</em>}</li>
 *   <li>{@link generator.impl.PositionedElementImpl#getElementType <em>Element Type</em>}</li>
 *   <li>{@link generator.impl.PositionedElementImpl#getExpectedAnswer <em>Expected Answer</em>}</li>
 *   <li>{@link generator.impl.PositionedElementImpl#getFact <em>Fact</em>}</li>
 *   <li>{@link generator.impl.PositionedElementImpl#getAcceptedFacts <em>Accepted Facts</em>}</li>
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
	protected Position position;

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
	 * The cached value of the '{@link #getDisplays() <em>Displays</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplays()
	 * @generated
	 * @ordered
	 */
	protected EList<Display> displays;

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
	 * The cached value of the '{@link #getExpectedAnswer() <em>Expected Answer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpectedAnswer()
	 * @generated
	 * @ordered
	 */
	protected EList<ExpectedAnswer> expectedAnswer;

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
	 * The cached value of the '{@link #getAcceptedFacts() <em>Accepted Facts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcceptedFacts()
	 * @generated
	 * @ordered
	 */
	protected EList<FactSolutionParam> acceptedFacts;

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
	public EList<ExpectedAnswer> getExpectedAnswer() {
		if (expectedAnswer == null) {
			expectedAnswer = new EObjectContainmentEList<ExpectedAnswer>(ExpectedAnswer.class, this,
					GeneratorPackage.POSITIONED_ELEMENT__EXPECTED_ANSWER);
		}
		return expectedAnswer;
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
	public EList<FactSolutionParam> getAcceptedFacts() {
		if (acceptedFacts == null) {
			acceptedFacts = new EObjectContainmentEList<FactSolutionParam>(FactSolutionParam.class, this,
					GeneratorPackage.POSITIONED_ELEMENT__ACCEPTED_FACTS);
		}
		return acceptedFacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Position getPosition() {
		if (position != null && position.eIsProxy()) {
			InternalEObject oldPosition = (InternalEObject) position;
			position = (Position) eResolveProxy(oldPosition);
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
	public Position basicGetPosition() {
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosition(Position newPosition) {
		Position oldPosition = position;
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
	public EList<Display> getDisplays() {
		if (displays == null) {
			displays = new EObjectContainmentEList<Display>(Display.class, this,
					GeneratorPackage.POSITIONED_ELEMENT__DISPLAYS);
		}
		return displays;
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
		case GeneratorPackage.POSITIONED_ELEMENT__DISPLAYS:
			return ((InternalEList<?>) getDisplays()).basicRemove(otherEnd, msgs);
		case GeneratorPackage.POSITIONED_ELEMENT__EXPECTED_ANSWER:
			return ((InternalEList<?>) getExpectedAnswer()).basicRemove(otherEnd, msgs);
		case GeneratorPackage.POSITIONED_ELEMENT__ACCEPTED_FACTS:
			return ((InternalEList<?>) getAcceptedFacts()).basicRemove(otherEnd, msgs);
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
		case GeneratorPackage.POSITIONED_ELEMENT__DISPLAYS:
			return getDisplays();
		case GeneratorPackage.POSITIONED_ELEMENT__ELEMENT_TYPE:
			if (resolve)
				return getElementType();
			return basicGetElementType();
		case GeneratorPackage.POSITIONED_ELEMENT__EXPECTED_ANSWER:
			return getExpectedAnswer();
		case GeneratorPackage.POSITIONED_ELEMENT__FACT:
			if (resolve)
				return getFact();
			return basicGetFact();
		case GeneratorPackage.POSITIONED_ELEMENT__ACCEPTED_FACTS:
			return getAcceptedFacts();
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
			setPosition((Position) newValue);
			return;
		case GeneratorPackage.POSITIONED_ELEMENT__CORRECTNESS:
			setCorrectness((Correctness) newValue);
			return;
		case GeneratorPackage.POSITIONED_ELEMENT__DISPLAYS:
			getDisplays().clear();
			getDisplays().addAll((Collection<? extends Display>) newValue);
			return;
		case GeneratorPackage.POSITIONED_ELEMENT__ELEMENT_TYPE:
			setElementType((GPElementType) newValue);
			return;
		case GeneratorPackage.POSITIONED_ELEMENT__EXPECTED_ANSWER:
			getExpectedAnswer().clear();
			getExpectedAnswer().addAll((Collection<? extends ExpectedAnswer>) newValue);
			return;
		case GeneratorPackage.POSITIONED_ELEMENT__FACT:
			setFact((QuestionedFact) newValue);
			return;
		case GeneratorPackage.POSITIONED_ELEMENT__ACCEPTED_FACTS:
			getAcceptedFacts().clear();
			getAcceptedFacts().addAll((Collection<? extends FactSolutionParam>) newValue);
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
			setPosition((Position) null);
			return;
		case GeneratorPackage.POSITIONED_ELEMENT__CORRECTNESS:
			setCorrectness((Correctness) null);
			return;
		case GeneratorPackage.POSITIONED_ELEMENT__DISPLAYS:
			getDisplays().clear();
			return;
		case GeneratorPackage.POSITIONED_ELEMENT__ELEMENT_TYPE:
			setElementType((GPElementType) null);
			return;
		case GeneratorPackage.POSITIONED_ELEMENT__EXPECTED_ANSWER:
			getExpectedAnswer().clear();
			return;
		case GeneratorPackage.POSITIONED_ELEMENT__FACT:
			setFact((QuestionedFact) null);
			return;
		case GeneratorPackage.POSITIONED_ELEMENT__ACCEPTED_FACTS:
			getAcceptedFacts().clear();
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
		case GeneratorPackage.POSITIONED_ELEMENT__DISPLAYS:
			return displays != null && !displays.isEmpty();
		case GeneratorPackage.POSITIONED_ELEMENT__ELEMENT_TYPE:
			return elementType != null;
		case GeneratorPackage.POSITIONED_ELEMENT__EXPECTED_ANSWER:
			return expectedAnswer != null && !expectedAnswer.isEmpty();
		case GeneratorPackage.POSITIONED_ELEMENT__FACT:
			return fact != null;
		case GeneratorPackage.POSITIONED_ELEMENT__ACCEPTED_FACTS:
			return acceptedFacts != null && !acceptedFacts.isEmpty();
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
