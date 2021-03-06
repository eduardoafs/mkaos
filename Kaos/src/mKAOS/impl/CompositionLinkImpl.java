/**
 */
package mKAOS.impl;

import KAOSModel.Entity;

import KAOSModel.impl.LinkImpl;

import mKAOS.CompositionLink;
import mKAOS.MKAOSPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composition Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mKAOS.impl.CompositionLinkImpl#getEntity <em>Entity</em>}</li>
 *   <li>{@link mKAOS.impl.CompositionLinkImpl#getComposedBy <em>Composed By</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompositionLinkImpl extends LinkImpl implements CompositionLink {
	/**
	 * The cached value of the '{@link #getEntity() <em>Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntity()
	 * @generated
	 * @ordered
	 */
	protected Entity entity;

	/**
	 * The cached value of the '{@link #getComposedBy() <em>Composed By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComposedBy()
	 * @generated
	 * @ordered
	 */
	protected Entity composedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositionLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MKAOSPackage.Literals.COMPOSITION_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity getEntity() {
		if (entity != null && entity.eIsProxy()) {
			InternalEObject oldEntity = (InternalEObject)entity;
			entity = (Entity)eResolveProxy(oldEntity);
			if (entity != oldEntity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MKAOSPackage.COMPOSITION_LINK__ENTITY, oldEntity, entity));
			}
		}
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetEntity() {
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntity(Entity newEntity) {
		Entity oldEntity = entity;
		entity = newEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MKAOSPackage.COMPOSITION_LINK__ENTITY, oldEntity, entity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity getComposedBy() {
		if (composedBy != null && composedBy.eIsProxy()) {
			InternalEObject oldComposedBy = (InternalEObject)composedBy;
			composedBy = (Entity)eResolveProxy(oldComposedBy);
			if (composedBy != oldComposedBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MKAOSPackage.COMPOSITION_LINK__COMPOSED_BY, oldComposedBy, composedBy));
			}
		}
		return composedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetComposedBy() {
		return composedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComposedBy(Entity newComposedBy) {
		Entity oldComposedBy = composedBy;
		composedBy = newComposedBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MKAOSPackage.COMPOSITION_LINK__COMPOSED_BY, oldComposedBy, composedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MKAOSPackage.COMPOSITION_LINK__ENTITY:
				if (resolve) return getEntity();
				return basicGetEntity();
			case MKAOSPackage.COMPOSITION_LINK__COMPOSED_BY:
				if (resolve) return getComposedBy();
				return basicGetComposedBy();
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
			case MKAOSPackage.COMPOSITION_LINK__ENTITY:
				setEntity((Entity)newValue);
				return;
			case MKAOSPackage.COMPOSITION_LINK__COMPOSED_BY:
				setComposedBy((Entity)newValue);
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
			case MKAOSPackage.COMPOSITION_LINK__ENTITY:
				setEntity((Entity)null);
				return;
			case MKAOSPackage.COMPOSITION_LINK__COMPOSED_BY:
				setComposedBy((Entity)null);
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
			case MKAOSPackage.COMPOSITION_LINK__ENTITY:
				return entity != null;
			case MKAOSPackage.COMPOSITION_LINK__COMPOSED_BY:
				return composedBy != null;
		}
		return super.eIsSet(featureID);
	}

} //CompositionLinkImpl
