/*

	* Public Access Modifier :
	
- If a memeber is made public, we can access that member not only within the same class but also in another classes and within the same package as well as in another packages.
- As the class is made public in following program, we can access it not only in same package as well as in another package.

*/
package packtwo;

import packone.Sample;

class AccessModifiereEx02{
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		Sample s = new Sample();
		s.m1();
		
		System.out.println("Stop @Cyber Success");
	}
}