/**
 */
package KAOSModel.util;

import KAOSModel.Agent;
import KAOSModel.AndRefinement;
import KAOSModel.AssignmentLink;
import KAOSModel.Associations;
import KAOSModel.ConflictLink;
import KAOSModel.DomainHypothesis;
import KAOSModel.DomainInvariant;
import KAOSModel.DomainProperty;
import KAOSModel.Entity;
import KAOSModel.EnvironmentAgent;
import KAOSModel.Event;
import KAOSModel.Expectation;
import KAOSModel.Goal;
import KAOSModel.InputLink;
import KAOSModel.KAOS;
import KAOSModel.KAOSModelPackage;
import KAOSModel.Link;
import KAOSModel.Nodes;
import KAOSModel.Obstacle;
import KAOSModel.ObstructionLink;
import KAOSModel.OperacionalizationLink;
import KAOSModel.Operation;
import KAOSModel.OperationNode;
import KAOSModel.OrRefinement;
import KAOSModel.OutputLink;
import KAOSModel.RefinableNode;
import KAOSModel.Refinement;
import KAOSModel.Requirement;
import KAOSModel.ResolutionLink;
import KAOSModel.ResponsabilityLink;
import KAOSModel.SoftwareAgent;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see KAOSModel.KAOSModelPackage
 * @generated
 */
public class KAOSModelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static KAOSModelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KAOSModelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = KAOSModelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KAOSModelSwitch<Adapter> modelSwitch =
		new KAOSModelSwitch<Adapter>() {
			@Override
			public Adapter caseOperation(Operation object) {
				return createOperationAdapter();
			}
			@Override
			public Adapter caseKAOS(KAOS object) {
				return createKAOSAdapter();
			}
			@Override
			public Adapter caseLink(Link object) {
				return createLinkAdapter();
			}
			@Override
			public Adapter caseNodes(Nodes object) {
				return createNodesAdapter();
			}
			@Override
			public Adapter caseOperationNode(OperationNode object) {
				return createOperationNodeAdapter();
			}
			@Override
			public Adapter caseEvent(Event object) {
				return createEventAdapter();
			}
			@Override
			public Adapter caseEntity(Entity object) {
				return createEntityAdapter();
			}
			@Override
			public Adapter caseObject(KAOSModel.Object object) {
				return createObjectAdapter();
			}
			@Override
			public Adapter caseAssociations(Associations object) {
				return createAssociationsAdapter();
			}
			@Override
			public Adapter caseAgent(Agent object) {
				return createAgentAdapter();
			}
			@Override
			public Adapter caseSoftwareAgent(SoftwareAgent object) {
				return createSoftwareAgentAdapter();
			}
			@Override
			public Adapter caseEnvironmentAgent(EnvironmentAgent object) {
				return createEnvironmentAgentAdapter();
			}
			@Override
			public Adapter caseRefinableNode(RefinableNode object) {
				return createRefinableNodeAdapter();
			}
			@Override
			public Adapter caseObstacle(Obstacle object) {
				return createObstacleAdapter();
			}
			@Override
			public Adapter caseGoal(Goal object) {
				return createGoalAdapter();
			}
			@Override
			public Adapter caseAssignmentLink(AssignmentLink object) {
				return createAssignmentLinkAdapter();
			}
			@Override
			public Adapter caseConflictLink(ConflictLink object) {
				return createConflictLinkAdapter();
			}
			@Override
			public Adapter caseObstructionLink(ObstructionLink object) {
				return createObstructionLinkAdapter();
			}
			@Override
			public Adapter caseOutputLink(OutputLink object) {
				return createOutputLinkAdapter();
			}
			@Override
			public Adapter caseExpectation(Expectation object) {
				return createExpectationAdapter();
			}
			@Override
			public Adapter caseInputLink(InputLink object) {
				return createInputLinkAdapter();
			}
			@Override
			public Adapter caseRefinement(Refinement object) {
				return createRefinementAdapter();
			}
			@Override
			public Adapter caseAndRefinement(AndRefinement object) {
				return createAndRefinementAdapter();
			}
			@Override
			public Adapter caseOrRefinement(OrRefinement object) {
				return createOrRefinementAdapter();
			}
			@Override
			public Adapter caseDomainProperty(DomainProperty object) {
				return createDomainPropertyAdapter();
			}
			@Override
			public Adapter caseRequirement(Requirement object) {
				return createRequirementAdapter();
			}
			@Override
			public Adapter caseOperacionalizationLink(OperacionalizationLink object) {
				return createOperacionalizationLinkAdapter();
			}
			@Override
			public Adapter caseDomainHypothesis(DomainHypothesis object) {
				return createDomainHypothesisAdapter();
			}
			@Override
			public Adapter caseDomainInvariant(DomainInvariant object) {
				return createDomainInvariantAdapter();
			}
			@Override
			public Adapter caseResolutionLink(ResolutionLink object) {
				return createResolutionLinkAdapter();
			}
			@Override
			public Adapter caseResponsabilityLink(ResponsabilityLink object) {
				return createResponsabilityLinkAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link KAOSModel.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see KAOSModel.Operation
	 * @generated
	 */
	public Adapter createOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link KAOSModel.KAOS <em>KAOS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see KAOSModel.KAOS
	 * @generated
	 */
	public Adapter createKAOSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link KAOSModel.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see KAOSModel.Link
	 * @generated
	 */
	public Adapter createLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link KAOSModel.Nodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see KAOSModel.Nodes
	 * @generated
	 */
	public Adapter createNodesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link KAOSModel.OperationNode <em>Operation Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see KAOSModel.OperationNode
	 * @generated
	 */
	public Adapter createOperationNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link KAOSModel.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see KAOSModel.Event
	 * @generated
	 */
	public Adapter createEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link KAOSModel.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see KAOSModel.Entity
	 * @generated
	 */
	public Adapter createEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link KAOSModel.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see KAOSModel.Object
	 * @generated
	 */
	public Adapter createObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link KAOSModel.Associations <em>Associations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see KAOSModel.Associations
	 * @generated
	 */
	public Adapter createAssociationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link KAOSModel.Agent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see KAOSModel.Agent
	 * @generated
	 */
	public Adapter createAgentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link KAOSModel.SoftwareAgent <em>Software Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see KAOSModel.SoftwareAgent
	 * @generated
	 */
	public Adapter createSoftwareAgentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link KAOSModel.EnvironmentAgent <em>Environment Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see KAOSModel.EnvironmentAgent
	 * @generated
	 */
	public Adapter createEnvironmentAgentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link KAOSModel.RefinableNode <em>Refinable Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see KAOSModel.RefinableNode
	 * @generated
	 */
	public Adapter createRefinableNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link KAOSModel.Obstacle <em>Obstacle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see KAOSModel.Obstacle
	 * @generated
	 */
	public Adapter createObstacleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link KAOSModel.Goal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see KAOSModel.Goal
	 * @generated
	 */
	public Adapter createGoalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link KAOSModel.AssignmentLink <em>Assignment Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see KAOSModel.AssignmentLink
	 * @generated
	 */
	public Adapter createAssignmentLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link KAOSModel.ConflictLink <em>Conflict Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see KAOSModel.ConflictLink
	 * @generated
	 */
	public Adapter createConflictLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link KAOSModel.ObstructionLink <em>Obstruction Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see KAOSModel.ObstructionLink
	 * @generated
	 */
	public Adapter createObstructionLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link KAOSModel.OutputLink <em>Output Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see KAOSModel.OutputLink
	 * @generated
	 */
	public Adapter createOutputLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link KAOSModel.Expectation <em>Expectation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see KAOSModel.Expectation
	 * @generated
	 */
	public Adapter createExpectationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link KAOSModel.InputLink <em>Input Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see KAOSModel.InputLink
	 * @generated
	 */
	public Adapter createInputLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link KAOSModel.Refinement <em>Refinement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see KAOSModel.Refinement
	 * @generated
	 */
	public Adapter createRefinementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link KAOSModel.AndRefinement <em>And Refinement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see KAOSModel.AndRefinement
	 * @generated
	 */
	public Adapter createAndRefinementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link KAOSModel.OrRefinement <em>Or Refinement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see KAOSModel.OrRefinement
	 * @generated
	 */
	public Adapter createOrRefinementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link KAOSModel.DomainProperty <em>Domain Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see KAOSModel.DomainProperty
	 * @generated
	 */
	public Adapter createDomainPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link KAOSModel.Requirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see KAOSModel.Requirement
	 * @generated
	 */
	public Adapter createRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link KAOSModel.OperacionalizationLink <em>Operacionalization Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see KAOSModel.OperacionalizationLink
	 * @generated
	 */
	public Adapter createOperacionalizationLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link KAOSModel.DomainHypothesis <em>Domain Hypothesis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see KAOSModel.DomainHypothesis
	 * @generated
	 */
	public Adapter createDomainHypothesisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link KAOSModel.DomainInvariant <em>Domain Invariant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see KAOSModel.DomainInvariant
	 * @generated
	 */
	public Adapter createDomainInvariantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link KAOSModel.ResolutionLink <em>Resolution Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see KAOSModel.ResolutionLink
	 * @generated
	 */
	public Adapter createResolutionLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link KAOSModel.ResponsabilityLink <em>Responsability Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see KAOSModel.ResponsabilityLink
	 * @generated
	 */
	public Adapter createResponsabilityLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //KAOSModelAdapterFactory
