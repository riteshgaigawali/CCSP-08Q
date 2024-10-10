/*
   #2. LinkedList :
   
   	- LinkedList were introduced in v1.2.
   	- It store both homogeneous and heterogeneous type of data.
   	- It allows duplicate objects.
   	- Null insertion is possible in LinkedList.
   	- Insertion order is maintained in LinkedList.
   	- Methods of LinkedList are unsynchronized.
   	- Data structure is based on doubly LinkedList and are dynamic in nature.
   	- Iterator and ListIterator Cursors are applicable.
   	
   	When do we go for LinkedList and when do we go for ArrayList ?
   	>> Whenever there is need to add data within a collection; in case of ArrayList adding huge amount of data will degrade the performance and result in n numbers of shift operations whereas in LinkedList to add huge amount of data it'll have to break only few links.
   	Hence the performance wise LinkedList are better when it comes to adding huge amount of data.
   	When should we go for Array ? : Whenever there is need to extract the data we will prefer to go for ArrayList. 
   	ArrayList implements RandomAccess interface which gets the extra power to the collection for extracting data. Hence to extract data efficiently we will prefer to go for ArrayList.
   	
   	What are the drawbacks of using LinkedList over Array ?
   	>> To store data in the LinkedList not only it'll consume more memory because of the object as well as address of the node, but also has an impact on the speed of extraction as it has to read the memory of the next node address, hence we go for Array, as it does not require any extra memory to store next node address. 
   	
   	
*/

package collections.listclasses;

import java.util.LinkedList;

public class LinkedListEx01 {

	public static void main(String[] args) {
		
		System.out.println("Start @Cyber Success");
		
		LinkedList ll = new LinkedList();
		ll.add(100);
		ll.add(200.5f);
		ll.add("Cyber");
		ll.add('X');
		ll.add(true);
		System.out.println(ll);
		ll.add(null);
		ll.add("Cyber");
		System.out.println(ll);
		
		
		System.out.println("Stop @Cyber Success");

	}

}
