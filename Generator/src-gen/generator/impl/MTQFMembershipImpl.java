/**
 */
package generator.impl;

import java.util.Collection;
import java.util.Objects;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import generator.GeneratorPackage;
import generator.MTQFMembership;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MTQF Membership</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.MTQFMembershipImpl#getGoodChoices <em>Good Choices</em>}</li>
 *   <li>{@link generator.impl.MTQFMembershipImpl#getTable <em>Table</em>}</li>
 *   <li>{@link generator.impl.MTQFMembershipImpl#isResultOfTable <em>Result Of Table</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MTQFMembershipImpl extends QuestionableFactImpl implements MTQFMembership {
	/**
	 * The cached value of the '{@link #getGoodChoices() <em>Good Choices</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoodChoices()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> goodChoices;

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
	 * The default value of the '{@link #isResultOfTable() <em>Result Of Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isResultOfTable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RESULT_OF_TABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isResultOfTable() <em>Result Of Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isResultOfTable()
	 * @generated
	 * @ordered
	 */
	protected boolean resultOfTable = RESULT_OF_TABLE_EDEFAULT;

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
	public EList<Integer> getGoodChoices() {
		if (goodChoices == null) {
			goodChoices = new EDataTypeUniqueEList<Integer>(Integer.class, this,
					GeneratorPackage.MTQF_MEMBERSHIP__GOOD_CHOICES);
		}
		return goodChoices;
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
	public boolean isResultOfTable() {
		return resultOfTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResultOfTable(boolean newResultOfTable) {
		boolean oldResultOfTable = resultOfTable;
		resultOfTable = newResultOfTable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.MTQF_MEMBERSHIP__RESULT_OF_TABLE,
					oldResultOfTable, resultOfTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GeneratorPackage.MTQF_MEMBERSHIP__GOOD_CHOICES:
			return getGoodChoices();
		case GeneratorPackage.MTQF_MEMBERSHIP__TABLE:
			return getTable();
		case GeneratorPackage.MTQF_MEMBERSHIP__RESULT_OF_TABLE:
			return isResultOfTable();
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
		case GeneratorPackage.MTQF_MEMBERSHIP__GOOD_CHOICES:
			getGoodChoices().clear();
			getGoodChoices().addAll((Collection<? extends Integer>) newValue);
			return;
		case GeneratorPackage.MTQF_MEMBERSHIP__TABLE:
			setTable((Integer) newValue);
			return;
		case GeneratorPackage.MTQF_MEMBERSHIP__RESULT_OF_TABLE:
			setResultOfTable((Boolean) newValue);
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
		case GeneratorPackage.MTQF_MEMBERSHIP__GOOD_CHOICES:
			getGoodChoices().clear();
			return;
		case GeneratorPackage.MTQF_MEMBERSHIP__TABLE:
			setTable(TABLE_EDEFAULT);
			return;
		case GeneratorPackage.MTQF_MEMBERSHIP__RESULT_OF_TABLE:
			setResultOfTable(RESULT_OF_TABLE_EDEFAULT);
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
		case GeneratorPackage.MTQF_MEMBERSHIP__GOOD_CHOICES:
			return goodChoices != null && !goodChoices.isEmpty();
		case GeneratorPackage.MTQF_MEMBERSHIP__TABLE:
			return table != TABLE_EDEFAULT;
		case GeneratorPackage.MTQF_MEMBERSHIP__RESULT_OF_TABLE:
			return resultOfTable != RESULT_OF_TABLE_EDEFAULT;
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
		result.append(", table: ");
		result.append(table);
		result.append(", resultOfTable: ");
		result.append(resultOfTable);
		result.append(')');
		return result.toString();
	}

	@Override
	public String getQuestionableFact() {
		String debut = !isResultOfTable() ? "Pas resultats" : "Resultats";
		return debut + " table de " + getTable();
	}

	@Override
	public int hashCode() {
		return Objects.hash(goodChoices, table);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MTQFMembershipImpl other = (MTQFMembershipImpl) obj;
		return Objects.equals(goodChoices, other.goodChoices) && table == other.table;
	}

	@Override
	public String getCompleteFact() {
		String completeFact = getQuestionableFact() + " : {";
		for (int i = 0; i < getGoodChoices().size(); i++) {
			completeFact += getGoodChoices().get(i);
			if (i < getGoodChoices().size() - 1) {
				completeFact += ", ";
			}
		}
		return completeFact + "}";
	}

} //MTQFMembershipImpl
