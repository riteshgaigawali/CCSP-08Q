/*
  - How do we add one Collection into another Collection ?
  >> There are two approaches to do this :
  						
  						1) Constructor-based approach.
  						2) Using addAll(Collection c) method.
*/

package collections.listclasses;

import java.util.ArrayList;

public class ArrayListEx09 {

	public static void main(String[] args) {
System.out.println("Start @Cyber Success");
		
		ArrayList al1 = new ArrayList();
		
		al1.add(100);
		al1.add(200);
		al1.add(true);
		al1.add("Cyber");
		al1.add('X');
		System.out.println(al1);
		
		//Approach - 1
		ArrayList al2 = new ArrayList(al1);// ArrayList(Collection c)
		al2.add(500.5f);
		System.out.println(al2);
		
		//Approach - 2
		ArrayList al3 = new ArrayList();
		al3.addAll(al1);// addAll(Collection c)
		al3.add("Success");
		System.out.println(al3);
		
		
		System.out.println("Stop @Cyber Success");
	}
}
