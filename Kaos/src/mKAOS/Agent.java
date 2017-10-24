/**
 */
package mKAOS;

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
 *   <li>{@link mKAOS.Agent#getPerforms <em>Performs</em>}</li>
 *   <li>{@link mKAOS.Agent#getComposition <em>Composition</em>}</li>
 * </ul>
 *
 * @see mKAOS.MKAOSPackage#getAgent()
 * @model abstract="true"
 * @generated
 */
public interface Agent extends mKAOS.Object {
	/**
	 * Returns the value of the '<em><b>Performs</b></em>' reference list.
	 * The list contents are of type {@link mKAOS.Operation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Performs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Performs</em>' reference list.
	 * @see mKAOS.MKAOSPackage#getAgent_Performs()
	 * @model required="true"
	 * @generated
	 */
	EList<Operation> getPerforms();

	/**
	 * Returns the value of the '<em><b>Composition</b></em>' reference list.
	 * The list contents are of type {@link mKAOS.Agent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composition</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composition</em>' reference list.
	 * @see mKAOS.MKAOSPackage#getAgent_Composition()
	 * @model
	 * @generated
	 */
	EList<Agent> getComposition();

} // Agent
