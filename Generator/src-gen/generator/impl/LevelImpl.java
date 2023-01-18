/**
 */
package generator.impl;

import generator.ATask;
import generator.GeneratorPackage;
import generator.Level;
import generator.Prerequisite;

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
 * An implementation of the model object '<em><b>Level</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.LevelImpl#getID <em>ID</em>}</li>
 *   <li>{@link generator.impl.LevelImpl#getTasks <em>Tasks</em>}</li>
 *   <li>{@link generator.impl.LevelImpl#getPrerequisite <em>Prerequisite</em>}</li>
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
	 * The cached value of the '{@link #getTasks() <em>Tasks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<ATask> tasks;

	/**
	 * The cached value of the '{@link #getPrerequisite() <em>Prerequisite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrerequisite()
	 * @generated
	 * @ordered
	 */
	protected Prerequisite prerequisite;

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
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.LEVEL__ID, oldID, id));
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
	public Prerequisite getPrerequisite() {
		return prerequisite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrerequisite(Prerequisite newPrerequisite, NotificationChain msgs) {
		Prerequisite oldPrerequisite = prerequisite;
		prerequisite = newPrerequisite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.LEVEL__PREREQUISITE, oldPrerequisite, newPrerequisite);
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
	public void setPrerequisite(Prerequisite newPrerequisite) {
		if (newPrerequisite != prerequisite) {
			NotificationChain msgs = null;
			if (prerequisite != null)
				msgs = ((InternalEObject) prerequisite).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.LEVEL__PREREQUISITE, null, msgs);
			if (newPrerequisite != null)
				msgs = ((InternalEObject) newPrerequisite).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.LEVEL__PREREQUISITE, null, msgs);
			msgs = basicSetPrerequisite(newPrerequisite, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.LEVEL__PREREQUISITE, newPrerequisite,
					newPrerequisite));
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
		case GeneratorPackage.LEVEL__PREREQUISITE:
			return basicSetPrerequisite(null, msgs);
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
		case GeneratorPackage.LEVEL__PREREQUISITE:
			return getPrerequisite();
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
		case GeneratorPackage.LEVEL__PREREQUISITE:
			setPrerequisite((Prerequisite) newValue);
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
			setID(ID_EDEFAULT);
			return;
		case GeneratorPackage.LEVEL__TASKS:
			getTasks().clear();
			return;
		case GeneratorPackage.LEVEL__PREREQUISITE:
			setPrerequisite((Prerequisite) null);
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
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case GeneratorPackage.LEVEL__TASKS:
			return tasks != null && !tasks.isEmpty();
		case GeneratorPackage.LEVEL__PREREQUISITE:
			return prerequisite != null;
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
		result.append(')');
		return result.toString();
	}

} //LevelImpl
