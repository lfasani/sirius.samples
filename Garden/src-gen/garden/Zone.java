/**
 */
package garden;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Zone</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link garden.Zone#getZones <em>Zones</em>}</li>
 *   <li>{@link garden.Zone#getTrees <em>Trees</em>}</li>
 *   <li>{@link garden.Zone#getPathways <em>Pathways</em>}</li>
 *   <li>{@link garden.Zone#getMaintainedBy <em>Maintained By</em>}</li>
 *   <li>{@link garden.Zone#getResponsible <em>Responsible</em>}</li>
 * </ul>
 * </p>
 *
 * @see garden.GardenPackage#getZone()
 * @model
 * @generated
 */
public interface Zone extends NamedElement {
	/**
     * Returns the value of the '<em><b>Zones</b></em>' containment reference list.
     * The list contents are of type {@link garden.Zone}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Zones</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Zones</em>' containment reference list.
     * @see garden.GardenPackage#getZone_Zones()
     * @model containment="true" resolveProxies="true"
     * @generated
     */
	EList<Zone> getZones();

	/**
     * Returns the value of the '<em><b>Trees</b></em>' containment reference list.
     * The list contents are of type {@link garden.Tree}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trees</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Trees</em>' containment reference list.
     * @see garden.GardenPackage#getZone_Trees()
     * @model containment="true" resolveProxies="true"
     * @generated
     */
	EList<Tree> getTrees();

	/**
     * Returns the value of the '<em><b>Pathways</b></em>' containment reference list.
     * The list contents are of type {@link garden.PathWay}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pathways</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Pathways</em>' containment reference list.
     * @see garden.GardenPackage#getZone_Pathways()
     * @model containment="true" resolveProxies="true"
     * @generated
     */
	EList<PathWay> getPathways();

	/**
     * Returns the value of the '<em><b>Maintained By</b></em>' reference list.
     * The list contents are of type {@link garden.Gardener}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maintained By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Maintained By</em>' reference list.
     * @see garden.GardenPackage#getZone_MaintainedBy()
     * @model
     * @generated
     */
	EList<Gardener> getMaintainedBy();

	/**
     * Returns the value of the '<em><b>Responsible</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Responsible</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Responsible</em>' reference.
     * @see #setResponsible(Gardener)
     * @see garden.GardenPackage#getZone_Responsible()
     * @model
     * @generated
     */
	Gardener getResponsible();

	/**
     * Sets the value of the '{@link garden.Zone#getResponsible <em>Responsible</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Responsible</em>' reference.
     * @see #getResponsible()
     * @generated
     */
	void setResponsible(Gardener value);

} // Zone
