/**
 */
package mKAOS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generalization Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mKAOS.GeneralizationLink#getEntity <em>Entity</em>}</li>
 *   <li>{@link mKAOS.GeneralizationLink#getGeneralizes <em>Generalizes</em>}</li>
 * </ul>
 *
 * @see mKAOS.MKAOSPackage#getGeneralizationLink()
 * @model
 * @generated
 */
public interface GeneralizationLink extends mKAOS.Link {
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
	 * @see mKAOS.MKAOSPackage#getGeneralizationLink_Entity()
	 * @model keys="name"
	 * @generated
	 */
	mKAOS.Entity getEntity();

	/**
	 * Sets the value of the '{@link mKAOS.GeneralizationLink#getEntity <em>Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity</em>' reference.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(mKAOS.Entity value);

	/**
	 * Returns the value of the '<em><b>Generalizes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generalizes</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generalizes</em>' reference.
	 * @see #setGeneralizes(mKAOS.Entity)
	 * @see mKAOS.MKAOSPackage#getGeneralizationLink_Generalizes()
	 * @model keys="name"
	 * @generated
	 */
	mKAOS.Entity getGeneralizes();

	/**
	 * Sets the value of the '{@link mKAOS.GeneralizationLink#getGeneralizes <em>Generalizes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generalizes</em>' reference.
	 * @see #getGeneralizes()
	 * @generated
	 */
	void setGeneralizes(mKAOS.Entity value);

} // GeneralizationLink
