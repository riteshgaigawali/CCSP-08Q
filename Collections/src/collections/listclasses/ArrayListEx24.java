/*
  	  
  Limitations of Comparable :
  		- With Comparable we can perform sorting, but at any point of time we can sort with respect to only one object.
  		- While implementing Comparable, we need to maintain business and sorting logic in same area within the same class which is not a recommended coding practice, which may bring lot of complexity.
  		- Hence to avoid the above problems we go for Comparator instead of Comparable.
  		
  #2. Sorting using java.util.Comparator :-
  		- Comparator also is an interface present in java.util package, but Comparable is present in java.lang package.
  		- Benefits of using Comparator :-
  			1) With the help of Comparator we can sort with respect to two object at any point of time.
  			2) While using Comparator we maintain separate business logic as well as sorting logic.
*/
package collections.listclasses;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx24 {

	public static void main(String[] args) {
		System.out.println("Start @Cyber Success");
		
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee(106, "Ritesh"));
		al.add(new Employee(108, "Harshal"));
		al.add(new Employee(107, "Sumit"));
		al.add(new Employee(106, "Ritesh"));
	    al.add(new Employee(102, "Aakash"));
	    
	    System.out.println("Before sorting -----------------------");
		for(Employee e : al) {
			System.out.println(e.empId+" - "+e.empName);
		}
		
		// sorting based on the empId (logic implemented in EmpId class)
		Collections.sort(al, new EmpId());// internally invokes the overridden compare() method of EmpId class.
		
		System.out.println("After sorting with EmpId ---------------------");
		for(Employee e : al) {
			System.out.println(e.empId+" - "+e.empName);
		}
		
		// sorting based on the empName (logic implemented in EmpName class)
				Collections.sort(al, new EmpName());// internally invokes the overridden compare() method of EmpName class.
				
				System.out.println("After sorting with EmpName ------------------------");
				for(Employee e : al) {
					System.out.println(e.empId+" - "+e.empName);
				}
		
		System.out.println("Stop @Cyber Success");
	}

}
