/**
 */
package KAOSModel.impl;

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
import KAOSModel.KAOSModelFactory;
import KAOSModel.KAOSModelPackage;
import KAOSModel.Obstacle;
import KAOSModel.ObstructionLink;
import KAOSModel.OperacionalizationLink;
import KAOSModel.Operation;
import KAOSModel.OperationNode;
import KAOSModel.OrRefinement;
import KAOSModel.OutputLink;
import KAOSModel.Refinement;
import KAOSModel.Requirement;
import KAOSModel.ResolutionLink;
import KAOSModel.ResponsabilityLink;
import KAOSModel.SoftwareAgent;

import org.eclipse.emf.ecore.EClass;
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
public class KAOSModelFactoryImpl extends EFactoryImpl implements KAOSModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static KAOSModelFactory init() {
		try {
			KAOSModelFactory theKAOSModelFactory = (KAOSModelFactory)EPackage.Registry.INSTANCE.getEFactory(KAOSModelPackage.eNS_URI);
			if (theKAOSModelFactory != null) {
				return theKAOSModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new KAOSModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KAOSModelFactoryImpl() {
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
			case KAOSModelPackage.OPERATION: return createOperation();
			case KAOSModelPackage.KAOS: return createKAOS();
			case KAOSModelPackage.OPERATION_NODE: return createOperationNode();
			case KAOSModelPackage.EVENT: return createEvent();
			case KAOSModelPackage.ENTITY: return createEntity();
			case KAOSModelPackage.ASSOCIATIONS: return createAssociations();
			case KAOSModelPackage.SOFTWARE_AGENT: return createSoftwareAgent();
			case KAOSModelPackage.ENVIRONMENT_AGENT: return createEnvironmentAgent();
			case KAOSModelPackage.OBSTACLE: return createObstacle();
			case KAOSModelPackage.GOAL: return createGoal();
			case KAOSModelPackage.ASSIGNMENT_LINK: return createAssignmentLink();
			case KAOSModelPackage.CONFLICT_LINK: return createConflictLink();
			case KAOSModelPackage.OBSTRUCTION_LINK: return createObstructionLink();
			case KAOSModelPackage.OUTPUT_LINK: return createOutputLink();
			case KAOSModelPackage.EXPECTATION: return createExpectation();
			case KAOSModelPackage.INPUT_LINK: return createInputLink();
			case KAOSModelPackage.REFINEMENT: return createRefinement();
			case KAOSModelPackage.AND_REFINEMENT: return createAndRefinement();
			case KAOSModelPackage.OR_REFINEMENT: return createOrRefinement();
			case KAOSModelPackage.DOMAIN_PROPERTY: return createDomainProperty();
			case KAOSModelPackage.REQUIREMENT: return createRequirement();
			case KAOSModelPackage.OPERACIONALIZATION_LINK: return createOperacionalizationLink();
			case KAOSModelPackage.DOMAIN_HYPOTHESIS: return createDomainHypothesis();
			case KAOSModelPackage.DOMAIN_INVARIANT: return createDomainInvariant();
			case KAOSModelPackage.RESOLUTION_LINK: return createResolutionLink();
			case KAOSModelPackage.RESPONSABILITY_LINK: return createResponsabilityLink();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
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
	public KAOSModelPackage getKAOSModelPackage() {
		return (KAOSModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static KAOSModelPackage getPackage() {
		return KAOSModelPackage.eINSTANCE;
	}

} //KAOSModelFactoryImpl
