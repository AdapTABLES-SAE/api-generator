/**
 */
package generator.impl;

import generator.GeneratorPackage;
import generator.MTQFMembership;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MTQF Membership</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.MTQFMembershipImpl#getGoodResults <em>Good Results</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MTQFMembershipImpl extends QuestionableFactImpl implements MTQFMembership {
	/**
	 * The cached value of the '{@link #getGoodResults() <em>Good Results</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoodResults()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> goodResults;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MTQFMembershipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.MTQF_MEMBERSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getGoodResults() {
		if (goodResults == null) {
			goodResults = new EDataTypeUniqueEList<Integer>(Integer.class, this,
					GeneratorPackage.MTQF_MEMBERSHIP__GOOD_RESULTS);
		}
		return goodResults;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getQuestionableFact() {
		String fact = "{"; 
		for (int i = 0; i < goodResults.size(); i++) {
			if(i == goodResults.size() - 1) {
				fact += goodResults.get(i);
			}else {
				fact += goodResults.get(i) + ",";	
			}
		}
		return fact + "}";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GeneratorPackage.MTQF_MEMBERSHIP__GOOD_RESULTS:
			return getGoodResults();
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
		case GeneratorPackage.MTQF_MEMBERSHIP__GOOD_RESULTS:
			getGoodResults().clear();
			getGoodResults().addAll((Collection<? extends Integer>) newValue);
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
		case GeneratorPackage.MTQF_MEMBERSHIP__GOOD_RESULTS:
			getGoodResults().clear();
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
		case GeneratorPackage.MTQF_MEMBERSHIP__GOOD_RESULTS:
			return goodResults != null && !goodResults.isEmpty();
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
		case GeneratorPackage.MTQF_MEMBERSHIP___GET_QUESTIONABLE_FACT:
			return getQuestionableFact();
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
		result.append(" (goodResults: ");
		result.append(goodResults);
		result.append(')');
		return result.toString();
	}

} //MTQFMembershipImpl
