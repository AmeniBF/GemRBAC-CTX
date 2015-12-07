/**
 */
package gemRBAC;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Qualitative Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see gemRBAC.GemRBACPackage#getQualitativeType()
 * @model
 * @generated
 */
public enum QualitativeType implements Enumerator {
	/**
	 * The '<em><b>Inside</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSIDE_VALUE
	 * @generated
	 * @ordered
	 */
	INSIDE(0, "inside", "inside"),

	/**
	 * The '<em><b>Outside</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OUTSIDE_VALUE
	 * @generated
	 * @ordered
	 */
	OUTSIDE(0, "outside", "outside"),

	/**
	 * The '<em><b>Around</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AROUND_VALUE
	 * @generated
	 * @ordered
	 */
	AROUND(0, "around", "around");

	/**
	 * The '<em><b>Inside</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Inside</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INSIDE
	 * @model name="inside"
	 * @generated
	 * @ordered
	 */
	public static final int INSIDE_VALUE = 0;

	/**
	 * The '<em><b>Outside</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Outside</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OUTSIDE
	 * @model name="outside"
	 * @generated
	 * @ordered
	 */
	public static final int OUTSIDE_VALUE = 0;

	/**
	 * The '<em><b>Around</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Around</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AROUND
	 * @model name="around"
	 * @generated
	 * @ordered
	 */
	public static final int AROUND_VALUE = 0;

	/**
	 * An array of all the '<em><b>Qualitative Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final QualitativeType[] VALUES_ARRAY =
		new QualitativeType[] {
			INSIDE,
			OUTSIDE,
			AROUND,
		};

	/**
	 * A public read-only list of all the '<em><b>Qualitative Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<QualitativeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Qualitative Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QualitativeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			QualitativeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Qualitative Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QualitativeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			QualitativeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Qualitative Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QualitativeType get(int value) {
		switch (value) {
			case INSIDE_VALUE: return INSIDE;
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
	private QualitativeType(int value, String name, String literal) {
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
	
} //QualitativeType
