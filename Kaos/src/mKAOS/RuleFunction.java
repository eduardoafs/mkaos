/**
 */
package mKAOS;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mKAOS.RuleFunction#getL <em>L</em>}</li>
 * </ul>
 *
 * @see mKAOS.MKAOSPackage#getRuleFunction()
 * @model
 * @generated
 */
public interface RuleFunction extends EObject {
	/**
	 * Returns the value of the '<em><b>L</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>L</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>L</em>' containment reference.
	 * @see #setL(RuleParams)
	 * @see mKAOS.MKAOSPackage#getRuleFunction_L()
	 * @model containment="true"
	 * @generated
	 */
	RuleParams getL();

	/**
	 * Sets the value of the '{@link mKAOS.RuleFunction#getL <em>L</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>L</em>' containment reference.
	 * @see #getL()
	 * @generated
	 */
	void setL(RuleParams value);

} // RuleFunction
