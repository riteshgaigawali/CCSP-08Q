/*
 - To archive type-safety in Collections we have to use Generic.
 - Due to Generic Collections the benefits are :
 		1) We not only store one type of object but also we do not have to use conditions or 'instanceof' operator for every object.
 		2) We can archive type-safety by storing only one type of objects.
*/

package collections.listclasses;

import java.util.ArrayList;

public class ArrayListEx05 {

	public static void main(String[] args) {
		
		System.out.println("Start @Cyber Success");
		
		Employee emp = new Employee(101, "Ritesh");
		Student std = new Student(201, "Harshal");
		Integer i = 100;
		
		//Normal Collection
		ArrayList al1 = new ArrayList();
		al1.add(emp);
		al1.add(std);
		al1.add(i);
		System.out.println(al1);
		
		//Generic Collection
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.add(100);
		al2.add(200);
		al2.add("Cyber"); // CE : The method add(Integer) in the type ArrayList<Integer> is not applicable for the arguments (String)
		System.out.println(al2);
		
		
		
		System.out.println("Stop @Cyber Success");
		
	}

}
