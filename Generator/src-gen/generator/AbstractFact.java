/**
 */
package generator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Fact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.AbstractFact#getRepresentation <em>Representation</em>}</li>
 *   <li>{@link generator.AbstractFact#getBelongsToVisualization <em>Belongs To Visualization</em>}</li>
 *   <li>{@link generator.AbstractFact#getSetoffacts <em>Setoffacts</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getAbstractFact()
 * @model abstract="true"
 * @generated
 */
public interface AbstractFact extends GeneralFact {
	/**
	 * Returns the value of the '<em><b>Representation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Representation</em>' containment reference.
	 * @see #setRepresentation(Image)
	 * @see generator.GeneratorPackage#getAbstractFact_Representation()
	 * @model containment="true"
	 * @generated
	 */
	Image getRepresentation();

	/**
	 * Sets the value of the '{@link generator.AbstractFact#getRepresentation <em>Representation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Representation</em>' containment reference.
	 * @see #getRepresentation()
	 * @generated
	 */
	void setRepresentation(Image value);

	/**
	 * Returns the value of the '<em><b>Belongs To Visualization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Belongs To Visualization</em>' reference.
	 * @see #setBelongsToVisualization(Visualization)
	 * @see generator.GeneratorPackage#getAbstractFact_BelongsToVisualization()
	 * @model
	 * @generated
	 */
	Visualization getBelongsToVisualization();

	/**
	 * Sets the value of the '{@link generator.AbstractFact#getBelongsToVisualization <em>Belongs To Visualization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Belongs To Visualization</em>' reference.
	 * @see #getBelongsToVisualization()
	 * @generated
	 */
	void setBelongsToVisualization(Visualization value);

	/**
	 * Returns the value of the '<em><b>Setoffacts</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link generator.SetOfFacts#getFacts <em>Facts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Setoffacts</em>' container reference.
	 * @see #setSetoffacts(SetOfFacts)
	 * @see generator.GeneratorPackage#getAbstractFact_Setoffacts()
	 * @see generator.SetOfFacts#getFacts
	 * @model opposite="facts" required="true" transient="false"
	 * @generated
	 */
	SetOfFacts getSetoffacts();

	/**
	 * Sets the value of the '{@link generator.AbstractFact#getSetoffacts <em>Setoffacts</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Setoffacts</em>' container reference.
	 * @see #getSetoffacts()
	 * @generated
	 */
	void setSetoffacts(SetOfFacts value);

} // AbstractFact
