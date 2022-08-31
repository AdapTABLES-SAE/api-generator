/**
 */
package generator.impl;

import generator.GameContext;
import generator.GenerationContext;
import generator.GeneratorPackage;
import generator.LearnerPlayer;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generation Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.GenerationContextImpl#getGamecontext <em>Gamecontext</em>}</li>
 *   <li>{@link generator.impl.GenerationContextImpl#getLearnerplayer <em>Learnerplayer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GenerationContextImpl extends MinimalEObjectImpl.Container implements GenerationContext {
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
	 * The cached value of the '{@link #getLearnerplayer() <em>Learnerplayer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLearnerplayer()
	 * @generated
	 * @ordered
	 */
	protected LearnerPlayer learnerplayer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenerationContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.GENERATION_CONTEXT;
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
					GeneratorPackage.GENERATION_CONTEXT__GAMECONTEXT, oldGamecontext, newGamecontext);
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
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.GENERATION_CONTEXT__GAMECONTEXT, null, msgs);
			if (newGamecontext != null)
				msgs = ((InternalEObject) newGamecontext).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.GENERATION_CONTEXT__GAMECONTEXT, null, msgs);
			msgs = basicSetGamecontext(newGamecontext, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.GENERATION_CONTEXT__GAMECONTEXT,
					newGamecontext, newGamecontext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LearnerPlayer getLearnerplayer() {
		return learnerplayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLearnerplayer(LearnerPlayer newLearnerplayer, NotificationChain msgs) {
		LearnerPlayer oldLearnerplayer = learnerplayer;
		learnerplayer = newLearnerplayer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.GENERATION_CONTEXT__LEARNERPLAYER, oldLearnerplayer, newLearnerplayer);
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
	public void setLearnerplayer(LearnerPlayer newLearnerplayer) {
		if (newLearnerplayer != learnerplayer) {
			NotificationChain msgs = null;
			if (learnerplayer != null)
				msgs = ((InternalEObject) learnerplayer).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.GENERATION_CONTEXT__LEARNERPLAYER, null, msgs);
			if (newLearnerplayer != null)
				msgs = ((InternalEObject) newLearnerplayer).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.GENERATION_CONTEXT__LEARNERPLAYER, null, msgs);
			msgs = basicSetLearnerplayer(newLearnerplayer, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.GENERATION_CONTEXT__LEARNERPLAYER,
					newLearnerplayer, newLearnerplayer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GeneratorPackage.GENERATION_CONTEXT__GAMECONTEXT:
			return basicSetGamecontext(null, msgs);
		case GeneratorPackage.GENERATION_CONTEXT__LEARNERPLAYER:
			return basicSetLearnerplayer(null, msgs);
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
		case GeneratorPackage.GENERATION_CONTEXT__GAMECONTEXT:
			return getGamecontext();
		case GeneratorPackage.GENERATION_CONTEXT__LEARNERPLAYER:
			return getLearnerplayer();
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
		case GeneratorPackage.GENERATION_CONTEXT__GAMECONTEXT:
			setGamecontext((GameContext) newValue);
			return;
		case GeneratorPackage.GENERATION_CONTEXT__LEARNERPLAYER:
			setLearnerplayer((LearnerPlayer) newValue);
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
		case GeneratorPackage.GENERATION_CONTEXT__GAMECONTEXT:
			setGamecontext((GameContext) null);
			return;
		case GeneratorPackage.GENERATION_CONTEXT__LEARNERPLAYER:
			setLearnerplayer((LearnerPlayer) null);
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
		case GeneratorPackage.GENERATION_CONTEXT__GAMECONTEXT:
			return gamecontext != null;
		case GeneratorPackage.GENERATION_CONTEXT__LEARNERPLAYER:
			return learnerplayer != null;
		}
		return super.eIsSet(featureID);
	}

} //GenerationContextImpl
