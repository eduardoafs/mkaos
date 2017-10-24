/**
 */
package KAOSModel;

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
 *   <li>{@link KAOSModel.Entity#getComposition <em>Composition</em>}</li>
 * </ul>
 *
 * @see KAOSModel.KAOSModelPackage#getEntity()
 * @model
 * @generated
 */
public interface Entity extends KAOSModel.Object {
	/**
	 * Returns the value of the '<em><b>Composition</b></em>' reference list.
	 * The list contents are of type {@link KAOSModel.Entity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composition</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composition</em>' reference list.
	 * @see KAOSModel.KAOSModelPackage#getEntity_Composition()
	 * @model
	 * @generated
	 */
	EList<Entity> getComposition();

} // Entity
