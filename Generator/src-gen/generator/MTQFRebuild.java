/**
 */
package generator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MTQF Rebuild</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.MTQFRebuild#getSoluceLeft <em>Soluce Left</em>}</li>
 *   <li>{@link generator.MTQFRebuild#getSoluceRes <em>Soluce Res</em>}</li>
 *   <li>{@link generator.MTQFRebuild#isResultOnRight <em>Result On Right</em>}</li>
 *   <li>{@link generator.MTQFRebuild#getSoluceRight <em>Soluce Right</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getMTQFRebuild()
 * @model
 * @generated
 */
public interface MTQFRebuild extends QuestionableFact {
	/**
	 * Returns the value of the '<em><b>Soluce Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Soluce Left</em>' attribute.
	 * @see #setSoluceLeft(int)
	 * @see generator.GeneratorPackage#getMTQFRebuild_SoluceLeft()
	 * @model
	 * @generated
	 */
	int getSoluceLeft();

	/**
	 * Sets the value of the '{@link generator.MTQFRebuild#getSoluceLeft <em>Soluce Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Soluce Left</em>' attribute.
	 * @see #getSoluceLeft()
	 * @generated
	 */
	void setSoluceLeft(int value);

	/**
	 * Returns the value of the '<em><b>Soluce Res</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Soluce Res</em>' attribute.
	 * @see #setSoluceRes(int)
	 * @see generator.GeneratorPackage#getMTQFRebuild_SoluceRes()
	 * @model
	 * @generated
	 */
	int getSoluceRes();

	/**
	 * Sets the value of the '{@link generator.MTQFRebuild#getSoluceRes <em>Soluce Res</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Soluce Res</em>' attribute.
	 * @see #getSoluceRes()
	 * @generated
	 */
	void setSoluceRes(int value);

	/**
	 * Returns the value of the '<em><b>Result On Right</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result On Right</em>' attribute.
	 * @see #setResultOnRight(boolean)
	 * @see generator.GeneratorPackage#getMTQFRebuild_ResultOnRight()
	 * @model default="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isResultOnRight();

	/**
	 * Sets the value of the '{@link generator.MTQFRebuild#isResultOnRight <em>Result On Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result On Right</em>' attribute.
	 * @see #isResultOnRight()
	 * @generated
	 */
	void setResultOnRight(boolean value);

	/**
	 * Returns the value of the '<em><b>Soluce Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Soluce Right</em>' attribute.
	 * @see #setSoluceRight(int)
	 * @see generator.GeneratorPackage#getMTQFRebuild_SoluceRight()
	 * @model
	 * @generated
	 */
	int getSoluceRight();

	/**
	 * Sets the value of the '{@link generator.MTQFRebuild#getSoluceRight <em>Soluce Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Soluce Right</em>' attribute.
	 * @see #getSoluceRight()
	 * @generated
	 */
	void setSoluceRight(int value);

} // MTQFRebuild
