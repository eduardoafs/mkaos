/**
 */
package mKAOS;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule Var</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mKAOS.RuleVar#getVal <em>Val</em>}</li>
 *   <li>{@link mKAOS.RuleVar#getI <em>I</em>}</li>
 * </ul>
 *
 * @see mKAOS.MKAOSPackage#getRuleVar()
 * @model
 * @generated
 */
public interface RuleVar extends EObject {
	/**
	 * Returns the value of the '<em><b>Val</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Val</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Val</em>' attribute list.
	 * @see mKAOS.MKAOSPackage#getRuleVar_Val()
	 * @model
	 * @generated
	 */
	EList<String> getVal();

	/**
	 * Returns the value of the '<em><b>I</b></em>' containment reference list.
	 * The list contents are of type {@link mKAOS.RuleNumExp}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>I</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>I</em>' containment reference list.
	 * @see mKAOS.MKAOSPackage#getRuleVar_I()
	 * @model containment="true"
	 * @generated
	 */
	EList<RuleNumExp> getI();

} // RuleVar
