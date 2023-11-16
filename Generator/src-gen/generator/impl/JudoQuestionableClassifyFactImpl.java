/**
 */
package generator.impl;

import generator.GeneratorPackage;
import generator.JudoQuestionableClassifyFact;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Judo Questionable Classify Fact</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.JudoQuestionableClassifyFactImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link generator.impl.JudoQuestionableClassifyFactImpl#getTechniques <em>Techniques</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JudoQuestionableClassifyFactImpl extends QuestionableFactImpl implements JudoQuestionableClassifyFact {
	/**
	 * The default value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected static final String CATEGORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected String category = CATEGORY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTechniques() <em>Techniques</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTechniques()
	 * @generated
	 * @ordered
	 */
	protected EList<String> techniques;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JudoQuestionableClassifyFactImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.JUDO_QUESTIONABLE_CLASSIFY_FACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(String newCategory) {
		String oldCategory = category;
		category = newCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.JUDO_QUESTIONABLE_CLASSIFY_FACT__CATEGORY, oldCategory, category));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getTechniques() {
		if (techniques == null) {
			techniques = new EDataTypeUniqueEList<String>(String.class, this,
					GeneratorPackage.JUDO_QUESTIONABLE_CLASSIFY_FACT__TECHNIQUES);
		}
		return techniques;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GeneratorPackage.JUDO_QUESTIONABLE_CLASSIFY_FACT__CATEGORY:
			return getCategory();
		case GeneratorPackage.JUDO_QUESTIONABLE_CLASSIFY_FACT__TECHNIQUES:
			return getTechniques();
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
		case GeneratorPackage.JUDO_QUESTIONABLE_CLASSIFY_FACT__CATEGORY:
			setCategory((String) newValue);
			return;
		case GeneratorPackage.JUDO_QUESTIONABLE_CLASSIFY_FACT__TECHNIQUES:
			getTechniques().clear();
			getTechniques().addAll((Collection<? extends String>) newValue);
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
		case GeneratorPackage.JUDO_QUESTIONABLE_CLASSIFY_FACT__CATEGORY:
			setCategory(CATEGORY_EDEFAULT);
			return;
		case GeneratorPackage.JUDO_QUESTIONABLE_CLASSIFY_FACT__TECHNIQUES:
			getTechniques().clear();
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
		case GeneratorPackage.JUDO_QUESTIONABLE_CLASSIFY_FACT__CATEGORY:
			return CATEGORY_EDEFAULT == null ? category != null : !CATEGORY_EDEFAULT.equals(category);
		case GeneratorPackage.JUDO_QUESTIONABLE_CLASSIFY_FACT__TECHNIQUES:
			return techniques != null && !techniques.isEmpty();
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
		result.append(" (category: ");
		result.append(category);
		result.append(", techniques: ");
		result.append(techniques);
		result.append(')');
		return result.toString();
	}

	@Override
	public String getQuestionableFact() {
		return this.category;
	}

	@Override
	public String getCompleteFact() {
		String completeFact = getQuestionableFact() + " : ";
		for(int i = 0; i < getTechniques().size(); i++) {
			completeFact += getTechniques().get(i);
			if(i < getTechniques().size() - 1) { completeFact += ", "; }
		}
		return completeFact;
	}

} //JudoQuestionableClassifyFactImpl
