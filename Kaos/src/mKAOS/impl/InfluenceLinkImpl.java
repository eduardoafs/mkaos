/**
 */
package mKAOS.impl;

import mKAOS.InfluenceLink;
import mKAOS.MKAOSPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Influence Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mKAOS.impl.InfluenceLinkImpl#getExpectation <em>Expectation</em>}</li>
 *   <li>{@link mKAOS.impl.InfluenceLinkImpl#getInfluenced <em>Influenced</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InfluenceLinkImpl extends mKAOS.impl.LinkImpl implements InfluenceLink {
	/**
	 * The cached value of the '{@link #getExpectation() <em>Expectation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpectation()
	 * @generated
	 * @ordered
	 */
	protected mKAOS.Expectation expectation;

	/**
	 * The cached value of the '{@link #getInfluenced() <em>Influenced</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfluenced()
	 * @generated
	 * @ordered
	 */
	protected mKAOS.Entity influenced;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InfluenceLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MKAOSPackage.Literals.INFLUENCE_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public mKAOS.Expectation getExpectation() {
		if (expectation != null && expectation.eIsProxy()) {
			InternalEObject oldExpectation = (InternalEObject)expectation;
			expectation = (mKAOS.Expectation)eResolveProxy(oldExpectation);
			if (expectation != oldExpectation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MKAOSPackage.INFLUENCE_LINK__EXPECTATION, oldExpectation, expectation));
			}
		}
		return expectation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public mKAOS.Expectation basicGetExpectation() {
		return expectation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpectation(mKAOS.Expectation newExpectation) {
		mKAOS.Expectation oldExpectation = expectation;
		expectation = newExpectation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MKAOSPackage.INFLUENCE_LINK__EXPECTATION, oldExpectation, expectation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public mKAOS.Entity getInfluenced() {
		if (influenced != null && influenced.eIsProxy()) {
			InternalEObject oldInfluenced = (InternalEObject)influenced;
			influenced = (mKAOS.Entity)eResolveProxy(oldInfluenced);
			if (influenced != oldInfluenced) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MKAOSPackage.INFLUENCE_LINK__INFLUENCED, oldInfluenced, influenced));
			}
		}
		return influenced;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public mKAOS.Entity basicGetInfluenced() {
		return influenced;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInfluenced(mKAOS.Entity newInfluenced) {
		mKAOS.Entity oldInfluenced = influenced;
		influenced = newInfluenced;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MKAOSPackage.INFLUENCE_LINK__INFLUENCED, oldInfluenced, influenced));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MKAOSPackage.INFLUENCE_LINK__EXPECTATION:
				if (resolve) return getExpectation();
				return basicGetExpectation();
			case MKAOSPackage.INFLUENCE_LINK__INFLUENCED:
				if (resolve) return getInfluenced();
				return basicGetInfluenced();
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
			case MKAOSPackage.INFLUENCE_LINK__EXPECTATION:
				setExpectation((mKAOS.Expectation)newValue);
				return;
			case MKAOSPackage.INFLUENCE_LINK__INFLUENCED:
				setInfluenced((mKAOS.Entity)newValue);
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
			case MKAOSPackage.INFLUENCE_LINK__EXPECTATION:
				setExpectation((mKAOS.Expectation)null);
				return;
			case MKAOSPackage.INFLUENCE_LINK__INFLUENCED:
				setInfluenced((mKAOS.Entity)null);
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
			case MKAOSPackage.INFLUENCE_LINK__EXPECTATION:
				return expectation != null;
			case MKAOSPackage.INFLUENCE_LINK__INFLUENCED:
				return influenced != null;
		}
		return super.eIsSet(featureID);
	}

} //InfluenceLinkImpl
