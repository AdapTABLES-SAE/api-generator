/**
 */
package generator.impl;

import generator.ElementShape;
import generator.GeneratorPackage;
import generator.IRoomElement;
import generator.Location;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Location</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.LocationImpl#getAcceptedElements <em>Accepted Elements</em>}</li>
 *   <li>{@link generator.impl.LocationImpl#getMaxshape <em>Maxshape</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LocationImpl extends MinimalEObjectImpl.Container implements Location {
	/**
	 * The cached value of the '{@link #getAcceptedElements() <em>Accepted Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcceptedElements()
	 * @generated
	 * @ordered
	 */
	protected EList<IRoomElement> acceptedElements;

	/**
	 * The cached value of the '{@link #getMaxshape() <em>Maxshape</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxshape()
	 * @generated
	 * @ordered
	 */
	protected ElementShape maxshape;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.LOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IRoomElement> getAcceptedElements() {
		if (acceptedElements == null) {
			acceptedElements = new EObjectResolvingEList<IRoomElement>(IRoomElement.class, this,
					GeneratorPackage.LOCATION__ACCEPTED_ELEMENTS);
		}
		return acceptedElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementShape getMaxshape() {
		return maxshape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxshape(ElementShape newMaxshape, NotificationChain msgs) {
		ElementShape oldMaxshape = maxshape;
		maxshape = newMaxshape;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.LOCATION__MAXSHAPE, oldMaxshape, newMaxshape);
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
	public void setMaxshape(ElementShape newMaxshape) {
		if (newMaxshape != maxshape) {
			NotificationChain msgs = null;
			if (maxshape != null)
				msgs = ((InternalEObject) maxshape).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.LOCATION__MAXSHAPE, null, msgs);
			if (newMaxshape != null)
				msgs = ((InternalEObject) newMaxshape).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.LOCATION__MAXSHAPE, null, msgs);
			msgs = basicSetMaxshape(newMaxshape, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.LOCATION__MAXSHAPE, newMaxshape,
					newMaxshape));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GeneratorPackage.LOCATION__MAXSHAPE:
			return basicSetMaxshape(null, msgs);
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
		case GeneratorPackage.LOCATION__ACCEPTED_ELEMENTS:
			return getAcceptedElements();
		case GeneratorPackage.LOCATION__MAXSHAPE:
			return getMaxshape();
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
		case GeneratorPackage.LOCATION__ACCEPTED_ELEMENTS:
			getAcceptedElements().clear();
			getAcceptedElements().addAll((Collection<? extends IRoomElement>) newValue);
			return;
		case GeneratorPackage.LOCATION__MAXSHAPE:
			setMaxshape((ElementShape) newValue);
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
		case GeneratorPackage.LOCATION__ACCEPTED_ELEMENTS:
			getAcceptedElements().clear();
			return;
		case GeneratorPackage.LOCATION__MAXSHAPE:
			setMaxshape((ElementShape) null);
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
		case GeneratorPackage.LOCATION__ACCEPTED_ELEMENTS:
			return acceptedElements != null && !acceptedElements.isEmpty();
		case GeneratorPackage.LOCATION__MAXSHAPE:
			return maxshape != null;
		}
		return super.eIsSet(featureID);
	}

} //LocationImpl
