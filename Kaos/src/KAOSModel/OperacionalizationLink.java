/**
 */
package KAOSModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operacionalization Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link KAOSModel.OperacionalizationLink#getRelateOperationTo <em>Relate Operation To</em>}</li>
 * </ul>
 *
 * @see KAOSModel.KAOSModelPackage#getOperacionalizationLink()
 * @model
 * @generated
 */
public interface OperacionalizationLink extends Link {
	/**
	 * Returns the value of the '<em><b>Relate Operation To</b></em>' reference list.
	 * The list contents are of type {@link KAOSModel.Requirement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relate Operation To</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relate Operation To</em>' reference list.
	 * @see KAOSModel.KAOSModelPackage#getOperacionalizationLink_RelateOperationTo()
	 * @model required="true"
	 * @generated
	 */
	EList<Requirement> getRelateOperationTo();

} // OperacionalizationLink
