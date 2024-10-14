/*
  
  #3. TreeMap(C) v1.2 :
  	
  	- TreeMap were introduced in v1.2.
   	- It store homogeneous as well as heterogeneous type of data.
   	- Duplicates are not allowed for keys but allowed for values.
   	- Null insertion is not possible in TreeMap.
   	- Insertion order is not maintained in TreeMap, the data is in sorted manner.
   	- Methods of TreeMap are unsynchronized.
   	- Data structure is dynamic in nature and based on Tree data structure.
   	- Only Iterator Cursors are applicable.
*/
package collections.mapclasses;

import java.util.TreeMap;

public class TreeMapEx01 {

	public static void main(String[] args) {
		System.out.println("Start @Cyber Success");
		
		TreeMap tm = new TreeMap();
		tm.put(52, "Ritesh");
		tm.put(85, 'X');
		tm.put(12, true);
		tm.put(41, 200.55f);
		tm.put(11, 100);
		System.out.println(tm);
		
		tm.put(12, false);
		// tm.put(null, 42); java.lang.NullPointerException
		tm.put(58, "Ritesh");
		System.out.println(tm);
		
		
		System.out.println("Stop @Cyber Success");

	}

}
