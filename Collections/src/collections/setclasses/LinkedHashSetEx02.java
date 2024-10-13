// To add one collection into another the approaches are same as List classes, but when we add one collection to another in Set classes the duplicate objects are overridden by the current object data. 
package collections.setclasses;

import java.util.LinkedHashSet;

public class LinkedHashSetEx02 {

	public static void main(String[] args) {
		
		System.out.println("Start @Cyber Success");
		
		LinkedHashSet lhs1 = new LinkedHashSet();
		lhs1.add(100);
		lhs1.add(200);
		lhs1.add(300);
		System.out.println(lhs1);
		
		// Approach - 1
		LinkedHashSet lhs2 = new LinkedHashSet(lhs1);
		lhs2.add(200);
		lhs2.add("Cyber");
		System.out.println(lhs2);
		
		// Approach - 2
		LinkedHashSet lhs3 = new LinkedHashSet();
		lhs3.addAll(lhs2);
		lhs3.add('X');
		lhs3.add(null);
		System.out.println(lhs3);
		
		System.out.println("Stop @Cyber Success");

	}

}
