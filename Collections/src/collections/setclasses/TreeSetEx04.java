package collections.setclasses;

import java.util.TreeSet;

public class TreeSetEx04 {

	public static void main(String[] args) {
		System.out.println("Start @Cyber Success");
		
		TreeSet ts = new TreeSet();
		ts.add(null);
		System.out.println(ts);
		
		System.out.println("Stop @Cyber Success");

	}

}
/* 
  

  Exception in thread "main" java.lang.NullPointerException: Cannot invoke "java.lang.Comparable.compareTo(Object)" because "k1" is null
 
	at java.base/java.util.TreeMap.compare(TreeMap.java:1569)
	at java.base/java.util.TreeMap.addEntryToEmptyMap(TreeMap.java:776)
	at java.base/java.util.TreeMap.put(TreeMap.java:785)
	at java.base/java.util.TreeMap.put(TreeMap.java:534)
	at java.base/java.util.TreeSet.add(TreeSet.java:255)
	at collections.setclassese.TreeSetEx04.main(TreeSetEx04.java:11)
*/