/**
 */
package mKAOS.impl;

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
