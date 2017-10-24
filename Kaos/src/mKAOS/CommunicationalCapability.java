/**
 */
package mKAOS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Communicational Capability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mKAOS.CommunicationalCapability#getDesc <em>Desc</em>}</li>
 * </ul>
 *
 * @see mKAOS.MKAOSPackage#getCommunicationalCapability()
 * @model
 * @generated
 */
public interface CommunicationalCapability extends mKAOS.Operation {

	/**
	 * Returns the value of the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Desc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Desc</em>' attribute.
	 * @see #setDesc(String)
	 * @see mKAOS.MKAOSPackage#getCommunicationalCapability_Desc()
	 * @model
	 * @generated
	 */
	String getDesc();

	/**
	 * Sets the value of the '{@link mKAOS.CommunicationalCapability#getDesc <em>Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Desc</em>' attribute.
	 * @see #getDesc()
	 * @generated
	 */
	void setDesc(String value);
} // CommunicationalCapability
