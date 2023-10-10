/**
 */
package generator.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import generator.FactSolutionParam;
import generator.GeneratorPackage;
import generator.QuestionParam;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Question Param</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.QuestionParamImpl#isInteractive <em>Interactive</em>}</li>
 *   <li>{@link generator.impl.QuestionParamImpl#getSolutions <em>Solutions</em>}</li>
 *   <li>{@link generator.impl.QuestionParamImpl#getCompleteFact <em>Complete Fact</em>}</li>
 *   <li>{@link generator.impl.QuestionParamImpl#isImage <em>Image</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuestionParamImpl extends AQuestionParamImpl implements QuestionParam {
	/**
	 * The default value of the '{@link #isInteractive() <em>Interactive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInteractive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INTERACTIVE_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isInteractive() <em>Interactive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInteractive()
	 * @generated
	 * @ordered
	 */
	protected boolean interactive = INTERACTIVE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSolutions() <em>Solutions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolutions()
	 * @generated
	 * @ordered
	 */
	protected EList<FactSolutionParam> solutions;

	/**
	 * The default value of the '{@link #getCompleteFact() <em>Complete Fact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompleteFact()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPLETE_FACT_EDEFAULT = null;
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
	 * The default value of the '{@link #isImage() <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isImage()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IMAGE_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isImage() <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isImage()
	 * @generated
	 * @ordered
	 */
	protected boolean image = IMAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionParamImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.QUESTION_PARAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInteractive() {
		return interactive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInteractive(boolean newInteractive) {
		boolean oldInteractive = interactive;
		interactive = newInteractive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.QUESTION_PARAM__INTERACTIVE,
					oldInteractive, interactive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FactSolutionParam> getSolutions() {
		if (solutions == null) {
			solutions = new EObjectContainmentEList<FactSolutionParam>(FactSolutionParam.class, this,
					GeneratorPackage.QUESTION_PARAM__SOLUTIONS);
		}
		return solutions;
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
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.QUESTION_PARAM__COMPLETE_FACT,
					oldCompleteFact, completeFact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isImage() {
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImage(boolean newImage) {
		boolean oldImage = image;
		image = newImage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.QUESTION_PARAM__IMAGE, oldImage,
					image));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GeneratorPackage.QUESTION_PARAM__SOLUTIONS:
			return ((InternalEList<?>) getSolutions()).basicRemove(otherEnd, msgs);
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
		case GeneratorPackage.QUESTION_PARAM__INTERACTIVE:
			return isInteractive();
		case GeneratorPackage.QUESTION_PARAM__SOLUTIONS:
			return getSolutions();
		case GeneratorPackage.QUESTION_PARAM__COMPLETE_FACT:
			return getCompleteFact();
		case GeneratorPackage.QUESTION_PARAM__IMAGE:
			return isImage();
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
		case GeneratorPackage.QUESTION_PARAM__INTERACTIVE:
			setInteractive((Boolean) newValue);
			return;
		case GeneratorPackage.QUESTION_PARAM__SOLUTIONS:
			getSolutions().clear();
			getSolutions().addAll((Collection<? extends FactSolutionParam>) newValue);
			return;
		case GeneratorPackage.QUESTION_PARAM__COMPLETE_FACT:
			setCompleteFact((String) newValue);
			return;
		case GeneratorPackage.QUESTION_PARAM__IMAGE:
			setImage((Boolean) newValue);
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
		case GeneratorPackage.QUESTION_PARAM__INTERACTIVE:
			setInteractive(INTERACTIVE_EDEFAULT);
			return;
		case GeneratorPackage.QUESTION_PARAM__SOLUTIONS:
			getSolutions().clear();
			return;
		case GeneratorPackage.QUESTION_PARAM__COMPLETE_FACT:
			setCompleteFact(COMPLETE_FACT_EDEFAULT);
			return;
		case GeneratorPackage.QUESTION_PARAM__IMAGE:
			setImage(IMAGE_EDEFAULT);
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
		case GeneratorPackage.QUESTION_PARAM__INTERACTIVE:
			return interactive != INTERACTIVE_EDEFAULT;
		case GeneratorPackage.QUESTION_PARAM__SOLUTIONS:
			return solutions != null && !solutions.isEmpty();
		case GeneratorPackage.QUESTION_PARAM__COMPLETE_FACT:
			return COMPLETE_FACT_EDEFAULT == null ? completeFact != null : !COMPLETE_FACT_EDEFAULT.equals(completeFact);
		case GeneratorPackage.QUESTION_PARAM__IMAGE:
			return image != IMAGE_EDEFAULT;
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
		result.append(" (interactive: ");
		result.append(interactive);
		result.append(", completeFact: ");
		result.append(completeFact);
		result.append(", image: ");
		result.append(image);
		result.append(')');
		return result.toString();
	}

} //QuestionParamImpl
