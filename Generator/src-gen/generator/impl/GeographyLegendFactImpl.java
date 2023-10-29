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
import generator.LegendText;
import generator.VisualizationPosition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Geography Legend Fact</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.GeographyLegendFactImpl#getLegend <em>Legend</em>}</li>
 *   <li>{@link generator.impl.GeographyLegendFactImpl#getSymbolPosition <em>Symbol Position</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GeographyLegendFactImpl extends AbstractFactImpl implements GeographyLegendFact {
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
	 * The cached value of the '{@link #getSymbolPosition() <em>Symbol Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbolPosition()
	 * @generated
	 * @ordered
	 */
	protected VisualizationPosition symbolPosition;

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
	public VisualizationPosition getSymbolPosition() {
		if (symbolPosition != null && symbolPosition.eIsProxy()) {
			InternalEObject oldSymbolPosition = (InternalEObject) symbolPosition;
			symbolPosition = (VisualizationPosition) eResolveProxy(oldSymbolPosition);
			if (symbolPosition != oldSymbolPosition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							GeneratorPackage.GEOGRAPHY_LEGEND_FACT__SYMBOL_POSITION, oldSymbolPosition,
							symbolPosition));
			}
		}
		return symbolPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisualizationPosition basicGetSymbolPosition() {
		return symbolPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSymbolPosition(VisualizationPosition newSymbolPosition) {
		VisualizationPosition oldSymbolPosition = symbolPosition;
		symbolPosition = newSymbolPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.GEOGRAPHY_LEGEND_FACT__SYMBOL_POSITION, oldSymbolPosition, symbolPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
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
		case GeneratorPackage.GEOGRAPHY_LEGEND_FACT__LEGEND:
			return getLegend();
		case GeneratorPackage.GEOGRAPHY_LEGEND_FACT__SYMBOL_POSITION:
			if (resolve)
				return getSymbolPosition();
			return basicGetSymbolPosition();
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
		case GeneratorPackage.GEOGRAPHY_LEGEND_FACT__LEGEND:
			setLegend((LegendText) newValue);
			return;
		case GeneratorPackage.GEOGRAPHY_LEGEND_FACT__SYMBOL_POSITION:
			setSymbolPosition((VisualizationPosition) newValue);
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
		case GeneratorPackage.GEOGRAPHY_LEGEND_FACT__LEGEND:
			setLegend((LegendText) null);
			return;
		case GeneratorPackage.GEOGRAPHY_LEGEND_FACT__SYMBOL_POSITION:
			setSymbolPosition((VisualizationPosition) null);
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
		case GeneratorPackage.GEOGRAPHY_LEGEND_FACT__LEGEND:
			return legend != null;
		case GeneratorPackage.GEOGRAPHY_LEGEND_FACT__SYMBOL_POSITION:
			return symbolPosition != null;
		}
		return super.eIsSet(featureID);
	}

} //GeographyLegendFactImpl
