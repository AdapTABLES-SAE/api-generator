/**
 */
package generatorMetamodels.impl;

import generatorMetamodels.GeneratorMetamodelsPackage;
import generatorMetamodels.Knowledge;
import generatorMetamodels.LearningObjective;
import generatorMetamodels.LearningPath;

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
 * An implementation of the model object '<em><b>Learning Path</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generatorMetamodels.impl.LearningPathImpl#getLearningobjectives <em>Learningobjectives</em>}</li>
 *   <li>{@link generatorMetamodels.impl.LearningPathImpl#getKnowledge <em>Knowledge</em>}</li>
 *   <li>{@link generatorMetamodels.impl.LearningPathImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LearningPathImpl extends MinimalEObjectImpl.Container implements LearningPath {
	/**
	 * The cached value of the '{@link #getLearningobjectives() <em>Learningobjectives</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLearningobjectives()
	 * @generated
	 * @ordered
	 */
	protected EList<LearningObjective> learningobjectives;

	/**
	 * The cached value of the '{@link #getKnowledge() <em>Knowledge</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKnowledge()
	 * @generated
	 * @ordered
	 */
	protected Knowledge knowledge;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LearningPathImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorMetamodelsPackage.Literals.LEARNING_PATH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LearningObjective> getLearningobjectives() {
		if (learningobjectives == null) {
			learningobjectives = new EObjectContainmentEList<LearningObjective>(LearningObjective.class, this,
					GeneratorMetamodelsPackage.LEARNING_PATH__LEARNINGOBJECTIVES);
		}
		return learningobjectives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Knowledge getKnowledge() {
		if (knowledge != null && knowledge.eIsProxy()) {
			InternalEObject oldKnowledge = (InternalEObject) knowledge;
			knowledge = (Knowledge) eResolveProxy(oldKnowledge);
			if (knowledge != oldKnowledge) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							GeneratorMetamodelsPackage.LEARNING_PATH__KNOWLEDGE, oldKnowledge, knowledge));
			}
		}
		return knowledge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Knowledge basicGetKnowledge() {
		return knowledge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKnowledge(Knowledge newKnowledge) {
		Knowledge oldKnowledge = knowledge;
		knowledge = newKnowledge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorMetamodelsPackage.LEARNING_PATH__KNOWLEDGE,
					oldKnowledge, knowledge));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorMetamodelsPackage.LEARNING_PATH__NAME,
					oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GeneratorMetamodelsPackage.LEARNING_PATH__LEARNINGOBJECTIVES:
			return ((InternalEList<?>) getLearningobjectives()).basicRemove(otherEnd, msgs);
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
		case GeneratorMetamodelsPackage.LEARNING_PATH__LEARNINGOBJECTIVES:
			return getLearningobjectives();
		case GeneratorMetamodelsPackage.LEARNING_PATH__KNOWLEDGE:
			if (resolve)
				return getKnowledge();
			return basicGetKnowledge();
		case GeneratorMetamodelsPackage.LEARNING_PATH__NAME:
			return getName();
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
		case GeneratorMetamodelsPackage.LEARNING_PATH__LEARNINGOBJECTIVES:
			getLearningobjectives().clear();
			getLearningobjectives().addAll((Collection<? extends LearningObjective>) newValue);
			return;
		case GeneratorMetamodelsPackage.LEARNING_PATH__KNOWLEDGE:
			setKnowledge((Knowledge) newValue);
			return;
		case GeneratorMetamodelsPackage.LEARNING_PATH__NAME:
			setName((String) newValue);
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
		case GeneratorMetamodelsPackage.LEARNING_PATH__LEARNINGOBJECTIVES:
			getLearningobjectives().clear();
			return;
		case GeneratorMetamodelsPackage.LEARNING_PATH__KNOWLEDGE:
			setKnowledge((Knowledge) null);
			return;
		case GeneratorMetamodelsPackage.LEARNING_PATH__NAME:
			setName(NAME_EDEFAULT);
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
		case GeneratorMetamodelsPackage.LEARNING_PATH__LEARNINGOBJECTIVES:
			return learningobjectives != null && !learningobjectives.isEmpty();
		case GeneratorMetamodelsPackage.LEARNING_PATH__KNOWLEDGE:
			return knowledge != null;
		case GeneratorMetamodelsPackage.LEARNING_PATH__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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

} //LearningPathImpl
