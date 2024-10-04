/*    
 - We can store user-defined class objects within an ArrayList.
 - But when we print the ArrayList elements instead of printing the actual data of objects it prints the address of the object.
 - Because the ArrayList is storing the addresses of the objects stored inside it.
 - While storing the address it upcasts each of the object to it's parent which is Object class.
 - To print the info we can use for-each loop and access the members of the class for each of the object stored within an ArrayList.
 - But to do this first we need to downcast the objects to there respective class-type, then only we can access the members of the class.
*/

package collections.listclasses;

import java.util.ArrayList;

public class ArrayListEx03 {

	public static void main(String[] args) {
		
		System.out.println("Start @Cyber Success");
		
		Employee emp1 = new Employee(101, "Ritesh");
		Employee emp2 = new Employee(102, "Harshal");
		Employee emp3 = new Employee(103, "Sumit");
		
		ArrayList al = new ArrayList();
		
		al.add(emp1);// emp1 is upcasted to Object type here
		al.add(emp2);// emp2 is upcasted to Object type here
		al.add(emp3);// emp3 is upcasted to Object type here
		
		System.out.println(al);
		
		for(Object obj : al) {
			
			//downcast
			Employee e = (Employee) obj;
			System.out.println(e.empId + " - " + e.empName);
		}
		
		System.out.println("Stop @Cyber Success");

	}

}
