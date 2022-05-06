/**
 */
package generatorMetamodels;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Game Elements</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generatorMetamodels.GameElements#getName <em>Name</em>}</li>
 *   <li>{@link generatorMetamodels.GameElements#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see generatorMetamodels.GeneratorMetamodelsPackage#getGameElements()
 * @model abstract="true"
 * @generated
 */
public interface GameElements extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see generatorMetamodels.GeneratorMetamodelsPackage#getGameElements_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link generatorMetamodels.GameElements#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"OTHER"</code>.
	 * The literals are from the enumeration {@link generatorMetamodels.GameElementType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see generatorMetamodels.GameElementType
	 * @see #setType(GameElementType)
	 * @see generatorMetamodels.GeneratorMetamodelsPackage#getGameElements_Type()
	 * @model default="OTHER"
	 * @generated
	 */
	GameElementType getType();

	/**
	 * Sets the value of the '{@link generatorMetamodels.GameElements#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see generatorMetamodels.GameElementType
	 * @see #getType()
	 * @generated
	 */
	void setType(GameElementType value);

} // GameElements
