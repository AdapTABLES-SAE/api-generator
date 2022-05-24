/**
 */
package generatorMetamodels;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MT Table Building</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generatorMetamodels.MTTableBuilding#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see generatorMetamodels.GeneratorMetamodelsPackage#getMTTableBuilding()
 * @model
 * @generated
 */
public interface MTTableBuilding extends Parameter {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link generatorMetamodels.TableBuild}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see generatorMetamodels.TableBuild
	 * @see #setValue(TableBuild)
	 * @see generatorMetamodels.GeneratorMetamodelsPackage#getMTTableBuilding_Value()
	 * @model
	 * @generated
	 */
	TableBuild getValue();

	/**
	 * Sets the value of the '{@link generatorMetamodels.MTTableBuilding#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see generatorMetamodels.TableBuild
	 * @see #getValue()
	 * @generated
	 */
	void setValue(TableBuild value);

} // MTTableBuilding
