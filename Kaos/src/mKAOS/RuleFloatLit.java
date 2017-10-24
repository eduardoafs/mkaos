/**
 */
package mKAOS;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule Float Lit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mKAOS.RuleFloatLit#getVal <em>Val</em>}</li>
 * </ul>
 *
 * @see mKAOS.MKAOSPackage#getRuleFloatLit()
 * @model
 * @generated
 */
public interface RuleFloatLit extends RuleLiteral {
	/**
	 * Returns the value of the '<em><b>Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Val</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Val</em>' attribute.
	 * @see #setVal(float)
	 * @see mKAOS.MKAOSPackage#getRuleFloatLit_Val()
	 * @model
	 * @generated
	 */
	float getVal();

	/**
	 * Sets the value of the '{@link mKAOS.RuleFloatLit#getVal <em>Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Val</em>' attribute.
	 * @see #getVal()
	 * @generated
	 */
	void setVal(float value);

} // RuleFloatLit
