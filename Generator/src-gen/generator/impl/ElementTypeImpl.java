/**
 */
package generator.impl;

import generator.AvatarActions;
import generator.ElementShape;
import generator.ElementState;
import generator.ElementType;
import generator.GeneratorPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.ElementTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link generator.impl.ElementTypeImpl#getAcceptedActions <em>Accepted Actions</em>}</li>
 *   <li>{@link generator.impl.ElementTypeImpl#getShape <em>Shape</em>}</li>
 *   <li>{@link generator.impl.ElementTypeImpl#getState <em>State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElementTypeImpl extends MinimalEObjectImpl.Container implements ElementType {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAcceptedActions() <em>Accepted Actions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcceptedActions()
	 * @generated
	 * @ordered
	 */
	protected EList<AvatarActions> acceptedActions;

	/**
	 * The cached value of the '{@link #getShape() <em>Shape</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShape()
	 * @generated
	 * @ordered
	 */
	protected ElementShape shape;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementState> state;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.ELEMENT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.ELEMENT_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AvatarActions> getAcceptedActions() {
		if (acceptedActions == null) {
			acceptedActions = new EDataTypeUniqueEList<AvatarActions>(AvatarActions.class, this,
					GeneratorPackage.ELEMENT_TYPE__ACCEPTED_ACTIONS);
		}
		return acceptedActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementShape getShape() {
		return shape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetShape(ElementShape newShape, NotificationChain msgs) {
		ElementShape oldShape = shape;
		shape = newShape;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.ELEMENT_TYPE__SHAPE, oldShape, newShape);
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
	public void setShape(ElementShape newShape) {
		if (newShape != shape) {
			NotificationChain msgs = null;
			if (shape != null)
				msgs = ((InternalEObject) shape).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.ELEMENT_TYPE__SHAPE, null, msgs);
			if (newShape != null)
				msgs = ((InternalEObject) newShape).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.ELEMENT_TYPE__SHAPE, null, msgs);
			msgs = basicSetShape(newShape, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.ELEMENT_TYPE__SHAPE, newShape,
					newShape));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElementState> getState() {
		if (state == null) {
			state = new EObjectContainmentEList<ElementState>(ElementState.class, this,
					GeneratorPackage.ELEMENT_TYPE__STATE);
		}
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GeneratorPackage.ELEMENT_TYPE__SHAPE:
			return basicSetShape(null, msgs);
		case GeneratorPackage.ELEMENT_TYPE__STATE:
			return ((InternalEList<?>) getState()).basicRemove(otherEnd, msgs);
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
		case GeneratorPackage.ELEMENT_TYPE__NAME:
			return getName();
		case GeneratorPackage.ELEMENT_TYPE__ACCEPTED_ACTIONS:
			return getAcceptedActions();
		case GeneratorPackage.ELEMENT_TYPE__SHAPE:
			return getShape();
		case GeneratorPackage.ELEMENT_TYPE__STATE:
			return getState();
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
		case GeneratorPackage.ELEMENT_TYPE__NAME:
			setName((String) newValue);
			return;
		case GeneratorPackage.ELEMENT_TYPE__ACCEPTED_ACTIONS:
			getAcceptedActions().clear();
			getAcceptedActions().addAll((Collection<? extends AvatarActions>) newValue);
			return;
		case GeneratorPackage.ELEMENT_TYPE__SHAPE:
			setShape((ElementShape) newValue);
			return;
		case GeneratorPackage.ELEMENT_TYPE__STATE:
			getState().clear();
			getState().addAll((Collection<? extends ElementState>) newValue);
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
		case GeneratorPackage.ELEMENT_TYPE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case GeneratorPackage.ELEMENT_TYPE__ACCEPTED_ACTIONS:
			getAcceptedActions().clear();
			return;
		case GeneratorPackage.ELEMENT_TYPE__SHAPE:
			setShape((ElementShape) null);
			return;
		case GeneratorPackage.ELEMENT_TYPE__STATE:
			getState().clear();
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
		case GeneratorPackage.ELEMENT_TYPE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case GeneratorPackage.ELEMENT_TYPE__ACCEPTED_ACTIONS:
			return acceptedActions != null && !acceptedActions.isEmpty();
		case GeneratorPackage.ELEMENT_TYPE__SHAPE:
			return shape != null;
		case GeneratorPackage.ELEMENT_TYPE__STATE:
			return state != null && !state.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", acceptedActions: ");
		result.append(acceptedActions);
		result.append(')');
		return result.toString();
	}

} //ElementTypeImpl
