/*
 - Whenever we Collections.sort(java.util.Collection) method by default it will internally invoke the compareTo() method of respective Wrapper class.
 - The compareTo() method is present in the java.util.Comparable interface, all the Wrapper classes implements the Comparable interface and overrides the compareTo() method.
*/
package collections.listclasses;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx22 {

	public static void main(String[] args) {
		System.out.println("Start @Cyber Success");
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(39);
		al.add(20);
		al.add(50);
		al.add(94);
		al.add(10);
		System.out.println(al);
		
		//sort the ArrayList --> --> internally invokes the compaerTo() method of Integer class.
		Collections.sort(al);
		
		System.out.println(al);
		
		System.out.println("Stop @Cyber Success");

	}

}
