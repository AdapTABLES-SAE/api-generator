/**
 */
package generator.impl;

import generator.DateQuestionableFact;
import generator.EHistoryTarget;
import generator.GeneratorPackage;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Date Questionable Fact</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.DateQuestionableFactImpl#getSourceElement <em>Source Element</em>}</li>
 *   <li>{@link generator.impl.DateQuestionableFactImpl#getMissingElements <em>Missing Elements</em>}</li>
 *   <li>{@link generator.impl.DateQuestionableFactImpl#getSourceElementType <em>Source Element Type</em>}</li>
 *   <li>{@link generator.impl.DateQuestionableFactImpl#getMissingElementsType <em>Missing Elements Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DateQuestionableFactImpl extends QuestionableFactImpl implements DateQuestionableFact {
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
	 * The cached value of the '{@link #getMissingElements() <em>Missing Elements</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMissingElements()
	 * @generated
	 * @ordered
	 */
	protected EList<String> missingElements;
	/**
	 * The default value of the '{@link #getSourceElementType() <em>Source Element Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceElementType()
	 * @generated
	 * @ordered
	 */
	protected static final EHistoryTarget SOURCE_ELEMENT_TYPE_EDEFAULT = EHistoryTarget.EVENT;
	/**
	 * The cached value of the '{@link #getSourceElementType() <em>Source Element Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceElementType()
	 * @generated
	 * @ordered
	 */
	protected EHistoryTarget sourceElementType = SOURCE_ELEMENT_TYPE_EDEFAULT;
	/**
	 * The default value of the '{@link #getMissingElementsType() <em>Missing Elements Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMissingElementsType()
	 * @generated
	 * @ordered
	 */
	protected static final EHistoryTarget MISSING_ELEMENTS_TYPE_EDEFAULT = EHistoryTarget.EVENT;
	/**
	 * The cached value of the '{@link #getMissingElementsType() <em>Missing Elements Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMissingElementsType()
	 * @generated
	 * @ordered
	 */
	protected EHistoryTarget missingElementsType = MISSING_ELEMENTS_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateQuestionableFactImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.DATE_QUESTIONABLE_FACT;
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
					GeneratorPackage.DATE_QUESTIONABLE_FACT__SOURCE_ELEMENT, oldSourceElement, sourceElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getMissingElements() {
		if (missingElements == null) {
			missingElements = new EDataTypeUniqueEList<String>(String.class, this,
					GeneratorPackage.DATE_QUESTIONABLE_FACT__MISSING_ELEMENTS);
		}
		return missingElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EHistoryTarget getSourceElementType() {
		return sourceElementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceElementType(EHistoryTarget newSourceElementType) {
		EHistoryTarget oldSourceElementType = sourceElementType;
		sourceElementType = newSourceElementType == null ? SOURCE_ELEMENT_TYPE_EDEFAULT : newSourceElementType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.DATE_QUESTIONABLE_FACT__SOURCE_ELEMENT_TYPE, oldSourceElementType,
					sourceElementType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EHistoryTarget getMissingElementsType() {
		return missingElementsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMissingElementsType(EHistoryTarget newMissingElementsType) {
		EHistoryTarget oldMissingElementsType = missingElementsType;
		missingElementsType = newMissingElementsType == null ? MISSING_ELEMENTS_TYPE_EDEFAULT : newMissingElementsType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.DATE_QUESTIONABLE_FACT__MISSING_ELEMENTS_TYPE, oldMissingElementsType,
					missingElementsType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GeneratorPackage.DATE_QUESTIONABLE_FACT__SOURCE_ELEMENT:
			return getSourceElement();
		case GeneratorPackage.DATE_QUESTIONABLE_FACT__MISSING_ELEMENTS:
			return getMissingElements();
		case GeneratorPackage.DATE_QUESTIONABLE_FACT__SOURCE_ELEMENT_TYPE:
			return getSourceElementType();
		case GeneratorPackage.DATE_QUESTIONABLE_FACT__MISSING_ELEMENTS_TYPE:
			return getMissingElementsType();
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
		case GeneratorPackage.DATE_QUESTIONABLE_FACT__SOURCE_ELEMENT:
			setSourceElement((String) newValue);
			return;
		case GeneratorPackage.DATE_QUESTIONABLE_FACT__MISSING_ELEMENTS:
			getMissingElements().clear();
			getMissingElements().addAll((Collection<? extends String>) newValue);
			return;
		case GeneratorPackage.DATE_QUESTIONABLE_FACT__SOURCE_ELEMENT_TYPE:
			setSourceElementType((EHistoryTarget) newValue);
			return;
		case GeneratorPackage.DATE_QUESTIONABLE_FACT__MISSING_ELEMENTS_TYPE:
			setMissingElementsType((EHistoryTarget) newValue);
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
		case GeneratorPackage.DATE_QUESTIONABLE_FACT__SOURCE_ELEMENT:
			setSourceElement(SOURCE_ELEMENT_EDEFAULT);
			return;
		case GeneratorPackage.DATE_QUESTIONABLE_FACT__MISSING_ELEMENTS:
			getMissingElements().clear();
			return;
		case GeneratorPackage.DATE_QUESTIONABLE_FACT__SOURCE_ELEMENT_TYPE:
			setSourceElementType(SOURCE_ELEMENT_TYPE_EDEFAULT);
			return;
		case GeneratorPackage.DATE_QUESTIONABLE_FACT__MISSING_ELEMENTS_TYPE:
			setMissingElementsType(MISSING_ELEMENTS_TYPE_EDEFAULT);
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
		case GeneratorPackage.DATE_QUESTIONABLE_FACT__SOURCE_ELEMENT:
			return SOURCE_ELEMENT_EDEFAULT == null ? sourceElement != null
					: !SOURCE_ELEMENT_EDEFAULT.equals(sourceElement);
		case GeneratorPackage.DATE_QUESTIONABLE_FACT__MISSING_ELEMENTS:
			return missingElements != null && !missingElements.isEmpty();
		case GeneratorPackage.DATE_QUESTIONABLE_FACT__SOURCE_ELEMENT_TYPE:
			return sourceElementType != SOURCE_ELEMENT_TYPE_EDEFAULT;
		case GeneratorPackage.DATE_QUESTIONABLE_FACT__MISSING_ELEMENTS_TYPE:
			return missingElementsType != MISSING_ELEMENTS_TYPE_EDEFAULT;
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
		result.append(" (sourceElement: ");
		result.append(sourceElement);
		result.append(", missingElements: ");
		result.append(missingElements);
		result.append(", sourceElementType: ");
		result.append(sourceElementType);
		result.append(", missingElementsType: ");
		result.append(missingElementsType);
		result.append(')');
		return result.toString();
	}

	@Override
	public String getQuestionableFact() {
		if (this.getSourceElementType().equals(EHistoryTarget.IMAGE)) {
			return "[" + this.getSourceElement() + "]" + " represente ?";
		} else if (this.getSourceElementType().equals(EHistoryTarget.EVENT)) {
			if (this.getMissingElementsType().equals(EHistoryTarget.TIME)) {
				if (this.getMissingElements().size() > 1) {
					return this.getSourceElement() + " a eu lieu entre ? et ?";
				} else {
					return this.getSourceElement() + " a eu lieu en/le ?";
				}
			} else {
				return this.getSourceElement() + " correspond a ?";
			}
		} else {
			if (this.getSourceElement().contains("-")) {
				return "? a eu lien entre " + this.getSourceElement();
			} else {
				return "? a eu lien en/le " + this.getSourceElement();
			}
		}
	}

	@Override
	public String getCompleteFact() {
		if (this.getSourceElementType().equals(EHistoryTarget.IMAGE)) {
			return this.getSourceElement() + " represente " + this.getMissingElements().get(0);
		} else if (this.getSourceElementType().equals(EHistoryTarget.EVENT)) {
			if (this.getMissingElementsType().equals(EHistoryTarget.TIME)) {
				if (this.getMissingElements().size() > 1) {
					return this.getSourceElement() + " a eu lieu entre " + this.getMissingElements().get(0) + " et "
							+ this.getMissingElements().get(1);
				} else {
					return this.getSourceElement() + " a eu lieu en/le " + this.getMissingElements().get(0);
				}
			} else {
				return this.getSourceElement() + " correspond a " + this.getMissingElements().get(0);
			}
		} else {
			if (this.getSourceElement().contains("-")) {
				return this.getMissingElements().get(0) + " a eu lien entre " + this.getSourceElement();
			} else {
				return this.getMissingElements().get(0) + " a eu lien en/le " + this.getSourceElement();
			}
		}
	}

} //DateQuestionableFactImpl
