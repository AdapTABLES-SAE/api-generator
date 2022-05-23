/**
 */
package generatorMetamodels;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QF One Completion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generatorMetamodels.QFOneCompletion#getNewAttribute <em>New Attribute</em>}</li>
 * </ul>
 *
 * @see generatorMetamodels.GeneratorMetamodelsPackage#getQFOneCompletion()
 * @model abstract="true"
 * @generated
 */
public interface QFOneCompletion extends SubObjective {
	/**
	 * Returns the value of the '<em><b>New Attribute</b></em>' attribute.
	 * The default value is <code>"COMPLETION1"</code>.
	 * The literals are from the enumeration {@link generatorMetamodels.SubObjectiveType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Attribute</em>' attribute.
	 * @see generatorMetamodels.SubObjectiveType
	 * @see #isSetNewAttribute()
	 * @see generatorMetamodels.GeneratorMetamodelsPackage#getQFOneCompletion_NewAttribute()
	 * @model default="COMPLETION1" unsettable="true" changeable="false"
	 * @generated
	 */
	SubObjectiveType getNewAttribute();

	/**
	 * Returns whether the value of the '{@link generatorMetamodels.QFOneCompletion#getNewAttribute <em>New Attribute</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>New Attribute</em>' attribute is set.
	 * @see #getNewAttribute()
	 * @generated
	 */
	boolean isSetNewAttribute();

} // QFOneCompletion
