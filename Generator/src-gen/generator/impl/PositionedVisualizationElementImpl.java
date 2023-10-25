/**
 */
package generator.impl;

import generator.GeneratorPackage;
import generator.Position;
import generator.PositionedVisualizationElement;
import generator.Visualization;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Positioned Visualization Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.PositionedVisualizationElementImpl#getCreatedPositions <em>Created Positions</em>}</li>
 *   <li>{@link generator.impl.PositionedVisualizationElementImpl#getVisualization <em>Visualization</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PositionedVisualizationElementImpl extends PositionedElementImpl
		implements PositionedVisualizationElement {
	/**
	 * The cached value of the '{@link #getCreatedPositions() <em>Created Positions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedPositions()
	 * @generated
	 * @ordered
	 */
	protected EList<Position> createdPositions;

	/**
	 * The cached value of the '{@link #getVisualization() <em>Visualization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisualization()
	 * @generated
	 * @ordered
	 */
	protected Visualization visualization;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositionedVisualizationElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.POSITIONED_VISUALIZATION_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Position> getCreatedPositions() {
		if (createdPositions == null) {
			createdPositions = new EObjectContainmentEList<Position>(Position.class, this,
					GeneratorPackage.POSITIONED_VISUALIZATION_ELEMENT__CREATED_POSITIONS);
		}
		return createdPositions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Visualization getVisualization() {
		if (visualization != null && visualization.eIsProxy()) {
			InternalEObject oldVisualization = (InternalEObject) visualization;
			visualization = (Visualization) eResolveProxy(oldVisualization);
			if (visualization != oldVisualization) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							GeneratorPackage.POSITIONED_VISUALIZATION_ELEMENT__VISUALIZATION, oldVisualization,
							visualization));
			}
		}
		return visualization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Visualization basicGetVisualization() {
		return visualization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisualization(Visualization newVisualization) {
		Visualization oldVisualization = visualization;
		visualization = newVisualization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.POSITIONED_VISUALIZATION_ELEMENT__VISUALIZATION, oldVisualization, visualization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GeneratorPackage.POSITIONED_VISUALIZATION_ELEMENT__CREATED_POSITIONS:
			return ((InternalEList<?>) getCreatedPositions()).basicRemove(otherEnd, msgs);
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
		case GeneratorPackage.POSITIONED_VISUALIZATION_ELEMENT__CREATED_POSITIONS:
			return getCreatedPositions();
		case GeneratorPackage.POSITIONED_VISUALIZATION_ELEMENT__VISUALIZATION:
			if (resolve)
				return getVisualization();
			return basicGetVisualization();
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
		case GeneratorPackage.POSITIONED_VISUALIZATION_ELEMENT__CREATED_POSITIONS:
			getCreatedPositions().clear();
			getCreatedPositions().addAll((Collection<? extends Position>) newValue);
			return;
		case GeneratorPackage.POSITIONED_VISUALIZATION_ELEMENT__VISUALIZATION:
			setVisualization((Visualization) newValue);
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
		case GeneratorPackage.POSITIONED_VISUALIZATION_ELEMENT__CREATED_POSITIONS:
			getCreatedPositions().clear();
			return;
		case GeneratorPackage.POSITIONED_VISUALIZATION_ELEMENT__VISUALIZATION:
			setVisualization((Visualization) null);
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
		case GeneratorPackage.POSITIONED_VISUALIZATION_ELEMENT__CREATED_POSITIONS:
			return createdPositions != null && !createdPositions.isEmpty();
		case GeneratorPackage.POSITIONED_VISUALIZATION_ELEMENT__VISUALIZATION:
			return visualization != null;
		}
		return super.eIsSet(featureID);
	}

} //PositionedVisualizationElementImpl
