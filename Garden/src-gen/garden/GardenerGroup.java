/**
 */
package garden;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gardener Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link garden.GardenerGroup#getSubGroups <em>Sub Groups</em>}</li>
 *   <li>{@link garden.GardenerGroup#getGardeners <em>Gardeners</em>}</li>
 * </ul>
 * </p>
 *
 * @see garden.GardenPackage#getGardenerGroup()
 * @model
 * @generated
 */
public interface GardenerGroup extends NamedElement {
	/**
     * Returns the value of the '<em><b>Sub Groups</b></em>' containment reference list.
     * The list contents are of type {@link garden.GardenerGroup}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Groups</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Sub Groups</em>' containment reference list.
     * @see garden.GardenPackage#getGardenerGroup_SubGroups()
     * @model containment="true" resolveProxies="true"
     * @generated
     */
	EList<GardenerGroup> getSubGroups();

	/**
     * Returns the value of the '<em><b>Gardeners</b></em>' containment reference list.
     * The list contents are of type {@link garden.Gardener}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gardeners</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Gardeners</em>' containment reference list.
     * @see garden.GardenPackage#getGardenerGroup_Gardeners()
     * @model containment="true" resolveProxies="true"
     * @generated
     */
	EList<Gardener> getGardeners();

} // GardenerGroup
