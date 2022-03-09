/**
 */
package demo;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see demo.DemoPackage
 * @generated
 */
public interface DemoFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DemoFactory eINSTANCE = demo.impl.DemoFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Learning Path</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Learning Path</em>'.
	 * @generated
	 */
	LearningPath createLearningPath();

	/**
	 * Returns a new object of class '<em>Learning Objective</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Learning Objective</em>'.
	 * @generated
	 */
	LearningObjective createLearningObjective();

	/**
	 * Returns a new object of class '<em>Generated Parameters</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generated Parameters</em>'.
	 * @generated
	 */
	GeneratedParameters createGeneratedParameters();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DemoPackage getDemoPackage();

} //DemoFactory
