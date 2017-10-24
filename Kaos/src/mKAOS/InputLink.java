/**
 */
package mKAOS;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mKAOS.InputLink#getObjectInputOn <em>Object Input On</em>}</li>
 * </ul>
 *
 * @see mKAOS.MKAOSPackage#getInputLink()
 * @model
 * @generated
 */
public interface InputLink extends Link {
	/**
	 * Returns the value of the '<em><b>Object Input On</b></em>' reference list.
	 * The list contents are of type {@link mKAOS.Operation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Input On</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Input On</em>' reference list.
	 * @see mKAOS.MKAOSPackage#getInputLink_ObjectInputOn()
	 * @model required="true"
	 * @generated
	 */
	EList<Operation> getObjectInputOn();

} // InputLink
