/**
 */
package gemRBAC;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>delegation Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see gemRBAC.GemRBACPackage#getdelegationType()
 * @model
 * @generated
 */
public enum delegationType implements Enumerator {
	/**
	 * The '<em><b>Grant</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GRANT_VALUE
	 * @generated
	 * @ordered
	 */
	GRANT(0, "grant", "grant"),

	/**
	 * The '<em><b>Strong</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRONG_VALUE
	 * @generated
	 * @ordered
	 */
	STRONG(0, "strong", "strong"),

	/**
	 * The '<em><b>Weak Static</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEAK_STATIC_VALUE
	 * @generated
	 * @ordered
	 */
	WEAK_STATIC(0, "weakStatic", "weakStatic"),

	/**
	 * The '<em><b>Weak Dynamic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEAK_DYNAMIC_VALUE
	 * @generated
	 * @ordered
	 */
	WEAK_DYNAMIC(0, "weakDynamic", "weakDynamic");

	/**
	 * The '<em><b>Grant</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Grant</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GRANT
	 * @model name="grant"
	 * @generated
	 * @ordered
	 */
	public static final int GRANT_VALUE = 0;

	/**
	 * The '<em><b>Strong</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Strong</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STRONG
	 * @model name="strong"
	 * @generated
	 * @ordered
	 */
	public static final int STRONG_VALUE = 0;

	/**
	 * The '<em><b>Weak Static</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Weak Static</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WEAK_STATIC
	 * @model name="weakStatic"
	 * @generated
	 * @ordered
	 */
	public static final int WEAK_STATIC_VALUE = 0;

	/**
	 * The '<em><b>Weak Dynamic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Weak Dynamic</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WEAK_DYNAMIC
	 * @model name="weakDynamic"
	 * @generated
	 * @ordered
	 */
	public static final int WEAK_DYNAMIC_VALUE = 0;

	/**
	 * An array of all the '<em><b>delegation Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final delegationType[] VALUES_ARRAY =
		new delegationType[] {
			GRANT,
			STRONG,
			WEAK_STATIC,
			WEAK_DYNAMIC,
		};

	/**
	 * A public read-only list of all the '<em><b>delegation Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<delegationType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>delegation Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static delegationType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			delegationType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>delegation Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static delegationType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			delegationType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>delegation Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static delegationType get(int value) {
		switch (value) {
			case GRANT_VALUE: return GRANT;
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
	private delegationType(int value, String name, String literal) {
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
	
} //delegationType
