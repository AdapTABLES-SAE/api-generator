/**
 */
package generator;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HGQF Membership</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.HGQFMembership#getGoodChoices <em>Good Choices</em>}</li>
 *   <li>{@link generator.HGQFMembership#getType <em>Type</em>}</li>
 *   <li>{@link generator.HGQFMembership#getMembershipTo <em>Membership To</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getHGQFMembership()
 * @model
 * @generated
 */
public interface HGQFMembership extends QuestionableFact {
	/**
	 * Returns the value of the '<em><b>Good Choices</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Good Choices</em>' attribute list.
	 * @see generator.GeneratorPackage#getHGQFMembership_GoodChoices()
	 * @model
	 * @generated
	 */
	EList<String> getGoodChoices();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link generator.EGeographyValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see generator.EGeographyValue
	 * @see #setType(EGeographyValue)
	 * @see generator.GeneratorPackage#getHGQFMembership_Type()
	 * @model
	 * @generated
	 */
	EGeographyValue getType();

	/**
	 * Sets the value of the '{@link generator.HGQFMembership#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see generator.EGeographyValue
	 * @see #getType()
	 * @generated
	 */
	void setType(EGeographyValue value);

	/**
	 * Returns the value of the '<em><b>Membership To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Membership To</em>' attribute.
	 * @see #setMembershipTo(String)
	 * @see generator.GeneratorPackage#getHGQFMembership_MembershipTo()
	 * @model
	 * @generated
	 */
	String getMembershipTo();

	/**
	 * Sets the value of the '{@link generator.HGQFMembership#getMembershipTo <em>Membership To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Membership To</em>' attribute.
	 * @see #getMembershipTo()
	 * @generated
	 */
	void setMembershipTo(String value);

} // HGQFMembership
