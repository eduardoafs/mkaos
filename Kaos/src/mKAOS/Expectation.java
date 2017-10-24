/**
 */
package mKAOS;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expectation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mKAOS.Expectation#getAssignedTo <em>Assigned To</em>}</li>
 * </ul>
 *
 * @see mKAOS.MKAOSPackage#getExpectation()
 * @model
 * @generated
 */
public interface Expectation extends Goal {
	/**
	 * Returns the value of the '<em><b>Assigned To</b></em>' reference list.
	 * The list contents are of type {@link mKAOS.EnvironmentAgent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assigned To</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assigned To</em>' reference list.
	 * @see mKAOS.MKAOSPackage#getExpectation_AssignedTo()
	 * @model required="true"
	 * @generated
	 */
	EList<EnvironmentAgent> getAssignedTo();

} // Expectation
