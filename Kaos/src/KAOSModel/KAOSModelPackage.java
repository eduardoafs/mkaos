/**
 */
package KAOSModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see KAOSModel.KAOSModelFactory
 * @model kind="package"
 * @generated
 */
public interface KAOSModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "KAOSModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "dsl.kaos";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dsl.kaos";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	KAOSModelPackage eINSTANCE = KAOSModel.impl.KAOSModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link KAOSModel.impl.NodesImpl <em>Nodes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see KAOSModel.impl.NodesImpl
	 * @see KAOSModel.impl.KAOSModelPackageImpl#getNodes()
	 * @generated
	 */
	int NODES = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODES__NAME = 0;

	/**
	 * The number of structural features of the '<em>Nodes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Nodes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link KAOSModel.impl.OperationNodeImpl <em>Operation Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see KAOSModel.impl.OperationNodeImpl
	 * @see KAOSModel.impl.KAOSModelPackageImpl#getOperationNode()
	 * @generated
	 */
	int OPERATION_NODE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_NODE__NAME = NODES__NAME;

	/**
	 * The number of structural features of the '<em>Operation Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_NODE_FEATURE_COUNT = NODES_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Operation Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_NODE_OPERATION_COUNT = NODES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link KAOSModel.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see KAOSModel.impl.OperationImpl
	 * @see KAOSModel.impl.KAOSModelPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__NAME = OPERATION_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Produces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__PRODUCES = OPERATION_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__OUTPUT = OPERATION_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operationalize</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__OPERATIONALIZE = OPERATION_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__INPUT = OPERATION_NODE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = OPERATION_NODE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_OPERATION_COUNT = OPERATION_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link KAOSModel.impl.KAOSImpl <em>KAOS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see KAOSModel.impl.KAOSImpl
	 * @see KAOSModel.impl.KAOSModelPackageImpl#getKAOS()
	 * @generated
	 */
	int KAOS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAOS__NAME = 0;

	/**
	 * The feature id for the '<em><b>Linked By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAOS__LINKED_BY = 1;

	/**
	 * The feature id for the '<em><b>Consists Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAOS__CONSISTS_OF = 2;

	/**
	 * The number of structural features of the '<em>KAOS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAOS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>KAOS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAOS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link KAOSModel.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see KAOSModel.impl.LinkImpl
	 * @see KAOSModel.impl.KAOSModelPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__NAME = 0;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link KAOSModel.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see KAOSModel.impl.EventImpl
	 * @see KAOSModel.impl.KAOSModelPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NAME = OPERATION_NODE__NAME;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = OPERATION_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = OPERATION_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link KAOSModel.impl.ObjectImpl <em>Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see KAOSModel.impl.ObjectImpl
	 * @see KAOSModel.impl.KAOSModelPackageImpl#getObject()
	 * @generated
	 */
	int OBJECT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__NAME = NODES__NAME;

	/**
	 * The number of structural features of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FEATURE_COUNT = NODES_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_OPERATION_COUNT = NODES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link KAOSModel.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see KAOSModel.impl.EntityImpl
	 * @see KAOSModel.impl.KAOSModelPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NAME = OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Composition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__COMPOSITION = OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link KAOSModel.impl.AssociationsImpl <em>Associations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see KAOSModel.impl.AssociationsImpl
	 * @see KAOSModel.impl.KAOSModelPackageImpl#getAssociations()
	 * @generated
	 */
	int ASSOCIATIONS = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATIONS__NAME = OBJECT__NAME;

	/**
	 * The number of structural features of the '<em>Associations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATIONS_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Associations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATIONS_OPERATION_COUNT = OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link KAOSModel.impl.AgentImpl <em>Agent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see KAOSModel.impl.AgentImpl
	 * @see KAOSModel.impl.KAOSModelPackageImpl#getAgent()
	 * @generated
	 */
	int AGENT = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__NAME = OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Performs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__PERFORMS = OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Composition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__COMPOSITION = OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_OPERATION_COUNT = OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link KAOSModel.impl.SoftwareAgentImpl <em>Software Agent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see KAOSModel.impl.SoftwareAgentImpl
	 * @see KAOSModel.impl.KAOSModelPackageImpl#getSoftwareAgent()
	 * @generated
	 */
	int SOFTWARE_AGENT = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_AGENT__NAME = AGENT__NAME;

	/**
	 * The feature id for the '<em><b>Performs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_AGENT__PERFORMS = AGENT__PERFORMS;

	/**
	 * The feature id for the '<em><b>Composition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_AGENT__COMPOSITION = AGENT__COMPOSITION;

	/**
	 * The feature id for the '<em><b>Responsible For</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_AGENT__RESPONSIBLE_FOR = AGENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Software Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_AGENT_FEATURE_COUNT = AGENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Software Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_AGENT_OPERATION_COUNT = AGENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link KAOSModel.impl.EnvironmentAgentImpl <em>Environment Agent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see KAOSModel.impl.EnvironmentAgentImpl
	 * @see KAOSModel.impl.KAOSModelPackageImpl#getEnvironmentAgent()
	 * @generated
	 */
	int ENVIRONMENT_AGENT = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_AGENT__NAME = AGENT__NAME;

	/**
	 * The feature id for the '<em><b>Performs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_AGENT__PERFORMS = AGENT__PERFORMS;

	/**
	 * The feature id for the '<em><b>Composition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_AGENT__COMPOSITION = AGENT__COMPOSITION;

	/**
	 * The number of structural features of the '<em>Environment Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_AGENT_FEATURE_COUNT = AGENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Environment Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_AGENT_OPERATION_COUNT = AGENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link KAOSModel.impl.RefinableNodeImpl <em>Refinable Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see KAOSModel.impl.RefinableNodeImpl
	 * @see KAOSModel.impl.KAOSModelPackageImpl#getRefinableNode()
	 * @generated
	 */
	int REFINABLE_NODE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINABLE_NODE__NAME = NODES__NAME;

	/**
	 * The feature id for the '<em><b>Refined By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINABLE_NODE__REFINED_BY = NODES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Refinable Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINABLE_NODE_FEATURE_COUNT = NODES_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Refinable Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINABLE_NODE_OPERATION_COUNT = NODES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link KAOSModel.impl.ObstacleImpl <em>Obstacle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see KAOSModel.impl.ObstacleImpl
	 * @see KAOSModel.impl.KAOSModelPackageImpl#getObstacle()
	 * @generated
	 */
	int OBSTACLE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSTACLE__NAME = REFINABLE_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Refined By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSTACLE__REFINED_BY = REFINABLE_NODE__REFINED_BY;

	/**
	 * The feature id for the '<em><b>Obstruct</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSTACLE__OBSTRUCT = REFINABLE_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Obstacle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSTACLE_FEATURE_COUNT = REFINABLE_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Obstacle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSTACLE_OPERATION_COUNT = REFINABLE_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link KAOSModel.impl.GoalImpl <em>Goal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see KAOSModel.impl.GoalImpl
	 * @see KAOSModel.impl.KAOSModelPackageImpl#getGoal()
	 * @generated
	 */
	int GOAL = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__NAME = REFINABLE_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Refined By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__REFINED_BY = REFINABLE_NODE__REFINED_BY;

	/**
	 * The feature id for the '<em><b>Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__RESOLVE = REFINABLE_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__CONFLICTS = REFINABLE_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Concerns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__CONCERNS = REFINABLE_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_FEATURE_COUNT = REFINABLE_NODE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_OPERATION_COUNT = REFINABLE_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link KAOSModel.impl.AssignmentLinkImpl <em>Assignment Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see KAOSModel.impl.AssignmentLinkImpl
	 * @see KAOSModel.impl.KAOSModelPackageImpl#getAssignmentLink()
	 * @generated
	 */
	int ASSIGNMENT_LINK = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_LINK__NAME = LINK__NAME;

	/**
	 * The feature id for the '<em><b>Assigns Goal To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_LINK__ASSIGNS_GOAL_TO = LINK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Assignment Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_LINK_FEATURE_COUNT = LINK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Assignment Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_LINK_OPERATION_COUNT = LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link KAOSModel.impl.ConflictLinkImpl <em>Conflict Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see KAOSModel.impl.ConflictLinkImpl
	 * @see KAOSModel.impl.KAOSModelPackageImpl#getConflictLink()
	 * @generated
	 */
	int CONFLICT_LINK = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICT_LINK__NAME = LINK__NAME;

	/**
	 * The number of structural features of the '<em>Conflict Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICT_LINK_FEATURE_COUNT = LINK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Conflict Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICT_LINK_OPERATION_COUNT = LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link KAOSModel.impl.ObstructionLinkImpl <em>Obstruction Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see KAOSModel.impl.ObstructionLinkImpl
	 * @see KAOSModel.impl.KAOSModelPackageImpl#getObstructionLink()
	 * @generated
	 */
	int OBSTRUCTION_LINK = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSTRUCTION_LINK__NAME = LINK__NAME;

	/**
	 * The feature id for the '<em><b>Relate KGoal To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSTRUCTION_LINK__RELATE_KGOAL_TO = LINK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Obstruction Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSTRUCTION_LINK_FEATURE_COUNT = LINK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Obstruction Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSTRUCTION_LINK_OPERATION_COUNT = LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link KAOSModel.impl.OutputLinkImpl <em>Output Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see KAOSModel.impl.OutputLinkImpl
	 * @see KAOSModel.impl.KAOSModelPackageImpl#getOutputLink()
	 * @generated
	 */
	int OUTPUT_LINK = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_LINK__NAME = LINK__NAME;

	/**
	 * The number of structural features of the '<em>Output Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_LINK_FEATURE_COUNT = LINK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Output Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_LINK_OPERATION_COUNT = LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link KAOSModel.impl.ExpectationImpl <em>Expectation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see KAOSModel.impl.ExpectationImpl
	 * @see KAOSModel.impl.KAOSModelPackageImpl#getExpectation()
	 * @generated
	 */
	int EXPECTATION = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTATION__NAME = GOAL__NAME;

	/**
	 * The feature id for the '<em><b>Refined By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTATION__REFINED_BY = GOAL__REFINED_BY;

	/**
	 * The feature id for the '<em><b>Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTATION__RESOLVE = GOAL__RESOLVE;

	/**
	 * The feature id for the '<em><b>Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTATION__CONFLICTS = GOAL__CONFLICTS;

	/**
	 * The feature id for the '<em><b>Concerns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTATION__CONCERNS = GOAL__CONCERNS;

	/**
	 * The feature id for the '<em><b>Assigned To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTATION__ASSIGNED_TO = GOAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Expectation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTATION_FEATURE_COUNT = GOAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Expectation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTATION_OPERATION_COUNT = GOAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link KAOSModel.impl.InputLinkImpl <em>Input Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see KAOSModel.impl.InputLinkImpl
	 * @see KAOSModel.impl.KAOSModelPackageImpl#getInputLink()
	 * @generated
	 */
	int INPUT_LINK = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_LINK__NAME = LINK__NAME;

	/**
	 * The feature id for the '<em><b>Object Input On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_LINK__OBJECT_INPUT_ON = LINK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Input Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_LINK_FEATURE_COUNT = LINK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Input Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_LINK_OPERATION_COUNT = LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link KAOSModel.impl.RefinementImpl <em>Refinement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see KAOSModel.impl.RefinementImpl
	 * @see KAOSModel.impl.KAOSModelPackageImpl#getRefinement()
	 * @generated
	 */
	int REFINEMENT = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINEMENT__NAME = LINK__NAME;

	/**
	 * The feature id for the '<em><b>Refines</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINEMENT__REFINES = LINK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Refinement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINEMENT_FEATURE_COUNT = LINK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Refinement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINEMENT_OPERATION_COUNT = LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link KAOSModel.impl.AndRefinementImpl <em>And Refinement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see KAOSModel.impl.AndRefinementImpl
	 * @see KAOSModel.impl.KAOSModelPackageImpl#getAndRefinement()
	 * @generated
	 */
	int AND_REFINEMENT = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_REFINEMENT__NAME = REFINEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Refines</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_REFINEMENT__REFINES = REFINEMENT__REFINES;

	/**
	 * The number of structural features of the '<em>And Refinement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_REFINEMENT_FEATURE_COUNT = REFINEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>And Refinement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_REFINEMENT_OPERATION_COUNT = REFINEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link KAOSModel.impl.OrRefinementImpl <em>Or Refinement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see KAOSModel.impl.OrRefinementImpl
	 * @see KAOSModel.impl.KAOSModelPackageImpl#getOrRefinement()
	 * @generated
	 */
	int OR_REFINEMENT = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_REFINEMENT__NAME = REFINEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Refines</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_REFINEMENT__REFINES = REFINEMENT__REFINES;

	/**
	 * The number of structural features of the '<em>Or Refinement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_REFINEMENT_FEATURE_COUNT = REFINEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Or Refinement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_REFINEMENT_OPERATION_COUNT = REFINEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link KAOSModel.impl.DomainPropertyImpl <em>Domain Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see KAOSModel.impl.DomainPropertyImpl
	 * @see KAOSModel.impl.KAOSModelPackageImpl#getDomainProperty()
	 * @generated
	 */
	int DOMAIN_PROPERTY = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_PROPERTY__NAME = GOAL__NAME;

	/**
	 * The feature id for the '<em><b>Refined By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_PROPERTY__REFINED_BY = GOAL__REFINED_BY;

	/**
	 * The feature id for the '<em><b>Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_PROPERTY__RESOLVE = GOAL__RESOLVE;

	/**
	 * The feature id for the '<em><b>Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_PROPERTY__CONFLICTS = GOAL__CONFLICTS;

	/**
	 * The feature id for the '<em><b>Concerns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_PROPERTY__CONCERNS = GOAL__CONCERNS;

	/**
	 * The feature id for the '<em><b>Used In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_PROPERTY__USED_IN = GOAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Domain Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_PROPERTY_FEATURE_COUNT = GOAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Domain Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_PROPERTY_OPERATION_COUNT = GOAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link KAOSModel.impl.RequirementImpl <em>Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see KAOSModel.impl.RequirementImpl
	 * @see KAOSModel.impl.KAOSModelPackageImpl#getRequirement()
	 * @generated
	 */
	int REQUIREMENT = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__NAME = GOAL__NAME;

	/**
	 * The feature id for the '<em><b>Refined By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__REFINED_BY = GOAL__REFINED_BY;

	/**
	 * The feature id for the '<em><b>Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__RESOLVE = GOAL__RESOLVE;

	/**
	 * The feature id for the '<em><b>Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__CONFLICTS = GOAL__CONFLICTS;

	/**
	 * The feature id for the '<em><b>Concerns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__CONCERNS = GOAL__CONCERNS;

	/**
	 * The number of structural features of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_FEATURE_COUNT = GOAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_OPERATION_COUNT = GOAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link KAOSModel.impl.OperacionalizationLinkImpl <em>Operacionalization Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see KAOSModel.impl.OperacionalizationLinkImpl
	 * @see KAOSModel.impl.KAOSModelPackageImpl#getOperacionalizationLink()
	 * @generated
	 */
	int OPERACIONALIZATION_LINK = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERACIONALIZATION_LINK__NAME = LINK__NAME;

	/**
	 * The feature id for the '<em><b>Relate Operation To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERACIONALIZATION_LINK__RELATE_OPERATION_TO = LINK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Operacionalization Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERACIONALIZATION_LINK_FEATURE_COUNT = LINK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Operacionalization Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERACIONALIZATION_LINK_OPERATION_COUNT = LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link KAOSModel.impl.DomainHypothesisImpl <em>Domain Hypothesis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see KAOSModel.impl.DomainHypothesisImpl
	 * @see KAOSModel.impl.KAOSModelPackageImpl#getDomainHypothesis()
	 * @generated
	 */
	int DOMAIN_HYPOTHESIS = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_HYPOTHESIS__NAME = DOMAIN_PROPERTY__NAME;

	/**
	 * The feature id for the '<em><b>Refined By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_HYPOTHESIS__REFINED_BY = DOMAIN_PROPERTY__REFINED_BY;

	/**
	 * The feature id for the '<em><b>Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_HYPOTHESIS__RESOLVE = DOMAIN_PROPERTY__RESOLVE;

	/**
	 * The feature id for the '<em><b>Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_HYPOTHESIS__CONFLICTS = DOMAIN_PROPERTY__CONFLICTS;

	/**
	 * The feature id for the '<em><b>Concerns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_HYPOTHESIS__CONCERNS = DOMAIN_PROPERTY__CONCERNS;

	/**
	 * The feature id for the '<em><b>Used In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_HYPOTHESIS__USED_IN = DOMAIN_PROPERTY__USED_IN;

	/**
	 * The number of structural features of the '<em>Domain Hypothesis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_HYPOTHESIS_FEATURE_COUNT = DOMAIN_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Domain Hypothesis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_HYPOTHESIS_OPERATION_COUNT = DOMAIN_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link KAOSModel.impl.DomainInvariantImpl <em>Domain Invariant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see KAOSModel.impl.DomainInvariantImpl
	 * @see KAOSModel.impl.KAOSModelPackageImpl#getDomainInvariant()
	 * @generated
	 */
	int DOMAIN_INVARIANT = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_INVARIANT__NAME = DOMAIN_PROPERTY__NAME;

	/**
	 * The feature id for the '<em><b>Refined By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_INVARIANT__REFINED_BY = DOMAIN_PROPERTY__REFINED_BY;

	/**
	 * The feature id for the '<em><b>Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_INVARIANT__RESOLVE = DOMAIN_PROPERTY__RESOLVE;

	/**
	 * The feature id for the '<em><b>Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_INVARIANT__CONFLICTS = DOMAIN_PROPERTY__CONFLICTS;

	/**
	 * The feature id for the '<em><b>Concerns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_INVARIANT__CONCERNS = DOMAIN_PROPERTY__CONCERNS;

	/**
	 * The feature id for the '<em><b>Used In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_INVARIANT__USED_IN = DOMAIN_PROPERTY__USED_IN;

	/**
	 * The number of structural features of the '<em>Domain Invariant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_INVARIANT_FEATURE_COUNT = DOMAIN_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Domain Invariant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_INVARIANT_OPERATION_COUNT = DOMAIN_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link KAOSModel.impl.ResolutionLinkImpl <em>Resolution Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see KAOSModel.impl.ResolutionLinkImpl
	 * @see KAOSModel.impl.KAOSModelPackageImpl#getResolutionLink()
	 * @generated
	 */
	int RESOLUTION_LINK = 29;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLUTION_LINK__NAME = LINK__NAME;

	/**
	 * The feature id for the '<em><b>Assign Obstacle To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLUTION_LINK__ASSIGN_OBSTACLE_TO = LINK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Resolution Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLUTION_LINK_FEATURE_COUNT = LINK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Resolution Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLUTION_LINK_OPERATION_COUNT = LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link KAOSModel.impl.ResponsabilityLinkImpl <em>Responsability Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see KAOSModel.impl.ResponsabilityLinkImpl
	 * @see KAOSModel.impl.KAOSModelPackageImpl#getResponsabilityLink()
	 * @generated
	 */
	int RESPONSABILITY_LINK = 30;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSABILITY_LINK__NAME = LINK__NAME;

	/**
	 * The feature id for the '<em><b>Assign Agent To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSABILITY_LINK__ASSIGN_AGENT_TO = LINK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Responsability Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSABILITY_LINK_FEATURE_COUNT = LINK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Responsability Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSABILITY_LINK_OPERATION_COUNT = LINK_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link KAOSModel.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see KAOSModel.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the reference list '{@link KAOSModel.Operation#getProduces <em>Produces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Produces</em>'.
	 * @see KAOSModel.Operation#getProduces()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Produces();

	/**
	 * Returns the meta object for the reference list '{@link KAOSModel.Operation#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Output</em>'.
	 * @see KAOSModel.Operation#getOutput()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Output();

	/**
	 * Returns the meta object for the reference list '{@link KAOSModel.Operation#getOperationalize <em>Operationalize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Operationalize</em>'.
	 * @see KAOSModel.Operation#getOperationalize()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Operationalize();

	/**
	 * Returns the meta object for the reference list '{@link KAOSModel.Operation#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input</em>'.
	 * @see KAOSModel.Operation#getInput()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Input();

	/**
	 * Returns the meta object for class '{@link KAOSModel.KAOS <em>KAOS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>KAOS</em>'.
	 * @see KAOSModel.KAOS
	 * @generated
	 */
	EClass getKAOS();

	/**
	 * Returns the meta object for the attribute '{@link KAOSModel.KAOS#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see KAOSModel.KAOS#getName()
	 * @see #getKAOS()
	 * @generated
	 */
	EAttribute getKAOS_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link KAOSModel.KAOS#getLinkedBy <em>Linked By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Linked By</em>'.
	 * @see KAOSModel.KAOS#getLinkedBy()
	 * @see #getKAOS()
	 * @generated
	 */
	EReference getKAOS_LinkedBy();

	/**
	 * Returns the meta object for the containment reference list '{@link KAOSModel.KAOS#getConsistsOf <em>Consists Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Consists Of</em>'.
	 * @see KAOSModel.KAOS#getConsistsOf()
	 * @see #getKAOS()
	 * @generated
	 */
	EReference getKAOS_ConsistsOf();

	/**
	 * Returns the meta object for class '{@link KAOSModel.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see KAOSModel.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the attribute '{@link KAOSModel.Link#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see KAOSModel.Link#getName()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Name();

	/**
	 * Returns the meta object for class '{@link KAOSModel.Nodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nodes</em>'.
	 * @see KAOSModel.Nodes
	 * @generated
	 */
	EClass getNodes();

	/**
	 * Returns the meta object for the attribute '{@link KAOSModel.Nodes#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see KAOSModel.Nodes#getName()
	 * @see #getNodes()
	 * @generated
	 */
	EAttribute getNodes_Name();

	/**
	 * Returns the meta object for class '{@link KAOSModel.OperationNode <em>Operation Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Node</em>'.
	 * @see KAOSModel.OperationNode
	 * @generated
	 */
	EClass getOperationNode();

	/**
	 * Returns the meta object for class '{@link KAOSModel.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see KAOSModel.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for class '{@link KAOSModel.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see KAOSModel.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the reference list '{@link KAOSModel.Entity#getComposition <em>Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Composition</em>'.
	 * @see KAOSModel.Entity#getComposition()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Composition();

	/**
	 * Returns the meta object for class '{@link KAOSModel.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object</em>'.
	 * @see KAOSModel.Object
	 * @generated
	 */
	EClass getObject();

	/**
	 * Returns the meta object for class '{@link KAOSModel.Associations <em>Associations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Associations</em>'.
	 * @see KAOSModel.Associations
	 * @generated
	 */
	EClass getAssociations();

	/**
	 * Returns the meta object for class '{@link KAOSModel.Agent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agent</em>'.
	 * @see KAOSModel.Agent
	 * @generated
	 */
	EClass getAgent();

	/**
	 * Returns the meta object for the reference list '{@link KAOSModel.Agent#getPerforms <em>Performs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Performs</em>'.
	 * @see KAOSModel.Agent#getPerforms()
	 * @see #getAgent()
	 * @generated
	 */
	EReference getAgent_Performs();

	/**
	 * Returns the meta object for the reference list '{@link KAOSModel.Agent#getComposition <em>Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Composition</em>'.
	 * @see KAOSModel.Agent#getComposition()
	 * @see #getAgent()
	 * @generated
	 */
	EReference getAgent_Composition();

	/**
	 * Returns the meta object for class '{@link KAOSModel.SoftwareAgent <em>Software Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Software Agent</em>'.
	 * @see KAOSModel.SoftwareAgent
	 * @generated
	 */
	EClass getSoftwareAgent();

	/**
	 * Returns the meta object for the reference list '{@link KAOSModel.SoftwareAgent#getResponsibleFor <em>Responsible For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Responsible For</em>'.
	 * @see KAOSModel.SoftwareAgent#getResponsibleFor()
	 * @see #getSoftwareAgent()
	 * @generated
	 */
	EReference getSoftwareAgent_ResponsibleFor();

	/**
	 * Returns the meta object for class '{@link KAOSModel.EnvironmentAgent <em>Environment Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Environment Agent</em>'.
	 * @see KAOSModel.EnvironmentAgent
	 * @generated
	 */
	EClass getEnvironmentAgent();

	/**
	 * Returns the meta object for class '{@link KAOSModel.RefinableNode <em>Refinable Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Refinable Node</em>'.
	 * @see KAOSModel.RefinableNode
	 * @generated
	 */
	EClass getRefinableNode();

	/**
	 * Returns the meta object for the reference list '{@link KAOSModel.RefinableNode#getRefinedBy <em>Refined By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Refined By</em>'.
	 * @see KAOSModel.RefinableNode#getRefinedBy()
	 * @see #getRefinableNode()
	 * @generated
	 */
	EReference getRefinableNode_RefinedBy();

	/**
	 * Returns the meta object for class '{@link KAOSModel.Obstacle <em>Obstacle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Obstacle</em>'.
	 * @see KAOSModel.Obstacle
	 * @generated
	 */
	EClass getObstacle();

	/**
	 * Returns the meta object for the reference list '{@link KAOSModel.Obstacle#getObstruct <em>Obstruct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Obstruct</em>'.
	 * @see KAOSModel.Obstacle#getObstruct()
	 * @see #getObstacle()
	 * @generated
	 */
	EReference getObstacle_Obstruct();

	/**
	 * Returns the meta object for class '{@link KAOSModel.Goal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Goal</em>'.
	 * @see KAOSModel.Goal
	 * @generated
	 */
	EClass getGoal();

	/**
	 * Returns the meta object for the reference list '{@link KAOSModel.Goal#getResolve <em>Resolve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Resolve</em>'.
	 * @see KAOSModel.Goal#getResolve()
	 * @see #getGoal()
	 * @generated
	 */
	EReference getGoal_Resolve();

	/**
	 * Returns the meta object for the reference list '{@link KAOSModel.Goal#getConflicts <em>Conflicts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Conflicts</em>'.
	 * @see KAOSModel.Goal#getConflicts()
	 * @see #getGoal()
	 * @generated
	 */
	EReference getGoal_Conflicts();

	/**
	 * Returns the meta object for the reference list '{@link KAOSModel.Goal#getConcerns <em>Concerns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Concerns</em>'.
	 * @see KAOSModel.Goal#getConcerns()
	 * @see #getGoal()
	 * @generated
	 */
	EReference getGoal_Concerns();

	/**
	 * Returns the meta object for class '{@link KAOSModel.AssignmentLink <em>Assignment Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignment Link</em>'.
	 * @see KAOSModel.AssignmentLink
	 * @generated
	 */
	EClass getAssignmentLink();

	/**
	 * Returns the meta object for the reference list '{@link KAOSModel.AssignmentLink#getAssignsGoalTo <em>Assigns Goal To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Assigns Goal To</em>'.
	 * @see KAOSModel.AssignmentLink#getAssignsGoalTo()
	 * @see #getAssignmentLink()
	 * @generated
	 */
	EReference getAssignmentLink_AssignsGoalTo();

	/**
	 * Returns the meta object for class '{@link KAOSModel.ConflictLink <em>Conflict Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conflict Link</em>'.
	 * @see KAOSModel.ConflictLink
	 * @generated
	 */
	EClass getConflictLink();

	/**
	 * Returns the meta object for class '{@link KAOSModel.ObstructionLink <em>Obstruction Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Obstruction Link</em>'.
	 * @see KAOSModel.ObstructionLink
	 * @generated
	 */
	EClass getObstructionLink();

	/**
	 * Returns the meta object for the reference list '{@link KAOSModel.ObstructionLink#getRelateKGoalTo <em>Relate KGoal To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Relate KGoal To</em>'.
	 * @see KAOSModel.ObstructionLink#getRelateKGoalTo()
	 * @see #getObstructionLink()
	 * @generated
	 */
	EReference getObstructionLink_RelateKGoalTo();

	/**
	 * Returns the meta object for class '{@link KAOSModel.OutputLink <em>Output Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Link</em>'.
	 * @see KAOSModel.OutputLink
	 * @generated
	 */
	EClass getOutputLink();

	/**
	 * Returns the meta object for class '{@link KAOSModel.Expectation <em>Expectation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expectation</em>'.
	 * @see KAOSModel.Expectation
	 * @generated
	 */
	EClass getExpectation();

	/**
	 * Returns the meta object for the reference list '{@link KAOSModel.Expectation#getAssignedTo <em>Assigned To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Assigned To</em>'.
	 * @see KAOSModel.Expectation#getAssignedTo()
	 * @see #getExpectation()
	 * @generated
	 */
	EReference getExpectation_AssignedTo();

	/**
	 * Returns the meta object for class '{@link KAOSModel.InputLink <em>Input Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Link</em>'.
	 * @see KAOSModel.InputLink
	 * @generated
	 */
	EClass getInputLink();

	/**
	 * Returns the meta object for the reference list '{@link KAOSModel.InputLink#getObjectInputOn <em>Object Input On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Object Input On</em>'.
	 * @see KAOSModel.InputLink#getObjectInputOn()
	 * @see #getInputLink()
	 * @generated
	 */
	EReference getInputLink_ObjectInputOn();

	/**
	 * Returns the meta object for class '{@link KAOSModel.Refinement <em>Refinement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Refinement</em>'.
	 * @see KAOSModel.Refinement
	 * @generated
	 */
	EClass getRefinement();

	/**
	 * Returns the meta object for the reference '{@link KAOSModel.Refinement#getRefines <em>Refines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Refines</em>'.
	 * @see KAOSModel.Refinement#getRefines()
	 * @see #getRefinement()
	 * @generated
	 */
	EReference getRefinement_Refines();

	/**
	 * Returns the meta object for class '{@link KAOSModel.AndRefinement <em>And Refinement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And Refinement</em>'.
	 * @see KAOSModel.AndRefinement
	 * @generated
	 */
	EClass getAndRefinement();

	/**
	 * Returns the meta object for class '{@link KAOSModel.OrRefinement <em>Or Refinement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or Refinement</em>'.
	 * @see KAOSModel.OrRefinement
	 * @generated
	 */
	EClass getOrRefinement();

	/**
	 * Returns the meta object for class '{@link KAOSModel.DomainProperty <em>Domain Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Property</em>'.
	 * @see KAOSModel.DomainProperty
	 * @generated
	 */
	EClass getDomainProperty();

	/**
	 * Returns the meta object for the reference list '{@link KAOSModel.DomainProperty#getUsedIn <em>Used In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Used In</em>'.
	 * @see KAOSModel.DomainProperty#getUsedIn()
	 * @see #getDomainProperty()
	 * @generated
	 */
	EReference getDomainProperty_UsedIn();

	/**
	 * Returns the meta object for class '{@link KAOSModel.Requirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement</em>'.
	 * @see KAOSModel.Requirement
	 * @generated
	 */
	EClass getRequirement();

	/**
	 * Returns the meta object for class '{@link KAOSModel.OperacionalizationLink <em>Operacionalization Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operacionalization Link</em>'.
	 * @see KAOSModel.OperacionalizationLink
	 * @generated
	 */
	EClass getOperacionalizationLink();

	/**
	 * Returns the meta object for the reference list '{@link KAOSModel.OperacionalizationLink#getRelateOperationTo <em>Relate Operation To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Relate Operation To</em>'.
	 * @see KAOSModel.OperacionalizationLink#getRelateOperationTo()
	 * @see #getOperacionalizationLink()
	 * @generated
	 */
	EReference getOperacionalizationLink_RelateOperationTo();

	/**
	 * Returns the meta object for class '{@link KAOSModel.DomainHypothesis <em>Domain Hypothesis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Hypothesis</em>'.
	 * @see KAOSModel.DomainHypothesis
	 * @generated
	 */
	EClass getDomainHypothesis();

	/**
	 * Returns the meta object for class '{@link KAOSModel.DomainInvariant <em>Domain Invariant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Invariant</em>'.
	 * @see KAOSModel.DomainInvariant
	 * @generated
	 */
	EClass getDomainInvariant();

	/**
	 * Returns the meta object for class '{@link KAOSModel.ResolutionLink <em>Resolution Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resolution Link</em>'.
	 * @see KAOSModel.ResolutionLink
	 * @generated
	 */
	EClass getResolutionLink();

	/**
	 * Returns the meta object for the reference list '{@link KAOSModel.ResolutionLink#getAssignObstacleTo <em>Assign Obstacle To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Assign Obstacle To</em>'.
	 * @see KAOSModel.ResolutionLink#getAssignObstacleTo()
	 * @see #getResolutionLink()
	 * @generated
	 */
	EReference getResolutionLink_AssignObstacleTo();

	/**
	 * Returns the meta object for class '{@link KAOSModel.ResponsabilityLink <em>Responsability Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Responsability Link</em>'.
	 * @see KAOSModel.ResponsabilityLink
	 * @generated
	 */
	EClass getResponsabilityLink();

	/**
	 * Returns the meta object for the reference list '{@link KAOSModel.ResponsabilityLink#getAssignAgentTo <em>Assign Agent To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Assign Agent To</em>'.
	 * @see KAOSModel.ResponsabilityLink#getAssignAgentTo()
	 * @see #getResponsabilityLink()
	 * @generated
	 */
	EReference getResponsabilityLink_AssignAgentTo();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	KAOSModelFactory getKAOSModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link KAOSModel.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see KAOSModel.impl.OperationImpl
		 * @see KAOSModel.impl.KAOSModelPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Produces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__PRODUCES = eINSTANCE.getOperation_Produces();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__OUTPUT = eINSTANCE.getOperation_Output();

		/**
		 * The meta object literal for the '<em><b>Operationalize</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__OPERATIONALIZE = eINSTANCE.getOperation_Operationalize();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__INPUT = eINSTANCE.getOperation_Input();

		/**
		 * The meta object literal for the '{@link KAOSModel.impl.KAOSImpl <em>KAOS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see KAOSModel.impl.KAOSImpl
		 * @see KAOSModel.impl.KAOSModelPackageImpl#getKAOS()
		 * @generated
		 */
		EClass KAOS = eINSTANCE.getKAOS();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KAOS__NAME = eINSTANCE.getKAOS_Name();

		/**
		 * The meta object literal for the '<em><b>Linked By</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KAOS__LINKED_BY = eINSTANCE.getKAOS_LinkedBy();

		/**
		 * The meta object literal for the '<em><b>Consists Of</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KAOS__CONSISTS_OF = eINSTANCE.getKAOS_ConsistsOf();

		/**
		 * The meta object literal for the '{@link KAOSModel.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see KAOSModel.impl.LinkImpl
		 * @see KAOSModel.impl.KAOSModelPackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__NAME = eINSTANCE.getLink_Name();

		/**
		 * The meta object literal for the '{@link KAOSModel.impl.NodesImpl <em>Nodes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see KAOSModel.impl.NodesImpl
		 * @see KAOSModel.impl.KAOSModelPackageImpl#getNodes()
		 * @generated
		 */
		EClass NODES = eINSTANCE.getNodes();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODES__NAME = eINSTANCE.getNodes_Name();

		/**
		 * The meta object literal for the '{@link KAOSModel.impl.OperationNodeImpl <em>Operation Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see KAOSModel.impl.OperationNodeImpl
		 * @see KAOSModel.impl.KAOSModelPackageImpl#getOperationNode()
		 * @generated
		 */
		EClass OPERATION_NODE = eINSTANCE.getOperationNode();

		/**
		 * The meta object literal for the '{@link KAOSModel.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see KAOSModel.impl.EventImpl
		 * @see KAOSModel.impl.KAOSModelPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '{@link KAOSModel.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see KAOSModel.impl.EntityImpl
		 * @see KAOSModel.impl.KAOSModelPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '<em><b>Composition</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__COMPOSITION = eINSTANCE.getEntity_Composition();

		/**
		 * The meta object literal for the '{@link KAOSModel.impl.ObjectImpl <em>Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see KAOSModel.impl.ObjectImpl
		 * @see KAOSModel.impl.KAOSModelPackageImpl#getObject()
		 * @generated
		 */
		EClass OBJECT = eINSTANCE.getObject();

		/**
		 * The meta object literal for the '{@link KAOSModel.impl.AssociationsImpl <em>Associations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see KAOSModel.impl.AssociationsImpl
		 * @see KAOSModel.impl.KAOSModelPackageImpl#getAssociations()
		 * @generated
		 */
		EClass ASSOCIATIONS = eINSTANCE.getAssociations();

		/**
		 * The meta object literal for the '{@link KAOSModel.impl.AgentImpl <em>Agent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see KAOSModel.impl.AgentImpl
		 * @see KAOSModel.impl.KAOSModelPackageImpl#getAgent()
		 * @generated
		 */
		EClass AGENT = eINSTANCE.getAgent();

		/**
		 * The meta object literal for the '<em><b>Performs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT__PERFORMS = eINSTANCE.getAgent_Performs();

		/**
		 * The meta object literal for the '<em><b>Composition</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT__COMPOSITION = eINSTANCE.getAgent_Composition();

		/**
		 * The meta object literal for the '{@link KAOSModel.impl.SoftwareAgentImpl <em>Software Agent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see KAOSModel.impl.SoftwareAgentImpl
		 * @see KAOSModel.impl.KAOSModelPackageImpl#getSoftwareAgent()
		 * @generated
		 */
		EClass SOFTWARE_AGENT = eINSTANCE.getSoftwareAgent();

		/**
		 * The meta object literal for the '<em><b>Responsible For</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTWARE_AGENT__RESPONSIBLE_FOR = eINSTANCE.getSoftwareAgent_ResponsibleFor();

		/**
		 * The meta object literal for the '{@link KAOSModel.impl.EnvironmentAgentImpl <em>Environment Agent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see KAOSModel.impl.EnvironmentAgentImpl
		 * @see KAOSModel.impl.KAOSModelPackageImpl#getEnvironmentAgent()
		 * @generated
		 */
		EClass ENVIRONMENT_AGENT = eINSTANCE.getEnvironmentAgent();

		/**
		 * The meta object literal for the '{@link KAOSModel.impl.RefinableNodeImpl <em>Refinable Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see KAOSModel.impl.RefinableNodeImpl
		 * @see KAOSModel.impl.KAOSModelPackageImpl#getRefinableNode()
		 * @generated
		 */
		EClass REFINABLE_NODE = eINSTANCE.getRefinableNode();

		/**
		 * The meta object literal for the '<em><b>Refined By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFINABLE_NODE__REFINED_BY = eINSTANCE.getRefinableNode_RefinedBy();

		/**
		 * The meta object literal for the '{@link KAOSModel.impl.ObstacleImpl <em>Obstacle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see KAOSModel.impl.ObstacleImpl
		 * @see KAOSModel.impl.KAOSModelPackageImpl#getObstacle()
		 * @generated
		 */
		EClass OBSTACLE = eINSTANCE.getObstacle();

		/**
		 * The meta object literal for the '<em><b>Obstruct</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBSTACLE__OBSTRUCT = eINSTANCE.getObstacle_Obstruct();

		/**
		 * The meta object literal for the '{@link KAOSModel.impl.GoalImpl <em>Goal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see KAOSModel.impl.GoalImpl
		 * @see KAOSModel.impl.KAOSModelPackageImpl#getGoal()
		 * @generated
		 */
		EClass GOAL = eINSTANCE.getGoal();

		/**
		 * The meta object literal for the '<em><b>Resolve</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL__RESOLVE = eINSTANCE.getGoal_Resolve();

		/**
		 * The meta object literal for the '<em><b>Conflicts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL__CONFLICTS = eINSTANCE.getGoal_Conflicts();

		/**
		 * The meta object literal for the '<em><b>Concerns</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL__CONCERNS = eINSTANCE.getGoal_Concerns();

		/**
		 * The meta object literal for the '{@link KAOSModel.impl.AssignmentLinkImpl <em>Assignment Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see KAOSModel.impl.AssignmentLinkImpl
		 * @see KAOSModel.impl.KAOSModelPackageImpl#getAssignmentLink()
		 * @generated
		 */
		EClass ASSIGNMENT_LINK = eINSTANCE.getAssignmentLink();

		/**
		 * The meta object literal for the '<em><b>Assigns Goal To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_LINK__ASSIGNS_GOAL_TO = eINSTANCE.getAssignmentLink_AssignsGoalTo();

		/**
		 * The meta object literal for the '{@link KAOSModel.impl.ConflictLinkImpl <em>Conflict Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see KAOSModel.impl.ConflictLinkImpl
		 * @see KAOSModel.impl.KAOSModelPackageImpl#getConflictLink()
		 * @generated
		 */
		EClass CONFLICT_LINK = eINSTANCE.getConflictLink();

		/**
		 * The meta object literal for the '{@link KAOSModel.impl.ObstructionLinkImpl <em>Obstruction Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see KAOSModel.impl.ObstructionLinkImpl
		 * @see KAOSModel.impl.KAOSModelPackageImpl#getObstructionLink()
		 * @generated
		 */
		EClass OBSTRUCTION_LINK = eINSTANCE.getObstructionLink();

		/**
		 * The meta object literal for the '<em><b>Relate KGoal To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBSTRUCTION_LINK__RELATE_KGOAL_TO = eINSTANCE.getObstructionLink_RelateKGoalTo();

		/**
		 * The meta object literal for the '{@link KAOSModel.impl.OutputLinkImpl <em>Output Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see KAOSModel.impl.OutputLinkImpl
		 * @see KAOSModel.impl.KAOSModelPackageImpl#getOutputLink()
		 * @generated
		 */
		EClass OUTPUT_LINK = eINSTANCE.getOutputLink();

		/**
		 * The meta object literal for the '{@link KAOSModel.impl.ExpectationImpl <em>Expectation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see KAOSModel.impl.ExpectationImpl
		 * @see KAOSModel.impl.KAOSModelPackageImpl#getExpectation()
		 * @generated
		 */
		EClass EXPECTATION = eINSTANCE.getExpectation();

		/**
		 * The meta object literal for the '<em><b>Assigned To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPECTATION__ASSIGNED_TO = eINSTANCE.getExpectation_AssignedTo();

		/**
		 * The meta object literal for the '{@link KAOSModel.impl.InputLinkImpl <em>Input Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see KAOSModel.impl.InputLinkImpl
		 * @see KAOSModel.impl.KAOSModelPackageImpl#getInputLink()
		 * @generated
		 */
		EClass INPUT_LINK = eINSTANCE.getInputLink();

		/**
		 * The meta object literal for the '<em><b>Object Input On</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_LINK__OBJECT_INPUT_ON = eINSTANCE.getInputLink_ObjectInputOn();

		/**
		 * The meta object literal for the '{@link KAOSModel.impl.RefinementImpl <em>Refinement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see KAOSModel.impl.RefinementImpl
		 * @see KAOSModel.impl.KAOSModelPackageImpl#getRefinement()
		 * @generated
		 */
		EClass REFINEMENT = eINSTANCE.getRefinement();

		/**
		 * The meta object literal for the '<em><b>Refines</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFINEMENT__REFINES = eINSTANCE.getRefinement_Refines();

		/**
		 * The meta object literal for the '{@link KAOSModel.impl.AndRefinementImpl <em>And Refinement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see KAOSModel.impl.AndRefinementImpl
		 * @see KAOSModel.impl.KAOSModelPackageImpl#getAndRefinement()
		 * @generated
		 */
		EClass AND_REFINEMENT = eINSTANCE.getAndRefinement();

		/**
		 * The meta object literal for the '{@link KAOSModel.impl.OrRefinementImpl <em>Or Refinement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see KAOSModel.impl.OrRefinementImpl
		 * @see KAOSModel.impl.KAOSModelPackageImpl#getOrRefinement()
		 * @generated
		 */
		EClass OR_REFINEMENT = eINSTANCE.getOrRefinement();

		/**
		 * The meta object literal for the '{@link KAOSModel.impl.DomainPropertyImpl <em>Domain Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see KAOSModel.impl.DomainPropertyImpl
		 * @see KAOSModel.impl.KAOSModelPackageImpl#getDomainProperty()
		 * @generated
		 */
		EClass DOMAIN_PROPERTY = eINSTANCE.getDomainProperty();

		/**
		 * The meta object literal for the '<em><b>Used In</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_PROPERTY__USED_IN = eINSTANCE.getDomainProperty_UsedIn();

		/**
		 * The meta object literal for the '{@link KAOSModel.impl.RequirementImpl <em>Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see KAOSModel.impl.RequirementImpl
		 * @see KAOSModel.impl.KAOSModelPackageImpl#getRequirement()
		 * @generated
		 */
		EClass REQUIREMENT = eINSTANCE.getRequirement();

		/**
		 * The meta object literal for the '{@link KAOSModel.impl.OperacionalizationLinkImpl <em>Operacionalization Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see KAOSModel.impl.OperacionalizationLinkImpl
		 * @see KAOSModel.impl.KAOSModelPackageImpl#getOperacionalizationLink()
		 * @generated
		 */
		EClass OPERACIONALIZATION_LINK = eINSTANCE.getOperacionalizationLink();

		/**
		 * The meta object literal for the '<em><b>Relate Operation To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERACIONALIZATION_LINK__RELATE_OPERATION_TO = eINSTANCE.getOperacionalizationLink_RelateOperationTo();

		/**
		 * The meta object literal for the '{@link KAOSModel.impl.DomainHypothesisImpl <em>Domain Hypothesis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see KAOSModel.impl.DomainHypothesisImpl
		 * @see KAOSModel.impl.KAOSModelPackageImpl#getDomainHypothesis()
		 * @generated
		 */
		EClass DOMAIN_HYPOTHESIS = eINSTANCE.getDomainHypothesis();

		/**
		 * The meta object literal for the '{@link KAOSModel.impl.DomainInvariantImpl <em>Domain Invariant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see KAOSModel.impl.DomainInvariantImpl
		 * @see KAOSModel.impl.KAOSModelPackageImpl#getDomainInvariant()
		 * @generated
		 */
		EClass DOMAIN_INVARIANT = eINSTANCE.getDomainInvariant();

		/**
		 * The meta object literal for the '{@link KAOSModel.impl.ResolutionLinkImpl <em>Resolution Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see KAOSModel.impl.ResolutionLinkImpl
		 * @see KAOSModel.impl.KAOSModelPackageImpl#getResolutionLink()
		 * @generated
		 */
		EClass RESOLUTION_LINK = eINSTANCE.getResolutionLink();

		/**
		 * The meta object literal for the '<em><b>Assign Obstacle To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOLUTION_LINK__ASSIGN_OBSTACLE_TO = eINSTANCE.getResolutionLink_AssignObstacleTo();

		/**
		 * The meta object literal for the '{@link KAOSModel.impl.ResponsabilityLinkImpl <em>Responsability Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see KAOSModel.impl.ResponsabilityLinkImpl
		 * @see KAOSModel.impl.KAOSModelPackageImpl#getResponsabilityLink()
		 * @generated
		 */
		EClass RESPONSABILITY_LINK = eINSTANCE.getResponsabilityLink();

		/**
		 * The meta object literal for the '<em><b>Assign Agent To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSABILITY_LINK__ASSIGN_AGENT_TO = eINSTANCE.getResponsabilityLink_AssignAgentTo();

	}

} //KAOSModelPackage
