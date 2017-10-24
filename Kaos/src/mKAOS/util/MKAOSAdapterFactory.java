/**
 */
package mKAOS.util;

import mKAOS.AndRefinement;
import mKAOS.AssignmentLink;
import mKAOS.Associations;
import mKAOS.BlockLink;
import mKAOS.CommunicationInputLink;
import mKAOS.CommunicationLink;
import mKAOS.CommunicationOutputLink;
import mKAOS.CommunicationalCapability;
import mKAOS.CompositionLink;
import mKAOS.ConflictLink;
import mKAOS.ConstituentSystem;
import mKAOS.DependencyLink;
import mKAOS.DisruptLink;
import mKAOS.DomainHypothesis;
import mKAOS.DomainInvariant;
import mKAOS.DomainProperty;
import mKAOS.DynBLTL;
import mKAOS.EmergeLink;
import mKAOS.EmergentBehavior;
import mKAOS.Entity;
import mKAOS.EnvironmentAgent;
import mKAOS.Event;
import mKAOS.Expectation;
import mKAOS.FormalElement;
import mKAOS.GeneralizationLink;
import mKAOS.InfluenceLink;
import mKAOS.InputLink;
import mKAOS.MKAOSPackage;
import mKAOS.Mediator;
import mKAOS.Mission;
import mKAOS.MissionLink;
import mKAOS.MissionRefinement;
import mKAOS.Obstacle;
import mKAOS.ObstructionLink;
import mKAOS.OperacionalizationLink;
import mKAOS.OperationalCapability;
import mKAOS.OrRefinement;
import mKAOS.OutputLink;
import mKAOS.Requirement;
import mKAOS.ResolutionLink;
import mKAOS.ResponsabilityLink;
import mKAOS.RuleBound;
import mKAOS.RuleConjunction;
import mKAOS.RuleDisjunction;
import mKAOS.RuleEquality;
import mKAOS.RuleFactor;
import mKAOS.RuleFloatLit;
import mKAOS.RuleFunction;
import mKAOS.RuleImplication;
import mKAOS.RuleIntegerLit;
import mKAOS.RuleLiteral;
import mKAOS.RuleNumExp;
import mKAOS.RuleParams;
import mKAOS.RuleRelExp;
import mKAOS.RuleSeqLit;
import mKAOS.RuleTemporal;
import mKAOS.RuleTerm;
import mKAOS.RuleTupleLit;
import mKAOS.RuleVar;
import mKAOS.SuportLink;
import mKAOS.mKAOS;
import mKAOS.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see mKAOS.MKAOSPackage
 * @generated
 */
public class MKAOSAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MKAOSPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MKAOSAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MKAOSPackage.eINSTANCE;
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
	protected MKAOSSwitch<Adapter> modelSwitch =
		new MKAOSSwitch<Adapter>() {
			@Override
			public Adapter caseOperation(mKAOS.Operation object) {
				return createOperationAdapter();
			}
			@Override
			public Adapter caseKAOS(mKAOS.KAOS object) {
				return createKAOSAdapter();
			}
			@Override
			public Adapter caseLink(mKAOS.Link object) {
				return createLinkAdapter();
			}
			@Override
			public Adapter caseNodes(mKAOS.Nodes object) {
				return createNodesAdapter();
			}
			@Override
			public Adapter caseOperationNode(mKAOS.OperationNode object) {
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
			public Adapter caseObject(mKAOS.Object object) {
				return createObjectAdapter();
			}
			@Override
			public Adapter caseAssociations(Associations object) {
				return createAssociationsAdapter();
			}
			@Override
			public Adapter caseAgent(mKAOS.Agent object) {
				return createAgentAdapter();
			}
			@Override
			public Adapter caseSoftwareAgent(mKAOS.SoftwareAgent object) {
				return createSoftwareAgentAdapter();
			}
			@Override
			public Adapter caseEnvironmentAgent(EnvironmentAgent object) {
				return createEnvironmentAgentAdapter();
			}
			@Override
			public Adapter caseRefinableNode(mKAOS.RefinableNode object) {
				return createRefinableNodeAdapter();
			}
			@Override
			public Adapter caseObstacle(Obstacle object) {
				return createObstacleAdapter();
			}
			@Override
			public Adapter caseGoal(mKAOS.Goal object) {
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
			public Adapter caseRefinement(mKAOS.Refinement object) {
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
			public Adapter casemKAOS(mKAOS object) {
				return createmKAOSAdapter();
			}
			@Override
			public Adapter caseMission(Mission object) {
				return createMissionAdapter();
			}
			@Override
			public Adapter caseEmergentBehavior(EmergentBehavior object) {
				return createEmergentBehaviorAdapter();
			}
			@Override
			public Adapter caseConstituentSystem(ConstituentSystem object) {
				return createConstituentSystemAdapter();
			}
			@Override
			public Adapter caseMediator(Mediator object) {
				return createMediatorAdapter();
			}
			@Override
			public Adapter caseOperationalCapability(OperationalCapability object) {
				return createOperationalCapabilityAdapter();
			}
			@Override
			public Adapter caseCommunicationalCapability(CommunicationalCapability object) {
				return createCommunicationalCapabilityAdapter();
			}
			@Override
			public Adapter caseEmergeLink(EmergeLink object) {
				return createEmergeLinkAdapter();
			}
			@Override
			public Adapter caseCommunicationLink(CommunicationLink object) {
				return createCommunicationLinkAdapter();
			}
			@Override
			public Adapter caseCommunicationInputLink(CommunicationInputLink object) {
				return createCommunicationInputLinkAdapter();
			}
			@Override
			public Adapter caseCommunicationOutputLink(CommunicationOutputLink object) {
				return createCommunicationOutputLinkAdapter();
			}
			@Override
			public Adapter caseMissionLink(MissionLink object) {
				return createMissionLinkAdapter();
			}
			@Override
			public Adapter caseDisruptLink(DisruptLink object) {
				return createDisruptLinkAdapter();
			}
			@Override
			public Adapter caseSuportLink(SuportLink object) {
				return createSuportLinkAdapter();
			}
			@Override
			public Adapter caseBlockLink(BlockLink object) {
				return createBlockLinkAdapter();
			}
			@Override
			public Adapter caseDependencyLink(DependencyLink object) {
				return createDependencyLinkAdapter();
			}
			@Override
			public Adapter caseInfluenceLink(InfluenceLink object) {
				return createInfluenceLinkAdapter();
			}
			@Override
			public Adapter caseGeneralizationLink(GeneralizationLink object) {
				return createGeneralizationLinkAdapter();
			}
			@Override
			public Adapter caseCompositionLink(CompositionLink object) {
				return createCompositionLinkAdapter();
			}
			@Override
			public Adapter caseFormalElement(FormalElement object) {
				return createFormalElementAdapter();
			}
			@Override
			public Adapter caseMissionRefinement(MissionRefinement object) {
				return createMissionRefinementAdapter();
			}
			@Override
			public Adapter caseDynBLTL(DynBLTL object) {
				return createDynBLTLAdapter();
			}
			@Override
			public Adapter caseRuleTemporal(RuleTemporal object) {
				return createRuleTemporalAdapter();
			}
			@Override
			public Adapter caseRuleBound(RuleBound object) {
				return createRuleBoundAdapter();
			}
			@Override
			public Adapter caseRuleImplication(RuleImplication object) {
				return createRuleImplicationAdapter();
			}
			@Override
			public Adapter caseRuleDisjunction(RuleDisjunction object) {
				return createRuleDisjunctionAdapter();
			}
			@Override
			public Adapter caseRuleConjunction(RuleConjunction object) {
				return createRuleConjunctionAdapter();
			}
			@Override
			public Adapter caseRuleEquality(RuleEquality object) {
				return createRuleEqualityAdapter();
			}
			@Override
			public Adapter caseRuleRelExp(RuleRelExp object) {
				return createRuleRelExpAdapter();
			}
			@Override
			public Adapter caseRuleNumExp(RuleNumExp object) {
				return createRuleNumExpAdapter();
			}
			@Override
			public Adapter caseRuleTerm(RuleTerm object) {
				return createRuleTermAdapter();
			}
			@Override
			public Adapter caseRuleFactor(RuleFactor object) {
				return createRuleFactorAdapter();
			}
			@Override
			public Adapter caseRuleVar(RuleVar object) {
				return createRuleVarAdapter();
			}
			@Override
			public Adapter caseRuleFunction(RuleFunction object) {
				return createRuleFunctionAdapter();
			}
			@Override
			public Adapter caseRuleParams(RuleParams object) {
				return createRuleParamsAdapter();
			}
			@Override
			public Adapter caseRuleLiteral(RuleLiteral object) {
				return createRuleLiteralAdapter();
			}
			@Override
			public Adapter caseRuleIntegerLit(RuleIntegerLit object) {
				return createRuleIntegerLitAdapter();
			}
			@Override
			public Adapter caseRuleFloatLit(RuleFloatLit object) {
				return createRuleFloatLitAdapter();
			}
			@Override
			public Adapter caseRuleTupleLit(RuleTupleLit object) {
				return createRuleTupleLitAdapter();
			}
			@Override
			public Adapter caseRuleSeqLit(RuleSeqLit object) {
				return createRuleSeqLitAdapter();
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
	 * Creates a new adapter for an object of class '{@link mKAOS.mKAOS <em>mKAOS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mKAOS.mKAOS
	 * @generated
	 */
	public Adapter createmKAOSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mKAOS.Mission <em>Mission</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mKAOS.Mission
	 * @generated
	 */
	public Adapter createMissionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mKAOS.EmergentBehavior <em>Emergent Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mKAOS.EmergentBehavior
	 * @generated
	 */
	public Adapter createEmergentBehaviorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mKAOS.ConstituentSystem <em>Constituent System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mKAOS.ConstituentSystem
	 * @generated
	 */
	public Adapter createConstituentSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mKAOS.Mediator <em>Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mKAOS.Mediator
	 * @generated
	 */
	public Adapter createMediatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mKAOS.OperationalCapability <em>Operational Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mKAOS.OperationalCapability
	 * @generated
	 */
	public Adapter createOperationalCapabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mKAOS.CommunicationalCapability <em>Communicational Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mKAOS.CommunicationalCapability
	 * @generated
	 */
	public Adapter createCommunicationalCapabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mKAOS.EmergeLink <em>Emerge Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mKAOS.EmergeLink
	 * @generated
	 */
	public Adapter createEmergeLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mKAOS.CommunicationLink <em>Communication Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mKAOS.CommunicationLink
	 * @generated
	 */
	public Adapter createCommunicationLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mKAOS.CommunicationInputLink <em>Communication Input Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mKAOS.CommunicationInputLink
	 * @generated
	 */
	public Adapter createCommunicationInputLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mKAOS.CommunicationOutputLink <em>Communication Output Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mKAOS.CommunicationOutputLink
	 * @generated
	 */
	public Adapter createCommunicationOutputLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mKAOS.MissionLink <em>Mission Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mKAOS.MissionLink
	 * @generated
	 */
	public Adapter createMissionLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mKAOS.DisruptLink <em>Disrupt Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mKAOS.DisruptLink
	 * @generated
	 */
	public Adapter createDisruptLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mKAOS.SuportLink <em>Suport Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mKAOS.SuportLink
	 * @generated
	 */
	public Adapter createSuportLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mKAOS.BlockLink <em>Block Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mKAOS.BlockLink
	 * @generated
	 */
	public Adapter createBlockLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mKAOS.DependencyLink <em>Dependency Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mKAOS.DependencyLink
	 * @generated
	 */
	public Adapter createDependencyLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mKAOS.InfluenceLink <em>Influence Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mKAOS.InfluenceLink
	 * @generated
	 */
	public Adapter createInfluenceLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mKAOS.GeneralizationLink <em>Generalization Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mKAOS.GeneralizationLink
	 * @generated
	 */
	public Adapter createGeneralizationLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mKAOS.CompositionLink <em>Composition Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mKAOS.CompositionLink
	 * @generated
	 */
	public Adapter createCompositionLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mKAOS.FormalElement <em>Formal Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mKAOS.FormalElement
	 * @generated
	 */
	public Adapter createFormalElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mKAOS.MissionRefinement <em>Mission Refinement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mKAOS.MissionRefinement
	 * @generated
	 */
	public Adapter createMissionRefinementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mKAOS.DynBLTL <em>Dyn BLTL</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mKAOS.DynBLTL
	 * @generated
	 */
	public Adapter createDynBLTLAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mKAOS.RuleTemporal <em>Rule Temporal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mKAOS.RuleTemporal
	 * @generated
	 */
	public Adapter createRuleTemporalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mKAOS.RuleBound <em>Rule Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mKAOS.RuleBound
	 * @generated
	 */
	public Adapter createRuleBoundAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mKAOS.RuleImplication <em>Rule Implication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mKAOS.RuleImplication
	 * @generated
	 */
	public Adapter createRuleImplicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mKAOS.RuleDisjunction <em>Rule Disjunction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mKAOS.RuleDisjunction
	 * @generated
	 */
	public Adapter createRuleDisjunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mKAOS.RuleConjunction <em>Rule Conjunction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mKAOS.RuleConjunction
	 * @generated
	 */
	public Adapter createRuleConjunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mKAOS.RuleEquality <em>Rule Equality</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mKAOS.RuleEquality
	 * @generated
	 */
	public Adapter createRuleEqualityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mKAOS.RuleRelExp <em>Rule Rel Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mKAOS.RuleRelExp
	 * @generated
	 */
	public Adapter createRuleRelExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mKAOS.RuleNumExp <em>Rule Num Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mKAOS.RuleNumExp
	 * @generated
	 */
	public Adapter createRuleNumExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mKAOS.RuleTerm <em>Rule Term</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mKAOS.RuleTerm
	 * @generated
	 */
	public Adapter createRuleTermAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mKAOS.RuleFactor <em>Rule Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mKAOS.RuleFactor
	 * @generated
	 */
	public Adapter createRuleFactorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mKAOS.RuleVar <em>Rule Var</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mKAOS.RuleVar
	 * @generated
	 */
	public Adapter createRuleVarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mKAOS.RuleFunction <em>Rule Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mKAOS.RuleFunction
	 * @generated
	 */
	public Adapter createRuleFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mKAOS.RuleParams <em>Rule Params</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mKAOS.RuleParams
	 * @generated
	 */
	public Adapter createRuleParamsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mKAOS.RuleLiteral <em>Rule Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mKAOS.RuleLiteral
	 * @generated
	 */
	public Adapter createRuleLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mKAOS.RuleIntegerLit <em>Rule Integer Lit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mKAOS.RuleIntegerLit
	 * @generated
	 */
	public Adapter createRuleIntegerLitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mKAOS.RuleFloatLit <em>Rule Float Lit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mKAOS.RuleFloatLit
	 * @generated
	 */
	public Adapter createRuleFloatLitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mKAOS.RuleTupleLit <em>Rule Tuple Lit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mKAOS.RuleTupleLit
	 * @generated
	 */
	public Adapter createRuleTupleLitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mKAOS.RuleSeqLit <em>Rule Seq Lit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mKAOS.RuleSeqLit
	 * @generated
	 */
	public Adapter createRuleSeqLitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mKAOS.KAOS <em>KAOS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mKAOS.KAOS
	 * @generated
	 */
	public Adapter createKAOSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mKAOS.Nodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mKAOS.Nodes
	 * @generated
	 */
	public Adapter createNodesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mKAOS.RefinableNode <em>Refinable Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mKAOS.RefinableNode
	 * @generated
	 */
	public Adapter createRefinableNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mKAOS.Obstacle <em>Obstacle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mKAOS.Obstacle
	 * @generated
	 */
	public Adapter createObstacleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mKAOS.Goal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mKAOS.Goal
	 * @generated
	 */
	public Adapter createGoalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mKAOS.AssignmentLink <em>Assignment Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mKAOS.AssignmentLink
	 * @generated
	 */
	public Adapter createAssignmentLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mKAOS.ConflictLink <em>Conflict Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mKAOS.ConflictLink
	 * @generated
	 */
	public Adapter createConflictLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mKAOS.ObstructionLink <em>Obstruction Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mKAOS.ObstructionLink
	 * @generated
	 */
	public Adapter createObstructionLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mKAOS.OutputLink <em>Output Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mKAOS.OutputLink
	 * @generated
	 */
	public Adapter createOutputLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mKAOS.Expectation <em>Expectation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mKAOS.Expectation
	 * @generated
	 */
	public Adapter createExpectationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mKAOS.InputLink <em>Input Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mKAOS.InputLink
	 * @generated
	 */
	public Adapter createInputLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mKAOS.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mKAOS.Object
	 * @generated
	 */
	public Adapter createObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mKAOS.Associations <em>Associations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mKAOS.Associations
	 * @generated
	 */
	public Adapter createAssociationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mKAOS.Agent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mKAOS.Agent
	 * @generated
	 */
	public Adapter createAgentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mKAOS.SoftwareAgent <em>Software Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mKAOS.SoftwareAgent
	 * @generated
	 */
	public Adapter createSoftwareAgentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mKAOS.EnvironmentAgent <em>Environment Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mKAOS.EnvironmentAgent
	 * @generated
	 */
	public Adapter createEnvironmentAgentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mKAOS.OperationNode <em>Operation Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mKAOS.OperationNode
	 * @generated
	 */
	public Adapter createOperationNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mKAOS.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mKAOS.Event
	 * @generated
	 */
	public Adapter createEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mKAOS.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mKAOS.Entity
	 * @generated
	 */
	public Adapter createEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mKAOS.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mKAOS.Operation
	 * @generated
	 */
	public Adapter createOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mKAOS.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mKAOS.Link
	 * @generated
	 */
	public Adapter createLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mKAOS.Refinement <em>Refinement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mKAOS.Refinement
	 * @generated
	 */
	public Adapter createRefinementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mKAOS.AndRefinement <em>And Refinement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mKAOS.AndRefinement
	 * @generated
	 */
	public Adapter createAndRefinementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mKAOS.OrRefinement <em>Or Refinement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mKAOS.OrRefinement
	 * @generated
	 */
	public Adapter createOrRefinementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mKAOS.DomainProperty <em>Domain Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mKAOS.DomainProperty
	 * @generated
	 */
	public Adapter createDomainPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mKAOS.Requirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mKAOS.Requirement
	 * @generated
	 */
	public Adapter createRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mKAOS.OperacionalizationLink <em>Operacionalization Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mKAOS.OperacionalizationLink
	 * @generated
	 */
	public Adapter createOperacionalizationLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mKAOS.DomainHypothesis <em>Domain Hypothesis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mKAOS.DomainHypothesis
	 * @generated
	 */
	public Adapter createDomainHypothesisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mKAOS.DomainInvariant <em>Domain Invariant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mKAOS.DomainInvariant
	 * @generated
	 */
	public Adapter createDomainInvariantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mKAOS.ResolutionLink <em>Resolution Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mKAOS.ResolutionLink
	 * @generated
	 */
	public Adapter createResolutionLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mKAOS.ResponsabilityLink <em>Responsability Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mKAOS.ResponsabilityLink
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

} //MKAOSAdapterFactory
