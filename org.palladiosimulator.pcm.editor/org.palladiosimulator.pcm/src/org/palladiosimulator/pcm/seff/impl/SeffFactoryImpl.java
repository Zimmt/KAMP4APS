/**
 * Copyright 2005-2009 by SDQ, IPD, University of Karlsruhe, Germany
 */
package org.palladiosimulator.pcm.seff.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.palladiosimulator.pcm.seff.AcquireAction;
import org.palladiosimulator.pcm.seff.BranchAction;
import org.palladiosimulator.pcm.seff.CallReturnAction;
import org.palladiosimulator.pcm.seff.CollectionIteratorAction;
import org.palladiosimulator.pcm.seff.EmitEventAction;
import org.palladiosimulator.pcm.seff.ExternalCallAction;
import org.palladiosimulator.pcm.seff.ForkAction;
import org.palladiosimulator.pcm.seff.ForkedBehaviour;
import org.palladiosimulator.pcm.seff.GuardedBranchTransition;
import org.palladiosimulator.pcm.seff.InternalAction;
import org.palladiosimulator.pcm.seff.InternalCallAction;
import org.palladiosimulator.pcm.seff.LoopAction;
import org.palladiosimulator.pcm.seff.ProbabilisticBranchTransition;
import org.palladiosimulator.pcm.seff.ReleaseAction;
import org.palladiosimulator.pcm.seff.ResourceDemandingBehaviour;
import org.palladiosimulator.pcm.seff.ResourceDemandingInternalBehaviour;
import org.palladiosimulator.pcm.seff.ResourceDemandingSEFF;
import org.palladiosimulator.pcm.seff.SeffFactory;
import org.palladiosimulator.pcm.seff.SeffPackage;
import org.palladiosimulator.pcm.seff.SetVariableAction;
import org.palladiosimulator.pcm.seff.StartAction;
import org.palladiosimulator.pcm.seff.StopAction;
import org.palladiosimulator.pcm.seff.SynchronisationPoint;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 * @generated
 */
public class SeffFactoryImpl extends EFactoryImpl implements SeffFactory {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2005-2015 by palladiosimulator.org";

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static SeffFactory init() {
		try {
			SeffFactory theSeffFactory = (SeffFactory) EPackage.Registry.INSTANCE.getEFactory(SeffPackage.eNS_URI);
			if (theSeffFactory != null) {
				return theSeffFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SeffFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SeffFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case SeffPackage.STOP_ACTION:
			return createStopAction();
		case SeffPackage.RESOURCE_DEMANDING_BEHAVIOUR:
			return createResourceDemandingBehaviour();
		case SeffPackage.BRANCH_ACTION:
			return createBranchAction();
		case SeffPackage.START_ACTION:
			return createStartAction();
		case SeffPackage.RESOURCE_DEMANDING_SEFF:
			return createResourceDemandingSEFF();
		case SeffPackage.RESOURCE_DEMANDING_INTERNAL_BEHAVIOUR:
			return createResourceDemandingInternalBehaviour();
		case SeffPackage.RELEASE_ACTION:
			return createReleaseAction();
		case SeffPackage.LOOP_ACTION:
			return createLoopAction();
		case SeffPackage.FORK_ACTION:
			return createForkAction();
		case SeffPackage.FORKED_BEHAVIOUR:
			return createForkedBehaviour();
		case SeffPackage.SYNCHRONISATION_POINT:
			return createSynchronisationPoint();
		case SeffPackage.EXTERNAL_CALL_ACTION:
			return createExternalCallAction();
		case SeffPackage.CALL_RETURN_ACTION:
			return createCallReturnAction();
		case SeffPackage.PROBABILISTIC_BRANCH_TRANSITION:
			return createProbabilisticBranchTransition();
		case SeffPackage.ACQUIRE_ACTION:
			return createAcquireAction();
		case SeffPackage.COLLECTION_ITERATOR_ACTION:
			return createCollectionIteratorAction();
		case SeffPackage.GUARDED_BRANCH_TRANSITION:
			return createGuardedBranchTransition();
		case SeffPackage.SET_VARIABLE_ACTION:
			return createSetVariableAction();
		case SeffPackage.INTERNAL_CALL_ACTION:
			return createInternalCallAction();
		case SeffPackage.EMIT_EVENT_ACTION:
			return createEmitEventAction();
		case SeffPackage.INTERNAL_ACTION:
			return createInternalAction();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StopAction createStopAction() {
		StopActionImpl stopAction = new StopActionImpl();
		return stopAction;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceDemandingBehaviour createResourceDemandingBehaviour() {
		ResourceDemandingBehaviourImpl resourceDemandingBehaviour = new ResourceDemandingBehaviourImpl();
		return resourceDemandingBehaviour;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BranchAction createBranchAction() {
		BranchActionImpl branchAction = new BranchActionImpl();
		return branchAction;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StartAction createStartAction() {
		StartActionImpl startAction = new StartActionImpl();
		return startAction;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceDemandingSEFF createResourceDemandingSEFF() {
		ResourceDemandingSEFFImpl resourceDemandingSEFF = new ResourceDemandingSEFFImpl();
		return resourceDemandingSEFF;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceDemandingInternalBehaviour createResourceDemandingInternalBehaviour() {
		ResourceDemandingInternalBehaviourImpl resourceDemandingInternalBehaviour = new ResourceDemandingInternalBehaviourImpl();
		return resourceDemandingInternalBehaviour;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReleaseAction createReleaseAction() {
		ReleaseActionImpl releaseAction = new ReleaseActionImpl();
		return releaseAction;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LoopAction createLoopAction() {
		LoopActionImpl loopAction = new LoopActionImpl();
		return loopAction;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ForkAction createForkAction() {
		ForkActionImpl forkAction = new ForkActionImpl();
		return forkAction;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ForkedBehaviour createForkedBehaviour() {
		ForkedBehaviourImpl forkedBehaviour = new ForkedBehaviourImpl();
		return forkedBehaviour;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SynchronisationPoint createSynchronisationPoint() {
		SynchronisationPointImpl synchronisationPoint = new SynchronisationPointImpl();
		return synchronisationPoint;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExternalCallAction createExternalCallAction() {
		ExternalCallActionImpl externalCallAction = new ExternalCallActionImpl();
		return externalCallAction;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CallReturnAction createCallReturnAction() {
		CallReturnActionImpl callReturnAction = new CallReturnActionImpl();
		return callReturnAction;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProbabilisticBranchTransition createProbabilisticBranchTransition() {
		ProbabilisticBranchTransitionImpl probabilisticBranchTransition = new ProbabilisticBranchTransitionImpl();
		return probabilisticBranchTransition;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AcquireAction createAcquireAction() {
		AcquireActionImpl acquireAction = new AcquireActionImpl();
		return acquireAction;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CollectionIteratorAction createCollectionIteratorAction() {
		CollectionIteratorActionImpl collectionIteratorAction = new CollectionIteratorActionImpl();
		return collectionIteratorAction;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GuardedBranchTransition createGuardedBranchTransition() {
		GuardedBranchTransitionImpl guardedBranchTransition = new GuardedBranchTransitionImpl();
		return guardedBranchTransition;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SetVariableAction createSetVariableAction() {
		SetVariableActionImpl setVariableAction = new SetVariableActionImpl();
		return setVariableAction;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalCallAction createInternalCallAction() {
		InternalCallActionImpl internalCallAction = new InternalCallActionImpl();
		return internalCallAction;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EmitEventAction createEmitEventAction() {
		EmitEventActionImpl emitEventAction = new EmitEventActionImpl();
		return emitEventAction;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalAction createInternalAction() {
		InternalActionImpl internalAction = new InternalActionImpl();
		return internalAction;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SeffPackage getSeffPackage() {
		return (SeffPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SeffPackage getPackage() {
		return SeffPackage.eINSTANCE;
	}

} // SeffFactoryImpl
