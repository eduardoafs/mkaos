/**
 */
package mKAOS;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Formal Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mKAOS.FormalElement#getRule <em>Rule</em>}</li>
 * </ul>
 *
 * @see mKAOS.MKAOSPackage#getFormalElement()
 * @model abstract="true"
 * @generated
 */
public interface FormalElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule</em>' containment reference.
	 * @see #setRule(DynBLTL)
	 * @see mKAOS.MKAOSPackage#getFormalElement_Rule()
	 * @model containment="true"
	 * @generated
	 */
	DynBLTL getRule();

	/**
	 * Sets the value of the '{@link mKAOS.FormalElement#getRule <em>Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule</em>' containment reference.
	 * @see #getRule()
	 * @generated
	 */
	void setRule(DynBLTL value);

} // FormalElement
