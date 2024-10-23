/*
 	#1. sort using java.lang.Comparable interface :
  
  		- Whenever it comes to sorting the custom class objects the respective custom class should implement the java.lang.Comparable interface, and due to which provide implementation for the unimplemented methods.

*/

package collections.listclasses;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx23 {

	public static void main(String[] args) {
		System.out.println("Start @Cyber Success");
		
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee(106, "Ritesh"));
		al.add(new Employee(108, "Harshal"));
		al.add(new Employee(107, "Sumit"));
		al.add(new Employee(106, "Ritesh"));
	    al.add(new Employee(102, "Aakash"));
	    
	    System.out.println("Before sorting -");
		for(Employee e : al) {
			System.out.println(e.empId+" - "+e.empName);
		}
		
		// sorting based on the empId or empName (logic implemented in Employee class)
		Collections.sort(al);// internally invokes the overridden compareTo() method of Employee class
		
		System.out.println("After sorting -");
		for(Employee e : al) {
			System.out.println(e.empId+" - "+e.empName);
		}
		
		System.out.println("Stop @Cyber Success");
	}

}
