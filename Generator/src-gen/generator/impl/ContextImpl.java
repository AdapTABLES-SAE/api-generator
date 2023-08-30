/**
 */
package generator.impl;

import generator.Context;
import generator.GameContext;
import generator.GeneratorPackage;
import generator.LearnerPlayers;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.ContextImpl#getGamecontext <em>Gamecontext</em>}</li>
 *   <li>{@link generator.impl.ContextImpl#getID <em>ID</em>}</li>
 *   <li>{@link generator.impl.ContextImpl#getLearnerPlayers <em>Learner Players</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContextImpl extends MinimalEObjectImpl.Container implements Context {
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
	 * The cached value of the '{@link #getLearnerPlayers() <em>Learner Players</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLearnerPlayers()
	 * @generated
	 * @ordered
	 */
	protected LearnerPlayers learnerPlayers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.CONTEXT;
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
					GeneratorPackage.CONTEXT__GAMECONTEXT, oldGamecontext, newGamecontext);
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
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.CONTEXT__GAMECONTEXT, null, msgs);
			if (newGamecontext != null)
				msgs = ((InternalEObject) newGamecontext).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.CONTEXT__GAMECONTEXT, null, msgs);
			msgs = basicSetGamecontext(newGamecontext, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.CONTEXT__GAMECONTEXT, newGamecontext,
					newGamecontext));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.CONTEXT__ID, oldID, id, !oldIDESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, GeneratorPackage.CONTEXT__ID, oldID, ID_EDEFAULT,
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
	public LearnerPlayers getLearnerPlayers() {
		return learnerPlayers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLearnerPlayers(LearnerPlayers newLearnerPlayers, NotificationChain msgs) {
		LearnerPlayers oldLearnerPlayers = learnerPlayers;
		learnerPlayers = newLearnerPlayers;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.CONTEXT__LEARNER_PLAYERS, oldLearnerPlayers, newLearnerPlayers);
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
	public void setLearnerPlayers(LearnerPlayers newLearnerPlayers) {
		if (newLearnerPlayers != learnerPlayers) {
			NotificationChain msgs = null;
			if (learnerPlayers != null)
				msgs = ((InternalEObject) learnerPlayers).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.CONTEXT__LEARNER_PLAYERS, null, msgs);
			if (newLearnerPlayers != null)
				msgs = ((InternalEObject) newLearnerPlayers).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.CONTEXT__LEARNER_PLAYERS, null, msgs);
			msgs = basicSetLearnerPlayers(newLearnerPlayers, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.CONTEXT__LEARNER_PLAYERS,
					newLearnerPlayers, newLearnerPlayers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GeneratorPackage.CONTEXT__GAMECONTEXT:
			return basicSetGamecontext(null, msgs);
		case GeneratorPackage.CONTEXT__LEARNER_PLAYERS:
			return basicSetLearnerPlayers(null, msgs);
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
		case GeneratorPackage.CONTEXT__GAMECONTEXT:
			return getGamecontext();
		case GeneratorPackage.CONTEXT__ID:
			return getID();
		case GeneratorPackage.CONTEXT__LEARNER_PLAYERS:
			return getLearnerPlayers();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case GeneratorPackage.CONTEXT__GAMECONTEXT:
			setGamecontext((GameContext) newValue);
			return;
		case GeneratorPackage.CONTEXT__ID:
			setID((String) newValue);
			return;
		case GeneratorPackage.CONTEXT__LEARNER_PLAYERS:
			setLearnerPlayers((LearnerPlayers) newValue);
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
		case GeneratorPackage.CONTEXT__GAMECONTEXT:
			setGamecontext((GameContext) null);
			return;
		case GeneratorPackage.CONTEXT__ID:
			unsetID();
			return;
		case GeneratorPackage.CONTEXT__LEARNER_PLAYERS:
			setLearnerPlayers((LearnerPlayers) null);
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
		case GeneratorPackage.CONTEXT__GAMECONTEXT:
			return gamecontext != null;
		case GeneratorPackage.CONTEXT__ID:
			return isSetID();
		case GeneratorPackage.CONTEXT__LEARNER_PLAYERS:
			return learnerPlayers != null;
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
		result.append(')');
		return result.toString();
	}

} //ContextImpl
