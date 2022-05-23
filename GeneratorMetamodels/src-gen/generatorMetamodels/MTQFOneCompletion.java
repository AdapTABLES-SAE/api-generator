/**
 */
package generatorMetamodels;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MTQF One Completion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generatorMetamodels.MTQFOneCompletion#getTargets <em>Targets</em>}</li>
 * </ul>
 *
 * @see generatorMetamodels.GeneratorMetamodelsPackage#getMTQFOneCompletion()
 * @model
 * @generated
 */
public interface MTQFOneCompletion extends QFOneCompletion {
	/**
	 * Returns the value of the '<em><b>Targets</b></em>' attribute list.
	 * The list contents are of type {@link generatorMetamodels.TargetElement}.
	 * The literals are from the enumeration {@link generatorMetamodels.TargetElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Targets</em>' attribute list.
	 * @see generatorMetamodels.TargetElement
	 * @see generatorMetamodels.GeneratorMetamodelsPackage#getMTQFOneCompletion_Targets()
	 * @model
	 * @generated
	 */
	EList<TargetElement> getTargets();

} // MTQFOneCompletion
