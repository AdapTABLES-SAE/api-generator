/**
 */
package generator.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import generator.Date;
import generator.GeneratorPackage;
import generator.HGQFIdentification;
import generator.Time;
import generator.TimePeriod;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HGQF Identification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.HGQFIdentificationImpl#isSoluce <em>Soluce</em>}</li>
 *   <li>{@link generator.impl.HGQFIdentificationImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link generator.impl.HGQFIdentificationImpl#getTime <em>Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HGQFIdentificationImpl extends QuestionableFactImpl implements HGQFIdentification {
	/**
	 * The default value of the '{@link #isSoluce() <em>Soluce</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSoluce()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SOLUCE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSoluce() <em>Soluce</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSoluce()
	 * @generated
	 * @ordered
	 */
	protected boolean soluce = SOLUCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEvent() <em>Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent()
	 * @generated
	 * @ordered
	 */
	protected static final String EVENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEvent() <em>Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent()
	 * @generated
	 * @ordered
	 */
	protected String event = EVENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected Time time;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HGQFIdentificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.HGQF_IDENTIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSoluce() {
		return soluce;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSoluce(boolean newSoluce) {
		boolean oldSoluce = soluce;
		soluce = newSoluce;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.HGQF_IDENTIFICATION__SOLUCE,
					oldSoluce, soluce));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEvent() {
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvent(String newEvent) {
		String oldEvent = event;
		event = newEvent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.HGQF_IDENTIFICATION__EVENT, oldEvent,
					event));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time getTime() {
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTime(Time newTime, NotificationChain msgs) {
		Time oldTime = time;
		time = newTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.HGQF_IDENTIFICATION__TIME, oldTime, newTime);
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
	public void setTime(Time newTime) {
		if (newTime != time) {
			NotificationChain msgs = null;
			if (time != null)
				msgs = ((InternalEObject) time).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.HGQF_IDENTIFICATION__TIME, null, msgs);
			if (newTime != null)
				msgs = ((InternalEObject) newTime).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.HGQF_IDENTIFICATION__TIME, null, msgs);
			msgs = basicSetTime(newTime, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.HGQF_IDENTIFICATION__TIME, newTime,
					newTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GeneratorPackage.HGQF_IDENTIFICATION__TIME:
			return basicSetTime(null, msgs);
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
		case GeneratorPackage.HGQF_IDENTIFICATION__SOLUCE:
			return isSoluce();
		case GeneratorPackage.HGQF_IDENTIFICATION__EVENT:
			return getEvent();
		case GeneratorPackage.HGQF_IDENTIFICATION__TIME:
			return getTime();
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
		case GeneratorPackage.HGQF_IDENTIFICATION__SOLUCE:
			setSoluce((Boolean) newValue);
			return;
		case GeneratorPackage.HGQF_IDENTIFICATION__EVENT:
			setEvent((String) newValue);
			return;
		case GeneratorPackage.HGQF_IDENTIFICATION__TIME:
			setTime((Time) newValue);
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
		case GeneratorPackage.HGQF_IDENTIFICATION__SOLUCE:
			setSoluce(SOLUCE_EDEFAULT);
			return;
		case GeneratorPackage.HGQF_IDENTIFICATION__EVENT:
			setEvent(EVENT_EDEFAULT);
			return;
		case GeneratorPackage.HGQF_IDENTIFICATION__TIME:
			setTime((Time) null);
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
		case GeneratorPackage.HGQF_IDENTIFICATION__SOLUCE:
			return soluce != SOLUCE_EDEFAULT;
		case GeneratorPackage.HGQF_IDENTIFICATION__EVENT:
			return EVENT_EDEFAULT == null ? event != null : !EVENT_EDEFAULT.equals(event);
		case GeneratorPackage.HGQF_IDENTIFICATION__TIME:
			return time != null;
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
		result.append(" (soluce: ");
		result.append(soluce);
		result.append(", event: ");
		result.append(event);
		result.append(')');
		return result.toString();
	}

	@Override
	public String getQuestionableFact() {
		String stime = "";
		if (time instanceof TimePeriod) {
			stime = ((TimePeriod) time).getStartYear() + " et " + ((TimePeriod) time).getEndYear();
		} else {
			stime = ((Date) time).getDay() != null && !((Date) time).getDay().isEmpty()? ((Date) time).getDay() : "";
			stime += ((Date) time).getMonth() != null && !((Date) time).getMonth().isEmpty()? ((Date) time).getMonth() : "";
			stime += ((Date) time).getYear();
		}
		return event + " " + stime;
	}

	@Override
	public String getCompleteFact() {
		String stime = "";
		if (time instanceof TimePeriod) {
			stime = ((TimePeriod) time).getStartYear() + " et " + ((TimePeriod) time).getEndYear();
		} else {
			stime = ((Date) time).getDay() != null && !((Date) time).getDay().isEmpty()? ((Date) time).getDay() : "";
			stime += ((Date) time).getMonth() != null && !((Date) time).getMonth().isEmpty()? ((Date) time).getMonth() : "";
			stime += ((Date) time).getYear();
		}
		return event + " " + stime;
	}

} //HGQFIdentificationImpl
