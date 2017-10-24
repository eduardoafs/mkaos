/**
 */
package mKAOS;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule Seq Lit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mKAOS.RuleSeqLit#getVals <em>Vals</em>}</li>
 * </ul>
 *
 * @see mKAOS.MKAOSPackage#getRuleSeqLit()
 * @model
 * @generated
 */
public interface RuleSeqLit extends RuleLiteral {
	/**
	 * Returns the value of the '<em><b>Vals</b></em>' containment reference list.
	 * The list contents are of type {@link mKAOS.RuleLiteral}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vals</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vals</em>' containment reference list.
	 * @see mKAOS.MKAOSPackage#getRuleSeqLit_Vals()
	 * @model containment="true"
	 * @generated
	 */
	EList<RuleLiteral> getVals();

} // RuleSeqLit
