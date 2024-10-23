// We can store the SortedSet returned by the headSet() or tailSet() method inside the TreeSet collection.
package collections.setclasses;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetEx07 {

	public static void main(String[] args) {
		System.out.println("Start @Cyber Success");
		
		TreeSet ts = new TreeSet();
		ts.add(10);
		ts.add(20);
		ts.add(30);
		ts.add(40);
		ts.add(50);
		System.out.println(ts);
		
		SortedSet ss1 = ts.headSet(30);
		TreeSet ts1 = new TreeSet(ss1);
		System.out.println(ts1);
		
		SortedSet ss2 = ts.tailSet(30);
		TreeSet ts2 = new TreeSet(ss2);
		System.out.println(ts2);
		
		
		System.out.println("Start @Cyber Success");


	}

}
