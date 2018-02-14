/**
 */
package mKAOS.provider;


import KAOSModel.provider.GoalItemProvider;

import java.util.Collection;
import java.util.List;

import mKAOS.MKAOSFactory;
import mKAOS.MKAOSPackage;
import mKAOS.Mission;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link mKAOS.Mission} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MissionItemProvider extends GoalItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MissionItemProvider(AdapterFactory adapterFactory) {
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

			addPriorityPropertyDescriptor(object);
			addAssignedToPropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
			addTriggerPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Priority feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPriorityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Mission_priority_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Mission_priority_feature", "_UI_Mission_type"),
				 MKAOSPackage.Literals.MISSION__PRIORITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Assigned To feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAssignedToPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Mission_assignedTo_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Mission_assignedTo_feature", "_UI_Mission_type"),
				 MKAOSPackage.Literals.MISSION__ASSIGNED_TO,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Mission_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Mission_description_feature", "_UI_Mission_type"),
				 MKAOSPackage.Literals.MISSION__DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Trigger feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTriggerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Mission_trigger_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Mission_trigger_feature", "_UI_Mission_type"),
				 MKAOSPackage.Literals.MISSION__TRIGGER,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
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
			childrenFeatures.add(MKAOSPackage.Literals.FORMAL_ELEMENT__RULE);
			childrenFeatures.add(MKAOSPackage.Literals.MISSION__LINKS);
			childrenFeatures.add(MKAOSPackage.Literals.MISSION__REFINEMENT);
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
	 * This returns Mission.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Mission"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Mission)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Mission_type") :
			getString("_UI_Mission_type") + " " + label;
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

		switch (notification.getFeatureID(Mission.class)) {
			case MKAOSPackage.MISSION__PRIORITY:
			case MKAOSPackage.MISSION__DESCRIPTION:
			case MKAOSPackage.MISSION__TRIGGER:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case MKAOSPackage.MISSION__RULE:
			case MKAOSPackage.MISSION__LINKS:
			case MKAOSPackage.MISSION__REFINEMENT:
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

		newChildDescriptors.add
			(createChildParameter
				(MKAOSPackage.Literals.FORMAL_ELEMENT__RULE,
				 MKAOSFactory.eINSTANCE.createDynBLTL()));

		newChildDescriptors.add
			(createChildParameter
				(MKAOSPackage.Literals.FORMAL_ELEMENT__RULE,
				 MKAOSFactory.eINSTANCE.createRuleTemporal()));

		newChildDescriptors.add
			(createChildParameter
				(MKAOSPackage.Literals.MISSION__LINKS,
				 MKAOSFactory.eINSTANCE.createDisruptLink()));

		newChildDescriptors.add
			(createChildParameter
				(MKAOSPackage.Literals.MISSION__LINKS,
				 MKAOSFactory.eINSTANCE.createSuportLink()));

		newChildDescriptors.add
			(createChildParameter
				(MKAOSPackage.Literals.MISSION__LINKS,
				 MKAOSFactory.eINSTANCE.createBlockLink()));

		newChildDescriptors.add
			(createChildParameter
				(MKAOSPackage.Literals.MISSION__LINKS,
				 MKAOSFactory.eINSTANCE.createDependencyLink()));

		newChildDescriptors.add
			(createChildParameter
				(MKAOSPackage.Literals.MISSION__REFINEMENT,
				 MKAOSFactory.eINSTANCE.createMissionRefinement()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return MkaosEditPlugin.INSTANCE;
	}

}
