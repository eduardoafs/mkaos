/**
 */
package mKAOS;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule Tuple Lit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mKAOS.RuleTupleLit#getVals <em>Vals</em>}</li>
 * </ul>
 *
 * @see mKAOS.MKAOSPackage#getRuleTupleLit()
 * @model
 * @generated
 */
public interface RuleTupleLit extends RuleLiteral {
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
	 * @see mKAOS.MKAOSPackage#getRuleTupleLit_Vals()
	 * @model containment="true"
	 * @generated
	 */
	EList<RuleLiteral> getVals();

} // RuleTupleLit
