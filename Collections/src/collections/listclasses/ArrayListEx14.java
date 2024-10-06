/*
 - When we already have the for-each loops and get method then, What is the need for Cursors ?
 >> - The for-each loops and get are only meant to extract data from the collection, but they cannot perform any manipulations on collection.
    - Whereas Cursors not only can extract data but they can also perform manipulations like add, set, and remove.
    - Hence in real-time we prefer to use Cursors.
    
   What are the different types of Cursors ?
   >> There are mainly three types of Cursors :
      		
      		1) Enumeration Cursor(I) v1.0
      		2) Iterator Cursor(I) v1.2
      		3) ListIterator Cursor(I) v1.2
*/
package collections.listclasses;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx14 {

	public static void main(String[] args) {
System.out.println("Start @Cyber Success");
		
		//Normal collection
		ArrayList al = new ArrayList();
		al.add("Cyber");
		al.add("Success");
		al.add("Training");
		al.add("Institute");
		System.out.println(al);
		
		// Normal Iterator Cursor
		Iterator i = al.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	
		System.out.println("Stop @Cyber Success");

	}

}
