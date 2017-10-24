/**
 */
package mKAOS.impl;

import java.util.Collection;

import mKAOS.MKAOSPackage;
import mKAOS.RuleLiteral;
import mKAOS.RuleTupleLit;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule Tuple Lit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mKAOS.impl.RuleTupleLitImpl#getVals <em>Vals</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RuleTupleLitImpl extends MinimalEObjectImpl.Container implements RuleTupleLit {
	/**
	 * The cached value of the '{@link #getVals() <em>Vals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVals()
	 * @generated
	 * @ordered
	 */
	protected EList<RuleLiteral> vals;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuleTupleLitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MKAOSPackage.Literals.RULE_TUPLE_LIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RuleLiteral> getVals() {
		if (vals == null) {
			vals = new EObjectContainmentEList<RuleLiteral>(RuleLiteral.class, this, MKAOSPackage.RULE_TUPLE_LIT__VALS);
		}
		return vals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MKAOSPackage.RULE_TUPLE_LIT__VALS:
				return ((InternalEList<?>)getVals()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MKAOSPackage.RULE_TUPLE_LIT__VALS:
				return getVals();
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
			case MKAOSPackage.RULE_TUPLE_LIT__VALS:
				getVals().clear();
				getVals().addAll((Collection<? extends RuleLiteral>)newValue);
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
			case MKAOSPackage.RULE_TUPLE_LIT__VALS:
				getVals().clear();
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
			case MKAOSPackage.RULE_TUPLE_LIT__VALS:
				return vals != null && !vals.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RuleTupleLitImpl
