/**
 */
package mKAOS.impl;

import java.util.Collection;

import mKAOS.MKAOSPackage;
import mKAOS.Obstacle;
import mKAOS.ObstructionLink;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Obstruction Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mKAOS.impl.ObstructionLinkImpl#getRelateKGoalTo <em>Relate KGoal To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObstructionLinkImpl extends LinkImpl implements ObstructionLink {
	/**
	 * The cached value of the '{@link #getRelateKGoalTo() <em>Relate KGoal To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelateKGoalTo()
	 * @generated
	 * @ordered
	 */
	protected EList<Obstacle> relateKGoalTo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObstructionLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MKAOSPackage.Literals.OBSTRUCTION_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Obstacle> getRelateKGoalTo() {
		if (relateKGoalTo == null) {
			relateKGoalTo = new EObjectResolvingEList<Obstacle>(Obstacle.class, this, MKAOSPackage.OBSTRUCTION_LINK__RELATE_KGOAL_TO);
		}
		return relateKGoalTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MKAOSPackage.OBSTRUCTION_LINK__RELATE_KGOAL_TO:
				return getRelateKGoalTo();
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
			case MKAOSPackage.OBSTRUCTION_LINK__RELATE_KGOAL_TO:
				getRelateKGoalTo().clear();
				getRelateKGoalTo().addAll((Collection<? extends Obstacle>)newValue);
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
			case MKAOSPackage.OBSTRUCTION_LINK__RELATE_KGOAL_TO:
				getRelateKGoalTo().clear();
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
			case MKAOSPackage.OBSTRUCTION_LINK__RELATE_KGOAL_TO:
				return relateKGoalTo != null && !relateKGoalTo.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ObstructionLinkImpl
