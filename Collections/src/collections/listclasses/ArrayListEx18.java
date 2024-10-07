/* Write a Java program to perform manipulations on the collection using cursors. */
package collections.listclasses;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListEx18 {

	public static void main(String[] args) {
		
		System.out.println("Start @Cyber Success");
		
		ArrayList<Flipkart> al = new ArrayList<Flipkart>();
		al.add(new Flipkart(101,"Table"));
		al.add(new Flipkart(102,"Chair"));
		al.add(new Flipkart(103,"Cupboard"));
		al.add(new Flipkart(104,"Bag"));
		al.add(new Flipkart(105,"Laptop"));
		System.out.println(al);
		
		ListIterator<Flipkart> li = al.listIterator();
		
		while(li.hasNext()) {
			Flipkart f = li.next();
			System.out.println(f.prodId+" - "+f.prodName);
			
			if(f.prodName.equals("Chair")) {
				li.remove();
			}
			
			if(f.prodName.equals("Cupboard")) {
				li.set(new Flipkart(105,"Charger"));
			}
			
		}
		
		System.out.println("--------------------------------------------------");
		
		for(Flipkart f : al) {
			
			System.out.println(f.prodId+" - "+f.prodName);
		}
		
		System.out.println("Stop @Cyber Success");

	}

}
