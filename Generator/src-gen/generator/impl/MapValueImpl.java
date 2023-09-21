/**
 */
package generator.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import generator.GeneratorPackage;
import generator.MapValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Map Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class MapValueImpl extends ValueImpl implements MapValue {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.MAP_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCorrectValue() {
		return !this.value.isEmpty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case GeneratorPackage.MAP_VALUE___IS_CORRECT_VALUE:
			return isCorrectValue();
		}
		return super.eInvoke(operationID, arguments);
	}

} //MapValueImpl
