/**
 */
package KAOSModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Obstacle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link KAOSModel.Obstacle#getObstruct <em>Obstruct</em>}</li>
 * </ul>
 *
 * @see KAOSModel.KAOSModelPackage#getObstacle()
 * @model
 * @generated
 */
public interface Obstacle extends RefinableNode {
	/**
	 * Returns the value of the '<em><b>Obstruct</b></em>' reference list.
	 * The list contents are of type {@link KAOSModel.Goal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Obstruct</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Obstruct</em>' reference list.
	 * @see KAOSModel.KAOSModelPackage#getObstacle_Obstruct()
	 * @model required="true"
	 * @generated
	 */
	EList<Goal> getObstruct();

} // Obstacle
