/**
 */
package generator.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import generator.GeneratorPackage;
import generator.StatementElementType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Statement Element Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.StatementElementTypeImpl#isForStructure <em>For Structure</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StatementElementTypeImpl extends ElementTypeImpl implements StatementElementType {
	/**
	 * The default value of the '{@link #isForStructure() <em>For Structure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isForStructure()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FOR_STRUCTURE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isForStructure() <em>For Structure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isForStructure()
	 * @generated
	 * @ordered
	 */
	protected boolean forStructure = FOR_STRUCTURE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatementElementTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.STATEMENT_ELEMENT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isForStructure() {
		return forStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForStructure(boolean newForStructure) {
		boolean oldForStructure = forStructure;
		forStructure = newForStructure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.STATEMENT_ELEMENT_TYPE__FOR_STRUCTURE, oldForStructure, forStructure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GeneratorPackage.STATEMENT_ELEMENT_TYPE__FOR_STRUCTURE:
			return isForStructure();
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
		case GeneratorPackage.STATEMENT_ELEMENT_TYPE__FOR_STRUCTURE:
			setForStructure((Boolean) newValue);
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
		case GeneratorPackage.STATEMENT_ELEMENT_TYPE__FOR_STRUCTURE:
			setForStructure(FOR_STRUCTURE_EDEFAULT);
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
		case GeneratorPackage.STATEMENT_ELEMENT_TYPE__FOR_STRUCTURE:
			return forStructure != FOR_STRUCTURE_EDEFAULT;
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
		result.append(" (forStructure: ");
		result.append(forStructure);
		result.append(')');
		return result.toString();
	}

} //StatementElementTypeImpl
