/**
 */
package generator.impl;

import generator.GeneratorPackage;
import generator.MTQeFIdentication;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MT Qe FIdentication</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class MTQeFIdenticationImpl extends QuestionedFactImpl implements MTQeFIdentication {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MTQeFIdenticationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.MT_QE_FIDENTICATION;
	}

	@Override
	public String getQuestionedFactQuestion() {
		return getQuestionablefact().getQuestionableFact();
	}

} //MTQeFIdenticationImpl
