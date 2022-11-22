/**
 */
package generator.impl;

import generator.ElementPosition;
import generator.GeneratorPackage;
import generator.InteractionEType;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Position</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.ElementPositionImpl#getAutorizedETypes <em>Autorized ETypes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElementPositionImpl extends PositionImpl implements ElementPosition {
	/**
	 * The cached value of the '{@link #getAutorizedETypes() <em>Autorized ETypes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutorizedETypes()
	 * @generated
	 * @ordered
	 */
	protected EList<InteractionEType> autorizedETypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementPositionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.ELEMENT_POSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InteractionEType> getAutorizedETypes() {
		if (autorizedETypes == null) {
			autorizedETypes = new EObjectResolvingEList<InteractionEType>(InteractionEType.class, this,
					GeneratorPackage.ELEMENT_POSITION__AUTORIZED_ETYPES);
		}
		return autorizedETypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GeneratorPackage.ELEMENT_POSITION__AUTORIZED_ETYPES:
			return getAutorizedETypes();
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
		case GeneratorPackage.ELEMENT_POSITION__AUTORIZED_ETYPES:
			getAutorizedETypes().clear();
			getAutorizedETypes().addAll((Collection<? extends InteractionEType>) newValue);
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
		case GeneratorPackage.ELEMENT_POSITION__AUTORIZED_ETYPES:
			getAutorizedETypes().clear();
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
		case GeneratorPackage.ELEMENT_POSITION__AUTORIZED_ETYPES:
			return autorizedETypes != null && !autorizedETypes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ElementPositionImpl
