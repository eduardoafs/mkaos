/**
 */
package KAOSModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link KAOSModel.DomainProperty#getUsedIn <em>Used In</em>}</li>
 * </ul>
 *
 * @see KAOSModel.KAOSModelPackage#getDomainProperty()
 * @model
 * @generated
 */
public interface DomainProperty extends Goal {
	/**
	 * Returns the value of the '<em><b>Used In</b></em>' reference list.
	 * The list contents are of type {@link KAOSModel.Refinement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Used In</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Used In</em>' reference list.
	 * @see KAOSModel.KAOSModelPackage#getDomainProperty_UsedIn()
	 * @model required="true"
	 * @generated
	 */
	EList<Refinement> getUsedIn();

} // DomainProperty
