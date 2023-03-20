/**
 */
package generator.impl;

import generator.Directions;
import generator.GeneratorPackage;
import generator.Position;
import generator.RoomType;

import generator.StatementPosition;
import generator.StructurePosition;
import java.lang.reflect.InvocationTargetException;

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
 * An implementation of the model object '<em><b>Room Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.RoomTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link generator.impl.RoomTypeImpl#getElementPositions <em>Element Positions</em>}</li>
 *   <li>{@link generator.impl.RoomTypeImpl#getStructurePositions <em>Structure Positions</em>}</li>
 *   <li>{@link generator.impl.RoomTypeImpl#getStatementPositions <em>Statement Positions</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class RoomTypeImpl extends MinimalEObjectImpl.Container implements RoomType {
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
	 * The cached value of the '{@link #getElementPositions() <em>Element Positions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementPositions()
	 * @generated
	 * @ordered
	 */
	protected EList<Position> elementPositions;

	/**
	 * The cached value of the '{@link #getStructurePositions() <em>Structure Positions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructurePositions()
	 * @generated
	 * @ordered
	 */
	protected EList<StructurePosition> structurePositions;

	/**
	 * The cached value of the '{@link #getStatementPositions() <em>Statement Positions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatementPositions()
	 * @generated
	 * @ordered
	 */
	protected EList<StatementPosition> statementPositions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.ROOM_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.ROOM_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Position> getElementPositions() {
		if (elementPositions == null) {
			elementPositions = new EObjectContainmentEList<Position>(Position.class, this,
					GeneratorPackage.ROOM_TYPE__ELEMENT_POSITIONS);
		}
		return elementPositions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StructurePosition> getStructurePositions() {
		if (structurePositions == null) {
			structurePositions = new EObjectContainmentEList<StructurePosition>(StructurePosition.class, this,
					GeneratorPackage.ROOM_TYPE__STRUCTURE_POSITIONS);
		}
		return structurePositions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StatementPosition> getStatementPositions() {
		if (statementPositions == null) {
			statementPositions = new EObjectContainmentEList<StatementPosition>(StatementPosition.class, this,
					GeneratorPackage.ROOM_TYPE__STATEMENT_POSITIONS);
		}
		return statementPositions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Directions> getDirections() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GeneratorPackage.ROOM_TYPE__ELEMENT_POSITIONS:
			return ((InternalEList<?>) getElementPositions()).basicRemove(otherEnd, msgs);
		case GeneratorPackage.ROOM_TYPE__STRUCTURE_POSITIONS:
			return ((InternalEList<?>) getStructurePositions()).basicRemove(otherEnd, msgs);
		case GeneratorPackage.ROOM_TYPE__STATEMENT_POSITIONS:
			return ((InternalEList<?>) getStatementPositions()).basicRemove(otherEnd, msgs);
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
		case GeneratorPackage.ROOM_TYPE__NAME:
			return getName();
		case GeneratorPackage.ROOM_TYPE__ELEMENT_POSITIONS:
			return getElementPositions();
		case GeneratorPackage.ROOM_TYPE__STRUCTURE_POSITIONS:
			return getStructurePositions();
		case GeneratorPackage.ROOM_TYPE__STATEMENT_POSITIONS:
			return getStatementPositions();
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
		case GeneratorPackage.ROOM_TYPE__NAME:
			setName((String) newValue);
			return;
		case GeneratorPackage.ROOM_TYPE__ELEMENT_POSITIONS:
			getElementPositions().clear();
			getElementPositions().addAll((Collection<? extends Position>) newValue);
			return;
		case GeneratorPackage.ROOM_TYPE__STRUCTURE_POSITIONS:
			getStructurePositions().clear();
			getStructurePositions().addAll((Collection<? extends StructurePosition>) newValue);
			return;
		case GeneratorPackage.ROOM_TYPE__STATEMENT_POSITIONS:
			getStatementPositions().clear();
			getStatementPositions().addAll((Collection<? extends StatementPosition>) newValue);
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
		case GeneratorPackage.ROOM_TYPE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case GeneratorPackage.ROOM_TYPE__ELEMENT_POSITIONS:
			getElementPositions().clear();
			return;
		case GeneratorPackage.ROOM_TYPE__STRUCTURE_POSITIONS:
			getStructurePositions().clear();
			return;
		case GeneratorPackage.ROOM_TYPE__STATEMENT_POSITIONS:
			getStatementPositions().clear();
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
		case GeneratorPackage.ROOM_TYPE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case GeneratorPackage.ROOM_TYPE__ELEMENT_POSITIONS:
			return elementPositions != null && !elementPositions.isEmpty();
		case GeneratorPackage.ROOM_TYPE__STRUCTURE_POSITIONS:
			return structurePositions != null && !structurePositions.isEmpty();
		case GeneratorPackage.ROOM_TYPE__STATEMENT_POSITIONS:
			return statementPositions != null && !statementPositions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case GeneratorPackage.ROOM_TYPE___GET_DIRECTIONS:
			return getDirections();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(')');
		return result.toString();
	}

} //RoomTypeImpl
