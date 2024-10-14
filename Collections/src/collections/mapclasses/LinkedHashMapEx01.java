/*
 		#2. LinkedHashMap(C) v1.4 :-
 			
 				- LinkedHashMap were introduced in v1.4.
 				- LinkedHashMap allows both homogeneous and heterogeneous data.
 				- Null insertion is possible only once for keys and multiple for the values.
 				- Insertion order is maintained.
 				- Duplicates are not allowed for keys but allowed for values.
 				- Methods are unsynchronized.
 				- Data structure is based on Hash tables and LinkedList.
 				- Cursors are not supported.
 				
 - public java.util.LinkedHashMap(int capacity, float loadFactor, boolean accessOrder) :-
 
 	[ false --> The data displayed will be based on insertion order.
 	  true --> The data displayed will be based on access order. ]
 	  
 - The entries of a LinkedHashMap can be iterated either in the order the keys were first added to the map.[This is default behavior.]
 - OR according to the access order ( access order means based on whichever entry has been accessed recently that will be the last entry which will get extracted/iterated).
 
 - By passing false as a parameter to the constructor we are informing the collection to iterate based on insertion order but if we make parameter true then we are informing the collection to iterate based on access order.
 

*/
package collections.mapclasses;

import java.util.LinkedHashMap;

public class LinkedHashMapEx01 {

	public static void main(String[] args) {
		System.out.println("Start @Cyber Success");
		
		LinkedHashMap lhm = new LinkedHashMap(10, 1.0f, true);
		lhm.put(111, 'X');
		lhm.put(22, "Cyber");
		lhm.put("Ritesh", 01);
		System.out.println(lhm);
		
		lhm.put(null, 40);
		lhm.put(null, 'X');
		lhm.put(22,"Success");
		System.out.println(lhm);
		
		lhm.put(58, null);
		lhm.put(57, null);
		lhm.put(56, null);
		System.out.println(lhm);
		
		System.out.println("Stop @Cyber Success");

	}

}
