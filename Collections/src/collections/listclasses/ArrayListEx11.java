/*
  #2. boolean java.util.ArrayList.removeAll(Collection c):
  		
  		The removeAll method will remove one collection from another collection.
  		
  #3. boolean java.util.ArrayList.retainAll(Collection c) :
        
        The retainAll method is responsible to retain one of the collection and it'll delete the other collection.
*/

package collections.listclasses;

import java.util.ArrayList;

public class ArrayListEx11 {

	public static void main(String[] args) {
		System.out.println("Start @Cyber Success");

		ArrayList al1 = new ArrayList();

		al1.add(100);
		al1.add(200);
		al1.add(300);
		System.out.println(al1);

	
		ArrayList al2 = new ArrayList();
		al2.add("A");
		al2.add("B");
		al2.add("C");
		System.out.println(al2);
		
		// Approach - 2
		al2.addAll(al1);
		System.out.println(al2);
		
		System.out.println(al2.containsAll(al1));// true
		
		
		al2.retainAll(al1);
		System.out.println(al2);
		
		al2.removeAll(al1);
		System.out.println(al2);
		

		System.out.println("Stop @Cyber Success");

	}

}
