/**
 */
package mKAOS;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule Params</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mKAOS.RuleParams#getL <em>L</em>}</li>
 * </ul>
 *
 * @see mKAOS.MKAOSPackage#getRuleParams()
 * @model
 * @generated
 */
public interface RuleParams extends EObject {
	/**
	 * Returns the value of the '<em><b>L</b></em>' containment reference list.
	 * The list contents are of type {@link mKAOS.RuleVar}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>L</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>L</em>' containment reference list.
	 * @see mKAOS.MKAOSPackage#getRuleParams_L()
	 * @model containment="true"
	 * @generated
	 */
	EList<RuleVar> getL();

} // RuleParams
