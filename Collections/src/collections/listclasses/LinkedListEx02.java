/* To add one collection to another collection with LinkeList, we have two approaches same as ArrayList.   */
package collections.listclasses;

import java.util.LinkedList;

public class LinkedListEx02 {

	public static void main(String[] args) {
System.out.println("Start @Cyber Success");
		
		LinkedList ll1 = new LinkedList();
		ll1.add(100);
		ll1.add(200.5f);
		ll1.add("Cyber");
		ll1.add('X');
		ll1.add(true);
		System.out.println(ll1);
		
		// Approach - 1
		LinkedList ll2 = new LinkedList(ll1);
		ll2.add(null);
		ll2.add("Cyber");
		ll2.add(500);
		ll2.add("Success");
		System.out.println(ll2);
		
		// Approach - 2
		LinkedList ll3 = new LinkedList();
		ll3.addAll(ll1);
		ll3.add("Training");
		ll3.add("Institute");
		System.out.println(ll3);
		
		
		
		System.out.println("Stop @Cyber Success");


	}

}
