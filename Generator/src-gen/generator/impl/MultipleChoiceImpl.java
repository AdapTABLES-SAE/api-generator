/**
 */
package generator.impl;

import generator.GeneratorPackage;
import generator.MultipleChoice;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multiple Choice</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.MultipleChoiceImpl#getNbChoices <em>Nb Choices</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MultipleChoiceImpl extends ResponseModalityImpl implements MultipleChoice {
	/**
	 * The default value of the '{@link #getNbChoices() <em>Nb Choices</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbChoices()
	 * @generated
	 * @ordered
	 */
	protected static final int NB_CHOICES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNbChoices() <em>Nb Choices</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbChoices()
	 * @generated
	 * @ordered
	 */
	protected int nbChoices = NB_CHOICES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleChoiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.MULTIPLE_CHOICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNbChoices() {
		return nbChoices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbChoices(int newNbChoices) {
		int oldNbChoices = nbChoices;
		nbChoices = newNbChoices;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.MULTIPLE_CHOICE__NB_CHOICES,
					oldNbChoices, nbChoices));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GeneratorPackage.MULTIPLE_CHOICE__NB_CHOICES:
			return getNbChoices();
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
		case GeneratorPackage.MULTIPLE_CHOICE__NB_CHOICES:
			setNbChoices((Integer) newValue);
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
		case GeneratorPackage.MULTIPLE_CHOICE__NB_CHOICES:
			setNbChoices(NB_CHOICES_EDEFAULT);
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
		case GeneratorPackage.MULTIPLE_CHOICE__NB_CHOICES:
			return nbChoices != NB_CHOICES_EDEFAULT;
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
		result.append(" (nbChoices: ");
		result.append(nbChoices);
		result.append(')');
		return result.toString();
	}

} //MultipleChoiceImpl
