/*
  - How do we get the set of keys and values from the collection ?
  >> 1) To get set of keys we can use Set java.util.HashMap.keySet() which return the keys in form of Set(I).
  	 2) To get values we can use Collection java.util.HashMap.values() which return the values in form of Collection(I).
*/

package collections.mapclasses;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapEx02 {

	public static void main(String[] args) {
		System.out.println("Start @Cyber Success");
		
		HashMap hm = new HashMap();
		hm.put(11,"A");
		hm.put(12,"B");
		hm.put(13,"C");
		System.out.println(hm);
		
		Set keys = hm.keySet();
		System.out.println(keys);
		
		Collection values = hm.values();
		System.out.println(values);
		
		
		System.out.println("Stop @Cyber Success");

	}

}
