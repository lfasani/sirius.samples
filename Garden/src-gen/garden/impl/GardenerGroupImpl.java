/**
 */
package garden.impl;

import garden.GardenPackage;
import garden.Gardener;
import garden.GardenerGroup;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gardener Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link garden.impl.GardenerGroupImpl#getSubGroups <em>Sub Groups</em>}</li>
 *   <li>{@link garden.impl.GardenerGroupImpl#getGardeners <em>Gardeners</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GardenerGroupImpl extends NamedElementImpl implements GardenerGroup {
	/**
     * The cached value of the '{@link #getSubGroups() <em>Sub Groups</em>}' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getSubGroups()
     * @generated
     * @ordered
     */
	protected EList<GardenerGroup> subGroups;

	/**
     * The cached value of the '{@link #getGardeners() <em>Gardeners</em>}' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getGardeners()
     * @generated
     * @ordered
     */
	protected EList<Gardener> gardeners;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected GardenerGroupImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return GardenPackage.Literals.GARDENER_GROUP;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<GardenerGroup> getSubGroups() {
        if (subGroups == null) {
            subGroups = new EObjectContainmentEList.Resolving<GardenerGroup>(GardenerGroup.class, this, GardenPackage.GARDENER_GROUP__SUB_GROUPS);
        }
        return subGroups;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<Gardener> getGardeners() {
        if (gardeners == null) {
            gardeners = new EObjectContainmentEList.Resolving<Gardener>(Gardener.class, this, GardenPackage.GARDENER_GROUP__GARDENERS);
        }
        return gardeners;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case GardenPackage.GARDENER_GROUP__SUB_GROUPS:
                return ((InternalEList<?>)getSubGroups()).basicRemove(otherEnd, msgs);
            case GardenPackage.GARDENER_GROUP__GARDENERS:
                return ((InternalEList<?>)getGardeners()).basicRemove(otherEnd, msgs);
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
            case GardenPackage.GARDENER_GROUP__SUB_GROUPS:
                return getSubGroups();
            case GardenPackage.GARDENER_GROUP__GARDENERS:
                return getGardeners();
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
            case GardenPackage.GARDENER_GROUP__SUB_GROUPS:
                getSubGroups().clear();
                getSubGroups().addAll((Collection<? extends GardenerGroup>)newValue);
                return;
            case GardenPackage.GARDENER_GROUP__GARDENERS:
                getGardeners().clear();
                getGardeners().addAll((Collection<? extends Gardener>)newValue);
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
            case GardenPackage.GARDENER_GROUP__SUB_GROUPS:
                getSubGroups().clear();
                return;
            case GardenPackage.GARDENER_GROUP__GARDENERS:
                getGardeners().clear();
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
            case GardenPackage.GARDENER_GROUP__SUB_GROUPS:
                return subGroups != null && !subGroups.isEmpty();
            case GardenPackage.GARDENER_GROUP__GARDENERS:
                return gardeners != null && !gardeners.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //GardenerGroupImpl
