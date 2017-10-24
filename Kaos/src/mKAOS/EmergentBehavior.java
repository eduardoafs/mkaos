/**
 */
package mKAOS;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Emergent Behavior</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mKAOS.EmergentBehavior#getRelatedTo <em>Related To</em>}</li>
 * </ul>
 *
 * @see mKAOS.MKAOSPackage#getEmergentBehavior()
 * @model
 * @generated
 */
public interface EmergentBehavior extends mKAOS.Nodes {
	/**
	 * Returns the value of the '<em><b>Related To</b></em>' reference list.
	 * The list contents are of type {@link mKAOS.Mission}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related To</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related To</em>' reference list.
	 * @see mKAOS.MKAOSPackage#getEmergentBehavior_RelatedTo()
	 * @model required="true"
	 * @generated
	 */
	EList<Mission> getRelatedTo();

} // EmergentBehavior
