/**
 */
package gemRBAC;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Cardinal Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see gemRBAC.GemRBACPackage#getCardinalType()
 * @model
 * @generated
 */
public enum CardinalType implements Enumerator {
	/**
	 * The '<em><b>North</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NORTH_VALUE
	 * @generated
	 * @ordered
	 */
	NORTH(0, "North", "North"),

	/**
	 * The '<em><b>East</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EAST_VALUE
	 * @generated
	 * @ordered
	 */
	EAST(0, "East", "East"),

	/**
	 * The '<em><b>South</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOUTH_VALUE
	 * @generated
	 * @ordered
	 */
	SOUTH(0, "South", "South"),

	/**
	 * The '<em><b>West</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEST_VALUE
	 * @generated
	 * @ordered
	 */
	WEST(0, "West", "West"),

	/**
	 * The '<em><b>Northeast</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NORTHEAST_VALUE
	 * @generated
	 * @ordered
	 */
	NORTHEAST(0, "Northeast", "Northeast"),

	/**
	 * The '<em><b>Southeast</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOUTHEAST_VALUE
	 * @generated
	 * @ordered
	 */
	SOUTHEAST(0, "Southeast", "Southeast"),

	/**
	 * The '<em><b>Southwest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOUTHWEST_VALUE
	 * @generated
	 * @ordered
	 */
	SOUTHWEST(0, "Southwest", "Southwest"),

	/**
	 * The '<em><b>Northwest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NORTHWEST_VALUE
	 * @generated
	 * @ordered
	 */
	NORTHWEST(0, "Northwest", "Northwest");

	/**
	 * The '<em><b>North</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>North</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NORTH
	 * @model name="North"
	 * @generated
	 * @ordered
	 */
	public static final int NORTH_VALUE = 0;

	/**
	 * The '<em><b>East</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>East</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EAST
	 * @model name="East"
	 * @generated
	 * @ordered
	 */
	public static final int EAST_VALUE = 0;

	/**
	 * The '<em><b>South</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>South</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SOUTH
	 * @model name="South"
	 * @generated
	 * @ordered
	 */
	public static final int SOUTH_VALUE = 0;

	/**
	 * The '<em><b>West</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>West</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WEST
	 * @model name="West"
	 * @generated
	 * @ordered
	 */
	public static final int WEST_VALUE = 0;

	/**
	 * The '<em><b>Northeast</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Northeast</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NORTHEAST
	 * @model name="Northeast"
	 * @generated
	 * @ordered
	 */
	public static final int NORTHEAST_VALUE = 0;

	/**
	 * The '<em><b>Southeast</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Southeast</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SOUTHEAST
	 * @model name="Southeast"
	 * @generated
	 * @ordered
	 */
	public static final int SOUTHEAST_VALUE = 0;

	/**
	 * The '<em><b>Southwest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Southwest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SOUTHWEST
	 * @model name="Southwest"
	 * @generated
	 * @ordered
	 */
	public static final int SOUTHWEST_VALUE = 0;

	/**
	 * The '<em><b>Northwest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Northwest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NORTHWEST
	 * @model name="Northwest"
	 * @generated
	 * @ordered
	 */
	public static final int NORTHWEST_VALUE = 0;

	/**
	 * An array of all the '<em><b>Cardinal Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CardinalType[] VALUES_ARRAY =
		new CardinalType[] {
			NORTH,
			EAST,
			SOUTH,
			WEST,
			NORTHEAST,
			SOUTHEAST,
			SOUTHWEST,
			NORTHWEST,
		};

	/**
	 * A public read-only list of all the '<em><b>Cardinal Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CardinalType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Cardinal Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CardinalType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CardinalType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cardinal Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CardinalType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CardinalType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cardinal Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CardinalType get(int value) {
		switch (value) {
			case NORTH_VALUE: return NORTH;
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
	private CardinalType(int value, String name, String literal) {
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
	
} //CardinalType
