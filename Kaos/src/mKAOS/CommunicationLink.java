/**
 */
package mKAOS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Communication Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mKAOS.CommunicationLink#getCapability <em>Capability</em>}</li>
 *   <li>{@link mKAOS.CommunicationLink#getEntity <em>Entity</em>}</li>
 *   <li>{@link mKAOS.CommunicationLink#getCardinality <em>Cardinality</em>}</li>
 * </ul>
 *
 * @see mKAOS.MKAOSPackage#getCommunicationLink()
 * @model abstract="true"
 * @generated
 */
public interface CommunicationLink extends mKAOS.Link {
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
	 * @see mKAOS.MKAOSPackage#getCommunicationLink_Capability()
	 * @model required="true"
	 * @generated
	 */
	CommunicationalCapability getCapability();

	/**
	 * Sets the value of the '{@link mKAOS.CommunicationLink#getCapability <em>Capability</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capability</em>' reference.
	 * @see #getCapability()
	 * @generated
	 */
	void setCapability(CommunicationalCapability value);

	/**
	 * Returns the value of the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' reference.
	 * @see #setEntity(mKAOS.Entity)
	 * @see mKAOS.MKAOSPackage#getCommunicationLink_Entity()
	 * @model required="true"
	 * @generated
	 */
	mKAOS.Entity getEntity();

	/**
	 * Sets the value of the '{@link mKAOS.CommunicationLink#getEntity <em>Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity</em>' reference.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(mKAOS.Entity value);

	/**
	 * Returns the value of the '<em><b>Cardinality</b></em>' attribute.
	 * The default value is <code>"[1..1]"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cardinality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinality</em>' attribute.
	 * @see #setCardinality(String)
	 * @see mKAOS.MKAOSPackage#getCommunicationLink_Cardinality()
	 * @model default="[1..1]" required="true"
	 * @generated
	 */
	String getCardinality();

	/**
	 * Sets the value of the '{@link mKAOS.CommunicationLink#getCardinality <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality</em>' attribute.
	 * @see #getCardinality()
	 * @generated
	 */
	void setCardinality(String value);

} // CommunicationLink
