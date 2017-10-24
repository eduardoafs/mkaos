/**
 */
package mKAOS.impl;

import java.util.Collection;

import mKAOS.DomainProperty;
import mKAOS.MKAOSPackage;
import mKAOS.Refinement;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mKAOS.impl.DomainPropertyImpl#getUsedIn <em>Used In</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DomainPropertyImpl extends GoalImpl implements DomainProperty {
	/**
	 * The cached value of the '{@link #getUsedIn() <em>Used In</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedIn()
	 * @generated
	 * @ordered
	 */
	protected EList<Refinement> usedIn;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MKAOSPackage.Literals.DOMAIN_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Refinement> getUsedIn() {
		if (usedIn == null) {
			usedIn = new EObjectResolvingEList<Refinement>(Refinement.class, this, MKAOSPackage.DOMAIN_PROPERTY__USED_IN);
		}
		return usedIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MKAOSPackage.DOMAIN_PROPERTY__USED_IN:
				return getUsedIn();
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
			case MKAOSPackage.DOMAIN_PROPERTY__USED_IN:
				getUsedIn().clear();
				getUsedIn().addAll((Collection<? extends Refinement>)newValue);
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
			case MKAOSPackage.DOMAIN_PROPERTY__USED_IN:
				getUsedIn().clear();
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
			case MKAOSPackage.DOMAIN_PROPERTY__USED_IN:
				return usedIn != null && !usedIn.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DomainPropertyImpl
