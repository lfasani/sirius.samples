/**
 */
package garden.impl;

import garden.GardenPackage;
import garden.Tree;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tree</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link garden.impl.TreeImpl#getLeafType <em>Leaf Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TreeImpl extends NamedElementImpl implements Tree {
	/**
     * The default value of the '{@link #getLeafType() <em>Leaf Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLeafType()
     * @generated
     * @ordered
     */
    protected static final garden.LeafType LEAF_TYPE_EDEFAULT = garden.LeafType.DECIDIOUS;
    /**
     * The cached value of the '{@link #getLeafType() <em>Leaf Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLeafType()
     * @generated
     * @ordered
     */
    protected garden.LeafType leafType = LEAF_TYPE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected TreeImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return GardenPackage.Literals.TREE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public garden.LeafType getLeafType() {
        return leafType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLeafType(garden.LeafType newLeafType) {
        garden.LeafType oldLeafType = leafType;
        leafType = newLeafType == null ? LEAF_TYPE_EDEFAULT : newLeafType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, GardenPackage.TREE__LEAF_TYPE, oldLeafType, leafType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case GardenPackage.TREE__LEAF_TYPE:
                return getLeafType();
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
            case GardenPackage.TREE__LEAF_TYPE:
                setLeafType((garden.LeafType)newValue);
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
            case GardenPackage.TREE__LEAF_TYPE:
                setLeafType(LEAF_TYPE_EDEFAULT);
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
            case GardenPackage.TREE__LEAF_TYPE:
                return leafType != LEAF_TYPE_EDEFAULT;
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
        result.append(" (leafType: ");
        result.append(leafType);
        result.append(')');
        return result.toString();
    }

} //TreeImpl
