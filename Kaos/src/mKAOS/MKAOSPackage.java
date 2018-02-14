/**
 */
package mKAOS;

import KAOSModel.KAOSModelPackage;
import mKAOS.impl.MKAOSPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
	MKAOSPackage eINSTANCE = MKAOSPackageImpl.init();

	/**
	 * The meta object id for the '{@link mKAOS.impl.mKAOSImpl <em>mKAOS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mKAOS.impl.mKAOSImpl
	 * @see mKAOS.impl.MKAOSPackageImpl#getmKAOS()
	 * @generated
	 */
	int MKAOS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKAOS__NAME = KAOSModelPackage.KAOS__NAME;

	/**
	 * The feature id for the '<em><b>Linked By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKAOS__LINKED_BY = KAOSModelPackage.KAOS__LINKED_BY;

	/**
	 * The feature id for the '<em><b>Consists Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKAOS__CONSISTS_OF = KAOSModelPackage.KAOS__CONSISTS_OF;

	/**
	 * The number of structural features of the '<em>mKAOS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKAOS_FEATURE_COUNT = KAOSModelPackage.KAOS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>mKAOS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKAOS_OPERATION_COUNT = KAOSModelPackage.KAOS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mKAOS.impl.MissionImpl <em>Mission</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mKAOS.impl.MissionImpl
	 * @see mKAOS.impl.MKAOSPackageImpl#getMission()
	 * @generated
	 */
	int MISSION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION__NAME = KAOSModelPackage.GOAL__NAME;

	/**
	 * The feature id for the '<em><b>Refined By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION__REFINED_BY = KAOSModelPackage.GOAL__REFINED_BY;

	/**
	 * The feature id for the '<em><b>Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION__RESOLVE = KAOSModelPackage.GOAL__RESOLVE;

	/**
	 * The feature id for the '<em><b>Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION__CONFLICTS = KAOSModelPackage.GOAL__CONFLICTS;

	/**
	 * The feature id for the '<em><b>Concerns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION__CONCERNS = KAOSModelPackage.GOAL__CONCERNS;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION__RULE = KAOSModelPackage.GOAL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION__PRIORITY = KAOSModelPackage.GOAL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Assigned To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION__ASSIGNED_TO = KAOSModelPackage.GOAL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION__LINKS = KAOSModelPackage.GOAL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION__DESCRIPTION = KAOSModelPackage.GOAL_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION__TRIGGER = KAOSModelPackage.GOAL_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Refinement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION__REFINEMENT = KAOSModelPackage.GOAL_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Mission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION_FEATURE_COUNT = KAOSModelPackage.GOAL_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Mission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION_OPERATION_COUNT = KAOSModelPackage.GOAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mKAOS.impl.EmergentBehaviorImpl <em>Emergent Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mKAOS.impl.EmergentBehaviorImpl
	 * @see mKAOS.impl.MKAOSPackageImpl#getEmergentBehavior()
	 * @generated
	 */
	int EMERGENT_BEHAVIOR = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMERGENT_BEHAVIOR__NAME = KAOSModelPackage.NODES__NAME;

	/**
	 * The feature id for the '<em><b>Related To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMERGENT_BEHAVIOR__RELATED_TO = KAOSModelPackage.NODES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Emergent Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMERGENT_BEHAVIOR_FEATURE_COUNT = KAOSModelPackage.NODES_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Emergent Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMERGENT_BEHAVIOR_OPERATION_COUNT = KAOSModelPackage.NODES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mKAOS.impl.ConstituentSystemImpl <em>Constituent System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mKAOS.impl.ConstituentSystemImpl
	 * @see mKAOS.impl.MKAOSPackageImpl#getConstituentSystem()
	 * @generated
	 */
	int CONSTITUENT_SYSTEM = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTITUENT_SYSTEM__NAME = KAOSModelPackage.SOFTWARE_AGENT__NAME;

	/**
	 * The feature id for the '<em><b>Performs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTITUENT_SYSTEM__PERFORMS = KAOSModelPackage.SOFTWARE_AGENT__PERFORMS;

	/**
	 * The feature id for the '<em><b>Composition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTITUENT_SYSTEM__COMPOSITION = KAOSModelPackage.SOFTWARE_AGENT__COMPOSITION;

	/**
	 * The feature id for the '<em><b>Responsible For</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTITUENT_SYSTEM__RESPONSIBLE_FOR = KAOSModelPackage.SOFTWARE_AGENT__RESPONSIBLE_FOR;

	/**
	 * The feature id for the '<em><b>Capable Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTITUENT_SYSTEM__CAPABLE_OF = KAOSModelPackage.SOFTWARE_AGENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Constituent System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTITUENT_SYSTEM_FEATURE_COUNT = KAOSModelPackage.SOFTWARE_AGENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Constituent System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTITUENT_SYSTEM_OPERATION_COUNT = KAOSModelPackage.SOFTWARE_AGENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mKAOS.impl.MediatorImpl <em>Mediator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mKAOS.impl.MediatorImpl
	 * @see mKAOS.impl.MKAOSPackageImpl#getMediator()
	 * @generated
	 */
	int MEDIATOR = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATOR__NAME = KAOSModelPackage.SOFTWARE_AGENT__NAME;

	/**
	 * The feature id for the '<em><b>Performs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATOR__PERFORMS = KAOSModelPackage.SOFTWARE_AGENT__PERFORMS;

	/**
	 * The feature id for the '<em><b>Composition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATOR__COMPOSITION = KAOSModelPackage.SOFTWARE_AGENT__COMPOSITION;

	/**
	 * The feature id for the '<em><b>Responsible For</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATOR__RESPONSIBLE_FOR = KAOSModelPackage.SOFTWARE_AGENT__RESPONSIBLE_FOR;

	/**
	 * The feature id for the '<em><b>Capable Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATOR__CAPABLE_OF = KAOSModelPackage.SOFTWARE_AGENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Mediator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATOR_FEATURE_COUNT = KAOSModelPackage.SOFTWARE_AGENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Mediator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATOR_OPERATION_COUNT = KAOSModelPackage.SOFTWARE_AGENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mKAOS.impl.OperationalCapabilityImpl <em>Operational Capability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mKAOS.impl.OperationalCapabilityImpl
	 * @see mKAOS.impl.MKAOSPackageImpl#getOperationalCapability()
	 * @generated
	 */
	int OPERATIONAL_CAPABILITY = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_CAPABILITY__NAME = KAOSModelPackage.OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Produces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_CAPABILITY__PRODUCES = KAOSModelPackage.OPERATION__PRODUCES;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_CAPABILITY__OUTPUT = KAOSModelPackage.OPERATION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Operationalize</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_CAPABILITY__OPERATIONALIZE = KAOSModelPackage.OPERATION__OPERATIONALIZE;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_CAPABILITY__INPUT = KAOSModelPackage.OPERATION__INPUT;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_CAPABILITY__DESC = KAOSModelPackage.OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Operational Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_CAPABILITY_FEATURE_COUNT = KAOSModelPackage.OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Operational Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_CAPABILITY_OPERATION_COUNT = KAOSModelPackage.OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mKAOS.impl.CommunicationalCapabilityImpl <em>Communicational Capability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mKAOS.impl.CommunicationalCapabilityImpl
	 * @see mKAOS.impl.MKAOSPackageImpl#getCommunicationalCapability()
	 * @generated
	 */
	int COMMUNICATIONAL_CAPABILITY = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATIONAL_CAPABILITY__NAME = KAOSModelPackage.OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Produces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATIONAL_CAPABILITY__PRODUCES = KAOSModelPackage.OPERATION__PRODUCES;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATIONAL_CAPABILITY__OUTPUT = KAOSModelPackage.OPERATION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Operationalize</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATIONAL_CAPABILITY__OPERATIONALIZE = KAOSModelPackage.OPERATION__OPERATIONALIZE;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATIONAL_CAPABILITY__INPUT = KAOSModelPackage.OPERATION__INPUT;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATIONAL_CAPABILITY__DESC = KAOSModelPackage.OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Communicational Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATIONAL_CAPABILITY_FEATURE_COUNT = KAOSModelPackage.OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Communicational Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATIONAL_CAPABILITY_OPERATION_COUNT = KAOSModelPackage.OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mKAOS.impl.EmergeLinkImpl <em>Emerge Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mKAOS.impl.EmergeLinkImpl
	 * @see mKAOS.impl.MKAOSPackageImpl#getEmergeLink()
	 * @generated
	 */
	int EMERGE_LINK = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMERGE_LINK__NAME = KAOSModelPackage.LINK__NAME;

	/**
	 * The feature id for the '<em><b>Behavior</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMERGE_LINK__BEHAVIOR = KAOSModelPackage.LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Capability</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMERGE_LINK__CAPABILITY = KAOSModelPackage.LINK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMERGE_LINK__CARDINALITY = KAOSModelPackage.LINK_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Emerge Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMERGE_LINK_FEATURE_COUNT = KAOSModelPackage.LINK_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Emerge Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMERGE_LINK_OPERATION_COUNT = KAOSModelPackage.LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mKAOS.impl.CommunicationLinkImpl <em>Communication Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mKAOS.impl.CommunicationLinkImpl
	 * @see mKAOS.impl.MKAOSPackageImpl#getCommunicationLink()
	 * @generated
	 */
	int COMMUNICATION_LINK = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_LINK__NAME = KAOSModelPackage.LINK__NAME;

	/**
	 * The feature id for the '<em><b>Capability</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_LINK__CAPABILITY = KAOSModelPackage.LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_LINK__ENTITY = KAOSModelPackage.LINK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_LINK__CARDINALITY = KAOSModelPackage.LINK_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Communication Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_LINK_FEATURE_COUNT = KAOSModelPackage.LINK_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Communication Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_LINK_OPERATION_COUNT = KAOSModelPackage.LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mKAOS.impl.CommunicationInputLinkImpl <em>Communication Input Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mKAOS.impl.CommunicationInputLinkImpl
	 * @see mKAOS.impl.MKAOSPackageImpl#getCommunicationInputLink()
	 * @generated
	 */
	int COMMUNICATION_INPUT_LINK = 9;

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
	int COMMUNICATION_OUTPUT_LINK = 10;

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
	int MISSION_LINK = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION_LINK__NAME = KAOSModelPackage.LINK__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION_LINK__SOURCE = KAOSModelPackage.LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION_LINK__TARGET = KAOSModelPackage.LINK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Mission Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION_LINK_FEATURE_COUNT = KAOSModelPackage.LINK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Mission Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION_LINK_OPERATION_COUNT = KAOSModelPackage.LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mKAOS.impl.DisruptLinkImpl <em>Disrupt Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mKAOS.impl.DisruptLinkImpl
	 * @see mKAOS.impl.MKAOSPackageImpl#getDisruptLink()
	 * @generated
	 */
	int DISRUPT_LINK = 12;

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
	int SUPORT_LINK = 13;

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
	int BLOCK_LINK = 14;

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
	int DEPENDENCY_LINK = 15;

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
	int INFLUENCE_LINK = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCE_LINK__NAME = KAOSModelPackage.LINK__NAME;

	/**
	 * The feature id for the '<em><b>Expectation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCE_LINK__EXPECTATION = KAOSModelPackage.LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Influenced</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCE_LINK__INFLUENCED = KAOSModelPackage.LINK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Influence Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCE_LINK_FEATURE_COUNT = KAOSModelPackage.LINK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Influence Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCE_LINK_OPERATION_COUNT = KAOSModelPackage.LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mKAOS.impl.GeneralizationLinkImpl <em>Generalization Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mKAOS.impl.GeneralizationLinkImpl
	 * @see mKAOS.impl.MKAOSPackageImpl#getGeneralizationLink()
	 * @generated
	 */
	int GENERALIZATION_LINK = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_LINK__NAME = KAOSModelPackage.LINK__NAME;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_LINK__ENTITY = KAOSModelPackage.LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Generalizes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_LINK__GENERALIZES = KAOSModelPackage.LINK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Generalization Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_LINK_FEATURE_COUNT = KAOSModelPackage.LINK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Generalization Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_LINK_OPERATION_COUNT = KAOSModelPackage.LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mKAOS.impl.CompositionLinkImpl <em>Composition Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mKAOS.impl.CompositionLinkImpl
	 * @see mKAOS.impl.MKAOSPackageImpl#getCompositionLink()
	 * @generated
	 */
	int COMPOSITION_LINK = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_LINK__NAME = KAOSModelPackage.LINK__NAME;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_LINK__ENTITY = KAOSModelPackage.LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Composed By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_LINK__COMPOSED_BY = KAOSModelPackage.LINK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Composition Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_LINK_FEATURE_COUNT = KAOSModelPackage.LINK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Composition Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_LINK_OPERATION_COUNT = KAOSModelPackage.LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mKAOS.impl.FormalElementImpl <em>Formal Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mKAOS.impl.FormalElementImpl
	 * @see mKAOS.impl.MKAOSPackageImpl#getFormalElement()
	 * @generated
	 */
	int FORMAL_ELEMENT = 19;

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
	int MISSION_REFINEMENT = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION_REFINEMENT__NAME = KAOSModelPackage.REFINEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Refines</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION_REFINEMENT__REFINES = KAOSModelPackage.REFINEMENT__REFINES;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION_REFINEMENT__KIND = KAOSModelPackage.REFINEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION_REFINEMENT__CUSTOM = KAOSModelPackage.REFINEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Submissions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION_REFINEMENT__SUBMISSIONS = KAOSModelPackage.REFINEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Mission Refinement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION_REFINEMENT_FEATURE_COUNT = KAOSModelPackage.REFINEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Mission Refinement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION_REFINEMENT_OPERATION_COUNT = KAOSModelPackage.REFINEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mKAOS.impl.DynBLTLImpl <em>Dyn BLTL</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mKAOS.impl.DynBLTLImpl
	 * @see mKAOS.impl.MKAOSPackageImpl#getDynBLTL()
	 * @generated
	 */
	int DYN_BLTL = 21;

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
	int RULE_TEMPORAL = 22;

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
	int RULE_BOUND = 23;

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
	int RULE_IMPLICATION = 24;

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
	int RULE_DISJUNCTION = 25;

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
	int RULE_CONJUNCTION = 26;

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
	int RULE_EQUALITY = 27;

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
	int RULE_REL_EXP = 28;

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
	int RULE_NUM_EXP = 29;

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
	int RULE_TERM = 30;

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
	int RULE_FACTOR = 31;

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
	int RULE_VAR = 32;

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
	int RULE_FUNCTION = 33;

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
	int RULE_PARAMS = 34;

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
	int RULE_LITERAL = 35;

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
	int RULE_INTEGER_LIT = 36;

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
	int RULE_FLOAT_LIT = 37;

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
	int RULE_TUPLE_LIT = 38;

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
	int RULE_SEQ_LIT = 39;

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
	int MISSION_REFINEMENT_KIND = 40;

	/**
	 * The meta object id for the '{@link mKAOS.RuleQuantifier <em>Rule Quantifier</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mKAOS.RuleQuantifier
	 * @see mKAOS.impl.MKAOSPackageImpl#getRuleQuantifier()
	 * @generated
	 */
	int RULE_QUANTIFIER = 41;

	/**
	 * The meta object id for the '{@link mKAOS.RuleTempBinOp <em>Rule Temp Bin Op</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mKAOS.RuleTempBinOp
	 * @see mKAOS.impl.MKAOSPackageImpl#getRuleTempBinOp()
	 * @generated
	 */
	int RULE_TEMP_BIN_OP = 42;

	/**
	 * The meta object id for the '{@link mKAOS.RuleTempUnOp <em>Rule Temp Un Op</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mKAOS.RuleTempUnOp
	 * @see mKAOS.impl.MKAOSPackageImpl#getRuleTempUnOp()
	 * @generated
	 */
	int RULE_TEMP_UN_OP = 43;


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
	 * Returns the meta object for the reference list '{@link mKAOS.EmergeLink#getBehavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Behavior</em>'.
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
		 * The meta object literal for the '<em><b>Behavior</b></em>' reference list feature.
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
