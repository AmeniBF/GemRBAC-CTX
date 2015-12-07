/**
 */
package gemRBAC;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relative Time Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gemRBAC.RelativeTimePoint#getRank <em>Rank</em>}</li>
 * </ul>
 * </p>
 *
 * @see gemRBAC.GemRBACPackage#getRelativeTimePoint()
 * @model abstract="true"
 * @generated
 */
public interface RelativeTimePoint extends ComposedRelativeTE {
	/**
	 * Returns the value of the '<em><b>Rank</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * attribute idRelativeTimePoint : String[?] { id };
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rank</em>' attribute.
	 * @see #setRank(int)
	 * @see gemRBAC.GemRBACPackage#getRelativeTimePoint_Rank()
	 * @model
	 * @generated
	 */
	int getRank();

	/**
	 * Sets the value of the '{@link gemRBAC.RelativeTimePoint#getRank <em>Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rank</em>' attribute.
	 * @see #getRank()
	 * @generated
	 */
	void setRank(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\t      if self.oclIsTypeOf(DayOfWeek)  then\n\t\t\t            /*self.isBefore (t.end) and (self.isAfter(t.start) or self.equalTo(t.start)) \052/ \n\t\t\t          self.equalTo(t.start) or ( t.start.isBefore (self) and (t.end.isAfter(self) or self.equalTo(t.end)))\n\t\t\t             \n\t\t\t      else\n\t\t\t          false\n\t\t\t      endif'"
	 * @generated
	 */
	boolean isContained(RelativeTimeInterval t);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='if self.oclIsTypeOf(DayOfWeek) then\n\t\t\t             self.oclAsType(DayOfWeek).day = t.oclAsType(DayOfWeek).day \n\t\t\t      else\n\t\t\t          false\n\t\t\t      endif'"
	 * @generated
	 */
	boolean equalTo(RelativeTimePoint t);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='if self.oclIsTypeOf(DayOfWeek) then\n\t\t\t            let Days: OrderedSet(DayType) =OrderedSet{DayType::Monday, DayType::Tuesday, \n\t\t\t\t          DayType::Wednesday, DayType::Thursday, DayType::Friday, DayType::Saturday, DayType::Sunday}\n\t\t\t\t         in   Days-> indexOf (self.oclAsType(DayOfWeek).day) > Days-> indexOf (t.oclAsType(DayOfWeek).day)\n\t\t\t      else\n\t\t\t          false\n\t\t\t      endif'"
	 * @generated
	 */
	boolean isAfter(RelativeTimePoint t);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='if self.oclIsTypeOf(DayOfWeek) then\n\t\t\t             let Days: OrderedSet(DayType) =OrderedSet{DayType::Monday, DayType::Tuesday, \n\t\t\t\tDayType::Wednesday, DayType::Thursday, DayType::Friday, DayType::Saturday, DayType::Sunday}\n\t\t\t\t in   Days-> indexOf (self.oclAsType(DayOfWeek).day) < Days-> indexOf (t.oclAsType(DayOfWeek).day)\n\t\t\t      else\n\t\t\t          false\n\t\t\t      endif'"
	 * @generated
	 */
	boolean isBefore(RelativeTimePoint t);

} // RelativeTimePoint
