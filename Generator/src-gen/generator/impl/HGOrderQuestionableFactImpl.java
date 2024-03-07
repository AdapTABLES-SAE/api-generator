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
import generator.HGOrderQuestionableFact;
import generator.HGOrderSolution;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HG Order Questionable Fact</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.HGOrderQuestionableFactImpl#getSolutions <em>Solutions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HGOrderQuestionableFactImpl extends QuestionableFactImpl implements HGOrderQuestionableFact {
	/**
	 * The cached value of the '{@link #getSolutions() <em>Solutions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolutions()
	 * @generated
	 * @ordered
	 */
	protected EList<HGOrderSolution> solutions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HGOrderQuestionableFactImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.HG_ORDER_QUESTIONABLE_FACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HGOrderSolution> getSolutions() {
		if (solutions == null) {
			solutions = new EObjectContainmentEList<HGOrderSolution>(HGOrderSolution.class, this,
					GeneratorPackage.HG_ORDER_QUESTIONABLE_FACT__SOLUTIONS);
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
		case GeneratorPackage.HG_ORDER_QUESTIONABLE_FACT__SOLUTIONS:
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
		case GeneratorPackage.HG_ORDER_QUESTIONABLE_FACT__SOLUTIONS:
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
		case GeneratorPackage.HG_ORDER_QUESTIONABLE_FACT__SOLUTIONS:
			getSolutions().clear();
			getSolutions().addAll((Collection<? extends HGOrderSolution>) newValue);
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
		case GeneratorPackage.HG_ORDER_QUESTIONABLE_FACT__SOLUTIONS:
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
		case GeneratorPackage.HG_ORDER_QUESTIONABLE_FACT__SOLUTIONS:
			return solutions != null && !solutions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	@Override
	public String getQuestionableFact() {
		return "Ordonner chronologiquement";
	}

	@Override
	public String getCompleteFact() {
		String fact = getQuestionableFact() + " : ";
		int i = 0;
		orderEvents();
		for (HGOrderSolution sol : solutions) {
			fact += sol.getEvent();
			if (i < getSolutions().size() - 1) {
				fact += " - ";
			}
			i++;
		}
		return fact;
	}

	private void orderEvents() {
		Collections.sort(solutions, new Comparator<HGOrderSolution>() {
			public int compare(HGOrderSolution o1, HGOrderSolution o2) {
				return o1.getOrder() - o2.getOrder();
			}
		});
	}
} //HGOrderQuestionableFactImpl
