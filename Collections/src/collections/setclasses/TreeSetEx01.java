/*
  
  #3. TreeSet(C) v1.2 :
  	
  	- TreeSet were introduced in v1.2.
   	- It store only homogeneous type of data.
   	- It does not allows duplicate objects.
   	- Null insertion is not possible in TreeSet.
   	- Insertion order is not maintained in TreeSet.
   	- Methods of TreeSet are unsynchronized.
   	- Data structure is dynamic in nature and based on Tree data structure.
   	- Only Iterator Cursors are applicable.
*/

package collections.setclasses;

import java.util.TreeSet;

public class TreeSetEx01 {

	public static void main(String[] args) {
		
		System.out.println("Start @Cyber Success");
		
		TreeSet ts = new TreeSet();
		ts.add(100);
		ts.add(200);
		ts.add(300);
		System.out.println(ts);
		
		//ts.add(200.5); java.lang.ClassCastException 
		//ts.add("Cyber"); java.lang.ClassCastException 
		
		
		//ts.add(null); java.lang.NullPointerException
		ts.add(100);// This does not give error but overrides the existing object.
		System.out.println(ts);
		
		
		System.out.println("Stop @Cyber Success");

	}

}
