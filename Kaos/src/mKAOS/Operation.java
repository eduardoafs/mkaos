/**
 */
package mKAOS;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mKAOS.Operation#getProduces <em>Produces</em>}</li>
 *   <li>{@link mKAOS.Operation#getOutput <em>Output</em>}</li>
 *   <li>{@link mKAOS.Operation#getOperationalize <em>Operationalize</em>}</li>
 *   <li>{@link mKAOS.Operation#getInput <em>Input</em>}</li>
 * </ul>
 *
 * @see mKAOS.MKAOSPackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends OperationNode {
	/**
	 * Returns the value of the '<em><b>Produces</b></em>' reference list.
	 * The list contents are of type {@link mKAOS.Event}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Produces</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Produces</em>' reference list.
	 * @see mKAOS.MKAOSPackage#getOperation_Produces()
	 * @model required="true"
	 * @generated
	 */
	EList<Event> getProduces();

	/**
	 * Returns the value of the '<em><b>Output</b></em>' reference list.
	 * The list contents are of type {@link mKAOS.Entity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' reference list.
	 * @see mKAOS.MKAOSPackage#getOperation_Output()
	 * @model required="true"
	 * @generated
	 */
	EList<Entity> getOutput();

	/**
	 * Returns the value of the '<em><b>Operationalize</b></em>' reference list.
	 * The list contents are of type {@link mKAOS.Requirement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operationalize</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operationalize</em>' reference list.
	 * @see mKAOS.MKAOSPackage#getOperation_Operationalize()
	 * @model required="true"
	 * @generated
	 */
	EList<Requirement> getOperationalize();

	/**
	 * Returns the value of the '<em><b>Input</b></em>' reference list.
	 * The list contents are of type {@link mKAOS.Entity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' reference list.
	 * @see mKAOS.MKAOSPackage#getOperation_Input()
	 * @model required="true"
	 * @generated
	 */
	EList<Entity> getInput();

} // Operation
