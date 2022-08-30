/**
 */
package generator.impl;

import generator.GeneratorPackage;
import generator.ReconstructionType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reconstruction Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.ReconstructionTypeImpl#getNbFalseProposition <em>Nb False Proposition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReconstructionTypeImpl extends TaskTypeImpl implements ReconstructionType {
	/**
	 * The default value of the '{@link #getNbFalseProposition() <em>Nb False Proposition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbFalseProposition()
	 * @generated
	 * @ordered
	 */
	protected static final int NB_FALSE_PROPOSITION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNbFalseProposition() <em>Nb False Proposition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbFalseProposition()
	 * @generated
	 * @ordered
	 */
	protected int nbFalseProposition = NB_FALSE_PROPOSITION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReconstructionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.RECONSTRUCTION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNbFalseProposition() {
		return nbFalseProposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbFalseProposition(int newNbFalseProposition) {
		int oldNbFalseProposition = nbFalseProposition;
		nbFalseProposition = newNbFalseProposition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.RECONSTRUCTION_TYPE__NB_FALSE_PROPOSITION, oldNbFalseProposition,
					nbFalseProposition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GeneratorPackage.RECONSTRUCTION_TYPE__NB_FALSE_PROPOSITION:
			return getNbFalseProposition();
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
		case GeneratorPackage.RECONSTRUCTION_TYPE__NB_FALSE_PROPOSITION:
			setNbFalseProposition((Integer) newValue);
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
		case GeneratorPackage.RECONSTRUCTION_TYPE__NB_FALSE_PROPOSITION:
			setNbFalseProposition(NB_FALSE_PROPOSITION_EDEFAULT);
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
		case GeneratorPackage.RECONSTRUCTION_TYPE__NB_FALSE_PROPOSITION:
			return nbFalseProposition != NB_FALSE_PROPOSITION_EDEFAULT;
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
		result.append(" (nbFalseProposition: ");
		result.append(nbFalseProposition);
		result.append(')');
		return result.toString();
	}

} //ReconstructionTypeImpl
