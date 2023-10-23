/**
 */
package generator.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import generator.GeneratorPackage;
import generator.TimePeriod;
import generator.VisualizationPosition;
import java.lang.reflect.InvocationTargetException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Period</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.TimePeriodImpl#getStartYear <em>Start Year</em>}</li>
 *   <li>{@link generator.impl.TimePeriodImpl#getEndYear <em>End Year</em>}</li>
 *   <li>{@link generator.impl.TimePeriodImpl#getStartPosition <em>Start Position</em>}</li>
 *   <li>{@link generator.impl.TimePeriodImpl#getEndPosition <em>End Position</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimePeriodImpl extends TimeImpl implements TimePeriod {
	/**
	 * The default value of the '{@link #getStartYear() <em>Start Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartYear()
	 * @generated
	 * @ordered
	 */
	protected static final String START_YEAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartYear() <em>Start Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartYear()
	 * @generated
	 * @ordered
	 */
	protected String startYear = START_YEAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndYear() <em>End Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndYear()
	 * @generated
	 * @ordered
	 */
	protected static final String END_YEAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndYear() <em>End Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndYear()
	 * @generated
	 * @ordered
	 */
	protected String endYear = END_YEAR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStartPosition() <em>Start Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartPosition()
	 * @generated
	 * @ordered
	 */
	protected VisualizationPosition startPosition;

	/**
	 * The cached value of the '{@link #getEndPosition() <em>End Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndPosition()
	 * @generated
	 * @ordered
	 */
	protected VisualizationPosition endPosition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimePeriodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.TIME_PERIOD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStartYear() {
		return startYear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartYear(String newStartYear) {
		String oldStartYear = startYear;
		startYear = newStartYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.TIME_PERIOD__START_YEAR,
					oldStartYear, startYear));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEndYear() {
		return endYear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndYear(String newEndYear) {
		String oldEndYear = endYear;
		endYear = newEndYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.TIME_PERIOD__END_YEAR, oldEndYear,
					endYear));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisualizationPosition getStartPosition() {
		if (startPosition != null && startPosition.eIsProxy()) {
			InternalEObject oldStartPosition = (InternalEObject) startPosition;
			startPosition = (VisualizationPosition) eResolveProxy(oldStartPosition);
			if (startPosition != oldStartPosition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							GeneratorPackage.TIME_PERIOD__START_POSITION, oldStartPosition, startPosition));
			}
		}
		return startPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisualizationPosition basicGetStartPosition() {
		return startPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartPosition(VisualizationPosition newStartPosition) {
		VisualizationPosition oldStartPosition = startPosition;
		startPosition = newStartPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.TIME_PERIOD__START_POSITION,
					oldStartPosition, startPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisualizationPosition getEndPosition() {
		if (endPosition != null && endPosition.eIsProxy()) {
			InternalEObject oldEndPosition = (InternalEObject) endPosition;
			endPosition = (VisualizationPosition) eResolveProxy(oldEndPosition);
			if (endPosition != oldEndPosition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							GeneratorPackage.TIME_PERIOD__END_POSITION, oldEndPosition, endPosition));
			}
		}
		return endPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisualizationPosition basicGetEndPosition() {
		return endPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndPosition(VisualizationPosition newEndPosition) {
		VisualizationPosition oldEndPosition = endPosition;
		endPosition = newEndPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.TIME_PERIOD__END_POSITION,
					oldEndPosition, endPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GeneratorPackage.TIME_PERIOD__START_YEAR:
			return getStartYear();
		case GeneratorPackage.TIME_PERIOD__END_YEAR:
			return getEndYear();
		case GeneratorPackage.TIME_PERIOD__START_POSITION:
			if (resolve)
				return getStartPosition();
			return basicGetStartPosition();
		case GeneratorPackage.TIME_PERIOD__END_POSITION:
			if (resolve)
				return getEndPosition();
			return basicGetEndPosition();
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
		case GeneratorPackage.TIME_PERIOD__START_YEAR:
			setStartYear((String) newValue);
			return;
		case GeneratorPackage.TIME_PERIOD__END_YEAR:
			setEndYear((String) newValue);
			return;
		case GeneratorPackage.TIME_PERIOD__START_POSITION:
			setStartPosition((VisualizationPosition) newValue);
			return;
		case GeneratorPackage.TIME_PERIOD__END_POSITION:
			setEndPosition((VisualizationPosition) newValue);
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
		case GeneratorPackage.TIME_PERIOD__START_YEAR:
			setStartYear(START_YEAR_EDEFAULT);
			return;
		case GeneratorPackage.TIME_PERIOD__END_YEAR:
			setEndYear(END_YEAR_EDEFAULT);
			return;
		case GeneratorPackage.TIME_PERIOD__START_POSITION:
			setStartPosition((VisualizationPosition) null);
			return;
		case GeneratorPackage.TIME_PERIOD__END_POSITION:
			setEndPosition((VisualizationPosition) null);
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
		case GeneratorPackage.TIME_PERIOD__START_YEAR:
			return START_YEAR_EDEFAULT == null ? startYear != null : !START_YEAR_EDEFAULT.equals(startYear);
		case GeneratorPackage.TIME_PERIOD__END_YEAR:
			return END_YEAR_EDEFAULT == null ? endYear != null : !END_YEAR_EDEFAULT.equals(endYear);
		case GeneratorPackage.TIME_PERIOD__START_POSITION:
			return startPosition != null;
		case GeneratorPackage.TIME_PERIOD__END_POSITION:
			return endPosition != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case GeneratorPackage.TIME_PERIOD___TO_STRING:
			return toString();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return startYear + " - " + endYear;
	}

} //TimePeriodImpl
