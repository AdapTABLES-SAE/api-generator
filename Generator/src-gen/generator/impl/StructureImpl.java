/**
 */
package generator.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import generator.AComponent;
import generator.GeneratorPackage;
import generator.Structure;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.StructureImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link generator.impl.StructureImpl#isPerFactOrPropositions <em>Per Fact Or Propositions</em>}</li>
 *   <li>{@link generator.impl.StructureImpl#isAlternateComponents <em>Alternate Components</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StructureImpl extends AComponentImpl implements Structure {
	/**
	 * The cached value of the '{@link #getComponents() <em>Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<AComponent> components;

	/**
	 * The default value of the '{@link #isPerFactOrPropositions() <em>Per Fact Or Propositions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPerFactOrPropositions()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PER_FACT_OR_PROPOSITIONS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPerFactOrPropositions() <em>Per Fact Or Propositions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPerFactOrPropositions()
	 * @generated
	 * @ordered
	 */
	protected boolean perFactOrPropositions = PER_FACT_OR_PROPOSITIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #isAlternateComponents() <em>Alternate Components</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAlternateComponents()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALTERNATE_COMPONENTS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAlternateComponents() <em>Alternate Components</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAlternateComponents()
	 * @generated
	 * @ordered
	 */
	protected boolean alternateComponents = ALTERNATE_COMPONENTS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.STRUCTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AComponent> getComponents() {
		if (components == null) {
			components = new EObjectContainmentEList<AComponent>(AComponent.class, this,
					GeneratorPackage.STRUCTURE__COMPONENTS);
		}
		return components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPerFactOrPropositions() {
		return perFactOrPropositions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerFactOrPropositions(boolean newPerFactOrPropositions) {
		boolean oldPerFactOrPropositions = perFactOrPropositions;
		perFactOrPropositions = newPerFactOrPropositions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.STRUCTURE__PER_FACT_OR_PROPOSITIONS,
					oldPerFactOrPropositions, perFactOrPropositions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAlternateComponents() {
		return alternateComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlternateComponents(boolean newAlternateComponents) {
		boolean oldAlternateComponents = alternateComponents;
		alternateComponents = newAlternateComponents;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.STRUCTURE__ALTERNATE_COMPONENTS,
					oldAlternateComponents, alternateComponents));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GeneratorPackage.STRUCTURE__COMPONENTS:
			return ((InternalEList<?>) getComponents()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GeneratorPackage.STRUCTURE__COMPONENTS:
			return getComponents();
		case GeneratorPackage.STRUCTURE__PER_FACT_OR_PROPOSITIONS:
			return isPerFactOrPropositions();
		case GeneratorPackage.STRUCTURE__ALTERNATE_COMPONENTS:
			return isAlternateComponents();
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
		case GeneratorPackage.STRUCTURE__COMPONENTS:
			getComponents().clear();
			getComponents().addAll((Collection<? extends AComponent>) newValue);
			return;
		case GeneratorPackage.STRUCTURE__PER_FACT_OR_PROPOSITIONS:
			setPerFactOrPropositions((Boolean) newValue);
			return;
		case GeneratorPackage.STRUCTURE__ALTERNATE_COMPONENTS:
			setAlternateComponents((Boolean) newValue);
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
		case GeneratorPackage.STRUCTURE__COMPONENTS:
			getComponents().clear();
			return;
		case GeneratorPackage.STRUCTURE__PER_FACT_OR_PROPOSITIONS:
			setPerFactOrPropositions(PER_FACT_OR_PROPOSITIONS_EDEFAULT);
			return;
		case GeneratorPackage.STRUCTURE__ALTERNATE_COMPONENTS:
			setAlternateComponents(ALTERNATE_COMPONENTS_EDEFAULT);
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
		case GeneratorPackage.STRUCTURE__COMPONENTS:
			return components != null && !components.isEmpty();
		case GeneratorPackage.STRUCTURE__PER_FACT_OR_PROPOSITIONS:
			return perFactOrPropositions != PER_FACT_OR_PROPOSITIONS_EDEFAULT;
		case GeneratorPackage.STRUCTURE__ALTERNATE_COMPONENTS:
			return alternateComponents != ALTERNATE_COMPONENTS_EDEFAULT;
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
		result.append(" (perFactOrPropositions: ");
		result.append(perFactOrPropositions);
		result.append(", alternateComponents: ");
		result.append(alternateComponents);
		result.append(')');
		return result.toString();
	}

} //StructureImpl
