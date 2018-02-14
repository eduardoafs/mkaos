/**
 */
package KAOSModel.provider;


import KAOSModel.KAOS;
import KAOSModel.KAOSModelFactory;
import KAOSModel.KAOSModelPackage;

import java.util.Collection;
import java.util.List;

import mKAOS.MKAOSFactory;

import mKAOS.provider.MkaosEditPlugin;

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
 * This is the item provider adapter for a {@link KAOSModel.KAOS} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class KAOSItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KAOSItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_KAOS_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_KAOS_name_feature", "_UI_KAOS_type"),
				 KAOSModelPackage.Literals.KAOS__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
			childrenFeatures.add(KAOSModelPackage.Literals.KAOS__LINKED_BY);
			childrenFeatures.add(KAOSModelPackage.Literals.KAOS__CONSISTS_OF);
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
	 * This returns KAOS.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/KAOS"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((KAOS)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_KAOS_type") :
			getString("_UI_KAOS_type") + " " + label;
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

		switch (notification.getFeatureID(KAOS.class)) {
			case KAOSModelPackage.KAOS__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case KAOSModelPackage.KAOS__LINKED_BY:
			case KAOSModelPackage.KAOS__CONSISTS_OF:
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
				(KAOSModelPackage.Literals.KAOS__LINKED_BY,
				 KAOSModelFactory.eINSTANCE.createAssignmentLink()));

		newChildDescriptors.add
			(createChildParameter
				(KAOSModelPackage.Literals.KAOS__LINKED_BY,
				 KAOSModelFactory.eINSTANCE.createConflictLink()));

		newChildDescriptors.add
			(createChildParameter
				(KAOSModelPackage.Literals.KAOS__LINKED_BY,
				 KAOSModelFactory.eINSTANCE.createObstructionLink()));

		newChildDescriptors.add
			(createChildParameter
				(KAOSModelPackage.Literals.KAOS__LINKED_BY,
				 KAOSModelFactory.eINSTANCE.createOutputLink()));

		newChildDescriptors.add
			(createChildParameter
				(KAOSModelPackage.Literals.KAOS__LINKED_BY,
				 KAOSModelFactory.eINSTANCE.createInputLink()));

		newChildDescriptors.add
			(createChildParameter
				(KAOSModelPackage.Literals.KAOS__LINKED_BY,
				 KAOSModelFactory.eINSTANCE.createRefinement()));

		newChildDescriptors.add
			(createChildParameter
				(KAOSModelPackage.Literals.KAOS__LINKED_BY,
				 KAOSModelFactory.eINSTANCE.createAndRefinement()));

		newChildDescriptors.add
			(createChildParameter
				(KAOSModelPackage.Literals.KAOS__LINKED_BY,
				 KAOSModelFactory.eINSTANCE.createOrRefinement()));

		newChildDescriptors.add
			(createChildParameter
				(KAOSModelPackage.Literals.KAOS__LINKED_BY,
				 KAOSModelFactory.eINSTANCE.createOperacionalizationLink()));

		newChildDescriptors.add
			(createChildParameter
				(KAOSModelPackage.Literals.KAOS__LINKED_BY,
				 KAOSModelFactory.eINSTANCE.createResolutionLink()));

		newChildDescriptors.add
			(createChildParameter
				(KAOSModelPackage.Literals.KAOS__LINKED_BY,
				 KAOSModelFactory.eINSTANCE.createResponsabilityLink()));

		newChildDescriptors.add
			(createChildParameter
				(KAOSModelPackage.Literals.KAOS__LINKED_BY,
				 MKAOSFactory.eINSTANCE.createEmergeLink()));

		newChildDescriptors.add
			(createChildParameter
				(KAOSModelPackage.Literals.KAOS__LINKED_BY,
				 MKAOSFactory.eINSTANCE.createCommunicationInputLink()));

		newChildDescriptors.add
			(createChildParameter
				(KAOSModelPackage.Literals.KAOS__LINKED_BY,
				 MKAOSFactory.eINSTANCE.createCommunicationOutputLink()));

		newChildDescriptors.add
			(createChildParameter
				(KAOSModelPackage.Literals.KAOS__LINKED_BY,
				 MKAOSFactory.eINSTANCE.createDisruptLink()));

		newChildDescriptors.add
			(createChildParameter
				(KAOSModelPackage.Literals.KAOS__LINKED_BY,
				 MKAOSFactory.eINSTANCE.createSuportLink()));

		newChildDescriptors.add
			(createChildParameter
				(KAOSModelPackage.Literals.KAOS__LINKED_BY,
				 MKAOSFactory.eINSTANCE.createBlockLink()));

		newChildDescriptors.add
			(createChildParameter
				(KAOSModelPackage.Literals.KAOS__LINKED_BY,
				 MKAOSFactory.eINSTANCE.createDependencyLink()));

		newChildDescriptors.add
			(createChildParameter
				(KAOSModelPackage.Literals.KAOS__LINKED_BY,
				 MKAOSFactory.eINSTANCE.createInfluenceLink()));

		newChildDescriptors.add
			(createChildParameter
				(KAOSModelPackage.Literals.KAOS__LINKED_BY,
				 MKAOSFactory.eINSTANCE.createGeneralizationLink()));

		newChildDescriptors.add
			(createChildParameter
				(KAOSModelPackage.Literals.KAOS__LINKED_BY,
				 MKAOSFactory.eINSTANCE.createCompositionLink()));

		newChildDescriptors.add
			(createChildParameter
				(KAOSModelPackage.Literals.KAOS__LINKED_BY,
				 MKAOSFactory.eINSTANCE.createMissionRefinement()));

		newChildDescriptors.add
			(createChildParameter
				(KAOSModelPackage.Literals.KAOS__CONSISTS_OF,
				 KAOSModelFactory.eINSTANCE.createOperationNode()));

		newChildDescriptors.add
			(createChildParameter
				(KAOSModelPackage.Literals.KAOS__CONSISTS_OF,
				 KAOSModelFactory.eINSTANCE.createOperation()));

		newChildDescriptors.add
			(createChildParameter
				(KAOSModelPackage.Literals.KAOS__CONSISTS_OF,
				 KAOSModelFactory.eINSTANCE.createEvent()));

		newChildDescriptors.add
			(createChildParameter
				(KAOSModelPackage.Literals.KAOS__CONSISTS_OF,
				 KAOSModelFactory.eINSTANCE.createEntity()));

		newChildDescriptors.add
			(createChildParameter
				(KAOSModelPackage.Literals.KAOS__CONSISTS_OF,
				 KAOSModelFactory.eINSTANCE.createAssociations()));

		newChildDescriptors.add
			(createChildParameter
				(KAOSModelPackage.Literals.KAOS__CONSISTS_OF,
				 KAOSModelFactory.eINSTANCE.createSoftwareAgent()));

		newChildDescriptors.add
			(createChildParameter
				(KAOSModelPackage.Literals.KAOS__CONSISTS_OF,
				 KAOSModelFactory.eINSTANCE.createEnvironmentAgent()));

		newChildDescriptors.add
			(createChildParameter
				(KAOSModelPackage.Literals.KAOS__CONSISTS_OF,
				 KAOSModelFactory.eINSTANCE.createObstacle()));

		newChildDescriptors.add
			(createChildParameter
				(KAOSModelPackage.Literals.KAOS__CONSISTS_OF,
				 KAOSModelFactory.eINSTANCE.createGoal()));

		newChildDescriptors.add
			(createChildParameter
				(KAOSModelPackage.Literals.KAOS__CONSISTS_OF,
				 KAOSModelFactory.eINSTANCE.createExpectation()));

		newChildDescriptors.add
			(createChildParameter
				(KAOSModelPackage.Literals.KAOS__CONSISTS_OF,
				 KAOSModelFactory.eINSTANCE.createDomainProperty()));

		newChildDescriptors.add
			(createChildParameter
				(KAOSModelPackage.Literals.KAOS__CONSISTS_OF,
				 KAOSModelFactory.eINSTANCE.createRequirement()));

		newChildDescriptors.add
			(createChildParameter
				(KAOSModelPackage.Literals.KAOS__CONSISTS_OF,
				 KAOSModelFactory.eINSTANCE.createDomainHypothesis()));

		newChildDescriptors.add
			(createChildParameter
				(KAOSModelPackage.Literals.KAOS__CONSISTS_OF,
				 KAOSModelFactory.eINSTANCE.createDomainInvariant()));

		newChildDescriptors.add
			(createChildParameter
				(KAOSModelPackage.Literals.KAOS__CONSISTS_OF,
				 MKAOSFactory.eINSTANCE.createMission()));

		newChildDescriptors.add
			(createChildParameter
				(KAOSModelPackage.Literals.KAOS__CONSISTS_OF,
				 MKAOSFactory.eINSTANCE.createEmergentBehavior()));

		newChildDescriptors.add
			(createChildParameter
				(KAOSModelPackage.Literals.KAOS__CONSISTS_OF,
				 MKAOSFactory.eINSTANCE.createConstituentSystem()));

		newChildDescriptors.add
			(createChildParameter
				(KAOSModelPackage.Literals.KAOS__CONSISTS_OF,
				 MKAOSFactory.eINSTANCE.createMediator()));

		newChildDescriptors.add
			(createChildParameter
				(KAOSModelPackage.Literals.KAOS__CONSISTS_OF,
				 MKAOSFactory.eINSTANCE.createOperationalCapability()));

		newChildDescriptors.add
			(createChildParameter
				(KAOSModelPackage.Literals.KAOS__CONSISTS_OF,
				 MKAOSFactory.eINSTANCE.createCommunicationalCapability()));
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
