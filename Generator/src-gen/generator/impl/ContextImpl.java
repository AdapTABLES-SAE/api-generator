/**
 */
package generator.impl;

import generator.Context;
import generator.GameContext;
import generator.GeneratorPackage;
import generator.LearnerPlayer;

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
 * An implementation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.ContextImpl#getGamecontext <em>Gamecontext</em>}</li>
 *   <li>{@link generator.impl.ContextImpl#getLearnerplayers <em>Learnerplayers</em>}</li>
 *   <li>{@link generator.impl.ContextImpl#getID <em>ID</em>}</li>
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
	 * The cached value of the '{@link #getLearnerplayers() <em>Learnerplayers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLearnerplayers()
	 * @generated
	 * @ordered
	 */
	protected EList<LearnerPlayer> learnerplayers;

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
	public EList<LearnerPlayer> getLearnerplayers() {
		if (learnerplayers == null) {
			learnerplayers = new EObjectContainmentEList<LearnerPlayer>(LearnerPlayer.class, this,
					GeneratorPackage.CONTEXT__LEARNERPLAYERS);
		}
		return learnerplayers;
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GeneratorPackage.CONTEXT__GAMECONTEXT:
			return basicSetGamecontext(null, msgs);
		case GeneratorPackage.CONTEXT__LEARNERPLAYERS:
			return ((InternalEList<?>) getLearnerplayers()).basicRemove(otherEnd, msgs);
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
		case GeneratorPackage.CONTEXT__LEARNERPLAYERS:
			return getLearnerplayers();
		case GeneratorPackage.CONTEXT__ID:
			return getID();
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
		case GeneratorPackage.CONTEXT__GAMECONTEXT:
			setGamecontext((GameContext) newValue);
			return;
		case GeneratorPackage.CONTEXT__LEARNERPLAYERS:
			getLearnerplayers().clear();
			getLearnerplayers().addAll((Collection<? extends LearnerPlayer>) newValue);
			return;
		case GeneratorPackage.CONTEXT__ID:
			setID((String) newValue);
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
		case GeneratorPackage.CONTEXT__LEARNERPLAYERS:
			getLearnerplayers().clear();
			return;
		case GeneratorPackage.CONTEXT__ID:
			unsetID();
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
		case GeneratorPackage.CONTEXT__LEARNERPLAYERS:
			return learnerplayers != null && !learnerplayers.isEmpty();
		case GeneratorPackage.CONTEXT__ID:
			return isSetID();
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
