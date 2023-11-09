/**
 */
package generator.impl;

import generator.GeneratorPackage;
import generator.VisualizationPosition;
import generator.VisualizationSolution;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Visualization Solution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.VisualizationSolutionImpl#getValue <em>Value</em>}</li>
 *   <li>{@link generator.impl.VisualizationSolutionImpl#getVisualizationPosition <em>Visualization Position</em>}</li>
 *   <li>{@link generator.impl.VisualizationSolutionImpl#isImage <em>Image</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VisualizationSolutionImpl extends MinimalEObjectImpl.Container implements VisualizationSolution {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVisualizationPosition() <em>Visualization Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisualizationPosition()
	 * @generated
	 * @ordered
	 */
	protected VisualizationPosition visualizationPosition;

	/**
	 * The default value of the '{@link #isImage() <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isImage()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IMAGE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isImage() <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isImage()
	 * @generated
	 * @ordered
	 */
	protected boolean image = IMAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisualizationSolutionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.VISUALIZATION_SOLUTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.VISUALIZATION_SOLUTION__VALUE,
					oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisualizationPosition getVisualizationPosition() {
		if (visualizationPosition != null && visualizationPosition.eIsProxy()) {
			InternalEObject oldVisualizationPosition = (InternalEObject) visualizationPosition;
			visualizationPosition = (VisualizationPosition) eResolveProxy(oldVisualizationPosition);
			if (visualizationPosition != oldVisualizationPosition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							GeneratorPackage.VISUALIZATION_SOLUTION__VISUALIZATION_POSITION, oldVisualizationPosition,
							visualizationPosition));
			}
		}
		return visualizationPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisualizationPosition basicGetVisualizationPosition() {
		return visualizationPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisualizationPosition(VisualizationPosition newVisualizationPosition) {
		VisualizationPosition oldVisualizationPosition = visualizationPosition;
		visualizationPosition = newVisualizationPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.VISUALIZATION_SOLUTION__VISUALIZATION_POSITION, oldVisualizationPosition,
					visualizationPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isImage() {
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImage(boolean newImage) {
		boolean oldImage = image;
		image = newImage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.VISUALIZATION_SOLUTION__IMAGE,
					oldImage, image));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GeneratorPackage.VISUALIZATION_SOLUTION__VALUE:
			return getValue();
		case GeneratorPackage.VISUALIZATION_SOLUTION__VISUALIZATION_POSITION:
			if (resolve)
				return getVisualizationPosition();
			return basicGetVisualizationPosition();
		case GeneratorPackage.VISUALIZATION_SOLUTION__IMAGE:
			return isImage();
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
		case GeneratorPackage.VISUALIZATION_SOLUTION__VALUE:
			setValue((String) newValue);
			return;
		case GeneratorPackage.VISUALIZATION_SOLUTION__VISUALIZATION_POSITION:
			setVisualizationPosition((VisualizationPosition) newValue);
			return;
		case GeneratorPackage.VISUALIZATION_SOLUTION__IMAGE:
			setImage((Boolean) newValue);
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
		case GeneratorPackage.VISUALIZATION_SOLUTION__VALUE:
			setValue(VALUE_EDEFAULT);
			return;
		case GeneratorPackage.VISUALIZATION_SOLUTION__VISUALIZATION_POSITION:
			setVisualizationPosition((VisualizationPosition) null);
			return;
		case GeneratorPackage.VISUALIZATION_SOLUTION__IMAGE:
			setImage(IMAGE_EDEFAULT);
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
		case GeneratorPackage.VISUALIZATION_SOLUTION__VALUE:
			return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
		case GeneratorPackage.VISUALIZATION_SOLUTION__VISUALIZATION_POSITION:
			return visualizationPosition != null;
		case GeneratorPackage.VISUALIZATION_SOLUTION__IMAGE:
			return image != IMAGE_EDEFAULT;
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
		result.append(" (value: ");
		result.append(value);
		result.append(", image: ");
		result.append(image);
		result.append(')');
		return result.toString();
	}

} //VisualizationSolutionImpl
