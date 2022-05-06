/**
 */
package generatorMetamodels.impl;

import generatorMetamodels.AbstractFact;
import generatorMetamodels.GeneratorMetamodelsPackage;
import generatorMetamodels.Knowledge;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Knowledge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generatorMetamodels.impl.KnowledgeImpl#getName <em>Name</em>}</li>
 *   <li>{@link generatorMetamodels.impl.KnowledgeImpl#getKnowledgefacts <em>Knowledgefacts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KnowledgeImpl extends MinimalEObjectImpl.Container implements Knowledge {
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
	 * The cached value of the '{@link #getKnowledgefacts() <em>Knowledgefacts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKnowledgefacts()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractFact> knowledgefacts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KnowledgeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorMetamodelsPackage.Literals.KNOWLEDGE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorMetamodelsPackage.KNOWLEDGE__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractFact> getKnowledgefacts() {
		if (knowledgefacts == null) {
			knowledgefacts = new EObjectContainmentEList<AbstractFact>(AbstractFact.class, this,
					GeneratorMetamodelsPackage.KNOWLEDGE__KNOWLEDGEFACTS);
		}
		return knowledgefacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GeneratorMetamodelsPackage.KNOWLEDGE__KNOWLEDGEFACTS:
			return ((InternalEList<?>) getKnowledgefacts()).basicRemove(otherEnd, msgs);
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
		case GeneratorMetamodelsPackage.KNOWLEDGE__NAME:
			return getName();
		case GeneratorMetamodelsPackage.KNOWLEDGE__KNOWLEDGEFACTS:
			return getKnowledgefacts();
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
		case GeneratorMetamodelsPackage.KNOWLEDGE__NAME:
			setName((String) newValue);
			return;
		case GeneratorMetamodelsPackage.KNOWLEDGE__KNOWLEDGEFACTS:
			getKnowledgefacts().clear();
			getKnowledgefacts().addAll((Collection<? extends AbstractFact>) newValue);
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
		case GeneratorMetamodelsPackage.KNOWLEDGE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case GeneratorMetamodelsPackage.KNOWLEDGE__KNOWLEDGEFACTS:
			getKnowledgefacts().clear();
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
		case GeneratorMetamodelsPackage.KNOWLEDGE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case GeneratorMetamodelsPackage.KNOWLEDGE__KNOWLEDGEFACTS:
			return knowledgefacts != null && !knowledgefacts.isEmpty();
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

} //KnowledgeImpl
