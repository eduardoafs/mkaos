/**
 */
package mKAOS.impl;

import java.util.Collection;

import mKAOS.ConstituentSystem;
import mKAOS.MKAOSPackage;
import mKAOS.OperationalCapability;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constituent System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mKAOS.impl.ConstituentSystemImpl#getCapableOf <em>Capable Of</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConstituentSystemImpl extends mKAOS.impl.SoftwareAgentImpl implements ConstituentSystem {
	/**
	 * The cached value of the '{@link #getCapableOf() <em>Capable Of</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapableOf()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationalCapability> capableOf;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstituentSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MKAOSPackage.Literals.CONSTITUENT_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationalCapability> getCapableOf() {
		if (capableOf == null) {
			capableOf = new EObjectResolvingEList<OperationalCapability>(OperationalCapability.class, this, MKAOSPackage.CONSTITUENT_SYSTEM__CAPABLE_OF);
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
			case MKAOSPackage.CONSTITUENT_SYSTEM__CAPABLE_OF:
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
			case MKAOSPackage.CONSTITUENT_SYSTEM__CAPABLE_OF:
				getCapableOf().clear();
				getCapableOf().addAll((Collection<? extends OperationalCapability>)newValue);
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
			case MKAOSPackage.CONSTITUENT_SYSTEM__CAPABLE_OF:
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
			case MKAOSPackage.CONSTITUENT_SYSTEM__CAPABLE_OF:
				return capableOf != null && !capableOf.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConstituentSystemImpl
