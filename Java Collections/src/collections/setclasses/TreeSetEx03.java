package collections.setclasses;

import java.util.TreeSet;

public class TreeSetEx03 {

	public static void main(String[] args) {
		System.out.println("Start @Cyber Success");
		
		TreeSet ts = new TreeSet();
		ts.add(100);
		ts.add(200);
		ts.add("Pune");
		System.out.println(ts);
		
		System.out.println("Stop @Cyber Success");

	}

}
/*
		Exception in thread "main" java.lang.ClassCastException: class java.lang.Integer cannot be cast to class java.lang.String (java.lang.Integer and java.lang.String are in module java.base of loader 'bootstrap')
	at java.base/java.lang.String.compareTo(String.java:140)
	at java.base/java.util.TreeMap.put(TreeMap.java:814)
	at java.base/java.util.TreeMap.put(TreeMap.java:534)
	at java.base/java.util.TreeSet.add(TreeSet.java:255)
	at collections.setclasses.TreeSetEx03.main(TreeSetEx03.java:13)
	
 - Whenever comparison happens compareTo() method is internally invoked.

*/