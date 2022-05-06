/**
 */
package generatorMetamodels.impl;

import generatorMetamodels.ConcreteElement;
import generatorMetamodels.GeneratorMetamodelsPackage;
import generatorMetamodels.Room;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generatorMetamodels.impl.RoomImpl#getConcreteelements <em>Concreteelements</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class RoomImpl extends MinimalEObjectImpl.Container implements Room {
	/**
	 * The cached value of the '{@link #getConcreteelements() <em>Concreteelements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcreteelements()
	 * @generated
	 * @ordered
	 */
	protected EList<ConcreteElement> concreteelements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorMetamodelsPackage.Literals.ROOM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConcreteElement> getConcreteelements() {
		if (concreteelements == null) {
			concreteelements = new EObjectResolvingEList<ConcreteElement>(ConcreteElement.class, this,
					GeneratorMetamodelsPackage.ROOM__CONCRETEELEMENTS);
		}
		return concreteelements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GeneratorMetamodelsPackage.ROOM__CONCRETEELEMENTS:
			return getConcreteelements();
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
		case GeneratorMetamodelsPackage.ROOM__CONCRETEELEMENTS:
			getConcreteelements().clear();
			getConcreteelements().addAll((Collection<? extends ConcreteElement>) newValue);
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
		case GeneratorMetamodelsPackage.ROOM__CONCRETEELEMENTS:
			getConcreteelements().clear();
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
		case GeneratorMetamodelsPackage.ROOM__CONCRETEELEMENTS:
			return concreteelements != null && !concreteelements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RoomImpl
