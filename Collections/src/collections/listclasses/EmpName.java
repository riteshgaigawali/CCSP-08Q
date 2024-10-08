/*
  - Using Comparator we can separate the sorting logic and business logic as follows :
   		1) In Employee class we have the business logic.
   		2) and in This class we have the sorting logic that sorts the Collection based on empName.
 */
package collections.listclasses;

import java.util.Comparator;

public class EmpName implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Employee e1 = (Employee)o1;
		Employee e2 = (Employee)o2;
		return e1.empName.compareTo(e2.empName);
	}

	
}
