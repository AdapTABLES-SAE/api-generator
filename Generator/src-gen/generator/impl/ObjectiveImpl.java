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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import generator.GeneratorPackage;
import generator.Level;
import generator.Objective;
import generator.Prerequisite;
import generator.SetOfFacts;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Objective</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.ObjectiveImpl#getID <em>ID</em>}</li>
 *   <li>{@link generator.impl.ObjectiveImpl#getName <em>Name</em>}</li>
 *   <li>{@link generator.impl.ObjectiveImpl#getPrerequisites <em>Prerequisites</em>}</li>
 *   <li>{@link generator.impl.ObjectiveImpl#getLevels <em>Levels</em>}</li>
 *   <li>{@link generator.impl.ObjectiveImpl#getSetoffacts <em>Setoffacts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectiveImpl extends MinimalEObjectImpl.Container implements Objective {
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
	 * This is true if the ID attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean idESet;

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
	 * The cached value of the '{@link #getPrerequisites() <em>Prerequisites</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrerequisites()
	 * @generated
	 * @ordered
	 */
	protected EList<Prerequisite> prerequisites;

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
	 * The cached value of the '{@link #getSetoffacts() <em>Setoffacts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetoffacts()
	 * @generated
	 * @ordered
	 */
	protected EList<SetOfFacts> setoffacts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectiveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.OBJECTIVE;
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
		boolean oldIDESet = idESet;
		idESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.OBJECTIVE__ID, oldID, id,
					!oldIDESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetID() {
		String oldID = id;
		boolean oldIDESet = idESet;
		id = ID_EDEFAULT;
		idESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, GeneratorPackage.OBJECTIVE__ID, oldID, ID_EDEFAULT,
					oldIDESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetID() {
		return idESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.OBJECTIVE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Prerequisite> getPrerequisites() {
		if (prerequisites == null) {
			prerequisites = new EObjectContainmentEList<Prerequisite>(Prerequisite.class, this,
					GeneratorPackage.OBJECTIVE__PREREQUISITES);
		}
		return prerequisites;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Level> getLevels() {
		if (levels == null) {
			levels = new EObjectContainmentEList<Level>(Level.class, this, GeneratorPackage.OBJECTIVE__LEVELS);
		}
		return levels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SetOfFacts> getSetoffacts() {
		if (setoffacts == null) {
			setoffacts = new EObjectResolvingEList<SetOfFacts>(SetOfFacts.class, this,
					GeneratorPackage.OBJECTIVE__SETOFFACTS);
		}
		return setoffacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GeneratorPackage.OBJECTIVE__PREREQUISITES:
			return ((InternalEList<?>) getPrerequisites()).basicRemove(otherEnd, msgs);
		case GeneratorPackage.OBJECTIVE__LEVELS:
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
		case GeneratorPackage.OBJECTIVE__ID:
			return getID();
		case GeneratorPackage.OBJECTIVE__NAME:
			return getName();
		case GeneratorPackage.OBJECTIVE__PREREQUISITES:
			return getPrerequisites();
		case GeneratorPackage.OBJECTIVE__LEVELS:
			return getLevels();
		case GeneratorPackage.OBJECTIVE__SETOFFACTS:
			return getSetoffacts();
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
		case GeneratorPackage.OBJECTIVE__ID:
			setID((String) newValue);
			return;
		case GeneratorPackage.OBJECTIVE__NAME:
			setName((String) newValue);
			return;
		case GeneratorPackage.OBJECTIVE__PREREQUISITES:
			getPrerequisites().clear();
			getPrerequisites().addAll((Collection<? extends Prerequisite>) newValue);
			return;
		case GeneratorPackage.OBJECTIVE__LEVELS:
			getLevels().clear();
			getLevels().addAll((Collection<? extends Level>) newValue);
			return;
		case GeneratorPackage.OBJECTIVE__SETOFFACTS:
			getSetoffacts().clear();
			getSetoffacts().addAll((Collection<? extends SetOfFacts>) newValue);
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
		case GeneratorPackage.OBJECTIVE__ID:
			unsetID();
			return;
		case GeneratorPackage.OBJECTIVE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case GeneratorPackage.OBJECTIVE__PREREQUISITES:
			getPrerequisites().clear();
			return;
		case GeneratorPackage.OBJECTIVE__LEVELS:
			getLevels().clear();
			return;
		case GeneratorPackage.OBJECTIVE__SETOFFACTS:
			getSetoffacts().clear();
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
		case GeneratorPackage.OBJECTIVE__ID:
			return isSetID();
		case GeneratorPackage.OBJECTIVE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case GeneratorPackage.OBJECTIVE__PREREQUISITES:
			return prerequisites != null && !prerequisites.isEmpty();
		case GeneratorPackage.OBJECTIVE__LEVELS:
			return levels != null && !levels.isEmpty();
		case GeneratorPackage.OBJECTIVE__SETOFFACTS:
			return setoffacts != null && !setoffacts.isEmpty();
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
		if (idESet)
			result.append(id);
		else
			result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ObjectiveImpl
