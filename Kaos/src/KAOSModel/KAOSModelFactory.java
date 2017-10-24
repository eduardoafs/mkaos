/**
 */
package KAOSModel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see KAOSModel.KAOSModelPackage
 * @generated
 */
public interface KAOSModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	KAOSModelFactory eINSTANCE = KAOSModel.impl.KAOSModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation</em>'.
	 * @generated
	 */
	Operation createOperation();

	/**
	 * Returns a new object of class '<em>KAOS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>KAOS</em>'.
	 * @generated
	 */
	KAOS createKAOS();

	/**
	 * Returns a new object of class '<em>Operation Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation Node</em>'.
	 * @generated
	 */
	OperationNode createOperationNode();

	/**
	 * Returns a new object of class '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event</em>'.
	 * @generated
	 */
	Event createEvent();

	/**
	 * Returns a new object of class '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity</em>'.
	 * @generated
	 */
	Entity createEntity();

	/**
	 * Returns a new object of class '<em>Associations</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Associations</em>'.
	 * @generated
	 */
	Associations createAssociations();

	/**
	 * Returns a new object of class '<em>Software Agent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Software Agent</em>'.
	 * @generated
	 */
	SoftwareAgent createSoftwareAgent();

	/**
	 * Returns a new object of class '<em>Environment Agent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Environment Agent</em>'.
	 * @generated
	 */
	EnvironmentAgent createEnvironmentAgent();

	/**
	 * Returns a new object of class '<em>Obstacle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Obstacle</em>'.
	 * @generated
	 */
	Obstacle createObstacle();

	/**
	 * Returns a new object of class '<em>Goal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Goal</em>'.
	 * @generated
	 */
	Goal createGoal();

	/**
	 * Returns a new object of class '<em>Assignment Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assignment Link</em>'.
	 * @generated
	 */
	AssignmentLink createAssignmentLink();

	/**
	 * Returns a new object of class '<em>Conflict Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conflict Link</em>'.
	 * @generated
	 */
	ConflictLink createConflictLink();

	/**
	 * Returns a new object of class '<em>Obstruction Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Obstruction Link</em>'.
	 * @generated
	 */
	ObstructionLink createObstructionLink();

	/**
	 * Returns a new object of class '<em>Output Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Output Link</em>'.
	 * @generated
	 */
	OutputLink createOutputLink();

	/**
	 * Returns a new object of class '<em>Expectation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expectation</em>'.
	 * @generated
	 */
	Expectation createExpectation();

	/**
	 * Returns a new object of class '<em>Input Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Link</em>'.
	 * @generated
	 */
	InputLink createInputLink();

	/**
	 * Returns a new object of class '<em>Refinement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Refinement</em>'.
	 * @generated
	 */
	Refinement createRefinement();

	/**
	 * Returns a new object of class '<em>And Refinement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>And Refinement</em>'.
	 * @generated
	 */
	AndRefinement createAndRefinement();

	/**
	 * Returns a new object of class '<em>Or Refinement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Or Refinement</em>'.
	 * @generated
	 */
	OrRefinement createOrRefinement();

	/**
	 * Returns a new object of class '<em>Domain Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain Property</em>'.
	 * @generated
	 */
	DomainProperty createDomainProperty();

	/**
	 * Returns a new object of class '<em>Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Requirement</em>'.
	 * @generated
	 */
	Requirement createRequirement();

	/**
	 * Returns a new object of class '<em>Operacionalization Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operacionalization Link</em>'.
	 * @generated
	 */
	OperacionalizationLink createOperacionalizationLink();

	/**
	 * Returns a new object of class '<em>Domain Hypothesis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain Hypothesis</em>'.
	 * @generated
	 */
	DomainHypothesis createDomainHypothesis();

	/**
	 * Returns a new object of class '<em>Domain Invariant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain Invariant</em>'.
	 * @generated
	 */
	DomainInvariant createDomainInvariant();

	/**
	 * Returns a new object of class '<em>Resolution Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resolution Link</em>'.
	 * @generated
	 */
	ResolutionLink createResolutionLink();

	/**
	 * Returns a new object of class '<em>Responsability Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Responsability Link</em>'.
	 * @generated
	 */
	ResponsabilityLink createResponsabilityLink();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	KAOSModelPackage getKAOSModelPackage();

} //KAOSModelFactory
