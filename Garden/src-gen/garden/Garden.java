/**
 */
package garden;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Garden</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link garden.Garden#getZones <em>Zones</em>}</li>
 * </ul>
 * </p>
 *
 * @see garden.GardenPackage#getGarden()
 * @model
 * @generated
 */
public interface Garden extends NamedElement {
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
     * @see garden.GardenPackage#getGarden_Zones()
     * @model containment="true" resolveProxies="true"
     * @generated
     */
	EList<Zone> getZones();

} // Garden
