/**
 */
package mKAOS;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mKAOS.Entity#getComposition <em>Composition</em>}</li>
 * </ul>
 *
 * @see mKAOS.MKAOSPackage#getEntity()
 * @model
 * @generated
 */
public interface Entity extends mKAOS.Object {
	/**
	 * Returns the value of the '<em><b>Composition</b></em>' reference list.
	 * The list contents are of type {@link mKAOS.Entity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composition</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composition</em>' reference list.
	 * @see mKAOS.MKAOSPackage#getEntity_Composition()
	 * @model
	 * @generated
	 */
	EList<Entity> getComposition();

} // Entity
