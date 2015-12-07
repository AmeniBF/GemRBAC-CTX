/**
 */
package gemRBAC;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composed Relative TE</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gemRBAC.ComposedRelativeTE#getOverlay <em>Overlay</em>}</li>
 * </ul>
 * </p>
 *
 * @see gemRBAC.GemRBACPackage#getComposedRelativeTE()
 * @model abstract="true"
 * @generated
 */
public interface ComposedRelativeTE extends RelativeTE {
	/**
	 * Returns the value of the '<em><b>Overlay</b></em>' reference list.
	 * The list contents are of type {@link gemRBAC.ComposedRelativeTE}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Overlay</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Overlay</em>' reference list.
	 * @see gemRBAC.GemRBACPackage#getComposedRelativeTE_Overlay()
	 * @model
	 * @generated
	 */
	EList<ComposedRelativeTE> getOverlay();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model uRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tlet hour :ecore::EInt = u.getCurrentTime().hour in \n\t\t\tif self.overlay -> notEmpty() and  self.overlay ->flatten() ->exists(a|a.oclIsTypeOf(HourOfDay) or \n \t    \t    a.oclAsType(RelativeTimeInterval).start.oclIsTypeOf(HourOfDay)) then\n\t\t\t\tself.overlay -> exists (h: ComposedRelativeTE|h.oclIsTypeOf(RelativeTimeInterval) = true \n \t    \t    \tand h.oclAsType(RelativeTimeInterval).start.oclIsTypeOf(HourOfDay) = true\n \t    \t    \tand h.oclAsType(RelativeTimeInterval).end.oclIsTypeOf(HourOfDay) = true and \n \t    \t    \th.oclAsType(RelativeTimeInterval).start.oclAsType(HourOfDay).hour <= hour   and\n \t    \t    \t(h.oclAsType(RelativeTimeInterval).end.oclAsType(HourOfDay).hour > hour or\n \t    \t    \t(h.oclAsType(RelativeTimeInterval).end.oclAsType(HourOfDay).hour = hour and u.getCurrentTime().minute = 0 )\n \t    \t    ))\n \t    \t else\n \t    \t \ttrue\n \t    \t endif\n \t    \t    '"
	 * @generated
	 */
	boolean checkHours(RBACUtility u);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model uRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tlet  day:RelativeTimePoint =  u.getDayOfWeek() in \n\t\t\tif self.overlay -> notEmpty()  and  self.overlay ->flatten() ->exists(a|a.oclIsTypeOf(DayOfWeek) or \n \t    \t    a.oclAsType(RelativeTimeInterval).start.oclIsTypeOf(DayOfWeek)) then\n\t\t\t\t /* relative time interval \052/\n\t\t\t\t self.overlay -> exists (t: ComposedRelativeTE|t.oclIsTypeOf(RelativeTimeInterval) = true and \n\t\t\t\t day.isContained(t.oclAsType(RelativeTimeInterval))  = true and\n                 t.checkHours(u)= true)  or \n                 /* relative time point \052/\n                 self.overlay -> exists (t:ComposedRelativeTE|t.oclIsTypeOf(DayOfWeek) = true and \n                 day.equalTo (t.oclAsType(DayOfWeek)) = true and\n       \t\t     t.checkHours(u)= true)\n \t    \t else\n \t    \t \ttrue\n \t    \t endif\n \t    \t    '"
	 * @generated
	 */
	boolean checkDays(RBACUtility u);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model uRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tlet  day:RelativeTimePoint =  u.getDayOfWeek() in \n\t\t\tif self.overlay -> notEmpty()  and  self.overlay ->flatten() ->exists(a|a.oclIsTypeOf(DayOfWeek) or \n \t    \t    a.oclAsType(RelativeTimeInterval).start.oclIsTypeOf(DayOfWeek)) then \n \t    \t    /* relative time interval \052/\n \t    \t    self.overlay -> exists (t: ComposedRelativeTE|t.oclIsTypeOf(RelativeTimeInterval) = true and \n\t\t\t\t day.isContained(t.oclAsType(RelativeTimeInterval))  = true and day.rank = t.oclAsType(RelativeTimeInterval).start.oclAsType(DayOfWeek).rank and\n                 t.checkHours(u)= true) \n \t    \t    or\n \t    \t    /* relative time point \052/\n                 self.overlay -> exists (t:ComposedRelativeTE|t.oclIsTypeOf(DayOfWeek) = true and \n                 day.equalTo (t.oclAsType(DayOfWeek)) = true and day.rank = t.oclAsType(DayOfWeek).rank and\n       \t\t     t.checkHours(u)= true)\n \t    \t else\n \t    \t \ttrue\n \t    \t endif\n \t    \t    '"
	 * @generated
	 */
	boolean checkDaysRank(RBACUtility u);

} // ComposedRelativeTE
