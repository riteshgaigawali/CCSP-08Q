/*
 - How many ways are there to extract data from collection ?
 >> There are three way to extract data from a collection :
 		
 		1) Using for-each loop.
 		2) Using 'Object java.util.ArrayList.get(int index)' method.
 		3) Using Cursor.
*/

package collections.listclasses;

import java.util.ArrayList;

public class ArrayListEx12 {

	public static void main(String[] args) {
		System.out.println("Start @Cyber Success");
		
		//Normal collection
		ArrayList al = new ArrayList();
		al.add(new Employee(101, "Ritesh"));
		al.add(new Employee(102, "Harshal"));
		al.add(new Employee(103, "Harshal"));
		System.out.println(al);
		
		// Approach - 1
		for(Object obj1 : al) {
			Employee e = (Employee)obj1;
			System.out.println(e.empId+" - "+e.empName);
		}
		
		// Approach - 2
		Object obj2 = al.get(0);
		Employee e = (Employee)obj2;
		System.out.println(e.empId+" - "+e.empName);

		System.out.println("Stop @Cyber Success");


	}

}
