
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
