/**
 */
package generatorMetamodels.provider;

import generatorMetamodels.GeneratorMetamodelsFactory;
import generatorMetamodels.GeneratorMetamodelsPackage;
import generatorMetamodels.HighLevelActivity;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link generatorMetamodels.HighLevelActivity} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class HighLevelActivityItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HighLevelActivityItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addLevelPropertyDescriptor(object);
			addNumberOfQuestionsPropertyDescriptor(object);
			addGamingobjectivePropertyDescriptor(object);
			addSelectedModePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Level feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLevelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_HighLevelActivity_level_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_HighLevelActivity_level_feature",
						"_UI_HighLevelActivity_type"),
				GeneratorMetamodelsPackage.Literals.HIGH_LEVEL_ACTIVITY__LEVEL, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Number Of Questions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNumberOfQuestionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_HighLevelActivity_numberOfQuestions_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_HighLevelActivity_numberOfQuestions_feature", "_UI_HighLevelActivity_type"),
						GeneratorMetamodelsPackage.Literals.HIGH_LEVEL_ACTIVITY__NUMBER_OF_QUESTIONS, true, false,
						false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Gamingobjective feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGamingobjectivePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_HighLevelActivity_gamingobjective_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_HighLevelActivity_gamingobjective_feature",
								"_UI_HighLevelActivity_type"),
						GeneratorMetamodelsPackage.Literals.HIGH_LEVEL_ACTIVITY__GAMINGOBJECTIVE, true, false, true,
						null, null, null));
	}

	/**
	 * This adds a property descriptor for the Selected Mode feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSelectedModePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_HighLevelActivity_selectedMode_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_HighLevelActivity_selectedMode_feature",
								"_UI_HighLevelActivity_type"),
						GeneratorMetamodelsPackage.Literals.HIGH_LEVEL_ACTIVITY__SELECTED_MODE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(GeneratorMetamodelsPackage.Literals.HIGH_LEVEL_ACTIVITY__ROOM_TYPES_BY_PERCENTAGE);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns HighLevelActivity.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/HighLevelActivity"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		HighLevelActivity highLevelActivity = (HighLevelActivity) object;
		return getString("_UI_HighLevelActivity_type") + " " + highLevelActivity.getNumberOfQuestions();
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(HighLevelActivity.class)) {
		case GeneratorMetamodelsPackage.HIGH_LEVEL_ACTIVITY__NUMBER_OF_QUESTIONS:
		case GeneratorMetamodelsPackage.HIGH_LEVEL_ACTIVITY__SELECTED_MODE:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case GeneratorMetamodelsPackage.HIGH_LEVEL_ACTIVITY__ROOM_TYPES_BY_PERCENTAGE:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(
				createChildParameter(GeneratorMetamodelsPackage.Literals.HIGH_LEVEL_ACTIVITY__ROOM_TYPES_BY_PERCENTAGE,
						GeneratorMetamodelsFactory.eINSTANCE
								.create(GeneratorMetamodelsPackage.Literals.ROOM_TYPE_TO_EINT_MAP)));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return GeneratorMetamodelsEditPlugin.INSTANCE;
	}

}
