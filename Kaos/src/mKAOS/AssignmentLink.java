/**
 */
package mKAOS;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignment Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mKAOS.AssignmentLink#getAssignsGoalTo <em>Assigns Goal To</em>}</li>
 * </ul>
 *
 * @see mKAOS.MKAOSPackage#getAssignmentLink()
 * @model
 * @generated
 */
public interface AssignmentLink extends Link {
	/**
	 * Returns the value of the '<em><b>Assigns Goal To</b></em>' reference list.
	 * The list contents are of type {@link mKAOS.Agent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assigns Goal To</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assigns Goal To</em>' reference list.
	 * @see mKAOS.MKAOSPackage#getAssignmentLink_AssignsGoalTo()
	 * @model required="true"
	 * @generated
	 */
	EList<Agent> getAssignsGoalTo();

} // AssignmentLink
