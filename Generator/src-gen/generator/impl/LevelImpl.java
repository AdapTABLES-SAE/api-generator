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

import generator.ATask;
import generator.CompletionCriteria;
import generator.GeneratorPackage;
import generator.Level;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Level</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.LevelImpl#getID <em>ID</em>}</li>
 *   <li>{@link generator.impl.LevelImpl#getTasks <em>Tasks</em>}</li>
 *   <li>{@link generator.impl.LevelImpl#getCompletionCriteria <em>Completion Criteria</em>}</li>
 *   <li>{@link generator.impl.LevelImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class LevelImpl extends MinimalEObjectImpl.Container implements Level {
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
	 * The cached value of the '{@link #getTasks() <em>Tasks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<ATask> tasks;

	/**
	 * The cached value of the '{@link #getCompletionCriteria() <em>Completion Criteria</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompletionCriteria()
	 * @generated
	 * @ordered
	 */
	protected CompletionCriteria completionCriteria;

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
	public LevelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.LEVEL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.LEVEL__ID, oldID, id, !oldIDESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, GeneratorPackage.LEVEL__ID, oldID, ID_EDEFAULT,
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
	public EList<ATask> getTasks() {
		if (tasks == null) {
			tasks = new EObjectContainmentEList<ATask>(ATask.class, this, GeneratorPackage.LEVEL__TASKS);
		}
		return tasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompletionCriteria getCompletionCriteria() {
		return completionCriteria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompletionCriteria(CompletionCriteria newCompletionCriteria,
			NotificationChain msgs) {
		CompletionCriteria oldCompletionCriteria = completionCriteria;
		completionCriteria = newCompletionCriteria;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.LEVEL__COMPLETION_CRITERIA, oldCompletionCriteria, newCompletionCriteria);
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
	public void setCompletionCriteria(CompletionCriteria newCompletionCriteria) {
		if (newCompletionCriteria != completionCriteria) {
			NotificationChain msgs = null;
			if (completionCriteria != null)
				msgs = ((InternalEObject) completionCriteria).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.LEVEL__COMPLETION_CRITERIA, null, msgs);
			if (newCompletionCriteria != null)
				msgs = ((InternalEObject) newCompletionCriteria).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.LEVEL__COMPLETION_CRITERIA, null, msgs);
			msgs = basicSetCompletionCriteria(newCompletionCriteria, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.LEVEL__COMPLETION_CRITERIA,
					newCompletionCriteria, newCompletionCriteria));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.LEVEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GeneratorPackage.LEVEL__TASKS:
			return ((InternalEList<?>) getTasks()).basicRemove(otherEnd, msgs);
		case GeneratorPackage.LEVEL__COMPLETION_CRITERIA:
			return basicSetCompletionCriteria(null, msgs);
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
		case GeneratorPackage.LEVEL__ID:
			return getID();
		case GeneratorPackage.LEVEL__TASKS:
			return getTasks();
		case GeneratorPackage.LEVEL__COMPLETION_CRITERIA:
			return getCompletionCriteria();
		case GeneratorPackage.LEVEL__NAME:
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
		case GeneratorPackage.LEVEL__ID:
			setID((String) newValue);
			return;
		case GeneratorPackage.LEVEL__TASKS:
			getTasks().clear();
			getTasks().addAll((Collection<? extends ATask>) newValue);
			return;
		case GeneratorPackage.LEVEL__COMPLETION_CRITERIA:
			setCompletionCriteria((CompletionCriteria) newValue);
			return;
		case GeneratorPackage.LEVEL__NAME:
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
		case GeneratorPackage.LEVEL__ID:
			unsetID();
			return;
		case GeneratorPackage.LEVEL__TASKS:
			getTasks().clear();
			return;
		case GeneratorPackage.LEVEL__COMPLETION_CRITERIA:
			setCompletionCriteria((CompletionCriteria) null);
			return;
		case GeneratorPackage.LEVEL__NAME:
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
		case GeneratorPackage.LEVEL__ID:
			return isSetID();
		case GeneratorPackage.LEVEL__TASKS:
			return tasks != null && !tasks.isEmpty();
		case GeneratorPackage.LEVEL__COMPLETION_CRITERIA:
			return completionCriteria != null;
		case GeneratorPackage.LEVEL__NAME:
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
		if (idESet)
			result.append(id);
		else
			result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof LevelImpl))
			return false;
		LevelImpl other = (LevelImpl) obj;
		if (completionCriteria == null) {
			if (other.completionCriteria != null)
				return false;
		} else if (!completionCriteria.equals(other.completionCriteria))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (idESet != other.idESet)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (tasks == null) {
			if (other.tasks != null)
				return false;
		} else if (!tasks.equals(other.tasks))
			return false;
		return true;
	}
	
	

} //LevelImpl
