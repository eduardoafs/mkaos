/**
 */
package mKAOS.impl;

import mKAOS.DynBLTL;
import mKAOS.MKAOSPackage;
import mKAOS.RuleFactor;
import mKAOS.RuleFunction;
import mKAOS.RuleLiteral;
import mKAOS.RuleVar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule Factor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mKAOS.impl.RuleFactorImpl#getVallit <em>Vallit</em>}</li>
 *   <li>{@link mKAOS.impl.RuleFactorImpl#getValvar <em>Valvar</em>}</li>
 *   <li>{@link mKAOS.impl.RuleFactorImpl#getValfun <em>Valfun</em>}</li>
 *   <li>{@link mKAOS.impl.RuleFactorImpl#getCurl <em>Curl</em>}</li>
 *   <li>{@link mKAOS.impl.RuleFactorImpl#getPar <em>Par</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RuleFactorImpl extends MinimalEObjectImpl.Container implements RuleFactor {
	/**
	 * The cached value of the '{@link #getVallit() <em>Vallit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVallit()
	 * @generated
	 * @ordered
	 */
	protected RuleLiteral vallit;

	/**
	 * The cached value of the '{@link #getValvar() <em>Valvar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValvar()
	 * @generated
	 * @ordered
	 */
	protected RuleVar valvar;

	/**
	 * The cached value of the '{@link #getValfun() <em>Valfun</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValfun()
	 * @generated
	 * @ordered
	 */
	protected RuleFunction valfun;

	/**
	 * The cached value of the '{@link #getCurl() <em>Curl</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurl()
	 * @generated
	 * @ordered
	 */
	protected DynBLTL curl;

	/**
	 * The cached value of the '{@link #getPar() <em>Par</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPar()
	 * @generated
	 * @ordered
	 */
	protected DynBLTL par;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuleFactorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MKAOSPackage.Literals.RULE_FACTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleLiteral getVallit() {
		return vallit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVallit(RuleLiteral newVallit, NotificationChain msgs) {
		RuleLiteral oldVallit = vallit;
		vallit = newVallit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MKAOSPackage.RULE_FACTOR__VALLIT, oldVallit, newVallit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVallit(RuleLiteral newVallit) {
		if (newVallit != vallit) {
			NotificationChain msgs = null;
			if (vallit != null)
				msgs = ((InternalEObject)vallit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MKAOSPackage.RULE_FACTOR__VALLIT, null, msgs);
			if (newVallit != null)
				msgs = ((InternalEObject)newVallit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MKAOSPackage.RULE_FACTOR__VALLIT, null, msgs);
			msgs = basicSetVallit(newVallit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MKAOSPackage.RULE_FACTOR__VALLIT, newVallit, newVallit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleVar getValvar() {
		return valvar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValvar(RuleVar newValvar, NotificationChain msgs) {
		RuleVar oldValvar = valvar;
		valvar = newValvar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MKAOSPackage.RULE_FACTOR__VALVAR, oldValvar, newValvar);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValvar(RuleVar newValvar) {
		if (newValvar != valvar) {
			NotificationChain msgs = null;
			if (valvar != null)
				msgs = ((InternalEObject)valvar).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MKAOSPackage.RULE_FACTOR__VALVAR, null, msgs);
			if (newValvar != null)
				msgs = ((InternalEObject)newValvar).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MKAOSPackage.RULE_FACTOR__VALVAR, null, msgs);
			msgs = basicSetValvar(newValvar, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MKAOSPackage.RULE_FACTOR__VALVAR, newValvar, newValvar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleFunction getValfun() {
		return valfun;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValfun(RuleFunction newValfun, NotificationChain msgs) {
		RuleFunction oldValfun = valfun;
		valfun = newValfun;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MKAOSPackage.RULE_FACTOR__VALFUN, oldValfun, newValfun);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValfun(RuleFunction newValfun) {
		if (newValfun != valfun) {
			NotificationChain msgs = null;
			if (valfun != null)
				msgs = ((InternalEObject)valfun).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MKAOSPackage.RULE_FACTOR__VALFUN, null, msgs);
			if (newValfun != null)
				msgs = ((InternalEObject)newValfun).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MKAOSPackage.RULE_FACTOR__VALFUN, null, msgs);
			msgs = basicSetValfun(newValfun, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MKAOSPackage.RULE_FACTOR__VALFUN, newValfun, newValfun));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DynBLTL getCurl() {
		return curl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCurl(DynBLTL newCurl, NotificationChain msgs) {
		DynBLTL oldCurl = curl;
		curl = newCurl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MKAOSPackage.RULE_FACTOR__CURL, oldCurl, newCurl);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurl(DynBLTL newCurl) {
		if (newCurl != curl) {
			NotificationChain msgs = null;
			if (curl != null)
				msgs = ((InternalEObject)curl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MKAOSPackage.RULE_FACTOR__CURL, null, msgs);
			if (newCurl != null)
				msgs = ((InternalEObject)newCurl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MKAOSPackage.RULE_FACTOR__CURL, null, msgs);
			msgs = basicSetCurl(newCurl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MKAOSPackage.RULE_FACTOR__CURL, newCurl, newCurl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DynBLTL getPar() {
		return par;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPar(DynBLTL newPar, NotificationChain msgs) {
		DynBLTL oldPar = par;
		par = newPar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MKAOSPackage.RULE_FACTOR__PAR, oldPar, newPar);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPar(DynBLTL newPar) {
		if (newPar != par) {
			NotificationChain msgs = null;
			if (par != null)
				msgs = ((InternalEObject)par).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MKAOSPackage.RULE_FACTOR__PAR, null, msgs);
			if (newPar != null)
				msgs = ((InternalEObject)newPar).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MKAOSPackage.RULE_FACTOR__PAR, null, msgs);
			msgs = basicSetPar(newPar, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MKAOSPackage.RULE_FACTOR__PAR, newPar, newPar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MKAOSPackage.RULE_FACTOR__VALLIT:
				return basicSetVallit(null, msgs);
			case MKAOSPackage.RULE_FACTOR__VALVAR:
				return basicSetValvar(null, msgs);
			case MKAOSPackage.RULE_FACTOR__VALFUN:
				return basicSetValfun(null, msgs);
			case MKAOSPackage.RULE_FACTOR__CURL:
				return basicSetCurl(null, msgs);
			case MKAOSPackage.RULE_FACTOR__PAR:
				return basicSetPar(null, msgs);
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
			case MKAOSPackage.RULE_FACTOR__VALLIT:
				return getVallit();
			case MKAOSPackage.RULE_FACTOR__VALVAR:
				return getValvar();
			case MKAOSPackage.RULE_FACTOR__VALFUN:
				return getValfun();
			case MKAOSPackage.RULE_FACTOR__CURL:
				return getCurl();
			case MKAOSPackage.RULE_FACTOR__PAR:
				return getPar();
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
			case MKAOSPackage.RULE_FACTOR__VALLIT:
				setVallit((RuleLiteral)newValue);
				return;
			case MKAOSPackage.RULE_FACTOR__VALVAR:
				setValvar((RuleVar)newValue);
				return;
			case MKAOSPackage.RULE_FACTOR__VALFUN:
				setValfun((RuleFunction)newValue);
				return;
			case MKAOSPackage.RULE_FACTOR__CURL:
				setCurl((DynBLTL)newValue);
				return;
			case MKAOSPackage.RULE_FACTOR__PAR:
				setPar((DynBLTL)newValue);
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
			case MKAOSPackage.RULE_FACTOR__VALLIT:
				setVallit((RuleLiteral)null);
				return;
			case MKAOSPackage.RULE_FACTOR__VALVAR:
				setValvar((RuleVar)null);
				return;
			case MKAOSPackage.RULE_FACTOR__VALFUN:
				setValfun((RuleFunction)null);
				return;
			case MKAOSPackage.RULE_FACTOR__CURL:
				setCurl((DynBLTL)null);
				return;
			case MKAOSPackage.RULE_FACTOR__PAR:
				setPar((DynBLTL)null);
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
			case MKAOSPackage.RULE_FACTOR__VALLIT:
				return vallit != null;
			case MKAOSPackage.RULE_FACTOR__VALVAR:
				return valvar != null;
			case MKAOSPackage.RULE_FACTOR__VALFUN:
				return valfun != null;
			case MKAOSPackage.RULE_FACTOR__CURL:
				return curl != null;
			case MKAOSPackage.RULE_FACTOR__PAR:
				return par != null;
		}
		return super.eIsSet(featureID);
	}

} //RuleFactorImpl
