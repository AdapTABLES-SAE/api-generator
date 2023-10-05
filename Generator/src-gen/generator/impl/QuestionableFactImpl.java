/**
 */
package generator.impl;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import generator.GeneratorPackage;
import generator.QuestionableFact;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Questionable Fact</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class QuestionableFactImpl extends AQuestionableFactImpl implements QuestionableFact {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionableFactImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.QUESTIONABLE_FACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public abstract String getQuestionableFact();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public abstract String getCompleteFact();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case GeneratorPackage.QUESTIONABLE_FACT___GET_QUESTIONABLE_FACT:
			return getQuestionableFact();
		case GeneratorPackage.QUESTIONABLE_FACT___GET_COMPLETE_FACT:
			return getCompleteFact();
		}
		return super.eInvoke(operationID, arguments);
	}

} //QuestionableFactImpl
