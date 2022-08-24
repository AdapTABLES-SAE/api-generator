/**
 */
package generator.impl;

import generator.ElementType;
import generator.GameContent;
import generator.GameObjective;
import generator.Gameplay;
import generator.GeneratorPackage;
import generator.RoomType2;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Game Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.GameContentImpl#getGameplays <em>Gameplays</em>}</li>
 *   <li>{@link generator.impl.GameContentImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link generator.impl.GameContentImpl#getGameobjectives <em>Gameobjectives</em>}</li>
 *   <li>{@link generator.impl.GameContentImpl#getRoomtype <em>Roomtype</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GameContentImpl extends MinimalEObjectImpl.Container implements GameContent {
	/**
	 * The cached value of the '{@link #getGameplays() <em>Gameplays</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGameplays()
	 * @generated
	 * @ordered
	 */
	protected EList<Gameplay> gameplays;

	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementType> elements;

	/**
	 * The cached value of the '{@link #getGameobjectives() <em>Gameobjectives</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGameobjectives()
	 * @generated
	 * @ordered
	 */
	protected EList<GameObjective> gameobjectives;

	/**
	 * The cached value of the '{@link #getRoomtype() <em>Roomtype</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomtype()
	 * @generated
	 * @ordered
	 */
	protected EList<RoomType2> roomtype;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GameContentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.GAME_CONTENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Gameplay> getGameplays() {
		if (gameplays == null) {
			gameplays = new EObjectContainmentEList<Gameplay>(Gameplay.class, this,
					GeneratorPackage.GAME_CONTENT__GAMEPLAYS);
		}
		return gameplays;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElementType> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<ElementType>(ElementType.class, this,
					GeneratorPackage.GAME_CONTENT__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GameObjective> getGameobjectives() {
		if (gameobjectives == null) {
			gameobjectives = new EObjectContainmentEList<GameObjective>(GameObjective.class, this,
					GeneratorPackage.GAME_CONTENT__GAMEOBJECTIVES);
		}
		return gameobjectives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoomType2> getRoomtype() {
		if (roomtype == null) {
			roomtype = new EObjectContainmentEList<RoomType2>(RoomType2.class, this,
					GeneratorPackage.GAME_CONTENT__ROOMTYPE);
		}
		return roomtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GeneratorPackage.GAME_CONTENT__GAMEPLAYS:
			return ((InternalEList<?>) getGameplays()).basicRemove(otherEnd, msgs);
		case GeneratorPackage.GAME_CONTENT__ELEMENTS:
			return ((InternalEList<?>) getElements()).basicRemove(otherEnd, msgs);
		case GeneratorPackage.GAME_CONTENT__GAMEOBJECTIVES:
			return ((InternalEList<?>) getGameobjectives()).basicRemove(otherEnd, msgs);
		case GeneratorPackage.GAME_CONTENT__ROOMTYPE:
			return ((InternalEList<?>) getRoomtype()).basicRemove(otherEnd, msgs);
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
		case GeneratorPackage.GAME_CONTENT__GAMEPLAYS:
			return getGameplays();
		case GeneratorPackage.GAME_CONTENT__ELEMENTS:
			return getElements();
		case GeneratorPackage.GAME_CONTENT__GAMEOBJECTIVES:
			return getGameobjectives();
		case GeneratorPackage.GAME_CONTENT__ROOMTYPE:
			return getRoomtype();
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
		case GeneratorPackage.GAME_CONTENT__GAMEPLAYS:
			getGameplays().clear();
			getGameplays().addAll((Collection<? extends Gameplay>) newValue);
			return;
		case GeneratorPackage.GAME_CONTENT__ELEMENTS:
			getElements().clear();
			getElements().addAll((Collection<? extends ElementType>) newValue);
			return;
		case GeneratorPackage.GAME_CONTENT__GAMEOBJECTIVES:
			getGameobjectives().clear();
			getGameobjectives().addAll((Collection<? extends GameObjective>) newValue);
			return;
		case GeneratorPackage.GAME_CONTENT__ROOMTYPE:
			getRoomtype().clear();
			getRoomtype().addAll((Collection<? extends RoomType2>) newValue);
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
		case GeneratorPackage.GAME_CONTENT__GAMEPLAYS:
			getGameplays().clear();
			return;
		case GeneratorPackage.GAME_CONTENT__ELEMENTS:
			getElements().clear();
			return;
		case GeneratorPackage.GAME_CONTENT__GAMEOBJECTIVES:
			getGameobjectives().clear();
			return;
		case GeneratorPackage.GAME_CONTENT__ROOMTYPE:
			getRoomtype().clear();
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
		case GeneratorPackage.GAME_CONTENT__GAMEPLAYS:
			return gameplays != null && !gameplays.isEmpty();
		case GeneratorPackage.GAME_CONTENT__ELEMENTS:
			return elements != null && !elements.isEmpty();
		case GeneratorPackage.GAME_CONTENT__GAMEOBJECTIVES:
			return gameobjectives != null && !gameobjectives.isEmpty();
		case GeneratorPackage.GAME_CONTENT__ROOMTYPE:
			return roomtype != null && !roomtype.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GameContentImpl
