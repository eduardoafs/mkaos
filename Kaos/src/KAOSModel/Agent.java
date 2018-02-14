/**
 */
package KAOSModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Agent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link KAOSModel.Agent#getPerforms <em>Performs</em>}</li>
 *   <li>{@link KAOSModel.Agent#getComposition <em>Composition</em>}</li>
 * </ul>
 *
 * @see KAOSModel.KAOSModelPackage#getAgent()
 * @model abstract="true"
 * @generated
 */
public interface Agent extends KAOSModel.Object {
	/**
	 * Returns the value of the '<em><b>Performs</b></em>' reference list.
	 * The list contents are of type {@link KAOSModel.Operation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Performs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Performs</em>' reference list.
	 * @see KAOSModel.KAOSModelPackage#getAgent_Performs()
	 * @model
	 * @generated
	 */
	EList<Operation> getPerforms();

	/**
	 * Returns the value of the '<em><b>Composition</b></em>' reference list.
	 * The list contents are of type {@link KAOSModel.Agent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composition</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composition</em>' reference list.
	 * @see KAOSModel.KAOSModelPackage#getAgent_Composition()
	 * @model
	 * @generated
	 */
	EList<Agent> getComposition();

} // Agent
