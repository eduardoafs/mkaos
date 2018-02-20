/**
 */
package KAOSModel.impl;

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
import KAOSModel.KAOSModelFactory;
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

import mKAOS.MKAOSPackage;

import mKAOS.impl.MKAOSPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class KAOSModelPackageImpl extends EPackageImpl implements KAOSModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kaosEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass agentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass softwareAgentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass environmentAgentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refinableNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass obstacleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass goalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assignmentLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conflictLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass obstructionLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expectationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refinementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass andRefinementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orRefinementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operacionalizationLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainHypothesisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainInvariantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resolutionLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass responsabilityLinkEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see KAOSModel.KAOSModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private KAOSModelPackageImpl() {
		super(eNS_URI, KAOSModelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link KAOSModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static KAOSModelPackage init() {
		if (isInited) return (KAOSModelPackage)EPackage.Registry.INSTANCE.getEPackage(KAOSModelPackage.eNS_URI);

		// Obtain or create and register package
		KAOSModelPackageImpl theKAOSModelPackage = (KAOSModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof KAOSModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new KAOSModelPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		MKAOSPackageImpl theMKAOSPackage = (MKAOSPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MKAOSPackage.eNS_URI) instanceof MKAOSPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MKAOSPackage.eNS_URI) : MKAOSPackage.eINSTANCE);

		// Create package meta-data objects
		theKAOSModelPackage.createPackageContents();
		theMKAOSPackage.createPackageContents();

		// Initialize created meta-data
		theKAOSModelPackage.initializePackageContents();
		theMKAOSPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theKAOSModelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(KAOSModelPackage.eNS_URI, theKAOSModelPackage);
		return theKAOSModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperation() {
		return operationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_Produces() {
		return (EReference)operationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_Output() {
		return (EReference)operationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_Operationalize() {
		return (EReference)operationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_Input() {
		return (EReference)operationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKAOS() {
		return kaosEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKAOS_Name() {
		return (EAttribute)kaosEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKAOS_LinkedBy() {
		return (EReference)kaosEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKAOS_ConsistsOf() {
		return (EReference)kaosEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLink() {
		return linkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLink_Name() {
		return (EAttribute)linkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNodes() {
		return nodesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodes_Name() {
		return (EAttribute)nodesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationNode() {
		return operationNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvent() {
		return eventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntity() {
		return entityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_Composition() {
		return (EReference)entityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObject() {
		return objectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssociations() {
		return associationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAgent() {
		return agentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAgent_Performs() {
		return (EReference)agentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAgent_Composition() {
		return (EReference)agentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSoftwareAgent() {
		return softwareAgentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoftwareAgent_ResponsibleFor() {
		return (EReference)softwareAgentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnvironmentAgent() {
		return environmentAgentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRefinableNode() {
		return refinableNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRefinableNode_RefinedBy() {
		return (EReference)refinableNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObstacle() {
		return obstacleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObstacle_Obstruct() {
		return (EReference)obstacleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGoal() {
		return goalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoal_Resolve() {
		return (EReference)goalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoal_Conflicts() {
		return (EReference)goalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoal_Concerns() {
		return (EReference)goalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGoal_Description() {
		return (EAttribute)goalEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssignmentLink() {
		return assignmentLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentLink_AssignsGoalTo() {
		return (EReference)assignmentLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConflictLink() {
		return conflictLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObstructionLink() {
		return obstructionLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObstructionLink_RelateKGoalTo() {
		return (EReference)obstructionLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputLink() {
		return outputLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpectation() {
		return expectationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpectation_AssignedTo() {
		return (EReference)expectationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputLink() {
		return inputLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputLink_ObjectInputOn() {
		return (EReference)inputLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRefinement() {
		return refinementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRefinement_Refines() {
		return (EReference)refinementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAndRefinement() {
		return andRefinementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrRefinement() {
		return orRefinementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainProperty() {
		return domainPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainProperty_UsedIn() {
		return (EReference)domainPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequirement() {
		return requirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperacionalizationLink() {
		return operacionalizationLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperacionalizationLink_RelateOperationTo() {
		return (EReference)operacionalizationLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainHypothesis() {
		return domainHypothesisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainInvariant() {
		return domainInvariantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResolutionLink() {
		return resolutionLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResolutionLink_AssignObstacleTo() {
		return (EReference)resolutionLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResponsabilityLink() {
		return responsabilityLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponsabilityLink_AssignAgentTo() {
		return (EReference)responsabilityLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KAOSModelFactory getKAOSModelFactory() {
		return (KAOSModelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		operationEClass = createEClass(OPERATION);
		createEReference(operationEClass, OPERATION__PRODUCES);
		createEReference(operationEClass, OPERATION__OUTPUT);
		createEReference(operationEClass, OPERATION__OPERATIONALIZE);
		createEReference(operationEClass, OPERATION__INPUT);

		kaosEClass = createEClass(KAOS);
		createEAttribute(kaosEClass, KAOS__NAME);
		createEReference(kaosEClass, KAOS__LINKED_BY);
		createEReference(kaosEClass, KAOS__CONSISTS_OF);

		linkEClass = createEClass(LINK);
		createEAttribute(linkEClass, LINK__NAME);

		nodesEClass = createEClass(NODES);
		createEAttribute(nodesEClass, NODES__NAME);

		operationNodeEClass = createEClass(OPERATION_NODE);

		eventEClass = createEClass(EVENT);

		entityEClass = createEClass(ENTITY);
		createEReference(entityEClass, ENTITY__COMPOSITION);

		objectEClass = createEClass(OBJECT);

		associationsEClass = createEClass(ASSOCIATIONS);

		agentEClass = createEClass(AGENT);
		createEReference(agentEClass, AGENT__PERFORMS);
		createEReference(agentEClass, AGENT__COMPOSITION);

		softwareAgentEClass = createEClass(SOFTWARE_AGENT);
		createEReference(softwareAgentEClass, SOFTWARE_AGENT__RESPONSIBLE_FOR);

		environmentAgentEClass = createEClass(ENVIRONMENT_AGENT);

		refinableNodeEClass = createEClass(REFINABLE_NODE);
		createEReference(refinableNodeEClass, REFINABLE_NODE__REFINED_BY);

		obstacleEClass = createEClass(OBSTACLE);
		createEReference(obstacleEClass, OBSTACLE__OBSTRUCT);

		goalEClass = createEClass(GOAL);
		createEReference(goalEClass, GOAL__RESOLVE);
		createEReference(goalEClass, GOAL__CONFLICTS);
		createEReference(goalEClass, GOAL__CONCERNS);
		createEAttribute(goalEClass, GOAL__DESCRIPTION);

		assignmentLinkEClass = createEClass(ASSIGNMENT_LINK);
		createEReference(assignmentLinkEClass, ASSIGNMENT_LINK__ASSIGNS_GOAL_TO);

		conflictLinkEClass = createEClass(CONFLICT_LINK);

		obstructionLinkEClass = createEClass(OBSTRUCTION_LINK);
		createEReference(obstructionLinkEClass, OBSTRUCTION_LINK__RELATE_KGOAL_TO);

		outputLinkEClass = createEClass(OUTPUT_LINK);

		expectationEClass = createEClass(EXPECTATION);
		createEReference(expectationEClass, EXPECTATION__ASSIGNED_TO);

		inputLinkEClass = createEClass(INPUT_LINK);
		createEReference(inputLinkEClass, INPUT_LINK__OBJECT_INPUT_ON);

		refinementEClass = createEClass(REFINEMENT);
		createEReference(refinementEClass, REFINEMENT__REFINES);

		andRefinementEClass = createEClass(AND_REFINEMENT);

		orRefinementEClass = createEClass(OR_REFINEMENT);

		domainPropertyEClass = createEClass(DOMAIN_PROPERTY);
		createEReference(domainPropertyEClass, DOMAIN_PROPERTY__USED_IN);

		requirementEClass = createEClass(REQUIREMENT);

		operacionalizationLinkEClass = createEClass(OPERACIONALIZATION_LINK);
		createEReference(operacionalizationLinkEClass, OPERACIONALIZATION_LINK__RELATE_OPERATION_TO);

		domainHypothesisEClass = createEClass(DOMAIN_HYPOTHESIS);

		domainInvariantEClass = createEClass(DOMAIN_INVARIANT);

		resolutionLinkEClass = createEClass(RESOLUTION_LINK);
		createEReference(resolutionLinkEClass, RESOLUTION_LINK__ASSIGN_OBSTACLE_TO);

		responsabilityLinkEClass = createEClass(RESPONSABILITY_LINK);
		createEReference(responsabilityLinkEClass, RESPONSABILITY_LINK__ASSIGN_AGENT_TO);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		operationEClass.getESuperTypes().add(this.getOperationNode());
		operationNodeEClass.getESuperTypes().add(this.getNodes());
		eventEClass.getESuperTypes().add(this.getOperationNode());
		entityEClass.getESuperTypes().add(this.getObject());
		objectEClass.getESuperTypes().add(this.getNodes());
		associationsEClass.getESuperTypes().add(this.getObject());
		agentEClass.getESuperTypes().add(this.getObject());
		softwareAgentEClass.getESuperTypes().add(this.getAgent());
		environmentAgentEClass.getESuperTypes().add(this.getAgent());
		refinableNodeEClass.getESuperTypes().add(this.getNodes());
		obstacleEClass.getESuperTypes().add(this.getRefinableNode());
		goalEClass.getESuperTypes().add(this.getRefinableNode());
		assignmentLinkEClass.getESuperTypes().add(this.getLink());
		conflictLinkEClass.getESuperTypes().add(this.getLink());
		obstructionLinkEClass.getESuperTypes().add(this.getLink());
		outputLinkEClass.getESuperTypes().add(this.getLink());
		expectationEClass.getESuperTypes().add(this.getGoal());
		inputLinkEClass.getESuperTypes().add(this.getLink());
		refinementEClass.getESuperTypes().add(this.getLink());
		andRefinementEClass.getESuperTypes().add(this.getRefinement());
		orRefinementEClass.getESuperTypes().add(this.getRefinement());
		domainPropertyEClass.getESuperTypes().add(this.getGoal());
		requirementEClass.getESuperTypes().add(this.getGoal());
		operacionalizationLinkEClass.getESuperTypes().add(this.getLink());
		domainHypothesisEClass.getESuperTypes().add(this.getDomainProperty());
		domainInvariantEClass.getESuperTypes().add(this.getDomainProperty());
		resolutionLinkEClass.getESuperTypes().add(this.getLink());
		responsabilityLinkEClass.getESuperTypes().add(this.getLink());

		// Initialize classes, features, and operations; add parameters
		initEClass(operationEClass, Operation.class, "Operation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperation_Produces(), this.getEvent(), null, "produces", null, 1, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_Output(), this.getEntity(), null, "output", null, 1, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_Operationalize(), this.getRequirement(), null, "operationalize", null, 1, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_Input(), this.getEntity(), null, "input", null, 1, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(kaosEClass, KAOSModel.KAOS.class, "KAOS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKAOS_Name(), ecorePackage.getEString(), "name", null, 0, 1, KAOSModel.KAOS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKAOS_LinkedBy(), this.getLink(), null, "linkedBy", null, 0, -1, KAOSModel.KAOS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKAOS_ConsistsOf(), this.getNodes(), null, "consistsOf", null, 0, -1, KAOSModel.KAOS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkEClass, Link.class, "Link", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLink_Name(), ecorePackage.getEString(), "name", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodesEClass, Nodes.class, "Nodes", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNodes_Name(), ecorePackage.getEString(), "name", null, 1, 1, Nodes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationNodeEClass, OperationNode.class, "OperationNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eventEClass, Event.class, "Event", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(entityEClass, Entity.class, "Entity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntity_Composition(), this.getEntity(), null, "composition", null, 0, -1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectEClass, KAOSModel.Object.class, "Object", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(associationsEClass, Associations.class, "Associations", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(agentEClass, Agent.class, "Agent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAgent_Performs(), this.getOperation(), null, "performs", null, 0, -1, Agent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAgent_Composition(), this.getAgent(), null, "composition", null, 0, -1, Agent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(softwareAgentEClass, SoftwareAgent.class, "SoftwareAgent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSoftwareAgent_ResponsibleFor(), this.getRequirement(), null, "responsibleFor", null, 0, -1, SoftwareAgent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(environmentAgentEClass, EnvironmentAgent.class, "EnvironmentAgent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(refinableNodeEClass, RefinableNode.class, "RefinableNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRefinableNode_RefinedBy(), this.getRefinement(), null, "refinedBy", null, 0, -1, RefinableNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(obstacleEClass, Obstacle.class, "Obstacle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObstacle_Obstruct(), this.getGoal(), null, "obstruct", null, 0, -1, Obstacle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(goalEClass, Goal.class, "Goal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGoal_Resolve(), this.getObstacle(), null, "resolve", null, 0, -1, Goal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGoal_Conflicts(), this.getGoal(), null, "conflicts", null, 0, -1, Goal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGoal_Concerns(), this.getObject(), null, "concerns", null, 0, -1, Goal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGoal_Description(), ecorePackage.getEString(), "description", null, 0, 1, Goal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assignmentLinkEClass, AssignmentLink.class, "AssignmentLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssignmentLink_AssignsGoalTo(), this.getAgent(), null, "assignsGoalTo", null, 1, -1, AssignmentLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conflictLinkEClass, ConflictLink.class, "ConflictLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(obstructionLinkEClass, ObstructionLink.class, "ObstructionLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObstructionLink_RelateKGoalTo(), this.getObstacle(), null, "relateKGoalTo", null, 1, -1, ObstructionLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outputLinkEClass, OutputLink.class, "OutputLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(expectationEClass, Expectation.class, "Expectation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpectation_AssignedTo(), this.getEnvironmentAgent(), null, "assignedTo", null, 0, -1, Expectation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputLinkEClass, InputLink.class, "InputLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInputLink_ObjectInputOn(), this.getOperation(), null, "objectInputOn", null, 1, -1, InputLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(refinementEClass, Refinement.class, "Refinement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRefinement_Refines(), this.getRefinableNode(), null, "refines", null, 0, 1, Refinement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(andRefinementEClass, AndRefinement.class, "AndRefinement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(orRefinementEClass, OrRefinement.class, "OrRefinement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(domainPropertyEClass, DomainProperty.class, "DomainProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDomainProperty_UsedIn(), this.getRefinement(), null, "usedIn", null, 0, -1, DomainProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requirementEClass, Requirement.class, "Requirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(operacionalizationLinkEClass, OperacionalizationLink.class, "OperacionalizationLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperacionalizationLink_RelateOperationTo(), this.getRequirement(), null, "relateOperationTo", null, 1, -1, OperacionalizationLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(domainHypothesisEClass, DomainHypothesis.class, "DomainHypothesis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(domainInvariantEClass, DomainInvariant.class, "DomainInvariant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(resolutionLinkEClass, ResolutionLink.class, "ResolutionLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResolutionLink_AssignObstacleTo(), this.getRequirement(), null, "assignObstacleTo", null, 1, -1, ResolutionLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(responsabilityLinkEClass, ResponsabilityLink.class, "ResponsabilityLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResponsabilityLink_AssignAgentTo(), this.getRequirement(), null, "assignAgentTo", null, 1, -1, ResponsabilityLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //KAOSModelPackageImpl
