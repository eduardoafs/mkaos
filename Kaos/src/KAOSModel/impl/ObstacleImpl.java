/**
 */
package KAOSModel.impl;

import KAOSModel.Goal;
import KAOSModel.KAOSModelPackage;
import KAOSModel.Obstacle;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Obstacle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link KAOSModel.impl.ObstacleImpl#getObstruct <em>Obstruct</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObstacleImpl extends RefinableNodeImpl implements Obstacle {
	/**
	 * The cached value of the '{@link #getObstruct() <em>Obstruct</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObstruct()
	 * @generated
	 * @ordered
	 */
	protected EList<Goal> obstruct;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObstacleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KAOSModelPackage.Literals.OBSTACLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Goal> getObstruct() {
		if (obstruct == null) {
			obstruct = new EObjectResolvingEList<Goal>(Goal.class, this, KAOSModelPackage.OBSTACLE__OBSTRUCT);
		}
		return obstruct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KAOSModelPackage.OBSTACLE__OBSTRUCT:
				return getObstruct();
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
			case KAOSModelPackage.OBSTACLE__OBSTRUCT:
				getObstruct().clear();
				getObstruct().addAll((Collection<? extends Goal>)newValue);
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
			case KAOSModelPackage.OBSTACLE__OBSTRUCT:
				getObstruct().clear();
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
			case KAOSModelPackage.OBSTACLE__OBSTRUCT:
				return obstruct != null && !obstruct.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ObstacleImpl
