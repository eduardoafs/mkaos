/**
 */
package mKAOS.impl;

import KAOSModel.impl.NodesImpl;

import java.util.Collection;

import mKAOS.EmergentBehavior;
import mKAOS.MKAOSPackage;
import mKAOS.Mission;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Emergent Behavior</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mKAOS.impl.EmergentBehaviorImpl#getRelatedTo <em>Related To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EmergentBehaviorImpl extends NodesImpl implements EmergentBehavior {
	/**
	 * The cached value of the '{@link #getRelatedTo() <em>Related To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedTo()
	 * @generated
	 * @ordered
	 */
	protected EList<Mission> relatedTo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmergentBehaviorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MKAOSPackage.Literals.EMERGENT_BEHAVIOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Mission> getRelatedTo() {
		if (relatedTo == null) {
			relatedTo = new EObjectResolvingEList<Mission>(Mission.class, this, MKAOSPackage.EMERGENT_BEHAVIOR__RELATED_TO);
		}
		return relatedTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MKAOSPackage.EMERGENT_BEHAVIOR__RELATED_TO:
				return getRelatedTo();
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
			case MKAOSPackage.EMERGENT_BEHAVIOR__RELATED_TO:
				getRelatedTo().clear();
				getRelatedTo().addAll((Collection<? extends Mission>)newValue);
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
			case MKAOSPackage.EMERGENT_BEHAVIOR__RELATED_TO:
				getRelatedTo().clear();
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
			case MKAOSPackage.EMERGENT_BEHAVIOR__RELATED_TO:
				return relatedTo != null && !relatedTo.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EmergentBehaviorImpl
