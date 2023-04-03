/**
 */
package generator.impl;

import generator.APosition;
import generator.GeneratorPackage;
import generator.PositionedStructureElement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Positioned Structure Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.PositionedStructureElementImpl#getCreatedPosition <em>Created Position</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PositionedStructureElementImpl extends PositionedElementImpl implements PositionedStructureElement {
	/**
	 * The cached value of the '{@link #getCreatedPosition() <em>Created Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedPosition()
	 * @generated
	 * @ordered
	 */
	protected APosition createdPosition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositionedStructureElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.POSITIONED_STRUCTURE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APosition getCreatedPosition() {
		return createdPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCreatedPosition(APosition newCreatedPosition, NotificationChain msgs) {
		APosition oldCreatedPosition = createdPosition;
		createdPosition = newCreatedPosition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.POSITIONED_STRUCTURE_ELEMENT__CREATED_POSITION, oldCreatedPosition,
					newCreatedPosition);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreatedPosition(APosition newCreatedPosition) {
		if (newCreatedPosition != createdPosition) {
			NotificationChain msgs = null;
			if (createdPosition != null)
				msgs = ((InternalEObject) createdPosition).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.POSITIONED_STRUCTURE_ELEMENT__CREATED_POSITION, null,
						msgs);
			if (newCreatedPosition != null)
				msgs = ((InternalEObject) newCreatedPosition).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.POSITIONED_STRUCTURE_ELEMENT__CREATED_POSITION, null,
						msgs);
			msgs = basicSetCreatedPosition(newCreatedPosition, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.POSITIONED_STRUCTURE_ELEMENT__CREATED_POSITION, newCreatedPosition,
					newCreatedPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GeneratorPackage.POSITIONED_STRUCTURE_ELEMENT__CREATED_POSITION:
			return basicSetCreatedPosition(null, msgs);
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
		case GeneratorPackage.POSITIONED_STRUCTURE_ELEMENT__CREATED_POSITION:
			return getCreatedPosition();
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
		case GeneratorPackage.POSITIONED_STRUCTURE_ELEMENT__CREATED_POSITION:
			setCreatedPosition((APosition) newValue);
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
		case GeneratorPackage.POSITIONED_STRUCTURE_ELEMENT__CREATED_POSITION:
			setCreatedPosition((APosition) null);
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
		case GeneratorPackage.POSITIONED_STRUCTURE_ELEMENT__CREATED_POSITION:
			return createdPosition != null;
		}
		return super.eIsSet(featureID);
	}

} //PositionedStructureElementImpl
