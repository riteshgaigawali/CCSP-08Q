/* To add one collection to another collection with Vector, we have two approaches same as ArrayList.   */
package collections.listclasses;

import java.util.Vector;

public class VectorEx02 {

	public static void main(String[] args) {
System.out.println("Start @Cyber Success");
		
		Vector v1 = new Vector();
		v1.add(100);
		v1.add(200.5f);
		v1.add("Cyber");
		v1.add('X');
		v1.add(true);
		System.out.println(v1);
		
		// Approach - 1
		Vector v2 = new Vector(v1);
		v2.add(null);
		v2.add("Cyber");
		v2.add(500);
		v2.add("Success");
		System.out.println(v2);
		
		// Approach - 2
		Vector v3 = new Vector();
		v3.addAll(v1);
		v3.add("Training");
		v3.add("Institute");
		System.out.println(v3);
		
		
		
		System.out.println("Stop @Cyber Success");


	}

}
