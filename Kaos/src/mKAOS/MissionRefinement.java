/**
 */
package mKAOS;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mission Refinement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mKAOS.MissionRefinement#getKind <em>Kind</em>}</li>
 *   <li>{@link mKAOS.MissionRefinement#getCustom <em>Custom</em>}</li>
 *   <li>{@link mKAOS.MissionRefinement#getSubmissions <em>Submissions</em>}</li>
 * </ul>
 *
 * @see mKAOS.MKAOSPackage#getMissionRefinement()
 * @model
 * @generated
 */
public interface MissionRefinement extends mKAOS.Refinement {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The default value is <code>"custom"</code>.
	 * The literals are from the enumeration {@link mKAOS.MissionRefinementKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see mKAOS.MissionRefinementKind
	 * @see #setKind(MissionRefinementKind)
	 * @see mKAOS.MKAOSPackage#getMissionRefinement_Kind()
	 * @model default="custom" required="true"
	 * @generated
	 */
	MissionRefinementKind getKind();

	/**
	 * Sets the value of the '{@link mKAOS.MissionRefinement#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see mKAOS.MissionRefinementKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(MissionRefinementKind value);

	/**
	 * Returns the value of the '<em><b>Custom</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom</em>' containment reference.
	 * @see #setCustom(DynBLTL)
	 * @see mKAOS.MKAOSPackage#getMissionRefinement_Custom()
	 * @model containment="true"
	 * @generated
	 */
	DynBLTL getCustom();

	/**
	 * Sets the value of the '{@link mKAOS.MissionRefinement#getCustom <em>Custom</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom</em>' containment reference.
	 * @see #getCustom()
	 * @generated
	 */
	void setCustom(DynBLTL value);

	/**
	 * Returns the value of the '<em><b>Submissions</b></em>' containment reference list.
	 * The list contents are of type {@link mKAOS.Mission}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Submissions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Submissions</em>' containment reference list.
	 * @see mKAOS.MKAOSPackage#getMissionRefinement_Submissions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Mission> getSubmissions();

} // MissionRefinement
