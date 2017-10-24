/**
 */
package KAOSModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Responsability Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link KAOSModel.ResponsabilityLink#getAssignAgentTo <em>Assign Agent To</em>}</li>
 * </ul>
 *
 * @see KAOSModel.KAOSModelPackage#getResponsabilityLink()
 * @model
 * @generated
 */
public interface ResponsabilityLink extends Link {
	/**
	 * Returns the value of the '<em><b>Assign Agent To</b></em>' reference list.
	 * The list contents are of type {@link KAOSModel.Requirement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assign Agent To</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assign Agent To</em>' reference list.
	 * @see KAOSModel.KAOSModelPackage#getResponsabilityLink_AssignAgentTo()
	 * @model required="true"
	 * @generated
	 */
	EList<Requirement> getAssignAgentTo();

} // ResponsabilityLink
