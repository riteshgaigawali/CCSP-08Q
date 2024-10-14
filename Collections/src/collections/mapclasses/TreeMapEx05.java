package collections.mapclasses;

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapEx05 {

	public static void main(String[] args) {
		System.out.println("Start @Cyber Success");
		
		TreeMap tm = new TreeMap();
		tm.put(222, "E");
		tm.put(555, "B");
		tm.put(333, "C");
		tm.put(111, "A");
		tm.put(444, "D");
		System.out.println(tm);
		
		SortedMap sm1 = tm.headMap(333);
		TreeMap tm1 = new TreeMap(sm1);
		System.out.println(tm1);
		
		SortedMap sm2 = tm.tailMap(333);
		TreeMap tm2 = new TreeMap(sm2);
		System.out.println(tm2);
		
		System.out.println("Stop @Cyber Success");


	}

}
