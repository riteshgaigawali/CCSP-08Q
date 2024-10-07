/*
 	- The ListIterator by default points to the top of the List, it can only go in reverse direction only if it reaches at the bottom of the collection.
*/
package collections.listclasses;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListEx16 {

	public static void main(String[] args) {
		System.out.println("Start @Cyber Success");

		// Generic collection
		ArrayList<String> al = new ArrayList<String>();
		al.add("Cyber");
		al.add("Success");
		al.add("Training");
		al.add("Institute");
		System.out.println(al);

		// Generic ListIterator Cursor
		ListIterator<String> li = al.listIterator();

		//extract data in forward direction
		while (li.hasNext()) {
			System.out.println(li.next());
		}
		
		System.out.println("-----------------------------------------------");
		
		//extract data in backward direction
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}

		System.out.println("Stop @Cyber Success");

	}

}
