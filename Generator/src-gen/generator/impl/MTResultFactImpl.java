/**
 */
package generator.impl;

import generator.GeneratorPackage;
import generator.MTResultFact;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MT Result Fact</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.MTResultFactImpl#getTable <em>Table</em>}</li>
 *   <li>{@link generator.impl.MTResultFactImpl#getRes <em>Res</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MTResultFactImpl extends AbstractFactImpl implements MTResultFact {
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
	 * The default value of the '{@link #getRes() <em>Res</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRes()
	 * @generated
	 * @ordered
	 */
	protected static final int RES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRes() <em>Res</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRes()
	 * @generated
	 * @ordered
	 */
	protected int res = RES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MTResultFactImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.MT_RESULT_FACT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.MT_RESULT_FACT__TABLE, oldTable,
					table));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRes() {
		return res;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRes(int newRes) {
		int oldRes = res;
		res = newRes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.MT_RESULT_FACT__RES, oldRes, res));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GeneratorPackage.MT_RESULT_FACT__TABLE:
			return getTable();
		case GeneratorPackage.MT_RESULT_FACT__RES:
			return getRes();
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
		case GeneratorPackage.MT_RESULT_FACT__TABLE:
			setTable((Integer) newValue);
			return;
		case GeneratorPackage.MT_RESULT_FACT__RES:
			setRes((Integer) newValue);
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
		case GeneratorPackage.MT_RESULT_FACT__TABLE:
			setTable(TABLE_EDEFAULT);
			return;
		case GeneratorPackage.MT_RESULT_FACT__RES:
			setRes(RES_EDEFAULT);
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
		case GeneratorPackage.MT_RESULT_FACT__TABLE:
			return table != TABLE_EDEFAULT;
		case GeneratorPackage.MT_RESULT_FACT__RES:
			return res != RES_EDEFAULT;
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
		result.append(" (table: ");
		result.append(table);
		result.append(", res: ");
		result.append(res);
		result.append(')');
		return result.toString();
	}

} //MTResultFactImpl
