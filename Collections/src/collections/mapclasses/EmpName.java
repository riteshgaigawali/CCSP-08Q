package collections.mapclasses;

import java.util.Comparator;

public class EmpName implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		
		return e1.empName.compareTo(e2.empName);
	}

}
