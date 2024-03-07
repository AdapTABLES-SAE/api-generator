/**
 */
package generator.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import generator.GeneratorPackage;
import generator.PlanetOrder;
import generator.QFOrderPlanets;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>QF Order Planets</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.QFOrderPlanetsImpl#getSolutions <em>Solutions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QFOrderPlanetsImpl extends QuestionableFactImpl implements QFOrderPlanets {
	/**
	 * The cached value of the '{@link #getSolutions() <em>Solutions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolutions()
	 * @generated
	 * @ordered
	 */
	protected EList<PlanetOrder> solutions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QFOrderPlanetsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.QF_ORDER_PLANETS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PlanetOrder> getSolutions() {
		if (solutions == null) {
			solutions = new EObjectContainmentEList<PlanetOrder>(PlanetOrder.class, this,
					GeneratorPackage.QF_ORDER_PLANETS__SOLUTIONS);
		}
		return solutions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GeneratorPackage.QF_ORDER_PLANETS__SOLUTIONS:
			return ((InternalEList<?>) getSolutions()).basicRemove(otherEnd, msgs);
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
		case GeneratorPackage.QF_ORDER_PLANETS__SOLUTIONS:
			return getSolutions();
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
		case GeneratorPackage.QF_ORDER_PLANETS__SOLUTIONS:
			getSolutions().clear();
			getSolutions().addAll((Collection<? extends PlanetOrder>) newValue);
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
		case GeneratorPackage.QF_ORDER_PLANETS__SOLUTIONS:
			getSolutions().clear();
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
		case GeneratorPackage.QF_ORDER_PLANETS__SOLUTIONS:
			return solutions != null && !solutions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	@Override
	public String getQuestionableFact() {
		return "Du + au - proche du soleil";
	}

	@Override
	public String getCompleteFact() {
		String complete = getQuestionableFact() + " : ";
		int i = 0;
		orderPlanets();
		for (PlanetOrder soluce : solutions) {
			complete += soluce.getPlanet();
			if (i < getSolutions().size() - 1) {
				complete += " - ";
			}
			i++;
		}
		return complete;
	}

	private void orderPlanets() {
		Collections.sort(solutions, new Comparator<PlanetOrder>() {
			public int compare(PlanetOrder o1, PlanetOrder o2) {
				return o1.getOrder() - o2.getOrder();
			}
		});
	}

} //QFOrderPlanetsImpl
