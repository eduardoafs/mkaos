/**
 */
package mKAOS;

import KAOSModel.Link;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mission Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mKAOS.MissionLink#getSource <em>Source</em>}</li>
 *   <li>{@link mKAOS.MissionLink#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see mKAOS.MKAOSPackage#getMissionLink()
 * @model abstract="true"
 * @generated
 */
public interface MissionLink extends Link {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link mKAOS.Mission#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' container reference.
	 * @see #setSource(Mission)
	 * @see mKAOS.MKAOSPackage#getMissionLink_Source()
	 * @see mKAOS.Mission#getLinks
	 * @model opposite="links" transient="false"
	 * @generated
	 */
	Mission getSource();

	/**
	 * Sets the value of the '{@link mKAOS.MissionLink#getSource <em>Source</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' container reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Mission value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Mission)
	 * @see mKAOS.MKAOSPackage#getMissionLink_Target()
	 * @model
	 * @generated
	 */
	Mission getTarget();

	/**
	 * Sets the value of the '{@link mKAOS.MissionLink#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Mission value);

} // MissionLink
