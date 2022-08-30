/**
 */
package generator.impl;

import generator.CompletionType;
import generator.GeneratorPackage;
import generator.Order;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Completion Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.CompletionTypeImpl#getNbMissingElements <em>Nb Missing Elements</em>}</li>
 *   <li>{@link generator.impl.CompletionTypeImpl#getFactOrder <em>Fact Order</em>}</li>
 *   <li>{@link generator.impl.CompletionTypeImpl#isNaturalLanguage <em>Natural Language</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompletionTypeImpl extends TaskTypeImpl implements CompletionType {
	/**
	 * The default value of the '{@link #getNbMissingElements() <em>Nb Missing Elements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbMissingElements()
	 * @generated
	 * @ordered
	 */
	protected static final int NB_MISSING_ELEMENTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNbMissingElements() <em>Nb Missing Elements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbMissingElements()
	 * @generated
	 * @ordered
	 */
	protected int nbMissingElements = NB_MISSING_ELEMENTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getFactOrder() <em>Fact Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactOrder()
	 * @generated
	 * @ordered
	 */
	protected static final Order FACT_ORDER_EDEFAULT = Order.MIX;

	/**
	 * The cached value of the '{@link #getFactOrder() <em>Fact Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactOrder()
	 * @generated
	 * @ordered
	 */
	protected Order factOrder = FACT_ORDER_EDEFAULT;

	/**
	 * The default value of the '{@link #isNaturalLanguage() <em>Natural Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNaturalLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NATURAL_LANGUAGE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNaturalLanguage() <em>Natural Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNaturalLanguage()
	 * @generated
	 * @ordered
	 */
	protected boolean naturalLanguage = NATURAL_LANGUAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompletionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.COMPLETION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNbMissingElements() {
		return nbMissingElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbMissingElements(int newNbMissingElements) {
		int oldNbMissingElements = nbMissingElements;
		nbMissingElements = newNbMissingElements;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.COMPLETION_TYPE__NB_MISSING_ELEMENTS,
					oldNbMissingElements, nbMissingElements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Order getFactOrder() {
		return factOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFactOrder(Order newFactOrder) {
		Order oldFactOrder = factOrder;
		factOrder = newFactOrder == null ? FACT_ORDER_EDEFAULT : newFactOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.COMPLETION_TYPE__FACT_ORDER,
					oldFactOrder, factOrder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNaturalLanguage() {
		return naturalLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNaturalLanguage(boolean newNaturalLanguage) {
		boolean oldNaturalLanguage = naturalLanguage;
		naturalLanguage = newNaturalLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.COMPLETION_TYPE__NATURAL_LANGUAGE,
					oldNaturalLanguage, naturalLanguage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GeneratorPackage.COMPLETION_TYPE__NB_MISSING_ELEMENTS:
			return getNbMissingElements();
		case GeneratorPackage.COMPLETION_TYPE__FACT_ORDER:
			return getFactOrder();
		case GeneratorPackage.COMPLETION_TYPE__NATURAL_LANGUAGE:
			return isNaturalLanguage();
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
		case GeneratorPackage.COMPLETION_TYPE__NB_MISSING_ELEMENTS:
			setNbMissingElements((Integer) newValue);
			return;
		case GeneratorPackage.COMPLETION_TYPE__FACT_ORDER:
			setFactOrder((Order) newValue);
			return;
		case GeneratorPackage.COMPLETION_TYPE__NATURAL_LANGUAGE:
			setNaturalLanguage((Boolean) newValue);
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
		case GeneratorPackage.COMPLETION_TYPE__NB_MISSING_ELEMENTS:
			setNbMissingElements(NB_MISSING_ELEMENTS_EDEFAULT);
			return;
		case GeneratorPackage.COMPLETION_TYPE__FACT_ORDER:
			setFactOrder(FACT_ORDER_EDEFAULT);
			return;
		case GeneratorPackage.COMPLETION_TYPE__NATURAL_LANGUAGE:
			setNaturalLanguage(NATURAL_LANGUAGE_EDEFAULT);
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
		case GeneratorPackage.COMPLETION_TYPE__NB_MISSING_ELEMENTS:
			return nbMissingElements != NB_MISSING_ELEMENTS_EDEFAULT;
		case GeneratorPackage.COMPLETION_TYPE__FACT_ORDER:
			return factOrder != FACT_ORDER_EDEFAULT;
		case GeneratorPackage.COMPLETION_TYPE__NATURAL_LANGUAGE:
			return naturalLanguage != NATURAL_LANGUAGE_EDEFAULT;
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
		result.append(" (nbMissingElements: ");
		result.append(nbMissingElements);
		result.append(", factOrder: ");
		result.append(factOrder);
		result.append(", naturalLanguage: ");
		result.append(naturalLanguage);
		result.append(')');
		return result.toString();
	}

} //CompletionTypeImpl
