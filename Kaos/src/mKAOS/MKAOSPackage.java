/**
 */
package mKAOS;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import mKAOS.impl.*;

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
 * @see mKAOS.MKAOSFactory
 * @model kind="package"
 * @generated
 */
public interface MKAOSPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mKAOS";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "dsl.mKAOS";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dsl.mKAOS";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MKAOSPackage eINSTANCE = mKAOS.impl.MKAOSPackageImpl.init();

	/**
	 * The meta object id for the '{@link mKAOS.impl.NodesImpl <em>Nodes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mKAOS.impl.NodesImpl
	 * @see mKAOS.impl.MKAOSPackageImpl#getNodes()
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
	 * The meta object id for the '{@link mKAOS.impl.OperationNodeImpl <em>Operation Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mKAOS.impl.OperationNodeImpl
	 * @see mKAOS.impl.MKAOSPackageImpl#getOperationNode()
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
	 * The meta object id for the '{@link mKAOS.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mKAOS.impl.OperationImpl
	 * @see mKAOS.impl.MKAOSPackageImpl#getOperation()
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
	 * The meta object id for the '{@link mKAOS.impl.KAOSImpl <em>KAOS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mKAOS.impl.KAOSImpl
	 * @see mKAOS.impl.MKAOSPackageImpl#getKAOS()
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
	 * The meta object id for the '{@link mKAOS.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mKAOS.impl.LinkImpl
	 * @see mKAOS.impl.MKAOSPackageImpl#getLink()
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
	 * The meta object id for the '{@link mKAOS.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mKAOS.impl.EventImpl
	 * @see mKAOS.impl.MKAOSPackageImpl#getEvent()
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
	 * The meta object id for the '{@link mKAOS.impl.ObjectImpl <em>Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mKAOS.impl.ObjectImpl
	 * @see mKAOS.impl.MKAOSPackageImpl#getObject()
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
	 * The meta object id for the '{@link mKAOS.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mKAOS.impl.EntityImpl
	 * @see mKAOS.impl.MKAOSPackageImpl#getEntity()
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
	 * The meta object id for the '{@link mKAOS.impl.AssociationsImpl <em>Associations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mKAOS.impl.AssociationsImpl
	 * @see mKAOS.impl.MKAOSPackageImpl#getAssociations()
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
	 * The meta object id for the '{@link mKAOS.impl.AgentImpl <em>Agent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mKAOS.impl.AgentImpl
	 * @see mKAOS.impl.MKAOSPackageImpl#getAgent()
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
	 * The meta object id for the '{@link mKAOS.impl.SoftwareAgentImpl <em>Software Agent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mKAOS.impl.SoftwareAgentImpl
	 * @see mKAOS.impl.MKAOSPackageImpl#getSoftwareAgent()
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
	 * The meta object id for the '{@link mKAOS.impl.EnvironmentAgentImpl <em>Environment Agent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mKAOS.impl.EnvironmentAgentImpl
	 * @see mKAOS.impl.MKAOSPackageImpl#getEnvironmentAgent()
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
	 * The meta object id for the '{@link mKAOS.impl.RefinableNodeImpl <em>Refinable Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mKAOS.impl.RefinableNodeImpl
	 * @see mKAOS.impl.MKAOSPackageImpl#getRefinableNode()
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
	 * The meta object id for the '{@link mKAOS.impl.ObstacleImpl <em>Obstacle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mKAOS.impl.ObstacleImpl
	 * @see mKAOS.impl.MKAOSPackageImpl#getObstacle()
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
	 * The meta object id for the '{@link mKAOS.impl.GoalImpl <em>Goal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mKAOS.impl.GoalImpl
	 * @see mKAOS.impl.MKAOSPackageImpl#getGoal()
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
	 * The meta object id for the '{@link mKAOS.impl.AssignmentLinkImpl <em>Assignment Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mKAOS.impl.AssignmentLinkImpl
	 * @see mKAOS.impl.MKAOSPackageImpl#getAssignmentLink()
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
	 * The meta object id for the '{@link mKAOS.impl.ConflictLinkImpl <em>Conflict Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mKAOS.impl.ConflictLinkImpl
	 * @see mKAOS.impl.MKAOSPackageImpl#getConflictLink()
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
	 * The meta object id for the '{@link mKAOS.impl.ObstructionLinkImpl <em>Obstruction Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mKAOS.impl.ObstructionLinkImpl
	 * @see mKAOS.impl.MKAOSPackageImpl#getObstructionLink()
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
	 * The meta object id for the '{@link mKAOS.impl.OutputLinkImpl <em>Output Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mKAOS.impl.OutputLinkImpl
	 * @see mKAOS.impl.MKAOSPackageImpl#getOutputLink()
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
	 * The meta object id for the '{@link mKAOS.impl.ExpectationImpl <em>Expectation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mKAOS.impl.ExpectationImpl
	 * @see mKAOS.impl.MKAOSPackageImpl#getExpectation()
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
	 * The meta object id for the '{@link mKAOS.impl.InputLinkImpl <em>Input Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mKAOS.impl.InputLinkImpl
	 * @see mKAOS.impl.MKAOSPackageImpl#getInputLink()
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
	 * The meta object id for the '{@link mKAOS.impl.RefinementImpl <em>Refinement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mKAOS.impl.RefinementImpl
	 * @see mKAOS.impl.MKAOSPackageImpl#getRefinement()
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
	 * The meta object id for the '{@link mKAOS.impl.AndRefinementImpl <em>And Refinement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mKAOS.impl.AndRefinementImpl
	 * @see mKAOS.impl.MKAOSPackageImpl#getAndRefinement()
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
	 * The meta object id for the '{@link mKAOS.impl.OrRefinementImpl <em>Or Refinement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mKAOS.impl.OrRefinementImpl
	 * @see mKAOS.impl.MKAOSPackageImpl#getOrRefinement()
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
	 * The meta object id for the '{@link mKAOS.impl.DomainPropertyImpl <em>Domain Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mKAOS.impl.DomainPropertyImpl
	 * @see mKAOS.impl.MKAOSPackageImpl#getDomainProperty()
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
	 * The meta object id for the '{@link mKAOS.impl.RequirementImpl <em>Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mKAOS.impl.RequirementImpl
	 * @see mKAOS.impl.MKAOSPackageImpl#getRequirement()
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
	 * The meta object id for the '{@link mKAOS.impl.OperacionalizationLinkImpl <em>Operacionalization Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mKAOS.impl.OperacionalizationLinkImpl
	 * @see mKAOS.impl.MKAOSPackageImpl#getOperacionalizationLink()
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
	 * The meta object id for the '{@link mKAOS.impl.DomainHypothesisImpl <em>Domain Hypothesis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mKAOS.impl.DomainHypothesisImpl
	 * @see mKAOS.impl.MKAOSPackageImpl#getDomainHypothesis()
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
	 * The meta object id for the '{@link mKAOS.impl.DomainInvariantImpl <em>Domain Invariant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mKAOS.impl.DomainInvariantImpl
	 * @see mKAOS.impl.MKAOSPackageImpl#getDomainInvariant()
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
	 * The meta object id for the '{@link mKAOS.impl.ResolutionLinkImpl <em>Resolution Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mKAOS.impl.ResolutionLinkImpl
	 * @see mKAOS.impl.MKAOSPackageImpl#getResolutionLink()
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
	 * The meta object id for the '{@link mKAOS.impl.ResponsabilityLinkImpl <em>Responsability Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mKAOS.impl.ResponsabilityLinkImpl
	 * @see mKAOS.impl.MKAOSPackageImpl#getResponsabilityLink()
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
	 * The meta object id for the '{@link mKAOS.impl.mKAOSImpl <em>mKAOS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mKAOS.impl.mKAOSImpl
	 * @see mKAOS.impl.MKAOSPackageImpl#getmKAOS()
	 * @generated
	 */
	int MKAOS = 31;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKAOS__NAME = KAOS__NAME;

	/**
	 * The feature id for the '<em><b>Linked By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKAOS__LINKED_BY = KAOS__LINKED_BY;

	/**
	 * The feature id for the '<em><b>Consists Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKAOS__CONSISTS_OF = KAOS__CONSISTS_OF;

	/**
	 * The number of structural features of the '<em>mKAOS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKAOS_FEATURE_COUNT = KAOS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>mKAOS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKAOS_OPERATION_COUNT = KAOS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mKAOS.impl.MissionImpl <em>Mission</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mKAOS.impl.MissionImpl
	 * @see mKAOS.impl.MKAOSPackageImpl#getMission()
	 * @generated
	 */
	int MISSION = 32;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION__NAME = GOAL__NAME;

	/**
	 * The feature id for the '<em><b>Refined By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION__REFINED_BY = GOAL__REFINED_BY;

	/**
	 * The feature id for the '<em><b>Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION__RESOLVE = GOAL__RESOLVE;

	/**
	 * The feature id for the '<em><b>Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION__CONFLICTS = GOAL__CONFLICTS;

	/**
	 * The feature id for the '<em><b>Concerns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION__CONCERNS = GOAL__CONCERNS;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION__RULE = GOAL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION__PRIORITY = GOAL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Assigned To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION__ASSIGNED_TO = GOAL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION__LINKS = GOAL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION__DESCRIPTION = GOAL_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION__TRIGGER = GOAL_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Refinement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION__REFINEMENT = GOAL_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Mission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION_FEATURE_COUNT = GOAL_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Mission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION_OPERATION_COUNT = GOAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mKAOS.impl.EmergentBehaviorImpl <em>Emergent Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mKAOS.impl.EmergentBehaviorImpl
	 * @see mKAOS.impl.MKAOSPackageImpl#getEmergentBehavior()
	 * @generated
	 */
	int EMERGENT_BEHAVIOR = 33;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMERGENT_BEHAVIOR__NAME = NODES__NAME;

	/**
	 * The feature id for the '<em><b>Related To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMERGENT_BEHAVIOR__RELATED_TO = NODES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Emergent Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMERGENT_BEHAVIOR_FEATURE_COUNT = NODES_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Emergent Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMERGENT_BEHAVIOR_OPERATION_COUNT = NODES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mKAOS.impl.ConstituentSystemImpl <em>Constituent System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mKAOS.impl.ConstituentSystemImpl
	 * @see mKAOS.impl.MKAOSPackageImpl#getConstituentSystem()
	 * @generated
	 */
	int CONSTITUENT_SYSTEM = 34;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTITUENT_SYSTEM__NAME = SOFTWARE_AGENT__NAME;

	/**
	 * The feature id for the '<em><b>Performs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTITUENT_SYSTEM__PERFORMS = SOFTWARE_AGENT__PERFORMS;

	/**
	 * The feature id for the '<em><b>Composition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTITUENT_SYSTEM__COMPOSITION = SOFTWARE_AGENT__COMPOSITION;

	/**
	 * The feature id for the '<em><b>Responsible For</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTITUENT_SYSTEM__RESPONSIBLE_FOR = SOFTWARE_AGENT__RESPONSIBLE_FOR;

	/**
	 * The feature id for the '<em><b>Capable Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTITUENT_SYSTEM__CAPABLE_OF = SOFTWARE_AGENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Constituent System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTITUENT_SYSTEM_FEATURE_COUNT = SOFTWARE_AGENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Constituent System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTITUENT_SYSTEM_OPERATION_COUNT = SOFTWARE_AGENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mKAOS.impl.MediatorImpl <em>Mediator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mKAOS.impl.MediatorImpl
	 * @see mKAOS.impl.MKAOSPackageImpl#getMediator()
	 * @generated
	 */
	int MEDIATOR = 35;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATOR__NAME = SOFTWARE_AGENT__NAME;

	/**
	 * The feature id for the '<em><b>Performs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATOR__PERFORMS = SOFTWARE_AGENT__PERFORMS;

	/**
	 * The feature id for the '<em><b>Composition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATOR__COMPOSITION = SOFTWARE_AGENT__COMPOSITION;

	/**
	 * The feature id for the '<em><b>Responsible For</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATOR__RESPONSIBLE_FOR = SOFTWARE_AGENT__RESPONSIBLE_FOR;

	/**
	 * The feature id for the '<em><b>Capable Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATOR__CAPABLE_OF = SOFTWARE_AGENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Mediator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATOR_FEATURE_COUNT = SOFTWARE_AGENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Mediator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATOR_OPERATION_COUNT = SOFTWARE_AGENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mKAOS.impl.OperationalCapabilityImpl <em>Operational Capability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mKAOS.impl.OperationalCapabilityImpl
	 * @see mKAOS.impl.MKAOSPackageImpl#getOperationalCapability()
	 * @generated
	 */
	int OPERATIONAL_CAPABILITY = 36;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_CAPABILITY__NAME = OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Produces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_CAPABILITY__PRODUCES = OPERATION__PRODUCES;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_CAPABILITY__OUTPUT = OPERATION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Operationalize</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_CAPABILITY__OPERATIONALIZE = OPERATION__OPERATIONALIZE;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_CAPABILITY__INPUT = OPERATION__INPUT;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_CAPABILITY__DESC = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Operational Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_CAPABILITY_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Operational Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_CAPABILITY_OPERATION_COUNT = OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mKAOS.impl.CommunicationalCapabilityImpl <em>Communicational Capability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mKAOS.impl.CommunicationalCapabilityImpl
	 * @see mKAOS.impl.MKAOSPackageImpl#getCommunicationalCapability()
	 * @generated
	 */
	int COMMUNICATIONAL_CAPABILITY = 37;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATIONAL_CAPABILITY__NAME = OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Produces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATIONAL_CAPABILITY__PRODUCES = OPERATION__PRODUCES;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATIONAL_CAPABILITY__OUTPUT = OPERATION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Operationalize</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATIONAL_CAPABILITY__OPERATIONALIZE = OPERATION__OPERATIONALIZE;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATIONAL_CAPABILITY__INPUT = OPERATION__INPUT;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATIONAL_CAPABILITY__DESC = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Communicational Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATIONAL_CAPABILITY_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Communicational Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATIONAL_CAPABILITY_OPERATION_COUNT = OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mKAOS.impl.EmergeLinkImpl <em>Emerge Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mKAOS.impl.EmergeLinkImpl
	 * @see mKAOS.impl.MKAOSPackageImpl#getEmergeLink()
	 * @generated
	 */
	int EMERGE_LINK = 38;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMERGE_LINK__NAME = LINK__NAME;

	/**
	 * The feature id for the '<em><b>Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMERGE_LINK__BEHAVIOR = LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Capability</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMERGE_LINK__CAPABILITY = LINK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMERGE_LINK__CARDINALITY = LINK_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Emerge Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMERGE_LINK_FEATURE_COUNT = LINK_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Emerge Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMERGE_LINK_OPERATION_COUNT = LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mKAOS.impl.CommunicationLinkImpl <em>Communication Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mKAOS.impl.CommunicationLinkImpl
	 * @see mKAOS.impl.MKAOSPackageImpl#getCommunicationLink()
	 * @generated
	 */
	int COMMUNICATION_LINK = 39;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_LINK__NAME = LINK__NAME;

	/**
	 * The feature id for the '<em><b>Capability</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_LINK__CAPABILITY = LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_LINK__ENTITY = LINK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_LINK__CARDINALITY = LINK_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Communication Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_LINK_FEATURE_COUNT = LINK_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Communication Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_LINK_OPERATION_COUNT = LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mKAOS.impl.CommunicationInputLinkImpl <em>Communication Input Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mKAOS.impl.CommunicationInputLinkImpl
	 * @see mKAOS.impl.MKAOSPackageImpl#getCommunicationInputLink()
	 * @generated
	 */
	int COMMUNICATION_INPUT_LINK = 40;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_INPUT_LINK__NAME = COMMUNICATION_LINK__NAME;

	/**
	 * The feature id for the '<em><b>Capability</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_INPUT_LINK__CAPABILITY = COMMUNICATION_LINK__CAPABILITY;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_INPUT_LINK__ENTITY = COMMUNICATION_LINK__ENTITY;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_INPUT_LINK__CARDINALITY = COMMUNICATION_LINK__CARDINALITY;

	/**
	 * The number of structural features of the '<em>Communication Input Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_INPUT_LINK_FEATURE_COUNT = COMMUNICATION_LINK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Communication Input Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_INPUT_LINK_OPERATION_COUNT = COMMUNICATION_LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mKAOS.impl.CommunicationOutputLinkImpl <em>Communication Output Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mKAOS.impl.CommunicationOutputLinkImpl
	 * @see mKAOS.impl.MKAOSPackageImpl#getCommunicationOutputLink()
	 * @generated
	 */
	int COMMUNICATION_OUTPUT_LINK = 41;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_OUTPUT_LINK__NAME = COMMUNICATION_LINK__NAME;

	/**
	 * The feature id for the '<em><b>Capability</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_OUTPUT_LINK__CAPABILITY = COMMUNICATION_LINK__CAPABILITY;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_OUTPUT_LINK__ENTITY = COMMUNICATION_LINK__ENTITY;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_OUTPUT_LINK__CARDINALITY = COMMUNICATION_LINK__CARDINALITY;

	/**
	 * The number of structural features of the '<em>Communication Output Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_OUTPUT_LINK_FEATURE_COUNT = COMMUNICATION_LINK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Communication Output Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_OUTPUT_LINK_OPERATION_COUNT = COMMUNICATION_LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mKAOS.impl.MissionLinkImpl <em>Mission Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mKAOS.impl.MissionLinkImpl
	 * @see mKAOS.impl.MKAOSPackageImpl#getMissionLink()
	 * @generated
	 */
	int MISSION_LINK = 42;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION_LINK__NAME = LINK__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION_LINK__SOURCE = LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION_LINK__TARGET = LINK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Mission Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION_LINK_FEATURE_COUNT = LINK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Mission Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION_LINK_OPERATION_COUNT = LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mKAOS.impl.DisruptLinkImpl <em>Disrupt Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mKAOS.impl.DisruptLinkImpl
	 * @see mKAOS.impl.MKAOSPackageImpl#getDisruptLink()
	 * @generated
	 */
	int DISRUPT_LINK = 43;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISRUPT_LINK__NAME = MISSION_LINK__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISRUPT_LINK__SOURCE = MISSION_LINK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISRUPT_LINK__TARGET = MISSION_LINK__TARGET;

	/**
	 * The number of structural features of the '<em>Disrupt Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISRUPT_LINK_FEATURE_COUNT = MISSION_LINK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Disrupt Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISRUPT_LINK_OPERATION_COUNT = MISSION_LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mKAOS.impl.SuportLinkImpl <em>Suport Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mKAOS.impl.SuportLinkImpl
	 * @see mKAOS.impl.MKAOSPackageImpl#getSuportLink()
	 * @generated
	 */
	int SUPORT_LINK = 44;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPORT_LINK__NAME = MISSION_LINK__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPORT_LINK__SOURCE = MISSION_LINK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPORT_LINK__TARGET = MISSION_LINK__TARGET;

	/**
	 * The number of structural features of the '<em>Suport Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPORT_LINK_FEATURE_COUNT = MISSION_LINK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Suport Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPORT_LINK_OPERATION_COUNT = MISSION_LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mKAOS.impl.BlockLinkImpl <em>Block Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mKAOS.impl.BlockLinkImpl
	 * @see mKAOS.impl.MKAOSPackageImpl#getBlockLink()
	 * @generated
	 */
	int BLOCK_LINK = 45;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_LINK__NAME = MISSION_LINK__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_LINK__SOURCE = MISSION_LINK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_LINK__TARGET = MISSION_LINK__TARGET;

	/**
	 * The number of structural features of the '<em>Block Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_LINK_FEATURE_COUNT = MISSION_LINK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Block Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_LINK_OPERATION_COUNT = MISSION_LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mKAOS.impl.DependencyLinkImpl <em>Dependency Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mKAOS.impl.DependencyLinkImpl
	 * @see mKAOS.impl.MKAOSPackageImpl#getDependencyLink()
	 * @generated
	 */
	int DEPENDENCY_LINK = 46;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_LINK__NAME = MISSION_LINK__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_LINK__SOURCE = MISSION_LINK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_LINK__TARGET = MISSION_LINK__TARGET;

	/**
	 * The number of structural features of the '<em>Dependency Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_LINK_FEATURE_COUNT = MISSION_LINK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Dependency Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_LINK_OPERATION_COUNT = MISSION_LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mKAOS.impl.InfluenceLinkImpl <em>Influence Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mKAOS.impl.InfluenceLinkImpl
	 * @see mKAOS.impl.MKAOSPackageImpl#getInfluenceLink()
	 * @generated
	 */
	int INFLUENCE_LINK = 47;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCE_LINK__NAME = LINK__NAME;

	/**
	 * The feature id for the '<em><b>Expectation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCE_LINK__EXPECTATION = LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Influenced</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCE_LINK__INFLUENCED = LINK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Influence Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCE_LINK_FEATURE_COUNT = LINK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Influence Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCE_LINK_OPERATION_COUNT = LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mKAOS.impl.GeneralizationLinkImpl <em>Generalization Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mKAOS.impl.GeneralizationLinkImpl
	 * @see mKAOS.impl.MKAOSPackageImpl#getGeneralizationLink()
	 * @generated
	 */
	int GENERALIZATION_LINK = 48;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_LINK__NAME = LINK__NAME;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_LINK__ENTITY = LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Generalizes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_LINK__GENERALIZES = LINK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Generalization Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_LINK_FEATURE_COUNT = LINK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Generalization Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_LINK_OPERATION_COUNT = LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mKAOS.impl.CompositionLinkImpl <em>Composition Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mKAOS.impl.CompositionLinkImpl
	 * @see mKAOS.impl.MKAOSPackageImpl#getCompositionLink()
	 * @generated
	 */
	int COMPOSITION_LINK = 49;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_LINK__NAME = LINK__NAME;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_LINK__ENTITY = LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Composed By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_LINK__COMPOSED_BY = LINK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Composition Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_LINK_FEATURE_COUNT = LINK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Composition Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_LINK_OPERATION_COUNT = LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mKAOS.impl.FormalElementImpl <em>Formal Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mKAOS.impl.FormalElementImpl
	 * @see mKAOS.impl.MKAOSPackageImpl#getFormalElement()
	 * @generated
	 */
	int FORMAL_ELEMENT = 50;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_ELEMENT__RULE = 0;

	/**
	 * The number of structural features of the '<em>Formal Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Formal Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mKAOS.impl.MissionRefinementImpl <em>Mission Refinement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mKAOS.impl.MissionRefinementImpl
	 * @see mKAOS.impl.MKAOSPackageImpl#getMissionRefinement()
	 * @generated
	 */
	int MISSION_REFINEMENT = 51;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION_REFINEMENT__NAME = REFINEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Refines</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION_REFINEMENT__REFINES = REFINEMENT__REFINES;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION_REFINEMENT__KIND = REFINEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION_REFINEMENT__CUSTOM = REFINEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Submissions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION_REFINEMENT__SUBMISSIONS = REFINEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Mission Refinement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION_REFINEMENT_FEATURE_COUNT = REFINEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Mission Refinement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION_REFINEMENT_OPERATION_COUNT = REFINEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mKAOS.impl.DynBLTLImpl <em>Dyn BLTL</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mKAOS.impl.DynBLTLImpl
	 * @see mKAOS.impl.MKAOSPackageImpl#getDynBLTL()
	 * @generated
	 */
	int DYN_BLTL = 52;

	/**
	 * The feature id for the '<em><b>Q</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYN_BLTL__Q = 0;

	/**
	 * The feature id for the '<em><b>Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYN_BLTL__VAL = 1;

	/**
	 * The feature id for the '<em><b>C</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYN_BLTL__C = 2;

	/**
	 * The feature id for the '<em><b>T</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYN_BLTL__T = 3;

	/**
	 * The number of structural features of the '<em>Dyn BLTL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYN_BLTL_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Dyn BLTL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYN_BLTL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mKAOS.impl.RuleTemporalImpl <em>Rule Temporal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mKAOS.impl.RuleTemporalImpl
	 * @see mKAOS.impl.MKAOSPackageImpl#getRuleTemporal()
	 * @generated
	 */
	int RULE_TEMPORAL = 53;

	/**
	 * The feature id for the '<em><b>Q</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_TEMPORAL__Q = DYN_BLTL__Q;

	/**
	 * The feature id for the '<em><b>Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_TEMPORAL__VAL = DYN_BLTL__VAL;

	/**
	 * The feature id for the '<em><b>C</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_TEMPORAL__C = DYN_BLTL__C;

	/**
	 * The feature id for the '<em><b>T</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_TEMPORAL__T = DYN_BLTL__T;

	/**
	 * The feature id for the '<em><b>Val1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_TEMPORAL__VAL1 = DYN_BLTL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_TEMPORAL__B = DYN_BLTL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>E</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_TEMPORAL__E = DYN_BLTL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>O</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_TEMPORAL__O = DYN_BLTL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>O1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_TEMPORAL__O1 = DYN_BLTL_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Rule Temporal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_TEMPORAL_FEATURE_COUNT = DYN_BLTL_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Rule Temporal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_TEMPORAL_OPERATION_COUNT = DYN_BLTL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mKAOS.impl.RuleBoundImpl <em>Rule Bound</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mKAOS.impl.RuleBoundImpl
	 * @see mKAOS.impl.MKAOSPackageImpl#getRuleBound()
	 * @generated
	 */
	int RULE_BOUND = 54;

	/**
	 * The feature id for the '<em><b>Floatlit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_BOUND__FLOATLIT = 0;

	/**
	 * The feature id for the '<em><b>Integerlit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_BOUND__INTEGERLIT = 1;

	/**
	 * The feature id for the '<em><b>E</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_BOUND__E = 2;

	/**
	 * The number of structural features of the '<em>Rule Bound</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_BOUND_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Rule Bound</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_BOUND_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mKAOS.impl.RuleImplicationImpl <em>Rule Implication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mKAOS.impl.RuleImplicationImpl
	 * @see mKAOS.impl.MKAOSPackageImpl#getRuleImplication()
	 * @generated
	 */
	int RULE_IMPLICATION = 55;

	/**
	 * The feature id for the '<em><b>R</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_IMPLICATION__R = 0;

	/**
	 * The feature id for the '<em><b>L</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_IMPLICATION__L = 1;

	/**
	 * The number of structural features of the '<em>Rule Implication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_IMPLICATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Rule Implication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_IMPLICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mKAOS.impl.RuleDisjunctionImpl <em>Rule Disjunction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mKAOS.impl.RuleDisjunctionImpl
	 * @see mKAOS.impl.MKAOSPackageImpl#getRuleDisjunction()
	 * @generated
	 */
	int RULE_DISJUNCTION = 56;

	/**
	 * The feature id for the '<em><b>L</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_DISJUNCTION__L = 0;

	/**
	 * The feature id for the '<em><b>R</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_DISJUNCTION__R = 1;

	/**
	 * The number of structural features of the '<em>Rule Disjunction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_DISJUNCTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Rule Disjunction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_DISJUNCTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mKAOS.impl.RuleConjunctionImpl <em>Rule Conjunction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mKAOS.impl.RuleConjunctionImpl
	 * @see mKAOS.impl.MKAOSPackageImpl#getRuleConjunction()
	 * @generated
	 */
	int RULE_CONJUNCTION = 57;

	/**
	 * The feature id for the '<em><b>L</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_CONJUNCTION__L = 0;

	/**
	 * The feature id for the '<em><b>R</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_CONJUNCTION__R = 1;

	/**
	 * The number of structural features of the '<em>Rule Conjunction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_CONJUNCTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Rule Conjunction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_CONJUNCTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mKAOS.impl.RuleEqualityImpl <em>Rule Equality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mKAOS.impl.RuleEqualityImpl
	 * @see mKAOS.impl.MKAOSPackageImpl#getRuleEquality()
	 * @generated
	 */
	int RULE_EQUALITY = 58;

	/**
	 * The feature id for the '<em><b>Neg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_EQUALITY__NEG = 0;

	/**
	 * The feature id for the '<em><b>L</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_EQUALITY__L = 1;

	/**
	 * The feature id for the '<em><b>R</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_EQUALITY__R = 2;

	/**
	 * The number of structural features of the '<em>Rule Equality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_EQUALITY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Rule Equality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_EQUALITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mKAOS.impl.RuleRelExpImpl <em>Rule Rel Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mKAOS.impl.RuleRelExpImpl
	 * @see mKAOS.impl.MKAOSPackageImpl#getRuleRelExp()
	 * @generated
	 */
	int RULE_REL_EXP = 59;

	/**
	 * The feature id for the '<em><b>L</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_REL_EXP__L = 0;

	/**
	 * The feature id for the '<em><b>R</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_REL_EXP__R = 1;

	/**
	 * The number of structural features of the '<em>Rule Rel Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_REL_EXP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Rule Rel Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_REL_EXP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mKAOS.impl.RuleNumExpImpl <em>Rule Num Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mKAOS.impl.RuleNumExpImpl
	 * @see mKAOS.impl.MKAOSPackageImpl#getRuleNumExp()
	 * @generated
	 */
	int RULE_NUM_EXP = 60;

	/**
	 * The feature id for the '<em><b>L</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_NUM_EXP__L = 0;

	/**
	 * The feature id for the '<em><b>R</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_NUM_EXP__R = 1;

	/**
	 * The number of structural features of the '<em>Rule Num Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_NUM_EXP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Rule Num Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_NUM_EXP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mKAOS.impl.RuleTermImpl <em>Rule Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mKAOS.impl.RuleTermImpl
	 * @see mKAOS.impl.MKAOSPackageImpl#getRuleTerm()
	 * @generated
	 */
	int RULE_TERM = 61;

	/**
	 * The feature id for the '<em><b>R</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_TERM__R = 0;

	/**
	 * The feature id for the '<em><b>L</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_TERM__L = 1;

	/**
	 * The number of structural features of the '<em>Rule Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_TERM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Rule Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_TERM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mKAOS.impl.RuleFactorImpl <em>Rule Factor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mKAOS.impl.RuleFactorImpl
	 * @see mKAOS.impl.MKAOSPackageImpl#getRuleFactor()
	 * @generated
	 */
	int RULE_FACTOR = 62;

	/**
	 * The feature id for the '<em><b>Vallit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FACTOR__VALLIT = 0;

	/**
	 * The feature id for the '<em><b>Valvar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FACTOR__VALVAR = 1;

	/**
	 * The feature id for the '<em><b>Valfun</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FACTOR__VALFUN = 2;

	/**
	 * The feature id for the '<em><b>Curl</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FACTOR__CURL = 3;

	/**
	 * The feature id for the '<em><b>Par</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FACTOR__PAR = 4;

	/**
	 * The number of structural features of the '<em>Rule Factor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FACTOR_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Rule Factor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FACTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mKAOS.impl.RuleVarImpl <em>Rule Var</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mKAOS.impl.RuleVarImpl
	 * @see mKAOS.impl.MKAOSPackageImpl#getRuleVar()
	 * @generated
	 */
	int RULE_VAR = 63;

	/**
	 * The feature id for the '<em><b>Val</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_VAR__VAL = 0;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_VAR__I = 1;

	/**
	 * The number of structural features of the '<em>Rule Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_VAR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Rule Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_VAR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mKAOS.impl.RuleFunctionImpl <em>Rule Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mKAOS.impl.RuleFunctionImpl
	 * @see mKAOS.impl.MKAOSPackageImpl#getRuleFunction()
	 * @generated
	 */
	int RULE_FUNCTION = 64;

	/**
	 * The feature id for the '<em><b>L</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FUNCTION__L = 0;

	/**
	 * The number of structural features of the '<em>Rule Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FUNCTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Rule Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FUNCTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mKAOS.impl.RuleParamsImpl <em>Rule Params</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mKAOS.impl.RuleParamsImpl
	 * @see mKAOS.impl.MKAOSPackageImpl#getRuleParams()
	 * @generated
	 */
	int RULE_PARAMS = 65;

	/**
	 * The feature id for the '<em><b>L</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_PARAMS__L = 0;

	/**
	 * The number of structural features of the '<em>Rule Params</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_PARAMS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Rule Params</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_PARAMS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mKAOS.RuleLiteral <em>Rule Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mKAOS.RuleLiteral
	 * @see mKAOS.impl.MKAOSPackageImpl#getRuleLiteral()
	 * @generated
	 */
	int RULE_LITERAL = 66;

	/**
	 * The number of structural features of the '<em>Rule Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_LITERAL_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Rule Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_LITERAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mKAOS.impl.RuleIntegerLitImpl <em>Rule Integer Lit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mKAOS.impl.RuleIntegerLitImpl
	 * @see mKAOS.impl.MKAOSPackageImpl#getRuleIntegerLit()
	 * @generated
	 */
	int RULE_INTEGER_LIT = 67;

	/**
	 * The feature id for the '<em><b>Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_INTEGER_LIT__VAL = RULE_LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rule Integer Lit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_INTEGER_LIT_FEATURE_COUNT = RULE_LITERAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Rule Integer Lit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_INTEGER_LIT_OPERATION_COUNT = RULE_LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mKAOS.impl.RuleFloatLitImpl <em>Rule Float Lit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mKAOS.impl.RuleFloatLitImpl
	 * @see mKAOS.impl.MKAOSPackageImpl#getRuleFloatLit()
	 * @generated
	 */
	int RULE_FLOAT_LIT = 68;

	/**
	 * The feature id for the '<em><b>Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FLOAT_LIT__VAL = RULE_LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rule Float Lit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FLOAT_LIT_FEATURE_COUNT = RULE_LITERAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Rule Float Lit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FLOAT_LIT_OPERATION_COUNT = RULE_LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mKAOS.impl.RuleTupleLitImpl <em>Rule Tuple Lit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mKAOS.impl.RuleTupleLitImpl
	 * @see mKAOS.impl.MKAOSPackageImpl#getRuleTupleLit()
	 * @generated
	 */
	int RULE_TUPLE_LIT = 69;

	/**
	 * The feature id for the '<em><b>Vals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_TUPLE_LIT__VALS = RULE_LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rule Tuple Lit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_TUPLE_LIT_FEATURE_COUNT = RULE_LITERAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Rule Tuple Lit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_TUPLE_LIT_OPERATION_COUNT = RULE_LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mKAOS.impl.RuleSeqLitImpl <em>Rule Seq Lit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mKAOS.impl.RuleSeqLitImpl
	 * @see mKAOS.impl.MKAOSPackageImpl#getRuleSeqLit()
	 * @generated
	 */
	int RULE_SEQ_LIT = 70;

	/**
	 * The feature id for the '<em><b>Vals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_SEQ_LIT__VALS = RULE_LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rule Seq Lit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_SEQ_LIT_FEATURE_COUNT = RULE_LITERAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Rule Seq Lit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_SEQ_LIT_OPERATION_COUNT = RULE_LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mKAOS.MissionRefinementKind <em>Mission Refinement Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mKAOS.MissionRefinementKind
	 * @see mKAOS.impl.MKAOSPackageImpl#getMissionRefinementKind()
	 * @generated
	 */
	int MISSION_REFINEMENT_KIND = 71;

	/**
	 * The meta object id for the '{@link mKAOS.RuleQuantifier <em>Rule Quantifier</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mKAOS.RuleQuantifier
	 * @see mKAOS.impl.MKAOSPackageImpl#getRuleQuantifier()
	 * @generated
	 */
	int RULE_QUANTIFIER = 72;

	/**
	 * The meta object id for the '{@link mKAOS.RuleTempBinOp <em>Rule Temp Bin Op</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mKAOS.RuleTempBinOp
	 * @see mKAOS.impl.MKAOSPackageImpl#getRuleTempBinOp()
	 * @generated
	 */
	int RULE_TEMP_BIN_OP = 73;

	/**
	 * The meta object id for the '{@link mKAOS.RuleTempUnOp <em>Rule Temp Un Op</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mKAOS.RuleTempUnOp
	 * @see mKAOS.impl.MKAOSPackageImpl#getRuleTempUnOp()
	 * @generated
	 */
	int RULE_TEMP_UN_OP = 74;


	/**
	 * Returns the meta object for class '{@link mKAOS.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see mKAOS.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the reference list '{@link mKAOS.Operation#getProduces <em>Produces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Produces</em>'.
	 * @see mKAOS.Operation#getProduces()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Produces();

	/**
	 * Returns the meta object for the reference list '{@link mKAOS.Operation#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Output</em>'.
	 * @see mKAOS.Operation#getOutput()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Output();

	/**
	 * Returns the meta object for the reference list '{@link mKAOS.Operation#getOperationalize <em>Operationalize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Operationalize</em>'.
	 * @see mKAOS.Operation#getOperationalize()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Operationalize();

	/**
	 * Returns the meta object for the reference list '{@link mKAOS.Operation#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input</em>'.
	 * @see mKAOS.Operation#getInput()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Input();

	/**
	 * Returns the meta object for class '{@link mKAOS.KAOS <em>KAOS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>KAOS</em>'.
	 * @see mKAOS.KAOS
	 * @generated
	 */
	EClass getKAOS();

	/**
	 * Returns the meta object for the attribute '{@link mKAOS.KAOS#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mKAOS.KAOS#getName()
	 * @see #getKAOS()
	 * @generated
	 */
	EAttribute getKAOS_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link mKAOS.KAOS#getLinkedBy <em>Linked By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Linked By</em>'.
	 * @see mKAOS.KAOS#getLinkedBy()
	 * @see #getKAOS()
	 * @generated
	 */
	EReference getKAOS_LinkedBy();

	/**
	 * Returns the meta object for the containment reference list '{@link mKAOS.KAOS#getConsistsOf <em>Consists Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Consists Of</em>'.
	 * @see mKAOS.KAOS#getConsistsOf()
	 * @see #getKAOS()
	 * @generated
	 */
	EReference getKAOS_ConsistsOf();

	/**
	 * Returns the meta object for class '{@link mKAOS.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see mKAOS.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the attribute '{@link mKAOS.Link#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mKAOS.Link#getName()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Name();

	/**
	 * Returns the meta object for class '{@link mKAOS.Nodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nodes</em>'.
	 * @see mKAOS.Nodes
	 * @generated
	 */
	EClass getNodes();

	/**
	 * Returns the meta object for the attribute '{@link mKAOS.Nodes#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mKAOS.Nodes#getName()
	 * @see #getNodes()
	 * @generated
	 */
	EAttribute getNodes_Name();

	/**
	 * Returns the meta object for class '{@link mKAOS.OperationNode <em>Operation Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Node</em>'.
	 * @see mKAOS.OperationNode
	 * @generated
	 */
	EClass getOperationNode();

	/**
	 * Returns the meta object for class '{@link mKAOS.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see mKAOS.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for class '{@link mKAOS.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see mKAOS.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the reference list '{@link mKAOS.Entity#getComposition <em>Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Composition</em>'.
	 * @see mKAOS.Entity#getComposition()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Composition();

	/**
	 * Returns the meta object for class '{@link mKAOS.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object</em>'.
	 * @see mKAOS.Object
	 * @generated
	 */
	EClass getObject();

	/**
	 * Returns the meta object for class '{@link mKAOS.Associations <em>Associations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Associations</em>'.
	 * @see mKAOS.Associations
	 * @generated
	 */
	EClass getAssociations();

	/**
	 * Returns the meta object for class '{@link mKAOS.Agent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agent</em>'.
	 * @see mKAOS.Agent
	 * @generated
	 */
	EClass getAgent();

	/**
	 * Returns the meta object for the reference list '{@link mKAOS.Agent#getPerforms <em>Performs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Performs</em>'.
	 * @see mKAOS.Agent#getPerforms()
	 * @see #getAgent()
	 * @generated
	 */
	EReference getAgent_Performs();

	/**
	 * Returns the meta object for the reference list '{@link mKAOS.Agent#getComposition <em>Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Composition</em>'.
	 * @see mKAOS.Agent#getComposition()
	 * @see #getAgent()
	 * @generated
	 */
	EReference getAgent_Composition();

	/**
	 * Returns the meta object for class '{@link mKAOS.SoftwareAgent <em>Software Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Software Agent</em>'.
	 * @see mKAOS.SoftwareAgent
	 * @generated
	 */
	EClass getSoftwareAgent();

	/**
	 * Returns the meta object for the reference list '{@link mKAOS.SoftwareAgent#getResponsibleFor <em>Responsible For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Responsible For</em>'.
	 * @see mKAOS.SoftwareAgent#getResponsibleFor()
	 * @see #getSoftwareAgent()
	 * @generated
	 */
	EReference getSoftwareAgent_ResponsibleFor();

	/**
	 * Returns the meta object for class '{@link mKAOS.EnvironmentAgent <em>Environment Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Environment Agent</em>'.
	 * @see mKAOS.EnvironmentAgent
	 * @generated
	 */
	EClass getEnvironmentAgent();

	/**
	 * Returns the meta object for class '{@link mKAOS.RefinableNode <em>Refinable Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Refinable Node</em>'.
	 * @see mKAOS.RefinableNode
	 * @generated
	 */
	EClass getRefinableNode();

	/**
	 * Returns the meta object for the reference list '{@link mKAOS.RefinableNode#getRefinedBy <em>Refined By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Refined By</em>'.
	 * @see mKAOS.RefinableNode#getRefinedBy()
	 * @see #getRefinableNode()
	 * @generated
	 */
	EReference getRefinableNode_RefinedBy();

	/**
	 * Returns the meta object for class '{@link mKAOS.Obstacle <em>Obstacle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Obstacle</em>'.
	 * @see mKAOS.Obstacle
	 * @generated
	 */
	EClass getObstacle();

	/**
	 * Returns the meta object for the reference list '{@link mKAOS.Obstacle#getObstruct <em>Obstruct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Obstruct</em>'.
	 * @see mKAOS.Obstacle#getObstruct()
	 * @see #getObstacle()
	 * @generated
	 */
	EReference getObstacle_Obstruct();

	/**
	 * Returns the meta object for class '{@link mKAOS.Goal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Goal</em>'.
	 * @see mKAOS.Goal
	 * @generated
	 */
	EClass getGoal();

	/**
	 * Returns the meta object for the reference list '{@link mKAOS.Goal#getResolve <em>Resolve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Resolve</em>'.
	 * @see mKAOS.Goal#getResolve()
	 * @see #getGoal()
	 * @generated
	 */
	EReference getGoal_Resolve();

	/**
	 * Returns the meta object for the reference list '{@link mKAOS.Goal#getConflicts <em>Conflicts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Conflicts</em>'.
	 * @see mKAOS.Goal#getConflicts()
	 * @see #getGoal()
	 * @generated
	 */
	EReference getGoal_Conflicts();

	/**
	 * Returns the meta object for the reference list '{@link mKAOS.Goal#getConcerns <em>Concerns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Concerns</em>'.
	 * @see mKAOS.Goal#getConcerns()
	 * @see #getGoal()
	 * @generated
	 */
	EReference getGoal_Concerns();

	/**
	 * Returns the meta object for class '{@link mKAOS.AssignmentLink <em>Assignment Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignment Link</em>'.
	 * @see mKAOS.AssignmentLink
	 * @generated
	 */
	EClass getAssignmentLink();

	/**
	 * Returns the meta object for the reference list '{@link mKAOS.AssignmentLink#getAssignsGoalTo <em>Assigns Goal To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Assigns Goal To</em>'.
	 * @see mKAOS.AssignmentLink#getAssignsGoalTo()
	 * @see #getAssignmentLink()
	 * @generated
	 */
	EReference getAssignmentLink_AssignsGoalTo();

	/**
	 * Returns the meta object for class '{@link mKAOS.ConflictLink <em>Conflict Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conflict Link</em>'.
	 * @see mKAOS.ConflictLink
	 * @generated
	 */
	EClass getConflictLink();

	/**
	 * Returns the meta object for class '{@link mKAOS.ObstructionLink <em>Obstruction Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Obstruction Link</em>'.
	 * @see mKAOS.ObstructionLink
	 * @generated
	 */
	EClass getObstructionLink();

	/**
	 * Returns the meta object for the reference list '{@link mKAOS.ObstructionLink#getRelateKGoalTo <em>Relate KGoal To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Relate KGoal To</em>'.
	 * @see mKAOS.ObstructionLink#getRelateKGoalTo()
	 * @see #getObstructionLink()
	 * @generated
	 */
	EReference getObstructionLink_RelateKGoalTo();

	/**
	 * Returns the meta object for class '{@link mKAOS.OutputLink <em>Output Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Link</em>'.
	 * @see mKAOS.OutputLink
	 * @generated
	 */
	EClass getOutputLink();

	/**
	 * Returns the meta object for class '{@link mKAOS.Expectation <em>Expectation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expectation</em>'.
	 * @see mKAOS.Expectation
	 * @generated
	 */
	EClass getExpectation();

	/**
	 * Returns the meta object for the reference list '{@link mKAOS.Expectation#getAssignedTo <em>Assigned To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Assigned To</em>'.
	 * @see mKAOS.Expectation#getAssignedTo()
	 * @see #getExpectation()
	 * @generated
	 */
	EReference getExpectation_AssignedTo();

	/**
	 * Returns the meta object for class '{@link mKAOS.InputLink <em>Input Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Link</em>'.
	 * @see mKAOS.InputLink
	 * @generated
	 */
	EClass getInputLink();

	/**
	 * Returns the meta object for the reference list '{@link mKAOS.InputLink#getObjectInputOn <em>Object Input On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Object Input On</em>'.
	 * @see mKAOS.InputLink#getObjectInputOn()
	 * @see #getInputLink()
	 * @generated
	 */
	EReference getInputLink_ObjectInputOn();

	/**
	 * Returns the meta object for class '{@link mKAOS.Refinement <em>Refinement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Refinement</em>'.
	 * @see mKAOS.Refinement
	 * @generated
	 */
	EClass getRefinement();

	/**
	 * Returns the meta object for the reference '{@link mKAOS.Refinement#getRefines <em>Refines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Refines</em>'.
	 * @see mKAOS.Refinement#getRefines()
	 * @see #getRefinement()
	 * @generated
	 */
	EReference getRefinement_Refines();

	/**
	 * Returns the meta object for class '{@link mKAOS.AndRefinement <em>And Refinement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And Refinement</em>'.
	 * @see mKAOS.AndRefinement
	 * @generated
	 */
	EClass getAndRefinement();

	/**
	 * Returns the meta object for class '{@link mKAOS.OrRefinement <em>Or Refinement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or Refinement</em>'.
	 * @see mKAOS.OrRefinement
	 * @generated
	 */
	EClass getOrRefinement();

	/**
	 * Returns the meta object for class '{@link mKAOS.DomainProperty <em>Domain Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Property</em>'.
	 * @see mKAOS.DomainProperty
	 * @generated
	 */
	EClass getDomainProperty();

	/**
	 * Returns the meta object for the reference list '{@link mKAOS.DomainProperty#getUsedIn <em>Used In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Used In</em>'.
	 * @see mKAOS.DomainProperty#getUsedIn()
	 * @see #getDomainProperty()
	 * @generated
	 */
	EReference getDomainProperty_UsedIn();

	/**
	 * Returns the meta object for class '{@link mKAOS.Requirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement</em>'.
	 * @see mKAOS.Requirement
	 * @generated
	 */
	EClass getRequirement();

	/**
	 * Returns the meta object for class '{@link mKAOS.OperacionalizationLink <em>Operacionalization Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operacionalization Link</em>'.
	 * @see mKAOS.OperacionalizationLink
	 * @generated
	 */
	EClass getOperacionalizationLink();

	/**
	 * Returns the meta object for the reference list '{@link mKAOS.OperacionalizationLink#getRelateOperationTo <em>Relate Operation To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Relate Operation To</em>'.
	 * @see mKAOS.OperacionalizationLink#getRelateOperationTo()
	 * @see #getOperacionalizationLink()
	 * @generated
	 */
	EReference getOperacionalizationLink_RelateOperationTo();

	/**
	 * Returns the meta object for class '{@link mKAOS.DomainHypothesis <em>Domain Hypothesis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Hypothesis</em>'.
	 * @see mKAOS.DomainHypothesis
	 * @generated
	 */
	EClass getDomainHypothesis();

	/**
	 * Returns the meta object for class '{@link mKAOS.DomainInvariant <em>Domain Invariant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Invariant</em>'.
	 * @see mKAOS.DomainInvariant
	 * @generated
	 */
	EClass getDomainInvariant();

	/**
	 * Returns the meta object for class '{@link mKAOS.ResolutionLink <em>Resolution Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resolution Link</em>'.
	 * @see mKAOS.ResolutionLink
	 * @generated
	 */
	EClass getResolutionLink();

	/**
	 * Returns the meta object for the reference list '{@link mKAOS.ResolutionLink#getAssignObstacleTo <em>Assign Obstacle To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Assign Obstacle To</em>'.
	 * @see mKAOS.ResolutionLink#getAssignObstacleTo()
	 * @see #getResolutionLink()
	 * @generated
	 */
	EReference getResolutionLink_AssignObstacleTo();

	/**
	 * Returns the meta object for class '{@link mKAOS.ResponsabilityLink <em>Responsability Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Responsability Link</em>'.
	 * @see mKAOS.ResponsabilityLink
	 * @generated
	 */
	EClass getResponsabilityLink();

	/**
	 * Returns the meta object for the reference list '{@link mKAOS.ResponsabilityLink#getAssignAgentTo <em>Assign Agent To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Assign Agent To</em>'.
	 * @see mKAOS.ResponsabilityLink#getAssignAgentTo()
	 * @see #getResponsabilityLink()
	 * @generated
	 */
	EReference getResponsabilityLink_AssignAgentTo();

	/**
	 * Returns the meta object for class '{@link mKAOS.mKAOS <em>mKAOS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>mKAOS</em>'.
	 * @see mKAOS.mKAOS
	 * @generated
	 */
	EClass getmKAOS();

	/**
	 * Returns the meta object for class '{@link mKAOS.Mission <em>Mission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mission</em>'.
	 * @see mKAOS.Mission
	 * @generated
	 */
	EClass getMission();

	/**
	 * Returns the meta object for the attribute '{@link mKAOS.Mission#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see mKAOS.Mission#getPriority()
	 * @see #getMission()
	 * @generated
	 */
	EAttribute getMission_Priority();

	/**
	 * Returns the meta object for the reference '{@link mKAOS.Mission#getAssignedTo <em>Assigned To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assigned To</em>'.
	 * @see mKAOS.Mission#getAssignedTo()
	 * @see #getMission()
	 * @generated
	 */
	EReference getMission_AssignedTo();

	/**
	 * Returns the meta object for the containment reference list '{@link mKAOS.Mission#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Links</em>'.
	 * @see mKAOS.Mission#getLinks()
	 * @see #getMission()
	 * @generated
	 */
	EReference getMission_Links();

	/**
	 * Returns the meta object for the attribute '{@link mKAOS.Mission#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see mKAOS.Mission#getDescription()
	 * @see #getMission()
	 * @generated
	 */
	EAttribute getMission_Description();

	/**
	 * Returns the meta object for the containment reference '{@link mKAOS.Mission#getTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Trigger</em>'.
	 * @see mKAOS.Mission#getTrigger()
	 * @see #getMission()
	 * @generated
	 */
	EReference getMission_Trigger();

	/**
	 * Returns the meta object for the containment reference '{@link mKAOS.Mission#getRefinement <em>Refinement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Refinement</em>'.
	 * @see mKAOS.Mission#getRefinement()
	 * @see #getMission()
	 * @generated
	 */
	EReference getMission_Refinement();

	/**
	 * Returns the meta object for class '{@link mKAOS.EmergentBehavior <em>Emergent Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Emergent Behavior</em>'.
	 * @see mKAOS.EmergentBehavior
	 * @generated
	 */
	EClass getEmergentBehavior();

	/**
	 * Returns the meta object for the reference list '{@link mKAOS.EmergentBehavior#getRelatedTo <em>Related To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Related To</em>'.
	 * @see mKAOS.EmergentBehavior#getRelatedTo()
	 * @see #getEmergentBehavior()
	 * @generated
	 */
	EReference getEmergentBehavior_RelatedTo();

	/**
	 * Returns the meta object for class '{@link mKAOS.ConstituentSystem <em>Constituent System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constituent System</em>'.
	 * @see mKAOS.ConstituentSystem
	 * @generated
	 */
	EClass getConstituentSystem();

	/**
	 * Returns the meta object for the reference list '{@link mKAOS.ConstituentSystem#getCapableOf <em>Capable Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Capable Of</em>'.
	 * @see mKAOS.ConstituentSystem#getCapableOf()
	 * @see #getConstituentSystem()
	 * @generated
	 */
	EReference getConstituentSystem_CapableOf();

	/**
	 * Returns the meta object for class '{@link mKAOS.Mediator <em>Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mediator</em>'.
	 * @see mKAOS.Mediator
	 * @generated
	 */
	EClass getMediator();

	/**
	 * Returns the meta object for the reference list '{@link mKAOS.Mediator#getCapableOf <em>Capable Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Capable Of</em>'.
	 * @see mKAOS.Mediator#getCapableOf()
	 * @see #getMediator()
	 * @generated
	 */
	EReference getMediator_CapableOf();

	/**
	 * Returns the meta object for class '{@link mKAOS.OperationalCapability <em>Operational Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operational Capability</em>'.
	 * @see mKAOS.OperationalCapability
	 * @generated
	 */
	EClass getOperationalCapability();

	/**
	 * Returns the meta object for the attribute '{@link mKAOS.OperationalCapability#getDesc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desc</em>'.
	 * @see mKAOS.OperationalCapability#getDesc()
	 * @see #getOperationalCapability()
	 * @generated
	 */
	EAttribute getOperationalCapability_Desc();

	/**
	 * Returns the meta object for class '{@link mKAOS.CommunicationalCapability <em>Communicational Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communicational Capability</em>'.
	 * @see mKAOS.CommunicationalCapability
	 * @generated
	 */
	EClass getCommunicationalCapability();

	/**
	 * Returns the meta object for the attribute '{@link mKAOS.CommunicationalCapability#getDesc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desc</em>'.
	 * @see mKAOS.CommunicationalCapability#getDesc()
	 * @see #getCommunicationalCapability()
	 * @generated
	 */
	EAttribute getCommunicationalCapability_Desc();

	/**
	 * Returns the meta object for class '{@link mKAOS.EmergeLink <em>Emerge Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Emerge Link</em>'.
	 * @see mKAOS.EmergeLink
	 * @generated
	 */
	EClass getEmergeLink();

	/**
	 * Returns the meta object for the reference '{@link mKAOS.EmergeLink#getBehavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Behavior</em>'.
	 * @see mKAOS.EmergeLink#getBehavior()
	 * @see #getEmergeLink()
	 * @generated
	 */
	EReference getEmergeLink_Behavior();

	/**
	 * Returns the meta object for the reference '{@link mKAOS.EmergeLink#getCapability <em>Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Capability</em>'.
	 * @see mKAOS.EmergeLink#getCapability()
	 * @see #getEmergeLink()
	 * @generated
	 */
	EReference getEmergeLink_Capability();

	/**
	 * Returns the meta object for the attribute '{@link mKAOS.EmergeLink#getCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cardinality</em>'.
	 * @see mKAOS.EmergeLink#getCardinality()
	 * @see #getEmergeLink()
	 * @generated
	 */
	EAttribute getEmergeLink_Cardinality();

	/**
	 * Returns the meta object for class '{@link mKAOS.CommunicationLink <em>Communication Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communication Link</em>'.
	 * @see mKAOS.CommunicationLink
	 * @generated
	 */
	EClass getCommunicationLink();

	/**
	 * Returns the meta object for the reference '{@link mKAOS.CommunicationLink#getCapability <em>Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Capability</em>'.
	 * @see mKAOS.CommunicationLink#getCapability()
	 * @see #getCommunicationLink()
	 * @generated
	 */
	EReference getCommunicationLink_Capability();

	/**
	 * Returns the meta object for the reference '{@link mKAOS.CommunicationLink#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity</em>'.
	 * @see mKAOS.CommunicationLink#getEntity()
	 * @see #getCommunicationLink()
	 * @generated
	 */
	EReference getCommunicationLink_Entity();

	/**
	 * Returns the meta object for the attribute '{@link mKAOS.CommunicationLink#getCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cardinality</em>'.
	 * @see mKAOS.CommunicationLink#getCardinality()
	 * @see #getCommunicationLink()
	 * @generated
	 */
	EAttribute getCommunicationLink_Cardinality();

	/**
	 * Returns the meta object for class '{@link mKAOS.CommunicationInputLink <em>Communication Input Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communication Input Link</em>'.
	 * @see mKAOS.CommunicationInputLink
	 * @generated
	 */
	EClass getCommunicationInputLink();

	/**
	 * Returns the meta object for class '{@link mKAOS.CommunicationOutputLink <em>Communication Output Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communication Output Link</em>'.
	 * @see mKAOS.CommunicationOutputLink
	 * @generated
	 */
	EClass getCommunicationOutputLink();

	/**
	 * Returns the meta object for class '{@link mKAOS.MissionLink <em>Mission Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mission Link</em>'.
	 * @see mKAOS.MissionLink
	 * @generated
	 */
	EClass getMissionLink();

	/**
	 * Returns the meta object for the container reference '{@link mKAOS.MissionLink#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Source</em>'.
	 * @see mKAOS.MissionLink#getSource()
	 * @see #getMissionLink()
	 * @generated
	 */
	EReference getMissionLink_Source();

	/**
	 * Returns the meta object for the reference '{@link mKAOS.MissionLink#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see mKAOS.MissionLink#getTarget()
	 * @see #getMissionLink()
	 * @generated
	 */
	EReference getMissionLink_Target();

	/**
	 * Returns the meta object for class '{@link mKAOS.DisruptLink <em>Disrupt Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Disrupt Link</em>'.
	 * @see mKAOS.DisruptLink
	 * @generated
	 */
	EClass getDisruptLink();

	/**
	 * Returns the meta object for class '{@link mKAOS.SuportLink <em>Suport Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Suport Link</em>'.
	 * @see mKAOS.SuportLink
	 * @generated
	 */
	EClass getSuportLink();

	/**
	 * Returns the meta object for class '{@link mKAOS.BlockLink <em>Block Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block Link</em>'.
	 * @see mKAOS.BlockLink
	 * @generated
	 */
	EClass getBlockLink();

	/**
	 * Returns the meta object for class '{@link mKAOS.DependencyLink <em>Dependency Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependency Link</em>'.
	 * @see mKAOS.DependencyLink
	 * @generated
	 */
	EClass getDependencyLink();

	/**
	 * Returns the meta object for class '{@link mKAOS.InfluenceLink <em>Influence Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Influence Link</em>'.
	 * @see mKAOS.InfluenceLink
	 * @generated
	 */
	EClass getInfluenceLink();

	/**
	 * Returns the meta object for the reference '{@link mKAOS.InfluenceLink#getExpectation <em>Expectation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Expectation</em>'.
	 * @see mKAOS.InfluenceLink#getExpectation()
	 * @see #getInfluenceLink()
	 * @generated
	 */
	EReference getInfluenceLink_Expectation();

	/**
	 * Returns the meta object for the reference '{@link mKAOS.InfluenceLink#getInfluenced <em>Influenced</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Influenced</em>'.
	 * @see mKAOS.InfluenceLink#getInfluenced()
	 * @see #getInfluenceLink()
	 * @generated
	 */
	EReference getInfluenceLink_Influenced();

	/**
	 * Returns the meta object for class '{@link mKAOS.GeneralizationLink <em>Generalization Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generalization Link</em>'.
	 * @see mKAOS.GeneralizationLink
	 * @generated
	 */
	EClass getGeneralizationLink();

	/**
	 * Returns the meta object for the reference '{@link mKAOS.GeneralizationLink#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity</em>'.
	 * @see mKAOS.GeneralizationLink#getEntity()
	 * @see #getGeneralizationLink()
	 * @generated
	 */
	EReference getGeneralizationLink_Entity();

	/**
	 * Returns the meta object for the reference '{@link mKAOS.GeneralizationLink#getGeneralizes <em>Generalizes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Generalizes</em>'.
	 * @see mKAOS.GeneralizationLink#getGeneralizes()
	 * @see #getGeneralizationLink()
	 * @generated
	 */
	EReference getGeneralizationLink_Generalizes();

	/**
	 * Returns the meta object for class '{@link mKAOS.CompositionLink <em>Composition Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composition Link</em>'.
	 * @see mKAOS.CompositionLink
	 * @generated
	 */
	EClass getCompositionLink();

	/**
	 * Returns the meta object for the reference '{@link mKAOS.CompositionLink#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity</em>'.
	 * @see mKAOS.CompositionLink#getEntity()
	 * @see #getCompositionLink()
	 * @generated
	 */
	EReference getCompositionLink_Entity();

	/**
	 * Returns the meta object for the reference '{@link mKAOS.CompositionLink#getComposedBy <em>Composed By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Composed By</em>'.
	 * @see mKAOS.CompositionLink#getComposedBy()
	 * @see #getCompositionLink()
	 * @generated
	 */
	EReference getCompositionLink_ComposedBy();

	/**
	 * Returns the meta object for class '{@link mKAOS.FormalElement <em>Formal Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Formal Element</em>'.
	 * @see mKAOS.FormalElement
	 * @generated
	 */
	EClass getFormalElement();

	/**
	 * Returns the meta object for the containment reference '{@link mKAOS.FormalElement#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rule</em>'.
	 * @see mKAOS.FormalElement#getRule()
	 * @see #getFormalElement()
	 * @generated
	 */
	EReference getFormalElement_Rule();

	/**
	 * Returns the meta object for class '{@link mKAOS.MissionRefinement <em>Mission Refinement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mission Refinement</em>'.
	 * @see mKAOS.MissionRefinement
	 * @generated
	 */
	EClass getMissionRefinement();

	/**
	 * Returns the meta object for the attribute '{@link mKAOS.MissionRefinement#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see mKAOS.MissionRefinement#getKind()
	 * @see #getMissionRefinement()
	 * @generated
	 */
	EAttribute getMissionRefinement_Kind();

	/**
	 * Returns the meta object for the containment reference '{@link mKAOS.MissionRefinement#getCustom <em>Custom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Custom</em>'.
	 * @see mKAOS.MissionRefinement#getCustom()
	 * @see #getMissionRefinement()
	 * @generated
	 */
	EReference getMissionRefinement_Custom();

	/**
	 * Returns the meta object for the containment reference list '{@link mKAOS.MissionRefinement#getSubmissions <em>Submissions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Submissions</em>'.
	 * @see mKAOS.MissionRefinement#getSubmissions()
	 * @see #getMissionRefinement()
	 * @generated
	 */
	EReference getMissionRefinement_Submissions();

	/**
	 * Returns the meta object for class '{@link mKAOS.DynBLTL <em>Dyn BLTL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dyn BLTL</em>'.
	 * @see mKAOS.DynBLTL
	 * @generated
	 */
	EClass getDynBLTL();

	/**
	 * Returns the meta object for the attribute '{@link mKAOS.DynBLTL#getQ <em>Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Q</em>'.
	 * @see mKAOS.DynBLTL#getQ()
	 * @see #getDynBLTL()
	 * @generated
	 */
	EAttribute getDynBLTL_Q();

	/**
	 * Returns the meta object for the attribute '{@link mKAOS.DynBLTL#getVal <em>Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Val</em>'.
	 * @see mKAOS.DynBLTL#getVal()
	 * @see #getDynBLTL()
	 * @generated
	 */
	EAttribute getDynBLTL_Val();

	/**
	 * Returns the meta object for the containment reference '{@link mKAOS.DynBLTL#getC <em>C</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>C</em>'.
	 * @see mKAOS.DynBLTL#getC()
	 * @see #getDynBLTL()
	 * @generated
	 */
	EReference getDynBLTL_C();

	/**
	 * Returns the meta object for the containment reference '{@link mKAOS.DynBLTL#getT <em>T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>T</em>'.
	 * @see mKAOS.DynBLTL#getT()
	 * @see #getDynBLTL()
	 * @generated
	 */
	EReference getDynBLTL_T();

	/**
	 * Returns the meta object for class '{@link mKAOS.RuleTemporal <em>Rule Temporal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule Temporal</em>'.
	 * @see mKAOS.RuleTemporal
	 * @generated
	 */
	EClass getRuleTemporal();

	/**
	 * Returns the meta object for the containment reference '{@link mKAOS.RuleTemporal#getVal1 <em>Val1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Val1</em>'.
	 * @see mKAOS.RuleTemporal#getVal1()
	 * @see #getRuleTemporal()
	 * @generated
	 */
	EReference getRuleTemporal_Val1();

	/**
	 * Returns the meta object for the containment reference '{@link mKAOS.RuleTemporal#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>B</em>'.
	 * @see mKAOS.RuleTemporal#getB()
	 * @see #getRuleTemporal()
	 * @generated
	 */
	EReference getRuleTemporal_B();

	/**
	 * Returns the meta object for the containment reference '{@link mKAOS.RuleTemporal#getE <em>E</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>E</em>'.
	 * @see mKAOS.RuleTemporal#getE()
	 * @see #getRuleTemporal()
	 * @generated
	 */
	EReference getRuleTemporal_E();

	/**
	 * Returns the meta object for the attribute '{@link mKAOS.RuleTemporal#getO <em>O</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>O</em>'.
	 * @see mKAOS.RuleTemporal#getO()
	 * @see #getRuleTemporal()
	 * @generated
	 */
	EAttribute getRuleTemporal_O();

	/**
	 * Returns the meta object for the attribute '{@link mKAOS.RuleTemporal#getO1 <em>O1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>O1</em>'.
	 * @see mKAOS.RuleTemporal#getO1()
	 * @see #getRuleTemporal()
	 * @generated
	 */
	EAttribute getRuleTemporal_O1();

	/**
	 * Returns the meta object for class '{@link mKAOS.RuleBound <em>Rule Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule Bound</em>'.
	 * @see mKAOS.RuleBound
	 * @generated
	 */
	EClass getRuleBound();

	/**
	 * Returns the meta object for the attribute '{@link mKAOS.RuleBound#getFloatlit <em>Floatlit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Floatlit</em>'.
	 * @see mKAOS.RuleBound#getFloatlit()
	 * @see #getRuleBound()
	 * @generated
	 */
	EAttribute getRuleBound_Floatlit();

	/**
	 * Returns the meta object for the attribute '{@link mKAOS.RuleBound#getIntegerlit <em>Integerlit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Integerlit</em>'.
	 * @see mKAOS.RuleBound#getIntegerlit()
	 * @see #getRuleBound()
	 * @generated
	 */
	EAttribute getRuleBound_Integerlit();

	/**
	 * Returns the meta object for the containment reference '{@link mKAOS.RuleBound#getE <em>E</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>E</em>'.
	 * @see mKAOS.RuleBound#getE()
	 * @see #getRuleBound()
	 * @generated
	 */
	EReference getRuleBound_E();

	/**
	 * Returns the meta object for class '{@link mKAOS.RuleImplication <em>Rule Implication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule Implication</em>'.
	 * @see mKAOS.RuleImplication
	 * @generated
	 */
	EClass getRuleImplication();

	/**
	 * Returns the meta object for the containment reference list '{@link mKAOS.RuleImplication#getR <em>R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>R</em>'.
	 * @see mKAOS.RuleImplication#getR()
	 * @see #getRuleImplication()
	 * @generated
	 */
	EReference getRuleImplication_R();

	/**
	 * Returns the meta object for the containment reference '{@link mKAOS.RuleImplication#getL <em>L</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>L</em>'.
	 * @see mKAOS.RuleImplication#getL()
	 * @see #getRuleImplication()
	 * @generated
	 */
	EReference getRuleImplication_L();

	/**
	 * Returns the meta object for class '{@link mKAOS.RuleDisjunction <em>Rule Disjunction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule Disjunction</em>'.
	 * @see mKAOS.RuleDisjunction
	 * @generated
	 */
	EClass getRuleDisjunction();

	/**
	 * Returns the meta object for the containment reference '{@link mKAOS.RuleDisjunction#getL <em>L</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>L</em>'.
	 * @see mKAOS.RuleDisjunction#getL()
	 * @see #getRuleDisjunction()
	 * @generated
	 */
	EReference getRuleDisjunction_L();

	/**
	 * Returns the meta object for the containment reference list '{@link mKAOS.RuleDisjunction#getR <em>R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>R</em>'.
	 * @see mKAOS.RuleDisjunction#getR()
	 * @see #getRuleDisjunction()
	 * @generated
	 */
	EReference getRuleDisjunction_R();

	/**
	 * Returns the meta object for class '{@link mKAOS.RuleConjunction <em>Rule Conjunction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule Conjunction</em>'.
	 * @see mKAOS.RuleConjunction
	 * @generated
	 */
	EClass getRuleConjunction();

	/**
	 * Returns the meta object for the containment reference '{@link mKAOS.RuleConjunction#getL <em>L</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>L</em>'.
	 * @see mKAOS.RuleConjunction#getL()
	 * @see #getRuleConjunction()
	 * @generated
	 */
	EReference getRuleConjunction_L();

	/**
	 * Returns the meta object for the containment reference list '{@link mKAOS.RuleConjunction#getR <em>R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>R</em>'.
	 * @see mKAOS.RuleConjunction#getR()
	 * @see #getRuleConjunction()
	 * @generated
	 */
	EReference getRuleConjunction_R();

	/**
	 * Returns the meta object for class '{@link mKAOS.RuleEquality <em>Rule Equality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule Equality</em>'.
	 * @see mKAOS.RuleEquality
	 * @generated
	 */
	EClass getRuleEquality();

	/**
	 * Returns the meta object for the attribute '{@link mKAOS.RuleEquality#isNeg <em>Neg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Neg</em>'.
	 * @see mKAOS.RuleEquality#isNeg()
	 * @see #getRuleEquality()
	 * @generated
	 */
	EAttribute getRuleEquality_Neg();

	/**
	 * Returns the meta object for the containment reference '{@link mKAOS.RuleEquality#getL <em>L</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>L</em>'.
	 * @see mKAOS.RuleEquality#getL()
	 * @see #getRuleEquality()
	 * @generated
	 */
	EReference getRuleEquality_L();

	/**
	 * Returns the meta object for the containment reference '{@link mKAOS.RuleEquality#getR <em>R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>R</em>'.
	 * @see mKAOS.RuleEquality#getR()
	 * @see #getRuleEquality()
	 * @generated
	 */
	EReference getRuleEquality_R();

	/**
	 * Returns the meta object for class '{@link mKAOS.RuleRelExp <em>Rule Rel Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule Rel Exp</em>'.
	 * @see mKAOS.RuleRelExp
	 * @generated
	 */
	EClass getRuleRelExp();

	/**
	 * Returns the meta object for the containment reference '{@link mKAOS.RuleRelExp#getL <em>L</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>L</em>'.
	 * @see mKAOS.RuleRelExp#getL()
	 * @see #getRuleRelExp()
	 * @generated
	 */
	EReference getRuleRelExp_L();

	/**
	 * Returns the meta object for the containment reference '{@link mKAOS.RuleRelExp#getR <em>R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>R</em>'.
	 * @see mKAOS.RuleRelExp#getR()
	 * @see #getRuleRelExp()
	 * @generated
	 */
	EReference getRuleRelExp_R();

	/**
	 * Returns the meta object for class '{@link mKAOS.RuleNumExp <em>Rule Num Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule Num Exp</em>'.
	 * @see mKAOS.RuleNumExp
	 * @generated
	 */
	EClass getRuleNumExp();

	/**
	 * Returns the meta object for the containment reference '{@link mKAOS.RuleNumExp#getL <em>L</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>L</em>'.
	 * @see mKAOS.RuleNumExp#getL()
	 * @see #getRuleNumExp()
	 * @generated
	 */
	EReference getRuleNumExp_L();

	/**
	 * Returns the meta object for the containment reference list '{@link mKAOS.RuleNumExp#getR <em>R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>R</em>'.
	 * @see mKAOS.RuleNumExp#getR()
	 * @see #getRuleNumExp()
	 * @generated
	 */
	EReference getRuleNumExp_R();

	/**
	 * Returns the meta object for class '{@link mKAOS.RuleTerm <em>Rule Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule Term</em>'.
	 * @see mKAOS.RuleTerm
	 * @generated
	 */
	EClass getRuleTerm();

	/**
	 * Returns the meta object for the containment reference list '{@link mKAOS.RuleTerm#getR <em>R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>R</em>'.
	 * @see mKAOS.RuleTerm#getR()
	 * @see #getRuleTerm()
	 * @generated
	 */
	EReference getRuleTerm_R();

	/**
	 * Returns the meta object for the containment reference '{@link mKAOS.RuleTerm#getL <em>L</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>L</em>'.
	 * @see mKAOS.RuleTerm#getL()
	 * @see #getRuleTerm()
	 * @generated
	 */
	EReference getRuleTerm_L();

	/**
	 * Returns the meta object for class '{@link mKAOS.RuleFactor <em>Rule Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule Factor</em>'.
	 * @see mKAOS.RuleFactor
	 * @generated
	 */
	EClass getRuleFactor();

	/**
	 * Returns the meta object for the containment reference '{@link mKAOS.RuleFactor#getVallit <em>Vallit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Vallit</em>'.
	 * @see mKAOS.RuleFactor#getVallit()
	 * @see #getRuleFactor()
	 * @generated
	 */
	EReference getRuleFactor_Vallit();

	/**
	 * Returns the meta object for the containment reference '{@link mKAOS.RuleFactor#getValvar <em>Valvar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Valvar</em>'.
	 * @see mKAOS.RuleFactor#getValvar()
	 * @see #getRuleFactor()
	 * @generated
	 */
	EReference getRuleFactor_Valvar();

	/**
	 * Returns the meta object for the containment reference '{@link mKAOS.RuleFactor#getValfun <em>Valfun</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Valfun</em>'.
	 * @see mKAOS.RuleFactor#getValfun()
	 * @see #getRuleFactor()
	 * @generated
	 */
	EReference getRuleFactor_Valfun();

	/**
	 * Returns the meta object for the containment reference '{@link mKAOS.RuleFactor#getCurl <em>Curl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Curl</em>'.
	 * @see mKAOS.RuleFactor#getCurl()
	 * @see #getRuleFactor()
	 * @generated
	 */
	EReference getRuleFactor_Curl();

	/**
	 * Returns the meta object for the containment reference '{@link mKAOS.RuleFactor#getPar <em>Par</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Par</em>'.
	 * @see mKAOS.RuleFactor#getPar()
	 * @see #getRuleFactor()
	 * @generated
	 */
	EReference getRuleFactor_Par();

	/**
	 * Returns the meta object for class '{@link mKAOS.RuleVar <em>Rule Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule Var</em>'.
	 * @see mKAOS.RuleVar
	 * @generated
	 */
	EClass getRuleVar();

	/**
	 * Returns the meta object for the attribute list '{@link mKAOS.RuleVar#getVal <em>Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Val</em>'.
	 * @see mKAOS.RuleVar#getVal()
	 * @see #getRuleVar()
	 * @generated
	 */
	EAttribute getRuleVar_Val();

	/**
	 * Returns the meta object for the containment reference list '{@link mKAOS.RuleVar#getI <em>I</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>I</em>'.
	 * @see mKAOS.RuleVar#getI()
	 * @see #getRuleVar()
	 * @generated
	 */
	EReference getRuleVar_I();

	/**
	 * Returns the meta object for class '{@link mKAOS.RuleFunction <em>Rule Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule Function</em>'.
	 * @see mKAOS.RuleFunction
	 * @generated
	 */
	EClass getRuleFunction();

	/**
	 * Returns the meta object for the containment reference '{@link mKAOS.RuleFunction#getL <em>L</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>L</em>'.
	 * @see mKAOS.RuleFunction#getL()
	 * @see #getRuleFunction()
	 * @generated
	 */
	EReference getRuleFunction_L();

	/**
	 * Returns the meta object for class '{@link mKAOS.RuleParams <em>Rule Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule Params</em>'.
	 * @see mKAOS.RuleParams
	 * @generated
	 */
	EClass getRuleParams();

	/**
	 * Returns the meta object for the containment reference list '{@link mKAOS.RuleParams#getL <em>L</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>L</em>'.
	 * @see mKAOS.RuleParams#getL()
	 * @see #getRuleParams()
	 * @generated
	 */
	EReference getRuleParams_L();

	/**
	 * Returns the meta object for class '{@link mKAOS.RuleLiteral <em>Rule Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule Literal</em>'.
	 * @see mKAOS.RuleLiteral
	 * @generated
	 */
	EClass getRuleLiteral();

	/**
	 * Returns the meta object for class '{@link mKAOS.RuleIntegerLit <em>Rule Integer Lit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule Integer Lit</em>'.
	 * @see mKAOS.RuleIntegerLit
	 * @generated
	 */
	EClass getRuleIntegerLit();

	/**
	 * Returns the meta object for the attribute '{@link mKAOS.RuleIntegerLit#getVal <em>Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Val</em>'.
	 * @see mKAOS.RuleIntegerLit#getVal()
	 * @see #getRuleIntegerLit()
	 * @generated
	 */
	EAttribute getRuleIntegerLit_Val();

	/**
	 * Returns the meta object for class '{@link mKAOS.RuleFloatLit <em>Rule Float Lit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule Float Lit</em>'.
	 * @see mKAOS.RuleFloatLit
	 * @generated
	 */
	EClass getRuleFloatLit();

	/**
	 * Returns the meta object for the attribute '{@link mKAOS.RuleFloatLit#getVal <em>Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Val</em>'.
	 * @see mKAOS.RuleFloatLit#getVal()
	 * @see #getRuleFloatLit()
	 * @generated
	 */
	EAttribute getRuleFloatLit_Val();

	/**
	 * Returns the meta object for class '{@link mKAOS.RuleTupleLit <em>Rule Tuple Lit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule Tuple Lit</em>'.
	 * @see mKAOS.RuleTupleLit
	 * @generated
	 */
	EClass getRuleTupleLit();

	/**
	 * Returns the meta object for the containment reference list '{@link mKAOS.RuleTupleLit#getVals <em>Vals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vals</em>'.
	 * @see mKAOS.RuleTupleLit#getVals()
	 * @see #getRuleTupleLit()
	 * @generated
	 */
	EReference getRuleTupleLit_Vals();

	/**
	 * Returns the meta object for class '{@link mKAOS.RuleSeqLit <em>Rule Seq Lit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule Seq Lit</em>'.
	 * @see mKAOS.RuleSeqLit
	 * @generated
	 */
	EClass getRuleSeqLit();

	/**
	 * Returns the meta object for the containment reference list '{@link mKAOS.RuleSeqLit#getVals <em>Vals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vals</em>'.
	 * @see mKAOS.RuleSeqLit#getVals()
	 * @see #getRuleSeqLit()
	 * @generated
	 */
	EReference getRuleSeqLit_Vals();

	/**
	 * Returns the meta object for enum '{@link mKAOS.MissionRefinementKind <em>Mission Refinement Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Mission Refinement Kind</em>'.
	 * @see mKAOS.MissionRefinementKind
	 * @generated
	 */
	EEnum getMissionRefinementKind();

	/**
	 * Returns the meta object for enum '{@link mKAOS.RuleQuantifier <em>Rule Quantifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Rule Quantifier</em>'.
	 * @see mKAOS.RuleQuantifier
	 * @generated
	 */
	EEnum getRuleQuantifier();

	/**
	 * Returns the meta object for enum '{@link mKAOS.RuleTempBinOp <em>Rule Temp Bin Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Rule Temp Bin Op</em>'.
	 * @see mKAOS.RuleTempBinOp
	 * @generated
	 */
	EEnum getRuleTempBinOp();

	/**
	 * Returns the meta object for enum '{@link mKAOS.RuleTempUnOp <em>Rule Temp Un Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Rule Temp Un Op</em>'.
	 * @see mKAOS.RuleTempUnOp
	 * @generated
	 */
	EEnum getRuleTempUnOp();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MKAOSFactory getMKAOSFactory();

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
		 * The meta object literal for the '{@link mKAOS.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mKAOS.impl.OperationImpl
		 * @see mKAOS.impl.MKAOSPackageImpl#getOperation()
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
		 * The meta object literal for the '{@link mKAOS.impl.KAOSImpl <em>KAOS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mKAOS.impl.KAOSImpl
		 * @see mKAOS.impl.MKAOSPackageImpl#getKAOS()
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
		 * The meta object literal for the '{@link mKAOS.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mKAOS.impl.LinkImpl
		 * @see mKAOS.impl.MKAOSPackageImpl#getLink()
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
		 * The meta object literal for the '{@link mKAOS.impl.NodesImpl <em>Nodes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mKAOS.impl.NodesImpl
		 * @see mKAOS.impl.MKAOSPackageImpl#getNodes()
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
		 * The meta object literal for the '{@link mKAOS.impl.OperationNodeImpl <em>Operation Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mKAOS.impl.OperationNodeImpl
		 * @see mKAOS.impl.MKAOSPackageImpl#getOperationNode()
		 * @generated
		 */
		EClass OPERATION_NODE = eINSTANCE.getOperationNode();

		/**
		 * The meta object literal for the '{@link mKAOS.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mKAOS.impl.EventImpl
		 * @see mKAOS.impl.MKAOSPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '{@link mKAOS.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mKAOS.impl.EntityImpl
		 * @see mKAOS.impl.MKAOSPackageImpl#getEntity()
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
		 * The meta object literal for the '{@link mKAOS.impl.ObjectImpl <em>Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mKAOS.impl.ObjectImpl
		 * @see mKAOS.impl.MKAOSPackageImpl#getObject()
		 * @generated
		 */
		EClass OBJECT = eINSTANCE.getObject();

		/**
		 * The meta object literal for the '{@link mKAOS.impl.AssociationsImpl <em>Associations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mKAOS.impl.AssociationsImpl
		 * @see mKAOS.impl.MKAOSPackageImpl#getAssociations()
		 * @generated
		 */
		EClass ASSOCIATIONS = eINSTANCE.getAssociations();

		/**
		 * The meta object literal for the '{@link mKAOS.impl.AgentImpl <em>Agent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mKAOS.impl.AgentImpl
		 * @see mKAOS.impl.MKAOSPackageImpl#getAgent()
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
		 * The meta object literal for the '{@link mKAOS.impl.SoftwareAgentImpl <em>Software Agent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mKAOS.impl.SoftwareAgentImpl
		 * @see mKAOS.impl.MKAOSPackageImpl#getSoftwareAgent()
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
		 * The meta object literal for the '{@link mKAOS.impl.EnvironmentAgentImpl <em>Environment Agent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mKAOS.impl.EnvironmentAgentImpl
		 * @see mKAOS.impl.MKAOSPackageImpl#getEnvironmentAgent()
		 * @generated
		 */
		EClass ENVIRONMENT_AGENT = eINSTANCE.getEnvironmentAgent();

		/**
		 * The meta object literal for the '{@link mKAOS.impl.RefinableNodeImpl <em>Refinable Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mKAOS.impl.RefinableNodeImpl
		 * @see mKAOS.impl.MKAOSPackageImpl#getRefinableNode()
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
		 * The meta object literal for the '{@link mKAOS.impl.ObstacleImpl <em>Obstacle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mKAOS.impl.ObstacleImpl
		 * @see mKAOS.impl.MKAOSPackageImpl#getObstacle()
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
		 * The meta object literal for the '{@link mKAOS.impl.GoalImpl <em>Goal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mKAOS.impl.GoalImpl
		 * @see mKAOS.impl.MKAOSPackageImpl#getGoal()
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
		 * The meta object literal for the '{@link mKAOS.impl.AssignmentLinkImpl <em>Assignment Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mKAOS.impl.AssignmentLinkImpl
		 * @see mKAOS.impl.MKAOSPackageImpl#getAssignmentLink()
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
		 * The meta object literal for the '{@link mKAOS.impl.ConflictLinkImpl <em>Conflict Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mKAOS.impl.ConflictLinkImpl
		 * @see mKAOS.impl.MKAOSPackageImpl#getConflictLink()
		 * @generated
		 */
		EClass CONFLICT_LINK = eINSTANCE.getConflictLink();

		/**
		 * The meta object literal for the '{@link mKAOS.impl.ObstructionLinkImpl <em>Obstruction Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mKAOS.impl.ObstructionLinkImpl
		 * @see mKAOS.impl.MKAOSPackageImpl#getObstructionLink()
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
		 * The meta object literal for the '{@link mKAOS.impl.OutputLinkImpl <em>Output Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mKAOS.impl.OutputLinkImpl
		 * @see mKAOS.impl.MKAOSPackageImpl#getOutputLink()
		 * @generated
		 */
		EClass OUTPUT_LINK = eINSTANCE.getOutputLink();

		/**
		 * The meta object literal for the '{@link mKAOS.impl.ExpectationImpl <em>Expectation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mKAOS.impl.ExpectationImpl
		 * @see mKAOS.impl.MKAOSPackageImpl#getExpectation()
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
		 * The meta object literal for the '{@link mKAOS.impl.InputLinkImpl <em>Input Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mKAOS.impl.InputLinkImpl
		 * @see mKAOS.impl.MKAOSPackageImpl#getInputLink()
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
		 * The meta object literal for the '{@link mKAOS.impl.RefinementImpl <em>Refinement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mKAOS.impl.RefinementImpl
		 * @see mKAOS.impl.MKAOSPackageImpl#getRefinement()
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
		 * The meta object literal for the '{@link mKAOS.impl.AndRefinementImpl <em>And Refinement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mKAOS.impl.AndRefinementImpl
		 * @see mKAOS.impl.MKAOSPackageImpl#getAndRefinement()
		 * @generated
		 */
		EClass AND_REFINEMENT = eINSTANCE.getAndRefinement();

		/**
		 * The meta object literal for the '{@link mKAOS.impl.OrRefinementImpl <em>Or Refinement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mKAOS.impl.OrRefinementImpl
		 * @see mKAOS.impl.MKAOSPackageImpl#getOrRefinement()
		 * @generated
		 */
		EClass OR_REFINEMENT = eINSTANCE.getOrRefinement();

		/**
		 * The meta object literal for the '{@link mKAOS.impl.DomainPropertyImpl <em>Domain Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mKAOS.impl.DomainPropertyImpl
		 * @see mKAOS.impl.MKAOSPackageImpl#getDomainProperty()
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
		 * The meta object literal for the '{@link mKAOS.impl.RequirementImpl <em>Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mKAOS.impl.RequirementImpl
		 * @see mKAOS.impl.MKAOSPackageImpl#getRequirement()
		 * @generated
		 */
		EClass REQUIREMENT = eINSTANCE.getRequirement();

		/**
		 * The meta object literal for the '{@link mKAOS.impl.OperacionalizationLinkImpl <em>Operacionalization Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mKAOS.impl.OperacionalizationLinkImpl
		 * @see mKAOS.impl.MKAOSPackageImpl#getOperacionalizationLink()
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
		 * The meta object literal for the '{@link mKAOS.impl.DomainHypothesisImpl <em>Domain Hypothesis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mKAOS.impl.DomainHypothesisImpl
		 * @see mKAOS.impl.MKAOSPackageImpl#getDomainHypothesis()
		 * @generated
		 */
		EClass DOMAIN_HYPOTHESIS = eINSTANCE.getDomainHypothesis();

		/**
		 * The meta object literal for the '{@link mKAOS.impl.DomainInvariantImpl <em>Domain Invariant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mKAOS.impl.DomainInvariantImpl
		 * @see mKAOS.impl.MKAOSPackageImpl#getDomainInvariant()
		 * @generated
		 */
		EClass DOMAIN_INVARIANT = eINSTANCE.getDomainInvariant();

		/**
		 * The meta object literal for the '{@link mKAOS.impl.ResolutionLinkImpl <em>Resolution Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mKAOS.impl.ResolutionLinkImpl
		 * @see mKAOS.impl.MKAOSPackageImpl#getResolutionLink()
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
		 * The meta object literal for the '{@link mKAOS.impl.ResponsabilityLinkImpl <em>Responsability Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mKAOS.impl.ResponsabilityLinkImpl
		 * @see mKAOS.impl.MKAOSPackageImpl#getResponsabilityLink()
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

		/**
		 * The meta object literal for the '{@link mKAOS.impl.mKAOSImpl <em>mKAOS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mKAOS.impl.mKAOSImpl
		 * @see mKAOS.impl.MKAOSPackageImpl#getmKAOS()
		 * @generated
		 */
		EClass MKAOS = eINSTANCE.getmKAOS();

		/**
		 * The meta object literal for the '{@link mKAOS.impl.MissionImpl <em>Mission</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mKAOS.impl.MissionImpl
		 * @see mKAOS.impl.MKAOSPackageImpl#getMission()
		 * @generated
		 */
		EClass MISSION = eINSTANCE.getMission();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MISSION__PRIORITY = eINSTANCE.getMission_Priority();

		/**
		 * The meta object literal for the '<em><b>Assigned To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MISSION__ASSIGNED_TO = eINSTANCE.getMission_AssignedTo();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MISSION__LINKS = eINSTANCE.getMission_Links();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MISSION__DESCRIPTION = eINSTANCE.getMission_Description();

		/**
		 * The meta object literal for the '<em><b>Trigger</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MISSION__TRIGGER = eINSTANCE.getMission_Trigger();

		/**
		 * The meta object literal for the '<em><b>Refinement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MISSION__REFINEMENT = eINSTANCE.getMission_Refinement();

		/**
		 * The meta object literal for the '{@link mKAOS.impl.EmergentBehaviorImpl <em>Emergent Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mKAOS.impl.EmergentBehaviorImpl
		 * @see mKAOS.impl.MKAOSPackageImpl#getEmergentBehavior()
		 * @generated
		 */
		EClass EMERGENT_BEHAVIOR = eINSTANCE.getEmergentBehavior();

		/**
		 * The meta object literal for the '<em><b>Related To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMERGENT_BEHAVIOR__RELATED_TO = eINSTANCE.getEmergentBehavior_RelatedTo();

		/**
		 * The meta object literal for the '{@link mKAOS.impl.ConstituentSystemImpl <em>Constituent System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mKAOS.impl.ConstituentSystemImpl
		 * @see mKAOS.impl.MKAOSPackageImpl#getConstituentSystem()
		 * @generated
		 */
		EClass CONSTITUENT_SYSTEM = eINSTANCE.getConstituentSystem();

		/**
		 * The meta object literal for the '<em><b>Capable Of</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTITUENT_SYSTEM__CAPABLE_OF = eINSTANCE.getConstituentSystem_CapableOf();

		/**
		 * The meta object literal for the '{@link mKAOS.impl.MediatorImpl <em>Mediator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mKAOS.impl.MediatorImpl
		 * @see mKAOS.impl.MKAOSPackageImpl#getMediator()
		 * @generated
		 */
		EClass MEDIATOR = eINSTANCE.getMediator();

		/**
		 * The meta object literal for the '<em><b>Capable Of</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEDIATOR__CAPABLE_OF = eINSTANCE.getMediator_CapableOf();

		/**
		 * The meta object literal for the '{@link mKAOS.impl.OperationalCapabilityImpl <em>Operational Capability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mKAOS.impl.OperationalCapabilityImpl
		 * @see mKAOS.impl.MKAOSPackageImpl#getOperationalCapability()
		 * @generated
		 */
		EClass OPERATIONAL_CAPABILITY = eINSTANCE.getOperationalCapability();

		/**
		 * The meta object literal for the '<em><b>Desc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATIONAL_CAPABILITY__DESC = eINSTANCE.getOperationalCapability_Desc();

		/**
		 * The meta object literal for the '{@link mKAOS.impl.CommunicationalCapabilityImpl <em>Communicational Capability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mKAOS.impl.CommunicationalCapabilityImpl
		 * @see mKAOS.impl.MKAOSPackageImpl#getCommunicationalCapability()
		 * @generated
		 */
		EClass COMMUNICATIONAL_CAPABILITY = eINSTANCE.getCommunicationalCapability();

		/**
		 * The meta object literal for the '<em><b>Desc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATIONAL_CAPABILITY__DESC = eINSTANCE.getCommunicationalCapability_Desc();

		/**
		 * The meta object literal for the '{@link mKAOS.impl.EmergeLinkImpl <em>Emerge Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mKAOS.impl.EmergeLinkImpl
		 * @see mKAOS.impl.MKAOSPackageImpl#getEmergeLink()
		 * @generated
		 */
		EClass EMERGE_LINK = eINSTANCE.getEmergeLink();

		/**
		 * The meta object literal for the '<em><b>Behavior</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMERGE_LINK__BEHAVIOR = eINSTANCE.getEmergeLink_Behavior();

		/**
		 * The meta object literal for the '<em><b>Capability</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMERGE_LINK__CAPABILITY = eINSTANCE.getEmergeLink_Capability();

		/**
		 * The meta object literal for the '<em><b>Cardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMERGE_LINK__CARDINALITY = eINSTANCE.getEmergeLink_Cardinality();

		/**
		 * The meta object literal for the '{@link mKAOS.impl.CommunicationLinkImpl <em>Communication Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mKAOS.impl.CommunicationLinkImpl
		 * @see mKAOS.impl.MKAOSPackageImpl#getCommunicationLink()
		 * @generated
		 */
		EClass COMMUNICATION_LINK = eINSTANCE.getCommunicationLink();

		/**
		 * The meta object literal for the '<em><b>Capability</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_LINK__CAPABILITY = eINSTANCE.getCommunicationLink_Capability();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_LINK__ENTITY = eINSTANCE.getCommunicationLink_Entity();

		/**
		 * The meta object literal for the '<em><b>Cardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_LINK__CARDINALITY = eINSTANCE.getCommunicationLink_Cardinality();

		/**
		 * The meta object literal for the '{@link mKAOS.impl.CommunicationInputLinkImpl <em>Communication Input Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mKAOS.impl.CommunicationInputLinkImpl
		 * @see mKAOS.impl.MKAOSPackageImpl#getCommunicationInputLink()
		 * @generated
		 */
		EClass COMMUNICATION_INPUT_LINK = eINSTANCE.getCommunicationInputLink();

		/**
		 * The meta object literal for the '{@link mKAOS.impl.CommunicationOutputLinkImpl <em>Communication Output Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mKAOS.impl.CommunicationOutputLinkImpl
		 * @see mKAOS.impl.MKAOSPackageImpl#getCommunicationOutputLink()
		 * @generated
		 */
		EClass COMMUNICATION_OUTPUT_LINK = eINSTANCE.getCommunicationOutputLink();

		/**
		 * The meta object literal for the '{@link mKAOS.impl.MissionLinkImpl <em>Mission Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mKAOS.impl.MissionLinkImpl
		 * @see mKAOS.impl.MKAOSPackageImpl#getMissionLink()
		 * @generated
		 */
		EClass MISSION_LINK = eINSTANCE.getMissionLink();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MISSION_LINK__SOURCE = eINSTANCE.getMissionLink_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MISSION_LINK__TARGET = eINSTANCE.getMissionLink_Target();

		/**
		 * The meta object literal for the '{@link mKAOS.impl.DisruptLinkImpl <em>Disrupt Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mKAOS.impl.DisruptLinkImpl
		 * @see mKAOS.impl.MKAOSPackageImpl#getDisruptLink()
		 * @generated
		 */
		EClass DISRUPT_LINK = eINSTANCE.getDisruptLink();

		/**
		 * The meta object literal for the '{@link mKAOS.impl.SuportLinkImpl <em>Suport Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mKAOS.impl.SuportLinkImpl
		 * @see mKAOS.impl.MKAOSPackageImpl#getSuportLink()
		 * @generated
		 */
		EClass SUPORT_LINK = eINSTANCE.getSuportLink();

		/**
		 * The meta object literal for the '{@link mKAOS.impl.BlockLinkImpl <em>Block Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mKAOS.impl.BlockLinkImpl
		 * @see mKAOS.impl.MKAOSPackageImpl#getBlockLink()
		 * @generated
		 */
		EClass BLOCK_LINK = eINSTANCE.getBlockLink();

		/**
		 * The meta object literal for the '{@link mKAOS.impl.DependencyLinkImpl <em>Dependency Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mKAOS.impl.DependencyLinkImpl
		 * @see mKAOS.impl.MKAOSPackageImpl#getDependencyLink()
		 * @generated
		 */
		EClass DEPENDENCY_LINK = eINSTANCE.getDependencyLink();

		/**
		 * The meta object literal for the '{@link mKAOS.impl.InfluenceLinkImpl <em>Influence Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mKAOS.impl.InfluenceLinkImpl
		 * @see mKAOS.impl.MKAOSPackageImpl#getInfluenceLink()
		 * @generated
		 */
		EClass INFLUENCE_LINK = eINSTANCE.getInfluenceLink();

		/**
		 * The meta object literal for the '<em><b>Expectation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFLUENCE_LINK__EXPECTATION = eINSTANCE.getInfluenceLink_Expectation();

		/**
		 * The meta object literal for the '<em><b>Influenced</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFLUENCE_LINK__INFLUENCED = eINSTANCE.getInfluenceLink_Influenced();

		/**
		 * The meta object literal for the '{@link mKAOS.impl.GeneralizationLinkImpl <em>Generalization Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mKAOS.impl.GeneralizationLinkImpl
		 * @see mKAOS.impl.MKAOSPackageImpl#getGeneralizationLink()
		 * @generated
		 */
		EClass GENERALIZATION_LINK = eINSTANCE.getGeneralizationLink();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERALIZATION_LINK__ENTITY = eINSTANCE.getGeneralizationLink_Entity();

		/**
		 * The meta object literal for the '<em><b>Generalizes</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERALIZATION_LINK__GENERALIZES = eINSTANCE.getGeneralizationLink_Generalizes();

		/**
		 * The meta object literal for the '{@link mKAOS.impl.CompositionLinkImpl <em>Composition Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mKAOS.impl.CompositionLinkImpl
		 * @see mKAOS.impl.MKAOSPackageImpl#getCompositionLink()
		 * @generated
		 */
		EClass COMPOSITION_LINK = eINSTANCE.getCompositionLink();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITION_LINK__ENTITY = eINSTANCE.getCompositionLink_Entity();

		/**
		 * The meta object literal for the '<em><b>Composed By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITION_LINK__COMPOSED_BY = eINSTANCE.getCompositionLink_ComposedBy();

		/**
		 * The meta object literal for the '{@link mKAOS.impl.FormalElementImpl <em>Formal Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mKAOS.impl.FormalElementImpl
		 * @see mKAOS.impl.MKAOSPackageImpl#getFormalElement()
		 * @generated
		 */
		EClass FORMAL_ELEMENT = eINSTANCE.getFormalElement();

		/**
		 * The meta object literal for the '<em><b>Rule</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMAL_ELEMENT__RULE = eINSTANCE.getFormalElement_Rule();

		/**
		 * The meta object literal for the '{@link mKAOS.impl.MissionRefinementImpl <em>Mission Refinement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mKAOS.impl.MissionRefinementImpl
		 * @see mKAOS.impl.MKAOSPackageImpl#getMissionRefinement()
		 * @generated
		 */
		EClass MISSION_REFINEMENT = eINSTANCE.getMissionRefinement();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MISSION_REFINEMENT__KIND = eINSTANCE.getMissionRefinement_Kind();

		/**
		 * The meta object literal for the '<em><b>Custom</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MISSION_REFINEMENT__CUSTOM = eINSTANCE.getMissionRefinement_Custom();

		/**
		 * The meta object literal for the '<em><b>Submissions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MISSION_REFINEMENT__SUBMISSIONS = eINSTANCE.getMissionRefinement_Submissions();

		/**
		 * The meta object literal for the '{@link mKAOS.impl.DynBLTLImpl <em>Dyn BLTL</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mKAOS.impl.DynBLTLImpl
		 * @see mKAOS.impl.MKAOSPackageImpl#getDynBLTL()
		 * @generated
		 */
		EClass DYN_BLTL = eINSTANCE.getDynBLTL();

		/**
		 * The meta object literal for the '<em><b>Q</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DYN_BLTL__Q = eINSTANCE.getDynBLTL_Q();

		/**
		 * The meta object literal for the '<em><b>Val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DYN_BLTL__VAL = eINSTANCE.getDynBLTL_Val();

		/**
		 * The meta object literal for the '<em><b>C</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DYN_BLTL__C = eINSTANCE.getDynBLTL_C();

		/**
		 * The meta object literal for the '<em><b>T</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DYN_BLTL__T = eINSTANCE.getDynBLTL_T();

		/**
		 * The meta object literal for the '{@link mKAOS.impl.RuleTemporalImpl <em>Rule Temporal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mKAOS.impl.RuleTemporalImpl
		 * @see mKAOS.impl.MKAOSPackageImpl#getRuleTemporal()
		 * @generated
		 */
		EClass RULE_TEMPORAL = eINSTANCE.getRuleTemporal();

		/**
		 * The meta object literal for the '<em><b>Val1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_TEMPORAL__VAL1 = eINSTANCE.getRuleTemporal_Val1();

		/**
		 * The meta object literal for the '<em><b>B</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_TEMPORAL__B = eINSTANCE.getRuleTemporal_B();

		/**
		 * The meta object literal for the '<em><b>E</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_TEMPORAL__E = eINSTANCE.getRuleTemporal_E();

		/**
		 * The meta object literal for the '<em><b>O</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE_TEMPORAL__O = eINSTANCE.getRuleTemporal_O();

		/**
		 * The meta object literal for the '<em><b>O1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE_TEMPORAL__O1 = eINSTANCE.getRuleTemporal_O1();

		/**
		 * The meta object literal for the '{@link mKAOS.impl.RuleBoundImpl <em>Rule Bound</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mKAOS.impl.RuleBoundImpl
		 * @see mKAOS.impl.MKAOSPackageImpl#getRuleBound()
		 * @generated
		 */
		EClass RULE_BOUND = eINSTANCE.getRuleBound();

		/**
		 * The meta object literal for the '<em><b>Floatlit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE_BOUND__FLOATLIT = eINSTANCE.getRuleBound_Floatlit();

		/**
		 * The meta object literal for the '<em><b>Integerlit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE_BOUND__INTEGERLIT = eINSTANCE.getRuleBound_Integerlit();

		/**
		 * The meta object literal for the '<em><b>E</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_BOUND__E = eINSTANCE.getRuleBound_E();

		/**
		 * The meta object literal for the '{@link mKAOS.impl.RuleImplicationImpl <em>Rule Implication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mKAOS.impl.RuleImplicationImpl
		 * @see mKAOS.impl.MKAOSPackageImpl#getRuleImplication()
		 * @generated
		 */
		EClass RULE_IMPLICATION = eINSTANCE.getRuleImplication();

		/**
		 * The meta object literal for the '<em><b>R</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_IMPLICATION__R = eINSTANCE.getRuleImplication_R();

		/**
		 * The meta object literal for the '<em><b>L</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_IMPLICATION__L = eINSTANCE.getRuleImplication_L();

		/**
		 * The meta object literal for the '{@link mKAOS.impl.RuleDisjunctionImpl <em>Rule Disjunction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mKAOS.impl.RuleDisjunctionImpl
		 * @see mKAOS.impl.MKAOSPackageImpl#getRuleDisjunction()
		 * @generated
		 */
		EClass RULE_DISJUNCTION = eINSTANCE.getRuleDisjunction();

		/**
		 * The meta object literal for the '<em><b>L</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_DISJUNCTION__L = eINSTANCE.getRuleDisjunction_L();

		/**
		 * The meta object literal for the '<em><b>R</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_DISJUNCTION__R = eINSTANCE.getRuleDisjunction_R();

		/**
		 * The meta object literal for the '{@link mKAOS.impl.RuleConjunctionImpl <em>Rule Conjunction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mKAOS.impl.RuleConjunctionImpl
		 * @see mKAOS.impl.MKAOSPackageImpl#getRuleConjunction()
		 * @generated
		 */
		EClass RULE_CONJUNCTION = eINSTANCE.getRuleConjunction();

		/**
		 * The meta object literal for the '<em><b>L</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_CONJUNCTION__L = eINSTANCE.getRuleConjunction_L();

		/**
		 * The meta object literal for the '<em><b>R</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_CONJUNCTION__R = eINSTANCE.getRuleConjunction_R();

		/**
		 * The meta object literal for the '{@link mKAOS.impl.RuleEqualityImpl <em>Rule Equality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mKAOS.impl.RuleEqualityImpl
		 * @see mKAOS.impl.MKAOSPackageImpl#getRuleEquality()
		 * @generated
		 */
		EClass RULE_EQUALITY = eINSTANCE.getRuleEquality();

		/**
		 * The meta object literal for the '<em><b>Neg</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE_EQUALITY__NEG = eINSTANCE.getRuleEquality_Neg();

		/**
		 * The meta object literal for the '<em><b>L</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_EQUALITY__L = eINSTANCE.getRuleEquality_L();

		/**
		 * The meta object literal for the '<em><b>R</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_EQUALITY__R = eINSTANCE.getRuleEquality_R();

		/**
		 * The meta object literal for the '{@link mKAOS.impl.RuleRelExpImpl <em>Rule Rel Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mKAOS.impl.RuleRelExpImpl
		 * @see mKAOS.impl.MKAOSPackageImpl#getRuleRelExp()
		 * @generated
		 */
		EClass RULE_REL_EXP = eINSTANCE.getRuleRelExp();

		/**
		 * The meta object literal for the '<em><b>L</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_REL_EXP__L = eINSTANCE.getRuleRelExp_L();

		/**
		 * The meta object literal for the '<em><b>R</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_REL_EXP__R = eINSTANCE.getRuleRelExp_R();

		/**
		 * The meta object literal for the '{@link mKAOS.impl.RuleNumExpImpl <em>Rule Num Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mKAOS.impl.RuleNumExpImpl
		 * @see mKAOS.impl.MKAOSPackageImpl#getRuleNumExp()
		 * @generated
		 */
		EClass RULE_NUM_EXP = eINSTANCE.getRuleNumExp();

		/**
		 * The meta object literal for the '<em><b>L</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_NUM_EXP__L = eINSTANCE.getRuleNumExp_L();

		/**
		 * The meta object literal for the '<em><b>R</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_NUM_EXP__R = eINSTANCE.getRuleNumExp_R();

		/**
		 * The meta object literal for the '{@link mKAOS.impl.RuleTermImpl <em>Rule Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mKAOS.impl.RuleTermImpl
		 * @see mKAOS.impl.MKAOSPackageImpl#getRuleTerm()
		 * @generated
		 */
		EClass RULE_TERM = eINSTANCE.getRuleTerm();

		/**
		 * The meta object literal for the '<em><b>R</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_TERM__R = eINSTANCE.getRuleTerm_R();

		/**
		 * The meta object literal for the '<em><b>L</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_TERM__L = eINSTANCE.getRuleTerm_L();

		/**
		 * The meta object literal for the '{@link mKAOS.impl.RuleFactorImpl <em>Rule Factor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mKAOS.impl.RuleFactorImpl
		 * @see mKAOS.impl.MKAOSPackageImpl#getRuleFactor()
		 * @generated
		 */
		EClass RULE_FACTOR = eINSTANCE.getRuleFactor();

		/**
		 * The meta object literal for the '<em><b>Vallit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_FACTOR__VALLIT = eINSTANCE.getRuleFactor_Vallit();

		/**
		 * The meta object literal for the '<em><b>Valvar</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_FACTOR__VALVAR = eINSTANCE.getRuleFactor_Valvar();

		/**
		 * The meta object literal for the '<em><b>Valfun</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_FACTOR__VALFUN = eINSTANCE.getRuleFactor_Valfun();

		/**
		 * The meta object literal for the '<em><b>Curl</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_FACTOR__CURL = eINSTANCE.getRuleFactor_Curl();

		/**
		 * The meta object literal for the '<em><b>Par</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_FACTOR__PAR = eINSTANCE.getRuleFactor_Par();

		/**
		 * The meta object literal for the '{@link mKAOS.impl.RuleVarImpl <em>Rule Var</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mKAOS.impl.RuleVarImpl
		 * @see mKAOS.impl.MKAOSPackageImpl#getRuleVar()
		 * @generated
		 */
		EClass RULE_VAR = eINSTANCE.getRuleVar();

		/**
		 * The meta object literal for the '<em><b>Val</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE_VAR__VAL = eINSTANCE.getRuleVar_Val();

		/**
		 * The meta object literal for the '<em><b>I</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_VAR__I = eINSTANCE.getRuleVar_I();

		/**
		 * The meta object literal for the '{@link mKAOS.impl.RuleFunctionImpl <em>Rule Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mKAOS.impl.RuleFunctionImpl
		 * @see mKAOS.impl.MKAOSPackageImpl#getRuleFunction()
		 * @generated
		 */
		EClass RULE_FUNCTION = eINSTANCE.getRuleFunction();

		/**
		 * The meta object literal for the '<em><b>L</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_FUNCTION__L = eINSTANCE.getRuleFunction_L();

		/**
		 * The meta object literal for the '{@link mKAOS.impl.RuleParamsImpl <em>Rule Params</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mKAOS.impl.RuleParamsImpl
		 * @see mKAOS.impl.MKAOSPackageImpl#getRuleParams()
		 * @generated
		 */
		EClass RULE_PARAMS = eINSTANCE.getRuleParams();

		/**
		 * The meta object literal for the '<em><b>L</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_PARAMS__L = eINSTANCE.getRuleParams_L();

		/**
		 * The meta object literal for the '{@link mKAOS.RuleLiteral <em>Rule Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mKAOS.RuleLiteral
		 * @see mKAOS.impl.MKAOSPackageImpl#getRuleLiteral()
		 * @generated
		 */
		EClass RULE_LITERAL = eINSTANCE.getRuleLiteral();

		/**
		 * The meta object literal for the '{@link mKAOS.impl.RuleIntegerLitImpl <em>Rule Integer Lit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mKAOS.impl.RuleIntegerLitImpl
		 * @see mKAOS.impl.MKAOSPackageImpl#getRuleIntegerLit()
		 * @generated
		 */
		EClass RULE_INTEGER_LIT = eINSTANCE.getRuleIntegerLit();

		/**
		 * The meta object literal for the '<em><b>Val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE_INTEGER_LIT__VAL = eINSTANCE.getRuleIntegerLit_Val();

		/**
		 * The meta object literal for the '{@link mKAOS.impl.RuleFloatLitImpl <em>Rule Float Lit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mKAOS.impl.RuleFloatLitImpl
		 * @see mKAOS.impl.MKAOSPackageImpl#getRuleFloatLit()
		 * @generated
		 */
		EClass RULE_FLOAT_LIT = eINSTANCE.getRuleFloatLit();

		/**
		 * The meta object literal for the '<em><b>Val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE_FLOAT_LIT__VAL = eINSTANCE.getRuleFloatLit_Val();

		/**
		 * The meta object literal for the '{@link mKAOS.impl.RuleTupleLitImpl <em>Rule Tuple Lit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mKAOS.impl.RuleTupleLitImpl
		 * @see mKAOS.impl.MKAOSPackageImpl#getRuleTupleLit()
		 * @generated
		 */
		EClass RULE_TUPLE_LIT = eINSTANCE.getRuleTupleLit();

		/**
		 * The meta object literal for the '<em><b>Vals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_TUPLE_LIT__VALS = eINSTANCE.getRuleTupleLit_Vals();

		/**
		 * The meta object literal for the '{@link mKAOS.impl.RuleSeqLitImpl <em>Rule Seq Lit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mKAOS.impl.RuleSeqLitImpl
		 * @see mKAOS.impl.MKAOSPackageImpl#getRuleSeqLit()
		 * @generated
		 */
		EClass RULE_SEQ_LIT = eINSTANCE.getRuleSeqLit();

		/**
		 * The meta object literal for the '<em><b>Vals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_SEQ_LIT__VALS = eINSTANCE.getRuleSeqLit_Vals();

		/**
		 * The meta object literal for the '{@link mKAOS.MissionRefinementKind <em>Mission Refinement Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mKAOS.MissionRefinementKind
		 * @see mKAOS.impl.MKAOSPackageImpl#getMissionRefinementKind()
		 * @generated
		 */
		EEnum MISSION_REFINEMENT_KIND = eINSTANCE.getMissionRefinementKind();

		/**
		 * The meta object literal for the '{@link mKAOS.RuleQuantifier <em>Rule Quantifier</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mKAOS.RuleQuantifier
		 * @see mKAOS.impl.MKAOSPackageImpl#getRuleQuantifier()
		 * @generated
		 */
		EEnum RULE_QUANTIFIER = eINSTANCE.getRuleQuantifier();

		/**
		 * The meta object literal for the '{@link mKAOS.RuleTempBinOp <em>Rule Temp Bin Op</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mKAOS.RuleTempBinOp
		 * @see mKAOS.impl.MKAOSPackageImpl#getRuleTempBinOp()
		 * @generated
		 */
		EEnum RULE_TEMP_BIN_OP = eINSTANCE.getRuleTempBinOp();

		/**
		 * The meta object literal for the '{@link mKAOS.RuleTempUnOp <em>Rule Temp Un Op</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mKAOS.RuleTempUnOp
		 * @see mKAOS.impl.MKAOSPackageImpl#getRuleTempUnOp()
		 * @generated
		 */
		EEnum RULE_TEMP_UN_OP = eINSTANCE.getRuleTempUnOp();

	}

} //MKAOSPackage
