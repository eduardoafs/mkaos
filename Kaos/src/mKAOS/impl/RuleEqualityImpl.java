/**
 */
package mKAOS.impl;

import mKAOS.MKAOSPackage;
import mKAOS.RuleEquality;
import mKAOS.RuleRelExp;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule Equality</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mKAOS.impl.RuleEqualityImpl#isNeg <em>Neg</em>}</li>
 *   <li>{@link mKAOS.impl.RuleEqualityImpl#getL <em>L</em>}</li>
 *   <li>{@link mKAOS.impl.RuleEqualityImpl#getR <em>R</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RuleEqualityImpl extends MinimalEObjectImpl.Container implements RuleEquality {
	/**
	 * The default value of the '{@link #isNeg() <em>Neg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNeg()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NEG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNeg() <em>Neg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNeg()
	 * @generated
	 * @ordered
	 */
	protected boolean neg = NEG_EDEFAULT;

	/**
	 * The cached value of the '{@link #getL() <em>L</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL()
	 * @generated
	 * @ordered
	 */
	protected RuleRelExp l;

	/**
	 * The cached value of the '{@link #getR() <em>R</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getR()
	 * @generated
	 * @ordered
	 */
	protected RuleRelExp r;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuleEqualityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MKAOSPackage.Literals.RULE_EQUALITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNeg() {
		return neg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNeg(boolean newNeg) {
		boolean oldNeg = neg;
		neg = newNeg;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MKAOSPackage.RULE_EQUALITY__NEG, oldNeg, neg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleRelExp getL() {
		return l;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetL(RuleRelExp newL, NotificationChain msgs) {
		RuleRelExp oldL = l;
		l = newL;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MKAOSPackage.RULE_EQUALITY__L, oldL, newL);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setL(RuleRelExp newL) {
		if (newL != l) {
			NotificationChain msgs = null;
			if (l != null)
				msgs = ((InternalEObject)l).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MKAOSPackage.RULE_EQUALITY__L, null, msgs);
			if (newL != null)
				msgs = ((InternalEObject)newL).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MKAOSPackage.RULE_EQUALITY__L, null, msgs);
			msgs = basicSetL(newL, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MKAOSPackage.RULE_EQUALITY__L, newL, newL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleRelExp getR() {
		return r;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetR(RuleRelExp newR, NotificationChain msgs) {
		RuleRelExp oldR = r;
		r = newR;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MKAOSPackage.RULE_EQUALITY__R, oldR, newR);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setR(RuleRelExp newR) {
		if (newR != r) {
			NotificationChain msgs = null;
			if (r != null)
				msgs = ((InternalEObject)r).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MKAOSPackage.RULE_EQUALITY__R, null, msgs);
			if (newR != null)
				msgs = ((InternalEObject)newR).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MKAOSPackage.RULE_EQUALITY__R, null, msgs);
			msgs = basicSetR(newR, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MKAOSPackage.RULE_EQUALITY__R, newR, newR));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MKAOSPackage.RULE_EQUALITY__L:
				return basicSetL(null, msgs);
			case MKAOSPackage.RULE_EQUALITY__R:
				return basicSetR(null, msgs);
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
			case MKAOSPackage.RULE_EQUALITY__NEG:
				return isNeg();
			case MKAOSPackage.RULE_EQUALITY__L:
				return getL();
			case MKAOSPackage.RULE_EQUALITY__R:
				return getR();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MKAOSPackage.RULE_EQUALITY__NEG:
				setNeg((Boolean)newValue);
				return;
			case MKAOSPackage.RULE_EQUALITY__L:
				setL((RuleRelExp)newValue);
				return;
			case MKAOSPackage.RULE_EQUALITY__R:
				setR((RuleRelExp)newValue);
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
			case MKAOSPackage.RULE_EQUALITY__NEG:
				setNeg(NEG_EDEFAULT);
				return;
			case MKAOSPackage.RULE_EQUALITY__L:
				setL((RuleRelExp)null);
				return;
			case MKAOSPackage.RULE_EQUALITY__R:
				setR((RuleRelExp)null);
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
			case MKAOSPackage.RULE_EQUALITY__NEG:
				return neg != NEG_EDEFAULT;
			case MKAOSPackage.RULE_EQUALITY__L:
				return l != null;
			case MKAOSPackage.RULE_EQUALITY__R:
				return r != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (neg: ");
		result.append(neg);
		result.append(')');
		return result.toString();
	}

} //RuleEqualityImpl
