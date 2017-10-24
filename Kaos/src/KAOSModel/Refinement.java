/**
 */
package KAOSModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Refinement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link KAOSModel.Refinement#getRefines <em>Refines</em>}</li>
 * </ul>
 *
 * @see KAOSModel.KAOSModelPackage#getRefinement()
 * @model
 * @generated
 */
public interface Refinement extends Link {
	/**
	 * Returns the value of the '<em><b>Refines</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refines</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refines</em>' reference.
	 * @see #setRefines(RefinableNode)
	 * @see KAOSModel.KAOSModelPackage#getRefinement_Refines()
	 * @model required="true"
	 * @generated
	 */
	RefinableNode getRefines();

	/**
	 * Sets the value of the '{@link KAOSModel.Refinement#getRefines <em>Refines</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refines</em>' reference.
	 * @see #getRefines()
	 * @generated
	 */
	void setRefines(RefinableNode value);

} // Refinement
