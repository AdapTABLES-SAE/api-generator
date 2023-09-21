/**
 */
package generator.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import generator.GeneratorPackage;
import generator.GeographyLegendFact;
import generator.LegendSymbol;
import generator.LegendText;
import generator.Map;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Geography Legend Fact</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.GeographyLegendFactImpl#getMap <em>Map</em>}</li>
 *   <li>{@link generator.impl.GeographyLegendFactImpl#getSymbol <em>Symbol</em>}</li>
 *   <li>{@link generator.impl.GeographyLegendFactImpl#getLegend <em>Legend</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GeographyLegendFactImpl extends AbstractFactImpl implements GeographyLegendFact {
	/**
	 * The cached value of the '{@link #getMap() <em>Map</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMap()
	 * @generated
	 * @ordered
	 */
	protected Map map;

	/**
	 * The cached value of the '{@link #getSymbol() <em>Symbol</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbol()
	 * @generated
	 * @ordered
	 */
	protected LegendSymbol symbol;

	/**
	 * The cached value of the '{@link #getLegend() <em>Legend</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegend()
	 * @generated
	 * @ordered
	 */
	protected LegendText legend;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeographyLegendFactImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.GEOGRAPHY_LEGEND_FACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map getMap() {
		if (map != null && map.eIsProxy()) {
			InternalEObject oldMap = (InternalEObject) map;
			map = (Map) eResolveProxy(oldMap);
			if (map != oldMap) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							GeneratorPackage.GEOGRAPHY_LEGEND_FACT__MAP, oldMap, map));
			}
		}
		return map;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map basicGetMap() {
		return map;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMap(Map newMap) {
		Map oldMap = map;
		map = newMap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.GEOGRAPHY_LEGEND_FACT__MAP, oldMap,
					map));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegendSymbol getSymbol() {
		return symbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSymbol(LegendSymbol newSymbol, NotificationChain msgs) {
		LegendSymbol oldSymbol = symbol;
		symbol = newSymbol;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.GEOGRAPHY_LEGEND_FACT__SYMBOL, oldSymbol, newSymbol);
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
	public void setSymbol(LegendSymbol newSymbol) {
		if (newSymbol != symbol) {
			NotificationChain msgs = null;
			if (symbol != null)
				msgs = ((InternalEObject) symbol).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.GEOGRAPHY_LEGEND_FACT__SYMBOL, null, msgs);
			if (newSymbol != null)
				msgs = ((InternalEObject) newSymbol).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.GEOGRAPHY_LEGEND_FACT__SYMBOL, null, msgs);
			msgs = basicSetSymbol(newSymbol, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.GEOGRAPHY_LEGEND_FACT__SYMBOL,
					newSymbol, newSymbol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegendText getLegend() {
		return legend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLegend(LegendText newLegend, NotificationChain msgs) {
		LegendText oldLegend = legend;
		legend = newLegend;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.GEOGRAPHY_LEGEND_FACT__LEGEND, oldLegend, newLegend);
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
	public void setLegend(LegendText newLegend) {
		if (newLegend != legend) {
			NotificationChain msgs = null;
			if (legend != null)
				msgs = ((InternalEObject) legend).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.GEOGRAPHY_LEGEND_FACT__LEGEND, null, msgs);
			if (newLegend != null)
				msgs = ((InternalEObject) newLegend).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.GEOGRAPHY_LEGEND_FACT__LEGEND, null, msgs);
			msgs = basicSetLegend(newLegend, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.GEOGRAPHY_LEGEND_FACT__LEGEND,
					newLegend, newLegend));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GeneratorPackage.GEOGRAPHY_LEGEND_FACT__SYMBOL:
			return basicSetSymbol(null, msgs);
		case GeneratorPackage.GEOGRAPHY_LEGEND_FACT__LEGEND:
			return basicSetLegend(null, msgs);
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
		case GeneratorPackage.GEOGRAPHY_LEGEND_FACT__MAP:
			if (resolve)
				return getMap();
			return basicGetMap();
		case GeneratorPackage.GEOGRAPHY_LEGEND_FACT__SYMBOL:
			return getSymbol();
		case GeneratorPackage.GEOGRAPHY_LEGEND_FACT__LEGEND:
			return getLegend();
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
		case GeneratorPackage.GEOGRAPHY_LEGEND_FACT__MAP:
			setMap((Map) newValue);
			return;
		case GeneratorPackage.GEOGRAPHY_LEGEND_FACT__SYMBOL:
			setSymbol((LegendSymbol) newValue);
			return;
		case GeneratorPackage.GEOGRAPHY_LEGEND_FACT__LEGEND:
			setLegend((LegendText) newValue);
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
		case GeneratorPackage.GEOGRAPHY_LEGEND_FACT__MAP:
			setMap((Map) null);
			return;
		case GeneratorPackage.GEOGRAPHY_LEGEND_FACT__SYMBOL:
			setSymbol((LegendSymbol) null);
			return;
		case GeneratorPackage.GEOGRAPHY_LEGEND_FACT__LEGEND:
			setLegend((LegendText) null);
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
		case GeneratorPackage.GEOGRAPHY_LEGEND_FACT__MAP:
			return map != null;
		case GeneratorPackage.GEOGRAPHY_LEGEND_FACT__SYMBOL:
			return symbol != null;
		case GeneratorPackage.GEOGRAPHY_LEGEND_FACT__LEGEND:
			return legend != null;
		}
		return super.eIsSet(featureID);
	}

} //GeographyLegendFactImpl
