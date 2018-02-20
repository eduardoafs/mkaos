/**
 */
package KAOSModel;

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
 *   <li>{@link KAOSModel.Goal#getResolve <em>Resolve</em>}</li>
 *   <li>{@link KAOSModel.Goal#getConflicts <em>Conflicts</em>}</li>
 *   <li>{@link KAOSModel.Goal#getConcerns <em>Concerns</em>}</li>
 *   <li>{@link KAOSModel.Goal#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see KAOSModel.KAOSModelPackage#getGoal()
 * @model
 * @generated
 */
public interface Goal extends RefinableNode {
	/**
	 * Returns the value of the '<em><b>Resolve</b></em>' reference list.
	 * The list contents are of type {@link KAOSModel.Obstacle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolve</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolve</em>' reference list.
	 * @see KAOSModel.KAOSModelPackage#getGoal_Resolve()
	 * @model
	 * @generated
	 */
	EList<Obstacle> getResolve();

	/**
	 * Returns the value of the '<em><b>Conflicts</b></em>' reference list.
	 * The list contents are of type {@link KAOSModel.Goal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conflicts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conflicts</em>' reference list.
	 * @see KAOSModel.KAOSModelPackage#getGoal_Conflicts()
	 * @model
	 * @generated
	 */
	EList<Goal> getConflicts();

	/**
	 * Returns the value of the '<em><b>Concerns</b></em>' reference list.
	 * The list contents are of type {@link KAOSModel.Object}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concerns</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concerns</em>' reference list.
	 * @see KAOSModel.KAOSModelPackage#getGoal_Concerns()
	 * @model
	 * @generated
	 */
	EList<KAOSModel.Object> getConcerns();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see KAOSModel.KAOSModelPackage#getGoal_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link KAOSModel.Goal#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // Goal
