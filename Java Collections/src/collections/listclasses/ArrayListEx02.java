/*
  
 - Whenever we print the ArrayList, internally it'll invoke the toString() method not only for the ArrayList collection but also it'll call toString() methods of the other Wrapper classes. 

*/

package collections.listclasses;

import java.util.ArrayList;

public class ArrayListEx02 {

	public static void main(String args[]) {
		System.out.println("Start @Cyber Success");
		
		ArrayList al = new ArrayList();
		
		al.add(100); // Integer --> toString()
		al.add(200.5f);// Float --> toString()	
		al.add("Cyber"); // String --> toString()
		al.add('X'); // Character --> toString()
		al.add(true); // Boolean --> toString()
		System.out.println(al);
		
		Integer i = 100; // Boxing
		System.out.println(i.toString()); //Integer --> toString()
		
		
		System.out.println("Stop @Cyber Success");
	}
}
