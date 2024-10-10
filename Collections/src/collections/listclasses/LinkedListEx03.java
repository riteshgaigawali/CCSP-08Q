/*
  - To extract data from the LinkedList we can use the Iterator and ListIterator interface same as the ArrayList.
*/
package collections.listclasses;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListEx03 {

	public static void main(String[] args) {
		
		System.out.println("Start @Cyber Success");
		
		LinkedList<Employee> ll = new LinkedList<>();
		ll.add(new Employee(101,"Ritesh"));
		ll.add(new Employee(102,"Harshal"));
		ll.add(new Employee(103,"Aakash"));
		ll.add(new Employee(104,"Sumit"));
		System.out.println(ll);
		
		// Using Iterator to extract data from LinkedList
		Iterator<Employee> i = ll.iterator();
		
		while(i.hasNext()) {
			Employee e = i.next();
			System.out.println(e.empId+" - "+e.empName);
		}
		
		System.out.println("------------------------------------------------------");
		
		// Using ListIterator to extract data form LinkedList
		ListIterator<Employee> li = ll.listIterator();
		
		while(li.hasNext()) {
			Employee e = li.next();
			System.out.println(e.empId+" - "+e.empName);
		}
		
		System.out.println("Stop @Cyber Success");

	}

}
