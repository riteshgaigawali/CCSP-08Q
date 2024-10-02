/*
- Write a Java program to display all the Employee records present in the company.

- When exactly do we get the NullPointerException ?
>> If a reference variable stores null value then it cannot access any members of the class, then JVM throws NullPointerException.
*/
class ArraysEx13{
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		Employee[] arr = new Employee[5];
		
		arr[0] = new Employee(101, "Ritesh");
		arr[2] = new Employee(102, "Harshal");
		arr[4] = new Employee(103, "Sumit");
		
		
		for(Employee e : arr){
			System.out.println(e.empId + " - " + e.empName);// Exception in thread "main" java.lang.NullPointerException
		}
		
		
		System.out.println("Stop @Cyber Success");
	}
}