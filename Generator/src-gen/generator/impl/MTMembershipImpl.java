/**
 */
package generator.impl;

import org.eclipse.emf.ecore.EClass;

import generator.GeneratorPackage;
import generator.MTMembership;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MT Membership</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class MTMembershipImpl extends MembershipIDTaskImpl implements MTMembership {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MTMembershipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.MT_MEMBERSHIP;
	}

	@Override
	public boolean isCheckOnLearnerAction() {
		return checkLearnerAction;
	}

} //MTMembershipImpl
