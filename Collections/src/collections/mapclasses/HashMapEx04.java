package collections.mapclasses;

import java.util.HashMap;

public class HashMapEx04 {

	public static void main(String[] args) {
		System.out.println("Start @Cyber Success");
		
		HashMap hm1 = new HashMap();
		hm1.put(11, 'X');
		hm1.put(22, 'Y');
		hm1.put("Cyber", true);
		System.out.println(hm1);
		
		HashMap hm2 = new HashMap(hm1);
		hm2.put(99, "Cyber");
		hm2.put(44, 80);
		System.out.println(hm2);
		
		HashMap hm3 = new HashMap();
		hm3.putAll(hm2);
		hm3.put(77, true);
		hm3.put(44, false);
		System.out.println(hm3);
		
		System.out.println("Stop @Cyber Success");
	}

}
