// To add one collection into another the approaches are same as List classes, but when we add one collection to another in Set classes the duplicate objects are overridden by the current object data. 
package collections.setclasses;

import java.util.HashSet;

public class HashSetEx02 {

	public static void main(String[] args) {
		System.out.println("Start @Cyber Success");
		
		HashSet hs1 = new HashSet();
		hs1.add(100);
		hs1.add(200.5f);
		hs1.add('X');
		hs1.add("Ritesh");
		System.out.println(hs1);
		
		// Approach - 1
		HashSet hs2 = new HashSet(hs1);
		hs2.add(100);
		hs2.add("Cyber");
		hs2.add(null);
		System.out.println(hs2);
		
		// Approach -2
		HashSet hs3 = new HashSet();
		hs3.addAll(hs1);
		hs3.add("Success");
		hs3.add(100);
		System.out.println(hs3);
		
		
		System.out.println("Stop @Cyber Success");

	}

}
