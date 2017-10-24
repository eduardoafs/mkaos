/**
 */
package KAOSModel.impl;

import KAOSModel.Goal;
import KAOSModel.KAOSModelPackage;
import KAOSModel.Obstacle;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Goal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link KAOSModel.impl.GoalImpl#getResolve <em>Resolve</em>}</li>
 *   <li>{@link KAOSModel.impl.GoalImpl#getConflicts <em>Conflicts</em>}</li>
 *   <li>{@link KAOSModel.impl.GoalImpl#getConcerns <em>Concerns</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GoalImpl extends RefinableNodeImpl implements Goal {
	/**
	 * The cached value of the '{@link #getResolve() <em>Resolve</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolve()
	 * @generated
	 * @ordered
	 */
	protected EList<Obstacle> resolve;

	/**
	 * The cached value of the '{@link #getConflicts() <em>Conflicts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConflicts()
	 * @generated
	 * @ordered
	 */
	protected EList<Goal> conflicts;

	/**
	 * The cached value of the '{@link #getConcerns() <em>Concerns</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcerns()
	 * @generated
	 * @ordered
	 */
	protected EList<KAOSModel.Object> concerns;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GoalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KAOSModelPackage.Literals.GOAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Obstacle> getResolve() {
		if (resolve == null) {
			resolve = new EObjectResolvingEList<Obstacle>(Obstacle.class, this, KAOSModelPackage.GOAL__RESOLVE);
		}
		return resolve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Goal> getConflicts() {
		if (conflicts == null) {
			conflicts = new EObjectResolvingEList<Goal>(Goal.class, this, KAOSModelPackage.GOAL__CONFLICTS);
		}
		return conflicts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KAOSModel.Object> getConcerns() {
		if (concerns == null) {
			concerns = new EObjectResolvingEList<KAOSModel.Object>(KAOSModel.Object.class, this, KAOSModelPackage.GOAL__CONCERNS);
		}
		return concerns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KAOSModelPackage.GOAL__RESOLVE:
				return getResolve();
			case KAOSModelPackage.GOAL__CONFLICTS:
				return getConflicts();
			case KAOSModelPackage.GOAL__CONCERNS:
				return getConcerns();
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
			case KAOSModelPackage.GOAL__RESOLVE:
				getResolve().clear();
				getResolve().addAll((Collection<? extends Obstacle>)newValue);
				return;
			case KAOSModelPackage.GOAL__CONFLICTS:
				getConflicts().clear();
				getConflicts().addAll((Collection<? extends Goal>)newValue);
				return;
			case KAOSModelPackage.GOAL__CONCERNS:
				getConcerns().clear();
				getConcerns().addAll((Collection<? extends KAOSModel.Object>)newValue);
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
			case KAOSModelPackage.GOAL__RESOLVE:
				getResolve().clear();
				return;
			case KAOSModelPackage.GOAL__CONFLICTS:
				getConflicts().clear();
				return;
			case KAOSModelPackage.GOAL__CONCERNS:
				getConcerns().clear();
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
			case KAOSModelPackage.GOAL__RESOLVE:
				return resolve != null && !resolve.isEmpty();
			case KAOSModelPackage.GOAL__CONFLICTS:
				return conflicts != null && !conflicts.isEmpty();
			case KAOSModelPackage.GOAL__CONCERNS:
				return concerns != null && !concerns.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GoalImpl
