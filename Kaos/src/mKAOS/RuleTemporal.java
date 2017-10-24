/**
 */
package mKAOS;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule Temporal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mKAOS.RuleTemporal#getVal1 <em>Val1</em>}</li>
 *   <li>{@link mKAOS.RuleTemporal#getB <em>B</em>}</li>
 *   <li>{@link mKAOS.RuleTemporal#getE <em>E</em>}</li>
 *   <li>{@link mKAOS.RuleTemporal#getO <em>O</em>}</li>
 *   <li>{@link mKAOS.RuleTemporal#getO1 <em>O1</em>}</li>
 * </ul>
 *
 * @see mKAOS.MKAOSPackage#getRuleTemporal()
 * @model
 * @generated
 */
public interface RuleTemporal extends DynBLTL {
	/**
	 * Returns the value of the '<em><b>Val1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Val1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Val1</em>' containment reference.
	 * @see #setVal1(RuleImplication)
	 * @see mKAOS.MKAOSPackage#getRuleTemporal_Val1()
	 * @model containment="true"
	 * @generated
	 */
	RuleImplication getVal1();

	/**
	 * Sets the value of the '{@link mKAOS.RuleTemporal#getVal1 <em>Val1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Val1</em>' containment reference.
	 * @see #getVal1()
	 * @generated
	 */
	void setVal1(RuleImplication value);

	/**
	 * Returns the value of the '<em><b>B</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>B</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>B</em>' containment reference.
	 * @see #setB(RuleBound)
	 * @see mKAOS.MKAOSPackage#getRuleTemporal_B()
	 * @model containment="true"
	 * @generated
	 */
	RuleBound getB();

	/**
	 * Sets the value of the '{@link mKAOS.RuleTemporal#getB <em>B</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>B</em>' containment reference.
	 * @see #getB()
	 * @generated
	 */
	void setB(RuleBound value);

	/**
	 * Returns the value of the '<em><b>E</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>E</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>E</em>' containment reference.
	 * @see #setE(DynBLTL)
	 * @see mKAOS.MKAOSPackage#getRuleTemporal_E()
	 * @model containment="true"
	 * @generated
	 */
	DynBLTL getE();

	/**
	 * Sets the value of the '{@link mKAOS.RuleTemporal#getE <em>E</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>E</em>' containment reference.
	 * @see #getE()
	 * @generated
	 */
	void setE(DynBLTL value);

	/**
	 * Returns the value of the '<em><b>O</b></em>' attribute.
	 * The literals are from the enumeration {@link mKAOS.RuleTempBinOp}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>O</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>O</em>' attribute.
	 * @see mKAOS.RuleTempBinOp
	 * @see #setO(RuleTempBinOp)
	 * @see mKAOS.MKAOSPackage#getRuleTemporal_O()
	 * @model
	 * @generated
	 */
	RuleTempBinOp getO();

	/**
	 * Sets the value of the '{@link mKAOS.RuleTemporal#getO <em>O</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>O</em>' attribute.
	 * @see mKAOS.RuleTempBinOp
	 * @see #getO()
	 * @generated
	 */
	void setO(RuleTempBinOp value);

	/**
	 * Returns the value of the '<em><b>O1</b></em>' attribute.
	 * The literals are from the enumeration {@link mKAOS.RuleTempUnOp}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>O1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>O1</em>' attribute.
	 * @see mKAOS.RuleTempUnOp
	 * @see #setO1(RuleTempUnOp)
	 * @see mKAOS.MKAOSPackage#getRuleTemporal_O1()
	 * @model
	 * @generated
	 */
	RuleTempUnOp getO1();

	/**
	 * Sets the value of the '{@link mKAOS.RuleTemporal#getO1 <em>O1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>O1</em>' attribute.
	 * @see mKAOS.RuleTempUnOp
	 * @see #getO1()
	 * @generated
	 */
	void setO1(RuleTempUnOp value);

} // RuleTemporal
