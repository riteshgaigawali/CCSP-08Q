/*
    - As the TreeMap implements SortedSet(I) the data is stored in the sorted format.
 	- The sorting of the TreeMap happens based on keys and not values.  	
   	- Whenever comparison happens internally the compareTo() method of respective class is invoked.
*/
package collections.mapclasses;

import java.util.TreeMap;

public class TreeMapEx02 {

	public static void main(String[] args) {
		System.out.println("Start @Cyber Success");
		
		TreeMap tm1 = new TreeMap();
		tm1.put(41, "C");
		tm1.put(75, "B");
		tm1.put(12, "A");
		System.out.println(tm1);
		
		TreeMap tm2 = new TreeMap(tm1);
		tm2.put(102, true);
		tm2.put(10, "Cyber");
		tm2.put(50,"Success");
		System.out.println(tm2);
		
		
		TreeMap tm3 = new TreeMap();
		tm3.putAll(tm2);
		tm3.put(60, "Ritesh");
		tm3.put(26, false);
		System.out.println(tm3);
		
		
		System.out.println("Stop @Cyber Success");

	}

}
