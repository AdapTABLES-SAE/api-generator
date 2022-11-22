/**
 */
package generator.impl;

import generator.Ability;
import generator.GeneratorPackage;
import generator.InteractionEType;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interaction EType</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.InteractionETypeImpl#getAbilities <em>Abilities</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InteractionETypeImpl extends ElementTypeImpl implements InteractionEType {
	/**
	 * The cached value of the '{@link #getAbilities() <em>Abilities</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbilities()
	 * @generated
	 * @ordered
	 */
	protected EList<Ability> abilities;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionETypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.INTERACTION_ETYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Ability> getAbilities() {
		if (abilities == null) {
			abilities = new EObjectResolvingEList<Ability>(Ability.class, this,
					GeneratorPackage.INTERACTION_ETYPE__ABILITIES);
		}
		return abilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GeneratorPackage.INTERACTION_ETYPE__ABILITIES:
			return getAbilities();
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
		case GeneratorPackage.INTERACTION_ETYPE__ABILITIES:
			getAbilities().clear();
			getAbilities().addAll((Collection<? extends Ability>) newValue);
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
		case GeneratorPackage.INTERACTION_ETYPE__ABILITIES:
			getAbilities().clear();
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
		case GeneratorPackage.INTERACTION_ETYPE__ABILITIES:
			return abilities != null && !abilities.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InteractionETypeImpl
