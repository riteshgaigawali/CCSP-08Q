/*
 	#3. Vector(C) v1.0 :
   
   	- Vector were introduced in v1.0.
   	- It store both homogeneous and heterogeneous type of data.
   	- It allows duplicate objects.
   	- Null insertion is possible in Vector.
   	- Insertion order is maintained in Vector.
   	- Methods of Vector are synchronized.
   	- Data structure is dynamic in nature.
   	- Enumeration, Iterator, and ListIterator Cursors are applicable.
   	
*/
package collections.listclasses;


import java.util.Vector;

public class VectorEx01 {

	public static void main(String[] args) {
		
		System.out.println("Start @Cyber Success");
		
		Vector v = new Vector();
		v.add(100);
		v.add(200.5f);
		v.add("Cyber");
		v.add('X');
		v.add(true);
		System.out.println(v);
		v.add(null);
		v.add("Cyber");
		System.out.println(v);
		
		
		System.out.println("Stop @Cyber Success");


	}

}
