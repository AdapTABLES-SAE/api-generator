/**
 */
package generator.impl;

import generator.GeneratorPackage;
import generator.MapElementPosition;
import generator.TimePeriod;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

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
 *   <li>{@link generator.impl.TimePeriodImpl#getPositions <em>Positions</em>}</li>
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
	 * The cached value of the '{@link #getPositions() <em>Positions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositions()
	 * @generated
	 * @ordered
	 */
	protected EList<MapElementPosition> positions;

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
	public EList<MapElementPosition> getPositions() {
		if (positions == null) {
			positions = new EObjectResolvingEList<MapElementPosition>(MapElementPosition.class, this,
					GeneratorPackage.TIME_PERIOD__POSITIONS);
		}
		return positions;
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
		case GeneratorPackage.TIME_PERIOD__POSITIONS:
			return getPositions();
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
		case GeneratorPackage.TIME_PERIOD__POSITIONS:
			getPositions().clear();
			getPositions().addAll((Collection<? extends MapElementPosition>) newValue);
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
		case GeneratorPackage.TIME_PERIOD__POSITIONS:
			getPositions().clear();
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
		case GeneratorPackage.TIME_PERIOD__POSITIONS:
			return positions != null && !positions.isEmpty();
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
		result.append(" (startYear: ");
		result.append(startYear);
		result.append(", endYear: ");
		result.append(endYear);
		result.append(')');
		return result.toString();
	}

} //TimePeriodImpl
