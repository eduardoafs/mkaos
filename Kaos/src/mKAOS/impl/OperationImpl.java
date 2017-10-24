/**
 */
package mKAOS.impl;

import java.util.Collection;

import mKAOS.Entity;
import mKAOS.Event;
import mKAOS.MKAOSPackage;
import mKAOS.Operation;
import mKAOS.Requirement;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mKAOS.impl.OperationImpl#getProduces <em>Produces</em>}</li>
 *   <li>{@link mKAOS.impl.OperationImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link mKAOS.impl.OperationImpl#getOperationalize <em>Operationalize</em>}</li>
 *   <li>{@link mKAOS.impl.OperationImpl#getInput <em>Input</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationImpl extends OperationNodeImpl implements Operation {
	/**
	 * The cached value of the '{@link #getProduces() <em>Produces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProduces()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> produces;

	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> output;

	/**
	 * The cached value of the '{@link #getOperationalize() <em>Operationalize</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationalize()
	 * @generated
	 * @ordered
	 */
	protected EList<Requirement> operationalize;

	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> input;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MKAOSPackage.Literals.OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Event> getProduces() {
		if (produces == null) {
			produces = new EObjectResolvingEList<Event>(Event.class, this, MKAOSPackage.OPERATION__PRODUCES);
		}
		return produces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entity> getOutput() {
		if (output == null) {
			output = new EObjectResolvingEList<Entity>(Entity.class, this, MKAOSPackage.OPERATION__OUTPUT);
		}
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Requirement> getOperationalize() {
		if (operationalize == null) {
			operationalize = new EObjectResolvingEList<Requirement>(Requirement.class, this, MKAOSPackage.OPERATION__OPERATIONALIZE);
		}
		return operationalize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entity> getInput() {
		if (input == null) {
			input = new EObjectResolvingEList<Entity>(Entity.class, this, MKAOSPackage.OPERATION__INPUT);
		}
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MKAOSPackage.OPERATION__PRODUCES:
				return getProduces();
			case MKAOSPackage.OPERATION__OUTPUT:
				return getOutput();
			case MKAOSPackage.OPERATION__OPERATIONALIZE:
				return getOperationalize();
			case MKAOSPackage.OPERATION__INPUT:
				return getInput();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MKAOSPackage.OPERATION__PRODUCES:
				getProduces().clear();
				getProduces().addAll((Collection<? extends Event>)newValue);
				return;
			case MKAOSPackage.OPERATION__OUTPUT:
				getOutput().clear();
				getOutput().addAll((Collection<? extends Entity>)newValue);
				return;
			case MKAOSPackage.OPERATION__OPERATIONALIZE:
				getOperationalize().clear();
				getOperationalize().addAll((Collection<? extends Requirement>)newValue);
				return;
			case MKAOSPackage.OPERATION__INPUT:
				getInput().clear();
				getInput().addAll((Collection<? extends Entity>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MKAOSPackage.OPERATION__PRODUCES:
				getProduces().clear();
				return;
			case MKAOSPackage.OPERATION__OUTPUT:
				getOutput().clear();
				return;
			case MKAOSPackage.OPERATION__OPERATIONALIZE:
				getOperationalize().clear();
				return;
			case MKAOSPackage.OPERATION__INPUT:
				getInput().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MKAOSPackage.OPERATION__PRODUCES:
				return produces != null && !produces.isEmpty();
			case MKAOSPackage.OPERATION__OUTPUT:
				return output != null && !output.isEmpty();
			case MKAOSPackage.OPERATION__OPERATIONALIZE:
				return operationalize != null && !operationalize.isEmpty();
			case MKAOSPackage.OPERATION__INPUT:
				return input != null && !input.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OperationImpl
