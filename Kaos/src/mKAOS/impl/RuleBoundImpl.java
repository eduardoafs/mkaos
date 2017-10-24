/**
 */
package mKAOS.impl;

import mKAOS.DynBLTL;
import mKAOS.MKAOSPackage;
import mKAOS.RuleBound;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule Bound</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mKAOS.impl.RuleBoundImpl#getFloatlit <em>Floatlit</em>}</li>
 *   <li>{@link mKAOS.impl.RuleBoundImpl#getIntegerlit <em>Integerlit</em>}</li>
 *   <li>{@link mKAOS.impl.RuleBoundImpl#getE <em>E</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RuleBoundImpl extends MinimalEObjectImpl.Container implements RuleBound {
	/**
	 * The default value of the '{@link #getFloatlit() <em>Floatlit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloatlit()
	 * @generated
	 * @ordered
	 */
	protected static final float FLOATLIT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getFloatlit() <em>Floatlit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloatlit()
	 * @generated
	 * @ordered
	 */
	protected float floatlit = FLOATLIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getIntegerlit() <em>Integerlit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntegerlit()
	 * @generated
	 * @ordered
	 */
	protected static final int INTEGERLIT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIntegerlit() <em>Integerlit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntegerlit()
	 * @generated
	 * @ordered
	 */
	protected int integerlit = INTEGERLIT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getE() <em>E</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getE()
	 * @generated
	 * @ordered
	 */
	protected DynBLTL e;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuleBoundImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MKAOSPackage.Literals.RULE_BOUND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getFloatlit() {
		return floatlit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFloatlit(float newFloatlit) {
		float oldFloatlit = floatlit;
		floatlit = newFloatlit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MKAOSPackage.RULE_BOUND__FLOATLIT, oldFloatlit, floatlit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIntegerlit() {
		return integerlit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntegerlit(int newIntegerlit) {
		int oldIntegerlit = integerlit;
		integerlit = newIntegerlit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MKAOSPackage.RULE_BOUND__INTEGERLIT, oldIntegerlit, integerlit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DynBLTL getE() {
		return e;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetE(DynBLTL newE, NotificationChain msgs) {
		DynBLTL oldE = e;
		e = newE;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MKAOSPackage.RULE_BOUND__E, oldE, newE);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setE(DynBLTL newE) {
		if (newE != e) {
			NotificationChain msgs = null;
			if (e != null)
				msgs = ((InternalEObject)e).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MKAOSPackage.RULE_BOUND__E, null, msgs);
			if (newE != null)
				msgs = ((InternalEObject)newE).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MKAOSPackage.RULE_BOUND__E, null, msgs);
			msgs = basicSetE(newE, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MKAOSPackage.RULE_BOUND__E, newE, newE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MKAOSPackage.RULE_BOUND__E:
				return basicSetE(null, msgs);
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
			case MKAOSPackage.RULE_BOUND__FLOATLIT:
				return getFloatlit();
			case MKAOSPackage.RULE_BOUND__INTEGERLIT:
				return getIntegerlit();
			case MKAOSPackage.RULE_BOUND__E:
				return getE();
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
			case MKAOSPackage.RULE_BOUND__FLOATLIT:
				setFloatlit((Float)newValue);
				return;
			case MKAOSPackage.RULE_BOUND__INTEGERLIT:
				setIntegerlit((Integer)newValue);
				return;
			case MKAOSPackage.RULE_BOUND__E:
				setE((DynBLTL)newValue);
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
			case MKAOSPackage.RULE_BOUND__FLOATLIT:
				setFloatlit(FLOATLIT_EDEFAULT);
				return;
			case MKAOSPackage.RULE_BOUND__INTEGERLIT:
				setIntegerlit(INTEGERLIT_EDEFAULT);
				return;
			case MKAOSPackage.RULE_BOUND__E:
				setE((DynBLTL)null);
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
			case MKAOSPackage.RULE_BOUND__FLOATLIT:
				return floatlit != FLOATLIT_EDEFAULT;
			case MKAOSPackage.RULE_BOUND__INTEGERLIT:
				return integerlit != INTEGERLIT_EDEFAULT;
			case MKAOSPackage.RULE_BOUND__E:
				return e != null;
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
		result.append(" (floatlit: ");
		result.append(floatlit);
		result.append(", integerlit: ");
		result.append(integerlit);
		result.append(')');
		return result.toString();
	}

} //RuleBoundImpl
