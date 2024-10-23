// Enumeration, Iterator, and ListIterator all three Cursors are applicable.
package collections.listclasses;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;
import java.util.ListIterator;

public class VectorEx05 {

	public static void main(String[] args) {
System.out.println("Start @Cyber Success");
		
		Vector<Employee> v = new Vector<>();
		v.add(new Employee(101,"Ritesh"));
		v.add(new Employee(102,"Harshal"));
		v.add(new Employee(103,"Aakash"));
		v.add(new Employee(104,"Sumit"));
		System.out.println(v);
		
		// Using Enumeration to extract data from Vector
		Enumeration<Employee> en = v.elements();
		
		while(en.hasMoreElements()) {
			Employee e = en.nextElement();
			System.out.println(e.empId+" - "+e.empName);
		}
		
		System.out.println("------------------------------------------------------");
		
		// Using Iterator to extract data from Vector
		Iterator<Employee> i = v.iterator();
		
		while(i.hasNext()) {
			Employee e = i.next();
			System.out.println(e.empId+" - "+e.empName);
		}
		
		System.out.println("------------------------------------------------------");
		
		// Using ListIterator to extract data form Vector
		ListIterator<Employee> li = v.listIterator();
		
		while(li.hasNext()) {
			Employee e = li.next();
			System.out.println(e.empId+" - "+e.empName);
		}
		
		System.out.println("Stop @Cyber Success");


	}

}
