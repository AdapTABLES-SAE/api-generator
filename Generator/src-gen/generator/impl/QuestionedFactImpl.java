/**
 */
package generator.impl;

import generator.GeneratorPackage;
import generator.Position;
import generator.QuestionableFact;
import generator.QuestionedFact;
import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Questioned Fact</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.QuestionedFactImpl#getQuestionablefact <em>Questionablefact</em>}</li>
 *   <li>{@link generator.impl.QuestionedFactImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link generator.impl.QuestionedFactImpl#getQuestionText <em>Question Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class QuestionedFactImpl extends MinimalEObjectImpl.Container implements QuestionedFact {
	/**
	 * The cached value of the '{@link #getQuestionablefact() <em>Questionablefact</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestionablefact()
	 * @generated
	 * @ordered
	 */
	protected QuestionableFact questionablefact;

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
	 * The default value of the '{@link #getQuestionText() <em>Question Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestionText()
	 * @generated
	 * @ordered
	 */
	protected static final String QUESTION_TEXT_EDEFAULT = "TEST";

	/**
	 * The cached value of the '{@link #getQuestionText() <em>Question Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestionText()
	 * @generated
	 * @ordered
	 */
	protected String questionText = QUESTION_TEXT_EDEFAULT;

	/**
	 * This is true if the Question Text attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean questionTextESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionedFactImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.QUESTIONED_FACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionableFact getQuestionablefact() {
		if (questionablefact != null && questionablefact.eIsProxy()) {
			InternalEObject oldQuestionablefact = (InternalEObject) questionablefact;
			questionablefact = (QuestionableFact) eResolveProxy(oldQuestionablefact);
			if (questionablefact != oldQuestionablefact) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							GeneratorPackage.QUESTIONED_FACT__QUESTIONABLEFACT, oldQuestionablefact, questionablefact));
			}
		}
		return questionablefact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionableFact basicGetQuestionablefact() {
		return questionablefact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuestionablefact(QuestionableFact newQuestionablefact) {
		QuestionableFact oldQuestionablefact = questionablefact;
		questionablefact = newQuestionablefact;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.QUESTIONED_FACT__QUESTIONABLEFACT,
					oldQuestionablefact, questionablefact));
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
							GeneratorPackage.QUESTIONED_FACT__POSITION, oldPosition, position));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.QUESTIONED_FACT__POSITION,
					oldPosition, position));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQuestionText() {
		return questionText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuestionText(String newQuestionText) {
		String oldQuestionText = questionText;
		questionText = newQuestionText;
		boolean oldQuestionTextESet = questionTextESet;
		questionTextESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.QUESTIONED_FACT__QUESTION_TEXT,
					oldQuestionText, questionText, !oldQuestionTextESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetQuestionText() {
		String oldQuestionText = questionText;
		boolean oldQuestionTextESet = questionTextESet;
		questionText = QUESTION_TEXT_EDEFAULT;
		questionTextESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, GeneratorPackage.QUESTIONED_FACT__QUESTION_TEXT,
					oldQuestionText, QUESTION_TEXT_EDEFAULT, oldQuestionTextESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetQuestionText() {
		return questionTextESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public abstract void setQuestionText();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getQuestionedFactQuestion() {
		return getQuestionablefact().getQuestionableFact();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GeneratorPackage.QUESTIONED_FACT__QUESTIONABLEFACT:
			if (resolve)
				return getQuestionablefact();
			return basicGetQuestionablefact();
		case GeneratorPackage.QUESTIONED_FACT__POSITION:
			if (resolve)
				return getPosition();
			return basicGetPosition();
		case GeneratorPackage.QUESTIONED_FACT__QUESTION_TEXT:
			return getQuestionText();
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
		case GeneratorPackage.QUESTIONED_FACT__QUESTIONABLEFACT:
			setQuestionablefact((QuestionableFact) newValue);
			return;
		case GeneratorPackage.QUESTIONED_FACT__POSITION:
			setPosition((Position) newValue);
			return;
		case GeneratorPackage.QUESTIONED_FACT__QUESTION_TEXT:
			setQuestionText((String) newValue);
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
		case GeneratorPackage.QUESTIONED_FACT__QUESTIONABLEFACT:
			setQuestionablefact((QuestionableFact) null);
			return;
		case GeneratorPackage.QUESTIONED_FACT__POSITION:
			setPosition((Position) null);
			return;
		case GeneratorPackage.QUESTIONED_FACT__QUESTION_TEXT:
			unsetQuestionText();
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
		case GeneratorPackage.QUESTIONED_FACT__QUESTIONABLEFACT:
			return questionablefact != null;
		case GeneratorPackage.QUESTIONED_FACT__POSITION:
			return position != null;
		case GeneratorPackage.QUESTIONED_FACT__QUESTION_TEXT:
			return isSetQuestionText();
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
		case GeneratorPackage.QUESTIONED_FACT___SET_QUESTION_TEXT:
			setQuestionText();
			return null;
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
		result.append(" (questionText: ");
		if (questionTextESet)
			result.append(questionText);
		else
			result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //QuestionedFactImpl
