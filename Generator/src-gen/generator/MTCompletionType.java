/**
 */
package generator;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MT Completion Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.MTCompletionType#getTargets <em>Targets</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getMTCompletionType()
 * @model
 * @generated
 */
public interface MTCompletionType extends CompletionType {
	/**
	 * Returns the value of the '<em><b>Targets</b></em>' attribute list.
	 * The list contents are of type {@link generator.TargetElement}.
	 * The literals are from the enumeration {@link generator.TargetElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Targets</em>' attribute list.
	 * @see generator.TargetElement
	 * @see generator.GeneratorPackage#getMTCompletionType_Targets()
	 * @model required="true"
	 * @generated
	 */
	EList<TargetElement> getTargets();

} // MTCompletionType
