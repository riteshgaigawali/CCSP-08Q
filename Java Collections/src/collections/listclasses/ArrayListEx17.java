/* Write a Java program to perform manipulations on the collection using cursors. */
package collections.listclasses;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx17 {

	public static void main(String[] args) {
		System.out.println("Start @Cyber Success");

		// Generic collection
		ArrayList<Swiggy> al = new ArrayList<Swiggy>();
		al.add(new Swiggy(111,"Panner Masala"));
		al.add(new Swiggy(222,"Panner Butter Masala"));
		al.add(new Swiggy(333,"Veg Pulav"));
		al.add(new Swiggy(444,"Veg Maratha"));
		System.out.println(al);

		// Generic Iterator Cursor
		Iterator<Swiggy> i = al.iterator();

		while (i.hasNext()) {
			Swiggy s = i.next();
			System.out.println(s.menuId+" - "+s.menuName);
			if(s.menuName.equals("Veg Pulav")) {
				i.remove();
			}
		}
		
		System.out.println("-----------------------------------------------");
		
		for(Swiggy s : al) {
			System.out.println(s.menuId+" - "+s.menuName);
		}

		System.out.println("Stop @Cyber Success");


	}

}
