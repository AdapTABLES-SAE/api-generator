/**
 */
package generator.impl;

import generator.GeneratorPackage;
import generator.MTRecontruction;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MT Recontruction</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class MTRecontructionImpl extends ReconstructionTaskImpl implements MTRecontruction {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MTRecontructionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.MT_RECONTRUCTION;
	}

	@Override
	public boolean validationOnLearnerAction() {
		return checkLearnerAction;
	}

} //MTRecontructionImpl
