/**
 */
package generator;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Curses</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.Curses#getCurses <em>Curses</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getCurses()
 * @model
 * @generated
 */
public interface Curses extends EObject {
	/**
	 * Returns the value of the '<em><b>Curses</b></em>' containment reference list.
	 * The list contents are of type {@link generator.Curse}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Curses</em>' containment reference list.
	 * @see generator.GeneratorPackage#getCurses_Curses()
	 * @model containment="true"
	 * @generated
	 */
	EList<Curse> getCurses();

} // Curses
