/**
 */
package mKAOS.impl;

import mKAOS.AndRefinement;
import mKAOS.AssignmentLink;
import mKAOS.Associations;
import mKAOS.BlockLink;
import mKAOS.CommunicationInputLink;
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
import mKAOS.GeneralizationLink;
import mKAOS.Goal;
import mKAOS.InfluenceLink;
import mKAOS.InputLink;
import mKAOS.KAOS;
import mKAOS.MKAOSFactory;
import mKAOS.MKAOSPackage;
import mKAOS.Mediator;
import mKAOS.Mission;
import mKAOS.MissionRefinement;
import mKAOS.MissionRefinementKind;
import mKAOS.Obstacle;
import mKAOS.ObstructionLink;
import mKAOS.OperacionalizationLink;
import mKAOS.Operation;
import mKAOS.OperationNode;
import mKAOS.OperationalCapability;
import mKAOS.OrRefinement;
import mKAOS.OutputLink;
import mKAOS.Refinement;
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
import mKAOS.RuleNumExp;
import mKAOS.RuleParams;
import mKAOS.RuleQuantifier;
import mKAOS.RuleRelExp;
import mKAOS.RuleSeqLit;
import mKAOS.RuleTempBinOp;
import mKAOS.RuleTempUnOp;
import mKAOS.RuleTemporal;
import mKAOS.RuleTerm;
import mKAOS.RuleTupleLit;
import mKAOS.RuleVar;
import mKAOS.SoftwareAgent;
import mKAOS.SuportLink;
import mKAOS.mKAOS;
import mKAOS.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MKAOSFactoryImpl extends EFactoryImpl implements MKAOSFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MKAOSFactory init() {
		try {
			MKAOSFactory theMKAOSFactory = (MKAOSFactory)EPackage.Registry.INSTANCE.getEFactory(MKAOSPackage.eNS_URI);
			if (theMKAOSFactory != null) {
				return theMKAOSFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MKAOSFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MKAOSFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MKAOSPackage.OPERATION: return createOperation();
			case MKAOSPackage.KAOS: return createKAOS();
			case MKAOSPackage.OPERATION_NODE: return createOperationNode();
			case MKAOSPackage.EVENT: return createEvent();
			case MKAOSPackage.ENTITY: return createEntity();
			case MKAOSPackage.ASSOCIATIONS: return createAssociations();
			case MKAOSPackage.SOFTWARE_AGENT: return createSoftwareAgent();
			case MKAOSPackage.ENVIRONMENT_AGENT: return createEnvironmentAgent();
			case MKAOSPackage.OBSTACLE: return createObstacle();
			case MKAOSPackage.GOAL: return createGoal();
			case MKAOSPackage.ASSIGNMENT_LINK: return createAssignmentLink();
			case MKAOSPackage.CONFLICT_LINK: return createConflictLink();
			case MKAOSPackage.OBSTRUCTION_LINK: return createObstructionLink();
			case MKAOSPackage.OUTPUT_LINK: return createOutputLink();
			case MKAOSPackage.EXPECTATION: return createExpectation();
			case MKAOSPackage.INPUT_LINK: return createInputLink();
			case MKAOSPackage.REFINEMENT: return createRefinement();
			case MKAOSPackage.AND_REFINEMENT: return createAndRefinement();
			case MKAOSPackage.OR_REFINEMENT: return createOrRefinement();
			case MKAOSPackage.DOMAIN_PROPERTY: return createDomainProperty();
			case MKAOSPackage.REQUIREMENT: return createRequirement();
			case MKAOSPackage.OPERACIONALIZATION_LINK: return createOperacionalizationLink();
			case MKAOSPackage.DOMAIN_HYPOTHESIS: return createDomainHypothesis();
			case MKAOSPackage.DOMAIN_INVARIANT: return createDomainInvariant();
			case MKAOSPackage.RESOLUTION_LINK: return createResolutionLink();
			case MKAOSPackage.RESPONSABILITY_LINK: return createResponsabilityLink();
			case MKAOSPackage.MKAOS: return createmKAOS();
			case MKAOSPackage.MISSION: return createMission();
			case MKAOSPackage.EMERGENT_BEHAVIOR: return createEmergentBehavior();
			case MKAOSPackage.CONSTITUENT_SYSTEM: return createConstituentSystem();
			case MKAOSPackage.MEDIATOR: return createMediator();
			case MKAOSPackage.OPERATIONAL_CAPABILITY: return createOperationalCapability();
			case MKAOSPackage.COMMUNICATIONAL_CAPABILITY: return createCommunicationalCapability();
			case MKAOSPackage.EMERGE_LINK: return createEmergeLink();
			case MKAOSPackage.COMMUNICATION_INPUT_LINK: return createCommunicationInputLink();
			case MKAOSPackage.COMMUNICATION_OUTPUT_LINK: return createCommunicationOutputLink();
			case MKAOSPackage.DISRUPT_LINK: return createDisruptLink();
			case MKAOSPackage.SUPORT_LINK: return createSuportLink();
			case MKAOSPackage.BLOCK_LINK: return createBlockLink();
			case MKAOSPackage.DEPENDENCY_LINK: return createDependencyLink();
			case MKAOSPackage.INFLUENCE_LINK: return createInfluenceLink();
			case MKAOSPackage.GENERALIZATION_LINK: return createGeneralizationLink();
			case MKAOSPackage.COMPOSITION_LINK: return createCompositionLink();
			case MKAOSPackage.MISSION_REFINEMENT: return createMissionRefinement();
			case MKAOSPackage.DYN_BLTL: return createDynBLTL();
			case MKAOSPackage.RULE_TEMPORAL: return createRuleTemporal();
			case MKAOSPackage.RULE_BOUND: return createRuleBound();
			case MKAOSPackage.RULE_IMPLICATION: return createRuleImplication();
			case MKAOSPackage.RULE_DISJUNCTION: return createRuleDisjunction();
			case MKAOSPackage.RULE_CONJUNCTION: return createRuleConjunction();
			case MKAOSPackage.RULE_EQUALITY: return createRuleEquality();
			case MKAOSPackage.RULE_REL_EXP: return createRuleRelExp();
			case MKAOSPackage.RULE_NUM_EXP: return createRuleNumExp();
			case MKAOSPackage.RULE_TERM: return createRuleTerm();
			case MKAOSPackage.RULE_FACTOR: return createRuleFactor();
			case MKAOSPackage.RULE_VAR: return createRuleVar();
			case MKAOSPackage.RULE_FUNCTION: return createRuleFunction();
			case MKAOSPackage.RULE_PARAMS: return createRuleParams();
			case MKAOSPackage.RULE_INTEGER_LIT: return createRuleIntegerLit();
			case MKAOSPackage.RULE_FLOAT_LIT: return createRuleFloatLit();
			case MKAOSPackage.RULE_TUPLE_LIT: return createRuleTupleLit();
			case MKAOSPackage.RULE_SEQ_LIT: return createRuleSeqLit();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case MKAOSPackage.MISSION_REFINEMENT_KIND:
				return createMissionRefinementKindFromString(eDataType, initialValue);
			case MKAOSPackage.RULE_QUANTIFIER:
				return createRuleQuantifierFromString(eDataType, initialValue);
			case MKAOSPackage.RULE_TEMP_BIN_OP:
				return createRuleTempBinOpFromString(eDataType, initialValue);
			case MKAOSPackage.RULE_TEMP_UN_OP:
				return createRuleTempUnOpFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case MKAOSPackage.MISSION_REFINEMENT_KIND:
				return convertMissionRefinementKindToString(eDataType, instanceValue);
			case MKAOSPackage.RULE_QUANTIFIER:
				return convertRuleQuantifierToString(eDataType, instanceValue);
			case MKAOSPackage.RULE_TEMP_BIN_OP:
				return convertRuleTempBinOpToString(eDataType, instanceValue);
			case MKAOSPackage.RULE_TEMP_UN_OP:
				return convertRuleTempUnOpToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation createOperation() {
		OperationImpl operation = new OperationImpl();
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KAOS createKAOS() {
		KAOSImpl kaos = new KAOSImpl();
		return kaos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationNode createOperationNode() {
		OperationNodeImpl operationNode = new OperationNodeImpl();
		return operationNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event createEvent() {
		EventImpl event = new EventImpl();
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity createEntity() {
		EntityImpl entity = new EntityImpl();
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Associations createAssociations() {
		AssociationsImpl associations = new AssociationsImpl();
		return associations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareAgent createSoftwareAgent() {
		SoftwareAgentImpl softwareAgent = new SoftwareAgentImpl();
		return softwareAgent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvironmentAgent createEnvironmentAgent() {
		EnvironmentAgentImpl environmentAgent = new EnvironmentAgentImpl();
		return environmentAgent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Obstacle createObstacle() {
		ObstacleImpl obstacle = new ObstacleImpl();
		return obstacle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Goal createGoal() {
		GoalImpl goal = new GoalImpl();
		return goal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssignmentLink createAssignmentLink() {
		AssignmentLinkImpl assignmentLink = new AssignmentLinkImpl();
		return assignmentLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConflictLink createConflictLink() {
		ConflictLinkImpl conflictLink = new ConflictLinkImpl();
		return conflictLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObstructionLink createObstructionLink() {
		ObstructionLinkImpl obstructionLink = new ObstructionLinkImpl();
		return obstructionLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputLink createOutputLink() {
		OutputLinkImpl outputLink = new OutputLinkImpl();
		return outputLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expectation createExpectation() {
		ExpectationImpl expectation = new ExpectationImpl();
		return expectation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputLink createInputLink() {
		InputLinkImpl inputLink = new InputLinkImpl();
		return inputLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Refinement createRefinement() {
		RefinementImpl refinement = new RefinementImpl();
		return refinement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AndRefinement createAndRefinement() {
		AndRefinementImpl andRefinement = new AndRefinementImpl();
		return andRefinement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrRefinement createOrRefinement() {
		OrRefinementImpl orRefinement = new OrRefinementImpl();
		return orRefinement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainProperty createDomainProperty() {
		DomainPropertyImpl domainProperty = new DomainPropertyImpl();
		return domainProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirement createRequirement() {
		RequirementImpl requirement = new RequirementImpl();
		return requirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperacionalizationLink createOperacionalizationLink() {
		OperacionalizationLinkImpl operacionalizationLink = new OperacionalizationLinkImpl();
		return operacionalizationLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainHypothesis createDomainHypothesis() {
		DomainHypothesisImpl domainHypothesis = new DomainHypothesisImpl();
		return domainHypothesis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainInvariant createDomainInvariant() {
		DomainInvariantImpl domainInvariant = new DomainInvariantImpl();
		return domainInvariant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResolutionLink createResolutionLink() {
		ResolutionLinkImpl resolutionLink = new ResolutionLinkImpl();
		return resolutionLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponsabilityLink createResponsabilityLink() {
		ResponsabilityLinkImpl responsabilityLink = new ResponsabilityLinkImpl();
		return responsabilityLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public mKAOS createmKAOS() {
		mKAOSImpl mKAOS = new mKAOSImpl();
		return mKAOS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mission createMission() {
		MissionImpl mission = new MissionImpl();
		return mission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmergentBehavior createEmergentBehavior() {
		EmergentBehaviorImpl emergentBehavior = new EmergentBehaviorImpl();
		return emergentBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstituentSystem createConstituentSystem() {
		ConstituentSystemImpl constituentSystem = new ConstituentSystemImpl();
		return constituentSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mediator createMediator() {
		MediatorImpl mediator = new MediatorImpl();
		return mediator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalCapability createOperationalCapability() {
		OperationalCapabilityImpl operationalCapability = new OperationalCapabilityImpl();
		return operationalCapability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationalCapability createCommunicationalCapability() {
		CommunicationalCapabilityImpl communicationalCapability = new CommunicationalCapabilityImpl();
		return communicationalCapability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmergeLink createEmergeLink() {
		EmergeLinkImpl emergeLink = new EmergeLinkImpl();
		return emergeLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationInputLink createCommunicationInputLink() {
		CommunicationInputLinkImpl communicationInputLink = new CommunicationInputLinkImpl();
		return communicationInputLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationOutputLink createCommunicationOutputLink() {
		CommunicationOutputLinkImpl communicationOutputLink = new CommunicationOutputLinkImpl();
		return communicationOutputLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisruptLink createDisruptLink() {
		DisruptLinkImpl disruptLink = new DisruptLinkImpl();
		return disruptLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuportLink createSuportLink() {
		SuportLinkImpl suportLink = new SuportLinkImpl();
		return suportLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockLink createBlockLink() {
		BlockLinkImpl blockLink = new BlockLinkImpl();
		return blockLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependencyLink createDependencyLink() {
		DependencyLinkImpl dependencyLink = new DependencyLinkImpl();
		return dependencyLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfluenceLink createInfluenceLink() {
		InfluenceLinkImpl influenceLink = new InfluenceLinkImpl();
		return influenceLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralizationLink createGeneralizationLink() {
		GeneralizationLinkImpl generalizationLink = new GeneralizationLinkImpl();
		return generalizationLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositionLink createCompositionLink() {
		CompositionLinkImpl compositionLink = new CompositionLinkImpl();
		return compositionLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MissionRefinement createMissionRefinement() {
		MissionRefinementImpl missionRefinement = new MissionRefinementImpl();
		return missionRefinement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DynBLTL createDynBLTL() {
		DynBLTLImpl dynBLTL = new DynBLTLImpl();
		return dynBLTL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleTemporal createRuleTemporal() {
		RuleTemporalImpl ruleTemporal = new RuleTemporalImpl();
		return ruleTemporal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleBound createRuleBound() {
		RuleBoundImpl ruleBound = new RuleBoundImpl();
		return ruleBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleImplication createRuleImplication() {
		RuleImplicationImpl ruleImplication = new RuleImplicationImpl();
		return ruleImplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleDisjunction createRuleDisjunction() {
		RuleDisjunctionImpl ruleDisjunction = new RuleDisjunctionImpl();
		return ruleDisjunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleConjunction createRuleConjunction() {
		RuleConjunctionImpl ruleConjunction = new RuleConjunctionImpl();
		return ruleConjunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleEquality createRuleEquality() {
		RuleEqualityImpl ruleEquality = new RuleEqualityImpl();
		return ruleEquality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleRelExp createRuleRelExp() {
		RuleRelExpImpl ruleRelExp = new RuleRelExpImpl();
		return ruleRelExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleNumExp createRuleNumExp() {
		RuleNumExpImpl ruleNumExp = new RuleNumExpImpl();
		return ruleNumExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleTerm createRuleTerm() {
		RuleTermImpl ruleTerm = new RuleTermImpl();
		return ruleTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleFactor createRuleFactor() {
		RuleFactorImpl ruleFactor = new RuleFactorImpl();
		return ruleFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleVar createRuleVar() {
		RuleVarImpl ruleVar = new RuleVarImpl();
		return ruleVar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleFunction createRuleFunction() {
		RuleFunctionImpl ruleFunction = new RuleFunctionImpl();
		return ruleFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleParams createRuleParams() {
		RuleParamsImpl ruleParams = new RuleParamsImpl();
		return ruleParams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleIntegerLit createRuleIntegerLit() {
		RuleIntegerLitImpl ruleIntegerLit = new RuleIntegerLitImpl();
		return ruleIntegerLit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleFloatLit createRuleFloatLit() {
		RuleFloatLitImpl ruleFloatLit = new RuleFloatLitImpl();
		return ruleFloatLit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleTupleLit createRuleTupleLit() {
		RuleTupleLitImpl ruleTupleLit = new RuleTupleLitImpl();
		return ruleTupleLit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleSeqLit createRuleSeqLit() {
		RuleSeqLitImpl ruleSeqLit = new RuleSeqLitImpl();
		return ruleSeqLit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MissionRefinementKind createMissionRefinementKindFromString(EDataType eDataType, String initialValue) {
		MissionRefinementKind result = MissionRefinementKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMissionRefinementKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleQuantifier createRuleQuantifierFromString(EDataType eDataType, String initialValue) {
		RuleQuantifier result = RuleQuantifier.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRuleQuantifierToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleTempBinOp createRuleTempBinOpFromString(EDataType eDataType, String initialValue) {
		RuleTempBinOp result = RuleTempBinOp.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRuleTempBinOpToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleTempUnOp createRuleTempUnOpFromString(EDataType eDataType, String initialValue) {
		RuleTempUnOp result = RuleTempUnOp.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRuleTempUnOpToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MKAOSPackage getMKAOSPackage() {
		return (MKAOSPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MKAOSPackage getPackage() {
		return MKAOSPackage.eINSTANCE;
	}

} //MKAOSFactoryImpl
