/*
   		1) SortedSet java.util.TreeSet.headSet(Object toElement) :-
   		
   			- In the headSet() method whichever object we pass based on the object it will return all the object or elements before the object within the TreeSet.
   			- When it returns the objects it will be of SortedSet(I) type, and should be stored in the SortedSet typed reference variable.
   			
   		2) SortedSet java.util.TreeSet.tailSet(Object fromElement) :-
   		
   			- The tailSet() method also accepts an object and from that object onwards till the end of the TreeSet collection it'll return the object in SortedSet format.
   	
*/
package collections.setclasses;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetEx06 {

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
		System.out.println(ss1);
		
		SortedSet ss2 = ts.tailSet(30);
		System.out.println(ss2);
		
		
		System.out.println("Start @Cyber Success");

	}

}
