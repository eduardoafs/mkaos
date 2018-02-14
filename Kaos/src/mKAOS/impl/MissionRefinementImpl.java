/**
 */
package mKAOS.impl;

import KAOSModel.impl.RefinementImpl;

import java.util.Collection;

import mKAOS.DynBLTL;
import mKAOS.MKAOSPackage;
import mKAOS.Mission;
import mKAOS.MissionRefinement;
import mKAOS.MissionRefinementKind;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mission Refinement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mKAOS.impl.MissionRefinementImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link mKAOS.impl.MissionRefinementImpl#getCustom <em>Custom</em>}</li>
 *   <li>{@link mKAOS.impl.MissionRefinementImpl#getSubmissions <em>Submissions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MissionRefinementImpl extends RefinementImpl implements MissionRefinement {
	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final MissionRefinementKind KIND_EDEFAULT = MissionRefinementKind.CUSTOM;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected MissionRefinementKind kind = KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCustom() <em>Custom</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustom()
	 * @generated
	 * @ordered
	 */
	protected DynBLTL custom;

	/**
	 * The cached value of the '{@link #getSubmissions() <em>Submissions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubmissions()
	 * @generated
	 * @ordered
	 */
	protected EList<Mission> submissions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MissionRefinementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MKAOSPackage.Literals.MISSION_REFINEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MissionRefinementKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(MissionRefinementKind newKind) {
		MissionRefinementKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MKAOSPackage.MISSION_REFINEMENT__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DynBLTL getCustom() {
		return custom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustom(DynBLTL newCustom, NotificationChain msgs) {
		DynBLTL oldCustom = custom;
		custom = newCustom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MKAOSPackage.MISSION_REFINEMENT__CUSTOM, oldCustom, newCustom);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustom(DynBLTL newCustom) {
		if (newCustom != custom) {
			NotificationChain msgs = null;
			if (custom != null)
				msgs = ((InternalEObject)custom).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MKAOSPackage.MISSION_REFINEMENT__CUSTOM, null, msgs);
			if (newCustom != null)
				msgs = ((InternalEObject)newCustom).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MKAOSPackage.MISSION_REFINEMENT__CUSTOM, null, msgs);
			msgs = basicSetCustom(newCustom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MKAOSPackage.MISSION_REFINEMENT__CUSTOM, newCustom, newCustom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Mission> getSubmissions() {
		if (submissions == null) {
			submissions = new EObjectContainmentEList<Mission>(Mission.class, this, MKAOSPackage.MISSION_REFINEMENT__SUBMISSIONS);
		}
		return submissions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MKAOSPackage.MISSION_REFINEMENT__CUSTOM:
				return basicSetCustom(null, msgs);
			case MKAOSPackage.MISSION_REFINEMENT__SUBMISSIONS:
				return ((InternalEList<?>)getSubmissions()).basicRemove(otherEnd, msgs);
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
			case MKAOSPackage.MISSION_REFINEMENT__KIND:
				return getKind();
			case MKAOSPackage.MISSION_REFINEMENT__CUSTOM:
				return getCustom();
			case MKAOSPackage.MISSION_REFINEMENT__SUBMISSIONS:
				return getSubmissions();
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
			case MKAOSPackage.MISSION_REFINEMENT__KIND:
				setKind((MissionRefinementKind)newValue);
				return;
			case MKAOSPackage.MISSION_REFINEMENT__CUSTOM:
				setCustom((DynBLTL)newValue);
				return;
			case MKAOSPackage.MISSION_REFINEMENT__SUBMISSIONS:
				getSubmissions().clear();
				getSubmissions().addAll((Collection<? extends Mission>)newValue);
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
			case MKAOSPackage.MISSION_REFINEMENT__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case MKAOSPackage.MISSION_REFINEMENT__CUSTOM:
				setCustom((DynBLTL)null);
				return;
			case MKAOSPackage.MISSION_REFINEMENT__SUBMISSIONS:
				getSubmissions().clear();
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
			case MKAOSPackage.MISSION_REFINEMENT__KIND:
				return kind != KIND_EDEFAULT;
			case MKAOSPackage.MISSION_REFINEMENT__CUSTOM:
				return custom != null;
			case MKAOSPackage.MISSION_REFINEMENT__SUBMISSIONS:
				return submissions != null && !submissions.isEmpty();
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
		result.append(" (kind: ");
		result.append(kind);
		result.append(')');
		return result.toString();
	}

} //MissionRefinementImpl
