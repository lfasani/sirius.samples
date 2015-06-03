/**
 */
package garden.util;

import garden.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see garden.GardenPackage
 * @generated
 */
public class GardenAdapterFactory extends AdapterFactoryImpl {
	/**
     * The cached model package.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected static GardenPackage modelPackage;

	/**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public GardenAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = GardenPackage.eINSTANCE;
        }
    }

	/**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
	@Override
	public boolean isFactoryForType(Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject)object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

	/**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected GardenSwitch<Adapter> modelSwitch =
		new GardenSwitch<Adapter>() {
            @Override
            public Adapter caseZone(Zone object) {
                return createZoneAdapter();
            }
            @Override
            public Adapter caseGarden(Garden object) {
                return createGardenAdapter();
            }
            @Override
            public Adapter caseTree(Tree object) {
                return createTreeAdapter();
            }
            @Override
            public Adapter caseNamedElement(NamedElement object) {
                return createNamedElementAdapter();
            }
            @Override
            public Adapter casePathWay(PathWay object) {
                return createPathWayAdapter();
            }
            @Override
            public Adapter caseGardener(Gardener object) {
                return createGardenerAdapter();
            }
            @Override
            public Adapter caseGardenerGroup(GardenerGroup object) {
                return createGardenerGroupAdapter();
            }
            @Override
            public Adapter defaultCase(EObject object) {
                return createEObjectAdapter();
            }
        };

	/**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
	@Override
	public Adapter createAdapter(Notifier target) {
        return modelSwitch.doSwitch((EObject)target);
    }


	/**
     * Creates a new adapter for an object of class '{@link garden.Zone <em>Zone</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see garden.Zone
     * @generated
     */
	public Adapter createZoneAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link garden.Garden <em>Garden</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see garden.Garden
     * @generated
     */
	public Adapter createGardenAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link garden.Tree <em>Tree</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see garden.Tree
     * @generated
     */
	public Adapter createTreeAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link garden.NamedElement <em>Named Element</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see garden.NamedElement
     * @generated
     */
	public Adapter createNamedElementAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link garden.PathWay <em>Path Way</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see garden.PathWay
     * @generated
     */
	public Adapter createPathWayAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link garden.Gardener <em>Gardener</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see garden.Gardener
     * @generated
     */
	public Adapter createGardenerAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link garden.GardenerGroup <em>Gardener Group</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see garden.GardenerGroup
     * @generated
     */
	public Adapter createGardenerGroupAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
	public Adapter createEObjectAdapter() {
        return null;
    }

} //GardenAdapterFactory
