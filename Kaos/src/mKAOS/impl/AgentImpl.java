/**
 */
package mKAOS.impl;

import java.util.Collection;

import mKAOS.Agent;
import mKAOS.MKAOSPackage;
import mKAOS.Operation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Agent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mKAOS.impl.AgentImpl#getPerforms <em>Performs</em>}</li>
 *   <li>{@link mKAOS.impl.AgentImpl#getComposition <em>Composition</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AgentImpl extends ObjectImpl implements Agent {
	/**
	 * The cached value of the '{@link #getPerforms() <em>Performs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerforms()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> performs;

	/**
	 * The cached value of the '{@link #getComposition() <em>Composition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComposition()
	 * @generated
	 * @ordered
	 */
	protected EList<Agent> composition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AgentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MKAOSPackage.Literals.AGENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getPerforms() {
		if (performs == null) {
			performs = new EObjectResolvingEList<Operation>(Operation.class, this, MKAOSPackage.AGENT__PERFORMS);
		}
		return performs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Agent> getComposition() {
		if (composition == null) {
			composition = new EObjectResolvingEList<Agent>(Agent.class, this, MKAOSPackage.AGENT__COMPOSITION);
		}
		return composition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MKAOSPackage.AGENT__PERFORMS:
				return getPerforms();
			case MKAOSPackage.AGENT__COMPOSITION:
				return getComposition();
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
			case MKAOSPackage.AGENT__PERFORMS:
				getPerforms().clear();
				getPerforms().addAll((Collection<? extends Operation>)newValue);
				return;
			case MKAOSPackage.AGENT__COMPOSITION:
				getComposition().clear();
				getComposition().addAll((Collection<? extends Agent>)newValue);
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
			case MKAOSPackage.AGENT__PERFORMS:
				getPerforms().clear();
				return;
			case MKAOSPackage.AGENT__COMPOSITION:
				getComposition().clear();
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
			case MKAOSPackage.AGENT__PERFORMS:
				return performs != null && !performs.isEmpty();
			case MKAOSPackage.AGENT__COMPOSITION:
				return composition != null && !composition.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AgentImpl
