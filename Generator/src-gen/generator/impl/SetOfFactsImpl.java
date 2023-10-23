/**
 */
package generator.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import generator.AbstractFact;
import generator.GeneratorPackage;
import generator.SetOfFacts;
import generator.Vizualisation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Set Of Facts</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.SetOfFactsImpl#getFacts <em>Facts</em>}</li>
 *   <li>{@link generator.impl.SetOfFactsImpl#getName <em>Name</em>}</li>
 *   <li>{@link generator.impl.SetOfFactsImpl#getVizualisation <em>Vizualisation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SetOfFactsImpl extends MinimalEObjectImpl.Container implements SetOfFacts {
	/**
	 * The cached value of the '{@link #getFacts() <em>Facts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacts()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractFact> facts;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVizualisation() <em>Vizualisation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVizualisation()
	 * @generated
	 * @ordered
	 */
	protected Vizualisation vizualisation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetOfFactsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.SET_OF_FACTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractFact> getFacts() {
		if (facts == null) {
			facts = new EObjectContainmentEList<AbstractFact>(AbstractFact.class, this,
					GeneratorPackage.SET_OF_FACTS__FACTS);
		}
		return facts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.SET_OF_FACTS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vizualisation getVizualisation() {
		return vizualisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVizualisation(Vizualisation newVizualisation, NotificationChain msgs) {
		Vizualisation oldVizualisation = vizualisation;
		vizualisation = newVizualisation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.SET_OF_FACTS__VIZUALISATION, oldVizualisation, newVizualisation);
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
	public void setVizualisation(Vizualisation newVizualisation) {
		if (newVizualisation != vizualisation) {
			NotificationChain msgs = null;
			if (vizualisation != null)
				msgs = ((InternalEObject) vizualisation).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.SET_OF_FACTS__VIZUALISATION, null, msgs);
			if (newVizualisation != null)
				msgs = ((InternalEObject) newVizualisation).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.SET_OF_FACTS__VIZUALISATION, null, msgs);
			msgs = basicSetVizualisation(newVizualisation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.SET_OF_FACTS__VIZUALISATION,
					newVizualisation, newVizualisation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GeneratorPackage.SET_OF_FACTS__FACTS:
			return ((InternalEList<?>) getFacts()).basicRemove(otherEnd, msgs);
		case GeneratorPackage.SET_OF_FACTS__VIZUALISATION:
			return basicSetVizualisation(null, msgs);
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
		case GeneratorPackage.SET_OF_FACTS__FACTS:
			return getFacts();
		case GeneratorPackage.SET_OF_FACTS__NAME:
			return getName();
		case GeneratorPackage.SET_OF_FACTS__VIZUALISATION:
			return getVizualisation();
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
		case GeneratorPackage.SET_OF_FACTS__FACTS:
			getFacts().clear();
			getFacts().addAll((Collection<? extends AbstractFact>) newValue);
			return;
		case GeneratorPackage.SET_OF_FACTS__NAME:
			setName((String) newValue);
			return;
		case GeneratorPackage.SET_OF_FACTS__VIZUALISATION:
			setVizualisation((Vizualisation) newValue);
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
		case GeneratorPackage.SET_OF_FACTS__FACTS:
			getFacts().clear();
			return;
		case GeneratorPackage.SET_OF_FACTS__NAME:
			setName(NAME_EDEFAULT);
			return;
		case GeneratorPackage.SET_OF_FACTS__VIZUALISATION:
			setVizualisation((Vizualisation) null);
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
		case GeneratorPackage.SET_OF_FACTS__FACTS:
			return facts != null && !facts.isEmpty();
		case GeneratorPackage.SET_OF_FACTS__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case GeneratorPackage.SET_OF_FACTS__VIZUALISATION:
			return vizualisation != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //SetOfFactsImpl
