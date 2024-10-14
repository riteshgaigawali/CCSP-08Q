/*
 	3. Map Collection :
 		
 						     Map(I) v1.2
 						       | [implements]
 		-----------------------------------------------
        |                      	                      |
  HashMap(C) v1.2     					       SortedMap(I) v1.2
        |                                             |
 LinkedHashMap(C) v1.4                         NavigableMap(I) v1.6
 													  |					
												TreeMap(C) v1.2		
												
 - In Map collection at any point of time we store two objects at a time.
 - This two objects are in the form of key-value pairs, these key-value are both considered as a type of object.
 - Key-value together is called as Entry.
 
 - Characteristics of key-value :-
 
 	Keys :- 1) Duplicate keys are not allowed.
 	 		2) Only one null insertion is allowed in keys.
 	 		
 	Values :- 1) Duplicate values are allowed.
 			  2) Multiple null insertions are allowed for values.
 
 
 			#1. HashMap(C) v1.2 :-
 			
 				- HashMap were introduced in v1.2.
 				- HashMap allows both homogeneous and heterogeneous data.
 				- Null insertion is possible only once for keys and multiple for the values.
 				- Insertion order is not maintained.
 				- Duplicates are not allowed for keys but allowed for values.
 				- Methods are unsynchronized.
 				- Data structure is based on Hash tables.
 				- Cursors are not supported.

*/

package collections.mapclasses;

import java.util.HashMap;

public class HashMapEx01 {

	public static void main(String[] args) {
		System.out.println("Start @Cyber Success");
		
		HashMap hm = new HashMap();
		hm.put(11, "A");
		hm.put(12, "B");
		hm.put(13, "C");
		System.out.println(hm);
		
		hm.put(null, "A");
		System.out.println(hm);
		
		// Null insertion is possible only once for keys, it does not give error but overrides the previous value.		
		hm.put(null, "D");
		System.out.println(hm);
		
		// Multiple null insertion is possible for values.
		hm.put(14, null);
		hm.put(15, null);
		hm.put(16, null);
		System.out.println(hm);
		
		
		System.out.println("Stop @Cyber Success");

	}

}
