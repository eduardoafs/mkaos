/**
 */
package mKAOS;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule Factor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mKAOS.RuleFactor#getVallit <em>Vallit</em>}</li>
 *   <li>{@link mKAOS.RuleFactor#getValvar <em>Valvar</em>}</li>
 *   <li>{@link mKAOS.RuleFactor#getValfun <em>Valfun</em>}</li>
 *   <li>{@link mKAOS.RuleFactor#getCurl <em>Curl</em>}</li>
 *   <li>{@link mKAOS.RuleFactor#getPar <em>Par</em>}</li>
 * </ul>
 *
 * @see mKAOS.MKAOSPackage#getRuleFactor()
 * @model
 * @generated
 */
public interface RuleFactor extends EObject {
	/**
	 * Returns the value of the '<em><b>Vallit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vallit</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vallit</em>' containment reference.
	 * @see #setVallit(RuleLiteral)
	 * @see mKAOS.MKAOSPackage#getRuleFactor_Vallit()
	 * @model containment="true"
	 * @generated
	 */
	RuleLiteral getVallit();

	/**
	 * Sets the value of the '{@link mKAOS.RuleFactor#getVallit <em>Vallit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vallit</em>' containment reference.
	 * @see #getVallit()
	 * @generated
	 */
	void setVallit(RuleLiteral value);

	/**
	 * Returns the value of the '<em><b>Valvar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valvar</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valvar</em>' containment reference.
	 * @see #setValvar(RuleVar)
	 * @see mKAOS.MKAOSPackage#getRuleFactor_Valvar()
	 * @model containment="true"
	 * @generated
	 */
	RuleVar getValvar();

	/**
	 * Sets the value of the '{@link mKAOS.RuleFactor#getValvar <em>Valvar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valvar</em>' containment reference.
	 * @see #getValvar()
	 * @generated
	 */
	void setValvar(RuleVar value);

	/**
	 * Returns the value of the '<em><b>Valfun</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valfun</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valfun</em>' containment reference.
	 * @see #setValfun(RuleFunction)
	 * @see mKAOS.MKAOSPackage#getRuleFactor_Valfun()
	 * @model containment="true"
	 * @generated
	 */
	RuleFunction getValfun();

	/**
	 * Sets the value of the '{@link mKAOS.RuleFactor#getValfun <em>Valfun</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valfun</em>' containment reference.
	 * @see #getValfun()
	 * @generated
	 */
	void setValfun(RuleFunction value);

	/**
	 * Returns the value of the '<em><b>Curl</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Curl</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Curl</em>' containment reference.
	 * @see #setCurl(DynBLTL)
	 * @see mKAOS.MKAOSPackage#getRuleFactor_Curl()
	 * @model containment="true"
	 * @generated
	 */
	DynBLTL getCurl();

	/**
	 * Sets the value of the '{@link mKAOS.RuleFactor#getCurl <em>Curl</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Curl</em>' containment reference.
	 * @see #getCurl()
	 * @generated
	 */
	void setCurl(DynBLTL value);

	/**
	 * Returns the value of the '<em><b>Par</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Par</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Par</em>' containment reference.
	 * @see #setPar(DynBLTL)
	 * @see mKAOS.MKAOSPackage#getRuleFactor_Par()
	 * @model containment="true"
	 * @generated
	 */
	DynBLTL getPar();

	/**
	 * Sets the value of the '{@link mKAOS.RuleFactor#getPar <em>Par</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Par</em>' containment reference.
	 * @see #getPar()
	 * @generated
	 */
	void setPar(DynBLTL value);

} // RuleFactor
