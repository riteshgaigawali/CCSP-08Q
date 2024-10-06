/*
 - How many ways are there to extract data from collection ?
 >> There are three way to extract data from a collection :
 		
 		1) Using for-each loop.
 		2) Using 'Object java.util.ArrayList.get(int index)' method.
 		3) Using Cursor.
*/

package collections.listclasses;

import java.util.ArrayList;

public class ArrayListEx13 {

	public static void main(String[] args) {
System.out.println("Start @Cyber Success");
		
		//Normal collection
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee(101, "Ritesh"));
		al.add(new Employee(102, "Harshal"));
		al.add(new Employee(103, "Harshal"));
		System.out.println(al);
		
		// Approach - 1
		for(Employee emp1 : al) {
			System.out.println(emp1.empId+" - "+emp1.empName);
		}
		
		// Approach - 2
		Employee emp2 = al.get(2);
		System.out.println(emp2.empId+" - "+emp2.empName);

		System.out.println("Stop @Cyber Success");

	}

}
