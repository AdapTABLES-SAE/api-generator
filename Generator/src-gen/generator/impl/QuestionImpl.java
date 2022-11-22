/**
 */
package generator.impl;

import generator.GeneratorPackage;
import generator.Position;
import generator.Question;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Question</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.QuestionImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link generator.impl.QuestionImpl#getIncompleteFact <em>Incomplete Fact</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuestionImpl extends MinimalEObjectImpl.Container implements Question {
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
	 * The default value of the '{@link #getIncompleteFact() <em>Incomplete Fact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncompleteFact()
	 * @generated
	 * @ordered
	 */
	protected static final String INCOMPLETE_FACT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIncompleteFact() <em>Incomplete Fact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncompleteFact()
	 * @generated
	 * @ordered
	 */
	protected String incompleteFact = INCOMPLETE_FACT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.QUESTION;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GeneratorPackage.QUESTION__POSITION,
							oldPosition, position));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.QUESTION__POSITION, oldPosition,
					position));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIncompleteFact() {
		return incompleteFact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncompleteFact(String newIncompleteFact) {
		String oldIncompleteFact = incompleteFact;
		incompleteFact = newIncompleteFact;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.QUESTION__INCOMPLETE_FACT,
					oldIncompleteFact, incompleteFact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GeneratorPackage.QUESTION__POSITION:
			if (resolve)
				return getPosition();
			return basicGetPosition();
		case GeneratorPackage.QUESTION__INCOMPLETE_FACT:
			return getIncompleteFact();
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
		case GeneratorPackage.QUESTION__POSITION:
			setPosition((Position) newValue);
			return;
		case GeneratorPackage.QUESTION__INCOMPLETE_FACT:
			setIncompleteFact((String) newValue);
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
		case GeneratorPackage.QUESTION__POSITION:
			setPosition((Position) null);
			return;
		case GeneratorPackage.QUESTION__INCOMPLETE_FACT:
			setIncompleteFact(INCOMPLETE_FACT_EDEFAULT);
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
		case GeneratorPackage.QUESTION__POSITION:
			return position != null;
		case GeneratorPackage.QUESTION__INCOMPLETE_FACT:
			return INCOMPLETE_FACT_EDEFAULT == null ? incompleteFact != null
					: !INCOMPLETE_FACT_EDEFAULT.equals(incompleteFact);
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
		result.append(" (incompleteFact: ");
		result.append(incompleteFact);
		result.append(')');
		return result.toString();
	}

} //QuestionImpl
