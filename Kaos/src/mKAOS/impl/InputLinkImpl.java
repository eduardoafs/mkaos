/**
 */
package mKAOS.impl;

import java.util.Collection;

import mKAOS.InputLink;
import mKAOS.MKAOSPackage;
import mKAOS.Operation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mKAOS.impl.InputLinkImpl#getObjectInputOn <em>Object Input On</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InputLinkImpl extends LinkImpl implements InputLink {
	/**
	 * The cached value of the '{@link #getObjectInputOn() <em>Object Input On</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectInputOn()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> objectInputOn;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MKAOSPackage.Literals.INPUT_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getObjectInputOn() {
		if (objectInputOn == null) {
			objectInputOn = new EObjectResolvingEList<Operation>(Operation.class, this, MKAOSPackage.INPUT_LINK__OBJECT_INPUT_ON);
		}
		return objectInputOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MKAOSPackage.INPUT_LINK__OBJECT_INPUT_ON:
				return getObjectInputOn();
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
			case MKAOSPackage.INPUT_LINK__OBJECT_INPUT_ON:
				getObjectInputOn().clear();
				getObjectInputOn().addAll((Collection<? extends Operation>)newValue);
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
			case MKAOSPackage.INPUT_LINK__OBJECT_INPUT_ON:
				getObjectInputOn().clear();
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
			case MKAOSPackage.INPUT_LINK__OBJECT_INPUT_ON:
				return objectInputOn != null && !objectInputOn.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InputLinkImpl
