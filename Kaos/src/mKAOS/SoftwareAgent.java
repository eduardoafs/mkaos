/**
 */
package mKAOS;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Software Agent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mKAOS.SoftwareAgent#getResponsibleFor <em>Responsible For</em>}</li>
 * </ul>
 *
 * @see mKAOS.MKAOSPackage#getSoftwareAgent()
 * @model
 * @generated
 */
public interface SoftwareAgent extends Agent {
	/**
	 * Returns the value of the '<em><b>Responsible For</b></em>' reference list.
	 * The list contents are of type {@link mKAOS.Requirement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Responsible For</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsible For</em>' reference list.
	 * @see mKAOS.MKAOSPackage#getSoftwareAgent_ResponsibleFor()
	 * @model required="true"
	 * @generated
	 */
	EList<Requirement> getResponsibleFor();

} // SoftwareAgent
