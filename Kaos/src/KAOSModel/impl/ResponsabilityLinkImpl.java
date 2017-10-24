/**
 */
package KAOSModel.impl;

import KAOSModel.KAOSModelPackage;
import KAOSModel.Requirement;
import KAOSModel.ResponsabilityLink;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Responsability Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link KAOSModel.impl.ResponsabilityLinkImpl#getAssignAgentTo <em>Assign Agent To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResponsabilityLinkImpl extends LinkImpl implements ResponsabilityLink {
	/**
	 * The cached value of the '{@link #getAssignAgentTo() <em>Assign Agent To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignAgentTo()
	 * @generated
	 * @ordered
	 */
	protected EList<Requirement> assignAgentTo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResponsabilityLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KAOSModelPackage.Literals.RESPONSABILITY_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Requirement> getAssignAgentTo() {
		if (assignAgentTo == null) {
			assignAgentTo = new EObjectResolvingEList<Requirement>(Requirement.class, this, KAOSModelPackage.RESPONSABILITY_LINK__ASSIGN_AGENT_TO);
		}
		return assignAgentTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KAOSModelPackage.RESPONSABILITY_LINK__ASSIGN_AGENT_TO:
				return getAssignAgentTo();
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
			case KAOSModelPackage.RESPONSABILITY_LINK__ASSIGN_AGENT_TO:
				getAssignAgentTo().clear();
				getAssignAgentTo().addAll((Collection<? extends Requirement>)newValue);
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
			case KAOSModelPackage.RESPONSABILITY_LINK__ASSIGN_AGENT_TO:
				getAssignAgentTo().clear();
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
			case KAOSModelPackage.RESPONSABILITY_LINK__ASSIGN_AGENT_TO:
				return assignAgentTo != null && !assignAgentTo.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ResponsabilityLinkImpl
