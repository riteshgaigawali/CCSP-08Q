/*
 - Collection got more powerful from v1.5 because the concepts like Autoboxing and Generic were introduced.
*/
package collections.listclasses;

import java.util.ArrayList;

public class ArrayListEx06 {

	public static void main(String[] args) {
		
		System.out.println("Start @Cyber Success");
		
		Swiggy boj1 = new Swiggy(101,"Paneer Masala");
		Swiggy boj2 = new Swiggy(102,"Paneer Butter Masala");
		Swiggy boj3 = new Swiggy(103,"Paneer Lasuni");
		
		ArrayList<Swiggy> al = new ArrayList<Swiggy>();
		
		al.add(boj1);
		al.add(boj2);
		al.add(boj3);
		// al.add(new Employee(101, "Ritesh")); CE
		
		for(Swiggy order : al) {
			System.out.println(order.menuId+" - "+order.menuName);
		}
		
		System.out.println("Stop @Cyber Success");
		
	}

}
