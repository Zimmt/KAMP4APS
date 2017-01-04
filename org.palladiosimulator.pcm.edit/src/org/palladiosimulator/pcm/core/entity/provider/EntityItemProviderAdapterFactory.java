/**
 * Copyright 2005-2009 by SDQ, IPD, University of Karlsruhe, Germany
 */
package org.palladiosimulator.pcm.core.entity.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ChildCreationExtenderManager;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.palladiosimulator.pcm.core.entity.EntityPackage;
import org.palladiosimulator.pcm.core.entity.util.EntityAdapterFactory;
import org.palladiosimulator.pcm.core.provider.PalladioComponentModelEditPlugin;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * @generated
 */
public class EntityItemProviderAdapterFactory extends EntityAdapterFactory
		implements ComposeableAdapterFactory, IChangeNotifier, IDisposable, IChildCreationExtender {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2005-2015 by palladiosimulator.org";

	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This helps manage the child creation extenders.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ChildCreationExtenderManager childCreationExtenderManager = new ChildCreationExtenderManager(
			PalladioComponentModelEditPlugin.INSTANCE, EntityPackage.eNS_URI);

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EntityItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all
	 * {@link org.palladiosimulator.pcm.core.entity.ResourceProvidedRole} instances. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected ResourceProvidedRoleItemProvider resourceProvidedRoleItemProvider;

	/**
	 * This creates an adapter for a {@link org.palladiosimulator.pcm.core.entity.ResourceProvidedRole}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createResourceProvidedRoleAdapter() {
		if (resourceProvidedRoleItemProvider == null) {
			resourceProvidedRoleItemProvider = new ResourceProvidedRoleItemProvider(this);
		}

		return resourceProvidedRoleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.palladiosimulator.pcm.core.entity.ResourceInterfaceRequiringEntity} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceInterfaceRequiringEntityItemProvider resourceInterfaceRequiringEntityItemProvider;

	/**
	 * This creates an adapter for a
	 * {@link org.palladiosimulator.pcm.core.entity.ResourceInterfaceRequiringEntity}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Adapter createResourceInterfaceRequiringEntityAdapter() {
		if (resourceInterfaceRequiringEntityItemProvider == null) {
			resourceInterfaceRequiringEntityItemProvider = new ResourceInterfaceRequiringEntityItemProvider(this);
		}

		return resourceInterfaceRequiringEntityItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all
	 * {@link org.palladiosimulator.pcm.core.entity.ResourceRequiredRole} instances. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected ResourceRequiredRoleItemProvider resourceRequiredRoleItemProvider;

	/**
	 * This creates an adapter for a {@link org.palladiosimulator.pcm.core.entity.ResourceRequiredRole}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createResourceRequiredRoleAdapter() {
		if (resourceRequiredRoleItemProvider == null) {
			resourceRequiredRoleItemProvider = new ResourceRequiredRoleItemProvider(this);
		}

		return resourceRequiredRoleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.palladiosimulator.pcm.core.entity.ResourceInterfaceProvidingEntity} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceInterfaceProvidingEntityItemProvider resourceInterfaceProvidingEntityItemProvider;

	/**
	 * This creates an adapter for a
	 * {@link org.palladiosimulator.pcm.core.entity.ResourceInterfaceProvidingEntity}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Adapter createResourceInterfaceProvidingEntityAdapter() {
		if (resourceInterfaceProvidingEntityItemProvider == null) {
			resourceInterfaceProvidingEntityItemProvider = new ResourceInterfaceProvidingEntityItemProvider(this);
		}

		return resourceInterfaceProvidingEntityItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.palladiosimulator.pcm.core.entity.ResourceInterfaceProvidingRequiringEntity} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceInterfaceProvidingRequiringEntityItemProvider resourceInterfaceProvidingRequiringEntityItemProvider;

	/**
	 * This creates an adapter for a
	 * {@link org.palladiosimulator.pcm.core.entity.ResourceInterfaceProvidingRequiringEntity}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Adapter createResourceInterfaceProvidingRequiringEntityAdapter() {
		if (resourceInterfaceProvidingRequiringEntityItemProvider == null) {
			resourceInterfaceProvidingRequiringEntityItemProvider = new ResourceInterfaceProvidingRequiringEntityItemProvider(
					this);
		}

		return resourceInterfaceProvidingRequiringEntityItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public List<IChildCreationExtender> getChildCreationExtenders() {
		return childCreationExtenderManager.getChildCreationExtenders();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<?> getNewChildDescriptors(Object object, EditingDomain editingDomain) {
		return childCreationExtenderManager.getNewChildDescriptors(object, editingDomain);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return childCreationExtenderManager;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	public void dispose() {
		if (resourceProvidedRoleItemProvider != null)
			resourceProvidedRoleItemProvider.dispose();
		if (resourceInterfaceRequiringEntityItemProvider != null)
			resourceInterfaceRequiringEntityItemProvider.dispose();
		if (resourceRequiredRoleItemProvider != null)
			resourceRequiredRoleItemProvider.dispose();
		if (resourceInterfaceProvidingEntityItemProvider != null)
			resourceInterfaceProvidingEntityItemProvider.dispose();
		if (resourceInterfaceProvidingRequiringEntityItemProvider != null)
			resourceInterfaceProvidingRequiringEntityItemProvider.dispose();
	}

}
