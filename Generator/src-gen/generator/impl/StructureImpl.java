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
 *   <li>{@link generator.impl.StructureImpl#isAlternateComponents <em>Alternate Components</em>}</li>
 *   <li>{@link generator.impl.StructureImpl#isForFact <em>For Fact</em>}</li>
 *   <li>{@link generator.impl.StructureImpl#isForVisualization <em>For Visualization</em>}</li>
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
	 * The default value of the '{@link #isForFact() <em>For Fact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isForFact()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FOR_FACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isForFact() <em>For Fact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isForFact()
	 * @generated
	 * @ordered
	 */
	protected boolean forFact = FOR_FACT_EDEFAULT;

	/**
	 * The default value of the '{@link #isForVisualization() <em>For Visualization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isForVisualization()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FOR_VISUALIZATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isForVisualization() <em>For Visualization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isForVisualization()
	 * @generated
	 * @ordered
	 */
	protected boolean forVisualization = FOR_VISUALIZATION_EDEFAULT;

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
	public boolean isForFact() {
		return forFact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForFact(boolean newForFact) {
		boolean oldForFact = forFact;
		forFact = newForFact;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.STRUCTURE__FOR_FACT, oldForFact,
					forFact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isForVisualization() {
		return forVisualization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForVisualization(boolean newForVisualization) {
		boolean oldForVisualization = forVisualization;
		forVisualization = newForVisualization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.STRUCTURE__FOR_VISUALIZATION,
					oldForVisualization, forVisualization));
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
		case GeneratorPackage.STRUCTURE__ALTERNATE_COMPONENTS:
			return isAlternateComponents();
		case GeneratorPackage.STRUCTURE__FOR_FACT:
			return isForFact();
		case GeneratorPackage.STRUCTURE__FOR_VISUALIZATION:
			return isForVisualization();
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
		case GeneratorPackage.STRUCTURE__ALTERNATE_COMPONENTS:
			setAlternateComponents((Boolean) newValue);
			return;
		case GeneratorPackage.STRUCTURE__FOR_FACT:
			setForFact((Boolean) newValue);
			return;
		case GeneratorPackage.STRUCTURE__FOR_VISUALIZATION:
			setForVisualization((Boolean) newValue);
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
		case GeneratorPackage.STRUCTURE__ALTERNATE_COMPONENTS:
			setAlternateComponents(ALTERNATE_COMPONENTS_EDEFAULT);
			return;
		case GeneratorPackage.STRUCTURE__FOR_FACT:
			setForFact(FOR_FACT_EDEFAULT);
			return;
		case GeneratorPackage.STRUCTURE__FOR_VISUALIZATION:
			setForVisualization(FOR_VISUALIZATION_EDEFAULT);
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
		case GeneratorPackage.STRUCTURE__ALTERNATE_COMPONENTS:
			return alternateComponents != ALTERNATE_COMPONENTS_EDEFAULT;
		case GeneratorPackage.STRUCTURE__FOR_FACT:
			return forFact != FOR_FACT_EDEFAULT;
		case GeneratorPackage.STRUCTURE__FOR_VISUALIZATION:
			return forVisualization != FOR_VISUALIZATION_EDEFAULT;
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
		result.append(" (alternateComponents: ");
		result.append(alternateComponents);
		result.append(", forFact: ");
		result.append(forFact);
		result.append(", forVisualization: ");
		result.append(forVisualization);
		result.append(')');
		return result.toString();
	}

} //StructureImpl
