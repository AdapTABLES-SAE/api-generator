/**
 */
package generator.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import generator.GeneratorPackage;
import generator.Quantity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quantity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.QuantityImpl#isFactNbAnswers <em>Fact Nb Answers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuantityImpl extends ParameterImpl implements Quantity {
	/**
	 * The default value of the '{@link #isFactNbAnswers() <em>Fact Nb Answers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFactNbAnswers()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FACT_NB_ANSWERS_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isFactNbAnswers() <em>Fact Nb Answers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFactNbAnswers()
	 * @generated
	 * @ordered
	 */
	protected boolean factNbAnswers = FACT_NB_ANSWERS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuantityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.QUANTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFactNbAnswers() {
		return factNbAnswers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFactNbAnswers(boolean newFactNbAnswers) {
		boolean oldFactNbAnswers = factNbAnswers;
		factNbAnswers = newFactNbAnswers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.QUANTITY__FACT_NB_ANSWERS,
					oldFactNbAnswers, factNbAnswers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GeneratorPackage.QUANTITY__FACT_NB_ANSWERS:
			return isFactNbAnswers();
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
		case GeneratorPackage.QUANTITY__FACT_NB_ANSWERS:
			setFactNbAnswers((Boolean) newValue);
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
		case GeneratorPackage.QUANTITY__FACT_NB_ANSWERS:
			setFactNbAnswers(FACT_NB_ANSWERS_EDEFAULT);
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
		case GeneratorPackage.QUANTITY__FACT_NB_ANSWERS:
			return factNbAnswers != FACT_NB_ANSWERS_EDEFAULT;
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
		result.append(" (factNbAnswers: ");
		result.append(factNbAnswers);
		result.append(')');
		return result.toString();
	}

} //QuantityImpl
