/**
 */
package generatorMetamodels;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relations2 Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generatorMetamodels.Relations2Parameter#getValue1 <em>Value1</em>}</li>
 * </ul>
 *
 * @see generatorMetamodels.GeneratorMetamodelsPackage#getRelations2Parameter()
 * @model abstract="true"
 * @generated
 */
public interface Relations2Parameter<P> extends SemanticRelation {
	/**
	 * Returns the value of the '<em><b>Value1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value1</em>' attribute.
	 * @see #setValue1(Object)
	 * @see generatorMetamodels.GeneratorMetamodelsPackage#getRelations2Parameter_Value1()
	 * @model
	 * @generated
	 */
	P getValue1();

	/**
	 * Sets the value of the '{@link generatorMetamodels.Relations2Parameter#getValue1 <em>Value1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value1</em>' attribute.
	 * @see #getValue1()
	 * @generated
	 */
	void setValue1(P value);

} // Relations2Parameter
