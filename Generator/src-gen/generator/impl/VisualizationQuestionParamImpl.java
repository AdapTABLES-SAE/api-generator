/**
 */
package generator.impl;

import generator.GeneratorPackage;
import generator.Visualization;
import generator.VisualizationQuestionParam;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Visualization Question Param</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.VisualizationQuestionParamImpl#getVisualization <em>Visualization</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VisualizationQuestionParamImpl extends AQuestionParamImpl implements VisualizationQuestionParam {
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
	public VisualizationQuestionParamImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.VISUALIZATION_QUESTION_PARAM;
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
							GeneratorPackage.VISUALIZATION_QUESTION_PARAM__VISUALIZATION, oldVisualization,
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
					GeneratorPackage.VISUALIZATION_QUESTION_PARAM__VISUALIZATION, oldVisualization, visualization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GeneratorPackage.VISUALIZATION_QUESTION_PARAM__VISUALIZATION:
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
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case GeneratorPackage.VISUALIZATION_QUESTION_PARAM__VISUALIZATION:
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
		case GeneratorPackage.VISUALIZATION_QUESTION_PARAM__VISUALIZATION:
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
		case GeneratorPackage.VISUALIZATION_QUESTION_PARAM__VISUALIZATION:
			return visualization != null;
		}
		return super.eIsSet(featureID);
	}

} //VisualizationQuestionParamImpl
