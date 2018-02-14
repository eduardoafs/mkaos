/**
 */
package mKAOS.util;

import KAOSModel.Agent;
import KAOSModel.Goal;
import KAOSModel.KAOS;
import KAOSModel.Link;
import KAOSModel.Nodes;
import KAOSModel.Operation;
import KAOSModel.OperationNode;
import KAOSModel.RefinableNode;
import KAOSModel.Refinement;
import KAOSModel.SoftwareAgent;

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
			public Adapter caseKAOS(KAOS object) {
				return createKAOSAdapter();
			}
			@Override
			public Adapter caseNodes(Nodes object) {
				return createNodesAdapter();
			}
			@Override
			public Adapter caseRefinableNode(RefinableNode object) {
				return createRefinableNodeAdapter();
			}
			@Override
			public Adapter caseGoal(Goal object) {
				return createGoalAdapter();
			}
			@Override
			public Adapter caseObject(KAOSModel.Object object) {
				return createObjectAdapter();
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
			public Adapter caseOperationNode(OperationNode object) {
				return createOperationNodeAdapter();
			}
			@Override
			public Adapter caseOperation(Operation object) {
				return createOperationAdapter();
			}
			@Override
			public Adapter caseLink(Link object) {
				return createLinkAdapter();
			}
			@Override
			public Adapter caseRefinement(Refinement object) {
				return createRefinementAdapter();
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
