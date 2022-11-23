/**
 */
package generator.impl;

import generator.EModality;
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
 *   <li>{@link generator.impl.MultipleChoiceImpl#getType <em>Type</em>}</li>
 *   <li>{@link generator.impl.MultipleChoiceImpl#getNbChoices <em>Nb Choices</em>}</li>
 *   <li>{@link generator.impl.MultipleChoiceImpl#getNbBadChoices <em>Nb Bad Choices</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MultipleChoiceImpl extends ResponseModalityImpl implements MultipleChoice {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final EModality TYPE_EDEFAULT = EModality.CHOICE;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EModality type = TYPE_EDEFAULT;

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
	 * The default value of the '{@link #getNbBadChoices() <em>Nb Bad Choices</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbBadChoices()
	 * @generated
	 * @ordered
	 */
	protected static final int NB_BAD_CHOICES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNbBadChoices() <em>Nb Bad Choices</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbBadChoices()
	 * @generated
	 * @ordered
	 */
	protected int nbBadChoices = NB_BAD_CHOICES_EDEFAULT;

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
	public EModality getType() {
		return type;
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
	public int getNbBadChoices() {
		return nbBadChoices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbBadChoices(int newNbBadChoices) {
		int oldNbBadChoices = nbBadChoices;
		nbBadChoices = newNbBadChoices;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.MULTIPLE_CHOICE__NB_BAD_CHOICES,
					oldNbBadChoices, nbBadChoices));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GeneratorPackage.MULTIPLE_CHOICE__TYPE:
			return getType();
		case GeneratorPackage.MULTIPLE_CHOICE__NB_CHOICES:
			return getNbChoices();
		case GeneratorPackage.MULTIPLE_CHOICE__NB_BAD_CHOICES:
			return getNbBadChoices();
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
		case GeneratorPackage.MULTIPLE_CHOICE__NB_BAD_CHOICES:
			setNbBadChoices((Integer) newValue);
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
		case GeneratorPackage.MULTIPLE_CHOICE__NB_BAD_CHOICES:
			setNbBadChoices(NB_BAD_CHOICES_EDEFAULT);
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
		case GeneratorPackage.MULTIPLE_CHOICE__TYPE:
			return type != TYPE_EDEFAULT;
		case GeneratorPackage.MULTIPLE_CHOICE__NB_CHOICES:
			return nbChoices != NB_CHOICES_EDEFAULT;
		case GeneratorPackage.MULTIPLE_CHOICE__NB_BAD_CHOICES:
			return nbBadChoices != NB_BAD_CHOICES_EDEFAULT;
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
		result.append(", nbChoices: ");
		result.append(nbChoices);
		result.append(", nbBadChoices: ");
		result.append(nbBadChoices);
		result.append(')');
		return result.toString();
	}

} //MultipleChoiceImpl
