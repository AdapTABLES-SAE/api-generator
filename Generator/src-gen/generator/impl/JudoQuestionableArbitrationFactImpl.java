/**
 */
package generator.impl;

import generator.GeneratorPackage;
import generator.JudoQuestionableArbitrationFact;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Judo Questionable Arbitration Fact</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.JudoQuestionableArbitrationFactImpl#getName <em>Name</em>}</li>
 *   <li>{@link generator.impl.JudoQuestionableArbitrationFactImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link generator.impl.JudoQuestionableArbitrationFactImpl#getRepresentationID <em>Representation ID</em>}</li>
 *   <li>{@link generator.impl.JudoQuestionableArbitrationFactImpl#getNameSoluce <em>Name Soluce</em>}</li>
 *   <li>{@link generator.impl.JudoQuestionableArbitrationFactImpl#getRepresentationIDSoluce <em>Representation ID Soluce</em>}</li>
 *   <li>{@link generator.impl.JudoQuestionableArbitrationFactImpl#getDescriptionSoluce <em>Description Soluce</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JudoQuestionableArbitrationFactImpl extends QuestionableFactImpl
		implements JudoQuestionableArbitrationFact {
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
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getRepresentationID() <em>Representation ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentationID()
	 * @generated
	 * @ordered
	 */
	protected static final String REPRESENTATION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRepresentationID() <em>Representation ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentationID()
	 * @generated
	 * @ordered
	 */
	protected String representationID = REPRESENTATION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getNameSoluce() <em>Name Soluce</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameSoluce()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_SOLUCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNameSoluce() <em>Name Soluce</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameSoluce()
	 * @generated
	 * @ordered
	 */
	protected String nameSoluce = NAME_SOLUCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRepresentationIDSoluce() <em>Representation ID Soluce</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentationIDSoluce()
	 * @generated
	 * @ordered
	 */
	protected static final String REPRESENTATION_ID_SOLUCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRepresentationIDSoluce() <em>Representation ID Soluce</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentationIDSoluce()
	 * @generated
	 * @ordered
	 */
	protected String representationIDSoluce = REPRESENTATION_ID_SOLUCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescriptionSoluce() <em>Description Soluce</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptionSoluce()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_SOLUCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescriptionSoluce() <em>Description Soluce</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptionSoluce()
	 * @generated
	 * @ordered
	 */
	protected String descriptionSoluce = DESCRIPTION_SOLUCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JudoQuestionableArbitrationFactImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.JUDO_QUESTIONABLE_ARBITRATION_FACT;
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.JUDO_QUESTIONABLE_ARBITRATION_FACT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.JUDO_QUESTIONABLE_ARBITRATION_FACT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRepresentationID() {
		return representationID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepresentationID(String newRepresentationID) {
		String oldRepresentationID = representationID;
		representationID = newRepresentationID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.JUDO_QUESTIONABLE_ARBITRATION_FACT__REPRESENTATION_ID, oldRepresentationID,
					representationID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNameSoluce() {
		return nameSoluce;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameSoluce(String newNameSoluce) {
		String oldNameSoluce = nameSoluce;
		nameSoluce = newNameSoluce;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.JUDO_QUESTIONABLE_ARBITRATION_FACT__NAME_SOLUCE, oldNameSoluce, nameSoluce));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRepresentationIDSoluce() {
		return representationIDSoluce;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepresentationIDSoluce(String newRepresentationIDSoluce) {
		String oldRepresentationIDSoluce = representationIDSoluce;
		representationIDSoluce = newRepresentationIDSoluce;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.JUDO_QUESTIONABLE_ARBITRATION_FACT__REPRESENTATION_ID_SOLUCE,
					oldRepresentationIDSoluce, representationIDSoluce));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescriptionSoluce() {
		return descriptionSoluce;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescriptionSoluce(String newDescriptionSoluce) {
		String oldDescriptionSoluce = descriptionSoluce;
		descriptionSoluce = newDescriptionSoluce;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.JUDO_QUESTIONABLE_ARBITRATION_FACT__DESCRIPTION_SOLUCE, oldDescriptionSoluce,
					descriptionSoluce));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GeneratorPackage.JUDO_QUESTIONABLE_ARBITRATION_FACT__NAME:
			return getName();
		case GeneratorPackage.JUDO_QUESTIONABLE_ARBITRATION_FACT__DESCRIPTION:
			return getDescription();
		case GeneratorPackage.JUDO_QUESTIONABLE_ARBITRATION_FACT__REPRESENTATION_ID:
			return getRepresentationID();
		case GeneratorPackage.JUDO_QUESTIONABLE_ARBITRATION_FACT__NAME_SOLUCE:
			return getNameSoluce();
		case GeneratorPackage.JUDO_QUESTIONABLE_ARBITRATION_FACT__REPRESENTATION_ID_SOLUCE:
			return getRepresentationIDSoluce();
		case GeneratorPackage.JUDO_QUESTIONABLE_ARBITRATION_FACT__DESCRIPTION_SOLUCE:
			return getDescriptionSoluce();
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
		case GeneratorPackage.JUDO_QUESTIONABLE_ARBITRATION_FACT__NAME:
			setName((String) newValue);
			return;
		case GeneratorPackage.JUDO_QUESTIONABLE_ARBITRATION_FACT__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case GeneratorPackage.JUDO_QUESTIONABLE_ARBITRATION_FACT__REPRESENTATION_ID:
			setRepresentationID((String) newValue);
			return;
		case GeneratorPackage.JUDO_QUESTIONABLE_ARBITRATION_FACT__NAME_SOLUCE:
			setNameSoluce((String) newValue);
			return;
		case GeneratorPackage.JUDO_QUESTIONABLE_ARBITRATION_FACT__REPRESENTATION_ID_SOLUCE:
			setRepresentationIDSoluce((String) newValue);
			return;
		case GeneratorPackage.JUDO_QUESTIONABLE_ARBITRATION_FACT__DESCRIPTION_SOLUCE:
			setDescriptionSoluce((String) newValue);
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
		case GeneratorPackage.JUDO_QUESTIONABLE_ARBITRATION_FACT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case GeneratorPackage.JUDO_QUESTIONABLE_ARBITRATION_FACT__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case GeneratorPackage.JUDO_QUESTIONABLE_ARBITRATION_FACT__REPRESENTATION_ID:
			setRepresentationID(REPRESENTATION_ID_EDEFAULT);
			return;
		case GeneratorPackage.JUDO_QUESTIONABLE_ARBITRATION_FACT__NAME_SOLUCE:
			setNameSoluce(NAME_SOLUCE_EDEFAULT);
			return;
		case GeneratorPackage.JUDO_QUESTIONABLE_ARBITRATION_FACT__REPRESENTATION_ID_SOLUCE:
			setRepresentationIDSoluce(REPRESENTATION_ID_SOLUCE_EDEFAULT);
			return;
		case GeneratorPackage.JUDO_QUESTIONABLE_ARBITRATION_FACT__DESCRIPTION_SOLUCE:
			setDescriptionSoluce(DESCRIPTION_SOLUCE_EDEFAULT);
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
		case GeneratorPackage.JUDO_QUESTIONABLE_ARBITRATION_FACT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case GeneratorPackage.JUDO_QUESTIONABLE_ARBITRATION_FACT__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case GeneratorPackage.JUDO_QUESTIONABLE_ARBITRATION_FACT__REPRESENTATION_ID:
			return REPRESENTATION_ID_EDEFAULT == null ? representationID != null
					: !REPRESENTATION_ID_EDEFAULT.equals(representationID);
		case GeneratorPackage.JUDO_QUESTIONABLE_ARBITRATION_FACT__NAME_SOLUCE:
			return NAME_SOLUCE_EDEFAULT == null ? nameSoluce != null : !NAME_SOLUCE_EDEFAULT.equals(nameSoluce);
		case GeneratorPackage.JUDO_QUESTIONABLE_ARBITRATION_FACT__REPRESENTATION_ID_SOLUCE:
			return REPRESENTATION_ID_SOLUCE_EDEFAULT == null ? representationIDSoluce != null
					: !REPRESENTATION_ID_SOLUCE_EDEFAULT.equals(representationIDSoluce);
		case GeneratorPackage.JUDO_QUESTIONABLE_ARBITRATION_FACT__DESCRIPTION_SOLUCE:
			return DESCRIPTION_SOLUCE_EDEFAULT == null ? descriptionSoluce != null
					: !DESCRIPTION_SOLUCE_EDEFAULT.equals(descriptionSoluce);
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
		result.append(", description: ");
		result.append(description);
		result.append(", representationID: ");
		result.append(representationID);
		result.append(", nameSoluce: ");
		result.append(nameSoluce);
		result.append(", representationIDSoluce: ");
		result.append(representationIDSoluce);
		result.append(", descriptionSoluce: ");
		result.append(descriptionSoluce);
		result.append(')');
		return result.toString();
	}

	@Override
	public String getQuestionableFact() {

		String fact = "(";
		if (!this.name.equals("-1")) {
			fact += this.nameSoluce + "-";
		}
		if (!this.description.equals("-1")) {
			fact += this.descriptionSoluce + "-";
		}
		if (!this.representationID.equals("-1")) {
			fact += this.representationIDSoluce + "-";
		}

		return fact + "?-?)";
	}

	@Override
	public String getCompleteFact() {
		String fact = "(";
		if (!this.name.equals("-1")) {
			fact += this.nameSoluce + "-";
			fact += this.descriptionSoluce + "-";
			fact += this.representationIDSoluce + "-";
		}
		if (!this.description.equals("-1")) {
			fact += this.descriptionSoluce + "-";
			fact += this.nameSoluce + "-";
			fact += this.representationIDSoluce + "-";
		}
		if (!this.representationID.equals("-1")) {
			fact += this.representationIDSoluce + "-";
			fact += this.nameSoluce + "-";
			fact += this.descriptionSoluce + "-";
		}
		return fact + ")";
	}

} //JudoQuestionableArbitrationFactImpl
