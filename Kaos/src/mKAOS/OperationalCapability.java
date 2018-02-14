/**
 */
package mKAOS;

import KAOSModel.Operation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operational Capability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mKAOS.OperationalCapability#getDesc <em>Desc</em>}</li>
 * </ul>
 *
 * @see mKAOS.MKAOSPackage#getOperationalCapability()
 * @model
 * @generated
 */
public interface OperationalCapability extends Operation {
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
	 * @see mKAOS.MKAOSPackage#getOperationalCapability_Desc()
	 * @model
	 * @generated
	 */
	String getDesc();

	/**
	 * Sets the value of the '{@link mKAOS.OperationalCapability#getDesc <em>Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Desc</em>' attribute.
	 * @see #getDesc()
	 * @generated
	 */
	void setDesc(String value);

} // OperationalCapability
