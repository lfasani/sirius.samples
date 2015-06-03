/**
 */
package garden.impl;

import garden.GardenPackage;
import garden.Gardener;
import garden.PathWay;
import garden.Tree;
import garden.Zone;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Zone</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link garden.impl.ZoneImpl#getZones <em>Zones</em>}</li>
 *   <li>{@link garden.impl.ZoneImpl#getTrees <em>Trees</em>}</li>
 *   <li>{@link garden.impl.ZoneImpl#getPathways <em>Pathways</em>}</li>
 *   <li>{@link garden.impl.ZoneImpl#getMaintainedBy <em>Maintained By</em>}</li>
 *   <li>{@link garden.impl.ZoneImpl#getResponsible <em>Responsible</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ZoneImpl extends NamedElementImpl implements Zone {
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
     * The cached value of the '{@link #getTrees() <em>Trees</em>}' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getTrees()
     * @generated
     * @ordered
     */
	protected EList<Tree> trees;

	/**
     * The cached value of the '{@link #getPathways() <em>Pathways</em>}' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getPathways()
     * @generated
     * @ordered
     */
	protected EList<PathWay> pathways;

	/**
     * The cached value of the '{@link #getMaintainedBy() <em>Maintained By</em>}' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getMaintainedBy()
     * @generated
     * @ordered
     */
	protected EList<Gardener> maintainedBy;

	/**
     * The cached value of the '{@link #getResponsible() <em>Responsible</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getResponsible()
     * @generated
     * @ordered
     */
	protected Gardener responsible;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected ZoneImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return GardenPackage.Literals.ZONE;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<Zone> getZones() {
        if (zones == null) {
            zones = new EObjectContainmentEList.Resolving<Zone>(Zone.class, this, GardenPackage.ZONE__ZONES);
        }
        return zones;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<Tree> getTrees() {
        if (trees == null) {
            trees = new EObjectContainmentEList.Resolving<Tree>(Tree.class, this, GardenPackage.ZONE__TREES);
        }
        return trees;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<PathWay> getPathways() {
        if (pathways == null) {
            pathways = new EObjectContainmentEList.Resolving<PathWay>(PathWay.class, this, GardenPackage.ZONE__PATHWAYS);
        }
        return pathways;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<Gardener> getMaintainedBy() {
        if (maintainedBy == null) {
            maintainedBy = new EObjectResolvingEList<Gardener>(Gardener.class, this, GardenPackage.ZONE__MAINTAINED_BY);
        }
        return maintainedBy;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Gardener getResponsible() {
        if (responsible != null && responsible.eIsProxy()) {
            InternalEObject oldResponsible = (InternalEObject)responsible;
            responsible = (Gardener)eResolveProxy(oldResponsible);
            if (responsible != oldResponsible) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, GardenPackage.ZONE__RESPONSIBLE, oldResponsible, responsible));
            }
        }
        return responsible;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Gardener basicGetResponsible() {
        return responsible;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setResponsible(Gardener newResponsible) {
        Gardener oldResponsible = responsible;
        responsible = newResponsible;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, GardenPackage.ZONE__RESPONSIBLE, oldResponsible, responsible));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case GardenPackage.ZONE__ZONES:
                return ((InternalEList<?>)getZones()).basicRemove(otherEnd, msgs);
            case GardenPackage.ZONE__TREES:
                return ((InternalEList<?>)getTrees()).basicRemove(otherEnd, msgs);
            case GardenPackage.ZONE__PATHWAYS:
                return ((InternalEList<?>)getPathways()).basicRemove(otherEnd, msgs);
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
            case GardenPackage.ZONE__ZONES:
                return getZones();
            case GardenPackage.ZONE__TREES:
                return getTrees();
            case GardenPackage.ZONE__PATHWAYS:
                return getPathways();
            case GardenPackage.ZONE__MAINTAINED_BY:
                return getMaintainedBy();
            case GardenPackage.ZONE__RESPONSIBLE:
                if (resolve) return getResponsible();
                return basicGetResponsible();
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
            case GardenPackage.ZONE__ZONES:
                getZones().clear();
                getZones().addAll((Collection<? extends Zone>)newValue);
                return;
            case GardenPackage.ZONE__TREES:
                getTrees().clear();
                getTrees().addAll((Collection<? extends Tree>)newValue);
                return;
            case GardenPackage.ZONE__PATHWAYS:
                getPathways().clear();
                getPathways().addAll((Collection<? extends PathWay>)newValue);
                return;
            case GardenPackage.ZONE__MAINTAINED_BY:
                getMaintainedBy().clear();
                getMaintainedBy().addAll((Collection<? extends Gardener>)newValue);
                return;
            case GardenPackage.ZONE__RESPONSIBLE:
                setResponsible((Gardener)newValue);
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
            case GardenPackage.ZONE__ZONES:
                getZones().clear();
                return;
            case GardenPackage.ZONE__TREES:
                getTrees().clear();
                return;
            case GardenPackage.ZONE__PATHWAYS:
                getPathways().clear();
                return;
            case GardenPackage.ZONE__MAINTAINED_BY:
                getMaintainedBy().clear();
                return;
            case GardenPackage.ZONE__RESPONSIBLE:
                setResponsible((Gardener)null);
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
            case GardenPackage.ZONE__ZONES:
                return zones != null && !zones.isEmpty();
            case GardenPackage.ZONE__TREES:
                return trees != null && !trees.isEmpty();
            case GardenPackage.ZONE__PATHWAYS:
                return pathways != null && !pathways.isEmpty();
            case GardenPackage.ZONE__MAINTAINED_BY:
                return maintainedBy != null && !maintainedBy.isEmpty();
            case GardenPackage.ZONE__RESPONSIBLE:
                return responsible != null;
        }
        return super.eIsSet(featureID);
    }

} //ZoneImpl
