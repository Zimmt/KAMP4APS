/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.modificationmarks;

import org.eclipse.emf.ecore.EFactory;

import xPPU.ComponentRepository.Component;

import xPPU.InterfaceRepository.Interface;

import xPPU.ModuleRepository.Module;

import xPPU.StructureRepository.Structure;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModificationmarksPackage
 * @generated
 */
public interface ModificationmarksFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModificationmarksFactory eINSTANCE = edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.impl.ModificationmarksFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>KAPS Modification Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>KAPS Modification Repository</em>'.
	 * @generated
	 */
	KAPSModificationRepository createKAPSModificationRepository();

	/**
	 * Returns a new object of class '<em>KAPS Seed Modifications</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>KAPS Seed Modifications</em>'.
	 * @generated
	 */
	KAPSSeedModifications createKAPSSeedModifications();

	/**
	 * Returns a new object of class '<em>Change Propagation Due To Hardware Change</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Change Propagation Due To Hardware Change</em>'.
	 * @generated
	 */
	ChangePropagationDueToHardwareChange createChangePropagationDueToHardwareChange();

	/**
	 * Returns a new object of class '<em>Modify Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modify Component</em>'.
	 * @generated
	 */
	<T extends Component> ModifyComponent<T> createModifyComponent();

	/**
	 * Returns a new object of class '<em>Modify Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modify Module</em>'.
	 * @generated
	 */
	<T extends Module> ModifyModule<T> createModifyModule();

	/**
	 * Returns a new object of class '<em>Modify Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modify Structure</em>'.
	 * @generated
	 */
	<T extends Structure> ModifyStructure<T> createModifyStructure();

	/**
	 * Returns a new object of class '<em>Modify Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modify Interface</em>'.
	 * @generated
	 */
	<T extends Interface> ModifyInterface<T> createModifyInterface();

	/**
	 * Returns a new object of class '<em>Modify Signalinterface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modify Signalinterface</em>'.
	 * @generated
	 */
	ModifySignalinterface createModifySignalinterface();

	/**
	 * Returns a new object of class '<em>Modify Physical Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modify Physical Connection</em>'.
	 * @generated
	 */
	ModifyPhysicalConnection createModifyPhysicalConnection();

	/**
	 * Returns a new object of class '<em>Modify Micro Switch Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modify Micro Switch Module</em>'.
	 * @generated
	 */
	ModifyMicroSwitchModule createModifyMicroSwitchModule();

	/**
	 * Returns a new object of class '<em>Modify Bus Box</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modify Bus Box</em>'.
	 * @generated
	 */
	ModifyBusBox createModifyBusBox();

	/**
	 * Returns a new object of class '<em>Modify Bus Master</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modify Bus Master</em>'.
	 * @generated
	 */
	ModifyBusMaster createModifyBusMaster();

	/**
	 * Returns a new object of class '<em>Modify Bus Slave</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modify Bus Slave</em>'.
	 * @generated
	 */
	ModifyBusSlave createModifyBusSlave();

	/**
	 * Returns a new object of class '<em>Modify Bus Cable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modify Bus Cable</em>'.
	 * @generated
	 */
	ModifyBusCable createModifyBusCable();

	/**
	 * Returns a new object of class '<em>Modify Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modify Sensor</em>'.
	 * @generated
	 */
	ModifySensor createModifySensor();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ModificationmarksPackage getModificationmarksPackage();

} //ModificationmarksFactory
