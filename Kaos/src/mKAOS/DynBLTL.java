/**
 */
package mKAOS;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dyn BLTL</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mKAOS.DynBLTL#getQ <em>Q</em>}</li>
 *   <li>{@link mKAOS.DynBLTL#getVal <em>Val</em>}</li>
 *   <li>{@link mKAOS.DynBLTL#getC <em>C</em>}</li>
 *   <li>{@link mKAOS.DynBLTL#getT <em>T</em>}</li>
 * </ul>
 *
 * @see mKAOS.MKAOSPackage#getDynBLTL()
 * @model
 * @generated
 */
public interface DynBLTL extends EObject {
	/**
	 * Returns the value of the '<em><b>Q</b></em>' attribute.
	 * The literals are from the enumeration {@link mKAOS.RuleQuantifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Q</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Q</em>' attribute.
	 * @see mKAOS.RuleQuantifier
	 * @see #setQ(RuleQuantifier)
	 * @see mKAOS.MKAOSPackage#getDynBLTL_Q()
	 * @model
	 * @generated
	 */
	RuleQuantifier getQ();

	/**
	 * Sets the value of the '{@link mKAOS.DynBLTL#getQ <em>Q</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Q</em>' attribute.
	 * @see mKAOS.RuleQuantifier
	 * @see #getQ()
	 * @generated
	 */
	void setQ(RuleQuantifier value);

	/**
	 * Returns the value of the '<em><b>Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Val</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Val</em>' attribute.
	 * @see #setVal(String)
	 * @see mKAOS.MKAOSPackage#getDynBLTL_Val()
	 * @model
	 * @generated
	 */
	String getVal();

	/**
	 * Sets the value of the '{@link mKAOS.DynBLTL#getVal <em>Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Val</em>' attribute.
	 * @see #getVal()
	 * @generated
	 */
	void setVal(String value);

	/**
	 * Returns the value of the '<em><b>C</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>C</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>C</em>' containment reference.
	 * @see #setC(RuleFunction)
	 * @see mKAOS.MKAOSPackage#getDynBLTL_C()
	 * @model containment="true"
	 * @generated
	 */
	RuleFunction getC();

	/**
	 * Sets the value of the '{@link mKAOS.DynBLTL#getC <em>C</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>C</em>' containment reference.
	 * @see #getC()
	 * @generated
	 */
	void setC(RuleFunction value);

	/**
	 * Returns the value of the '<em><b>T</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>T</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>T</em>' containment reference.
	 * @see #setT(RuleTemporal)
	 * @see mKAOS.MKAOSPackage#getDynBLTL_T()
	 * @model containment="true"
	 * @generated
	 */
	RuleTemporal getT();

	/**
	 * Sets the value of the '{@link mKAOS.DynBLTL#getT <em>T</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>T</em>' containment reference.
	 * @see #getT()
	 * @generated
	 */
	void setT(RuleTemporal value);

} // DynBLTL
