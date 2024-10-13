/*
   #2. LinkedHashSet(C) v1.4 :
  	
  	- LinkedHashSet were introduced in v1.4.
   	- It store both homogeneous and heterogeneous type of data.
   	- It does not allows duplicate objects.
   	- Null insertion is possible in LinkedHashSet.
   	- Insertion order is  maintained in LinkedHashSet.
   	- Methods of LinkedHashSet are synchronized.
   	- Data structure is dynamic in nature and based on Linked List and Hash Table.
   	- Only Iterator Cursors are applicable.
*/

package collections.setclasses;

import java.util.LinkedHashSet;

public class LinkedHashSetEx01 {

	public static void main(String[] args) {
		
		System.out.println("Start @Cyber Success");
		
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add(100);
		lhs.add(200.5f);
		lhs.add("Cyber");
		lhs.add('X');
		System.out.println(lhs);
		lhs.add(null);
		lhs.add('X');
		System.out.println(lhs);
		
		System.out.println("Stop @Cyber Success");
	}

}
