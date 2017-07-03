/**
 */
package DeploymentContext.provider;

import edu.kit.ipd.sdq.kamp4aps.iec.ComponentInternalDependencies.provider.ComponentInternalDependenciesEditPlugin;

import edu.kit.ipd.sdq.kamp4aps.iec.IECModel.provider.IECModelEditPlugin;

import edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.provider.IECRepositoryEditPlugin;

import org.eclipse.emf.common.EMFPlugin;

import org.eclipse.emf.common.util.ResourceLocator;

import xPPU.provider.XPPUEditPlugin;


/**
 * This is the central singleton for the Deploymentcontext edit plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class DeploymentcontextEditPlugin extends EMFPlugin {
	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final DeploymentcontextEditPlugin INSTANCE = new DeploymentcontextEditPlugin();

	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static Implementation plugin;

	/**
	 * Create the instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentcontextEditPlugin() {
		super
		  (new ResourceLocator [] {
		     ComponentInternalDependenciesEditPlugin.INSTANCE,
		     IECModelEditPlugin.INSTANCE,
		     IECRepositoryEditPlugin.INSTANCE,
		     XPPUEditPlugin.INSTANCE,
		   });
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
	@Override
	public ResourceLocator getPluginResourceLocator() {
		return plugin;
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
	public static Implementation getPlugin() {
		return plugin;
	}

	/**
	 * The actual implementation of the Eclipse <b>Plugin</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static class Implementation extends EclipsePlugin {
		/**
		 * Creates an instance.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public Implementation() {
			super();

			// Remember the static instance.
			//
			plugin = this;
		}
	}

}
