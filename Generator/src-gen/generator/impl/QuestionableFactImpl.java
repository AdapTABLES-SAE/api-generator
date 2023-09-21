/**
 */
package generator.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import generator.GeneratorPackage;
import generator.QuestionableFact;
import generator.QuestionableFactResult;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Questionable Fact</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.QuestionableFactImpl#isAchieved <em>Achieved</em>}</li>
 *   <li>{@link generator.impl.QuestionableFactImpl#isWasSelected <em>Was Selected</em>}</li>
 *   <li>{@link generator.impl.QuestionableFactImpl#getID <em>ID</em>}</li>
 *   <li>{@link generator.impl.QuestionableFactImpl#getResults <em>Results</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class QuestionableFactImpl extends MinimalEObjectImpl.Container implements QuestionableFact {
	/**
	 * The default value of the '{@link #isAchieved() <em>Achieved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAchieved()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ACHIEVED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAchieved() <em>Achieved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAchieved()
	 * @generated
	 * @ordered
	 */
	protected boolean achieved = ACHIEVED_EDEFAULT;

	/**
	 * The default value of the '{@link #isWasSelected() <em>Was Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWasSelected()
	 * @generated
	 * @ordered
	 */
	protected static final boolean WAS_SELECTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isWasSelected() <em>Was Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWasSelected()
	 * @generated
	 * @ordered
	 */
	protected boolean wasSelected = WAS_SELECTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * This is true if the ID attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean idESet;

	/**
	 * The cached value of the '{@link #getResults() <em>Results</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResults()
	 * @generated
	 * @ordered
	 */
	protected EList<QuestionableFactResult> results;

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
	 * @generated
	 */
	public boolean isAchieved() {
		return achieved;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAchieved(boolean newAchieved) {
		boolean oldAchieved = achieved;
		achieved = newAchieved;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.QUESTIONABLE_FACT__ACHIEVED,
					oldAchieved, achieved));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isWasSelected() {
		return wasSelected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWasSelected(boolean newWasSelected) {
		boolean oldWasSelected = wasSelected;
		wasSelected = newWasSelected;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.QUESTIONABLE_FACT__WAS_SELECTED,
					oldWasSelected, wasSelected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getID() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID(String newID) {
		String oldID = id;
		id = newID;
		boolean oldIDESet = idESet;
		idESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.QUESTIONABLE_FACT__ID, oldID, id,
					!oldIDESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetID() {
		String oldID = id;
		boolean oldIDESet = idESet;
		id = ID_EDEFAULT;
		idESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, GeneratorPackage.QUESTIONABLE_FACT__ID, oldID,
					ID_EDEFAULT, oldIDESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetID() {
		return idESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QuestionableFactResult> getResults() {
		if (results == null) {
			results = new EObjectContainmentEList<QuestionableFactResult>(QuestionableFactResult.class, this,
					GeneratorPackage.QUESTIONABLE_FACT__RESULTS);
		}
		return results;
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GeneratorPackage.QUESTIONABLE_FACT__RESULTS:
			return ((InternalEList<?>) getResults()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GeneratorPackage.QUESTIONABLE_FACT__ACHIEVED:
			return isAchieved();
		case GeneratorPackage.QUESTIONABLE_FACT__WAS_SELECTED:
			return isWasSelected();
		case GeneratorPackage.QUESTIONABLE_FACT__ID:
			return getID();
		case GeneratorPackage.QUESTIONABLE_FACT__RESULTS:
			return getResults();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case GeneratorPackage.QUESTIONABLE_FACT__ACHIEVED:
			setAchieved((Boolean) newValue);
			return;
		case GeneratorPackage.QUESTIONABLE_FACT__WAS_SELECTED:
			setWasSelected((Boolean) newValue);
			return;
		case GeneratorPackage.QUESTIONABLE_FACT__ID:
			setID((String) newValue);
			return;
		case GeneratorPackage.QUESTIONABLE_FACT__RESULTS:
			getResults().clear();
			getResults().addAll((Collection<? extends QuestionableFactResult>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case GeneratorPackage.QUESTIONABLE_FACT__ACHIEVED:
			setAchieved(ACHIEVED_EDEFAULT);
			return;
		case GeneratorPackage.QUESTIONABLE_FACT__WAS_SELECTED:
			setWasSelected(WAS_SELECTED_EDEFAULT);
			return;
		case GeneratorPackage.QUESTIONABLE_FACT__ID:
			unsetID();
			return;
		case GeneratorPackage.QUESTIONABLE_FACT__RESULTS:
			getResults().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case GeneratorPackage.QUESTIONABLE_FACT__ACHIEVED:
			return achieved != ACHIEVED_EDEFAULT;
		case GeneratorPackage.QUESTIONABLE_FACT__WAS_SELECTED:
			return wasSelected != WAS_SELECTED_EDEFAULT;
		case GeneratorPackage.QUESTIONABLE_FACT__ID:
			return isSetID();
		case GeneratorPackage.QUESTIONABLE_FACT__RESULTS:
			return results != null && !results.isEmpty();
		}
		return super.eIsSet(featureID);
	}

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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (achieved: ");
		result.append(achieved);
		result.append(", wasSelected: ");
		result.append(wasSelected);
		result.append(", ID: ");
		if (idESet)
			result.append(id);
		else
			result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //QuestionableFactImpl
