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

import generator.AComponent;
import generator.Gameplay;
import generator.GeneratorPackage;
import generator.Prompt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gameplay</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.GameplayImpl#getName <em>Name</em>}</li>
 *   <li>{@link generator.impl.GameplayImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link generator.impl.GameplayImpl#getPrompt <em>Prompt</em>}</li>
 *   <li>{@link generator.impl.GameplayImpl#isUndoable <em>Undoable</em>}</li>
 *   <li>{@link generator.impl.GameplayImpl#isLocked <em>Locked</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class GameplayImpl extends MinimalEObjectImpl.Container implements Gameplay {
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
	 * The cached value of the '{@link #getComponents() <em>Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<AComponent> components;

	/**
	 * The cached value of the '{@link #getPrompt() <em>Prompt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrompt()
	 * @generated
	 * @ordered
	 */
	protected Prompt prompt;

	/**
	 * The default value of the '{@link #isUndoable() <em>Undoable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUndoable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UNDOABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUndoable() <em>Undoable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUndoable()
	 * @generated
	 * @ordered
	 */
	protected boolean undoable = UNDOABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isLocked() <em>Locked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLocked()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LOCKED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLocked() <em>Locked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLocked()
	 * @generated
	 * @ordered
	 */
	protected boolean locked = LOCKED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GameplayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.GAMEPLAY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.GAMEPLAY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AComponent> getComponents() {
		if (components == null) {
			components = new EObjectContainmentEList<AComponent>(AComponent.class, this,
					GeneratorPackage.GAMEPLAY__COMPONENTS);
		}
		return components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Prompt getPrompt() {
		return prompt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrompt(Prompt newPrompt, NotificationChain msgs) {
		Prompt oldPrompt = prompt;
		prompt = newPrompt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.GAMEPLAY__PROMPT, oldPrompt, newPrompt);
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
	public void setPrompt(Prompt newPrompt) {
		if (newPrompt != prompt) {
			NotificationChain msgs = null;
			if (prompt != null)
				msgs = ((InternalEObject) prompt).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.GAMEPLAY__PROMPT, null, msgs);
			if (newPrompt != null)
				msgs = ((InternalEObject) newPrompt).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.GAMEPLAY__PROMPT, null, msgs);
			msgs = basicSetPrompt(newPrompt, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.GAMEPLAY__PROMPT, newPrompt,
					newPrompt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUndoable() {
		return undoable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUndoable(boolean newUndoable) {
		boolean oldUndoable = undoable;
		undoable = newUndoable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.GAMEPLAY__UNDOABLE, oldUndoable,
					undoable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLocked() {
		return locked;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocked(boolean newLocked) {
		boolean oldLocked = locked;
		locked = newLocked;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.GAMEPLAY__LOCKED, oldLocked,
					locked));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GeneratorPackage.GAMEPLAY__COMPONENTS:
			return ((InternalEList<?>) getComponents()).basicRemove(otherEnd, msgs);
		case GeneratorPackage.GAMEPLAY__PROMPT:
			return basicSetPrompt(null, msgs);
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
		case GeneratorPackage.GAMEPLAY__NAME:
			return getName();
		case GeneratorPackage.GAMEPLAY__COMPONENTS:
			return getComponents();
		case GeneratorPackage.GAMEPLAY__PROMPT:
			return getPrompt();
		case GeneratorPackage.GAMEPLAY__UNDOABLE:
			return isUndoable();
		case GeneratorPackage.GAMEPLAY__LOCKED:
			return isLocked();
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
		case GeneratorPackage.GAMEPLAY__NAME:
			setName((String) newValue);
			return;
		case GeneratorPackage.GAMEPLAY__COMPONENTS:
			getComponents().clear();
			getComponents().addAll((Collection<? extends AComponent>) newValue);
			return;
		case GeneratorPackage.GAMEPLAY__PROMPT:
			setPrompt((Prompt) newValue);
			return;
		case GeneratorPackage.GAMEPLAY__UNDOABLE:
			setUndoable((Boolean) newValue);
			return;
		case GeneratorPackage.GAMEPLAY__LOCKED:
			setLocked((Boolean) newValue);
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
		case GeneratorPackage.GAMEPLAY__NAME:
			setName(NAME_EDEFAULT);
			return;
		case GeneratorPackage.GAMEPLAY__COMPONENTS:
			getComponents().clear();
			return;
		case GeneratorPackage.GAMEPLAY__PROMPT:
			setPrompt((Prompt) null);
			return;
		case GeneratorPackage.GAMEPLAY__UNDOABLE:
			setUndoable(UNDOABLE_EDEFAULT);
			return;
		case GeneratorPackage.GAMEPLAY__LOCKED:
			setLocked(LOCKED_EDEFAULT);
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
		case GeneratorPackage.GAMEPLAY__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case GeneratorPackage.GAMEPLAY__COMPONENTS:
			return components != null && !components.isEmpty();
		case GeneratorPackage.GAMEPLAY__PROMPT:
			return prompt != null;
		case GeneratorPackage.GAMEPLAY__UNDOABLE:
			return undoable != UNDOABLE_EDEFAULT;
		case GeneratorPackage.GAMEPLAY__LOCKED:
			return locked != LOCKED_EDEFAULT;
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
		result.append(", undoable: ");
		result.append(undoable);
		result.append(", locked: ");
		result.append(locked);
		result.append(')');
		return result.toString();
	}

} //GameplayImpl
