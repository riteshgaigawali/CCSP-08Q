// Enumeration, Iterator, and ListIterator all three Cursors are applicable.
package collections.listclasses;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class StackEx04 {

	public static void main(String[] args) {
System.out.println("Start @Cyber Success");
		
		Stack<Employee> s = new Stack<>();
		s.push(new Employee(101,"Ritesh"));
		s.push(new Employee(102,"Harshal"));
		s.push(new Employee(103,"Aakash"));
		s.push(new Employee(104,"Sumit"));
		System.out.println(s);
		
		// Using Enumeration to extract data from Stack
		Enumeration<Employee> en = s.elements();
		
		while(en.hasMoreElements()) {
			Employee e = en.nextElement();
			System.out.println(e.empId+" - "+e.empName);
		}
		
		System.out.println("------------------------------------------------------");
		
		// Using Iterator to extract data from Stack
		Iterator<Employee> i = s.iterator();
		
		while(i.hasNext()) {
			Employee e = i.next();
			System.out.println(e.empId+" - "+e.empName);
		}
		
		System.out.println("------------------------------------------------------");
		
		// Using ListIterator to extract data form Stack
		ListIterator<Employee> li = s.listIterator();
		
		while(li.hasNext()) {
			Employee e = li.next();
			System.out.println(e.empId+" - "+e.empName);
		}
		
		System.out.println("Stop @Cyber Success");

	}

}
