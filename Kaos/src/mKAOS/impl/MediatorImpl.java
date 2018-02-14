/**
 */
package mKAOS.impl;

import KAOSModel.impl.SoftwareAgentImpl;

import java.util.Collection;

import mKAOS.CommunicationalCapability;
import mKAOS.MKAOSPackage;
import mKAOS.Mediator;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mediator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mKAOS.impl.MediatorImpl#getCapableOf <em>Capable Of</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MediatorImpl extends SoftwareAgentImpl implements Mediator {
	/**
	 * The cached value of the '{@link #getCapableOf() <em>Capable Of</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapableOf()
	 * @generated
	 * @ordered
	 */
	protected EList<CommunicationalCapability> capableOf;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MediatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MKAOSPackage.Literals.MEDIATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CommunicationalCapability> getCapableOf() {
		if (capableOf == null) {
			capableOf = new EObjectResolvingEList<CommunicationalCapability>(CommunicationalCapability.class, this, MKAOSPackage.MEDIATOR__CAPABLE_OF);
		}
		return capableOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MKAOSPackage.MEDIATOR__CAPABLE_OF:
				return getCapableOf();
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
			case MKAOSPackage.MEDIATOR__CAPABLE_OF:
				getCapableOf().clear();
				getCapableOf().addAll((Collection<? extends CommunicationalCapability>)newValue);
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
			case MKAOSPackage.MEDIATOR__CAPABLE_OF:
				getCapableOf().clear();
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
			case MKAOSPackage.MEDIATOR__CAPABLE_OF:
				return capableOf != null && !capableOf.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MediatorImpl
