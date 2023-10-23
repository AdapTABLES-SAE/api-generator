/**
 */
package generator.impl;

import generator.AVizualisationQuestionableFact;
import generator.GeneratorPackage;
import generator.Vizualisation;

import generator.VizualisationSolution;
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
 * An implementation of the model object '<em><b>AVizualisation Questionable Fact</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.AVizualisationQuestionableFactImpl#getVizualisation <em>Vizualisation</em>}</li>
 *   <li>{@link generator.impl.AVizualisationQuestionableFactImpl#getVizualisationSolutions <em>Vizualisation Solutions</em>}</li>
 *   <li>{@link generator.impl.AVizualisationQuestionableFactImpl#getConsigne <em>Consigne</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AVizualisationQuestionableFactImpl extends AQuestionableFactImpl
		implements AVizualisationQuestionableFact {
	/**
	 * The cached value of the '{@link #getVizualisation() <em>Vizualisation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVizualisation()
	 * @generated
	 * @ordered
	 */
	protected Vizualisation vizualisation;

	/**
	 * The cached value of the '{@link #getVizualisationSolutions() <em>Vizualisation Solutions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVizualisationSolutions()
	 * @generated
	 * @ordered
	 */
	protected EList<VizualisationSolution> vizualisationSolutions;

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
	public AVizualisationQuestionableFactImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.AVIZUALISATION_QUESTIONABLE_FACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vizualisation getVizualisation() {
		if (vizualisation != null && vizualisation.eIsProxy()) {
			InternalEObject oldVizualisation = (InternalEObject) vizualisation;
			vizualisation = (Vizualisation) eResolveProxy(oldVizualisation);
			if (vizualisation != oldVizualisation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							GeneratorPackage.AVIZUALISATION_QUESTIONABLE_FACT__VIZUALISATION, oldVizualisation,
							vizualisation));
			}
		}
		return vizualisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vizualisation basicGetVizualisation() {
		return vizualisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVizualisation(Vizualisation newVizualisation) {
		Vizualisation oldVizualisation = vizualisation;
		vizualisation = newVizualisation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.AVIZUALISATION_QUESTIONABLE_FACT__VIZUALISATION, oldVizualisation, vizualisation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VizualisationSolution> getVizualisationSolutions() {
		if (vizualisationSolutions == null) {
			vizualisationSolutions = new EObjectContainmentEList<VizualisationSolution>(VizualisationSolution.class,
					this, GeneratorPackage.AVIZUALISATION_QUESTIONABLE_FACT__VIZUALISATION_SOLUTIONS);
		}
		return vizualisationSolutions;
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
					GeneratorPackage.AVIZUALISATION_QUESTIONABLE_FACT__CONSIGNE, oldConsigne, consigne));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GeneratorPackage.AVIZUALISATION_QUESTIONABLE_FACT__VIZUALISATION_SOLUTIONS:
			return ((InternalEList<?>) getVizualisationSolutions()).basicRemove(otherEnd, msgs);
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
		case GeneratorPackage.AVIZUALISATION_QUESTIONABLE_FACT__VIZUALISATION:
			if (resolve)
				return getVizualisation();
			return basicGetVizualisation();
		case GeneratorPackage.AVIZUALISATION_QUESTIONABLE_FACT__VIZUALISATION_SOLUTIONS:
			return getVizualisationSolutions();
		case GeneratorPackage.AVIZUALISATION_QUESTIONABLE_FACT__CONSIGNE:
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
		case GeneratorPackage.AVIZUALISATION_QUESTIONABLE_FACT__VIZUALISATION:
			setVizualisation((Vizualisation) newValue);
			return;
		case GeneratorPackage.AVIZUALISATION_QUESTIONABLE_FACT__VIZUALISATION_SOLUTIONS:
			getVizualisationSolutions().clear();
			getVizualisationSolutions().addAll((Collection<? extends VizualisationSolution>) newValue);
			return;
		case GeneratorPackage.AVIZUALISATION_QUESTIONABLE_FACT__CONSIGNE:
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
		case GeneratorPackage.AVIZUALISATION_QUESTIONABLE_FACT__VIZUALISATION:
			setVizualisation((Vizualisation) null);
			return;
		case GeneratorPackage.AVIZUALISATION_QUESTIONABLE_FACT__VIZUALISATION_SOLUTIONS:
			getVizualisationSolutions().clear();
			return;
		case GeneratorPackage.AVIZUALISATION_QUESTIONABLE_FACT__CONSIGNE:
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
		case GeneratorPackage.AVIZUALISATION_QUESTIONABLE_FACT__VIZUALISATION:
			return vizualisation != null;
		case GeneratorPackage.AVIZUALISATION_QUESTIONABLE_FACT__VIZUALISATION_SOLUTIONS:
			return vizualisationSolutions != null && !vizualisationSolutions.isEmpty();
		case GeneratorPackage.AVIZUALISATION_QUESTIONABLE_FACT__CONSIGNE:
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

} //AVizualisationQuestionableFactImpl
