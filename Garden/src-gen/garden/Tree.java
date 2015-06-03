/**
 */
package garden;




/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tree</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link garden.Tree#getLeafType <em>Leaf Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see garden.GardenPackage#getTree()
 * @model
 * @generated
 */
public interface Tree extends NamedElement {

    /**
     * Returns the value of the '<em><b>Leaf Type</b></em>' attribute.
     * The default value is <code>"DECIDIOUS"</code>.
     * The literals are from the enumeration {@link garden.LeafType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Leaf Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Leaf Type</em>' attribute.
     * @see garden.LeafType
     * @see #setLeafType(garden.LeafType)
     * @see garden.GardenPackage#getTree_LeafType()
     * @model default="DECIDIOUS" required="true"
     * @generated
     */
    garden.LeafType getLeafType();

    /**
     * Sets the value of the '{@link garden.Tree#getLeafType <em>Leaf Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Leaf Type</em>' attribute.
     * @see garden.LeafType
     * @see #getLeafType()
     * @generated
     */
    void setLeafType(garden.LeafType value);
} // Tree
