/**
 */
package mKAOS.impl;

import mKAOS.DynBLTL;
import mKAOS.MKAOSPackage;
import mKAOS.RuleFunction;
import mKAOS.RuleQuantifier;
import mKAOS.RuleTemporal;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dyn BLTL</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mKAOS.impl.DynBLTLImpl#getQ <em>Q</em>}</li>
 *   <li>{@link mKAOS.impl.DynBLTLImpl#getVal <em>Val</em>}</li>
 *   <li>{@link mKAOS.impl.DynBLTLImpl#getC <em>C</em>}</li>
 *   <li>{@link mKAOS.impl.DynBLTLImpl#getT <em>T</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DynBLTLImpl extends MinimalEObjectImpl.Container implements DynBLTL {
	/**
	 * The default value of the '{@link #getQ() <em>Q</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQ()
	 * @generated
	 * @ordered
	 */
	protected static final RuleQuantifier Q_EDEFAULT = RuleQuantifier.EXISTS;

	/**
	 * The cached value of the '{@link #getQ() <em>Q</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQ()
	 * @generated
	 * @ordered
	 */
	protected RuleQuantifier q = Q_EDEFAULT;

	/**
	 * The default value of the '{@link #getVal() <em>Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVal()
	 * @generated
	 * @ordered
	 */
	protected static final String VAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVal() <em>Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVal()
	 * @generated
	 * @ordered
	 */
	protected String val = VAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getC() <em>C</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getC()
	 * @generated
	 * @ordered
	 */
	protected RuleFunction c;

	/**
	 * The cached value of the '{@link #getT() <em>T</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getT()
	 * @generated
	 * @ordered
	 */
	protected RuleTemporal t;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DynBLTLImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MKAOSPackage.Literals.DYN_BLTL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleQuantifier getQ() {
		return q;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQ(RuleQuantifier newQ) {
		RuleQuantifier oldQ = q;
		q = newQ == null ? Q_EDEFAULT : newQ;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MKAOSPackage.DYN_BLTL__Q, oldQ, q));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVal() {
		return val;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVal(String newVal) {
		String oldVal = val;
		val = newVal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MKAOSPackage.DYN_BLTL__VAL, oldVal, val));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleFunction getC() {
		return c;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetC(RuleFunction newC, NotificationChain msgs) {
		RuleFunction oldC = c;
		c = newC;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MKAOSPackage.DYN_BLTL__C, oldC, newC);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setC(RuleFunction newC) {
		if (newC != c) {
			NotificationChain msgs = null;
			if (c != null)
				msgs = ((InternalEObject)c).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MKAOSPackage.DYN_BLTL__C, null, msgs);
			if (newC != null)
				msgs = ((InternalEObject)newC).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MKAOSPackage.DYN_BLTL__C, null, msgs);
			msgs = basicSetC(newC, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MKAOSPackage.DYN_BLTL__C, newC, newC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleTemporal getT() {
		return t;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetT(RuleTemporal newT, NotificationChain msgs) {
		RuleTemporal oldT = t;
		t = newT;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MKAOSPackage.DYN_BLTL__T, oldT, newT);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setT(RuleTemporal newT) {
		if (newT != t) {
			NotificationChain msgs = null;
			if (t != null)
				msgs = ((InternalEObject)t).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MKAOSPackage.DYN_BLTL__T, null, msgs);
			if (newT != null)
				msgs = ((InternalEObject)newT).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MKAOSPackage.DYN_BLTL__T, null, msgs);
			msgs = basicSetT(newT, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MKAOSPackage.DYN_BLTL__T, newT, newT));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MKAOSPackage.DYN_BLTL__C:
				return basicSetC(null, msgs);
			case MKAOSPackage.DYN_BLTL__T:
				return basicSetT(null, msgs);
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
			case MKAOSPackage.DYN_BLTL__Q:
				return getQ();
			case MKAOSPackage.DYN_BLTL__VAL:
				return getVal();
			case MKAOSPackage.DYN_BLTL__C:
				return getC();
			case MKAOSPackage.DYN_BLTL__T:
				return getT();
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
			case MKAOSPackage.DYN_BLTL__Q:
				setQ((RuleQuantifier)newValue);
				return;
			case MKAOSPackage.DYN_BLTL__VAL:
				setVal((String)newValue);
				return;
			case MKAOSPackage.DYN_BLTL__C:
				setC((RuleFunction)newValue);
				return;
			case MKAOSPackage.DYN_BLTL__T:
				setT((RuleTemporal)newValue);
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
			case MKAOSPackage.DYN_BLTL__Q:
				setQ(Q_EDEFAULT);
				return;
			case MKAOSPackage.DYN_BLTL__VAL:
				setVal(VAL_EDEFAULT);
				return;
			case MKAOSPackage.DYN_BLTL__C:
				setC((RuleFunction)null);
				return;
			case MKAOSPackage.DYN_BLTL__T:
				setT((RuleTemporal)null);
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
			case MKAOSPackage.DYN_BLTL__Q:
				return q != Q_EDEFAULT;
			case MKAOSPackage.DYN_BLTL__VAL:
				return VAL_EDEFAULT == null ? val != null : !VAL_EDEFAULT.equals(val);
			case MKAOSPackage.DYN_BLTL__C:
				return c != null;
			case MKAOSPackage.DYN_BLTL__T:
				return t != null;
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
		result.append(" (q: ");
		result.append(q);
		result.append(", val: ");
		result.append(val);
		result.append(')');
		return result.toString();
	}

} //DynBLTLImpl
