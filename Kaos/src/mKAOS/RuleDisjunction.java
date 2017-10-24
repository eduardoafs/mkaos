/**
 */
package mKAOS;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule Disjunction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mKAOS.RuleDisjunction#getL <em>L</em>}</li>
 *   <li>{@link mKAOS.RuleDisjunction#getR <em>R</em>}</li>
 * </ul>
 *
 * @see mKAOS.MKAOSPackage#getRuleDisjunction()
 * @model
 * @generated
 */
public interface RuleDisjunction extends EObject {
	/**
	 * Returns the value of the '<em><b>L</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>L</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>L</em>' containment reference.
	 * @see #setL(RuleConjunction)
	 * @see mKAOS.MKAOSPackage#getRuleDisjunction_L()
	 * @model containment="true"
	 * @generated
	 */
	RuleConjunction getL();

	/**
	 * Sets the value of the '{@link mKAOS.RuleDisjunction#getL <em>L</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>L</em>' containment reference.
	 * @see #getL()
	 * @generated
	 */
	void setL(RuleConjunction value);

	/**
	 * Returns the value of the '<em><b>R</b></em>' containment reference list.
	 * The list contents are of type {@link mKAOS.RuleConjunction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>R</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>R</em>' containment reference list.
	 * @see mKAOS.MKAOSPackage#getRuleDisjunction_R()
	 * @model containment="true"
	 * @generated
	 */
	EList<RuleConjunction> getR();

} // RuleDisjunction
