/**
 */
package generator.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import generator.AbstractFact;
import generator.GeneratorPackage;
import generator.Image;
import generator.SetOfFacts;
import generator.Visualization;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Fact</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.AbstractFactImpl#getRepresentation <em>Representation</em>}</li>
 *   <li>{@link generator.impl.AbstractFactImpl#getBelongsToVisualization <em>Belongs To Visualization</em>}</li>
 *   <li>{@link generator.impl.AbstractFactImpl#getSetoffacts <em>Setoffacts</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractFactImpl extends GeneralFactImpl implements AbstractFact {
	/**
	 * The cached value of the '{@link #getRepresentation() <em>Representation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentation()
	 * @generated
	 * @ordered
	 */
	protected Image representation;

	/**
	 * The cached value of the '{@link #getBelongsToVisualization() <em>Belongs To Visualization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBelongsToVisualization()
	 * @generated
	 * @ordered
	 */
	protected Visualization belongsToVisualization;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractFactImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.ABSTRACT_FACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Image getRepresentation() {
		return representation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRepresentation(Image newRepresentation, NotificationChain msgs) {
		Image oldRepresentation = representation;
		representation = newRepresentation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.ABSTRACT_FACT__REPRESENTATION, oldRepresentation, newRepresentation);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepresentation(Image newRepresentation) {
		if (newRepresentation != representation) {
			NotificationChain msgs = null;
			if (representation != null)
				msgs = ((InternalEObject) representation).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.ABSTRACT_FACT__REPRESENTATION, null, msgs);
			if (newRepresentation != null)
				msgs = ((InternalEObject) newRepresentation).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.ABSTRACT_FACT__REPRESENTATION, null, msgs);
			msgs = basicSetRepresentation(newRepresentation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.ABSTRACT_FACT__REPRESENTATION,
					newRepresentation, newRepresentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Visualization getBelongsToVisualization() {
		if (belongsToVisualization != null && belongsToVisualization.eIsProxy()) {
			InternalEObject oldBelongsToVisualization = (InternalEObject) belongsToVisualization;
			belongsToVisualization = (Visualization) eResolveProxy(oldBelongsToVisualization);
			if (belongsToVisualization != oldBelongsToVisualization) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							GeneratorPackage.ABSTRACT_FACT__BELONGS_TO_VISUALIZATION, oldBelongsToVisualization,
							belongsToVisualization));
			}
		}
		return belongsToVisualization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Visualization basicGetBelongsToVisualization() {
		return belongsToVisualization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBelongsToVisualization(Visualization newBelongsToVisualization) {
		Visualization oldBelongsToVisualization = belongsToVisualization;
		belongsToVisualization = newBelongsToVisualization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.ABSTRACT_FACT__BELONGS_TO_VISUALIZATION, oldBelongsToVisualization,
					belongsToVisualization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetOfFacts getSetoffacts() {
		if (eContainerFeatureID() != GeneratorPackage.ABSTRACT_FACT__SETOFFACTS)
			return null;
		return (SetOfFacts) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSetoffacts(SetOfFacts newSetoffacts, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newSetoffacts, GeneratorPackage.ABSTRACT_FACT__SETOFFACTS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSetoffacts(SetOfFacts newSetoffacts) {
		if (newSetoffacts != eInternalContainer()
				|| (eContainerFeatureID() != GeneratorPackage.ABSTRACT_FACT__SETOFFACTS && newSetoffacts != null)) {
			if (EcoreUtil.isAncestor(this, newSetoffacts))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSetoffacts != null)
				msgs = ((InternalEObject) newSetoffacts).eInverseAdd(this, GeneratorPackage.SET_OF_FACTS__FACTS,
						SetOfFacts.class, msgs);
			msgs = basicSetSetoffacts(newSetoffacts, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.ABSTRACT_FACT__SETOFFACTS,
					newSetoffacts, newSetoffacts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GeneratorPackage.ABSTRACT_FACT__SETOFFACTS:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetSetoffacts((SetOfFacts) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GeneratorPackage.ABSTRACT_FACT__REPRESENTATION:
			return basicSetRepresentation(null, msgs);
		case GeneratorPackage.ABSTRACT_FACT__SETOFFACTS:
			return basicSetSetoffacts(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case GeneratorPackage.ABSTRACT_FACT__SETOFFACTS:
			return eInternalContainer().eInverseRemove(this, GeneratorPackage.SET_OF_FACTS__FACTS, SetOfFacts.class,
					msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GeneratorPackage.ABSTRACT_FACT__REPRESENTATION:
			return getRepresentation();
		case GeneratorPackage.ABSTRACT_FACT__BELONGS_TO_VISUALIZATION:
			if (resolve)
				return getBelongsToVisualization();
			return basicGetBelongsToVisualization();
		case GeneratorPackage.ABSTRACT_FACT__SETOFFACTS:
			return getSetoffacts();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case GeneratorPackage.ABSTRACT_FACT__REPRESENTATION:
			setRepresentation((Image) newValue);
			return;
		case GeneratorPackage.ABSTRACT_FACT__BELONGS_TO_VISUALIZATION:
			setBelongsToVisualization((Visualization) newValue);
			return;
		case GeneratorPackage.ABSTRACT_FACT__SETOFFACTS:
			setSetoffacts((SetOfFacts) newValue);
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
		case GeneratorPackage.ABSTRACT_FACT__REPRESENTATION:
			setRepresentation((Image) null);
			return;
		case GeneratorPackage.ABSTRACT_FACT__BELONGS_TO_VISUALIZATION:
			setBelongsToVisualization((Visualization) null);
			return;
		case GeneratorPackage.ABSTRACT_FACT__SETOFFACTS:
			setSetoffacts((SetOfFacts) null);
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
		case GeneratorPackage.ABSTRACT_FACT__REPRESENTATION:
			return representation != null;
		case GeneratorPackage.ABSTRACT_FACT__BELONGS_TO_VISUALIZATION:
			return belongsToVisualization != null;
		case GeneratorPackage.ABSTRACT_FACT__SETOFFACTS:
			return getSetoffacts() != null;
		}
		return super.eIsSet(featureID);
	}

} //AbstractFactImpl
