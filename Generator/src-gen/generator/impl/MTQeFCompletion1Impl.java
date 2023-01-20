/**
 */
package generator.impl;

import generator.GeneratorPackage;
import generator.MTQeFCompletion1;

import java.util.Collection;
import java.util.Objects;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MT Qe FCompletion1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.MTQeFCompletion1Impl#getPropositions <em>Propositions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MTQeFCompletion1Impl extends QuestionedFactImpl implements MTQeFCompletion1 {
	/**
	 * The cached value of the '{@link #getPropositions() <em>Propositions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropositions()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> propositions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MTQeFCompletion1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.MT_QE_FCOMPLETION1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getPropositions() {
		if (propositions == null) {
			propositions = new EDataTypeEList<Integer>(Integer.class, this,
					GeneratorPackage.MT_QE_FCOMPLETION1__PROPOSITIONS);
		}
		return propositions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GeneratorPackage.MT_QE_FCOMPLETION1__PROPOSITIONS:
			return getPropositions();
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
		case GeneratorPackage.MT_QE_FCOMPLETION1__PROPOSITIONS:
			getPropositions().clear();
			getPropositions().addAll((Collection<? extends Integer>) newValue);
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
		case GeneratorPackage.MT_QE_FCOMPLETION1__PROPOSITIONS:
			getPropositions().clear();
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
		case GeneratorPackage.MT_QE_FCOMPLETION1__PROPOSITIONS:
			return propositions != null && !propositions.isEmpty();
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
		result.append(" (propositions: ");
		result.append(propositions);
		result.append(')');
		return result.toString();
	}

	@Override
	public String getQuestionedFactQuestion() {
		if (propositions != null) {
			String choices = " | choices = {";
			for (Integer integer : propositions) {
				choices += integer + (propositions.get(propositions.size() - 1).equals(integer) ? "}" : ",");
			}
			return getQuestionablefact().getQuestionableFact() + choices;
		} else {
			return getQuestionablefact().getQuestionableFact() + " | enter response";
		}

	}

	@Override
	public int hashCode() {
		return Objects.hash(propositions);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MTQeFCompletion1Impl other = (MTQeFCompletion1Impl) obj;
		return Objects.equals(propositions, other.propositions);
	}

} //MTQeFCompletion1Impl
