/**
 */
package KAOSModel.impl;

import KAOSModel.KAOSModelPackage;
import KAOSModel.Requirement;
import KAOSModel.ResolutionLink;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resolution Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link KAOSModel.impl.ResolutionLinkImpl#getAssignObstacleTo <em>Assign Obstacle To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResolutionLinkImpl extends LinkImpl implements ResolutionLink {
	/**
	 * The cached value of the '{@link #getAssignObstacleTo() <em>Assign Obstacle To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignObstacleTo()
	 * @generated
	 * @ordered
	 */
	protected EList<Requirement> assignObstacleTo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResolutionLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KAOSModelPackage.Literals.RESOLUTION_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Requirement> getAssignObstacleTo() {
		if (assignObstacleTo == null) {
			assignObstacleTo = new EObjectResolvingEList<Requirement>(Requirement.class, this, KAOSModelPackage.RESOLUTION_LINK__ASSIGN_OBSTACLE_TO);
		}
		return assignObstacleTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KAOSModelPackage.RESOLUTION_LINK__ASSIGN_OBSTACLE_TO:
				return getAssignObstacleTo();
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
			case KAOSModelPackage.RESOLUTION_LINK__ASSIGN_OBSTACLE_TO:
				getAssignObstacleTo().clear();
				getAssignObstacleTo().addAll((Collection<? extends Requirement>)newValue);
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
			case KAOSModelPackage.RESOLUTION_LINK__ASSIGN_OBSTACLE_TO:
				getAssignObstacleTo().clear();
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
			case KAOSModelPackage.RESOLUTION_LINK__ASSIGN_OBSTACLE_TO:
				return assignObstacleTo != null && !assignObstacleTo.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ResolutionLinkImpl
