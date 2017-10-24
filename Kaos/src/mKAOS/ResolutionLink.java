/**
 */
package mKAOS;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resolution Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mKAOS.ResolutionLink#getAssignObstacleTo <em>Assign Obstacle To</em>}</li>
 * </ul>
 *
 * @see mKAOS.MKAOSPackage#getResolutionLink()
 * @model
 * @generated
 */
public interface ResolutionLink extends Link {
	/**
	 * Returns the value of the '<em><b>Assign Obstacle To</b></em>' reference list.
	 * The list contents are of type {@link mKAOS.Requirement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assign Obstacle To</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assign Obstacle To</em>' reference list.
	 * @see mKAOS.MKAOSPackage#getResolutionLink_AssignObstacleTo()
	 * @model required="true"
	 * @generated
	 */
	EList<Requirement> getAssignObstacleTo();

} // ResolutionLink
