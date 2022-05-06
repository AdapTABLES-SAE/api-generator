/**
 */
package generatorMetamodels.impl;

import generatorMetamodels.GeneratorMetamodelsPackage;
import generatorMetamodels.RoomType;
import generatorMetamodels.SimpleQuestionRoom;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Question Room</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generatorMetamodels.impl.SimpleQuestionRoomImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimpleQuestionRoomImpl extends QuestionRoomImpl implements SimpleQuestionRoom {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final RoomType TYPE_EDEFAULT = RoomType.SIMPLE_QUESTION;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleQuestionRoomImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorMetamodelsPackage.Literals.SIMPLE_QUESTION_ROOM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomType getType() {
		// TODO: implement this method to return the 'Type' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetType() {
		// TODO: implement this method to return whether the 'Type' attribute is set
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GeneratorMetamodelsPackage.SIMPLE_QUESTION_ROOM__TYPE:
			return getType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case GeneratorMetamodelsPackage.SIMPLE_QUESTION_ROOM__TYPE:
			return isSetType();
		}
		return super.eIsSet(featureID);
	}

} //SimpleQuestionRoomImpl
