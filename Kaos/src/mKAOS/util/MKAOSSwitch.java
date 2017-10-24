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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see mKAOS.MKAOSPackage
 * @generated
 */
public class MKAOSSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MKAOSPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MKAOSSwitch() {
		if (modelPackage == null) {
			modelPackage = MKAOSPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case MKAOSPackage.OPERATION: {
				mKAOS.Operation operation = (mKAOS.Operation)theEObject;
				T result = caseOperation(operation);
				if (result == null) result = caseOperationNode(operation);
				if (result == null) result = caseNodes(operation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MKAOSPackage.KAOS: {
				mKAOS.KAOS kaos = (mKAOS.KAOS)theEObject;
				T result = caseKAOS(kaos);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MKAOSPackage.LINK: {
				mKAOS.Link link = (mKAOS.Link)theEObject;
				T result = caseLink(link);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MKAOSPackage.NODES: {
				mKAOS.Nodes nodes = (mKAOS.Nodes)theEObject;
				T result = caseNodes(nodes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MKAOSPackage.OPERATION_NODE: {
				mKAOS.OperationNode operationNode = (mKAOS.OperationNode)theEObject;
				T result = caseOperationNode(operationNode);
				if (result == null) result = caseNodes(operationNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MKAOSPackage.EVENT: {
				Event event = (Event)theEObject;
				T result = caseEvent(event);
				if (result == null) result = caseOperationNode(event);
				if (result == null) result = caseNodes(event);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MKAOSPackage.ENTITY: {
				Entity entity = (Entity)theEObject;
				T result = caseEntity(entity);
				if (result == null) result = caseObject(entity);
				if (result == null) result = caseNodes(entity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MKAOSPackage.OBJECT: {
				mKAOS.Object object = (mKAOS.Object)theEObject;
				T result = caseObject(object);
				if (result == null) result = caseNodes(object);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MKAOSPackage.ASSOCIATIONS: {
				Associations associations = (Associations)theEObject;
				T result = caseAssociations(associations);
				if (result == null) result = caseObject(associations);
				if (result == null) result = caseNodes(associations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MKAOSPackage.AGENT: {
				mKAOS.Agent agent = (mKAOS.Agent)theEObject;
				T result = caseAgent(agent);
				if (result == null) result = caseObject(agent);
				if (result == null) result = caseNodes(agent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MKAOSPackage.SOFTWARE_AGENT: {
				mKAOS.SoftwareAgent softwareAgent = (mKAOS.SoftwareAgent)theEObject;
				T result = caseSoftwareAgent(softwareAgent);
				if (result == null) result = caseAgent(softwareAgent);
				if (result == null) result = caseObject(softwareAgent);
				if (result == null) result = caseNodes(softwareAgent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MKAOSPackage.ENVIRONMENT_AGENT: {
				EnvironmentAgent environmentAgent = (EnvironmentAgent)theEObject;
				T result = caseEnvironmentAgent(environmentAgent);
				if (result == null) result = caseAgent(environmentAgent);
				if (result == null) result = caseObject(environmentAgent);
				if (result == null) result = caseNodes(environmentAgent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MKAOSPackage.REFINABLE_NODE: {
				mKAOS.RefinableNode refinableNode = (mKAOS.RefinableNode)theEObject;
				T result = caseRefinableNode(refinableNode);
				if (result == null) result = caseNodes(refinableNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MKAOSPackage.OBSTACLE: {
				Obstacle obstacle = (Obstacle)theEObject;
				T result = caseObstacle(obstacle);
				if (result == null) result = caseRefinableNode(obstacle);
				if (result == null) result = caseNodes(obstacle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MKAOSPackage.GOAL: {
				mKAOS.Goal goal = (mKAOS.Goal)theEObject;
				T result = caseGoal(goal);
				if (result == null) result = caseRefinableNode(goal);
				if (result == null) result = caseNodes(goal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MKAOSPackage.ASSIGNMENT_LINK: {
				AssignmentLink assignmentLink = (AssignmentLink)theEObject;
				T result = caseAssignmentLink(assignmentLink);
				if (result == null) result = caseLink(assignmentLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MKAOSPackage.CONFLICT_LINK: {
				ConflictLink conflictLink = (ConflictLink)theEObject;
				T result = caseConflictLink(conflictLink);
				if (result == null) result = caseLink(conflictLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MKAOSPackage.OBSTRUCTION_LINK: {
				ObstructionLink obstructionLink = (ObstructionLink)theEObject;
				T result = caseObstructionLink(obstructionLink);
				if (result == null) result = caseLink(obstructionLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MKAOSPackage.OUTPUT_LINK: {
				OutputLink outputLink = (OutputLink)theEObject;
				T result = caseOutputLink(outputLink);
				if (result == null) result = caseLink(outputLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MKAOSPackage.EXPECTATION: {
				Expectation expectation = (Expectation)theEObject;
				T result = caseExpectation(expectation);
				if (result == null) result = caseGoal(expectation);
				if (result == null) result = caseRefinableNode(expectation);
				if (result == null) result = caseNodes(expectation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MKAOSPackage.INPUT_LINK: {
				InputLink inputLink = (InputLink)theEObject;
				T result = caseInputLink(inputLink);
				if (result == null) result = caseLink(inputLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MKAOSPackage.REFINEMENT: {
				mKAOS.Refinement refinement = (mKAOS.Refinement)theEObject;
				T result = caseRefinement(refinement);
				if (result == null) result = caseLink(refinement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MKAOSPackage.AND_REFINEMENT: {
				AndRefinement andRefinement = (AndRefinement)theEObject;
				T result = caseAndRefinement(andRefinement);
				if (result == null) result = caseRefinement(andRefinement);
				if (result == null) result = caseLink(andRefinement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MKAOSPackage.OR_REFINEMENT: {
				OrRefinement orRefinement = (OrRefinement)theEObject;
				T result = caseOrRefinement(orRefinement);
				if (result == null) result = caseRefinement(orRefinement);
				if (result == null) result = caseLink(orRefinement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MKAOSPackage.DOMAIN_PROPERTY: {
				DomainProperty domainProperty = (DomainProperty)theEObject;
				T result = caseDomainProperty(domainProperty);
				if (result == null) result = caseGoal(domainProperty);
				if (result == null) result = caseRefinableNode(domainProperty);
				if (result == null) result = caseNodes(domainProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MKAOSPackage.REQUIREMENT: {
				Requirement requirement = (Requirement)theEObject;
				T result = caseRequirement(requirement);
				if (result == null) result = caseGoal(requirement);
				if (result == null) result = caseRefinableNode(requirement);
				if (result == null) result = caseNodes(requirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MKAOSPackage.OPERACIONALIZATION_LINK: {
				OperacionalizationLink operacionalizationLink = (OperacionalizationLink)theEObject;
				T result = caseOperacionalizationLink(operacionalizationLink);
				if (result == null) result = caseLink(operacionalizationLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MKAOSPackage.DOMAIN_HYPOTHESIS: {
				DomainHypothesis domainHypothesis = (DomainHypothesis)theEObject;
				T result = caseDomainHypothesis(domainHypothesis);
				if (result == null) result = caseDomainProperty(domainHypothesis);
				if (result == null) result = caseGoal(domainHypothesis);
				if (result == null) result = caseRefinableNode(domainHypothesis);
				if (result == null) result = caseNodes(domainHypothesis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MKAOSPackage.DOMAIN_INVARIANT: {
				DomainInvariant domainInvariant = (DomainInvariant)theEObject;
				T result = caseDomainInvariant(domainInvariant);
				if (result == null) result = caseDomainProperty(domainInvariant);
				if (result == null) result = caseGoal(domainInvariant);
				if (result == null) result = caseRefinableNode(domainInvariant);
				if (result == null) result = caseNodes(domainInvariant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MKAOSPackage.RESOLUTION_LINK: {
				ResolutionLink resolutionLink = (ResolutionLink)theEObject;
				T result = caseResolutionLink(resolutionLink);
				if (result == null) result = caseLink(resolutionLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MKAOSPackage.RESPONSABILITY_LINK: {
				ResponsabilityLink responsabilityLink = (ResponsabilityLink)theEObject;
				T result = caseResponsabilityLink(responsabilityLink);
				if (result == null) result = caseLink(responsabilityLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MKAOSPackage.MKAOS: {
				mKAOS mKAOS = (mKAOS)theEObject;
				T result = casemKAOS(mKAOS);
				if (result == null) result = caseKAOS(mKAOS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MKAOSPackage.MISSION: {
				Mission mission = (Mission)theEObject;
				T result = caseMission(mission);
				if (result == null) result = caseGoal(mission);
				if (result == null) result = caseFormalElement(mission);
				if (result == null) result = caseRefinableNode(mission);
				if (result == null) result = caseNodes(mission);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MKAOSPackage.EMERGENT_BEHAVIOR: {
				EmergentBehavior emergentBehavior = (EmergentBehavior)theEObject;
				T result = caseEmergentBehavior(emergentBehavior);
				if (result == null) result = caseNodes(emergentBehavior);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MKAOSPackage.CONSTITUENT_SYSTEM: {
				ConstituentSystem constituentSystem = (ConstituentSystem)theEObject;
				T result = caseConstituentSystem(constituentSystem);
				if (result == null) result = caseSoftwareAgent(constituentSystem);
				if (result == null) result = caseAgent(constituentSystem);
				if (result == null) result = caseObject(constituentSystem);
				if (result == null) result = caseNodes(constituentSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MKAOSPackage.MEDIATOR: {
				Mediator mediator = (Mediator)theEObject;
				T result = caseMediator(mediator);
				if (result == null) result = caseSoftwareAgent(mediator);
				if (result == null) result = caseAgent(mediator);
				if (result == null) result = caseObject(mediator);
				if (result == null) result = caseNodes(mediator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MKAOSPackage.OPERATIONAL_CAPABILITY: {
				OperationalCapability operationalCapability = (OperationalCapability)theEObject;
				T result = caseOperationalCapability(operationalCapability);
				if (result == null) result = caseOperation(operationalCapability);
				if (result == null) result = caseOperationNode(operationalCapability);
				if (result == null) result = caseNodes(operationalCapability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MKAOSPackage.COMMUNICATIONAL_CAPABILITY: {
				CommunicationalCapability communicationalCapability = (CommunicationalCapability)theEObject;
				T result = caseCommunicationalCapability(communicationalCapability);
				if (result == null) result = caseOperation(communicationalCapability);
				if (result == null) result = caseOperationNode(communicationalCapability);
				if (result == null) result = caseNodes(communicationalCapability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MKAOSPackage.EMERGE_LINK: {
				EmergeLink emergeLink = (EmergeLink)theEObject;
				T result = caseEmergeLink(emergeLink);
				if (result == null) result = caseLink(emergeLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MKAOSPackage.COMMUNICATION_LINK: {
				CommunicationLink communicationLink = (CommunicationLink)theEObject;
				T result = caseCommunicationLink(communicationLink);
				if (result == null) result = caseLink(communicationLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MKAOSPackage.COMMUNICATION_INPUT_LINK: {
				CommunicationInputLink communicationInputLink = (CommunicationInputLink)theEObject;
				T result = caseCommunicationInputLink(communicationInputLink);
				if (result == null) result = caseCommunicationLink(communicationInputLink);
				if (result == null) result = caseLink(communicationInputLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MKAOSPackage.COMMUNICATION_OUTPUT_LINK: {
				CommunicationOutputLink communicationOutputLink = (CommunicationOutputLink)theEObject;
				T result = caseCommunicationOutputLink(communicationOutputLink);
				if (result == null) result = caseCommunicationLink(communicationOutputLink);
				if (result == null) result = caseLink(communicationOutputLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MKAOSPackage.MISSION_LINK: {
				MissionLink missionLink = (MissionLink)theEObject;
				T result = caseMissionLink(missionLink);
				if (result == null) result = caseLink(missionLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MKAOSPackage.DISRUPT_LINK: {
				DisruptLink disruptLink = (DisruptLink)theEObject;
				T result = caseDisruptLink(disruptLink);
				if (result == null) result = caseMissionLink(disruptLink);
				if (result == null) result = caseLink(disruptLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MKAOSPackage.SUPORT_LINK: {
				SuportLink suportLink = (SuportLink)theEObject;
				T result = caseSuportLink(suportLink);
				if (result == null) result = caseMissionLink(suportLink);
				if (result == null) result = caseLink(suportLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MKAOSPackage.BLOCK_LINK: {
				BlockLink blockLink = (BlockLink)theEObject;
				T result = caseBlockLink(blockLink);
				if (result == null) result = caseMissionLink(blockLink);
				if (result == null) result = caseLink(blockLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MKAOSPackage.DEPENDENCY_LINK: {
				DependencyLink dependencyLink = (DependencyLink)theEObject;
				T result = caseDependencyLink(dependencyLink);
				if (result == null) result = caseMissionLink(dependencyLink);
				if (result == null) result = caseLink(dependencyLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MKAOSPackage.INFLUENCE_LINK: {
				InfluenceLink influenceLink = (InfluenceLink)theEObject;
				T result = caseInfluenceLink(influenceLink);
				if (result == null) result = caseLink(influenceLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MKAOSPackage.GENERALIZATION_LINK: {
				GeneralizationLink generalizationLink = (GeneralizationLink)theEObject;
				T result = caseGeneralizationLink(generalizationLink);
				if (result == null) result = caseLink(generalizationLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MKAOSPackage.COMPOSITION_LINK: {
				CompositionLink compositionLink = (CompositionLink)theEObject;
				T result = caseCompositionLink(compositionLink);
				if (result == null) result = caseLink(compositionLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MKAOSPackage.FORMAL_ELEMENT: {
				FormalElement formalElement = (FormalElement)theEObject;
				T result = caseFormalElement(formalElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MKAOSPackage.MISSION_REFINEMENT: {
				MissionRefinement missionRefinement = (MissionRefinement)theEObject;
				T result = caseMissionRefinement(missionRefinement);
				if (result == null) result = caseRefinement(missionRefinement);
				if (result == null) result = caseLink(missionRefinement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MKAOSPackage.DYN_BLTL: {
				DynBLTL dynBLTL = (DynBLTL)theEObject;
				T result = caseDynBLTL(dynBLTL);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MKAOSPackage.RULE_TEMPORAL: {
				RuleTemporal ruleTemporal = (RuleTemporal)theEObject;
				T result = caseRuleTemporal(ruleTemporal);
				if (result == null) result = caseDynBLTL(ruleTemporal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MKAOSPackage.RULE_BOUND: {
				RuleBound ruleBound = (RuleBound)theEObject;
				T result = caseRuleBound(ruleBound);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MKAOSPackage.RULE_IMPLICATION: {
				RuleImplication ruleImplication = (RuleImplication)theEObject;
				T result = caseRuleImplication(ruleImplication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MKAOSPackage.RULE_DISJUNCTION: {
				RuleDisjunction ruleDisjunction = (RuleDisjunction)theEObject;
				T result = caseRuleDisjunction(ruleDisjunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MKAOSPackage.RULE_CONJUNCTION: {
				RuleConjunction ruleConjunction = (RuleConjunction)theEObject;
				T result = caseRuleConjunction(ruleConjunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MKAOSPackage.RULE_EQUALITY: {
				RuleEquality ruleEquality = (RuleEquality)theEObject;
				T result = caseRuleEquality(ruleEquality);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MKAOSPackage.RULE_REL_EXP: {
				RuleRelExp ruleRelExp = (RuleRelExp)theEObject;
				T result = caseRuleRelExp(ruleRelExp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MKAOSPackage.RULE_NUM_EXP: {
				RuleNumExp ruleNumExp = (RuleNumExp)theEObject;
				T result = caseRuleNumExp(ruleNumExp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MKAOSPackage.RULE_TERM: {
				RuleTerm ruleTerm = (RuleTerm)theEObject;
				T result = caseRuleTerm(ruleTerm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MKAOSPackage.RULE_FACTOR: {
				RuleFactor ruleFactor = (RuleFactor)theEObject;
				T result = caseRuleFactor(ruleFactor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MKAOSPackage.RULE_VAR: {
				RuleVar ruleVar = (RuleVar)theEObject;
				T result = caseRuleVar(ruleVar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MKAOSPackage.RULE_FUNCTION: {
				RuleFunction ruleFunction = (RuleFunction)theEObject;
				T result = caseRuleFunction(ruleFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MKAOSPackage.RULE_PARAMS: {
				RuleParams ruleParams = (RuleParams)theEObject;
				T result = caseRuleParams(ruleParams);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MKAOSPackage.RULE_LITERAL: {
				RuleLiteral ruleLiteral = (RuleLiteral)theEObject;
				T result = caseRuleLiteral(ruleLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MKAOSPackage.RULE_INTEGER_LIT: {
				RuleIntegerLit ruleIntegerLit = (RuleIntegerLit)theEObject;
				T result = caseRuleIntegerLit(ruleIntegerLit);
				if (result == null) result = caseRuleLiteral(ruleIntegerLit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MKAOSPackage.RULE_FLOAT_LIT: {
				RuleFloatLit ruleFloatLit = (RuleFloatLit)theEObject;
				T result = caseRuleFloatLit(ruleFloatLit);
				if (result == null) result = caseRuleLiteral(ruleFloatLit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MKAOSPackage.RULE_TUPLE_LIT: {
				RuleTupleLit ruleTupleLit = (RuleTupleLit)theEObject;
				T result = caseRuleTupleLit(ruleTupleLit);
				if (result == null) result = caseRuleLiteral(ruleTupleLit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MKAOSPackage.RULE_SEQ_LIT: {
				RuleSeqLit ruleSeqLit = (RuleSeqLit)theEObject;
				T result = caseRuleSeqLit(ruleSeqLit);
				if (result == null) result = caseRuleLiteral(ruleSeqLit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperation(mKAOS.Operation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>KAOS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>KAOS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKAOS(mKAOS.KAOS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLink(mKAOS.Link object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nodes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nodes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodes(mKAOS.Nodes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationNode(mKAOS.OperationNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvent(Event object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntity(Entity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObject(mKAOS.Object object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Associations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Associations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociations(Associations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Agent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Agent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAgent(mKAOS.Agent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Software Agent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Software Agent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSoftwareAgent(mKAOS.SoftwareAgent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Environment Agent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Environment Agent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnvironmentAgent(EnvironmentAgent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Refinable Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Refinable Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRefinableNode(mKAOS.RefinableNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Obstacle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Obstacle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObstacle(Obstacle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Goal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Goal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGoal(mKAOS.Goal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assignment Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assignment Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssignmentLink(AssignmentLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conflict Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conflict Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConflictLink(ConflictLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Obstruction Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Obstruction Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObstructionLink(ObstructionLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputLink(OutputLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expectation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expectation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpectation(Expectation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputLink(InputLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Refinement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Refinement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRefinement(mKAOS.Refinement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>And Refinement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>And Refinement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAndRefinement(AndRefinement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Or Refinement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Or Refinement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrRefinement(OrRefinement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainProperty(DomainProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequirement(Requirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operacionalization Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operacionalization Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperacionalizationLink(OperacionalizationLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Hypothesis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Hypothesis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainHypothesis(DomainHypothesis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Invariant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Invariant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainInvariant(DomainInvariant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resolution Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resolution Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResolutionLink(ResolutionLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Responsability Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Responsability Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponsabilityLink(ResponsabilityLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>mKAOS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>mKAOS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casemKAOS(mKAOS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mission</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mission</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMission(Mission object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Emergent Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Emergent Behavior</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmergentBehavior(EmergentBehavior object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constituent System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constituent System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstituentSystem(ConstituentSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mediator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mediator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMediator(Mediator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operational Capability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operational Capability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationalCapability(OperationalCapability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Communicational Capability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Communicational Capability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommunicationalCapability(CommunicationalCapability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Emerge Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Emerge Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmergeLink(EmergeLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Communication Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Communication Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommunicationLink(CommunicationLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Communication Input Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Communication Input Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommunicationInputLink(CommunicationInputLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Communication Output Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Communication Output Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommunicationOutputLink(CommunicationOutputLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mission Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mission Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMissionLink(MissionLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Disrupt Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Disrupt Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDisruptLink(DisruptLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Suport Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Suport Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuportLink(SuportLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlockLink(BlockLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dependency Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dependency Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDependencyLink(DependencyLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Influence Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Influence Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInfluenceLink(InfluenceLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generalization Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generalization Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralizationLink(GeneralizationLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composition Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composition Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositionLink(CompositionLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Formal Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Formal Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormalElement(FormalElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mission Refinement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mission Refinement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMissionRefinement(MissionRefinement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dyn BLTL</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dyn BLTL</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDynBLTL(DynBLTL object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rule Temporal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rule Temporal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuleTemporal(RuleTemporal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rule Bound</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rule Bound</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuleBound(RuleBound object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rule Implication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rule Implication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuleImplication(RuleImplication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rule Disjunction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rule Disjunction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuleDisjunction(RuleDisjunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rule Conjunction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rule Conjunction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuleConjunction(RuleConjunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rule Equality</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rule Equality</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuleEquality(RuleEquality object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rule Rel Exp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rule Rel Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuleRelExp(RuleRelExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rule Num Exp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rule Num Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuleNumExp(RuleNumExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rule Term</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rule Term</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuleTerm(RuleTerm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rule Factor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rule Factor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuleFactor(RuleFactor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rule Var</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rule Var</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuleVar(RuleVar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rule Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rule Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuleFunction(RuleFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rule Params</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rule Params</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuleParams(RuleParams object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rule Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rule Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuleLiteral(RuleLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rule Integer Lit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rule Integer Lit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuleIntegerLit(RuleIntegerLit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rule Float Lit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rule Float Lit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuleFloatLit(RuleFloatLit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rule Tuple Lit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rule Tuple Lit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuleTupleLit(RuleTupleLit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rule Seq Lit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rule Seq Lit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuleSeqLit(RuleSeqLit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //MKAOSSwitch
