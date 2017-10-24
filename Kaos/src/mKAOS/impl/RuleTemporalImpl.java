/**
 */
package mKAOS.impl;

import mKAOS.DynBLTL;
import mKAOS.MKAOSPackage;
import mKAOS.RuleBound;
import mKAOS.RuleImplication;
import mKAOS.RuleTempBinOp;
import mKAOS.RuleTempUnOp;
import mKAOS.RuleTemporal;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule Temporal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mKAOS.impl.RuleTemporalImpl#getVal1 <em>Val1</em>}</li>
 *   <li>{@link mKAOS.impl.RuleTemporalImpl#getB <em>B</em>}</li>
 *   <li>{@link mKAOS.impl.RuleTemporalImpl#getE <em>E</em>}</li>
 *   <li>{@link mKAOS.impl.RuleTemporalImpl#getO <em>O</em>}</li>
 *   <li>{@link mKAOS.impl.RuleTemporalImpl#getO1 <em>O1</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RuleTemporalImpl extends DynBLTLImpl implements RuleTemporal {
	/**
	 * The cached value of the '{@link #getVal1() <em>Val1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVal1()
	 * @generated
	 * @ordered
	 */
	protected RuleImplication val1;

	/**
	 * The cached value of the '{@link #getB() <em>B</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getB()
	 * @generated
	 * @ordered
	 */
	protected RuleBound b;

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
	 * The default value of the '{@link #getO() <em>O</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getO()
	 * @generated
	 * @ordered
	 */
	protected static final RuleTempBinOp O_EDEFAULT = RuleTempBinOp.UNTIL;

	/**
	 * The cached value of the '{@link #getO() <em>O</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getO()
	 * @generated
	 * @ordered
	 */
	protected RuleTempBinOp o = O_EDEFAULT;

	/**
	 * The default value of the '{@link #getO1() <em>O1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getO1()
	 * @generated
	 * @ordered
	 */
	protected static final RuleTempUnOp O1_EDEFAULT = RuleTempUnOp.GLOBALLY;

	/**
	 * The cached value of the '{@link #getO1() <em>O1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getO1()
	 * @generated
	 * @ordered
	 */
	protected RuleTempUnOp o1 = O1_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuleTemporalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MKAOSPackage.Literals.RULE_TEMPORAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleImplication getVal1() {
		return val1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVal1(RuleImplication newVal1, NotificationChain msgs) {
		RuleImplication oldVal1 = val1;
		val1 = newVal1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MKAOSPackage.RULE_TEMPORAL__VAL1, oldVal1, newVal1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVal1(RuleImplication newVal1) {
		if (newVal1 != val1) {
			NotificationChain msgs = null;
			if (val1 != null)
				msgs = ((InternalEObject)val1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MKAOSPackage.RULE_TEMPORAL__VAL1, null, msgs);
			if (newVal1 != null)
				msgs = ((InternalEObject)newVal1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MKAOSPackage.RULE_TEMPORAL__VAL1, null, msgs);
			msgs = basicSetVal1(newVal1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MKAOSPackage.RULE_TEMPORAL__VAL1, newVal1, newVal1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleBound getB() {
		return b;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetB(RuleBound newB, NotificationChain msgs) {
		RuleBound oldB = b;
		b = newB;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MKAOSPackage.RULE_TEMPORAL__B, oldB, newB);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setB(RuleBound newB) {
		if (newB != b) {
			NotificationChain msgs = null;
			if (b != null)
				msgs = ((InternalEObject)b).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MKAOSPackage.RULE_TEMPORAL__B, null, msgs);
			if (newB != null)
				msgs = ((InternalEObject)newB).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MKAOSPackage.RULE_TEMPORAL__B, null, msgs);
			msgs = basicSetB(newB, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MKAOSPackage.RULE_TEMPORAL__B, newB, newB));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MKAOSPackage.RULE_TEMPORAL__E, oldE, newE);
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
				msgs = ((InternalEObject)e).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MKAOSPackage.RULE_TEMPORAL__E, null, msgs);
			if (newE != null)
				msgs = ((InternalEObject)newE).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MKAOSPackage.RULE_TEMPORAL__E, null, msgs);
			msgs = basicSetE(newE, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MKAOSPackage.RULE_TEMPORAL__E, newE, newE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleTempBinOp getO() {
		return o;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setO(RuleTempBinOp newO) {
		RuleTempBinOp oldO = o;
		o = newO == null ? O_EDEFAULT : newO;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MKAOSPackage.RULE_TEMPORAL__O, oldO, o));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleTempUnOp getO1() {
		return o1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setO1(RuleTempUnOp newO1) {
		RuleTempUnOp oldO1 = o1;
		o1 = newO1 == null ? O1_EDEFAULT : newO1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MKAOSPackage.RULE_TEMPORAL__O1, oldO1, o1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MKAOSPackage.RULE_TEMPORAL__VAL1:
				return basicSetVal1(null, msgs);
			case MKAOSPackage.RULE_TEMPORAL__B:
				return basicSetB(null, msgs);
			case MKAOSPackage.RULE_TEMPORAL__E:
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
			case MKAOSPackage.RULE_TEMPORAL__VAL1:
				return getVal1();
			case MKAOSPackage.RULE_TEMPORAL__B:
				return getB();
			case MKAOSPackage.RULE_TEMPORAL__E:
				return getE();
			case MKAOSPackage.RULE_TEMPORAL__O:
				return getO();
			case MKAOSPackage.RULE_TEMPORAL__O1:
				return getO1();
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
			case MKAOSPackage.RULE_TEMPORAL__VAL1:
				setVal1((RuleImplication)newValue);
				return;
			case MKAOSPackage.RULE_TEMPORAL__B:
				setB((RuleBound)newValue);
				return;
			case MKAOSPackage.RULE_TEMPORAL__E:
				setE((DynBLTL)newValue);
				return;
			case MKAOSPackage.RULE_TEMPORAL__O:
				setO((RuleTempBinOp)newValue);
				return;
			case MKAOSPackage.RULE_TEMPORAL__O1:
				setO1((RuleTempUnOp)newValue);
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
			case MKAOSPackage.RULE_TEMPORAL__VAL1:
				setVal1((RuleImplication)null);
				return;
			case MKAOSPackage.RULE_TEMPORAL__B:
				setB((RuleBound)null);
				return;
			case MKAOSPackage.RULE_TEMPORAL__E:
				setE((DynBLTL)null);
				return;
			case MKAOSPackage.RULE_TEMPORAL__O:
				setO(O_EDEFAULT);
				return;
			case MKAOSPackage.RULE_TEMPORAL__O1:
				setO1(O1_EDEFAULT);
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
			case MKAOSPackage.RULE_TEMPORAL__VAL1:
				return val1 != null;
			case MKAOSPackage.RULE_TEMPORAL__B:
				return b != null;
			case MKAOSPackage.RULE_TEMPORAL__E:
				return e != null;
			case MKAOSPackage.RULE_TEMPORAL__O:
				return o != O_EDEFAULT;
			case MKAOSPackage.RULE_TEMPORAL__O1:
				return o1 != O1_EDEFAULT;
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
		result.append(" (o: ");
		result.append(o);
		result.append(", o1: ");
		result.append(o1);
		result.append(')');
		return result.toString();
	}

} //RuleTemporalImpl
