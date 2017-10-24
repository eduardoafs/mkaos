/**
 */
package mKAOS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composition Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mKAOS.CompositionLink#getEntity <em>Entity</em>}</li>
 *   <li>{@link mKAOS.CompositionLink#getComposedBy <em>Composed By</em>}</li>
 * </ul>
 *
 * @see mKAOS.MKAOSPackage#getCompositionLink()
 * @model
 * @generated
 */
public interface CompositionLink extends mKAOS.Link {
	/**
	 * Returns the value of the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' reference.
	 * @see #setEntity(mKAOS.Entity)
	 * @see mKAOS.MKAOSPackage#getCompositionLink_Entity()
	 * @model keys="name"
	 * @generated
	 */
	mKAOS.Entity getEntity();

	/**
	 * Sets the value of the '{@link mKAOS.CompositionLink#getEntity <em>Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity</em>' reference.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(mKAOS.Entity value);

	/**
	 * Returns the value of the '<em><b>Composed By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composed By</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composed By</em>' reference.
	 * @see #setComposedBy(mKAOS.Entity)
	 * @see mKAOS.MKAOSPackage#getCompositionLink_ComposedBy()
	 * @model keys="name"
	 * @generated
	 */
	mKAOS.Entity getComposedBy();

	/**
	 * Sets the value of the '{@link mKAOS.CompositionLink#getComposedBy <em>Composed By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Composed By</em>' reference.
	 * @see #getComposedBy()
	 * @generated
	 */
	void setComposedBy(mKAOS.Entity value);

} // CompositionLink
