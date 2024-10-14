package collections.mapclasses;

import java.util.Comparator;

public class EmpId implements Comparator<Employee>{

	int status;
	
	@Override
	public int compare(Employee e1, Employee e2) {
		
		if(e1.empId == e2.empId) {
			status = 0;
		}else if(e1.empId > e2.empId) {
			status = 1;
		}else if(e1.empId < e2.empId) {
			status = -1;
		}
		return status;
	}

}
