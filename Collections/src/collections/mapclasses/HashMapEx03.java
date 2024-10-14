/*
  //TODO Understand this topic.
*/
package collections.mapclasses;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx03 {

	public static void main(String[] args) {
		System.out.println("Start @Cyber Success");
		
		HashMap hm = new HashMap();
		hm.put(111, "Cyber");
		hm.put(222, "Success");
		hm.put(333, "Training");
		hm.put(444, "Institute");
		System.out.println(hm);
		
		Set s = hm.entrySet();
		
		Iterator i = s.iterator();
		
		while(i.hasNext()) {
			// Entry is an inner interface where Map is an outer interface.
			Map.Entry me = (Map.Entry)i.next();
			System.out.println(me.getKey()+" - "+me.getValue());
		}
		
		
		System.out.println("Stop @Cyber Success");

	}

}
