/**
 */
package mKAOS.impl;

import java.util.Collection;

import mKAOS.MKAOSPackage;
import mKAOS.RuleConjunction;
import mKAOS.RuleDisjunction;

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
 * An implementation of the model object '<em><b>Rule Disjunction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mKAOS.impl.RuleDisjunctionImpl#getL <em>L</em>}</li>
 *   <li>{@link mKAOS.impl.RuleDisjunctionImpl#getR <em>R</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RuleDisjunctionImpl extends MinimalEObjectImpl.Container implements RuleDisjunction {
	/**
	 * The cached value of the '{@link #getL() <em>L</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL()
	 * @generated
	 * @ordered
	 */
	protected RuleConjunction l;

	/**
	 * The cached value of the '{@link #getR() <em>R</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getR()
	 * @generated
	 * @ordered
	 */
	protected EList<RuleConjunction> r;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuleDisjunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MKAOSPackage.Literals.RULE_DISJUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleConjunction getL() {
		return l;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetL(RuleConjunction newL, NotificationChain msgs) {
		RuleConjunction oldL = l;
		l = newL;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MKAOSPackage.RULE_DISJUNCTION__L, oldL, newL);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setL(RuleConjunction newL) {
		if (newL != l) {
			NotificationChain msgs = null;
			if (l != null)
				msgs = ((InternalEObject)l).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MKAOSPackage.RULE_DISJUNCTION__L, null, msgs);
			if (newL != null)
				msgs = ((InternalEObject)newL).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MKAOSPackage.RULE_DISJUNCTION__L, null, msgs);
			msgs = basicSetL(newL, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MKAOSPackage.RULE_DISJUNCTION__L, newL, newL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RuleConjunction> getR() {
		if (r == null) {
			r = new EObjectContainmentEList<RuleConjunction>(RuleConjunction.class, this, MKAOSPackage.RULE_DISJUNCTION__R);
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
			case MKAOSPackage.RULE_DISJUNCTION__L:
				return basicSetL(null, msgs);
			case MKAOSPackage.RULE_DISJUNCTION__R:
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
			case MKAOSPackage.RULE_DISJUNCTION__L:
				return getL();
			case MKAOSPackage.RULE_DISJUNCTION__R:
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
			case MKAOSPackage.RULE_DISJUNCTION__L:
				setL((RuleConjunction)newValue);
				return;
			case MKAOSPackage.RULE_DISJUNCTION__R:
				getR().clear();
				getR().addAll((Collection<? extends RuleConjunction>)newValue);
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
			case MKAOSPackage.RULE_DISJUNCTION__L:
				setL((RuleConjunction)null);
				return;
			case MKAOSPackage.RULE_DISJUNCTION__R:
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
			case MKAOSPackage.RULE_DISJUNCTION__L:
				return l != null;
			case MKAOSPackage.RULE_DISJUNCTION__R:
				return r != null && !r.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RuleDisjunctionImpl
