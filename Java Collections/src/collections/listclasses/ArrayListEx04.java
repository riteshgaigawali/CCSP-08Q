/*
  - Collection, if they are used to store heterogeneous data the challenges faced are :
  
   1) Due to different types of data object every-time while extracting we have to use if-else condition along with 'instanceof' operator.
   2) And for every object we have to perform downcasting, due to this it will increase the length of the code. 
   
*/

package collections.listclasses;

import java.util.ArrayList;

public class ArrayListEx04 {

	public static void main(String[] args) {
		System.out.println("Start @Cyber Success");
		
		Employee emp = new Employee(101, "Ritesh");
		Student std = new Student(201, "Harshal");
		Integer i = 100;
		
		
		ArrayList al = new ArrayList();
		
		al.add(emp);// upcasted to Object type
		al.add(std);// upcasted to Object type
		al.add(i);// upcasted to Object type
		
		System.out.println(al);
		
		for(Object obj : al) {
			if(obj instanceof Employee) {
				//downcast
				Employee e = (Employee)obj;
				System.out.println(e.empId+" - "+e.empName);
			}else if(obj instanceof Student) {
				//downcast
				Student s = (Student)obj;
				System.out.println(s.studId+" - "+s.studName);
				
			}else if(obj instanceof Integer) {
				//downcast
				Integer ii = (Integer) obj;
				System.out.println(i);
			}
			
		}
		
		System.out.println("Stop @Cyber Success");
	}
	
}
