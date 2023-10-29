/**
 */
package generator.impl;

import generator.EJudoTarget;
import generator.GeneratorPackage;
import generator.JudoQuestionableTechniqueFact;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Judo Questionable Technique Fact</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.JudoQuestionableTechniqueFactImpl#getSourceElementType <em>Source Element Type</em>}</li>
 *   <li>{@link generator.impl.JudoQuestionableTechniqueFactImpl#getMissingElement <em>Missing Element</em>}</li>
 *   <li>{@link generator.impl.JudoQuestionableTechniqueFactImpl#getSourceElement <em>Source Element</em>}</li>
 *   <li>{@link generator.impl.JudoQuestionableTechniqueFactImpl#getMissingElementType <em>Missing Element Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JudoQuestionableTechniqueFactImpl extends QuestionableFactImpl implements JudoQuestionableTechniqueFact {
	/**
	 * The default value of the '{@link #getSourceElementType() <em>Source Element Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceElementType()
	 * @generated
	 * @ordered
	 */
	protected static final EJudoTarget SOURCE_ELEMENT_TYPE_EDEFAULT = EJudoTarget.NAME;

	/**
	 * The cached value of the '{@link #getSourceElementType() <em>Source Element Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceElementType()
	 * @generated
	 * @ordered
	 */
	protected EJudoTarget sourceElementType = SOURCE_ELEMENT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMissingElement() <em>Missing Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMissingElement()
	 * @generated
	 * @ordered
	 */
	protected static final String MISSING_ELEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMissingElement() <em>Missing Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMissingElement()
	 * @generated
	 * @ordered
	 */
	protected String missingElement = MISSING_ELEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceElement() <em>Source Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceElement()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_ELEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceElement() <em>Source Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceElement()
	 * @generated
	 * @ordered
	 */
	protected String sourceElement = SOURCE_ELEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMissingElementType() <em>Missing Element Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMissingElementType()
	 * @generated
	 * @ordered
	 */
	protected static final EJudoTarget MISSING_ELEMENT_TYPE_EDEFAULT = EJudoTarget.NAME;

	/**
	 * The cached value of the '{@link #getMissingElementType() <em>Missing Element Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMissingElementType()
	 * @generated
	 * @ordered
	 */
	protected EJudoTarget missingElementType = MISSING_ELEMENT_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JudoQuestionableTechniqueFactImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.JUDO_QUESTIONABLE_TECHNIQUE_FACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EJudoTarget getSourceElementType() {
		return sourceElementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceElementType(EJudoTarget newSourceElementType) {
		EJudoTarget oldSourceElementType = sourceElementType;
		sourceElementType = newSourceElementType == null ? SOURCE_ELEMENT_TYPE_EDEFAULT : newSourceElementType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.JUDO_QUESTIONABLE_TECHNIQUE_FACT__SOURCE_ELEMENT_TYPE, oldSourceElementType,
					sourceElementType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMissingElement() {
		return missingElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMissingElement(String newMissingElement) {
		String oldMissingElement = missingElement;
		missingElement = newMissingElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.JUDO_QUESTIONABLE_TECHNIQUE_FACT__MISSING_ELEMENT, oldMissingElement,
					missingElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceElement() {
		return sourceElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceElement(String newSourceElement) {
		String oldSourceElement = sourceElement;
		sourceElement = newSourceElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.JUDO_QUESTIONABLE_TECHNIQUE_FACT__SOURCE_ELEMENT, oldSourceElement,
					sourceElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EJudoTarget getMissingElementType() {
		return missingElementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMissingElementType(EJudoTarget newMissingElementType) {
		EJudoTarget oldMissingElementType = missingElementType;
		missingElementType = newMissingElementType == null ? MISSING_ELEMENT_TYPE_EDEFAULT : newMissingElementType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.JUDO_QUESTIONABLE_TECHNIQUE_FACT__MISSING_ELEMENT_TYPE, oldMissingElementType,
					missingElementType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GeneratorPackage.JUDO_QUESTIONABLE_TECHNIQUE_FACT__SOURCE_ELEMENT_TYPE:
			return getSourceElementType();
		case GeneratorPackage.JUDO_QUESTIONABLE_TECHNIQUE_FACT__MISSING_ELEMENT:
			return getMissingElement();
		case GeneratorPackage.JUDO_QUESTIONABLE_TECHNIQUE_FACT__SOURCE_ELEMENT:
			return getSourceElement();
		case GeneratorPackage.JUDO_QUESTIONABLE_TECHNIQUE_FACT__MISSING_ELEMENT_TYPE:
			return getMissingElementType();
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
		case GeneratorPackage.JUDO_QUESTIONABLE_TECHNIQUE_FACT__SOURCE_ELEMENT_TYPE:
			setSourceElementType((EJudoTarget) newValue);
			return;
		case GeneratorPackage.JUDO_QUESTIONABLE_TECHNIQUE_FACT__MISSING_ELEMENT:
			setMissingElement((String) newValue);
			return;
		case GeneratorPackage.JUDO_QUESTIONABLE_TECHNIQUE_FACT__SOURCE_ELEMENT:
			setSourceElement((String) newValue);
			return;
		case GeneratorPackage.JUDO_QUESTIONABLE_TECHNIQUE_FACT__MISSING_ELEMENT_TYPE:
			setMissingElementType((EJudoTarget) newValue);
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
		case GeneratorPackage.JUDO_QUESTIONABLE_TECHNIQUE_FACT__SOURCE_ELEMENT_TYPE:
			setSourceElementType(SOURCE_ELEMENT_TYPE_EDEFAULT);
			return;
		case GeneratorPackage.JUDO_QUESTIONABLE_TECHNIQUE_FACT__MISSING_ELEMENT:
			setMissingElement(MISSING_ELEMENT_EDEFAULT);
			return;
		case GeneratorPackage.JUDO_QUESTIONABLE_TECHNIQUE_FACT__SOURCE_ELEMENT:
			setSourceElement(SOURCE_ELEMENT_EDEFAULT);
			return;
		case GeneratorPackage.JUDO_QUESTIONABLE_TECHNIQUE_FACT__MISSING_ELEMENT_TYPE:
			setMissingElementType(MISSING_ELEMENT_TYPE_EDEFAULT);
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
		case GeneratorPackage.JUDO_QUESTIONABLE_TECHNIQUE_FACT__SOURCE_ELEMENT_TYPE:
			return sourceElementType != SOURCE_ELEMENT_TYPE_EDEFAULT;
		case GeneratorPackage.JUDO_QUESTIONABLE_TECHNIQUE_FACT__MISSING_ELEMENT:
			return MISSING_ELEMENT_EDEFAULT == null ? missingElement != null
					: !MISSING_ELEMENT_EDEFAULT.equals(missingElement);
		case GeneratorPackage.JUDO_QUESTIONABLE_TECHNIQUE_FACT__SOURCE_ELEMENT:
			return SOURCE_ELEMENT_EDEFAULT == null ? sourceElement != null
					: !SOURCE_ELEMENT_EDEFAULT.equals(sourceElement);
		case GeneratorPackage.JUDO_QUESTIONABLE_TECHNIQUE_FACT__MISSING_ELEMENT_TYPE:
			return missingElementType != MISSING_ELEMENT_TYPE_EDEFAULT;
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
		result.append(" (sourceElementType: ");
		result.append(sourceElementType);
		result.append(", missingElement: ");
		result.append(missingElement);
		result.append(", sourceElement: ");
		result.append(sourceElement);
		result.append(", missingElementType: ");
		result.append(missingElementType);
		result.append(')');
		return result.toString();
	}

	@Override
	public String getQuestionableFact() {
		return this.sourceElement + " correspond a ?";
	}

	@Override
	public String getCompleteFact() {
		return this.sourceElement + " correspond a " + this.missingElement;
	}

} //JudoQuestionableTechniqueFactImpl
