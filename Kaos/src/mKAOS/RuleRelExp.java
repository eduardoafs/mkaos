/**
 */
package mKAOS;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule Rel Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mKAOS.RuleRelExp#getL <em>L</em>}</li>
 *   <li>{@link mKAOS.RuleRelExp#getR <em>R</em>}</li>
 * </ul>
 *
 * @see mKAOS.MKAOSPackage#getRuleRelExp()
 * @model
 * @generated
 */
public interface RuleRelExp extends EObject {
	/**
	 * Returns the value of the '<em><b>L</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>L</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>L</em>' containment reference.
	 * @see #setL(RuleNumExp)
	 * @see mKAOS.MKAOSPackage#getRuleRelExp_L()
	 * @model containment="true"
	 * @generated
	 */
	RuleNumExp getL();

	/**
	 * Sets the value of the '{@link mKAOS.RuleRelExp#getL <em>L</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>L</em>' containment reference.
	 * @see #getL()
	 * @generated
	 */
	void setL(RuleNumExp value);

	/**
	 * Returns the value of the '<em><b>R</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>R</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>R</em>' containment reference.
	 * @see #setR(RuleNumExp)
	 * @see mKAOS.MKAOSPackage#getRuleRelExp_R()
	 * @model containment="true"
	 * @generated
	 */
	RuleNumExp getR();

	/**
	 * Sets the value of the '{@link mKAOS.RuleRelExp#getR <em>R</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>R</em>' containment reference.
	 * @see #getR()
	 * @generated
	 */
	void setR(RuleNumExp value);

} // RuleRelExp
