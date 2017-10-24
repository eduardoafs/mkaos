/**
 */
package mKAOS;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Refinable Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mKAOS.RefinableNode#getRefinedBy <em>Refined By</em>}</li>
 * </ul>
 *
 * @see mKAOS.MKAOSPackage#getRefinableNode()
 * @model abstract="true"
 * @generated
 */
public interface RefinableNode extends Nodes {
	/**
	 * Returns the value of the '<em><b>Refined By</b></em>' reference list.
	 * The list contents are of type {@link mKAOS.Refinement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refined By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refined By</em>' reference list.
	 * @see mKAOS.MKAOSPackage#getRefinableNode_RefinedBy()
	 * @model required="true"
	 * @generated
	 */
	EList<Refinement> getRefinedBy();

} // RefinableNode
