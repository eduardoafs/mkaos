/**
 */
package mKAOS;

import KAOSModel.SoftwareAgent;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constituent System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mKAOS.ConstituentSystem#getCapableOf <em>Capable Of</em>}</li>
 * </ul>
 *
 * @see mKAOS.MKAOSPackage#getConstituentSystem()
 * @model
 * @generated
 */
public interface ConstituentSystem extends SoftwareAgent {
	/**
	 * Returns the value of the '<em><b>Capable Of</b></em>' reference list.
	 * The list contents are of type {@link mKAOS.OperationalCapability}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capable Of</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capable Of</em>' reference list.
	 * @see mKAOS.MKAOSPackage#getConstituentSystem_CapableOf()
	 * @model
	 * @generated
	 */
	EList<OperationalCapability> getCapableOf();

} // ConstituentSystem
