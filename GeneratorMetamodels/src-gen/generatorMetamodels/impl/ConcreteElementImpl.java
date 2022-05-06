/**
 */
package generatorMetamodels.impl;

import generatorMetamodels.ConcreteElement;
import generatorMetamodels.GeneratorMetamodelsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concrete Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generatorMetamodels.impl.ConcreteElementImpl#getImgPath <em>Img Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConcreteElementImpl extends GameElementsImpl implements ConcreteElement {
	/**
	 * The default value of the '{@link #getImgPath() <em>Img Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImgPath()
	 * @generated
	 * @ordered
	 */
	protected static final String IMG_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImgPath() <em>Img Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImgPath()
	 * @generated
	 * @ordered
	 */
	protected String imgPath = IMG_PATH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConcreteElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorMetamodelsPackage.Literals.CONCRETE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImgPath() {
		return imgPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImgPath(String newImgPath) {
		String oldImgPath = imgPath;
		imgPath = newImgPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorMetamodelsPackage.CONCRETE_ELEMENT__IMG_PATH,
					oldImgPath, imgPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GeneratorMetamodelsPackage.CONCRETE_ELEMENT__IMG_PATH:
			return getImgPath();
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
		case GeneratorMetamodelsPackage.CONCRETE_ELEMENT__IMG_PATH:
			setImgPath((String) newValue);
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
		case GeneratorMetamodelsPackage.CONCRETE_ELEMENT__IMG_PATH:
			setImgPath(IMG_PATH_EDEFAULT);
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
		case GeneratorMetamodelsPackage.CONCRETE_ELEMENT__IMG_PATH:
			return IMG_PATH_EDEFAULT == null ? imgPath != null : !IMG_PATH_EDEFAULT.equals(imgPath);
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
		result.append(" (imgPath: ");
		result.append(imgPath);
		result.append(')');
		return result.toString();
	}

} //ConcreteElementImpl
