/**
 */
package generatorMetamodels.impl;

import generatorMetamodels.GeneratorMetamodelsPackage;
import generatorMetamodels.LearningObjective;
import generatorMetamodels.Level;
import generatorMetamodels.SetOfFacts;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Learning Objective</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generatorMetamodels.impl.LearningObjectiveImpl#getLevels <em>Levels</em>}</li>
 *   <li>{@link generatorMetamodels.impl.LearningObjectiveImpl#getPrerequisites <em>Prerequisites</em>}</li>
 *   <li>{@link generatorMetamodels.impl.LearningObjectiveImpl#getSetoffacts <em>Setoffacts</em>}</li>
 *   <li>{@link generatorMetamodels.impl.LearningObjectiveImpl#getID <em>ID</em>}</li>
 *   <li>{@link generatorMetamodels.impl.LearningObjectiveImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LearningObjectiveImpl extends MinimalEObjectImpl.Container implements LearningObjective {
	/**
	 * The cached value of the '{@link #getLevels() <em>Levels</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevels()
	 * @generated
	 * @ordered
	 */
	protected EList<Level> levels;

	/**
	 * The cached value of the '{@link #getPrerequisites() <em>Prerequisites</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrerequisites()
	 * @generated
	 * @ordered
	 */
	protected EList<Level> prerequisites;

	/**
	 * The cached value of the '{@link #getSetoffacts() <em>Setoffacts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetoffacts()
	 * @generated
	 * @ordered
	 */
	protected EList<SetOfFacts> setoffacts;

	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

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
	protected LearningObjectiveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorMetamodelsPackage.Literals.LEARNING_OBJECTIVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Level> getLevels() {
		if (levels == null) {
			levels = new EObjectContainmentEList<Level>(Level.class, this,
					GeneratorMetamodelsPackage.LEARNING_OBJECTIVE__LEVELS);
		}
		return levels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Level> getPrerequisites() {
		if (prerequisites == null) {
			prerequisites = new EObjectResolvingEList<Level>(Level.class, this,
					GeneratorMetamodelsPackage.LEARNING_OBJECTIVE__PREREQUISITES);
		}
		return prerequisites;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SetOfFacts> getSetoffacts() {
		if (setoffacts == null) {
			setoffacts = new EObjectResolvingEList<SetOfFacts>(SetOfFacts.class, this,
					GeneratorMetamodelsPackage.LEARNING_OBJECTIVE__SETOFFACTS);
		}
		return setoffacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getID() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID(String newID) {
		String oldID = id;
		id = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorMetamodelsPackage.LEARNING_OBJECTIVE__ID,
					oldID, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorMetamodelsPackage.LEARNING_OBJECTIVE__NAME,
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
		case GeneratorMetamodelsPackage.LEARNING_OBJECTIVE__LEVELS:
			return ((InternalEList<?>) getLevels()).basicRemove(otherEnd, msgs);
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
		case GeneratorMetamodelsPackage.LEARNING_OBJECTIVE__LEVELS:
			return getLevels();
		case GeneratorMetamodelsPackage.LEARNING_OBJECTIVE__PREREQUISITES:
			return getPrerequisites();
		case GeneratorMetamodelsPackage.LEARNING_OBJECTIVE__SETOFFACTS:
			return getSetoffacts();
		case GeneratorMetamodelsPackage.LEARNING_OBJECTIVE__ID:
			return getID();
		case GeneratorMetamodelsPackage.LEARNING_OBJECTIVE__NAME:
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
		case GeneratorMetamodelsPackage.LEARNING_OBJECTIVE__LEVELS:
			getLevels().clear();
			getLevels().addAll((Collection<? extends Level>) newValue);
			return;
		case GeneratorMetamodelsPackage.LEARNING_OBJECTIVE__PREREQUISITES:
			getPrerequisites().clear();
			getPrerequisites().addAll((Collection<? extends Level>) newValue);
			return;
		case GeneratorMetamodelsPackage.LEARNING_OBJECTIVE__SETOFFACTS:
			getSetoffacts().clear();
			getSetoffacts().addAll((Collection<? extends SetOfFacts>) newValue);
			return;
		case GeneratorMetamodelsPackage.LEARNING_OBJECTIVE__ID:
			setID((String) newValue);
			return;
		case GeneratorMetamodelsPackage.LEARNING_OBJECTIVE__NAME:
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
		case GeneratorMetamodelsPackage.LEARNING_OBJECTIVE__LEVELS:
			getLevels().clear();
			return;
		case GeneratorMetamodelsPackage.LEARNING_OBJECTIVE__PREREQUISITES:
			getPrerequisites().clear();
			return;
		case GeneratorMetamodelsPackage.LEARNING_OBJECTIVE__SETOFFACTS:
			getSetoffacts().clear();
			return;
		case GeneratorMetamodelsPackage.LEARNING_OBJECTIVE__ID:
			setID(ID_EDEFAULT);
			return;
		case GeneratorMetamodelsPackage.LEARNING_OBJECTIVE__NAME:
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
		case GeneratorMetamodelsPackage.LEARNING_OBJECTIVE__LEVELS:
			return levels != null && !levels.isEmpty();
		case GeneratorMetamodelsPackage.LEARNING_OBJECTIVE__PREREQUISITES:
			return prerequisites != null && !prerequisites.isEmpty();
		case GeneratorMetamodelsPackage.LEARNING_OBJECTIVE__SETOFFACTS:
			return setoffacts != null && !setoffacts.isEmpty();
		case GeneratorMetamodelsPackage.LEARNING_OBJECTIVE__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case GeneratorMetamodelsPackage.LEARNING_OBJECTIVE__NAME:
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
		result.append(" (ID: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //LearningObjectiveImpl
