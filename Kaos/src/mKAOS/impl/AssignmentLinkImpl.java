/**
 */
package mKAOS.impl;

import java.util.Collection;

import mKAOS.Agent;
import mKAOS.AssignmentLink;
import mKAOS.MKAOSPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assignment Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mKAOS.impl.AssignmentLinkImpl#getAssignsGoalTo <em>Assigns Goal To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssignmentLinkImpl extends LinkImpl implements AssignmentLink {
	/**
	 * The cached value of the '{@link #getAssignsGoalTo() <em>Assigns Goal To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignsGoalTo()
	 * @generated
	 * @ordered
	 */
	protected EList<Agent> assignsGoalTo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssignmentLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MKAOSPackage.Literals.ASSIGNMENT_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Agent> getAssignsGoalTo() {
		if (assignsGoalTo == null) {
			assignsGoalTo = new EObjectResolvingEList<Agent>(Agent.class, this, MKAOSPackage.ASSIGNMENT_LINK__ASSIGNS_GOAL_TO);
		}
		return assignsGoalTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MKAOSPackage.ASSIGNMENT_LINK__ASSIGNS_GOAL_TO:
				return getAssignsGoalTo();
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
			case MKAOSPackage.ASSIGNMENT_LINK__ASSIGNS_GOAL_TO:
				getAssignsGoalTo().clear();
				getAssignsGoalTo().addAll((Collection<? extends Agent>)newValue);
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
			case MKAOSPackage.ASSIGNMENT_LINK__ASSIGNS_GOAL_TO:
				getAssignsGoalTo().clear();
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
			case MKAOSPackage.ASSIGNMENT_LINK__ASSIGNS_GOAL_TO:
				return assignsGoalTo != null && !assignsGoalTo.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AssignmentLinkImpl
