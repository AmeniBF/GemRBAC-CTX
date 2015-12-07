/**
 */
package gemRBAC;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activation Duration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gemRBAC.ActivationDuration#getIdDuration <em>Id Duration</em>}</li>
 *   <li>{@link gemRBAC.ActivationDuration#getValue <em>Value</em>}</li>
 *   <li>{@link gemRBAC.ActivationDuration#getTimeUnit <em>Time Unit</em>}</li>
 *   <li>{@link gemRBAC.ActivationDuration#isIsContinous <em>Is Continous</em>}</li>
 *   <li>{@link gemRBAC.ActivationDuration#getAexp <em>Aexp</em>}</li>
 *   <li>{@link gemRBAC.ActivationDuration#getRexp <em>Rexp</em>}</li>
 * </ul>
 * </p>
 *
 * @see gemRBAC.GemRBACPackage#getActivationDuration()
 * @model
 * @generated
 */
public interface ActivationDuration extends EObject {
	/**
	 * Returns the value of the '<em><b>Id Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Duration</em>' attribute.
	 * @see #setIdDuration(String)
	 * @see gemRBAC.GemRBACPackage#getActivationDuration_IdDuration()
	 * @model id="true"
	 * @generated
	 */
	String getIdDuration();

	/**
	 * Sets the value of the '{@link gemRBAC.ActivationDuration#getIdDuration <em>Id Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Duration</em>' attribute.
	 * @see #getIdDuration()
	 * @generated
	 */
	void setIdDuration(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(BigInteger)
	 * @see gemRBAC.GemRBACPackage#getActivationDuration_Value()
	 * @model
	 * @generated
	 */
	BigInteger getValue();

	/**
	 * Sets the value of the '{@link gemRBAC.ActivationDuration#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Time Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link gemRBAC.TimeUnitType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Unit</em>' attribute.
	 * @see gemRBAC.TimeUnitType
	 * @see #setTimeUnit(TimeUnitType)
	 * @see gemRBAC.GemRBACPackage#getActivationDuration_TimeUnit()
	 * @model
	 * @generated
	 */
	TimeUnitType getTimeUnit();

	/**
	 * Sets the value of the '{@link gemRBAC.ActivationDuration#getTimeUnit <em>Time Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Unit</em>' attribute.
	 * @see gemRBAC.TimeUnitType
	 * @see #getTimeUnit()
	 * @generated
	 */
	void setTimeUnit(TimeUnitType value);

	/**
	 * Returns the value of the '<em><b>Is Continous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Continous</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Continous</em>' attribute.
	 * @see #setIsContinous(boolean)
	 * @see gemRBAC.GemRBACPackage#getActivationDuration_IsContinous()
	 * @model
	 * @generated
	 */
	boolean isIsContinous();

	/**
	 * Sets the value of the '{@link gemRBAC.ActivationDuration#isIsContinous <em>Is Continous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Continous</em>' attribute.
	 * @see #isIsContinous()
	 * @generated
	 */
	void setIsContinous(boolean value);

	/**
	 * Returns the value of the '<em><b>Aexp</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gemRBAC.AbsoluteTE#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aexp</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aexp</em>' reference.
	 * @see #setAexp(AbsoluteTE)
	 * @see gemRBAC.GemRBACPackage#getActivationDuration_Aexp()
	 * @see gemRBAC.AbsoluteTE#getDuration
	 * @model opposite="duration"
	 * @generated
	 */
	AbsoluteTE getAexp();

	/**
	 * Sets the value of the '{@link gemRBAC.ActivationDuration#getAexp <em>Aexp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aexp</em>' reference.
	 * @see #getAexp()
	 * @generated
	 */
	void setAexp(AbsoluteTE value);

	/**
	 * Returns the value of the '<em><b>Rexp</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gemRBAC.RelativeTE#getD2 <em>D2</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rexp</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rexp</em>' reference.
	 * @see #setRexp(RelativeTE)
	 * @see gemRBAC.GemRBACPackage#getActivationDuration_Rexp()
	 * @see gemRBAC.RelativeTE#getD2
	 * @model opposite="d2"
	 * @generated
	 */
	RelativeTE getRexp();

	/**
	 * Sets the value of the '{@link gemRBAC.ActivationDuration#getRexp <em>Rexp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rexp</em>' reference.
	 * @see #getRexp()
	 * @generated
	 */
	void setRexp(RelativeTE value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.timeUnit = d.timeUnit\n\t\t\t      and self.value> d.value'"
	 * @generated
	 */
	boolean greaterThan(ActivationDuration d);

} // ActivationDuration
