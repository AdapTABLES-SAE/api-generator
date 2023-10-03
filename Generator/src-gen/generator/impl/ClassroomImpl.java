/**
 */
package generator.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import generator.Classroom;
import generator.GameContext;
import generator.GeneratorPackage;
import generator.LearnerPlayer;
import java.util.Collection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Classroom</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.ClassroomImpl#getGamecontext <em>Gamecontext</em>}</li>
 *   <li>{@link generator.impl.ClassroomImpl#getID <em>ID</em>}</li>
 *   <li>{@link generator.impl.ClassroomImpl#getName <em>Name</em>}</li>
 *   <li>{@link generator.impl.ClassroomImpl#getLearnerPlayers <em>Learner Players</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassroomImpl extends MinimalEObjectImpl.Container implements Classroom {
	/**
	 * The cached value of the '{@link #getGamecontext() <em>Gamecontext</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGamecontext()
	 * @generated
	 * @ordered
	 */
	protected GameContext gamecontext;

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
	 * The cached value of the '{@link #getLearnerPlayers() <em>Learner Players</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLearnerPlayers()
	 * @generated
	 * @ordered
	 */
	protected EList<LearnerPlayer> learnerPlayers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassroomImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.CLASSROOM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GameContext getGamecontext() {
		return gamecontext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGamecontext(GameContext newGamecontext, NotificationChain msgs) {
		GameContext oldGamecontext = gamecontext;
		gamecontext = newGamecontext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.CLASSROOM__GAMECONTEXT, oldGamecontext, newGamecontext);
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
	public void setGamecontext(GameContext newGamecontext) {
		if (newGamecontext != gamecontext) {
			NotificationChain msgs = null;
			if (gamecontext != null)
				msgs = ((InternalEObject) gamecontext).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.CLASSROOM__GAMECONTEXT, null, msgs);
			if (newGamecontext != null)
				msgs = ((InternalEObject) newGamecontext).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.CLASSROOM__GAMECONTEXT, null, msgs);
			msgs = basicSetGamecontext(newGamecontext, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.CLASSROOM__GAMECONTEXT,
					newGamecontext, newGamecontext));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.CLASSROOM__ID, oldID, id,
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, GeneratorPackage.CLASSROOM__ID, oldID, ID_EDEFAULT,
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
	public EList<LearnerPlayer> getLearnerPlayers() {
		if (learnerPlayers == null) {
			learnerPlayers = new EObjectResolvingEList<LearnerPlayer>(LearnerPlayer.class, this,
					GeneratorPackage.CLASSROOM__LEARNER_PLAYERS);
		}
		return learnerPlayers;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.CLASSROOM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GeneratorPackage.CLASSROOM__GAMECONTEXT:
			return basicSetGamecontext(null, msgs);
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
		case GeneratorPackage.CLASSROOM__GAMECONTEXT:
			return getGamecontext();
		case GeneratorPackage.CLASSROOM__ID:
			return getID();
		case GeneratorPackage.CLASSROOM__NAME:
			return getName();
		case GeneratorPackage.CLASSROOM__LEARNER_PLAYERS:
			return getLearnerPlayers();
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
		case GeneratorPackage.CLASSROOM__GAMECONTEXT:
			setGamecontext((GameContext) newValue);
			return;
		case GeneratorPackage.CLASSROOM__ID:
			setID((String) newValue);
			return;
		case GeneratorPackage.CLASSROOM__NAME:
			setName((String) newValue);
			return;
		case GeneratorPackage.CLASSROOM__LEARNER_PLAYERS:
			getLearnerPlayers().clear();
			getLearnerPlayers().addAll((Collection<? extends LearnerPlayer>) newValue);
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
		case GeneratorPackage.CLASSROOM__GAMECONTEXT:
			setGamecontext((GameContext) null);
			return;
		case GeneratorPackage.CLASSROOM__ID:
			unsetID();
			return;
		case GeneratorPackage.CLASSROOM__NAME:
			setName(NAME_EDEFAULT);
			return;
		case GeneratorPackage.CLASSROOM__LEARNER_PLAYERS:
			getLearnerPlayers().clear();
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
		case GeneratorPackage.CLASSROOM__GAMECONTEXT:
			return gamecontext != null;
		case GeneratorPackage.CLASSROOM__ID:
			return isSetID();
		case GeneratorPackage.CLASSROOM__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case GeneratorPackage.CLASSROOM__LEARNER_PLAYERS:
			return learnerPlayers != null && !learnerPlayers.isEmpty();
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

} //ClassroomImpl
