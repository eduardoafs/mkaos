/**
 */
package mKAOS.impl;

import KAOSModel.KAOSModelPackage;

import KAOSModel.impl.KAOSModelPackageImpl;

import mKAOS.BlockLink;
import mKAOS.CommunicationInputLink;
import mKAOS.CommunicationLink;
import mKAOS.CommunicationOutputLink;
import mKAOS.CommunicationalCapability;
import mKAOS.CompositionLink;
import mKAOS.ConstituentSystem;
import mKAOS.DependencyLink;
import mKAOS.DisruptLink;
import mKAOS.DynBLTL;
import mKAOS.EmergeLink;
import mKAOS.EmergentBehavior;
import mKAOS.FormalElement;
import mKAOS.GeneralizationLink;
import mKAOS.InfluenceLink;
import mKAOS.MKAOSFactory;
import mKAOS.MKAOSPackage;
import mKAOS.Mediator;
import mKAOS.Mission;
import mKAOS.MissionLink;
import mKAOS.MissionRefinement;
import mKAOS.MissionRefinementKind;
import mKAOS.OperationalCapability;
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
import mKAOS.RuleQuantifier;
import mKAOS.RuleRelExp;
import mKAOS.RuleSeqLit;
import mKAOS.RuleTempBinOp;
import mKAOS.RuleTempUnOp;
import mKAOS.RuleTemporal;
import mKAOS.RuleTerm;
import mKAOS.RuleTupleLit;
import mKAOS.RuleVar;
import mKAOS.SuportLink;
import mKAOS.mKAOS;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MKAOSPackageImpl extends EPackageImpl implements MKAOSPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mKAOSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass missionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emergentBehaviorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constituentSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mediatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationalCapabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass communicationalCapabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emergeLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass communicationLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass communicationInputLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass communicationOutputLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass missionLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass disruptLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass suportLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blockLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dependencyLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass influenceLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalizationLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositionLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formalElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass missionRefinementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dynBLTLEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleTemporalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleBoundEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleImplicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleDisjunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleConjunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleEqualityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleRelExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleNumExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleTermEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleFactorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleVarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleParamsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleIntegerLitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleFloatLitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleTupleLitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleSeqLitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum missionRefinementKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ruleQuantifierEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ruleTempBinOpEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ruleTempUnOpEEnum = null;

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
	 * @see mKAOS.MKAOSPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MKAOSPackageImpl() {
		super(eNS_URI, MKAOSFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MKAOSPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MKAOSPackage init() {
		if (isInited) return (MKAOSPackage)EPackage.Registry.INSTANCE.getEPackage(MKAOSPackage.eNS_URI);

		// Obtain or create and register package
		MKAOSPackageImpl theMKAOSPackage = (MKAOSPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MKAOSPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MKAOSPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		KAOSModelPackageImpl theKAOSModelPackage = (KAOSModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(KAOSModelPackage.eNS_URI) instanceof KAOSModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(KAOSModelPackage.eNS_URI) : KAOSModelPackage.eINSTANCE);

		// Create package meta-data objects
		theMKAOSPackage.createPackageContents();
		theKAOSModelPackage.createPackageContents();

		// Initialize created meta-data
		theMKAOSPackage.initializePackageContents();
		theKAOSModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMKAOSPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MKAOSPackage.eNS_URI, theMKAOSPackage);
		return theMKAOSPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getmKAOS() {
		return mKAOSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMission() {
		return missionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMission_Priority() {
		return (EAttribute)missionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMission_AssignedTo() {
		return (EReference)missionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMission_Links() {
		return (EReference)missionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMission_Description() {
		return (EAttribute)missionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMission_Trigger() {
		return (EReference)missionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMission_Refinement() {
		return (EReference)missionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmergentBehavior() {
		return emergentBehaviorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEmergentBehavior_RelatedTo() {
		return (EReference)emergentBehaviorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstituentSystem() {
		return constituentSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstituentSystem_CapableOf() {
		return (EReference)constituentSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMediator() {
		return mediatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMediator_CapableOf() {
		return (EReference)mediatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationalCapability() {
		return operationalCapabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationalCapability_Desc() {
		return (EAttribute)operationalCapabilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommunicationalCapability() {
		return communicationalCapabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommunicationalCapability_Desc() {
		return (EAttribute)communicationalCapabilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmergeLink() {
		return emergeLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEmergeLink_Behavior() {
		return (EReference)emergeLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEmergeLink_Capability() {
		return (EReference)emergeLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmergeLink_Cardinality() {
		return (EAttribute)emergeLinkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommunicationLink() {
		return communicationLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationLink_Capability() {
		return (EReference)communicationLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationLink_Entity() {
		return (EReference)communicationLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommunicationLink_Cardinality() {
		return (EAttribute)communicationLinkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommunicationInputLink() {
		return communicationInputLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommunicationOutputLink() {
		return communicationOutputLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMissionLink() {
		return missionLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMissionLink_Source() {
		return (EReference)missionLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMissionLink_Target() {
		return (EReference)missionLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDisruptLink() {
		return disruptLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSuportLink() {
		return suportLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlockLink() {
		return blockLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDependencyLink() {
		return dependencyLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInfluenceLink() {
		return influenceLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInfluenceLink_Expectation() {
		return (EReference)influenceLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInfluenceLink_Influenced() {
		return (EReference)influenceLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneralizationLink() {
		return generalizationLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneralizationLink_Entity() {
		return (EReference)generalizationLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneralizationLink_Generalizes() {
		return (EReference)generalizationLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositionLink() {
		return compositionLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositionLink_Entity() {
		return (EReference)compositionLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositionLink_ComposedBy() {
		return (EReference)compositionLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFormalElement() {
		return formalElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormalElement_Rule() {
		return (EReference)formalElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMissionRefinement() {
		return missionRefinementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMissionRefinement_Kind() {
		return (EAttribute)missionRefinementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMissionRefinement_Custom() {
		return (EReference)missionRefinementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMissionRefinement_Submissions() {
		return (EReference)missionRefinementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDynBLTL() {
		return dynBLTLEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDynBLTL_Q() {
		return (EAttribute)dynBLTLEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDynBLTL_Val() {
		return (EAttribute)dynBLTLEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDynBLTL_C() {
		return (EReference)dynBLTLEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDynBLTL_T() {
		return (EReference)dynBLTLEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuleTemporal() {
		return ruleTemporalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuleTemporal_Val1() {
		return (EReference)ruleTemporalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuleTemporal_B() {
		return (EReference)ruleTemporalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuleTemporal_E() {
		return (EReference)ruleTemporalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuleTemporal_O() {
		return (EAttribute)ruleTemporalEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuleTemporal_O1() {
		return (EAttribute)ruleTemporalEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuleBound() {
		return ruleBoundEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuleBound_Floatlit() {
		return (EAttribute)ruleBoundEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuleBound_Integerlit() {
		return (EAttribute)ruleBoundEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuleBound_E() {
		return (EReference)ruleBoundEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuleImplication() {
		return ruleImplicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuleImplication_R() {
		return (EReference)ruleImplicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuleImplication_L() {
		return (EReference)ruleImplicationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuleDisjunction() {
		return ruleDisjunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuleDisjunction_L() {
		return (EReference)ruleDisjunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuleDisjunction_R() {
		return (EReference)ruleDisjunctionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuleConjunction() {
		return ruleConjunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuleConjunction_L() {
		return (EReference)ruleConjunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuleConjunction_R() {
		return (EReference)ruleConjunctionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuleEquality() {
		return ruleEqualityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuleEquality_Neg() {
		return (EAttribute)ruleEqualityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuleEquality_L() {
		return (EReference)ruleEqualityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuleEquality_R() {
		return (EReference)ruleEqualityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuleRelExp() {
		return ruleRelExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuleRelExp_L() {
		return (EReference)ruleRelExpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuleRelExp_R() {
		return (EReference)ruleRelExpEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuleNumExp() {
		return ruleNumExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuleNumExp_L() {
		return (EReference)ruleNumExpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuleNumExp_R() {
		return (EReference)ruleNumExpEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuleTerm() {
		return ruleTermEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuleTerm_R() {
		return (EReference)ruleTermEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuleTerm_L() {
		return (EReference)ruleTermEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuleFactor() {
		return ruleFactorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuleFactor_Vallit() {
		return (EReference)ruleFactorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuleFactor_Valvar() {
		return (EReference)ruleFactorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuleFactor_Valfun() {
		return (EReference)ruleFactorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuleFactor_Curl() {
		return (EReference)ruleFactorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuleFactor_Par() {
		return (EReference)ruleFactorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuleVar() {
		return ruleVarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuleVar_Val() {
		return (EAttribute)ruleVarEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuleVar_I() {
		return (EReference)ruleVarEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuleFunction() {
		return ruleFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuleFunction_L() {
		return (EReference)ruleFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuleParams() {
		return ruleParamsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuleParams_L() {
		return (EReference)ruleParamsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuleLiteral() {
		return ruleLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuleIntegerLit() {
		return ruleIntegerLitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuleIntegerLit_Val() {
		return (EAttribute)ruleIntegerLitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuleFloatLit() {
		return ruleFloatLitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuleFloatLit_Val() {
		return (EAttribute)ruleFloatLitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuleTupleLit() {
		return ruleTupleLitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuleTupleLit_Vals() {
		return (EReference)ruleTupleLitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuleSeqLit() {
		return ruleSeqLitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuleSeqLit_Vals() {
		return (EReference)ruleSeqLitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMissionRefinementKind() {
		return missionRefinementKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRuleQuantifier() {
		return ruleQuantifierEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRuleTempBinOp() {
		return ruleTempBinOpEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRuleTempUnOp() {
		return ruleTempUnOpEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MKAOSFactory getMKAOSFactory() {
		return (MKAOSFactory)getEFactoryInstance();
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
		mKAOSEClass = createEClass(MKAOS);

		missionEClass = createEClass(MISSION);
		createEAttribute(missionEClass, MISSION__PRIORITY);
		createEReference(missionEClass, MISSION__ASSIGNED_TO);
		createEReference(missionEClass, MISSION__LINKS);
		createEAttribute(missionEClass, MISSION__DESCRIPTION);
		createEReference(missionEClass, MISSION__TRIGGER);
		createEReference(missionEClass, MISSION__REFINEMENT);

		emergentBehaviorEClass = createEClass(EMERGENT_BEHAVIOR);
		createEReference(emergentBehaviorEClass, EMERGENT_BEHAVIOR__RELATED_TO);

		constituentSystemEClass = createEClass(CONSTITUENT_SYSTEM);
		createEReference(constituentSystemEClass, CONSTITUENT_SYSTEM__CAPABLE_OF);

		mediatorEClass = createEClass(MEDIATOR);
		createEReference(mediatorEClass, MEDIATOR__CAPABLE_OF);

		operationalCapabilityEClass = createEClass(OPERATIONAL_CAPABILITY);
		createEAttribute(operationalCapabilityEClass, OPERATIONAL_CAPABILITY__DESC);

		communicationalCapabilityEClass = createEClass(COMMUNICATIONAL_CAPABILITY);
		createEAttribute(communicationalCapabilityEClass, COMMUNICATIONAL_CAPABILITY__DESC);

		emergeLinkEClass = createEClass(EMERGE_LINK);
		createEReference(emergeLinkEClass, EMERGE_LINK__BEHAVIOR);
		createEReference(emergeLinkEClass, EMERGE_LINK__CAPABILITY);
		createEAttribute(emergeLinkEClass, EMERGE_LINK__CARDINALITY);

		communicationLinkEClass = createEClass(COMMUNICATION_LINK);
		createEReference(communicationLinkEClass, COMMUNICATION_LINK__CAPABILITY);
		createEReference(communicationLinkEClass, COMMUNICATION_LINK__ENTITY);
		createEAttribute(communicationLinkEClass, COMMUNICATION_LINK__CARDINALITY);

		communicationInputLinkEClass = createEClass(COMMUNICATION_INPUT_LINK);

		communicationOutputLinkEClass = createEClass(COMMUNICATION_OUTPUT_LINK);

		missionLinkEClass = createEClass(MISSION_LINK);
		createEReference(missionLinkEClass, MISSION_LINK__SOURCE);
		createEReference(missionLinkEClass, MISSION_LINK__TARGET);

		disruptLinkEClass = createEClass(DISRUPT_LINK);

		suportLinkEClass = createEClass(SUPORT_LINK);

		blockLinkEClass = createEClass(BLOCK_LINK);

		dependencyLinkEClass = createEClass(DEPENDENCY_LINK);

		influenceLinkEClass = createEClass(INFLUENCE_LINK);
		createEReference(influenceLinkEClass, INFLUENCE_LINK__EXPECTATION);
		createEReference(influenceLinkEClass, INFLUENCE_LINK__INFLUENCED);

		generalizationLinkEClass = createEClass(GENERALIZATION_LINK);
		createEReference(generalizationLinkEClass, GENERALIZATION_LINK__ENTITY);
		createEReference(generalizationLinkEClass, GENERALIZATION_LINK__GENERALIZES);

		compositionLinkEClass = createEClass(COMPOSITION_LINK);
		createEReference(compositionLinkEClass, COMPOSITION_LINK__ENTITY);
		createEReference(compositionLinkEClass, COMPOSITION_LINK__COMPOSED_BY);

		formalElementEClass = createEClass(FORMAL_ELEMENT);
		createEReference(formalElementEClass, FORMAL_ELEMENT__RULE);

		missionRefinementEClass = createEClass(MISSION_REFINEMENT);
		createEAttribute(missionRefinementEClass, MISSION_REFINEMENT__KIND);
		createEReference(missionRefinementEClass, MISSION_REFINEMENT__CUSTOM);
		createEReference(missionRefinementEClass, MISSION_REFINEMENT__SUBMISSIONS);

		dynBLTLEClass = createEClass(DYN_BLTL);
		createEAttribute(dynBLTLEClass, DYN_BLTL__Q);
		createEAttribute(dynBLTLEClass, DYN_BLTL__VAL);
		createEReference(dynBLTLEClass, DYN_BLTL__C);
		createEReference(dynBLTLEClass, DYN_BLTL__T);

		ruleTemporalEClass = createEClass(RULE_TEMPORAL);
		createEReference(ruleTemporalEClass, RULE_TEMPORAL__VAL1);
		createEReference(ruleTemporalEClass, RULE_TEMPORAL__B);
		createEReference(ruleTemporalEClass, RULE_TEMPORAL__E);
		createEAttribute(ruleTemporalEClass, RULE_TEMPORAL__O);
		createEAttribute(ruleTemporalEClass, RULE_TEMPORAL__O1);

		ruleBoundEClass = createEClass(RULE_BOUND);
		createEAttribute(ruleBoundEClass, RULE_BOUND__FLOATLIT);
		createEAttribute(ruleBoundEClass, RULE_BOUND__INTEGERLIT);
		createEReference(ruleBoundEClass, RULE_BOUND__E);

		ruleImplicationEClass = createEClass(RULE_IMPLICATION);
		createEReference(ruleImplicationEClass, RULE_IMPLICATION__R);
		createEReference(ruleImplicationEClass, RULE_IMPLICATION__L);

		ruleDisjunctionEClass = createEClass(RULE_DISJUNCTION);
		createEReference(ruleDisjunctionEClass, RULE_DISJUNCTION__L);
		createEReference(ruleDisjunctionEClass, RULE_DISJUNCTION__R);

		ruleConjunctionEClass = createEClass(RULE_CONJUNCTION);
		createEReference(ruleConjunctionEClass, RULE_CONJUNCTION__L);
		createEReference(ruleConjunctionEClass, RULE_CONJUNCTION__R);

		ruleEqualityEClass = createEClass(RULE_EQUALITY);
		createEAttribute(ruleEqualityEClass, RULE_EQUALITY__NEG);
		createEReference(ruleEqualityEClass, RULE_EQUALITY__L);
		createEReference(ruleEqualityEClass, RULE_EQUALITY__R);

		ruleRelExpEClass = createEClass(RULE_REL_EXP);
		createEReference(ruleRelExpEClass, RULE_REL_EXP__L);
		createEReference(ruleRelExpEClass, RULE_REL_EXP__R);

		ruleNumExpEClass = createEClass(RULE_NUM_EXP);
		createEReference(ruleNumExpEClass, RULE_NUM_EXP__L);
		createEReference(ruleNumExpEClass, RULE_NUM_EXP__R);

		ruleTermEClass = createEClass(RULE_TERM);
		createEReference(ruleTermEClass, RULE_TERM__R);
		createEReference(ruleTermEClass, RULE_TERM__L);

		ruleFactorEClass = createEClass(RULE_FACTOR);
		createEReference(ruleFactorEClass, RULE_FACTOR__VALLIT);
		createEReference(ruleFactorEClass, RULE_FACTOR__VALVAR);
		createEReference(ruleFactorEClass, RULE_FACTOR__VALFUN);
		createEReference(ruleFactorEClass, RULE_FACTOR__CURL);
		createEReference(ruleFactorEClass, RULE_FACTOR__PAR);

		ruleVarEClass = createEClass(RULE_VAR);
		createEAttribute(ruleVarEClass, RULE_VAR__VAL);
		createEReference(ruleVarEClass, RULE_VAR__I);

		ruleFunctionEClass = createEClass(RULE_FUNCTION);
		createEReference(ruleFunctionEClass, RULE_FUNCTION__L);

		ruleParamsEClass = createEClass(RULE_PARAMS);
		createEReference(ruleParamsEClass, RULE_PARAMS__L);

		ruleLiteralEClass = createEClass(RULE_LITERAL);

		ruleIntegerLitEClass = createEClass(RULE_INTEGER_LIT);
		createEAttribute(ruleIntegerLitEClass, RULE_INTEGER_LIT__VAL);

		ruleFloatLitEClass = createEClass(RULE_FLOAT_LIT);
		createEAttribute(ruleFloatLitEClass, RULE_FLOAT_LIT__VAL);

		ruleTupleLitEClass = createEClass(RULE_TUPLE_LIT);
		createEReference(ruleTupleLitEClass, RULE_TUPLE_LIT__VALS);

		ruleSeqLitEClass = createEClass(RULE_SEQ_LIT);
		createEReference(ruleSeqLitEClass, RULE_SEQ_LIT__VALS);

		// Create enums
		missionRefinementKindEEnum = createEEnum(MISSION_REFINEMENT_KIND);
		ruleQuantifierEEnum = createEEnum(RULE_QUANTIFIER);
		ruleTempBinOpEEnum = createEEnum(RULE_TEMP_BIN_OP);
		ruleTempUnOpEEnum = createEEnum(RULE_TEMP_UN_OP);
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

		// Obtain other dependent packages
		KAOSModelPackage theKAOSModelPackage = (KAOSModelPackage)EPackage.Registry.INSTANCE.getEPackage(KAOSModelPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		mKAOSEClass.getESuperTypes().add(theKAOSModelPackage.getKAOS());
		missionEClass.getESuperTypes().add(theKAOSModelPackage.getGoal());
		missionEClass.getESuperTypes().add(this.getFormalElement());
		emergentBehaviorEClass.getESuperTypes().add(theKAOSModelPackage.getNodes());
		constituentSystemEClass.getESuperTypes().add(theKAOSModelPackage.getSoftwareAgent());
		mediatorEClass.getESuperTypes().add(theKAOSModelPackage.getSoftwareAgent());
		operationalCapabilityEClass.getESuperTypes().add(theKAOSModelPackage.getOperation());
		communicationalCapabilityEClass.getESuperTypes().add(theKAOSModelPackage.getOperation());
		emergeLinkEClass.getESuperTypes().add(theKAOSModelPackage.getLink());
		communicationLinkEClass.getESuperTypes().add(theKAOSModelPackage.getLink());
		communicationInputLinkEClass.getESuperTypes().add(this.getCommunicationLink());
		communicationOutputLinkEClass.getESuperTypes().add(this.getCommunicationLink());
		missionLinkEClass.getESuperTypes().add(theKAOSModelPackage.getLink());
		disruptLinkEClass.getESuperTypes().add(this.getMissionLink());
		suportLinkEClass.getESuperTypes().add(this.getMissionLink());
		blockLinkEClass.getESuperTypes().add(this.getMissionLink());
		dependencyLinkEClass.getESuperTypes().add(this.getMissionLink());
		influenceLinkEClass.getESuperTypes().add(theKAOSModelPackage.getLink());
		generalizationLinkEClass.getESuperTypes().add(theKAOSModelPackage.getLink());
		compositionLinkEClass.getESuperTypes().add(theKAOSModelPackage.getLink());
		missionRefinementEClass.getESuperTypes().add(theKAOSModelPackage.getRefinement());
		ruleTemporalEClass.getESuperTypes().add(this.getDynBLTL());
		ruleIntegerLitEClass.getESuperTypes().add(this.getRuleLiteral());
		ruleFloatLitEClass.getESuperTypes().add(this.getRuleLiteral());
		ruleTupleLitEClass.getESuperTypes().add(this.getRuleLiteral());
		ruleSeqLitEClass.getESuperTypes().add(this.getRuleLiteral());

		// Initialize classes, features, and operations; add parameters
		initEClass(mKAOSEClass, mKAOS.class, "mKAOS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(missionEClass, Mission.class, "Mission", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMission_Priority(), ecorePackage.getEInt(), "priority", null, 1, 1, Mission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMission_AssignedTo(), this.getConstituentSystem(), null, "assignedTo", null, 0, 1, Mission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMission_Links(), this.getMissionLink(), this.getMissionLink_Source(), "links", null, 0, -1, Mission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMission_Description(), ecorePackage.getEString(), "description", null, 0, 1, Mission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMission_Trigger(), this.getDynBLTL(), null, "trigger", null, 1, 1, Mission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMission_Refinement(), this.getMissionRefinement(), null, "refinement", null, 0, 1, Mission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(emergentBehaviorEClass, EmergentBehavior.class, "EmergentBehavior", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEmergentBehavior_RelatedTo(), this.getMission(), null, "relatedTo", null, 0, -1, EmergentBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constituentSystemEClass, ConstituentSystem.class, "ConstituentSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstituentSystem_CapableOf(), this.getOperationalCapability(), null, "capableOf", null, 0, -1, ConstituentSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mediatorEClass, Mediator.class, "Mediator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMediator_CapableOf(), this.getCommunicationalCapability(), null, "capableOf", null, 0, -1, Mediator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationalCapabilityEClass, OperationalCapability.class, "OperationalCapability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOperationalCapability_Desc(), ecorePackage.getEString(), "desc", null, 0, 1, OperationalCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(communicationalCapabilityEClass, CommunicationalCapability.class, "CommunicationalCapability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCommunicationalCapability_Desc(), ecorePackage.getEString(), "desc", null, 0, 1, CommunicationalCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(emergeLinkEClass, EmergeLink.class, "EmergeLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEmergeLink_Behavior(), this.getEmergentBehavior(), null, "behavior", null, 0, -1, EmergeLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEmergeLink_Capability(), this.getCommunicationalCapability(), null, "capability", null, 0, 1, EmergeLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmergeLink_Cardinality(), ecorePackage.getEString(), "cardinality", "[1..*]", 0, 1, EmergeLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(communicationLinkEClass, CommunicationLink.class, "CommunicationLink", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCommunicationLink_Capability(), this.getCommunicationalCapability(), null, "capability", null, 0, 1, CommunicationLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommunicationLink_Entity(), theKAOSModelPackage.getEntity(), null, "entity", null, 0, 1, CommunicationLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommunicationLink_Cardinality(), ecorePackage.getEString(), "cardinality", "[1..1]", 0, 1, CommunicationLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(communicationInputLinkEClass, CommunicationInputLink.class, "CommunicationInputLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(communicationOutputLinkEClass, CommunicationOutputLink.class, "CommunicationOutputLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(missionLinkEClass, MissionLink.class, "MissionLink", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMissionLink_Source(), this.getMission(), this.getMission_Links(), "source", null, 0, 1, MissionLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMissionLink_Target(), this.getMission(), null, "target", null, 0, 1, MissionLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(disruptLinkEClass, DisruptLink.class, "DisruptLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(suportLinkEClass, SuportLink.class, "SuportLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(blockLinkEClass, BlockLink.class, "BlockLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dependencyLinkEClass, DependencyLink.class, "DependencyLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(influenceLinkEClass, InfluenceLink.class, "InfluenceLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInfluenceLink_Expectation(), theKAOSModelPackage.getExpectation(), null, "expectation", null, 0, 1, InfluenceLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getInfluenceLink_Expectation().getEKeys().add(theKAOSModelPackage.getNodes_Name());
		initEReference(getInfluenceLink_Influenced(), theKAOSModelPackage.getEntity(), null, "influenced", null, 0, 1, InfluenceLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(generalizationLinkEClass, GeneralizationLink.class, "GeneralizationLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGeneralizationLink_Entity(), theKAOSModelPackage.getEntity(), null, "entity", null, 0, 1, GeneralizationLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getGeneralizationLink_Entity().getEKeys().add(theKAOSModelPackage.getNodes_Name());
		initEReference(getGeneralizationLink_Generalizes(), theKAOSModelPackage.getEntity(), null, "generalizes", null, 0, 1, GeneralizationLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getGeneralizationLink_Generalizes().getEKeys().add(theKAOSModelPackage.getNodes_Name());

		initEClass(compositionLinkEClass, CompositionLink.class, "CompositionLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositionLink_Entity(), theKAOSModelPackage.getEntity(), null, "entity", null, 0, 1, CompositionLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getCompositionLink_Entity().getEKeys().add(theKAOSModelPackage.getNodes_Name());
		initEReference(getCompositionLink_ComposedBy(), theKAOSModelPackage.getEntity(), null, "composedBy", null, 0, 1, CompositionLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getCompositionLink_ComposedBy().getEKeys().add(theKAOSModelPackage.getNodes_Name());

		initEClass(formalElementEClass, FormalElement.class, "FormalElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFormalElement_Rule(), this.getDynBLTL(), null, "rule", null, 0, 1, FormalElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(missionRefinementEClass, MissionRefinement.class, "MissionRefinement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMissionRefinement_Kind(), this.getMissionRefinementKind(), "kind", "custom", 1, 1, MissionRefinement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMissionRefinement_Custom(), this.getDynBLTL(), null, "custom", null, 0, 1, MissionRefinement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMissionRefinement_Submissions(), this.getMission(), null, "submissions", null, 0, -1, MissionRefinement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dynBLTLEClass, DynBLTL.class, "DynBLTL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDynBLTL_Q(), this.getRuleQuantifier(), "q", null, 0, 1, DynBLTL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDynBLTL_Val(), ecorePackage.getEString(), "val", null, 0, 1, DynBLTL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDynBLTL_C(), this.getRuleFunction(), null, "c", null, 0, 1, DynBLTL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDynBLTL_T(), this.getRuleTemporal(), null, "t", null, 0, 1, DynBLTL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ruleTemporalEClass, RuleTemporal.class, "RuleTemporal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRuleTemporal_Val1(), this.getRuleImplication(), null, "val1", null, 0, 1, RuleTemporal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRuleTemporal_B(), this.getRuleBound(), null, "b", null, 0, 1, RuleTemporal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRuleTemporal_E(), this.getDynBLTL(), null, "e", null, 0, 1, RuleTemporal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRuleTemporal_O(), this.getRuleTempBinOp(), "o", null, 0, 1, RuleTemporal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRuleTemporal_O1(), this.getRuleTempUnOp(), "o1", null, 0, 1, RuleTemporal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ruleBoundEClass, RuleBound.class, "RuleBound", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRuleBound_Floatlit(), ecorePackage.getEFloat(), "floatlit", null, 0, 1, RuleBound.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRuleBound_Integerlit(), ecorePackage.getEInt(), "integerlit", null, 0, 1, RuleBound.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRuleBound_E(), this.getDynBLTL(), null, "e", null, 0, 1, RuleBound.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ruleImplicationEClass, RuleImplication.class, "RuleImplication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRuleImplication_R(), this.getRuleDisjunction(), null, "r", null, 0, -1, RuleImplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRuleImplication_L(), this.getRuleDisjunction(), null, "l", null, 0, 1, RuleImplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ruleDisjunctionEClass, RuleDisjunction.class, "RuleDisjunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRuleDisjunction_L(), this.getRuleConjunction(), null, "l", null, 0, 1, RuleDisjunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRuleDisjunction_R(), this.getRuleConjunction(), null, "r", null, 0, -1, RuleDisjunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ruleConjunctionEClass, RuleConjunction.class, "RuleConjunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRuleConjunction_L(), this.getRuleEquality(), null, "l", null, 0, 1, RuleConjunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRuleConjunction_R(), this.getRuleEquality(), null, "r", null, 0, -1, RuleConjunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ruleEqualityEClass, RuleEquality.class, "RuleEquality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRuleEquality_Neg(), ecorePackage.getEBoolean(), "neg", null, 0, 1, RuleEquality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRuleEquality_L(), this.getRuleRelExp(), null, "l", null, 0, 1, RuleEquality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRuleEquality_R(), this.getRuleRelExp(), null, "r", null, 0, 1, RuleEquality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ruleRelExpEClass, RuleRelExp.class, "RuleRelExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRuleRelExp_L(), this.getRuleNumExp(), null, "l", null, 0, 1, RuleRelExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRuleRelExp_R(), this.getRuleNumExp(), null, "r", null, 0, 1, RuleRelExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ruleNumExpEClass, RuleNumExp.class, "RuleNumExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRuleNumExp_L(), this.getRuleTerm(), null, "l", null, 0, 1, RuleNumExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRuleNumExp_R(), this.getRuleTerm(), null, "r", null, 0, -1, RuleNumExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ruleTermEClass, RuleTerm.class, "RuleTerm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRuleTerm_R(), this.getRuleFactor(), null, "r", null, 0, -1, RuleTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRuleTerm_L(), this.getRuleFactor(), null, "l", null, 0, 1, RuleTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ruleFactorEClass, RuleFactor.class, "RuleFactor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRuleFactor_Vallit(), this.getRuleLiteral(), null, "vallit", null, 0, 1, RuleFactor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRuleFactor_Valvar(), this.getRuleVar(), null, "valvar", null, 0, 1, RuleFactor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRuleFactor_Valfun(), this.getRuleFunction(), null, "valfun", null, 0, 1, RuleFactor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRuleFactor_Curl(), this.getDynBLTL(), null, "curl", null, 0, 1, RuleFactor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRuleFactor_Par(), this.getDynBLTL(), null, "par", null, 0, 1, RuleFactor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ruleVarEClass, RuleVar.class, "RuleVar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRuleVar_Val(), ecorePackage.getEString(), "val", null, 0, -1, RuleVar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRuleVar_I(), this.getRuleNumExp(), null, "i", null, 0, -1, RuleVar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ruleFunctionEClass, RuleFunction.class, "RuleFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRuleFunction_L(), this.getRuleParams(), null, "l", null, 0, 1, RuleFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ruleParamsEClass, RuleParams.class, "RuleParams", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRuleParams_L(), this.getRuleVar(), null, "l", null, 0, -1, RuleParams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ruleLiteralEClass, RuleLiteral.class, "RuleLiteral", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ruleIntegerLitEClass, RuleIntegerLit.class, "RuleIntegerLit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRuleIntegerLit_Val(), ecorePackage.getEInt(), "val", null, 0, 1, RuleIntegerLit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ruleFloatLitEClass, RuleFloatLit.class, "RuleFloatLit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRuleFloatLit_Val(), ecorePackage.getEFloat(), "val", null, 0, 1, RuleFloatLit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ruleTupleLitEClass, RuleTupleLit.class, "RuleTupleLit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRuleTupleLit_Vals(), this.getRuleLiteral(), null, "vals", null, 0, -1, RuleTupleLit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ruleSeqLitEClass, RuleSeqLit.class, "RuleSeqLit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRuleSeqLit_Vals(), this.getRuleLiteral(), null, "vals", null, 0, -1, RuleSeqLit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(missionRefinementKindEEnum, MissionRefinementKind.class, "MissionRefinementKind");
		addEEnumLiteral(missionRefinementKindEEnum, MissionRefinementKind.ALL);
		addEEnumLiteral(missionRefinementKindEEnum, MissionRefinementKind.AT_LEAST_ONE);
		addEEnumLiteral(missionRefinementKindEEnum, MissionRefinementKind.ALTERNATIVE);
		addEEnumLiteral(missionRefinementKindEEnum, MissionRefinementKind.CUSTOM);

		initEEnum(ruleQuantifierEEnum, RuleQuantifier.class, "RuleQuantifier");
		addEEnumLiteral(ruleQuantifierEEnum, RuleQuantifier.EXISTS);
		addEEnumLiteral(ruleQuantifierEEnum, RuleQuantifier.FORALL);
		addEEnumLiteral(ruleQuantifierEEnum, RuleQuantifier.COUNT);

		initEEnum(ruleTempBinOpEEnum, RuleTempBinOp.class, "RuleTempBinOp");
		addEEnumLiteral(ruleTempBinOpEEnum, RuleTempBinOp.UNTIL);
		addEEnumLiteral(ruleTempBinOpEEnum, RuleTempBinOp.WEAK);

		initEEnum(ruleTempUnOpEEnum, RuleTempUnOp.class, "RuleTempUnOp");
		addEEnumLiteral(ruleTempUnOpEEnum, RuleTempUnOp.GLOBALLY);
		addEEnumLiteral(ruleTempUnOpEEnum, RuleTempUnOp.FATALLY);
		addEEnumLiteral(ruleTempUnOpEEnum, RuleTempUnOp.NEXT);

		// Create resource
		createResource(eNS_URI);
	}

} //MKAOSPackageImpl
