/**
 */
package garden;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see garden.GardenFactory
 * @model kind="package"
 * @generated
 */
public interface GardenPackage extends EPackage {
	/**
     * The package name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	String eNAME = "garden";

	/**
     * The package namespace URI.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	String eNS_URI = "http://www.example.org/garden";

	/**
     * The package namespace name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	String eNS_PREFIX = "garden";

	/**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	GardenPackage eINSTANCE = garden.impl.GardenPackageImpl.init();

	/**
     * The meta object id for the '{@link garden.impl.NamedElementImpl <em>Named Element</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see garden.impl.NamedElementImpl
     * @see garden.impl.GardenPackageImpl#getNamedElement()
     * @generated
     */
	int NAMED_ELEMENT = 3;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NAMED_ELEMENT__NAME = 0;

	/**
     * The number of structural features of the '<em>Named Element</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
     * The number of operations of the '<em>Named Element</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
     * The meta object id for the '{@link garden.impl.ZoneImpl <em>Zone</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see garden.impl.ZoneImpl
     * @see garden.impl.GardenPackageImpl#getZone()
     * @generated
     */
	int ZONE = 0;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ZONE__NAME = NAMED_ELEMENT__NAME;

	/**
     * The feature id for the '<em><b>Zones</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ZONE__ZONES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Trees</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ZONE__TREES = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
     * The feature id for the '<em><b>Pathways</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ZONE__PATHWAYS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
     * The feature id for the '<em><b>Maintained By</b></em>' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ZONE__MAINTAINED_BY = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
     * The feature id for the '<em><b>Responsible</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ZONE__RESPONSIBLE = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
     * The number of structural features of the '<em>Zone</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ZONE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
     * The number of operations of the '<em>Zone</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ZONE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
     * The meta object id for the '{@link garden.impl.GardenImpl <em>Garden</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see garden.impl.GardenImpl
     * @see garden.impl.GardenPackageImpl#getGarden()
     * @generated
     */
	int GARDEN = 1;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int GARDEN__NAME = NAMED_ELEMENT__NAME;

	/**
     * The feature id for the '<em><b>Zones</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int GARDEN__ZONES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
     * The number of structural features of the '<em>Garden</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int GARDEN_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
     * The number of operations of the '<em>Garden</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int GARDEN_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
     * The meta object id for the '{@link garden.impl.TreeImpl <em>Tree</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see garden.impl.TreeImpl
     * @see garden.impl.GardenPackageImpl#getTree()
     * @generated
     */
	int TREE = 2;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TREE__NAME = NAMED_ELEMENT__NAME;

	/**
     * The feature id for the '<em><b>Leaf Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TREE__LEAF_TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Tree</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TREE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
     * The number of operations of the '<em>Tree</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TREE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
     * The meta object id for the '{@link garden.impl.PathWayImpl <em>Path Way</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see garden.impl.PathWayImpl
     * @see garden.impl.GardenPackageImpl#getPathWay()
     * @generated
     */
	int PATH_WAY = 4;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PATH_WAY__NAME = NAMED_ELEMENT__NAME;

	/**
     * The number of structural features of the '<em>Path Way</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PATH_WAY_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
     * The number of operations of the '<em>Path Way</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PATH_WAY_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
     * The meta object id for the '{@link garden.impl.GardenerImpl <em>Gardener</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see garden.impl.GardenerImpl
     * @see garden.impl.GardenPackageImpl#getGardener()
     * @generated
     */
	int GARDENER = 5;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int GARDENER__NAME = NAMED_ELEMENT__NAME;

	/**
     * The number of structural features of the '<em>Gardener</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int GARDENER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
     * The number of operations of the '<em>Gardener</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int GARDENER_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;


	/**
     * The meta object id for the '{@link garden.impl.GardenerGroupImpl <em>Gardener Group</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see garden.impl.GardenerGroupImpl
     * @see garden.impl.GardenPackageImpl#getGardenerGroup()
     * @generated
     */
	int GARDENER_GROUP = 6;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int GARDENER_GROUP__NAME = NAMED_ELEMENT__NAME;

	/**
     * The feature id for the '<em><b>Sub Groups</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int GARDENER_GROUP__SUB_GROUPS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Gardeners</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int GARDENER_GROUP__GARDENERS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
     * The number of structural features of the '<em>Gardener Group</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int GARDENER_GROUP_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
     * The number of operations of the '<em>Gardener Group</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int GARDENER_GROUP_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;


	/**
     * The meta object id for the '{@link garden.LeafType <em>Leaf Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see garden.LeafType
     * @see garden.impl.GardenPackageImpl#getLeafType()
     * @generated
     */
    int LEAF_TYPE = 7;


    /**
     * Returns the meta object for class '{@link garden.Zone <em>Zone</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Zone</em>'.
     * @see garden.Zone
     * @generated
     */
	EClass getZone();

	/**
     * Returns the meta object for the containment reference list '{@link garden.Zone#getZones <em>Zones</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Zones</em>'.
     * @see garden.Zone#getZones()
     * @see #getZone()
     * @generated
     */
	EReference getZone_Zones();

	/**
     * Returns the meta object for the containment reference list '{@link garden.Zone#getTrees <em>Trees</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Trees</em>'.
     * @see garden.Zone#getTrees()
     * @see #getZone()
     * @generated
     */
	EReference getZone_Trees();

	/**
     * Returns the meta object for the containment reference list '{@link garden.Zone#getPathways <em>Pathways</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Pathways</em>'.
     * @see garden.Zone#getPathways()
     * @see #getZone()
     * @generated
     */
	EReference getZone_Pathways();

	/**
     * Returns the meta object for the reference list '{@link garden.Zone#getMaintainedBy <em>Maintained By</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Maintained By</em>'.
     * @see garden.Zone#getMaintainedBy()
     * @see #getZone()
     * @generated
     */
	EReference getZone_MaintainedBy();

	/**
     * Returns the meta object for the reference '{@link garden.Zone#getResponsible <em>Responsible</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Responsible</em>'.
     * @see garden.Zone#getResponsible()
     * @see #getZone()
     * @generated
     */
	EReference getZone_Responsible();

	/**
     * Returns the meta object for class '{@link garden.Garden <em>Garden</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Garden</em>'.
     * @see garden.Garden
     * @generated
     */
	EClass getGarden();

	/**
     * Returns the meta object for the containment reference list '{@link garden.Garden#getZones <em>Zones</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Zones</em>'.
     * @see garden.Garden#getZones()
     * @see #getGarden()
     * @generated
     */
	EReference getGarden_Zones();

	/**
     * Returns the meta object for class '{@link garden.Tree <em>Tree</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Tree</em>'.
     * @see garden.Tree
     * @generated
     */
	EClass getTree();

	/**
     * Returns the meta object for the attribute '{@link garden.Tree#getLeafType <em>Leaf Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Leaf Type</em>'.
     * @see garden.Tree#getLeafType()
     * @see #getTree()
     * @generated
     */
    EAttribute getTree_LeafType();

    /**
     * Returns the meta object for class '{@link garden.NamedElement <em>Named Element</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Named Element</em>'.
     * @see garden.NamedElement
     * @generated
     */
	EClass getNamedElement();

	/**
     * Returns the meta object for the attribute '{@link garden.NamedElement#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see garden.NamedElement#getName()
     * @see #getNamedElement()
     * @generated
     */
	EAttribute getNamedElement_Name();

	/**
     * Returns the meta object for class '{@link garden.PathWay <em>Path Way</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Path Way</em>'.
     * @see garden.PathWay
     * @generated
     */
	EClass getPathWay();

	/**
     * Returns the meta object for class '{@link garden.Gardener <em>Gardener</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Gardener</em>'.
     * @see garden.Gardener
     * @generated
     */
	EClass getGardener();

	/**
     * Returns the meta object for class '{@link garden.GardenerGroup <em>Gardener Group</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Gardener Group</em>'.
     * @see garden.GardenerGroup
     * @generated
     */
	EClass getGardenerGroup();

	/**
     * Returns the meta object for the containment reference list '{@link garden.GardenerGroup#getSubGroups <em>Sub Groups</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Sub Groups</em>'.
     * @see garden.GardenerGroup#getSubGroups()
     * @see #getGardenerGroup()
     * @generated
     */
	EReference getGardenerGroup_SubGroups();

	/**
     * Returns the meta object for the containment reference list '{@link garden.GardenerGroup#getGardeners <em>Gardeners</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Gardeners</em>'.
     * @see garden.GardenerGroup#getGardeners()
     * @see #getGardenerGroup()
     * @generated
     */
	EReference getGardenerGroup_Gardeners();

	/**
     * Returns the meta object for enum '{@link garden.LeafType <em>Leaf Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Leaf Type</em>'.
     * @see garden.LeafType
     * @generated
     */
    EEnum getLeafType();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
	GardenFactory getGardenFactory();

	/**
     * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
     * @generated
     */
	interface Literals {
		/**
         * The meta object literal for the '{@link garden.impl.ZoneImpl <em>Zone</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see garden.impl.ZoneImpl
         * @see garden.impl.GardenPackageImpl#getZone()
         * @generated
         */
		EClass ZONE = eINSTANCE.getZone();

		/**
         * The meta object literal for the '<em><b>Zones</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference ZONE__ZONES = eINSTANCE.getZone_Zones();

		/**
         * The meta object literal for the '<em><b>Trees</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference ZONE__TREES = eINSTANCE.getZone_Trees();

		/**
         * The meta object literal for the '<em><b>Pathways</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference ZONE__PATHWAYS = eINSTANCE.getZone_Pathways();

		/**
         * The meta object literal for the '<em><b>Maintained By</b></em>' reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference ZONE__MAINTAINED_BY = eINSTANCE.getZone_MaintainedBy();

		/**
         * The meta object literal for the '<em><b>Responsible</b></em>' reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference ZONE__RESPONSIBLE = eINSTANCE.getZone_Responsible();

		/**
         * The meta object literal for the '{@link garden.impl.GardenImpl <em>Garden</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see garden.impl.GardenImpl
         * @see garden.impl.GardenPackageImpl#getGarden()
         * @generated
         */
		EClass GARDEN = eINSTANCE.getGarden();

		/**
         * The meta object literal for the '<em><b>Zones</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference GARDEN__ZONES = eINSTANCE.getGarden_Zones();

		/**
         * The meta object literal for the '{@link garden.impl.TreeImpl <em>Tree</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see garden.impl.TreeImpl
         * @see garden.impl.GardenPackageImpl#getTree()
         * @generated
         */
		EClass TREE = eINSTANCE.getTree();

		/**
         * The meta object literal for the '<em><b>Leaf Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TREE__LEAF_TYPE = eINSTANCE.getTree_LeafType();

        /**
         * The meta object literal for the '{@link garden.impl.NamedElementImpl <em>Named Element</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see garden.impl.NamedElementImpl
         * @see garden.impl.GardenPackageImpl#getNamedElement()
         * @generated
         */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
         * The meta object literal for the '{@link garden.impl.PathWayImpl <em>Path Way</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see garden.impl.PathWayImpl
         * @see garden.impl.GardenPackageImpl#getPathWay()
         * @generated
         */
		EClass PATH_WAY = eINSTANCE.getPathWay();

		/**
         * The meta object literal for the '{@link garden.impl.GardenerImpl <em>Gardener</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see garden.impl.GardenerImpl
         * @see garden.impl.GardenPackageImpl#getGardener()
         * @generated
         */
		EClass GARDENER = eINSTANCE.getGardener();

		/**
         * The meta object literal for the '{@link garden.impl.GardenerGroupImpl <em>Gardener Group</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see garden.impl.GardenerGroupImpl
         * @see garden.impl.GardenPackageImpl#getGardenerGroup()
         * @generated
         */
		EClass GARDENER_GROUP = eINSTANCE.getGardenerGroup();

		/**
         * The meta object literal for the '<em><b>Sub Groups</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference GARDENER_GROUP__SUB_GROUPS = eINSTANCE.getGardenerGroup_SubGroups();

		/**
         * The meta object literal for the '<em><b>Gardeners</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference GARDENER_GROUP__GARDENERS = eINSTANCE.getGardenerGroup_Gardeners();

        /**
         * The meta object literal for the '{@link garden.LeafType <em>Leaf Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see garden.LeafType
         * @see garden.impl.GardenPackageImpl#getLeafType()
         * @generated
         */
        EEnum LEAF_TYPE = eINSTANCE.getLeafType();

	}

} //GardenPackage
