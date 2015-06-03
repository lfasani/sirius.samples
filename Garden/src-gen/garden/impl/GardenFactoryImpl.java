/**
 */
package garden.impl;

import garden.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GardenFactoryImpl extends EFactoryImpl implements GardenFactory {
	/**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static GardenFactory init() {
        try {
            GardenFactory theGardenFactory = (GardenFactory)EPackage.Registry.INSTANCE.getEFactory(GardenPackage.eNS_URI);
            if (theGardenFactory != null) {
                return theGardenFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new GardenFactoryImpl();
    }

	/**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public GardenFactoryImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case GardenPackage.ZONE: return createZone();
            case GardenPackage.GARDEN: return createGarden();
            case GardenPackage.TREE: return createTree();
            case GardenPackage.NAMED_ELEMENT: return createNamedElement();
            case GardenPackage.PATH_WAY: return createPathWay();
            case GardenPackage.GARDENER: return createGardener();
            case GardenPackage.GARDENER_GROUP: return createGardenerGroup();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object createFromString(EDataType eDataType, String initialValue) {
        switch (eDataType.getClassifierID()) {
            case GardenPackage.LEAF_TYPE:
                return createLeafTypeFromString(eDataType, initialValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String convertToString(EDataType eDataType, Object instanceValue) {
        switch (eDataType.getClassifierID()) {
            case GardenPackage.LEAF_TYPE:
                return convertLeafTypeToString(eDataType, instanceValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Zone createZone() {
        ZoneImpl zone = new ZoneImpl();
        return zone;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Garden createGarden() {
        GardenImpl garden = new GardenImpl();
        return garden;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Tree createTree() {
        TreeImpl tree = new TreeImpl();
        return tree;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NamedElement createNamedElement() {
        NamedElementImpl namedElement = new NamedElementImpl();
        return namedElement;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public PathWay createPathWay() {
        PathWayImpl pathWay = new PathWayImpl();
        return pathWay;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Gardener createGardener() {
        GardenerImpl gardener = new GardenerImpl();
        return gardener;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public GardenerGroup createGardenerGroup() {
        GardenerGroupImpl gardenerGroup = new GardenerGroupImpl();
        return gardenerGroup;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public garden.LeafType createLeafTypeFromString(EDataType eDataType, String initialValue) {
        garden.LeafType result = garden.LeafType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertLeafTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public GardenPackage getGardenPackage() {
        return (GardenPackage)getEPackage();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
	@Deprecated
	public static GardenPackage getPackage() {
        return GardenPackage.eINSTANCE;
    }

} //GardenFactoryImpl
