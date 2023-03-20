/**
 */
package generator.impl;

import generator.APosition;
import generator.Display;
import generator.GeneratorPackage;
import generator.QuestionedFact;
import generator.QuestionedFactStatement;
import generator.StatementType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Questioned Fact Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.QuestionedFactStatementImpl#getType <em>Type</em>}</li>
 *   <li>{@link generator.impl.QuestionedFactStatementImpl#getQuestionedFact <em>Questioned Fact</em>}</li>
 *   <li>{@link generator.impl.QuestionedFactStatementImpl#getDisplay <em>Display</em>}</li>
 *   <li>{@link generator.impl.QuestionedFactStatementImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link generator.impl.QuestionedFactStatementImpl#getID <em>ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuestionedFactStatementImpl extends MinimalEObjectImpl.Container implements QuestionedFactStatement {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final StatementType TYPE_EDEFAULT = StatementType.TEXTUAL;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected StatementType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getQuestionedFact() <em>Questioned Fact</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestionedFact()
	 * @generated
	 * @ordered
	 */
	protected QuestionedFact questionedFact;

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
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected APosition position;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionedFactStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.QUESTIONED_FACT_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatementType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(StatementType newType) {
		StatementType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.QUESTIONED_FACT_STATEMENT__TYPE,
					oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionedFact getQuestionedFact() {
		if (questionedFact != null && questionedFact.eIsProxy()) {
			InternalEObject oldQuestionedFact = (InternalEObject) questionedFact;
			questionedFact = (QuestionedFact) eResolveProxy(oldQuestionedFact);
			if (questionedFact != oldQuestionedFact) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							GeneratorPackage.QUESTIONED_FACT_STATEMENT__QUESTIONED_FACT, oldQuestionedFact,
							questionedFact));
			}
		}
		return questionedFact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionedFact basicGetQuestionedFact() {
		return questionedFact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuestionedFact(QuestionedFact newQuestionedFact) {
		QuestionedFact oldQuestionedFact = questionedFact;
		questionedFact = newQuestionedFact;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.QUESTIONED_FACT_STATEMENT__QUESTIONED_FACT, oldQuestionedFact, questionedFact));
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
					GeneratorPackage.QUESTIONED_FACT_STATEMENT__DISPLAY, oldDisplay, newDisplay);
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
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.QUESTIONED_FACT_STATEMENT__DISPLAY, null, msgs);
			if (newDisplay != null)
				msgs = ((InternalEObject) newDisplay).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.QUESTIONED_FACT_STATEMENT__DISPLAY, null, msgs);
			msgs = basicSetDisplay(newDisplay, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.QUESTIONED_FACT_STATEMENT__DISPLAY,
					newDisplay, newDisplay));
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
							GeneratorPackage.QUESTIONED_FACT_STATEMENT__POSITION, oldPosition, position));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.QUESTIONED_FACT_STATEMENT__POSITION,
					oldPosition, position));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.QUESTIONED_FACT_STATEMENT__ID, oldID,
					id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GeneratorPackage.QUESTIONED_FACT_STATEMENT__DISPLAY:
			return basicSetDisplay(null, msgs);
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
		case GeneratorPackage.QUESTIONED_FACT_STATEMENT__TYPE:
			return getType();
		case GeneratorPackage.QUESTIONED_FACT_STATEMENT__QUESTIONED_FACT:
			if (resolve)
				return getQuestionedFact();
			return basicGetQuestionedFact();
		case GeneratorPackage.QUESTIONED_FACT_STATEMENT__DISPLAY:
			return getDisplay();
		case GeneratorPackage.QUESTIONED_FACT_STATEMENT__POSITION:
			if (resolve)
				return getPosition();
			return basicGetPosition();
		case GeneratorPackage.QUESTIONED_FACT_STATEMENT__ID:
			return getID();
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
		case GeneratorPackage.QUESTIONED_FACT_STATEMENT__TYPE:
			setType((StatementType) newValue);
			return;
		case GeneratorPackage.QUESTIONED_FACT_STATEMENT__QUESTIONED_FACT:
			setQuestionedFact((QuestionedFact) newValue);
			return;
		case GeneratorPackage.QUESTIONED_FACT_STATEMENT__DISPLAY:
			setDisplay((Display) newValue);
			return;
		case GeneratorPackage.QUESTIONED_FACT_STATEMENT__POSITION:
			setPosition((APosition) newValue);
			return;
		case GeneratorPackage.QUESTIONED_FACT_STATEMENT__ID:
			setID((String) newValue);
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
		case GeneratorPackage.QUESTIONED_FACT_STATEMENT__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case GeneratorPackage.QUESTIONED_FACT_STATEMENT__QUESTIONED_FACT:
			setQuestionedFact((QuestionedFact) null);
			return;
		case GeneratorPackage.QUESTIONED_FACT_STATEMENT__DISPLAY:
			setDisplay((Display) null);
			return;
		case GeneratorPackage.QUESTIONED_FACT_STATEMENT__POSITION:
			setPosition((APosition) null);
			return;
		case GeneratorPackage.QUESTIONED_FACT_STATEMENT__ID:
			setID(ID_EDEFAULT);
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
		case GeneratorPackage.QUESTIONED_FACT_STATEMENT__TYPE:
			return type != TYPE_EDEFAULT;
		case GeneratorPackage.QUESTIONED_FACT_STATEMENT__QUESTIONED_FACT:
			return questionedFact != null;
		case GeneratorPackage.QUESTIONED_FACT_STATEMENT__DISPLAY:
			return display != null;
		case GeneratorPackage.QUESTIONED_FACT_STATEMENT__POSITION:
			return position != null;
		case GeneratorPackage.QUESTIONED_FACT_STATEMENT__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
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
		result.append(" (type: ");
		result.append(type);
		result.append(", ID: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //QuestionedFactStatementImpl
