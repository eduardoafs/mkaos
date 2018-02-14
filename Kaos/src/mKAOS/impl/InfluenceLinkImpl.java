/**
 */
package mKAOS.impl;

import KAOSModel.Entity;
import KAOSModel.Expectation;

import KAOSModel.impl.LinkImpl;

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
public class InfluenceLinkImpl extends LinkImpl implements InfluenceLink {
	/**
	 * The cached value of the '{@link #getExpectation() <em>Expectation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpectation()
	 * @generated
	 * @ordered
	 */
	protected Expectation expectation;

	/**
	 * The cached value of the '{@link #getInfluenced() <em>Influenced</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfluenced()
	 * @generated
	 * @ordered
	 */
	protected Entity influenced;

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
	public Expectation getExpectation() {
		if (expectation != null && expectation.eIsProxy()) {
			InternalEObject oldExpectation = (InternalEObject)expectation;
			expectation = (Expectation)eResolveProxy(oldExpectation);
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
	public Expectation basicGetExpectation() {
		return expectation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpectation(Expectation newExpectation) {
		Expectation oldExpectation = expectation;
		expectation = newExpectation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MKAOSPackage.INFLUENCE_LINK__EXPECTATION, oldExpectation, expectation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity getInfluenced() {
		if (influenced != null && influenced.eIsProxy()) {
			InternalEObject oldInfluenced = (InternalEObject)influenced;
			influenced = (Entity)eResolveProxy(oldInfluenced);
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
	public Entity basicGetInfluenced() {
		return influenced;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInfluenced(Entity newInfluenced) {
		Entity oldInfluenced = influenced;
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
				setExpectation((Expectation)newValue);
				return;
			case MKAOSPackage.INFLUENCE_LINK__INFLUENCED:
				setInfluenced((Entity)newValue);
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
				setExpectation((Expectation)null);
				return;
			case MKAOSPackage.INFLUENCE_LINK__INFLUENCED:
				setInfluenced((Entity)null);
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
