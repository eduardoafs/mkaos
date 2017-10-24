/**
 */
package KAOSModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Obstruction Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link KAOSModel.ObstructionLink#getRelateKGoalTo <em>Relate KGoal To</em>}</li>
 * </ul>
 *
 * @see KAOSModel.KAOSModelPackage#getObstructionLink()
 * @model
 * @generated
 */
public interface ObstructionLink extends Link {
	/**
	 * Returns the value of the '<em><b>Relate KGoal To</b></em>' reference list.
	 * The list contents are of type {@link KAOSModel.Obstacle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relate KGoal To</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relate KGoal To</em>' reference list.
	 * @see KAOSModel.KAOSModelPackage#getObstructionLink_RelateKGoalTo()
	 * @model required="true"
	 * @generated
	 */
	EList<Obstacle> getRelateKGoalTo();

} // ObstructionLink
