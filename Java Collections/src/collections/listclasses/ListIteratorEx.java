/*
  	#3. ListIterator Cursor(C) v1.2 :
  	
  		- ListIterator cursor is only applicable to List classes, therefore we cannot say it as an Universal Cursor.
  		- The ListIterator can perform add, set, and remove operations in both forward as well as backward direction.
*/
package collections.listclasses;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorEx {

	public static void main(String[] args) {
		System.out.println("Start @Cyber Success");

		// Normal collection
		ArrayList al = new ArrayList();
		al.add("Cyber");
		al.add("Success");
		al.add("Training");
		al.add("Institute");
		System.out.println(al);

		// Normal ListIterator Cursor
		ListIterator li = al.listIterator();

		while (li.hasNext()) {
			System.out.println(li.next());
		}

		System.out.println("Stop @Cyber Success");



	}

}
