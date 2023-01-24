/**
 */
package generator;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Current Game Level</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.CurrentGameLevel#getLevel <em>Level</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getCurrentGameLevel()
 * @model
 * @generated
 */
public interface CurrentGameLevel extends EObject {
	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see #setLevel(int)
	 * @see generator.GeneratorPackage#getCurrentGameLevel_Level()
	 * @model default="1"
	 * @generated
	 */
	int getLevel();

	/**
	 * Sets the value of the '{@link generator.CurrentGameLevel#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(int value);

} // CurrentGameLevel
