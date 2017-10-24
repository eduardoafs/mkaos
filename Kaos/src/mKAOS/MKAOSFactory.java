/**
 */
package mKAOS;

import org.eclipse.emf.ecore.EFactory;
import mKAOS.impl.*;
/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see mKAOS.MKAOSPackage
 * @generated
 */
public interface MKAOSFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MKAOSFactory eINSTANCE = mKAOS.impl.MKAOSFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation</em>'.
	 * @generated
	 */
	Operation createOperation();

	/**
	 * Returns a new object of class '<em>KAOS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>KAOS</em>'.
	 * @generated
	 */
	KAOS createKAOS();

	/**
	 * Returns a new object of class '<em>Operation Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation Node</em>'.
	 * @generated
	 */
	OperationNode createOperationNode();

	/**
	 * Returns a new object of class '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event</em>'.
	 * @generated
	 */
	Event createEvent();

	/**
	 * Returns a new object of class '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity</em>'.
	 * @generated
	 */
	Entity createEntity();

	/**
	 * Returns a new object of class '<em>Associations</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Associations</em>'.
	 * @generated
	 */
	Associations createAssociations();

	/**
	 * Returns a new object of class '<em>Software Agent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Software Agent</em>'.
	 * @generated
	 */
	SoftwareAgent createSoftwareAgent();

	/**
	 * Returns a new object of class '<em>Environment Agent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Environment Agent</em>'.
	 * @generated
	 */
	EnvironmentAgent createEnvironmentAgent();

	/**
	 * Returns a new object of class '<em>Obstacle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Obstacle</em>'.
	 * @generated
	 */
	Obstacle createObstacle();

	/**
	 * Returns a new object of class '<em>Goal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Goal</em>'.
	 * @generated
	 */
	Goal createGoal();

	/**
	 * Returns a new object of class '<em>Assignment Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assignment Link</em>'.
	 * @generated
	 */
	AssignmentLink createAssignmentLink();

	/**
	 * Returns a new object of class '<em>Conflict Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conflict Link</em>'.
	 * @generated
	 */
	ConflictLink createConflictLink();

	/**
	 * Returns a new object of class '<em>Obstruction Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Obstruction Link</em>'.
	 * @generated
	 */
	ObstructionLink createObstructionLink();

	/**
	 * Returns a new object of class '<em>Output Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Output Link</em>'.
	 * @generated
	 */
	OutputLink createOutputLink();

	/**
	 * Returns a new object of class '<em>Expectation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expectation</em>'.
	 * @generated
	 */
	Expectation createExpectation();

	/**
	 * Returns a new object of class '<em>Input Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Link</em>'.
	 * @generated
	 */
	InputLink createInputLink();

	/**
	 * Returns a new object of class '<em>Refinement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Refinement</em>'.
	 * @generated
	 */
	Refinement createRefinement();

	/**
	 * Returns a new object of class '<em>And Refinement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>And Refinement</em>'.
	 * @generated
	 */
	AndRefinement createAndRefinement();

	/**
	 * Returns a new object of class '<em>Or Refinement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Or Refinement</em>'.
	 * @generated
	 */
	OrRefinement createOrRefinement();

	/**
	 * Returns a new object of class '<em>Domain Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain Property</em>'.
	 * @generated
	 */
	DomainProperty createDomainProperty();

	/**
	 * Returns a new object of class '<em>Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Requirement</em>'.
	 * @generated
	 */
	Requirement createRequirement();

	/**
	 * Returns a new object of class '<em>Operacionalization Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operacionalization Link</em>'.
	 * @generated
	 */
	OperacionalizationLink createOperacionalizationLink();

	/**
	 * Returns a new object of class '<em>Domain Hypothesis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain Hypothesis</em>'.
	 * @generated
	 */
	DomainHypothesis createDomainHypothesis();

	/**
	 * Returns a new object of class '<em>Domain Invariant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain Invariant</em>'.
	 * @generated
	 */
	DomainInvariant createDomainInvariant();

	/**
	 * Returns a new object of class '<em>Resolution Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resolution Link</em>'.
	 * @generated
	 */
	ResolutionLink createResolutionLink();

	/**
	 * Returns a new object of class '<em>Responsability Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Responsability Link</em>'.
	 * @generated
	 */
	ResponsabilityLink createResponsabilityLink();

	/**
	 * Returns a new object of class '<em>mKAOS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>mKAOS</em>'.
	 * @generated
	 */
	mKAOS createmKAOS();

	/**
	 * Returns a new object of class '<em>Mission</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mission</em>'.
	 * @generated
	 */
	Mission createMission();

	/**
	 * Returns a new object of class '<em>Emergent Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Emergent Behavior</em>'.
	 * @generated
	 */
	EmergentBehavior createEmergentBehavior();

	/**
	 * Returns a new object of class '<em>Constituent System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constituent System</em>'.
	 * @generated
	 */
	ConstituentSystem createConstituentSystem();

	/**
	 * Returns a new object of class '<em>Mediator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mediator</em>'.
	 * @generated
	 */
	Mediator createMediator();

	/**
	 * Returns a new object of class '<em>Operational Capability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operational Capability</em>'.
	 * @generated
	 */
	OperationalCapability createOperationalCapability();

	/**
	 * Returns a new object of class '<em>Communicational Capability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Communicational Capability</em>'.
	 * @generated
	 */
	CommunicationalCapability createCommunicationalCapability();

	/**
	 * Returns a new object of class '<em>Emerge Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Emerge Link</em>'.
	 * @generated
	 */
	EmergeLink createEmergeLink();

	/**
	 * Returns a new object of class '<em>Communication Input Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Communication Input Link</em>'.
	 * @generated
	 */
	CommunicationInputLink createCommunicationInputLink();

	/**
	 * Returns a new object of class '<em>Communication Output Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Communication Output Link</em>'.
	 * @generated
	 */
	CommunicationOutputLink createCommunicationOutputLink();

	/**
	 * Returns a new object of class '<em>Disrupt Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Disrupt Link</em>'.
	 * @generated
	 */
	DisruptLink createDisruptLink();

	/**
	 * Returns a new object of class '<em>Suport Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Suport Link</em>'.
	 * @generated
	 */
	SuportLink createSuportLink();

	/**
	 * Returns a new object of class '<em>Block Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Block Link</em>'.
	 * @generated
	 */
	BlockLink createBlockLink();

	/**
	 * Returns a new object of class '<em>Dependency Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dependency Link</em>'.
	 * @generated
	 */
	DependencyLink createDependencyLink();

	/**
	 * Returns a new object of class '<em>Influence Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Influence Link</em>'.
	 * @generated
	 */
	InfluenceLink createInfluenceLink();

	/**
	 * Returns a new object of class '<em>Generalization Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generalization Link</em>'.
	 * @generated
	 */
	GeneralizationLink createGeneralizationLink();

	/**
	 * Returns a new object of class '<em>Composition Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composition Link</em>'.
	 * @generated
	 */
	CompositionLink createCompositionLink();

	/**
	 * Returns a new object of class '<em>Mission Refinement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mission Refinement</em>'.
	 * @generated
	 */
	MissionRefinement createMissionRefinement();

	/**
	 * Returns a new object of class '<em>Dyn BLTL</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dyn BLTL</em>'.
	 * @generated
	 */
	DynBLTL createDynBLTL();

	/**
	 * Returns a new object of class '<em>Rule Temporal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rule Temporal</em>'.
	 * @generated
	 */
	RuleTemporal createRuleTemporal();

	/**
	 * Returns a new object of class '<em>Rule Bound</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rule Bound</em>'.
	 * @generated
	 */
	RuleBound createRuleBound();

	/**
	 * Returns a new object of class '<em>Rule Implication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rule Implication</em>'.
	 * @generated
	 */
	RuleImplication createRuleImplication();

	/**
	 * Returns a new object of class '<em>Rule Disjunction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rule Disjunction</em>'.
	 * @generated
	 */
	RuleDisjunction createRuleDisjunction();

	/**
	 * Returns a new object of class '<em>Rule Conjunction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rule Conjunction</em>'.
	 * @generated
	 */
	RuleConjunction createRuleConjunction();

	/**
	 * Returns a new object of class '<em>Rule Equality</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rule Equality</em>'.
	 * @generated
	 */
	RuleEquality createRuleEquality();

	/**
	 * Returns a new object of class '<em>Rule Rel Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rule Rel Exp</em>'.
	 * @generated
	 */
	RuleRelExp createRuleRelExp();

	/**
	 * Returns a new object of class '<em>Rule Num Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rule Num Exp</em>'.
	 * @generated
	 */
	RuleNumExp createRuleNumExp();

	/**
	 * Returns a new object of class '<em>Rule Term</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rule Term</em>'.
	 * @generated
	 */
	RuleTerm createRuleTerm();

	/**
	 * Returns a new object of class '<em>Rule Factor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rule Factor</em>'.
	 * @generated
	 */
	RuleFactor createRuleFactor();

	/**
	 * Returns a new object of class '<em>Rule Var</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rule Var</em>'.
	 * @generated
	 */
	RuleVar createRuleVar();

	/**
	 * Returns a new object of class '<em>Rule Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rule Function</em>'.
	 * @generated
	 */
	RuleFunction createRuleFunction();

	/**
	 * Returns a new object of class '<em>Rule Params</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rule Params</em>'.
	 * @generated
	 */
	RuleParams createRuleParams();

	/**
	 * Returns a new object of class '<em>Rule Integer Lit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rule Integer Lit</em>'.
	 * @generated
	 */
	RuleIntegerLit createRuleIntegerLit();

	/**
	 * Returns a new object of class '<em>Rule Float Lit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rule Float Lit</em>'.
	 * @generated
	 */
	RuleFloatLit createRuleFloatLit();

	/**
	 * Returns a new object of class '<em>Rule Tuple Lit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rule Tuple Lit</em>'.
	 * @generated
	 */
	RuleTupleLit createRuleTupleLit();

	/**
	 * Returns a new object of class '<em>Rule Seq Lit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rule Seq Lit</em>'.
	 * @generated
	 */
	RuleSeqLit createRuleSeqLit();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MKAOSPackage getMKAOSPackage();

} //MKAOSFactory
