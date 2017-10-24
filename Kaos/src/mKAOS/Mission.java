/**
 */
package mKAOS;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mission</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mKAOS.Mission#getPriority <em>Priority</em>}</li>
 *   <li>{@link mKAOS.Mission#getAssignedTo <em>Assigned To</em>}</li>
 *   <li>{@link mKAOS.Mission#getLinks <em>Links</em>}</li>
 *   <li>{@link mKAOS.Mission#getDescription <em>Description</em>}</li>
 *   <li>{@link mKAOS.Mission#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link mKAOS.Mission#getRefinement <em>Refinement</em>}</li>
 * </ul>
 *
 * @see mKAOS.MKAOSPackage#getMission()
 * @model
 * @generated
 */
public interface Mission extends mKAOS.Goal, FormalElement {
	/**
	 * Returns the value of the '<em><b>Trigger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trigger</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger</em>' containment reference.
	 * @see #setTrigger(DynBLTL)
	 * @see mKAOS.MKAOSPackage#getMission_Trigger()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DynBLTL getTrigger();

	/**
	 * Sets the value of the '{@link mKAOS.Mission#getTrigger <em>Trigger</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger</em>' containment reference.
	 * @see #getTrigger()
	 * @generated
	 */
	void setTrigger(DynBLTL value);

	/**
	 * Returns the value of the '<em><b>Refinement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refinement</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refinement</em>' containment reference.
	 * @see #setRefinement(MissionRefinement)
	 * @see mKAOS.MKAOSPackage#getMission_Refinement()
	 * @model containment="true"
	 * @generated
	 */
	MissionRefinement getRefinement();

	/**
	 * Sets the value of the '{@link mKAOS.Mission#getRefinement <em>Refinement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refinement</em>' containment reference.
	 * @see #getRefinement()
	 * @generated
	 */
	void setRefinement(MissionRefinement value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(int)
	 * @see mKAOS.MKAOSPackage#getMission_Priority()
	 * @model required="true"
	 * @generated
	 */
	int getPriority();

	/**
	 * Sets the value of the '{@link mKAOS.Mission#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(int value);

	/**
	 * Returns the value of the '<em><b>Assigned To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assigned To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assigned To</em>' reference.
	 * @see #setAssignedTo(ConstituentSystem)
	 * @see mKAOS.MKAOSPackage#getMission_AssignedTo()
	 * @model
	 * @generated
	 */
	ConstituentSystem getAssignedTo();

	/**
	 * Sets the value of the '{@link mKAOS.Mission#getAssignedTo <em>Assigned To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assigned To</em>' reference.
	 * @see #getAssignedTo()
	 * @generated
	 */
	void setAssignedTo(ConstituentSystem value);

	/**
	 * Returns the value of the '<em><b>Links</b></em>' containment reference list.
	 * The list contents are of type {@link mKAOS.MissionLink}.
	 * It is bidirectional and its opposite is '{@link mKAOS.MissionLink#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' containment reference list.
	 * @see mKAOS.MKAOSPackage#getMission_Links()
	 * @see mKAOS.MissionLink#getSource
	 * @model opposite="source" containment="true"
	 * @generated
	 */
	EList<MissionLink> getLinks();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see mKAOS.MKAOSPackage#getMission_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link mKAOS.Mission#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // Mission
