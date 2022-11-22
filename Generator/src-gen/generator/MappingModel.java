/**
 */
package generator;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.MappingModel#getCompliancerelations <em>Compliancerelations</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getMappingModel()
 * @model
 * @generated
 */
public interface MappingModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Compliancerelations</b></em>' containment reference list.
	 * The list contents are of type {@link generator.ComplianceRelations}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compliancerelations</em>' containment reference list.
	 * @see generator.GeneratorPackage#getMappingModel_Compliancerelations()
	 * @model containment="true"
	 * @generated
	 */
	EList<ComplianceRelations> getCompliancerelations();

} // MappingModel
