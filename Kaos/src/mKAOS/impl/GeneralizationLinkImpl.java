/**
 */
package mKAOS.impl;

import mKAOS.GeneralizationLink;
import mKAOS.MKAOSPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generalization Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mKAOS.impl.GeneralizationLinkImpl#getEntity <em>Entity</em>}</li>
 *   <li>{@link mKAOS.impl.GeneralizationLinkImpl#getGeneralizes <em>Generalizes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GeneralizationLinkImpl extends mKAOS.impl.LinkImpl implements GeneralizationLink {
	/**
	 * The cached value of the '{@link #getEntity() <em>Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntity()
	 * @generated
	 * @ordered
	 */
	protected mKAOS.Entity entity;

	/**
	 * The cached value of the '{@link #getGeneralizes() <em>Generalizes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralizes()
	 * @generated
	 * @ordered
	 */
	protected mKAOS.Entity generalizes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneralizationLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MKAOSPackage.Literals.GENERALIZATION_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public mKAOS.Entity getEntity() {
		if (entity != null && entity.eIsProxy()) {
			InternalEObject oldEntity = (InternalEObject)entity;
			entity = (mKAOS.Entity)eResolveProxy(oldEntity);
			if (entity != oldEntity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MKAOSPackage.GENERALIZATION_LINK__ENTITY, oldEntity, entity));
			}
		}
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public mKAOS.Entity basicGetEntity() {
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntity(mKAOS.Entity newEntity) {
		mKAOS.Entity oldEntity = entity;
		entity = newEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MKAOSPackage.GENERALIZATION_LINK__ENTITY, oldEntity, entity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public mKAOS.Entity getGeneralizes() {
		if (generalizes != null && generalizes.eIsProxy()) {
			InternalEObject oldGeneralizes = (InternalEObject)generalizes;
			generalizes = (mKAOS.Entity)eResolveProxy(oldGeneralizes);
			if (generalizes != oldGeneralizes) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MKAOSPackage.GENERALIZATION_LINK__GENERALIZES, oldGeneralizes, generalizes));
			}
		}
		return generalizes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public mKAOS.Entity basicGetGeneralizes() {
		return generalizes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneralizes(mKAOS.Entity newGeneralizes) {
		mKAOS.Entity oldGeneralizes = generalizes;
		generalizes = newGeneralizes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MKAOSPackage.GENERALIZATION_LINK__GENERALIZES, oldGeneralizes, generalizes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MKAOSPackage.GENERALIZATION_LINK__ENTITY:
				if (resolve) return getEntity();
				return basicGetEntity();
			case MKAOSPackage.GENERALIZATION_LINK__GENERALIZES:
				if (resolve) return getGeneralizes();
				return basicGetGeneralizes();
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
			case MKAOSPackage.GENERALIZATION_LINK__ENTITY:
				setEntity((mKAOS.Entity)newValue);
				return;
			case MKAOSPackage.GENERALIZATION_LINK__GENERALIZES:
				setGeneralizes((mKAOS.Entity)newValue);
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
			case MKAOSPackage.GENERALIZATION_LINK__ENTITY:
				setEntity((mKAOS.Entity)null);
				return;
			case MKAOSPackage.GENERALIZATION_LINK__GENERALIZES:
				setGeneralizes((mKAOS.Entity)null);
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
			case MKAOSPackage.GENERALIZATION_LINK__ENTITY:
				return entity != null;
			case MKAOSPackage.GENERALIZATION_LINK__GENERALIZES:
				return generalizes != null;
		}
		return super.eIsSet(featureID);
	}

} //GeneralizationLinkImpl
