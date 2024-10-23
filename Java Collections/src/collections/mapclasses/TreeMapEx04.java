package collections.mapclasses;

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapEx04 {

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
		System.out.println(sm1);
		
		SortedMap sm2 = tm.tailMap(333);
		System.out.println(sm2);
		
		System.out.println("Stop @Cyber Success");

	}

}
