//  - We can use Vector(int initialCapacity, int capacityIncrement) to define the custom capacity for Vector.
package collections.listclasses;

import java.util.Vector;

public class VectorEx04 {

	public static void main(String[] args) {
		System.out.println("Start @Cyber Success");
		
		Vector v = new Vector(7, 4);
		v.add(10); v.add(20);
		System.out.println("Cpacity : "+v.capacity());
		System.out.println("Size : "+v.size());
		v.add(30); v.add(40); v.add(50);
		v.add(60); v.add(70); v.add(80);
		System.out.println("Cpacity : "+v.capacity());
		System.out.println("Size : "+v.size());
		v.add(90); v.add(100); v.add(110);
		v.add(120); v.add(130);
		System.out.println("Cpacity : "+v.capacity());
		System.out.println("Size : "+v.size());
		
		
		
		System.out.println("Stop @Cyber Success");


	}

}
