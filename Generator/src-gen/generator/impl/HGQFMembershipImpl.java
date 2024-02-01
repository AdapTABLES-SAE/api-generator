/**
 */
package generator.impl;

import generator.EGeographyValue;
import generator.GeneratorPackage;
import generator.HGQFMembership;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HGQF Membership</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.HGQFMembershipImpl#getGoodChoices <em>Good Choices</em>}</li>
 *   <li>{@link generator.impl.HGQFMembershipImpl#getType <em>Type</em>}</li>
 *   <li>{@link generator.impl.HGQFMembershipImpl#getMembershipTo <em>Membership To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HGQFMembershipImpl extends QuestionableFactImpl implements HGQFMembership {
	/**
	 * The cached value of the '{@link #getGoodChoices() <em>Good Choices</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoodChoices()
	 * @generated
	 * @ordered
	 */
	protected EList<String> goodChoices;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final EGeographyValue TYPE_EDEFAULT = EGeographyValue.CITY;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EGeographyValue type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMembershipTo() <em>Membership To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMembershipTo()
	 * @generated
	 * @ordered
	 */
	protected static final String MEMBERSHIP_TO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMembershipTo() <em>Membership To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMembershipTo()
	 * @generated
	 * @ordered
	 */
	protected String membershipTo = MEMBERSHIP_TO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HGQFMembershipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.HGQF_MEMBERSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getGoodChoices() {
		if (goodChoices == null) {
			goodChoices = new EDataTypeUniqueEList<String>(String.class, this,
					GeneratorPackage.HGQF_MEMBERSHIP__GOOD_CHOICES);
		}
		return goodChoices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EGeographyValue getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(EGeographyValue newType) {
		EGeographyValue oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.HGQF_MEMBERSHIP__TYPE, oldType,
					type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMembershipTo() {
		return membershipTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMembershipTo(String newMembershipTo) {
		String oldMembershipTo = membershipTo;
		membershipTo = newMembershipTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.HGQF_MEMBERSHIP__MEMBERSHIP_TO,
					oldMembershipTo, membershipTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GeneratorPackage.HGQF_MEMBERSHIP__GOOD_CHOICES:
			return getGoodChoices();
		case GeneratorPackage.HGQF_MEMBERSHIP__TYPE:
			return getType();
		case GeneratorPackage.HGQF_MEMBERSHIP__MEMBERSHIP_TO:
			return getMembershipTo();
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
		case GeneratorPackage.HGQF_MEMBERSHIP__GOOD_CHOICES:
			getGoodChoices().clear();
			getGoodChoices().addAll((Collection<? extends String>) newValue);
			return;
		case GeneratorPackage.HGQF_MEMBERSHIP__TYPE:
			setType((EGeographyValue) newValue);
			return;
		case GeneratorPackage.HGQF_MEMBERSHIP__MEMBERSHIP_TO:
			setMembershipTo((String) newValue);
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
		case GeneratorPackage.HGQF_MEMBERSHIP__GOOD_CHOICES:
			getGoodChoices().clear();
			return;
		case GeneratorPackage.HGQF_MEMBERSHIP__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case GeneratorPackage.HGQF_MEMBERSHIP__MEMBERSHIP_TO:
			setMembershipTo(MEMBERSHIP_TO_EDEFAULT);
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
		case GeneratorPackage.HGQF_MEMBERSHIP__GOOD_CHOICES:
			return goodChoices != null && !goodChoices.isEmpty();
		case GeneratorPackage.HGQF_MEMBERSHIP__TYPE:
			return type != TYPE_EDEFAULT;
		case GeneratorPackage.HGQF_MEMBERSHIP__MEMBERSHIP_TO:
			return MEMBERSHIP_TO_EDEFAULT == null ? membershipTo != null : !MEMBERSHIP_TO_EDEFAULT.equals(membershipTo);
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
		result.append(" (goodChoices: ");
		result.append(goodChoices);
		result.append(", type: ");
		result.append(type);
		result.append(", membershipTo: ");
		result.append(membershipTo);
		result.append(')');
		return result.toString();
	}

	@Override
	public String getQuestionableFact() {
		return this.getType().getName() + " qui sont des " + this.getMembershipTo();
	}

	@Override
	public String getCompleteFact() {
		String solution = this.getType().getName() + " qui sont des " + this.getMembershipTo() + " : {";
		for (int i = 0; i < this.getGoodChoices().size(); i++) {
			if (i < this.getGoodChoices().size() - 1) {
				solution += this.getGoodChoices().get(i) + ", ";
			} else {
				solution += this.getGoodChoices().get(i) + "}";
			}
		}
		return solution;
	}

} //HGQFMembershipImpl
