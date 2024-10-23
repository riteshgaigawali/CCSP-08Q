/*
 	- Cursors can also be categorized mainly into two types :
 	
 		1) Normal Cursors : Normal cursors will extract data and will return in form of Object type.
 		2) Generic Cursors : Generic cursors will only return in form of specified type.
*/
package collections.listclasses;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx15 {

	public static void main(String[] args) {
		System.out.println("Start @Cyber Success");

		// Generic collection
		ArrayList<String> al = new ArrayList<String>();
		al.add("Cyber");
		al.add("Success");
		al.add("Training");
		al.add("Institute");
		System.out.println(al);

		// Generic Iterator Cursor
		Iterator<String> i = al.iterator();

		while (i.hasNext()) {
			System.out.println(i.next());
		}

		System.out.println("Stop @Cyber Success");

	}

}
