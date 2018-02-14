/**
 */
package mKAOS;

import KAOSModel.Entity;
import KAOSModel.Expectation;
import KAOSModel.Link;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Influence Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mKAOS.InfluenceLink#getExpectation <em>Expectation</em>}</li>
 *   <li>{@link mKAOS.InfluenceLink#getInfluenced <em>Influenced</em>}</li>
 * </ul>
 *
 * @see mKAOS.MKAOSPackage#getInfluenceLink()
 * @model
 * @generated
 */
public interface InfluenceLink extends Link {
	/**
	 * Returns the value of the '<em><b>Expectation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expectation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expectation</em>' reference.
	 * @see #setExpectation(Expectation)
	 * @see mKAOS.MKAOSPackage#getInfluenceLink_Expectation()
	 * @model keys="name"
	 * @generated
	 */
	Expectation getExpectation();

	/**
	 * Sets the value of the '{@link mKAOS.InfluenceLink#getExpectation <em>Expectation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expectation</em>' reference.
	 * @see #getExpectation()
	 * @generated
	 */
	void setExpectation(Expectation value);

	/**
	 * Returns the value of the '<em><b>Influenced</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Influenced</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Influenced</em>' reference.
	 * @see #setInfluenced(Entity)
	 * @see mKAOS.MKAOSPackage#getInfluenceLink_Influenced()
	 * @model
	 * @generated
	 */
	Entity getInfluenced();

	/**
	 * Sets the value of the '{@link mKAOS.InfluenceLink#getInfluenced <em>Influenced</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Influenced</em>' reference.
	 * @see #getInfluenced()
	 * @generated
	 */
	void setInfluenced(Entity value);

} // InfluenceLink
