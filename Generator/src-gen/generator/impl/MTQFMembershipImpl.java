/**
 */
package generator.impl;

import generator.GeneratorPackage;
import generator.MTQFMembership;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

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
 *   <li>{@link generator.impl.MTQFMembershipImpl#getTable <em>Table</em>}</li>
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
	 * The default value of the '{@link #getTable() <em>Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTable()
	 * @generated
	 * @ordered
	 */
	protected static final int TABLE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTable() <em>Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTable()
	 * @generated
	 * @ordered
	 */
	protected int table = TABLE_EDEFAULT;

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
	 * @generated
	 */
	public int getTable() {
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTable(int newTable) {
		int oldTable = table;
		table = newTable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.MTQF_MEMBERSHIP__TABLE, oldTable,
					table));
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
		case GeneratorPackage.MTQF_MEMBERSHIP__TABLE:
			return getTable();
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
		case GeneratorPackage.MTQF_MEMBERSHIP__TABLE:
			setTable((Integer) newValue);
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
		case GeneratorPackage.MTQF_MEMBERSHIP__TABLE:
			setTable(TABLE_EDEFAULT);
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
		case GeneratorPackage.MTQF_MEMBERSHIP__TABLE:
			return table != TABLE_EDEFAULT;
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
		result.append(" (goodResults: ");
		result.append(goodResults);
		result.append(", table: ");
		result.append(table);
		result.append(')');
		return result.toString();
	}

	@Override
	public String getQuestionableFact() {
        String fact = "{";
        for (int i = 0; i < goodResults.size(); i++) {
            if (i == goodResults.size() - 1) {
                fact += goodResults.get(i);
            } else {
                fact += goodResults.get(i) + ",";
            }
        }
        return fact + "} (" + getTable() + ")";
	}

} //MTQFMembershipImpl
