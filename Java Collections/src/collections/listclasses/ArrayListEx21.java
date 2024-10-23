/*
 - Whenever we Collections.sort(java.util.Collection) method by default it will internally invoke the compareTo() method of respective Wrapper class.
 - The compareTo() method is present in the java.util.Comparable interface, all the Wrapper classes implements the Comparable interface and overrides the compareTo() method.
*/
package collections.listclasses;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx21 {

	public static void main(String[] args) {

		System.out.println("Start @Cyber Success");
	
		ArrayList<String> al = new ArrayList<String>();
		al.add("Cyber");
		al.add("Success");
		al.add("Training");
		al.add("Institute");
		al.add("Pune");
		System.out.println(al);
		
		// returns the sorted collection --> internally invokes the compaerTo() method of String class.
		Collections.sort(al);
		System.out.println(al);
		
		
		System.out.println("Stop @Cyber Success");

	}

}
