/**
 */
package generator;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Player Progress</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.PlayerProgress#getCurrentLevel <em>Current Level</em>}</li>
 *   <li>{@link generator.PlayerProgress#getCoins <em>Coins</em>}</li>
 *   <li>{@link generator.PlayerProgress#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getPlayerProgress()
 * @model
 * @generated
 */
public interface PlayerProgress extends EObject {
	/**
	 * Returns the value of the '<em><b>Current Level</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Level</em>' attribute.
	 * @see #setCurrentLevel(int)
	 * @see generator.GeneratorPackage#getPlayerProgress_CurrentLevel()
	 * @model default="1"
	 * @generated
	 */
	int getCurrentLevel();

	/**
	 * Sets the value of the '{@link generator.PlayerProgress#getCurrentLevel <em>Current Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Level</em>' attribute.
	 * @see #getCurrentLevel()
	 * @generated
	 */
	void setCurrentLevel(int value);

	/**
	 * Returns the value of the '<em><b>Coins</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coins</em>' attribute.
	 * @see #setCoins(int)
	 * @see generator.GeneratorPackage#getPlayerProgress_Coins()
	 * @model default="0"
	 * @generated
	 */
	int getCoins();

	/**
	 * Sets the value of the '{@link generator.PlayerProgress#getCoins <em>Coins</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coins</em>' attribute.
	 * @see #getCoins()
	 * @generated
	 */
	void setCoins(int value);

	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference.
	 * @see #setItems(Items)
	 * @see generator.GeneratorPackage#getPlayerProgress_Items()
	 * @model containment="true"
	 * @generated
	 */
	Items getItems();

	/**
	 * Sets the value of the '{@link generator.PlayerProgress#getItems <em>Items</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Items</em>' containment reference.
	 * @see #getItems()
	 * @generated
	 */
	void setItems(Items value);

} // PlayerProgress
