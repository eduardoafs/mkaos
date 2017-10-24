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
 * @see KAOSModel.KAOSModelPackage
 * @generated
 */
public class KAOSModelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static KAOSModelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KAOSModelSwitch() {
		if (modelPackage == null) {
			modelPackage = KAOSModelPackage.eINSTANCE;
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
			case KAOSModelPackage.OPERATION: {
				Operation operation = (Operation)theEObject;
				T result = caseOperation(operation);
				if (result == null) result = caseOperationNode(operation);
				if (result == null) result = caseNodes(operation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KAOSModelPackage.KAOS: {
				KAOS kaos = (KAOS)theEObject;
				T result = caseKAOS(kaos);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KAOSModelPackage.LINK: {
				Link link = (Link)theEObject;
				T result = caseLink(link);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KAOSModelPackage.NODES: {
				Nodes nodes = (Nodes)theEObject;
				T result = caseNodes(nodes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KAOSModelPackage.OPERATION_NODE: {
				OperationNode operationNode = (OperationNode)theEObject;
				T result = caseOperationNode(operationNode);
				if (result == null) result = caseNodes(operationNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KAOSModelPackage.EVENT: {
				Event event = (Event)theEObject;
				T result = caseEvent(event);
				if (result == null) result = caseOperationNode(event);
				if (result == null) result = caseNodes(event);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KAOSModelPackage.ENTITY: {
				Entity entity = (Entity)theEObject;
				T result = caseEntity(entity);
				if (result == null) result = caseObject(entity);
				if (result == null) result = caseNodes(entity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KAOSModelPackage.OBJECT: {
				KAOSModel.Object object = (KAOSModel.Object)theEObject;
				T result = caseObject(object);
				if (result == null) result = caseNodes(object);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KAOSModelPackage.ASSOCIATIONS: {
				Associations associations = (Associations)theEObject;
				T result = caseAssociations(associations);
				if (result == null) result = caseObject(associations);
				if (result == null) result = caseNodes(associations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KAOSModelPackage.AGENT: {
				Agent agent = (Agent)theEObject;
				T result = caseAgent(agent);
				if (result == null) result = caseObject(agent);
				if (result == null) result = caseNodes(agent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KAOSModelPackage.SOFTWARE_AGENT: {
				SoftwareAgent softwareAgent = (SoftwareAgent)theEObject;
				T result = caseSoftwareAgent(softwareAgent);
				if (result == null) result = caseAgent(softwareAgent);
				if (result == null) result = caseObject(softwareAgent);
				if (result == null) result = caseNodes(softwareAgent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KAOSModelPackage.ENVIRONMENT_AGENT: {
				EnvironmentAgent environmentAgent = (EnvironmentAgent)theEObject;
				T result = caseEnvironmentAgent(environmentAgent);
				if (result == null) result = caseAgent(environmentAgent);
				if (result == null) result = caseObject(environmentAgent);
				if (result == null) result = caseNodes(environmentAgent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KAOSModelPackage.REFINABLE_NODE: {
				RefinableNode refinableNode = (RefinableNode)theEObject;
				T result = caseRefinableNode(refinableNode);
				if (result == null) result = caseNodes(refinableNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KAOSModelPackage.OBSTACLE: {
				Obstacle obstacle = (Obstacle)theEObject;
				T result = caseObstacle(obstacle);
				if (result == null) result = caseRefinableNode(obstacle);
				if (result == null) result = caseNodes(obstacle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KAOSModelPackage.GOAL: {
				Goal goal = (Goal)theEObject;
				T result = caseGoal(goal);
				if (result == null) result = caseRefinableNode(goal);
				if (result == null) result = caseNodes(goal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KAOSModelPackage.ASSIGNMENT_LINK: {
				AssignmentLink assignmentLink = (AssignmentLink)theEObject;
				T result = caseAssignmentLink(assignmentLink);
				if (result == null) result = caseLink(assignmentLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KAOSModelPackage.CONFLICT_LINK: {
				ConflictLink conflictLink = (ConflictLink)theEObject;
				T result = caseConflictLink(conflictLink);
				if (result == null) result = caseLink(conflictLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KAOSModelPackage.OBSTRUCTION_LINK: {
				ObstructionLink obstructionLink = (ObstructionLink)theEObject;
				T result = caseObstructionLink(obstructionLink);
				if (result == null) result = caseLink(obstructionLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KAOSModelPackage.OUTPUT_LINK: {
				OutputLink outputLink = (OutputLink)theEObject;
				T result = caseOutputLink(outputLink);
				if (result == null) result = caseLink(outputLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KAOSModelPackage.EXPECTATION: {
				Expectation expectation = (Expectation)theEObject;
				T result = caseExpectation(expectation);
				if (result == null) result = caseGoal(expectation);
				if (result == null) result = caseRefinableNode(expectation);
				if (result == null) result = caseNodes(expectation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KAOSModelPackage.INPUT_LINK: {
				InputLink inputLink = (InputLink)theEObject;
				T result = caseInputLink(inputLink);
				if (result == null) result = caseLink(inputLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KAOSModelPackage.REFINEMENT: {
				Refinement refinement = (Refinement)theEObject;
				T result = caseRefinement(refinement);
				if (result == null) result = caseLink(refinement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KAOSModelPackage.AND_REFINEMENT: {
				AndRefinement andRefinement = (AndRefinement)theEObject;
				T result = caseAndRefinement(andRefinement);
				if (result == null) result = caseRefinement(andRefinement);
				if (result == null) result = caseLink(andRefinement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KAOSModelPackage.OR_REFINEMENT: {
				OrRefinement orRefinement = (OrRefinement)theEObject;
				T result = caseOrRefinement(orRefinement);
				if (result == null) result = caseRefinement(orRefinement);
				if (result == null) result = caseLink(orRefinement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KAOSModelPackage.DOMAIN_PROPERTY: {
				DomainProperty domainProperty = (DomainProperty)theEObject;
				T result = caseDomainProperty(domainProperty);
				if (result == null) result = caseGoal(domainProperty);
				if (result == null) result = caseRefinableNode(domainProperty);
				if (result == null) result = caseNodes(domainProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KAOSModelPackage.REQUIREMENT: {
				Requirement requirement = (Requirement)theEObject;
				T result = caseRequirement(requirement);
				if (result == null) result = caseGoal(requirement);
				if (result == null) result = caseRefinableNode(requirement);
				if (result == null) result = caseNodes(requirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KAOSModelPackage.OPERACIONALIZATION_LINK: {
				OperacionalizationLink operacionalizationLink = (OperacionalizationLink)theEObject;
				T result = caseOperacionalizationLink(operacionalizationLink);
				if (result == null) result = caseLink(operacionalizationLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KAOSModelPackage.DOMAIN_HYPOTHESIS: {
				DomainHypothesis domainHypothesis = (DomainHypothesis)theEObject;
				T result = caseDomainHypothesis(domainHypothesis);
				if (result == null) result = caseDomainProperty(domainHypothesis);
				if (result == null) result = caseGoal(domainHypothesis);
				if (result == null) result = caseRefinableNode(domainHypothesis);
				if (result == null) result = caseNodes(domainHypothesis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KAOSModelPackage.DOMAIN_INVARIANT: {
				DomainInvariant domainInvariant = (DomainInvariant)theEObject;
				T result = caseDomainInvariant(domainInvariant);
				if (result == null) result = caseDomainProperty(domainInvariant);
				if (result == null) result = caseGoal(domainInvariant);
				if (result == null) result = caseRefinableNode(domainInvariant);
				if (result == null) result = caseNodes(domainInvariant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KAOSModelPackage.RESOLUTION_LINK: {
				ResolutionLink resolutionLink = (ResolutionLink)theEObject;
				T result = caseResolutionLink(resolutionLink);
				if (result == null) result = caseLink(resolutionLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KAOSModelPackage.RESPONSABILITY_LINK: {
				ResponsabilityLink responsabilityLink = (ResponsabilityLink)theEObject;
				T result = caseResponsabilityLink(responsabilityLink);
				if (result == null) result = caseLink(responsabilityLink);
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
	public T caseOperation(Operation object) {
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
	public T caseKAOS(KAOS object) {
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
	public T caseLink(Link object) {
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
	public T caseNodes(Nodes object) {
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
	public T caseOperationNode(OperationNode object) {
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
	public T caseObject(KAOSModel.Object object) {
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
	public T caseAgent(Agent object) {
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
	public T caseSoftwareAgent(SoftwareAgent object) {
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
	public T caseRefinableNode(RefinableNode object) {
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
	public T caseGoal(Goal object) {
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
	public T caseRefinement(Refinement object) {
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

} //KAOSModelSwitch
