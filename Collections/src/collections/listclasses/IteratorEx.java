/*
     #2. Iterator Cursor(C) v1.2 :
     
     	- Iterator cursor is applicable to majority of the collections hence it can be called as an Universal Cursor.
     	- This iterator can not only perform read operation but can also perform remove operation.
     	- This iterator can perform read and remove operation in forward direction only.
*/


package collections.listclasses;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx {

	public static void main(String[] args) {
		System.out.println("Start @Cyber Success");

		// Normal collection
		ArrayList al = new ArrayList();
		al.add("Cyber");
		al.add("Success");
		al.add("Training");
		al.add("Institute");
		System.out.println(al);

		// Normal Iterator Cursor
		Iterator i = al.iterator();

		while (i.hasNext()) {
			System.out.println(i.next());
		}

		System.out.println("Stop @Cyber Success");

	}

}
