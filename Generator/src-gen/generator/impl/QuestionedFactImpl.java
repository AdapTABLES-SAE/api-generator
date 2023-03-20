/**
 */
package generator.impl;

import generator.GeneratorPackage;
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
 *   <li>{@link generator.impl.QuestionedFactImpl#getCompleteFact <em>Complete Fact</em>}</li>
 *   <li>{@link generator.impl.QuestionedFactImpl#getCorrectnessToReach <em>Correctness To Reach</em>}</li>
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
	 * The default value of the '{@link #getCompleteFact() <em>Complete Fact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompleteFact()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPLETE_FACT_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getCompleteFact() <em>Complete Fact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompleteFact()
	 * @generated
	 * @ordered
	 */
	protected String completeFact = COMPLETE_FACT_EDEFAULT;

	/**
	 * This is true if the Complete Fact attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean completeFactESet;

	/**
	 * The default value of the '{@link #getCorrectnessToReach() <em>Correctness To Reach</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrectnessToReach()
	 * @generated
	 * @ordered
	 */
	protected static final int CORRECTNESS_TO_REACH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCorrectnessToReach() <em>Correctness To Reach</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrectnessToReach()
	 * @generated
	 * @ordered
	 */
	protected int correctnessToReach = CORRECTNESS_TO_REACH_EDEFAULT;

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
	public String getCompleteFact() {
		return completeFact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompleteFact(String newCompleteFact) {
		String oldCompleteFact = completeFact;
		completeFact = newCompleteFact;
		boolean oldCompleteFactESet = completeFactESet;
		completeFactESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.QUESTIONED_FACT__COMPLETE_FACT,
					oldCompleteFact, completeFact, !oldCompleteFactESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCompleteFact() {
		String oldCompleteFact = completeFact;
		boolean oldCompleteFactESet = completeFactESet;
		completeFact = COMPLETE_FACT_EDEFAULT;
		completeFactESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, GeneratorPackage.QUESTIONED_FACT__COMPLETE_FACT,
					oldCompleteFact, COMPLETE_FACT_EDEFAULT, oldCompleteFactESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCompleteFact() {
		return completeFactESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCorrectnessToReach() {
		return correctnessToReach;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCorrectnessToReach(int newCorrectnessToReach) {
		int oldCorrectnessToReach = correctnessToReach;
		correctnessToReach = newCorrectnessToReach;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.QUESTIONED_FACT__CORRECTNESS_TO_REACH, oldCorrectnessToReach, correctnessToReach));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setCompleteFact() {
		this.completeFact = this.questionablefact.getQuestionableFact();
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
		case GeneratorPackage.QUESTIONED_FACT__COMPLETE_FACT:
			return getCompleteFact();
		case GeneratorPackage.QUESTIONED_FACT__CORRECTNESS_TO_REACH:
			return getCorrectnessToReach();
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
		case GeneratorPackage.QUESTIONED_FACT__COMPLETE_FACT:
			setCompleteFact((String) newValue);
			return;
		case GeneratorPackage.QUESTIONED_FACT__CORRECTNESS_TO_REACH:
			setCorrectnessToReach((Integer) newValue);
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
		case GeneratorPackage.QUESTIONED_FACT__COMPLETE_FACT:
			unsetCompleteFact();
			return;
		case GeneratorPackage.QUESTIONED_FACT__CORRECTNESS_TO_REACH:
			setCorrectnessToReach(CORRECTNESS_TO_REACH_EDEFAULT);
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
		case GeneratorPackage.QUESTIONED_FACT__COMPLETE_FACT:
			return isSetCompleteFact();
		case GeneratorPackage.QUESTIONED_FACT__CORRECTNESS_TO_REACH:
			return correctnessToReach != CORRECTNESS_TO_REACH_EDEFAULT;
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
		case GeneratorPackage.QUESTIONED_FACT___SET_COMPLETE_FACT:
			setCompleteFact();
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
		result.append(" (completeFact: ");
		if (completeFactESet)
			result.append(completeFact);
		else
			result.append("<unset>");
		result.append(", correctnessToReach: ");
		result.append(correctnessToReach);
		result.append(')');
		return result.toString();
	}

} //QuestionedFactImpl
