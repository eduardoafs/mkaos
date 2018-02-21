/**
 */
package mKAOS;

import org.eclipse.emf.ecore.EFactory;

import mKAOS.impl.MKAOSFactoryImpl;

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
	 * @generated NOT
	 */
	MKAOSFactory eINSTANCE = MKAOSFactoryImpl.init();

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
