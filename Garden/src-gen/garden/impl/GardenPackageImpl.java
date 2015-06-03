/**
 */
package garden.impl;

import garden.Garden;
import garden.GardenFactory;
import garden.GardenPackage;
import garden.Gardener;
import garden.GardenerGroup;
import garden.NamedElement;
import garden.PathWay;
import garden.Tree;
import garden.Zone;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GardenPackageImpl extends EPackageImpl implements GardenPackage {
	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass zoneEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass gardenEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass treeEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass namedElementEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass pathWayEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass gardenerEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass gardenerGroupEClass = null;

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum leafTypeEEnum = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
     * package URI value.
     * <p>Note: the correct way to create the package is via the static
     * factory method {@link #init init()}, which also performs
     * initialization of the package, or returns the registered package,
     * if one already exists.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see garden.GardenPackage#eNS_URI
     * @see #init()
     * @generated
     */
	private GardenPackageImpl() {
        super(eNS_URI, GardenFactory.eINSTANCE);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private static boolean isInited = false;

	/**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     * 
     * <p>This method is used to initialize {@link GardenPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
	public static GardenPackage init() {
        if (isInited) return (GardenPackage)EPackage.Registry.INSTANCE.getEPackage(GardenPackage.eNS_URI);

        // Obtain or create and register package
        GardenPackageImpl theGardenPackage = (GardenPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GardenPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GardenPackageImpl());

        isInited = true;

        // Create package meta-data objects
        theGardenPackage.createPackageContents();

        // Initialize created meta-data
        theGardenPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theGardenPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(GardenPackage.eNS_URI, theGardenPackage);
        return theGardenPackage;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getZone() {
        return zoneEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getZone_Zones() {
        return (EReference)zoneEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getZone_Trees() {
        return (EReference)zoneEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getZone_Pathways() {
        return (EReference)zoneEClass.getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getZone_MaintainedBy() {
        return (EReference)zoneEClass.getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getZone_Responsible() {
        return (EReference)zoneEClass.getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getGarden() {
        return gardenEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getGarden_Zones() {
        return (EReference)gardenEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getTree() {
        return treeEClass;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTree_LeafType() {
        return (EAttribute)treeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getNamedElement() {
        return namedElementEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getNamedElement_Name() {
        return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getPathWay() {
        return pathWayEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getGardener() {
        return gardenerEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getGardenerGroup() {
        return gardenerGroupEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getGardenerGroup_SubGroups() {
        return (EReference)gardenerGroupEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getGardenerGroup_Gardeners() {
        return (EReference)gardenerGroupEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getLeafType() {
        return leafTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public GardenFactory getGardenFactory() {
        return (GardenFactory)getEFactoryInstance();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private boolean isCreated = false;

	/**
     * Creates the meta-model objects for the package.  This method is
     * guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void createPackageContents() {
        if (isCreated) return;
        isCreated = true;

        // Create classes and their features
        zoneEClass = createEClass(ZONE);
        createEReference(zoneEClass, ZONE__ZONES);
        createEReference(zoneEClass, ZONE__TREES);
        createEReference(zoneEClass, ZONE__PATHWAYS);
        createEReference(zoneEClass, ZONE__MAINTAINED_BY);
        createEReference(zoneEClass, ZONE__RESPONSIBLE);

        gardenEClass = createEClass(GARDEN);
        createEReference(gardenEClass, GARDEN__ZONES);

        treeEClass = createEClass(TREE);
        createEAttribute(treeEClass, TREE__LEAF_TYPE);

        namedElementEClass = createEClass(NAMED_ELEMENT);
        createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

        pathWayEClass = createEClass(PATH_WAY);

        gardenerEClass = createEClass(GARDENER);

        gardenerGroupEClass = createEClass(GARDENER_GROUP);
        createEReference(gardenerGroupEClass, GARDENER_GROUP__SUB_GROUPS);
        createEReference(gardenerGroupEClass, GARDENER_GROUP__GARDENERS);

        // Create enums
        leafTypeEEnum = createEEnum(LEAF_TYPE);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private boolean isInitialized = false;

	/**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void initializePackageContents() {
        if (isInitialized) return;
        isInitialized = true;

        // Initialize package
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        zoneEClass.getESuperTypes().add(this.getNamedElement());
        gardenEClass.getESuperTypes().add(this.getNamedElement());
        treeEClass.getESuperTypes().add(this.getNamedElement());
        pathWayEClass.getESuperTypes().add(this.getNamedElement());
        gardenerEClass.getESuperTypes().add(this.getNamedElement());
        gardenerGroupEClass.getESuperTypes().add(this.getNamedElement());

        // Initialize classes, features, and operations; add parameters
        initEClass(zoneEClass, Zone.class, "Zone", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getZone_Zones(), this.getZone(), null, "zones", null, 0, -1, Zone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getZone_Trees(), this.getTree(), null, "trees", null, 0, -1, Zone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getZone_Pathways(), this.getPathWay(), null, "pathways", null, 0, -1, Zone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getZone_MaintainedBy(), this.getGardener(), null, "maintainedBy", null, 0, -1, Zone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getZone_Responsible(), this.getGardener(), null, "responsible", null, 0, 1, Zone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(gardenEClass, Garden.class, "Garden", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getGarden_Zones(), this.getZone(), null, "zones", null, 0, -1, Garden.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(treeEClass, Tree.class, "Tree", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getTree_LeafType(), this.getLeafType(), "leafType", "DECIDIOUS", 1, 1, Tree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(namedElementEClass, NamedElement.class, "NamedElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(pathWayEClass, PathWay.class, "PathWay", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(gardenerEClass, Gardener.class, "Gardener", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(gardenerGroupEClass, GardenerGroup.class, "GardenerGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getGardenerGroup_SubGroups(), this.getGardenerGroup(), null, "subGroups", null, 0, -1, GardenerGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getGardenerGroup_Gardeners(), this.getGardener(), null, "gardeners", null, 0, -1, GardenerGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Initialize enums and add enum literals
        initEEnum(leafTypeEEnum, garden.LeafType.class, "LeafType");
        addEEnumLiteral(leafTypeEEnum, garden.LeafType.DECIDIOUS);
        addEEnumLiteral(leafTypeEEnum, garden.LeafType.EVERGREEN);

        // Create resource
        createResource(eNS_URI);
    }

} //GardenPackageImpl
