/**
 */
package mKAOS;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule Equality</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mKAOS.RuleEquality#isNeg <em>Neg</em>}</li>
 *   <li>{@link mKAOS.RuleEquality#getL <em>L</em>}</li>
 *   <li>{@link mKAOS.RuleEquality#getR <em>R</em>}</li>
 * </ul>
 *
 * @see mKAOS.MKAOSPackage#getRuleEquality()
 * @model
 * @generated
 */
public interface RuleEquality extends EObject {
	/**
	 * Returns the value of the '<em><b>Neg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Neg</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Neg</em>' attribute.
	 * @see #setNeg(boolean)
	 * @see mKAOS.MKAOSPackage#getRuleEquality_Neg()
	 * @model
	 * @generated
	 */
	boolean isNeg();

	/**
	 * Sets the value of the '{@link mKAOS.RuleEquality#isNeg <em>Neg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Neg</em>' attribute.
	 * @see #isNeg()
	 * @generated
	 */
	void setNeg(boolean value);

	/**
	 * Returns the value of the '<em><b>L</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>L</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>L</em>' containment reference.
	 * @see #setL(RuleRelExp)
	 * @see mKAOS.MKAOSPackage#getRuleEquality_L()
	 * @model containment="true"
	 * @generated
	 */
	RuleRelExp getL();

	/**
	 * Sets the value of the '{@link mKAOS.RuleEquality#getL <em>L</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>L</em>' containment reference.
	 * @see #getL()
	 * @generated
	 */
	void setL(RuleRelExp value);

	/**
	 * Returns the value of the '<em><b>R</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>R</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>R</em>' containment reference.
	 * @see #setR(RuleRelExp)
	 * @see mKAOS.MKAOSPackage#getRuleEquality_R()
	 * @model containment="true"
	 * @generated
	 */
	RuleRelExp getR();

	/**
	 * Sets the value of the '{@link mKAOS.RuleEquality#getR <em>R</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>R</em>' containment reference.
	 * @see #getR()
	 * @generated
	 */
	void setR(RuleRelExp value);

} // RuleEquality
