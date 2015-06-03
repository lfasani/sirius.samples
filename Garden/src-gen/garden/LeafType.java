/**
 */
package garden;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Leaf Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see garden.GardenPackage#getLeafType()
 * @model
 * @generated
 */
public enum LeafType implements Enumerator {
    /**
     * The '<em><b>DECIDIOUS</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DECIDIOUS_VALUE
     * @generated
     * @ordered
     */
    DECIDIOUS(0, "DECIDIOUS", "DECIDIOUS"),

    /**
     * The '<em><b>EVERGREEN</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #EVERGREEN_VALUE
     * @generated
     * @ordered
     */
    EVERGREEN(1, "EVERGREEN", "EVERGREEN");

    /**
     * The '<em><b>DECIDIOUS</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>DECIDIOUS</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #DECIDIOUS
     * @model
     * @generated
     * @ordered
     */
    public static final int DECIDIOUS_VALUE = 0;

    /**
     * The '<em><b>EVERGREEN</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>EVERGREEN</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #EVERGREEN
     * @model
     * @generated
     * @ordered
     */
    public static final int EVERGREEN_VALUE = 1;

    /**
     * An array of all the '<em><b>Leaf Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final LeafType[] VALUES_ARRAY =
        new LeafType[] {
            DECIDIOUS,
            EVERGREEN,
        };

    /**
     * A public read-only list of all the '<em><b>Leaf Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<LeafType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Leaf Type</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static LeafType get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            LeafType result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Leaf Type</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static LeafType getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            LeafType result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Leaf Type</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static LeafType get(int value) {
        switch (value) {
            case DECIDIOUS_VALUE: return DECIDIOUS;
            case EVERGREEN_VALUE: return EVERGREEN;
        }
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final int value;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final String name;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final String literal;

    /**
     * Only this class can construct instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private LeafType(int value, String name, String literal) {
        this.value = value;
        this.name = name;
        this.literal = literal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getValue() {
      return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getName() {
      return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getLiteral() {
      return literal;
    }

    /**
     * Returns the literal value of the enumerator, which is its string representation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        return literal;
    }
    
} //LeafType
