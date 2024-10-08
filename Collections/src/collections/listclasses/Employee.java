/*
  - Sorting based on empId and empName using the java.lang.Comparable interface.
  
  Limitations of Comparable :
  		- With Comparable we can perform sorting, but at any point of time we can sort with respect to only one object.
  		- While implementing Comparable, we need to maintain business and sorting logic in same area within the same class which is not a recommended coding practice, which may bring lot of complexity.
  		- Hence to avoid the above problems we go for Comparator instead of Comparable.
  
*/

package collections.listclasses;

public class Employee implements Comparable{

	int empId;
	String empName;
	
	Employee(int empId, String empName){
		this.empId = empId;
		this.empName = empName;
	}

	

	
//	// 1) sorting based on empId	
//	@Override
//	public int compareTo(Object o) {
//		int status = 0;
//		Employee e = (Employee)o;
//		
//		if(e.empId == empId) { status = 0; }
//		else if(e.empId > empId) { status = -1; }
//		else if(e.empId < empId) { status = 1; }
//		
//		return status;
//		
//	}
	
//	2) sorting based on empName
	@Override
	public int compareTo(Object o) {
		Employee e = (Employee)o;
		
		return empName.compareTo(e.empName);
	}
	
	
}
