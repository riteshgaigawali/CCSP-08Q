/*
  - remove() method removes the elements form an ArrayList.
*/

package collections.listclasses;

import java.util.ArrayList;

public class ArrayListEx07 {

	public static void main(String[] args) {
		
		System.out.println("Start @Cyber Success");
		
		ArrayList al = new ArrayList();
		
		al.add(100);
		al.add(200);
		al.add(true);
		al.add("Cyber");
		al.add('X');
		System.out.println(al);
		
		al.remove(0); //remove(index)
		System.out.println(al);
		
		//al.remove(200); java.lang.IndexOutOfBoundsException
		
		Integer i = 200;
		al.remove(i); //remove(Object)
		System.out.println(al);
		
		System.out.println("Stop @Cyber Success");

	}

}
