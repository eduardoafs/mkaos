/**
 */
package KAOSModel.impl;

import KAOSModel.KAOSModelPackage;
import KAOSModel.OperacionalizationLink;
import KAOSModel.Requirement;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operacionalization Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link KAOSModel.impl.OperacionalizationLinkImpl#getRelateOperationTo <em>Relate Operation To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperacionalizationLinkImpl extends LinkImpl implements OperacionalizationLink {
	/**
	 * The cached value of the '{@link #getRelateOperationTo() <em>Relate Operation To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelateOperationTo()
	 * @generated
	 * @ordered
	 */
	protected EList<Requirement> relateOperationTo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperacionalizationLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KAOSModelPackage.Literals.OPERACIONALIZATION_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Requirement> getRelateOperationTo() {
		if (relateOperationTo == null) {
			relateOperationTo = new EObjectResolvingEList<Requirement>(Requirement.class, this, KAOSModelPackage.OPERACIONALIZATION_LINK__RELATE_OPERATION_TO);
		}
		return relateOperationTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KAOSModelPackage.OPERACIONALIZATION_LINK__RELATE_OPERATION_TO:
				return getRelateOperationTo();
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
			case KAOSModelPackage.OPERACIONALIZATION_LINK__RELATE_OPERATION_TO:
				getRelateOperationTo().clear();
				getRelateOperationTo().addAll((Collection<? extends Requirement>)newValue);
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
			case KAOSModelPackage.OPERACIONALIZATION_LINK__RELATE_OPERATION_TO:
				getRelateOperationTo().clear();
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
			case KAOSModelPackage.OPERACIONALIZATION_LINK__RELATE_OPERATION_TO:
				return relateOperationTo != null && !relateOperationTo.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OperacionalizationLinkImpl
