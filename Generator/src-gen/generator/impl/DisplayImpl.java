/**
 */
package generator.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import generator.Correctness;
import generator.Display;
import generator.GeneratorPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Display</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.DisplayImpl#isInteractive <em>Interactive</em>}</li>
 *   <li>{@link generator.impl.DisplayImpl#getCorrectness <em>Correctness</em>}</li>
 *   <li>{@link generator.impl.DisplayImpl#isImageDisplay <em>Image Display</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DisplayImpl extends ParameterImpl implements Display {
	/**
	 * The default value of the '{@link #isInteractive() <em>Interactive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInteractive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INTERACTIVE_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isInteractive() <em>Interactive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInteractive()
	 * @generated
	 * @ordered
	 */
	protected boolean interactive = INTERACTIVE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCorrectness() <em>Correctness</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrectness()
	 * @generated
	 * @ordered
	 */
	protected Correctness correctness;

	/**
	 * The default value of the '{@link #isImageDisplay() <em>Image Display</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isImageDisplay()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IMAGE_DISPLAY_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isImageDisplay() <em>Image Display</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isImageDisplay()
	 * @generated
	 * @ordered
	 */
	protected boolean imageDisplay = IMAGE_DISPLAY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisplayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.DISPLAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInteractive() {
		return interactive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInteractive(boolean newInteractive) {
		boolean oldInteractive = interactive;
		interactive = newInteractive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.DISPLAY__INTERACTIVE, oldInteractive,
					interactive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Correctness getCorrectness() {
		return correctness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCorrectness(Correctness newCorrectness, NotificationChain msgs) {
		Correctness oldCorrectness = correctness;
		correctness = newCorrectness;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.DISPLAY__CORRECTNESS, oldCorrectness, newCorrectness);
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
	public void setCorrectness(Correctness newCorrectness) {
		if (newCorrectness != correctness) {
			NotificationChain msgs = null;
			if (correctness != null)
				msgs = ((InternalEObject) correctness).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.DISPLAY__CORRECTNESS, null, msgs);
			if (newCorrectness != null)
				msgs = ((InternalEObject) newCorrectness).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.DISPLAY__CORRECTNESS, null, msgs);
			msgs = basicSetCorrectness(newCorrectness, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.DISPLAY__CORRECTNESS, newCorrectness,
					newCorrectness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isImageDisplay() {
		return imageDisplay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImageDisplay(boolean newImageDisplay) {
		boolean oldImageDisplay = imageDisplay;
		imageDisplay = newImageDisplay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.DISPLAY__IMAGE_DISPLAY,
					oldImageDisplay, imageDisplay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GeneratorPackage.DISPLAY__CORRECTNESS:
			return basicSetCorrectness(null, msgs);
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
		case GeneratorPackage.DISPLAY__INTERACTIVE:
			return isInteractive();
		case GeneratorPackage.DISPLAY__CORRECTNESS:
			return getCorrectness();
		case GeneratorPackage.DISPLAY__IMAGE_DISPLAY:
			return isImageDisplay();
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
		case GeneratorPackage.DISPLAY__INTERACTIVE:
			setInteractive((Boolean) newValue);
			return;
		case GeneratorPackage.DISPLAY__CORRECTNESS:
			setCorrectness((Correctness) newValue);
			return;
		case GeneratorPackage.DISPLAY__IMAGE_DISPLAY:
			setImageDisplay((Boolean) newValue);
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
		case GeneratorPackage.DISPLAY__INTERACTIVE:
			setInteractive(INTERACTIVE_EDEFAULT);
			return;
		case GeneratorPackage.DISPLAY__CORRECTNESS:
			setCorrectness((Correctness) null);
			return;
		case GeneratorPackage.DISPLAY__IMAGE_DISPLAY:
			setImageDisplay(IMAGE_DISPLAY_EDEFAULT);
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
		case GeneratorPackage.DISPLAY__INTERACTIVE:
			return interactive != INTERACTIVE_EDEFAULT;
		case GeneratorPackage.DISPLAY__CORRECTNESS:
			return correctness != null;
		case GeneratorPackage.DISPLAY__IMAGE_DISPLAY:
			return imageDisplay != IMAGE_DISPLAY_EDEFAULT;
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
		result.append(" (interactive: ");
		result.append(interactive);
		result.append(", imageDisplay: ");
		result.append(imageDisplay);
		result.append(')');
		return result.toString();
	}

} //DisplayImpl
