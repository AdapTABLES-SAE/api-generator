/**
 */
package generator.impl;

import generator.GeneratorPackage;
import generator.ResultValidityDetermination;
import generator.SubObjectiveType;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Result Validity Determination</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.ResultValidityDeterminationImpl#getNewAttribute <em>New Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ResultValidityDeterminationImpl extends SubObjectiveImpl implements ResultValidityDetermination {
	/**
	 * The default value of the '{@link #getNewAttribute() <em>New Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewAttribute()
	 * @generated
	 * @ordered
	 */
	protected static final SubObjectiveType NEW_ATTRIBUTE_EDEFAULT = SubObjectiveType.RES_VALIDITY;

	/**
	 * The cached value of the '{@link #getNewAttribute() <em>New Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewAttribute()
	 * @generated
	 * @ordered
	 */
	protected SubObjectiveType newAttribute = NEW_ATTRIBUTE_EDEFAULT;

	/**
	 * This is true if the New Attribute attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean newAttributeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultValidityDeterminationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.RESULT_VALIDITY_DETERMINATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubObjectiveType getNewAttribute() {
		return newAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNewAttribute() {
		return newAttributeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GeneratorPackage.RESULT_VALIDITY_DETERMINATION__NEW_ATTRIBUTE:
			return getNewAttribute();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case GeneratorPackage.RESULT_VALIDITY_DETERMINATION__NEW_ATTRIBUTE:
			return isSetNewAttribute();
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
		result.append(" (newAttribute: ");
		if (newAttributeESet)
			result.append(newAttribute);
		else
			result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ResultValidityDeterminationImpl
