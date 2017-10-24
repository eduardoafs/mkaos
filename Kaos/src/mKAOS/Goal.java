/**
 */
package mKAOS;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Goal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mKAOS.Goal#getResolve <em>Resolve</em>}</li>
 *   <li>{@link mKAOS.Goal#getConflicts <em>Conflicts</em>}</li>
 *   <li>{@link mKAOS.Goal#getConcerns <em>Concerns</em>}</li>
 * </ul>
 *
 * @see mKAOS.MKAOSPackage#getGoal()
 * @model
 * @generated
 */
public interface Goal extends RefinableNode {
	/**
	 * Returns the value of the '<em><b>Resolve</b></em>' reference list.
	 * The list contents are of type {@link mKAOS.Obstacle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolve</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolve</em>' reference list.
	 * @see mKAOS.MKAOSPackage#getGoal_Resolve()
	 * @model required="true"
	 * @generated
	 */
	EList<Obstacle> getResolve();

	/**
	 * Returns the value of the '<em><b>Conflicts</b></em>' reference list.
	 * The list contents are of type {@link mKAOS.Goal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conflicts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conflicts</em>' reference list.
	 * @see mKAOS.MKAOSPackage#getGoal_Conflicts()
	 * @model required="true"
	 * @generated
	 */
	EList<Goal> getConflicts();

	/**
	 * Returns the value of the '<em><b>Concerns</b></em>' reference list.
	 * The list contents are of type {@link mKAOS.Object}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concerns</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concerns</em>' reference list.
	 * @see mKAOS.MKAOSPackage#getGoal_Concerns()
	 * @model required="true"
	 * @generated
	 */
	EList<mKAOS.Object> getConcerns();

} // Goal
