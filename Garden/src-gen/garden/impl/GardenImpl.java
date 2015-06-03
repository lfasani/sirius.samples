/**
 */
package garden.impl;

import garden.Garden;
import garden.GardenPackage;
import garden.Zone;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Garden</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link garden.impl.GardenImpl#getZones <em>Zones</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GardenImpl extends NamedElementImpl implements Garden {
	/**
     * The cached value of the '{@link #getZones() <em>Zones</em>}' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getZones()
     * @generated
     * @ordered
     */
	protected EList<Zone> zones;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected GardenImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return GardenPackage.Literals.GARDEN;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<Zone> getZones() {
        if (zones == null) {
            zones = new EObjectContainmentEList.Resolving<Zone>(Zone.class, this, GardenPackage.GARDEN__ZONES);
        }
        return zones;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case GardenPackage.GARDEN__ZONES:
                return ((InternalEList<?>)getZones()).basicRemove(otherEnd, msgs);
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
            case GardenPackage.GARDEN__ZONES:
                return getZones();
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
            case GardenPackage.GARDEN__ZONES:
                getZones().clear();
                getZones().addAll((Collection<? extends Zone>)newValue);
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
            case GardenPackage.GARDEN__ZONES:
                getZones().clear();
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
            case GardenPackage.GARDEN__ZONES:
                return zones != null && !zones.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //GardenImpl
