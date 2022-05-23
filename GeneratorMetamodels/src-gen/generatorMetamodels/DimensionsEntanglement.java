/**
 */
package generatorMetamodels;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dimensions Entanglement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generatorMetamodels.DimensionsEntanglement#getSemanticrelations <em>Semanticrelations</em>}</li>
 * </ul>
 *
 * @see generatorMetamodels.GeneratorMetamodelsPackage#getDimensionsEntanglement()
 * @model
 * @generated
 */
public interface DimensionsEntanglement extends EObject {
	/**
	 * Returns the value of the '<em><b>Semanticrelations</b></em>' containment reference list.
	 * The list contents are of type {@link generatorMetamodels.SemanticRelation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semanticrelations</em>' containment reference list.
	 * @see generatorMetamodels.GeneratorMetamodelsPackage#getDimensionsEntanglement_Semanticrelations()
	 * @model containment="true"
	 * @generated
	 */
	EList<SemanticRelation> getSemanticrelations();

} // DimensionsEntanglement
