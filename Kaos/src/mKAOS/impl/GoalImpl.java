/**
 */
package mKAOS.impl;

import java.util.Collection;

import mKAOS.Goal;
import mKAOS.MKAOSPackage;
import mKAOS.Obstacle;

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
 *   <li>{@link mKAOS.impl.GoalImpl#getResolve <em>Resolve</em>}</li>
 *   <li>{@link mKAOS.impl.GoalImpl#getConflicts <em>Conflicts</em>}</li>
 *   <li>{@link mKAOS.impl.GoalImpl#getConcerns <em>Concerns</em>}</li>
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
	protected EList<mKAOS.Object> concerns;

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
		return MKAOSPackage.Literals.GOAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Obstacle> getResolve() {
		if (resolve == null) {
			resolve = new EObjectResolvingEList<Obstacle>(Obstacle.class, this, MKAOSPackage.GOAL__RESOLVE);
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
			conflicts = new EObjectResolvingEList<Goal>(Goal.class, this, MKAOSPackage.GOAL__CONFLICTS);
		}
		return conflicts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<mKAOS.Object> getConcerns() {
		if (concerns == null) {
			concerns = new EObjectResolvingEList<mKAOS.Object>(mKAOS.Object.class, this, MKAOSPackage.GOAL__CONCERNS);
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
			case MKAOSPackage.GOAL__RESOLVE:
				return getResolve();
			case MKAOSPackage.GOAL__CONFLICTS:
				return getConflicts();
			case MKAOSPackage.GOAL__CONCERNS:
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
			case MKAOSPackage.GOAL__RESOLVE:
				getResolve().clear();
				getResolve().addAll((Collection<? extends Obstacle>)newValue);
				return;
			case MKAOSPackage.GOAL__CONFLICTS:
				getConflicts().clear();
				getConflicts().addAll((Collection<? extends Goal>)newValue);
				return;
			case MKAOSPackage.GOAL__CONCERNS:
				getConcerns().clear();
				getConcerns().addAll((Collection<? extends mKAOS.Object>)newValue);
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
			case MKAOSPackage.GOAL__RESOLVE:
				getResolve().clear();
				return;
			case MKAOSPackage.GOAL__CONFLICTS:
				getConflicts().clear();
				return;
			case MKAOSPackage.GOAL__CONCERNS:
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
			case MKAOSPackage.GOAL__RESOLVE:
				return resolve != null && !resolve.isEmpty();
			case MKAOSPackage.GOAL__CONFLICTS:
				return conflicts != null && !conflicts.isEmpty();
			case MKAOSPackage.GOAL__CONCERNS:
				return concerns != null && !concerns.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GoalImpl
