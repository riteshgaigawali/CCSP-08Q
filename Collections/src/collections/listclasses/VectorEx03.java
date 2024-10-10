//  - Vector by default will have the capacity of 10, if the capacity is reached then the capacity gets doubled.
package collections.listclasses;

import java.util.Vector;

public class VectorEx03 {
	
	public static void main(String[] args) {
		System.out.println("Start @Cyber Success");
				
				Vector v = new Vector();
				v.add(10); v.add(20);
				System.out.println("Cpacity : "+v.capacity());
				System.out.println("Size : "+v.size());
				v.add(30); v.add(40); v.add(50);
				v.add(60); v.add(70); v.add(80);
				v.add(90); v.add(100); v.add(110);
				System.out.println("Cpacity : "+v.capacity());
				System.out.println("Size : "+v.size());
				
				
				System.out.println("Stop @Cyber Success");


			}

	

}
