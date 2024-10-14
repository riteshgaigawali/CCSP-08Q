/*
 	- Null insertion is possible only once for keys and multiple for the values.
 	- Duplicates are not allowed for keys but allowed for values.	
 	
*/
package collections.mapclasses;

import java.util.LinkedHashMap;

public class LinkedHashMapEx02 {

	public static void main(String[] args) {
		System.out.println("Start @Cyber Success");
		
		LinkedHashMap lhm = new LinkedHashMap();
		lhm.put(100, "Cyber");
		lhm.put(100, "Success");
		System.out.println(lhm);
		
		
		lhm.put(10, 'X');
		lhm.put(20, 'X');
		System.out.println(lhm);
		
		lhm.put(null, 100);
		System.out.println(lhm);
		lhm.put(null, 200);
		System.out.println(lhm);
		
		
		
		System.out.println("Stop @Cyber Success");

	}

}
