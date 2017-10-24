/**
 */
package mKAOS;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>KAOS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mKAOS.KAOS#getName <em>Name</em>}</li>
 *   <li>{@link mKAOS.KAOS#getLinkedBy <em>Linked By</em>}</li>
 *   <li>{@link mKAOS.KAOS#getConsistsOf <em>Consists Of</em>}</li>
 * </ul>
 *
 * @see mKAOS.MKAOSPackage#getKAOS()
 * @model
 * @generated
 */
public interface KAOS extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see mKAOS.MKAOSPackage#getKAOS_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mKAOS.KAOS#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Linked By</b></em>' containment reference list.
	 * The list contents are of type {@link mKAOS.Link}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Linked By</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linked By</em>' containment reference list.
	 * @see mKAOS.MKAOSPackage#getKAOS_LinkedBy()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Link> getLinkedBy();

	/**
	 * Returns the value of the '<em><b>Consists Of</b></em>' containment reference list.
	 * The list contents are of type {@link mKAOS.Nodes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consists Of</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consists Of</em>' containment reference list.
	 * @see mKAOS.MKAOSPackage#getKAOS_ConsistsOf()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Nodes> getConsistsOf();

} // KAOS
