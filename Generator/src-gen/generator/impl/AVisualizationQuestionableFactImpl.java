/**
 */
package generator.impl;

import generator.AVisualizationQuestionableFact;
import generator.GeneratorPackage;
import generator.Visualization;
import generator.VisualizationSolution;
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
 * An implementation of the model object '<em><b>AVisualization Questionable Fact</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.AVisualizationQuestionableFactImpl#getVisualization <em>Visualization</em>}</li>
 *   <li>{@link generator.impl.AVisualizationQuestionableFactImpl#getVisualizationSolutions <em>Visualization Solutions</em>}</li>
 *   <li>{@link generator.impl.AVisualizationQuestionableFactImpl#getConsigne <em>Consigne</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AVisualizationQuestionableFactImpl extends AQuestionableFactImpl
		implements AVisualizationQuestionableFact {
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
	 * The cached value of the '{@link #getVisualizationSolutions() <em>Visualization Solutions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisualizationSolutions()
	 * @generated
	 * @ordered
	 */
	protected EList<VisualizationSolution> visualizationSolutions;

	/**
	 * The default value of the '{@link #getConsigne() <em>Consigne</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsigne()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSIGNE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConsigne() <em>Consigne</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsigne()
	 * @generated
	 * @ordered
	 */
	protected String consigne = CONSIGNE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AVisualizationQuestionableFactImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.AVISUALIZATION_QUESTIONABLE_FACT;
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
							GeneratorPackage.AVISUALIZATION_QUESTIONABLE_FACT__VISUALIZATION, oldVisualization,
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
					GeneratorPackage.AVISUALIZATION_QUESTIONABLE_FACT__VISUALIZATION, oldVisualization, visualization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VisualizationSolution> getVisualizationSolutions() {
		if (visualizationSolutions == null) {
			visualizationSolutions = new EObjectContainmentEList<VisualizationSolution>(VisualizationSolution.class,
					this, GeneratorPackage.AVISUALIZATION_QUESTIONABLE_FACT__VISUALIZATION_SOLUTIONS);
		}
		return visualizationSolutions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConsigne() {
		return consigne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConsigne(String newConsigne) {
		String oldConsigne = consigne;
		consigne = newConsigne;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.AVISUALIZATION_QUESTIONABLE_FACT__CONSIGNE, oldConsigne, consigne));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GeneratorPackage.AVISUALIZATION_QUESTIONABLE_FACT__VISUALIZATION_SOLUTIONS:
			return ((InternalEList<?>) getVisualizationSolutions()).basicRemove(otherEnd, msgs);
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
		case GeneratorPackage.AVISUALIZATION_QUESTIONABLE_FACT__VISUALIZATION:
			if (resolve)
				return getVisualization();
			return basicGetVisualization();
		case GeneratorPackage.AVISUALIZATION_QUESTIONABLE_FACT__VISUALIZATION_SOLUTIONS:
			return getVisualizationSolutions();
		case GeneratorPackage.AVISUALIZATION_QUESTIONABLE_FACT__CONSIGNE:
			return getConsigne();
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
		case GeneratorPackage.AVISUALIZATION_QUESTIONABLE_FACT__VISUALIZATION:
			setVisualization((Visualization) newValue);
			return;
		case GeneratorPackage.AVISUALIZATION_QUESTIONABLE_FACT__VISUALIZATION_SOLUTIONS:
			getVisualizationSolutions().clear();
			getVisualizationSolutions().addAll((Collection<? extends VisualizationSolution>) newValue);
			return;
		case GeneratorPackage.AVISUALIZATION_QUESTIONABLE_FACT__CONSIGNE:
			setConsigne((String) newValue);
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
		case GeneratorPackage.AVISUALIZATION_QUESTIONABLE_FACT__VISUALIZATION:
			setVisualization((Visualization) null);
			return;
		case GeneratorPackage.AVISUALIZATION_QUESTIONABLE_FACT__VISUALIZATION_SOLUTIONS:
			getVisualizationSolutions().clear();
			return;
		case GeneratorPackage.AVISUALIZATION_QUESTIONABLE_FACT__CONSIGNE:
			setConsigne(CONSIGNE_EDEFAULT);
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
		case GeneratorPackage.AVISUALIZATION_QUESTIONABLE_FACT__VISUALIZATION:
			return visualization != null;
		case GeneratorPackage.AVISUALIZATION_QUESTIONABLE_FACT__VISUALIZATION_SOLUTIONS:
			return visualizationSolutions != null && !visualizationSolutions.isEmpty();
		case GeneratorPackage.AVISUALIZATION_QUESTIONABLE_FACT__CONSIGNE:
			return CONSIGNE_EDEFAULT == null ? consigne != null : !CONSIGNE_EDEFAULT.equals(consigne);
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
		result.append(" (consigne: ");
		result.append(consigne);
		result.append(')');
		return result.toString();
	}

} //AVisualizationQuestionableFactImpl
