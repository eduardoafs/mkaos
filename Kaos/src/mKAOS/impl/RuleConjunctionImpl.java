/**
 */
package mKAOS.impl;

import java.util.Collection;

import mKAOS.MKAOSPackage;
import mKAOS.RuleConjunction;
import mKAOS.RuleEquality;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule Conjunction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mKAOS.impl.RuleConjunctionImpl#getL <em>L</em>}</li>
 *   <li>{@link mKAOS.impl.RuleConjunctionImpl#getR <em>R</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RuleConjunctionImpl extends MinimalEObjectImpl.Container implements RuleConjunction {
	/**
	 * The cached value of the '{@link #getL() <em>L</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL()
	 * @generated
	 * @ordered
	 */
	protected RuleEquality l;

	/**
	 * The cached value of the '{@link #getR() <em>R</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getR()
	 * @generated
	 * @ordered
	 */
	protected EList<RuleEquality> r;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuleConjunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MKAOSPackage.Literals.RULE_CONJUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleEquality getL() {
		return l;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetL(RuleEquality newL, NotificationChain msgs) {
		RuleEquality oldL = l;
		l = newL;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MKAOSPackage.RULE_CONJUNCTION__L, oldL, newL);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setL(RuleEquality newL) {
		if (newL != l) {
			NotificationChain msgs = null;
			if (l != null)
				msgs = ((InternalEObject)l).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MKAOSPackage.RULE_CONJUNCTION__L, null, msgs);
			if (newL != null)
				msgs = ((InternalEObject)newL).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MKAOSPackage.RULE_CONJUNCTION__L, null, msgs);
			msgs = basicSetL(newL, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MKAOSPackage.RULE_CONJUNCTION__L, newL, newL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RuleEquality> getR() {
		if (r == null) {
			r = new EObjectContainmentEList<RuleEquality>(RuleEquality.class, this, MKAOSPackage.RULE_CONJUNCTION__R);
		}
		return r;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MKAOSPackage.RULE_CONJUNCTION__L:
				return basicSetL(null, msgs);
			case MKAOSPackage.RULE_CONJUNCTION__R:
				return ((InternalEList<?>)getR()).basicRemove(otherEnd, msgs);
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
			case MKAOSPackage.RULE_CONJUNCTION__L:
				return getL();
			case MKAOSPackage.RULE_CONJUNCTION__R:
				return getR();
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
			case MKAOSPackage.RULE_CONJUNCTION__L:
				setL((RuleEquality)newValue);
				return;
			case MKAOSPackage.RULE_CONJUNCTION__R:
				getR().clear();
				getR().addAll((Collection<? extends RuleEquality>)newValue);
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
			case MKAOSPackage.RULE_CONJUNCTION__L:
				setL((RuleEquality)null);
				return;
			case MKAOSPackage.RULE_CONJUNCTION__R:
				getR().clear();
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
			case MKAOSPackage.RULE_CONJUNCTION__L:
				return l != null;
			case MKAOSPackage.RULE_CONJUNCTION__R:
				return r != null && !r.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RuleConjunctionImpl
