/**
 */
package generator.impl;

import generator.GeneratorPackage;
import generator.MTQeFMembership;

import java.util.Collection;
import java.util.Objects;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MT Qe FMembership</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.MTQeFMembershipImpl#getBadPropositions <em>Bad Propositions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MTQeFMembershipImpl extends QuestionedFactImpl implements MTQeFMembership {
	/**
	 * The cached value of the '{@link #getBadPropositions() <em>Bad Propositions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBadPropositions()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> badPropositions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MTQeFMembershipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.MT_QE_FMEMBERSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getBadPropositions() {
		if (badPropositions == null) {
			badPropositions = new EDataTypeUniqueEList<Integer>(Integer.class, this,
					GeneratorPackage.MT_QE_FMEMBERSHIP__BAD_PROPOSITIONS);
		}
		return badPropositions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GeneratorPackage.MT_QE_FMEMBERSHIP__BAD_PROPOSITIONS:
			return getBadPropositions();
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
		case GeneratorPackage.MT_QE_FMEMBERSHIP__BAD_PROPOSITIONS:
			getBadPropositions().clear();
			getBadPropositions().addAll((Collection<? extends Integer>) newValue);
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
		case GeneratorPackage.MT_QE_FMEMBERSHIP__BAD_PROPOSITIONS:
			getBadPropositions().clear();
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
		case GeneratorPackage.MT_QE_FMEMBERSHIP__BAD_PROPOSITIONS:
			return badPropositions != null && !badPropositions.isEmpty();
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
		result.append(" (badPropositions: ");
		result.append(badPropositions);
		result.append(')');
		return result.toString();
	}

	@Override
	public String getQuestionedFactQuestion() {
		String choices = "{";
		for (Integer integer : badPropositions) {
			choices += integer + (badPropositions.get(badPropositions.size() - 1).equals(integer) ? "}" : ",");
		}
		return getQuestionablefact().getQuestionableFact() + " | bad choices = " + choices;
	}

	@Override
	public int hashCode() {
		return Objects.hash(badPropositions);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MTQeFMembershipImpl other = (MTQeFMembershipImpl) obj;
		return Objects.equals(badPropositions, other.badPropositions);
	}

} //MTQeFMembershipImpl
