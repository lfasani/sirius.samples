/**
 */
package garden;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see garden.GardenPackage
 * @generated
 */
public interface GardenFactory extends EFactory {
	/**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	GardenFactory eINSTANCE = garden.impl.GardenFactoryImpl.init();

	/**
     * Returns a new object of class '<em>Zone</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Zone</em>'.
     * @generated
     */
	Zone createZone();

	/**
     * Returns a new object of class '<em>Garden</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Garden</em>'.
     * @generated
     */
	Garden createGarden();

	/**
     * Returns a new object of class '<em>Tree</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Tree</em>'.
     * @generated
     */
	Tree createTree();

	/**
     * Returns a new object of class '<em>Named Element</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Named Element</em>'.
     * @generated
     */
	NamedElement createNamedElement();

	/**
     * Returns a new object of class '<em>Path Way</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Path Way</em>'.
     * @generated
     */
	PathWay createPathWay();

	/**
     * Returns a new object of class '<em>Gardener</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Gardener</em>'.
     * @generated
     */
	Gardener createGardener();

	/**
     * Returns a new object of class '<em>Gardener Group</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Gardener Group</em>'.
     * @generated
     */
	GardenerGroup createGardenerGroup();

	/**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
	GardenPackage getGardenPackage();

} //GardenFactory
