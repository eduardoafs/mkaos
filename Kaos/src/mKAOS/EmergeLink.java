/**
 */
package mKAOS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Emerge Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mKAOS.EmergeLink#getBehavior <em>Behavior</em>}</li>
 *   <li>{@link mKAOS.EmergeLink#getCapability <em>Capability</em>}</li>
 *   <li>{@link mKAOS.EmergeLink#getCardinality <em>Cardinality</em>}</li>
 * </ul>
 *
 * @see mKAOS.MKAOSPackage#getEmergeLink()
 * @model
 * @generated
 */
public interface EmergeLink extends mKAOS.Link {
	/**
	 * Returns the value of the '<em><b>Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behavior</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behavior</em>' reference.
	 * @see #setBehavior(EmergentBehavior)
	 * @see mKAOS.MKAOSPackage#getEmergeLink_Behavior()
	 * @model required="true"
	 * @generated
	 */
	EmergentBehavior getBehavior();

	/**
	 * Sets the value of the '{@link mKAOS.EmergeLink#getBehavior <em>Behavior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behavior</em>' reference.
	 * @see #getBehavior()
	 * @generated
	 */
	void setBehavior(EmergentBehavior value);

	/**
	 * Returns the value of the '<em><b>Capability</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capability</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capability</em>' reference.
	 * @see #setCapability(CommunicationalCapability)
	 * @see mKAOS.MKAOSPackage#getEmergeLink_Capability()
	 * @model required="true"
	 * @generated
	 */
	CommunicationalCapability getCapability();

	/**
	 * Sets the value of the '{@link mKAOS.EmergeLink#getCapability <em>Capability</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capability</em>' reference.
	 * @see #getCapability()
	 * @generated
	 */
	void setCapability(CommunicationalCapability value);

	/**
	 * Returns the value of the '<em><b>Cardinality</b></em>' attribute.
	 * The default value is <code>"[1..*]"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cardinality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinality</em>' attribute.
	 * @see #setCardinality(String)
	 * @see mKAOS.MKAOSPackage#getEmergeLink_Cardinality()
	 * @model default="[1..*]" required="true"
	 * @generated
	 */
	String getCardinality();

	/**
	 * Sets the value of the '{@link mKAOS.EmergeLink#getCardinality <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality</em>' attribute.
	 * @see #getCardinality()
	 * @generated
	 */
	void setCardinality(String value);

} // EmergeLink
