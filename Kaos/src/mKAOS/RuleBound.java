/**
 */
package mKAOS;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule Bound</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mKAOS.RuleBound#getFloatlit <em>Floatlit</em>}</li>
 *   <li>{@link mKAOS.RuleBound#getIntegerlit <em>Integerlit</em>}</li>
 *   <li>{@link mKAOS.RuleBound#getE <em>E</em>}</li>
 * </ul>
 *
 * @see mKAOS.MKAOSPackage#getRuleBound()
 * @model
 * @generated
 */
public interface RuleBound extends EObject {
	/**
	 * Returns the value of the '<em><b>Floatlit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Floatlit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Floatlit</em>' attribute.
	 * @see #setFloatlit(float)
	 * @see mKAOS.MKAOSPackage#getRuleBound_Floatlit()
	 * @model
	 * @generated
	 */
	float getFloatlit();

	/**
	 * Sets the value of the '{@link mKAOS.RuleBound#getFloatlit <em>Floatlit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Floatlit</em>' attribute.
	 * @see #getFloatlit()
	 * @generated
	 */
	void setFloatlit(float value);

	/**
	 * Returns the value of the '<em><b>Integerlit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Integerlit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Integerlit</em>' attribute.
	 * @see #setIntegerlit(int)
	 * @see mKAOS.MKAOSPackage#getRuleBound_Integerlit()
	 * @model
	 * @generated
	 */
	int getIntegerlit();

	/**
	 * Sets the value of the '{@link mKAOS.RuleBound#getIntegerlit <em>Integerlit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Integerlit</em>' attribute.
	 * @see #getIntegerlit()
	 * @generated
	 */
	void setIntegerlit(int value);

	/**
	 * Returns the value of the '<em><b>E</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>E</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>E</em>' containment reference.
	 * @see #setE(DynBLTL)
	 * @see mKAOS.MKAOSPackage#getRuleBound_E()
	 * @model containment="true"
	 * @generated
	 */
	DynBLTL getE();

	/**
	 * Sets the value of the '{@link mKAOS.RuleBound#getE <em>E</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>E</em>' containment reference.
	 * @see #getE()
	 * @generated
	 */
	void setE(DynBLTL value);

} // RuleBound
