/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.provider;

import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.util.ModificationmarksAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ModificationmarksItemProviderAdapterFactory extends ModificationmarksAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModificationmarksItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.KAPSModificationRepository} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KAPSModificationRepositoryItemProvider kapsModificationRepositoryItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.KAPSModificationRepository}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createKAPSModificationRepositoryAdapter() {
		if (kapsModificationRepositoryItemProvider == null) {
			kapsModificationRepositoryItemProvider = new KAPSModificationRepositoryItemProvider(this);
		}

		return kapsModificationRepositoryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.KAPSSeedModifications} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KAPSSeedModificationsItemProvider kapsSeedModificationsItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.KAPSSeedModifications}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createKAPSSeedModificationsAdapter() {
		if (kapsSeedModificationsItemProvider == null) {
			kapsSeedModificationsItemProvider = new KAPSSeedModificationsItemProvider(this);
		}

		return kapsSeedModificationsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ChangePropagationDueToHardwareChange} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChangePropagationDueToHardwareChangeItemProvider changePropagationDueToHardwareChangeItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ChangePropagationDueToHardwareChange}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createChangePropagationDueToHardwareChangeAdapter() {
		if (changePropagationDueToHardwareChangeItemProvider == null) {
			changePropagationDueToHardwareChangeItemProvider = new ChangePropagationDueToHardwareChangeItemProvider(this);
		}

		return changePropagationDueToHardwareChangeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyComponent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModifyComponentItemProvider modifyComponentItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModifyComponentAdapter() {
		if (modifyComponentItemProvider == null) {
			modifyComponentItemProvider = new ModifyComponentItemProvider(this);
		}

		return modifyComponentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyModule} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModifyModuleItemProvider modifyModuleItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyModule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModifyModuleAdapter() {
		if (modifyModuleItemProvider == null) {
			modifyModuleItemProvider = new ModifyModuleItemProvider(this);
		}

		return modifyModuleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyStructure} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModifyStructureItemProvider modifyStructureItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyStructure}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModifyStructureAdapter() {
		if (modifyStructureItemProvider == null) {
			modifyStructureItemProvider = new ModifyStructureItemProvider(this);
		}

		return modifyStructureItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyInterface} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModifyInterfaceItemProvider modifyInterfaceItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyInterface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModifyInterfaceAdapter() {
		if (modifyInterfaceItemProvider == null) {
			modifyInterfaceItemProvider = new ModifyInterfaceItemProvider(this);
		}

		return modifyInterfaceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifySignalinterface} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModifySignalinterfaceItemProvider modifySignalinterfaceItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifySignalinterface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModifySignalinterfaceAdapter() {
		if (modifySignalinterfaceItemProvider == null) {
			modifySignalinterfaceItemProvider = new ModifySignalinterfaceItemProvider(this);
		}

		return modifySignalinterfaceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyPhysicalConnection} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModifyPhysicalConnectionItemProvider modifyPhysicalConnectionItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyPhysicalConnection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModifyPhysicalConnectionAdapter() {
		if (modifyPhysicalConnectionItemProvider == null) {
			modifyPhysicalConnectionItemProvider = new ModifyPhysicalConnectionItemProvider(this);
		}

		return modifyPhysicalConnectionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyMicroSwitchModule} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModifyMicroSwitchModuleItemProvider modifyMicroSwitchModuleItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyMicroSwitchModule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModifyMicroSwitchModuleAdapter() {
		if (modifyMicroSwitchModuleItemProvider == null) {
			modifyMicroSwitchModuleItemProvider = new ModifyMicroSwitchModuleItemProvider(this);
		}

		return modifyMicroSwitchModuleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyBusBox} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModifyBusBoxItemProvider modifyBusBoxItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyBusBox}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModifyBusBoxAdapter() {
		if (modifyBusBoxItemProvider == null) {
			modifyBusBoxItemProvider = new ModifyBusBoxItemProvider(this);
		}

		return modifyBusBoxItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyBusMaster} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModifyBusMasterItemProvider modifyBusMasterItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyBusMaster}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModifyBusMasterAdapter() {
		if (modifyBusMasterItemProvider == null) {
			modifyBusMasterItemProvider = new ModifyBusMasterItemProvider(this);
		}

		return modifyBusMasterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyBusSlave} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModifyBusSlaveItemProvider modifyBusSlaveItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyBusSlave}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModifyBusSlaveAdapter() {
		if (modifyBusSlaveItemProvider == null) {
			modifyBusSlaveItemProvider = new ModifyBusSlaveItemProvider(this);
		}

		return modifyBusSlaveItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyBusCable} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModifyBusCableItemProvider modifyBusCableItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyBusCable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModifyBusCableAdapter() {
		if (modifyBusCableItemProvider == null) {
			modifyBusCableItemProvider = new ModifyBusCableItemProvider(this);
		}

		return modifyBusCableItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifySensor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModifySensorItemProvider modifySensorItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifySensor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModifySensorAdapter() {
		if (modifySensorItemProvider == null) {
			modifySensorItemProvider = new ModifySensorItemProvider(this);
		}

		return modifySensorItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (kapsModificationRepositoryItemProvider != null) kapsModificationRepositoryItemProvider.dispose();
		if (kapsSeedModificationsItemProvider != null) kapsSeedModificationsItemProvider.dispose();
		if (changePropagationDueToHardwareChangeItemProvider != null) changePropagationDueToHardwareChangeItemProvider.dispose();
		if (modifyComponentItemProvider != null) modifyComponentItemProvider.dispose();
		if (modifyModuleItemProvider != null) modifyModuleItemProvider.dispose();
		if (modifyStructureItemProvider != null) modifyStructureItemProvider.dispose();
		if (modifyInterfaceItemProvider != null) modifyInterfaceItemProvider.dispose();
		if (modifySignalinterfaceItemProvider != null) modifySignalinterfaceItemProvider.dispose();
		if (modifyPhysicalConnectionItemProvider != null) modifyPhysicalConnectionItemProvider.dispose();
		if (modifyMicroSwitchModuleItemProvider != null) modifyMicroSwitchModuleItemProvider.dispose();
		if (modifyBusBoxItemProvider != null) modifyBusBoxItemProvider.dispose();
		if (modifyBusMasterItemProvider != null) modifyBusMasterItemProvider.dispose();
		if (modifyBusSlaveItemProvider != null) modifyBusSlaveItemProvider.dispose();
		if (modifyBusCableItemProvider != null) modifyBusCableItemProvider.dispose();
		if (modifySensorItemProvider != null) modifySensorItemProvider.dispose();
	}

}
