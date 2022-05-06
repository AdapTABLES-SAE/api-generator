/**
 */
package generatorMetamodels.impl;

import generatorMetamodels.ConceptualElement;
import generatorMetamodels.ConcreteElement;
import generatorMetamodels.GeneratorMetamodelsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conceptual Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generatorMetamodels.impl.ConceptualElementImpl#getRepresentations <em>Representations</em>}</li>
 *   <li>{@link generatorMetamodels.impl.ConceptualElementImpl#isAdaptable <em>Adaptable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConceptualElementImpl extends GameElementsImpl implements ConceptualElement {
	/**
	 * The cached value of the '{@link #getRepresentations() <em>Representations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentations()
	 * @generated
	 * @ordered
	 */
	protected EList<ConcreteElement> representations;

	/**
	 * The default value of the '{@link #isAdaptable() <em>Adaptable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAdaptable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ADAPTABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAdaptable() <em>Adaptable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAdaptable()
	 * @generated
	 * @ordered
	 */
	protected boolean adaptable = ADAPTABLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConceptualElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorMetamodelsPackage.Literals.CONCEPTUAL_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConcreteElement> getRepresentations() {
		if (representations == null) {
			representations = new EObjectResolvingEList<ConcreteElement>(ConcreteElement.class, this,
					GeneratorMetamodelsPackage.CONCEPTUAL_ELEMENT__REPRESENTATIONS);
		}
		return representations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAdaptable() {
		return adaptable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdaptable(boolean newAdaptable) {
		boolean oldAdaptable = adaptable;
		adaptable = newAdaptable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GeneratorMetamodelsPackage.CONCEPTUAL_ELEMENT__ADAPTABLE, oldAdaptable, adaptable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GeneratorMetamodelsPackage.CONCEPTUAL_ELEMENT__REPRESENTATIONS:
			return getRepresentations();
		case GeneratorMetamodelsPackage.CONCEPTUAL_ELEMENT__ADAPTABLE:
			return isAdaptable();
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
		case GeneratorMetamodelsPackage.CONCEPTUAL_ELEMENT__REPRESENTATIONS:
			getRepresentations().clear();
			getRepresentations().addAll((Collection<? extends ConcreteElement>) newValue);
			return;
		case GeneratorMetamodelsPackage.CONCEPTUAL_ELEMENT__ADAPTABLE:
			setAdaptable((Boolean) newValue);
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
		case GeneratorMetamodelsPackage.CONCEPTUAL_ELEMENT__REPRESENTATIONS:
			getRepresentations().clear();
			return;
		case GeneratorMetamodelsPackage.CONCEPTUAL_ELEMENT__ADAPTABLE:
			setAdaptable(ADAPTABLE_EDEFAULT);
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
		case GeneratorMetamodelsPackage.CONCEPTUAL_ELEMENT__REPRESENTATIONS:
			return representations != null && !representations.isEmpty();
		case GeneratorMetamodelsPackage.CONCEPTUAL_ELEMENT__ADAPTABLE:
			return adaptable != ADAPTABLE_EDEFAULT;
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
		result.append(" (adaptable: ");
		result.append(adaptable);
		result.append(')');
		return result.toString();
	}

} //ConceptualElementImpl
