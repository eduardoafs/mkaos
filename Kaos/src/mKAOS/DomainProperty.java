/**
 */
package mKAOS;

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
 *   <li>{@link mKAOS.DomainProperty#getUsedIn <em>Used In</em>}</li>
 * </ul>
 *
 * @see mKAOS.MKAOSPackage#getDomainProperty()
 * @model
 * @generated
 */
public interface DomainProperty extends Goal {
	/**
	 * Returns the value of the '<em><b>Used In</b></em>' reference list.
	 * The list contents are of type {@link mKAOS.Refinement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Used In</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Used In</em>' reference list.
	 * @see mKAOS.MKAOSPackage#getDomainProperty_UsedIn()
	 * @model required="true"
	 * @generated
	 */
	EList<Refinement> getUsedIn();

} // DomainProperty
